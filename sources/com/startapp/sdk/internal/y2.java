package com.startapp.sdk.internal;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class y2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41702c;

    public y2(int i2, Object obj) {
        this.f41700a = obj;
        this.f41701b = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41702c < this.f41701b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f41700a;
        int i2 = this.f41702c;
        this.f41702c = i2 + 1;
        return Array.get(obj, i2);
    }
}
