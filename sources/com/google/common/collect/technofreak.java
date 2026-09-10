package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ObjectArrays.java */
/* JADX INFO: loaded from: classes3.dex */
public final class technofreak {
    public static Object attabal(@CheckForNull Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    public static Object[] beachfront(Collection<?> collection2) {
        return wireman(collection2, new Object[collection2.size()]);
    }

    public static <T> T[] competently(Collection<?> collection2, T[] tArr) {
        int size = collection2.size();
        if (tArr.length < size) {
            tArr = (T[]) marial(tArr, size);
        }
        wireman(collection2, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    public static Object[] dern(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            attabal(objArr[i2], i2);
        }
        return objArr;
    }

    public static <T> T[] impromptu(Object[] objArr, int i, int i2, T[] tArr) {
        com.google.common.base.formularize.molybdenite(i, i + i2, objArr.length);
        if (tArr.length < i2) {
            tArr = (T[]) marial(tArr, i2);
        } else if (tArr.length > i2) {
            tArr[i2] = null;
        }
        System.arraycopy(objArr, i, tArr, 0, i2);
        return tArr;
    }

    public static <T> T[] marial(T[] tArr, int i) {
        return (T[]) setterwort.saneness(tArr, i);
    }

    public static Object[] saneness(Object... objArr) {
        dern(objArr, objArr.length);
        return objArr;
    }

    public static Object[] wireman(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }
}
