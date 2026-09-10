package com.chartboost.sdk.impl;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f15458c = new LinkedHashMap();
    public final Map d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f15459e = new LinkedHashSet();

    public w6(int i2, int i3) {
        this.f15456a = i2;
        this.f15457b = i3;
    }

    public final long a(ch chVar) {
        Long l2 = (Long) this.f15458c.get(chVar.f());
        return l2 != null ? l2.longValue() : chVar.i();
    }

    public final long b(ch chVar) {
        return (chVar.i() - a(chVar)) / ((long) 1000);
    }

    public final int c(ch chVar) {
        Integer num = (Integer) this.d.get(chVar.f());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void d(ch chVar) {
        if (this.f15458c.containsKey(chVar.f())) {
            return;
        }
        this.f15458c.put(chVar.f(), Long.valueOf(chVar.i()));
    }

    public final synchronized ch e(ch chVar) {
        if (chVar == null) {
            return null;
        }
        try {
            d(chVar);
            if (b(chVar) > this.f15457b) {
                g(chVar);
            }
            if (this.f15459e.contains(chVar.f())) {
                return null;
            }
            if (i(chVar) <= this.f15456a) {
                return chVar;
            }
            return f(chVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final ch f(ch chVar) {
        da daVar = new da(fh.f.TOO_MANY_EVENTS, chVar.f().getValue(), null, null, null, null, 60, null);
        this.f15459e.add(chVar.f());
        return daVar;
    }

    public final void g(ch chVar) {
        h(chVar);
        this.d.remove(chVar.f());
    }

    public final void h(ch chVar) {
        this.f15458c.put(chVar.f(), Long.valueOf(chVar.i()));
    }

    public final int i(ch chVar) {
        int iC = c(chVar) + 1;
        this.d.put(chVar.f(), Integer.valueOf(iC));
        return iC;
    }
}
