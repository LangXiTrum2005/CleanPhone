package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3213s1 {
    public final C3100nc a;

    public AbstractC3213s1(C3114o1 adManagerComponent) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        C3139p1 c3139p1 = adManagerComponent.a;
        this.a = AbstractC3075mc.a(c3139p1.b.getTimeouts().X(), c3139p1.a.g, "native", Ki.b);
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public void c() {
    }

    public void f() {
    }
}
