package com.google.android.gms.common.data;

import com.facebook.internal.logging.dumpsys.AndroidRootResolver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        AndroidRootResolver.ListenableArrayList listenableArrayList = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            listenableArrayList.add(arrayList.get(i2).freeze());
        }
        return listenableArrayList;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        AndroidRootResolver.ListenableArrayList listenableArrayList = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            listenableArrayList.add(it.next().freeze());
        }
        return listenableArrayList;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        AndroidRootResolver.ListenableArrayList listenableArrayList = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e2 : eArr) {
            listenableArrayList.add(e2.freeze());
        }
        return listenableArrayList;
    }
}
