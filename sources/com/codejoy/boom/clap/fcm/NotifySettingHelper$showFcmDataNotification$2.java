package com.codejoy.boom.clap.fcm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.codejoy.boom.clap.data.bean.FcmDataNotification;
import com.codejoy.boom.clap.kowloon;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.UUID;
import java.util.function.IntUnaryOperator;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: NotifySettingHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)Z"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.fcm.NotifySettingHelper$showFcmDataNotification$2", f = "NotifySettingHelper.kt", l = {}, m = "invokeSuspend", v = 1)
public final class NotifySettingHelper$showFcmDataNotification$2 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ FcmDataNotification $data;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifySettingHelper$showFcmDataNotification$2(FcmDataNotification fcmDataNotification, Context context, wretchedly.dern<? super NotifySettingHelper$showFcmDataNotification$2> dernVar) {
        super(2, dernVar);
        this.$data = fcmDataNotification;
        this.$context = context;
    }

    public static final int triweekly(int i) {
        if (i == Integer.MAX_VALUE) {
            return 10000;
        }
        return i + 1;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        NotifySettingHelper$showFcmDataNotification$2 notifySettingHelper$showFcmDataNotification$2 = new NotifySettingHelper$showFcmDataNotification$2(this.$data, this.$context, dernVar);
        notifySettingHelper$showFcmDataNotification$2.L$0 = obj;
        return notifySettingHelper$showFcmDataNotification$2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        Object objM3351constructorimpl;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p002kotlin.dern.saneness(obj);
        FcmDataNotification fcmDataNotification = this.$data;
        Context context = this.$context;
        try {
            Result.Companion companion = Result.INSTANCE;
            String pushId = fcmDataNotification.getPushId();
            if (StringsKt.empress(pushId)) {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                pushId = com.blankj.utilcode.util.competently.saneness(dovishness.polder(string, "-", "", false, 4, null) + "-" + com.yolo.networklibrary.common.util.dern.monoploid(context));
            }
            String str2 = pushId;
            NotifySettingHelper notifySettingHelper = NotifySettingHelper.f18231attabal;
            String strArytenoidectomy = notifySettingHelper.arytenoidectomy(fcmDataNotification.getMessageId());
            Intrinsics.beachfront(str2);
            String pushType = fcmDataNotification.getPushType();
            if (StringsKt.empress(pushType)) {
                pushType = "custom";
            }
            String str3 = pushType;
            String notificationUiType = fcmDataNotification.getNotificationUiType();
            z = false;
            try {
                FcmDataNotification fcmDataNotificationCopy$default = FcmDataNotification.copy$default(fcmDataNotification, null, null, null, str2, str3, null, null, null, null, null, StringsKt.empress(notificationUiType) ? strArytenoidectomy : notificationUiType, null, null, 7143, null);
                Bitmap bitmapTriweekly = notifySettingHelper.triweekly(context, fcmDataNotificationCopy$default.getImageUrl());
                int iUpdateAndGet = NotifySettingHelper.nextFcmNotificationId.updateAndGet(new IntUnaryOperator() { // from class: com.codejoy.boom.clap.fcm.taiyuan
                    @Override // java.util.function.IntUnaryOperator
                    public final int applyAsInt(int i) {
                        return NotifySettingHelper$showFcmDataNotification$2.triweekly(i);
                    }
                });
                int i = iUpdateAndGet << 1;
                Intent intent = new Intent(context, (Class<?>) FcmMessageActivity.class);
                intent.setAction(context.getPackageName() + ".FCM_CONTENT." + str2);
                intent.putExtra("key_notify_from_source", "FCM_DATA_NOTIFY");
                fcmDataNotificationCopy$default.putInto(intent);
                PendingIntent activity = PendingIntent.getActivity(context, i, intent, 201326592);
                Intent intent2 = new Intent(context, (Class<?>) FcmMessageActivity.class);
                intent2.setAction(context.getPackageName() + ".FCM_ACTIVATE." + str2);
                intent2.putExtra("key_notify_from_source", "FCM_DATA_NOTIFY");
                fcmDataNotificationCopy$default.putInto(intent2);
                PendingIntent activity2 = PendingIntent.getActivity(context, i + 1, intent2, 201326592);
                Intrinsics.beachfront(activity2);
                Notification notificationSaneness = new NotificationCompat.impassible(context, AppMeasurement.FCM_ORIGIN).cord(kowloon.logo_round).apical(fcmDataNotificationCopy$default.getTitle()).cutely(fcmDataNotificationCopy$default.getBody()).impassible(notifySettingHelper.beachfront(context, fcmDataNotificationCopy$default, strArytenoidectomy, bitmapTriweekly, activity2, false)).formularize(notifySettingHelper.beachfront(context, fcmDataNotificationCopy$default, strArytenoidectomy, bitmapTriweekly, activity2, true)).stratoscope(new NotificationCompat.kowloon()).marial(true).gintrap(2).triweekly(-1).beachfront(NotificationCompat.CATEGORY_REMINDER).taiyuan(activity).adultoid(false).saneness();
                notificationSaneness.flags = 16;
                Intrinsics.checkNotNullExpressionValue(notificationSaneness, "apply(...)");
                Object systemService = context.getSystemService("notification");
                Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).notify(iUpdateAndGet, notificationSaneness);
                com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
                str = "SmartPush";
                try {
                    dernVar.saneness(str, "系统通知提交成功：notifyId=" + iUpdateAndGet + "，pushId=" + str2);
                    stonecrop.dern.f38161attabal.beachfront(fcmDataNotificationCopy$default);
                    dernVar.saneness(str, "SHOW 上报已触发：pushId=" + str2);
                    objM3351constructorimpl = Result.m3351constructorimpl(igo.attabal.attabal(true));
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
                }
            } catch (Throwable th2) {
                th = th2;
                str = "SmartPush";
            }
        } catch (Throwable th3) {
            th = th3;
            str = "SmartPush";
            z = false;
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl == null) {
            return objM3351constructorimpl;
        }
        com.codejoy.boom.clap.helper.dern.f18260attabal.dern(str, "系统通知提交失败：" + thM3354exceptionOrNullimpl.getMessage());
        return igo.attabal.attabal(z);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Boolean> dernVar) {
        return ((NotifySettingHelper$showFcmDataNotification$2) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
