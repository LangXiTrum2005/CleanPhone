package com.startapp.sdk.common.utils;

import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class Pair<F, S> implements Serializable {
    private static final long serialVersionUID = 1680587643219848112L;
    public final F first;
    public final S second;

    /* JADX WARN: Multi-variable type inference failed */
    public Pair(Object obj, Object obj2) {
        this.first = obj;
        this.second = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Pair pair = (Pair) obj;
            if (vi.a(this.first, pair.first) && vi.a(this.second, pair.second)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.first, this.second};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
