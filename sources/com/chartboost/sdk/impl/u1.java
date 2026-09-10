package com.chartboost.sdk.impl;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class u1 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae f15244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15245c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15246e;
    public final String f;
    public final AtomicInteger g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f15247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f15248i;

    public u1(ae aeVar, String str, String str2, String str3, AtomicInteger atomicInteger, AtomicReference atomicReference, AtomicInteger atomicInteger2, String str4) {
        this.f15244b = aeVar;
        this.f15245c = str;
        this.d = str2;
        this.f15246e = str3;
        this.g = atomicInteger;
        this.f15247h = atomicReference;
        this.f15248i = atomicInteger2;
        this.f = str4;
        atomicInteger.incrementAndGet();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(u1 u1Var) {
        return this.f15244b.b() - u1Var.f15244b.b();
    }

    public void a(Executor executor, boolean z2) {
        q1 q1Var;
        if ((this.g.decrementAndGet() == 0 || !z2) && (q1Var = (q1) this.f15247h.getAndSet(null)) != null) {
            executor.execute(new r1(q1Var, z2, this.f15248i.get()));
        }
    }
}
