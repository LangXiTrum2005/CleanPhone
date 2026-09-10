package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3015k2 implements InterfaceC2830cj, InterfaceC2913g {
    public final AbstractC3213s1 a;
    public final InterfaceC3320w8 b;
    public final Ac c;

    public AbstractC3015k2(AbstractC3213s1 abstractC3213s1, InterfaceC3320w8 adManagerComponent, Ac stateMachine) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.a = abstractC3213s1;
        this.b = adManagerComponent;
        this.c = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2913g
    public final void j() {
        this.c.a(new C3192r5(this.b), this);
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void c() {
    }
}
