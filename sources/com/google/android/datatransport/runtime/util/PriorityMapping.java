package com.google.android.datatransport.runtime.util;

import android.support.v4.media.a;
import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class PriorityMapping {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f16983a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f16984b;

    static {
        HashMap map = new HashMap();
        f16984b = map;
        map.put(Priority.X, 0);
        map.put(Priority.f16674Y, 1);
        map.put(Priority.Z, 2);
        for (Priority priority : map.keySet()) {
            f16983a.append(((Integer) f16984b.get(priority)).intValue(), priority);
        }
    }

    public static int a(Priority priority) {
        Integer num = (Integer) f16984b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    public static Priority b(int i2) {
        Priority priority = (Priority) f16983a.get(i2);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(a.h(i2, "Unknown Priority for value "));
    }
}
