package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3201r1 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3201r1 f23945a = new C3201r1();

    public C3201r1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2978d2 event = (C2978d2) obj;
        Intrinsics.f(event, "event");
        int i2 = event.f23507a;
        if (i2 == 1 || i2 == 2) {
            C3233t1.m.set(false);
        } else if (i2 != 10) {
            C3233t1 c3233t1 = C3233t1.f23990a;
        } else if ("available".equals(event.f23508b)) {
            C3233t1 c3233t2 = C3233t1.f23990a;
            if (!C3233t1.j.get()) {
                c3233t2.c();
            }
        } else {
            C3233t1.d();
        }
        return Unit.f43263a;
    }
}
