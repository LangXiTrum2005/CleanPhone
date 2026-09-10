package com.inmobi.media;

import android.os.SystemClock;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3190r3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ S2 b;
    public final /* synthetic */ InterfaceC3072m9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3190r3(S2 s2, InterfaceC3072m9 interfaceC3072m9, dern dernVar) {
        super(2, dernVar);
        this.b = s2;
        this.c = interfaceC3072m9;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3190r3(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3190r3(this.b, this.c, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            C3315w3 c3315w3 = C3315w3.a;
            SystemClock.elapsedRealtime();
            if (this.b.e) {
                InterfaceC3072m9 interfaceC3072m9 = this.c;
                if (interfaceC3072m9 != null) {
                    Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                    ((C3097n9) interfaceC3072m9).c("w3", "ping in web view");
                }
                new C2967i3(C3315w3.l).a(this.b);
            } else {
                InterfaceC3072m9 interfaceC3072m10 = this.c;
                if (interfaceC3072m10 != null) {
                    Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
                    ((C3097n9) interfaceC3072m10).c("w3", "ping in http executor");
                }
                C3016k3 c3016k3 = new C3016k3();
                S2 s2 = this.b;
                this.a = 1;
                obj = c3016k3.a(s2, this);
                if (obj == objBeachfront) {
                    return objBeachfront;
                }
            }
            return Unit.f29295attabal;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p002kotlin.dern.saneness(obj);
        EnumC2765a6 enumC2765a6 = (EnumC2765a6) obj;
        if (enumC2765a6 != null) {
            C3315w3.l.a(this.b, enumC2765a6);
        } else {
            C3315w3.l.a(this.b);
        }
        return Unit.f29295attabal;
    }
}
