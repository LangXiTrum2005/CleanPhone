package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: Iterables.java */
/* JADX INFO: loaded from: classes3.dex */
public final class achondroplasia {
    public static <T> boolean apical(List<T> list, com.google.common.base.impassible<? super T> impassibleVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!impassibleVar.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (IllegalArgumentException unused) {
                        formularize(list, impassibleVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        formularize(list, impassibleVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    public static <T> boolean attabal(Collection<T> collection2, Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? collection2.addAll((Collection) iterable) : Iterators.attabal(collection2, ((Iterable) com.google.common.base.formularize.triweekly(iterable)).iterator());
    }

    public static <T> T beachfront(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) Iterators.formularize(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) competently(list);
    }

    public static <T> T competently(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> boolean cutely(Iterable<T> iterable, com.google.common.base.impassible<? super T> impassibleVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? apical((List) iterable, (com.google.common.base.impassible) com.google.common.base.formularize.triweekly(impassibleVar)) : Iterators.molybdenite(iterable.iterator(), impassibleVar);
    }

    public static <E> Collection<E> dern(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : Lists.taiyuan(iterable.iterator());
    }

    public static <T> void formularize(List<T> list, com.google.common.base.impassible<? super T> impassibleVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (impassibleVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static Object[] impassible(Iterable<?> iterable) {
        return dern(iterable).toArray();
    }

    public static <T> T impromptu(Iterable<T> iterable) {
        return (T) Iterators.triweekly(iterable.iterator());
    }

    public static String kowloon(Iterable<?> iterable) {
        return Iterators.gintrap(iterable.iterator());
    }

    public static <T> T marial(Iterable<? extends T> iterable, T t) {
        return (T) Iterators.impassible(iterable.iterator(), t);
    }

    public static <T> boolean saneness(Iterable<T> iterable, com.google.common.base.impassible<? super T> impassibleVar) {
        return Iterators.saneness(iterable.iterator(), impassibleVar);
    }

    public static boolean taiyuan(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static <T> T[] triweekly(Iterable<? extends T> iterable, T[] tArr) {
        return (T[]) dern(iterable).toArray(tArr);
    }

    public static <T> Iterable<T> wireman(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return sensatory.saneness(iterable, iterable2);
    }
}
