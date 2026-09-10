package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xe f15203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15205c;

    public abstract Object a(Context context, Continuation continuation);

    public void a(float f) {
    }

    public abstract void a(fg fgVar);

    public long g() {
        return this.f15205c;
    }

    public boolean h() {
        return this.f15204b;
    }

    public final xe i() {
        return this.f15203a;
    }

    public float j() {
        return 1.0f;
    }

    public abstract View k();

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }

    public void o() {
    }

    public void a(boolean z2) {
    }

    public final void a(xe xeVar) {
        this.f15203a = xeVar;
    }

    public static /* synthetic */ void a(te teVar, float f, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unmute");
        }
        if ((i2 & 1) != 0) {
            f = 1.0f;
        }
        teVar.a(f);
    }
}
