package com.codejoy.boom.clap.fcm;

import android.content.Context;
import com.codejoy.boom.clap.data.bean.FcmDataNotification;
import com.google.android.gms.ads.AdSize;
import com.google.firebase.messaging.RemoteMessage;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FCMExtraActionHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.fcm.FCMExtraActionHelper$handleFcmDataMsg$3", f = "FCMExtraActionHelper.kt", l = {AdSize.MEDIUM_RECTANGLE_HEIGHT, 120}, m = "invokeSuspend", v = 1)
public final class FCMExtraActionHelper$handleFcmDataMsg$3 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ FcmDataNotification $payload;
    final /* synthetic */ RemoteMessage $remoteMessage;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCMExtraActionHelper$handleFcmDataMsg$3(RemoteMessage remoteMessage, FcmDataNotification fcmDataNotification, Context context, wretchedly.dern<? super FCMExtraActionHelper$handleFcmDataMsg$3> dernVar) {
        super(2, dernVar);
        this.$remoteMessage = remoteMessage;
        this.$payload = fcmDataNotification;
        this.$appContext = context;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new FCMExtraActionHelper$handleFcmDataMsg$3(this.$remoteMessage, this.$payload, this.$appContext, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a3 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:29:0x009b, B:31:0x00a3, B:38:0x00c7, B:32:0x00b4), top: B:43:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:29:0x009b, B:31:0x00a3, B:38:0x00c7, B:32:0x00b4), top: B:43:0x0016 }] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        formularization.attabal attabalVar;
        RemoteMessage remoteMessage;
        FcmDataNotification fcmDataNotification;
        Context context;
        int i;
        formularization.attabal attabalVar2;
        Throwable th;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = FCMExtraActionHelper.notificationMutex;
                remoteMessage = this.$remoteMessage;
                fcmDataNotification = this.$payload;
                Context context2 = this.$appContext;
                this.L$0 = attabalVar;
                this.L$1 = remoteMessage;
                this.L$2 = fcmDataNotification;
                this.L$3 = context2;
                this.I$0 = 0;
                this.label = 1;
                if (attabalVar.attabal(null, this) != objBeachfront) {
                    context = context2;
                    i = 0;
                }
                return objBeachfront;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar2 = (formularization.attabal) this.L$0;
                try {
                    p002kotlin.dern.saneness(obj);
                    if (((Boolean) obj).booleanValue()) {
                        tau.saneness.f38666attabal.kattegat(System.currentTimeMillis());
                        com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "智能推送展示成功，冷却时间已更新");
                    } else {
                        com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "智能推送提交失败，未更新冷却时间");
                    }
                    Unit unit = Unit.f29295attabal;
                    attabalVar2.wireman(null);
                    return Unit.f29295attabal;
                } catch (Throwable th2) {
                    th = th2;
                    attabalVar2.wireman(null);
                    throw th;
                }
            }
            i = this.I$0;
            context = (Context) this.L$3;
            fcmDataNotification = (FcmDataNotification) this.L$2;
            remoteMessage = (RemoteMessage) this.L$1;
            formularization.attabal attabalVar3 = (formularization.attabal) this.L$0;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar3;
            com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
            dernVar.saneness("SmartPush", "开始检查智能推送展示条件");
            FCMExtraActionHelper fCMExtraActionHelper = FCMExtraActionHelper.f18216attabal;
            if (fCMExtraActionHelper.arytenoidectomy(remoteMessage) && !fCMExtraActionHelper.impassible(fcmDataNotification.getExcludeLanguages())) {
                Intrinsics.beachfront(context);
                if (fCMExtraActionHelper.impromptu(context)) {
                    NotifySettingHelper notifySettingHelper = NotifySettingHelper.f18231attabal;
                    this.L$0 = attabalVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i;
                    this.I$1 = 0;
                    this.label = 2;
                    Object objMonoploid = notifySettingHelper.monoploid(context, fcmDataNotification, this);
                    if (objMonoploid != objBeachfront) {
                        attabalVar2 = attabalVar;
                        obj = objMonoploid;
                        if (((Boolean) obj).booleanValue()) {
                            tau.saneness.f38666attabal.kattegat(System.currentTimeMillis());
                            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "智能推送展示成功，冷却时间已更新");
                        } else {
                            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "智能推送提交失败，未更新冷却时间");
                        }
                        Unit unit2 = Unit.f29295attabal;
                        attabalVar2.wireman(null);
                        return Unit.f29295attabal;
                    }
                    return objBeachfront;
                }
            }
            dernVar.saneness("SmartPush", "智能推送未展示");
            attabalVar2 = attabalVar;
            Unit unit3 = Unit.f29295attabal;
            attabalVar2.wireman(null);
            return Unit.f29295attabal;
        } catch (Throwable th3) {
            attabalVar2 = attabalVar;
            th = th3;
            attabalVar2.wireman(null);
            throw th;
        }
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((FCMExtraActionHelper$handleFcmDataMsg$3) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
