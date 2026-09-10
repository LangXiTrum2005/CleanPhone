package com.inmobi.media;

import android.os.Message;
import com.inmobi.media.core.config.models.AdConfig;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2762a3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ W2 b;
    public final /* synthetic */ HandlerC2917g3 c;
    public final /* synthetic */ AdConfig.ImaiConfig d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2762a3(W2 w2, HandlerC2917g3 handlerC2917g3, AdConfig.ImaiConfig imaiConfig, dern dernVar) {
        super(2, dernVar);
        this.b = w2;
        this.c = handlerC2917g3;
        this.d = imaiConfig;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2762a3(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2762a3) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            W2 w2 = this.b;
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
            C3315w3.g.set(false);
            return Unit.f29295attabal;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        return igo.attabal.attabal(this.c.sendMessageDelayed(messageObtain, this.d.getPingInterval() * 1000));
    }
}
