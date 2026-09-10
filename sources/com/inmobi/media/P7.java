package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class P7 implements InterfaceC3279w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T7 f23067a;

    public P7(T7 t7) {
        this.f23067a = t7;
    }

    @Override // com.inmobi.media.InterfaceC3279w
    public final void a() {
        Intrinsics.e(this.f23067a.m, "access$getTAG$p(...)");
        P0 p0 = this.f23067a.f23221w;
        if (p0 != null) {
            p0.c();
        }
    }

    @Override // com.inmobi.media.InterfaceC3279w
    public final void b(Object obj) {
        P0 p0 = this.f23067a.f23221w;
        if (p0 != null) {
            p0.b();
        }
        InterfaceC3333z5 interfaceC3333z5 = this.f23067a.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a();
        }
    }

    @Override // com.inmobi.media.InterfaceC3279w
    public final void a(Object obj) {
        P0 p0;
        if (this.f23067a.f() == null || (p0 = this.f23067a.f23221w) == null) {
            return;
        }
        p0.d();
    }
}
