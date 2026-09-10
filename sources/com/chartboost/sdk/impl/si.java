package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class si {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15145c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f15146e;
    public long f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a3 f15147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile long f15148i;
    public volatile int j;

    public si(long j, int i2, int i3, long j2, long j3, long j4, int i4, a3 a3Var) {
        this.f15143a = j;
        this.f15144b = i2;
        this.f15145c = i3;
        this.d = j2;
        this.f15146e = j3;
        this.f = j4;
        this.g = i4;
        this.f15147h = a3Var;
    }

    public final void a() {
        za.a("addDownloadToTimeWindow() - timeWindowStartTimeStamp " + this.f15148i + ", timeWindowCachedVideosCount " + this.j, (Throwable) null, 2, (Object) null);
        if (this.f15148i == 0) {
            this.f15148i = gg.a();
        }
        this.j++;
    }

    public final long b() {
        return this.f15143a;
    }

    public final int c() {
        a3 a3Var = this.f15147h;
        return (a3Var == null || !a3Var.d()) ? this.f15144b : this.f15145c;
    }

    public final long d() {
        return f() - e();
    }

    public final void e(long j) {
        this.f15146e = j;
    }

    public final long f() {
        a3 a3Var = this.f15147h;
        return ((a3Var == null || !a3Var.d()) ? this.d : this.f15146e) * ((long) 1000);
    }

    public final boolean g() {
        h();
        boolean z2 = this.j >= c();
        if (z2) {
            nf.a("Video loading limit reached, will resume in timeToResetWindow: " + d());
        }
        za.a("isMaxCountForTimeWindowReached() - " + z2, (Throwable) null, 2, (Object) null);
        return z2;
    }

    public final void h() {
        za.a("resetWindowWhenTimeReached()", (Throwable) null, 2, (Object) null);
        if (e() > f()) {
            za.a("resetWindowWhenTimeReached() - timer and count reset", (Throwable) null, 2, (Object) null);
            nf.a("Video loading limit reset");
            this.j = 0;
            this.f15148i = 0L;
        }
    }

    public final long i() {
        return f() - (gg.a() - this.f15148i);
    }

    public final boolean b(long j) {
        return j >= this.f15143a;
    }

    public final void d(long j) {
        this.d = j;
    }

    public final long e() {
        return gg.a() - this.f15148i;
    }

    public final void f(long j) {
        this.f = j;
    }

    public final void b(int i2) {
        this.f15144b = i2;
    }

    public final void c(long j) {
        this.f15143a = j;
    }

    public final void c(int i2) {
        this.f15145c = i2;
    }

    public final boolean a(File file) {
        Intrinsics.f(file, "file");
        return a(file.lastModified());
    }

    public final void a(int i2) {
        this.g = i2;
    }

    public final boolean a(long j) {
        return gg.a() - j > this.f * ((long) 1000);
    }
}
