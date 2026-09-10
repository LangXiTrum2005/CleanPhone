package com.google.common.base;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Objects.java */
/* JADX INFO: loaded from: classes3.dex */
public final class taiyuan extends wireman {
    public static boolean attabal(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int saneness(@CheckForNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
