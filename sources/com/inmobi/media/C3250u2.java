package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3250u2 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3250u2 f24018a = new C3250u2();

    public C3250u2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2978d2 event = (C2978d2) obj;
        Intrinsics.f(event, "event");
        int i2 = event.f23507a;
        if (i2 == 1 || i2 == 2) {
            Intrinsics.e(C3298x2.f(), "access$getTAG$p(...)");
            C3298x2.f24093h.set(false);
        } else if (i2 != 10) {
            if (i2 != 11) {
                Intrinsics.e(C3298x2.f(), "access$getTAG$p(...)");
            } else if (!Boolean.parseBoolean(event.f23508b)) {
                C3298x2.f24089a.h();
            }
        } else if ("available".equals(event.f23508b)) {
            C3298x2.f24089a.h();
        }
        return Unit.f43263a;
    }
}
