package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3741sa {
    private final C3681p0 a;
    private String b;
    private boolean c;

    public AbstractC3741sa(C3681p0 adTools) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.a = adTools;
        this.b = "";
    }

    public final C3681p0 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public abstract boolean d();

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public final void b(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.a.e(callback);
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.a.d(runnable);
    }

    public final void a(C3538h0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.a.e().a(new D0(this.a, adProperties, null, 4, null));
    }
}
