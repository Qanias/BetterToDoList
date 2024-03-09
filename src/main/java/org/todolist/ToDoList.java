package org.todolist;

import org.task.Task;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface ToDoList {
    String name = null;
    LinkedList<Task> toDoList = new LinkedList<Task>();
    UUID toDoListId = UUID.randomUUID();

    String getName();

    LinkedList<Task> getToDoList();

    default Task getFirst() {
        return getToDoList().getFirst();
    }

    default Task getLast() {
        return getToDoList().getLast();
    }

    default Task removeFirst() {
        return getToDoList().removeFirst();
    }

    default Task removeLast() {
        return getToDoList().removeLast();
    }

    default void addFirst(Task task) {
        getToDoList().addFirst(task);
    }

    default void addLast(Task task) {
        getToDoList().addLast(task);
    }

    default boolean contains(Object o) {
        return getToDoList().contains(o);
    }

    default int size() {
        return getToDoList().size();
    }

    default boolean add(Task task) {
        return getToDoList().add(task);
    }

    default boolean remove(Object o) {
        return getToDoList().remove(o);
    }

    default boolean addAll(Collection<? extends Task> c) {
        return getToDoList().addAll(c);
    }

    default boolean addAll(int index, Collection<? extends Task> c) {
        return getToDoList().addAll(index, c);
    }

    default void clear() {
        getToDoList().clear();
    }

    default Task get(int index) {
        return getToDoList().get(index);
    }

    default Task set(int index, Task element) {
        return getToDoList().set(index, element);
    }

    default void add(int index, Task element) {
        getToDoList().add(index, element);
    }

    default Task remove(int index) {
        return getToDoList().remove(index);
    }

    default int indexOf(Object o) {
        return getToDoList().indexOf(o);
    }

    default int lastIndexOf(Object o) {
        return getToDoList().lastIndexOf(o);
    }

    default Task peek() {
        return getToDoList().peek();
    }

    default Task element() {
        return getToDoList().element();
    }

    default Task poll() {
        return getToDoList().poll();
    }

    default Task remove() {
        return getToDoList().remove();
    }

    default boolean offer(Task task) {
        return getToDoList().offer(task);
    }

    default boolean offerFirst(Task task) {
        return getToDoList().offerFirst(task);
    }

    default boolean offerLast(Task task) {
        return getToDoList().offerLast(task);
    }

    default Task peekFirst() {
        return getToDoList().peekFirst();
    }

    default Task peekLast() {
        return getToDoList().peekLast();
    }

    default Task pollFirst() {
        return getToDoList().pollFirst();
    }

    default Task pollLast() {
        return getToDoList().pollLast();
    }

    default void push(Task task) {
        getToDoList().push(task);
    }

    default Task pop() {
        return getToDoList().pop();
    }

    default boolean removeFirstOccurrence(Object o) {
        return getToDoList().removeFirstOccurrence(o);
    }

    default boolean removeLastOccurrence(Object o) {
        return getToDoList().removeLastOccurrence(o);
    }

    default ListIterator<Task> listIterator(int index) {
        return getToDoList().listIterator(index);
    }

    default Iterator<Task> descendingIterator() {
        return getToDoList().descendingIterator();
    }

    default Object[] toArray() {
        return getToDoList().toArray();
    }

    default <T> T[] toArray(T[] a) {
        return getToDoList().toArray(a);
    }

    default Spliterator<Task> spliterator() {
        return getToDoList().spliterator();
    }

    default Iterator<Task> iterator() {
        return getToDoList().iterator();
    }

    default ListIterator<Task> listIterator() {
        return getToDoList().listIterator();
    }

    default List<Task> subList(int fromIndex, int toIndex) {
        return getToDoList().subList(fromIndex, toIndex);
    }

    default boolean isEmpty() {
        return getToDoList().isEmpty();
    }

    default boolean containsAll(Collection<?> c) {
        return getToDoList().containsAll(c);
    }

    default boolean removeAll(Collection<?> c) {
        return getToDoList().removeAll(c);
    }

    default boolean retainAll(Collection<?> c) {
        return getToDoList().retainAll(c);
    }

    default <T> T[] toArray(IntFunction<T[]> generator) {
        return getToDoList().toArray(generator);
    }

    default boolean removeIf(Predicate<? super Task> filter) {
        return getToDoList().removeIf(filter);
    }

    default Stream<Task> stream() {
        return getToDoList().stream();
    }

    default Stream<Task> parallelStream() {
        return getToDoList().parallelStream();
    }

    default void forEach(Consumer<? super Task> action) {
        getToDoList().forEach(action);
    }

    default void replaceAll(UnaryOperator<Task> operator) {
        getToDoList().replaceAll(operator);
    }

    default void sort(Comparator<? super Task> c) {
        getToDoList().sort(c);
    }
}
