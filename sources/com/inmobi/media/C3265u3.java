package com.inmobi.media;

import android.os.Message;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3265u3 extends SuspendLambda implements Function2 {
    public int a;

    public C3265u3(dern dernVar) {
        super(2, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3265u3(dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3265u3((dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            W2 w2 = (W2) C3315w3.b.getValue();
            this.a = 1;
            obj = w2.a(this);
            if (obj == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            C3315w3 c3315w3 = C3315w3.a;
            Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
            C3315w3.g.set(false);
            C3315w3.g();
            return Unit.f29295attabal;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        HandlerC2917g3 handlerC2917g3 = C3315w3.d;
        if (handlerC2917g3 != null) {
            return igo.attabal.attabal(handlerC2917g3.sendMessage(messageObtain));
        }
        return null;
    }
}
