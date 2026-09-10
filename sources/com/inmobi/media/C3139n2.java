package com.inmobi.media;

import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3139n2 implements InterfaceC3234t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HandlerC3171p2 f23824a;

    public C3139n2(HandlerC3171p2 handlerC3171p2) {
        this.f23824a = handlerC3171p2;
    }

    @Override // com.inmobi.media.InterfaceC3234t2
    public final void a(C3107l2 click) {
        Intrinsics.f(click, "click");
        HandlerC3171p2 handlerC3171p2 = this.f23824a;
        handlerC3171p2.getClass();
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = click;
        handlerC3171p2.sendMessage(messageObtain);
    }

    @Override // com.inmobi.media.InterfaceC3234t2
    public final void a(C3107l2 click, EnumC3157o4 errorCode) {
        Intrinsics.f(click, "click");
        Intrinsics.f(errorCode, "errorCode");
        InterfaceC3333z5 interfaceC3333z5 = this.f23824a.f23880a;
        if (interfaceC3333z5 != null) {
            String strF = C3298x2.f();
            ((A5) interfaceC3333z5).b(strF, android.support.v4.media.a.r(H6.a(strF, "access$getTAG$p(...)", "Pinging click ("), click.f23759b, ") via HTTP failed ..."));
        }
        C3298x2.c(C3298x2.f24089a, click);
        this.f23824a.b(click);
    }
}
