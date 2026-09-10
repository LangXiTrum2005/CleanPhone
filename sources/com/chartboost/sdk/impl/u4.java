package com.chartboost.sdk.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v4 f15252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pg f15253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f15254c;

    public u4(v4 compositeCloseChipView) {
        Intrinsics.f(compositeCloseChipView, "compositeCloseChipView");
        this.f15252a = compositeCloseChipView;
    }

    public final void a() {
        pg pgVar = this.f15253b;
        if (pgVar != null) {
            pgVar.a();
        }
    }

    public final pg b() {
        return this.f15253b;
    }

    public final void c() {
        pg pgVar = this.f15253b;
        if (pgVar != null) {
            pgVar.e();
        }
    }

    public final void d() {
        pg pgVar = this.f15253b;
        if (pgVar != null) {
            pgVar.f();
        }
    }

    public final void e() {
        pg pgVar = this.f15253b;
        if (pgVar != null) {
            pgVar.g();
        }
    }

    public final void a(Function0 listener) {
        Intrinsics.f(listener, "listener");
        this.f15254c = listener;
    }

    public final void a(long j, sg mode, String str, String str2, Function0 function0) {
        Intrinsics.f(mode, "mode");
        this.f15254c = function0;
        pg pgVar = this.f15253b;
        if (pgVar != null) {
            pgVar.a();
        }
        pg pgVar2 = new pg(j, this.f15254c);
        pgVar2.a(this.f15252a.getTimerChipView());
        pgVar2.a(mode, str, str2);
        this.f15253b = pgVar2;
    }
}
