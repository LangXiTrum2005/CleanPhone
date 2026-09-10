package com.codejoy.boom.clap.fcm;

import android.content.Context;
import com.codejoy.boom.clap.data.bean.FcmDataNotification;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FCMExtraActionHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.fcm.FCMExtraActionHelper$handleFcmNotification$1", f = "FCMExtraActionHelper.kt", l = {62}, m = "invokeSuspend", v = 1)
public final class FCMExtraActionHelper$handleFcmNotification$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ FcmDataNotification $payload;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCMExtraActionHelper$handleFcmNotification$1(Context context, FcmDataNotification fcmDataNotification, wretchedly.dern<? super FCMExtraActionHelper$handleFcmNotification$1> dernVar) {
        super(2, dernVar);
        this.$context = context;
        this.$payload = fcmDataNotification;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new FCMExtraActionHelper$handleFcmNotification$1(this.$context, this.$payload, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            NotifySettingHelper notifySettingHelper = NotifySettingHelper.f18231attabal;
            Context applicationContext = this.$context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            FcmDataNotification fcmDataNotification = this.$payload;
            this.label = 1;
            obj = notifySettingHelper.monoploid(applicationContext, fcmDataNotification, this);
            if (obj == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "notification payload 自定义通知展示成功");
        } else {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "notification payload 自定义通知提交失败");
        }
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((FCMExtraActionHelper$handleFcmNotification$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
