package dev.lpa;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<dev.lpa.Task> tasks = dev.lpa.TaskData.getTasks("all");
        sortAndPrint("All Tasks", tasks);

        Comparator<dev.lpa.Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<dev.lpa.Task> annsTasks = dev.lpa.TaskData.getTasks("Ann");
        sortAndPrint("Ann's Tasks", annsTasks, sortByPriority);

        Set<dev.lpa.Task> bobsTasks = dev.lpa.TaskData.getTasks("Bob");
        Set<dev.lpa.Task> carolsTasks = dev.lpa.TaskData.getTasks("Carol");
        List<Set<dev.lpa.Task>> sets = List.of(annsTasks, bobsTasks, carolsTasks);

        Set<dev.lpa.Task> assignedTasks = getUnion(sets);
        sortAndPrint("Assigned Tasks", assignedTasks);

        Set<dev.lpa.Task> everyTask = getUnion(List.of(tasks, assignedTasks));
        sortAndPrint("The True All Tasks", everyTask);

        Set<dev.lpa.Task> missingTasks = getDifference(everyTask, tasks);
        sortAndPrint("Missing Tasks", missingTasks);

        Set<dev.lpa.Task> unassignedTasks = getDifference(tasks, assignedTasks);
        sortAndPrint("Unassigned Tasks", unassignedTasks, sortByPriority);

        Set<dev.lpa.Task> overlap = getUnion(List.of(
                getIntersect(annsTasks, bobsTasks),
                getIntersect(carolsTasks, bobsTasks),
                getIntersect(annsTasks, carolsTasks)
        ));
        sortAndPrint("Assigned to Multiples", overlap, sortByPriority);

        List<dev.lpa.Task> overlapping = new ArrayList<>();
        for (Set<dev.lpa.Task> set : sets) {
            Set<dev.lpa.Task> dupes = getIntersect(set, overlap);
            overlapping.addAll(dupes);
        }

        Comparator<dev.lpa.Task> priorityNatural = sortByPriority.thenComparing(
                Comparator.naturalOrder());
        sortAndPrint("Overlapping", overlapping, priorityNatural);

    }

    private static void sortAndPrint(String header, Collection<dev.lpa.Task> collection) {
        sortAndPrint(header, collection, null);
    }

    private static void sortAndPrint(String header, Collection<dev.lpa.Task> collection,
                                     Comparator<dev.lpa.Task> sorter) {

        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        List<dev.lpa.Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
    }

    private static Set<dev.lpa.Task> getUnion(List<Set<dev.lpa.Task>> sets) {

        Set<dev.lpa.Task> union = new HashSet<>();
        for (var taskSet : sets) {
            union.addAll(taskSet);
        }
        return union;
    }

    private static Set<dev.lpa.Task> getIntersect(Set<dev.lpa.Task> a, Set<dev.lpa.Task> b) {

        Set<dev.lpa.Task> intersect = new HashSet<>(a);
        intersect.retainAll(b);
        return intersect;
    }

    private static Set<dev.lpa.Task> getDifference(Set<dev.lpa.Task> a, Set<dev.lpa.Task> b) {

        Set<dev.lpa.Task> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }
}
