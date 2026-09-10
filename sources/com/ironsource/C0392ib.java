package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;

/* JADX INFO: renamed from: com.ironsource.ib, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0392ib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0427kb f28899a;

    /* JADX INFO: renamed from: com.ironsource.ib$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C0392ib f28900a = new C0392ib(null);

        public final a a(String adUnitId) {
            kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
            this.f28900a.a(adUnitId);
            return this;
        }

        public final a b(String placementName) {
            kotlin.jvm.internal.n.f(placementName, "placementName");
            this.f28900a.b(placementName);
            return this;
        }

        public final a a(InterfaceC0463mb listener) {
            kotlin.jvm.internal.n.f(listener, "listener");
            this.f28900a.a(listener);
            return this;
        }

        public final C0392ib a() {
            return this.f28900a;
        }
    }

    public /* synthetic */ C0392ib(kotlin.jvm.internal.g gVar) {
        this();
    }

    public final String c() {
        return this.f28899a.i();
    }

    public final String d() {
        return this.f28899a.j();
    }

    public final InterfaceC0409jb.a e() {
        return this.f28899a.k();
    }

    public final AdapterNativeAdViewBinder f() {
        return this.f28899a.l();
    }

    public final String g() {
        return this.f28899a.m();
    }

    public final void h() {
        this.f28899a.n();
    }

    private C0392ib() {
        this.f28899a = new C0427kb(C0638w7.f30930a.a(), this);
    }

    public final void a() {
        this.f28899a.f();
    }

    public final String b() {
        return this.f28899a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f28899a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        this.f28899a.b(str);
    }

    public final void a(InterfaceC0463mb interfaceC0463mb) {
        this.f28899a.a(interfaceC0463mb);
    }
}
