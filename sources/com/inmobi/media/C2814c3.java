package com.inmobi.media;

import android.os.Message;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2814c3 implements InterfaceC3041l3 {
    public final /* synthetic */ HandlerC2917g3 a;

    public C2814c3(HandlerC2917g3 handlerC2917g3) {
        this.a = handlerC2917g3;
    }

    @Override // com.inmobi.media.InterfaceC3041l3
    public final void a(S2 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        HandlerC2917g3 handlerC2917g3 = this.a;
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = click;
        handlerC2917g3.sendMessage(messageObtain);
    }

    @Override // com.inmobi.media.InterfaceC3041l3
    public final void a(S2 click, EnumC2765a6 enumC2765a6) throws InterruptedException {
        EnumC2765a6 errorCode = EnumC2765a6.d;
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        C3315w3 c3315w3 = C3315w3.a;
        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
        String str = click.b;
        C3315w3.b(click);
        this.a.b(click);
    }
}
