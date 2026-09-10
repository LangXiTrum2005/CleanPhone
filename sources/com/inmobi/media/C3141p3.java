package com.inmobi.media;

import org.objectweb.asm.Opcodes;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3141p3 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ InterfaceC3072m9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3141p3(String str, boolean z, InterfaceC3072m9 interfaceC3072m9, dern dernVar) {
        super(1, dernVar);
        this.b = str;
        this.c = z;
        this.d = interfaceC3072m9;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new C3141p3(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3141p3) create((dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                C3315w3 c3315w3 = C3315w3.a;
                if (C3315w3.e()) {
                    int maxRetries = C3315w3.c().getMaxRetries();
                    String str = this.b;
                    S2 s2 = new S2(str, this.c, true, maxRetries + 1, Opcodes.MULTIANEWARRAY);
                    InterfaceC3072m9 interfaceC3072m9 = this.d;
                    if (interfaceC3072m9 != null) {
                        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                        ((C3097n9) interfaceC3072m9).c("w3", "Received click (" + str + ") for pinging in WebView");
                    }
                    InterfaceC3072m9 interfaceC3072m10 = this.d;
                    this.a = 1;
                    if (c3315w3.a(s2, null, interfaceC3072m10, this) == objBeachfront) {
                        return objBeachfront;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
        } catch (Exception e) {
            InterfaceC3072m9 interfaceC3072m11 = this.d;
            if (interfaceC3072m11 != null) {
                C3315w3 c3315w4 = C3315w3.a;
                Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                ((C3097n9) interfaceC3072m11).b("w3", "SDK encountered unexpected error in pinging click over WebView; " + e.getMessage());
            }
        }
        return Unit.f29295attabal;
    }
}
