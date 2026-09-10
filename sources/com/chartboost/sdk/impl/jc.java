package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f14248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kc f14249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kc f14250c;
    public kc d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kc f14251e;

    public jc(Context context) {
        Intrinsics.f(context, "context");
        this.f14248a = context;
        this.f14249b = new kc(context);
        this.f14250c = new kc(this.f14248a);
        this.d = new kc(this.f14248a);
        this.f14251e = new kc(this.f14248a);
    }

    public final kc a() {
        return this.f14251e;
    }

    public final kc b() {
        return this.d;
    }

    public final kc c() {
        return this.f14250c;
    }

    public final kc d() {
        return this.f14249b;
    }

    public final void a(int i2, int i3, int i4, int i5) {
        this.f14251e.a(i2, i3, i4, i5);
    }

    public final void b(int i2, int i3, int i4, int i5) {
        this.d.a(i2, i3, i4, i5);
    }

    public final void a(int i2, int i3) {
        this.f14250c.a(i2, i3);
    }

    public final void b(int i2, int i3) {
        this.f14249b.a(i2, i3);
    }

    public final void a(View view) {
        Intrinsics.f(view, "view");
        DisplayMetrics displayMetrics = this.f14248a.getResources().getDisplayMetrics();
        b(displayMetrics.widthPixels, displayMetrics.heightPixels);
        View rootView = view.getRootView();
        if (rootView == null) {
            rootView = view;
        }
        a(rootView.getWidth(), rootView.getHeight());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        a(iArr[0], iArr[1], view.getWidth(), view.getHeight());
        b(iArr[0], iArr[1], view.getWidth(), view.getHeight());
    }
}
