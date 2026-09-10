package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3513fb {
    private final C3549hb a;

    /* JADX INFO: renamed from: com.ironsource.fb$a */
    public static final class a {
        private C3513fb a = new C3513fb(null);

        public final a a(String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.a.a(adUnitId);
            return this;
        }

        public final a b(String placementName) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            this.a.b(placementName);
            return this;
        }

        public final a a(InterfaceC3584jb listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.a.a(listener);
            return this;
        }

        public final C3513fb a() {
            return this.a;
        }
    }

    public /* synthetic */ C3513fb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String c() {
        return this.a.i();
    }

    public final String d() {
        return this.a.j();
    }

    public final InterfaceC3531gb.a e() {
        return this.a.k();
    }

    public final AdapterNativeAdViewBinder f() {
        return this.a.l();
    }

    public final String g() {
        return this.a.m();
    }

    public final void h() {
        this.a.n();
    }

    private C3513fb() {
        this.a = new C3549hb(C3772u7.a.a(), this);
    }

    public final void a() {
        this.a.f();
    }

    public final String b() {
        return this.a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        this.a.b(str);
    }

    public final void a(InterfaceC3584jb interfaceC3584jb) {
        this.a.a(interfaceC3584jb);
    }
}
