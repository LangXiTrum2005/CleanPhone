package com.codejoy.boom.clap.fcm;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import tetrahedral.triweekly;

/* JADX INFO: compiled from: FcmActionHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/wireman;", "", "", "it", "<anonymous>", "(Lkotlinx/coroutines/flow/wireman;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.fcm.FcmActionHelper$reportFcmTokenToServer$2", f = "FcmActionHelper.kt", l = {}, m = "invokeSuspend", v = 1)
public final class FcmActionHelper$reportFcmTokenToServer$2 extends SuspendLambda implements triweekly<kotlinx.coroutines.flow.wireman<? super Unit>, Throwable, wretchedly.dern<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public FcmActionHelper$reportFcmTokenToServer$2(wretchedly.dern<? super FcmActionHelper$reportFcmTokenToServer$2> dernVar) {
        super(3, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = (Throwable) this.L$0;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p002kotlin.dern.saneness(obj);
        com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "后端注册 token 失败：" + th.getMessage());
        throw th;
    }

    @Override // tetrahedral.triweekly
    public final Object invoke(kotlinx.coroutines.flow.wireman<? super Unit> wiremanVar, Throwable th, wretchedly.dern<? super Unit> dernVar) {
        FcmActionHelper$reportFcmTokenToServer$2 fcmActionHelper$reportFcmTokenToServer$2 = new FcmActionHelper$reportFcmTokenToServer$2(dernVar);
        fcmActionHelper$reportFcmTokenToServer$2.L$0 = th;
        return fcmActionHelper$reportFcmTokenToServer$2.invokeSuspend(Unit.f29295attabal);
    }
}
