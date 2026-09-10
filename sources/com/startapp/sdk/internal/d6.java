package com.startapp.sdk.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class d6 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f40899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f40900b;

    public d6(Comparator comparator, Comparator comparator2) {
        this.f40899a = comparator;
        this.f40900b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.f40899a.compare(obj, obj2);
        return iCompare == 0 ? this.f40900b.compare(obj, obj2) : iCompare;
    }
}
