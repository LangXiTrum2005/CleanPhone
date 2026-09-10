package com.codejoy.boom.clap.fcm;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FcmActionHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.fcm.FcmActionHelper$registerFcmToken$1", f = "FcmActionHelper.kt", l = {62}, m = "invokeSuspend", v = 1)
public final class FcmActionHelper$registerFcmToken$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ String $token;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FcmActionHelper$registerFcmToken$1(String str, wretchedly.dern<? super FcmActionHelper$registerFcmToken$1> dernVar) {
        super(2, dernVar);
        this.$token = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new FcmActionHelper$registerFcmToken$1(this.$token, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                FcmActionHelper fcmActionHelper = FcmActionHelper.f18220attabal;
                String str = this.$token;
                this.label = 1;
                if (fcmActionHelper.arytenoidectomy(str, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "token 或主题同步失败：" + th.getMessage());
        }
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((FcmActionHelper$registerFcmToken$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
