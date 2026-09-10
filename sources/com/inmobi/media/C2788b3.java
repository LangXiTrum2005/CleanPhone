package com.inmobi.media;

import android.os.Message;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2788b3 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ S2 c;
    public final /* synthetic */ HandlerC2917g3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2788b3(S2 s2, HandlerC2917g3 handlerC2917g3, dern dernVar) {
        super(2, dernVar);
        this.c = s2;
        this.d = handlerC2917g3;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C2788b3 c2788b3 = new C2788b3(this.c, this.d, dernVar);
        c2788b3.b = obj;
        return c2788b3;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2788b3) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            saran saranVar = (saran) this.b;
            C3016k3 c3016k3 = new C3016k3();
            S2 s2 = this.c;
            this.b = saranVar;
            this.a = 1;
            obj = c3016k3.a(s2, this);
            if (obj == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        if (((EnumC2765a6) obj) != null) {
            HandlerC2917g3 handlerC2917g3 = this.d;
            S2 s3 = this.c;
            int i2 = HandlerC2917g3.a;
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = s3;
            handlerC2917g3.sendMessage(messageObtain);
        } else {
            S2 s4 = this.c;
            HandlerC2917g3 handlerC2917g4 = this.d;
            C3315w3 c3315w3 = C3315w3.a;
            Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
            String str = s4.b;
            C3315w3.b(s4);
            int i3 = HandlerC2917g3.a;
            handlerC2917g4.b(s4);
        }
        return Unit.f29295attabal;
    }
}
