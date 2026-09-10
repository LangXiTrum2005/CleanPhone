package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3218s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3234t2 f23977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3333z5 f23978b;

    public C3218s2(InterfaceC3234t2 mEventHandler, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(mEventHandler, "mEventHandler");
        this.f23977a = mEventHandler;
        this.f23978b = interfaceC3333z5;
    }

    public final void a(C3107l2 click) {
        HashMap map;
        Intrinsics.f(click, "click");
        try {
            InterfaceC3333z5 interfaceC3333z5 = this.f23978b;
            if (interfaceC3333z5 != null) {
                String strF = C3298x2.f();
                Intrinsics.e(strF, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5).c(strF, "ping - " + click.f23758a);
            }
            N9 n9 = new N9(click.f23759b, this.f23978b);
            HashMap mapA = C3298x2.a(C3298x2.f24089a, click);
            if (!mapA.isEmpty()) {
                n9.f23010i.putAll(mapA);
            }
            n9.x = false;
            n9.t = false;
            n9.f23014u = false;
            Map map2 = click.f23760c;
            if (map2 != null && (map = n9.j) != null) {
                map.putAll(map2);
            }
            n9.r = click.d;
            AdConfig.ImaiConfig imaiConfig = C3298x2.g;
            if (imaiConfig != null) {
                n9.f23013p = imaiConfig.getPingTimeout() * 1000;
                n9.q = imaiConfig.getPingTimeout() * 1000;
            }
            P9 p9B = n9.b();
            if (!p9B.b()) {
                this.f23977a.a(click);
                return;
            }
            I9 i9 = p9B.d;
            EnumC3157o4 enumC3157o4 = i9 != null ? i9.f22886a : EnumC3157o4.f23855e;
            if (EnumC3157o4.k == enumC3157o4) {
                this.f23977a.a(click);
                return;
            }
            if (!click.d && (EnumC3157o4.v == enumC3157o4 || EnumC3157o4.x == enumC3157o4)) {
                this.f23977a.a(click);
                return;
            }
            if (T9.f23231a && (enumC3157o4 == EnumC3157o4.q || enumC3157o4 == EnumC3157o4.f23860p || enumC3157o4 == EnumC3157o4.o || enumC3157o4 == EnumC3157o4.f23859n || enumC3157o4 == EnumC3157o4.r)) {
                return;
            }
            this.f23977a.a(click, enumC3157o4);
        } catch (Exception unused) {
            Intrinsics.e(C3298x2.f(), "access$getTAG$p(...)");
            InterfaceC3234t2 interfaceC3234t2 = this.f23977a;
            EnumC3157o4 errorCode = EnumC3157o4.f23855e;
            Intrinsics.f(errorCode, "errorCode");
            interfaceC3234t2.a(click, errorCode);
        }
    }
}
