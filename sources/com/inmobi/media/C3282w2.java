package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3282w2 implements InterfaceC3234t2 {
    @Override // com.inmobi.media.InterfaceC3234t2
    public final void a(C3107l2 click) {
        Intrinsics.f(click, "click");
        Intrinsics.e(C3298x2.f(), "access$getTAG$p(...)");
        C3298x2.b(C3298x2.f24089a, click);
        C3123m2 c3123m2B = Nc.b();
        c3123m2B.getClass();
        c3123m2B.a("id = ?", new String[]{String.valueOf(click.f23758a)});
    }

    @Override // com.inmobi.media.InterfaceC3234t2
    public final void a(C3107l2 click, EnumC3157o4 errorCode) {
        Intrinsics.f(click, "click");
        Intrinsics.f(errorCode, "errorCode");
        Intrinsics.e(C3298x2.f(), "access$getTAG$p(...)");
        if (click.f == 0) {
            C3298x2.f24089a.a(click, errorCode.name());
        }
        C3298x2 c3298x2 = C3298x2.f24089a;
        C3298x2.c(c3298x2, click);
        c3298x2.h();
    }
}
