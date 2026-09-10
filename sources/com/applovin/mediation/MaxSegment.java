package com.applovin.mediation;

import com.applovin.impl.sdk.p;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxSegment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f10338b;

    public MaxSegment(int i10, List<Integer> list) {
        this.f10337a = i10;
        this.f10338b = list;
        a(i10);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            a(it.next().intValue());
        }
    }

    private void a(int i10) {
        if (i10 >= 0) {
            return;
        }
        p.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i10);
    }

    public int getKey() {
        return this.f10337a;
    }

    public List<Integer> getValues() {
        return this.f10338b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.f10337a + ", values=" + this.f10338b + '}';
    }
}
