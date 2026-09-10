package com.startapp.sdk.adsbase.cache;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class FailuresHandler implements Serializable {
    private static final long serialVersionUID = -4588601967418450964L;

    @TypeInfo(type = ArrayList.class, value = Integer.class)
    private List<Integer> intervals = Arrays.asList(10, 30, 60, 300);
    private boolean infiniteLastRetry = true;

    public final List a() {
        return this.intervals;
    }

    public final boolean b() {
        return this.infiniteLastRetry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FailuresHandler failuresHandler = (FailuresHandler) obj;
            if (this.infiniteLastRetry == failuresHandler.infiniteLastRetry && vi.a(this.intervals, failuresHandler.intervals)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.intervals, Boolean.valueOf(this.infiniteLastRetry)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
