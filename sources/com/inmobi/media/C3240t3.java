package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlinx.coroutines.taiyuan;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3240t3 implements InterfaceC3041l3 {
    @Override // com.inmobi.media.InterfaceC3041l3
    public final void a(S2 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        C3315w3 c3315w3 = C3315w3.a;
        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
        String str = click.b;
        LinkedHashMap linkedHashMap = C3315w3.j;
        C2759a0 c2759a0 = (C2759a0) linkedHashMap.get(Integer.valueOf(click.a));
        if (c2759a0 != null) {
            Intrinsics.checkNotNullParameter(click, "click");
            c2759a0.a.a(c2759a0.b);
        }
        linkedHashMap.remove(Integer.valueOf(click.a));
        taiyuan.saneness(null, new C3215s3(click, null), 1, null);
    }

    @Override // com.inmobi.media.InterfaceC3041l3
    public final void a(S2 click, EnumC2765a6 errorCode) {
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        C3315w3 c3315w3 = C3315w3.a;
        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
        String str = click.b;
        if (click.f == 0) {
            C3315w3.a(click, errorCode.name());
        }
        C3315w3.b(click);
        C3315w3.f();
    }
}
