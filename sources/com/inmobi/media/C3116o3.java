package com.inmobi.media;

import org.objectweb.asm.Opcodes;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3116o3 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C3097n9 c;
    public final /* synthetic */ C2759a0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3116o3(String str, C3097n9 c3097n9, C2759a0 c2759a0, dern dernVar) {
        super(1, dernVar);
        this.b = str;
        this.c = c3097n9;
        this.d = c2759a0;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new C3116o3(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3116o3) create((dern) obj)).invokeSuspend(Unit.f29295attabal);
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
                    S2 s2 = new S2(str, true, false, maxRetries + 1, Opcodes.MULTIANEWARRAY);
                    C3097n9 c3097n9 = this.c;
                    if (c3097n9 != null) {
                        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                        c3097n9.a("w3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    C2759a0 c2759a0 = this.d;
                    C3097n9 c3097n10 = this.c;
                    this.a = 1;
                    if (c3315w3.a(s2, c2759a0, c3097n10, this) == objBeachfront) {
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
            C3097n9 c3097n11 = this.c;
            if (c3097n11 != null) {
                C3315w3 c3315w4 = C3315w3.a;
                Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                c3097n11.b("w3", "SDK encountered unexpected error in pinging click; " + e.getMessage());
            }
        }
        return Unit.f29295attabal;
    }
}
