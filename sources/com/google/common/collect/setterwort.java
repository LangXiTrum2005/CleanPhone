package com.google.common.collect;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes3.dex */
public final class setterwort {
    public static <T> T[] attabal(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    public static <E> Set<E> beachfront() {
        return CompactHashSet.create();
    }

    public static <K, V> Map<K, V> competently() {
        return CompactHashMap.create();
    }

    public static <K, V> Map<K, V> dern(int i) {
        return CompactHashMap.createWithExpectedSize(i);
    }

    public static MapMaker impromptu(MapMaker mapMaker) {
        return mapMaker.formularize();
    }

    public static <E> Set<E> marial(int i) {
        return CompactLinkedHashSet.createWithExpectedSize(i);
    }

    public static <T> T[] saneness(T[] tArr, int i) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i);
    }

    public static <K, V> Map<K, V> wireman(int i) {
        return CompactLinkedHashMap.createWithExpectedSize(i);
    }
}
