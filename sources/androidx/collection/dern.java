package androidx.collection;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: ArraySetJvmUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {
    public static <T> T[] attabal(T[] tArr, int i) {
        if (tArr.length < i) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        }
        if (tArr.length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
