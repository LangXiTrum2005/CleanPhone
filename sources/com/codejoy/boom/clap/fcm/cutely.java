package com.codejoy.boom.clap.fcm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.service.notification.StatusBarNotification;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.codejoy.boom.clap.data.bean.FcmDataNotification;
import com.codejoy.boom.clap.impassible;
import com.codejoy.boom.clap.kowloon;
import com.codejoy.boom.clap.triweekly;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.UUID;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: ResidentNotificationHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\fJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\nJ?\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"¨\u0006$"}, d2 = {"Lcom/codejoy/boom/clap/fcm/cutely;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;", "sourcePayload", "", "competently", "(Landroid/content/Context;Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;)Z", "impromptu", "(Landroid/content/Context;)Z", "wireman", "", "pushType", "marial", "(Landroid/content/Context;Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;Ljava/lang/String;)Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;", "payload", "beachfront", "", "layoutId", "Landroid/app/PendingIntent;", "clapIntent", "antiTheftIntent", "privacyIntent", "Landroid/widget/RemoteViews;", "dern", "(Landroid/content/Context;Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroid/widget/RemoteViews;", "target", "attabal", "(Landroid/content/Context;Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;I)Landroid/app/PendingIntent;", "saneness", "(Landroid/content/Context;)Ljava/lang/String;", "Ljava/lang/Object;", "notificationLock", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final cutely f18235attabal = new cutely();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Object notificationLock = new Object();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f18236dern = 8;

    public final PendingIntent attabal(Context context, FcmDataNotification payload, int target) {
        Intent intent = new Intent(context, (Class<?>) FcmMessageActivity.class);
        intent.setAction(context.getPackageName() + ".RESIDENT_ACTION." + target);
        intent.putExtra("key_notify_from_source", "RESIDENT_NOTIFY");
        intent.putExtra("extra_home_function", target);
        payload.putInto(intent);
        PendingIntent activity = PendingIntent.getActivity(context, target + 12291, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    public final boolean beachfront(Context context, FcmDataNotification payload) {
        Object objM3351constructorimpl;
        if (!NotifySettingHelper.f18231attabal.marial(context)) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("ResidentNotify", "常驻通知拦截：通知权限或现有渠道不可用");
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            PendingIntent pendingIntentAttabal = attabal(context, payload, 0);
            PendingIntent pendingIntentAttabal2 = attabal(context, payload, 2);
            PendingIntent pendingIntentAttabal3 = attabal(context, payload, 1);
            Notification notificationSaneness = new NotificationCompat.impassible(context, AppMeasurement.FCM_ORIGIN).cord(kowloon.logo_round).apical(payload.getTitle()).cutely(payload.getBody()).impassible(dern(context, payload, triweekly.layout_resident_notification_small, pendingIntentAttabal, pendingIntentAttabal2, pendingIntentAttabal3)).formularize(dern(context, payload, triweekly.layout_resident_notification_expanded, pendingIntentAttabal, pendingIntentAttabal2, pendingIntentAttabal3)).stratoscope(new NotificationCompat.kowloon()).taiyuan(pendingIntentAttabal).gintrap(1).beachfront("status").dovishness(true).preprohormone(true).marial(false).adultoid(true).saneness();
            notificationSaneness.flags |= 34;
            Intrinsics.checkNotNullExpressionValue(notificationSaneness, "apply(...)");
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (notificationManager == null) {
                throw new IllegalStateException("notification_manager_unavailable");
            }
            notificationManager.notify(12291, notificationSaneness);
            stonecrop.dern.f38161attabal.beachfront(payload);
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("ResidentNotify", "常驻通知展示成功：pushId=" + payload.getPushId() + "，pushType=" + payload.getPushType());
            objM3351constructorimpl = Result.m3351constructorimpl(Boolean.TRUE);
            Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
            if (thM3354exceptionOrNullimpl != null) {
                com.codejoy.boom.clap.helper.dern.f18260attabal.dern("ResidentNotify", "常驻通知展示失败：" + thM3354exceptionOrNullimpl.getMessage());
                objM3351constructorimpl = Boolean.FALSE;
            }
            return ((Boolean) objM3351constructorimpl).booleanValue();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    public final boolean competently(Context context, FcmDataNotification sourcePayload) {
        boolean zBeachfront;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sourcePayload, "sourcePayload");
        synchronized (notificationLock) {
            cutely cutelyVar = f18235attabal;
            FcmDataNotification fcmDataNotificationMarial = cutelyVar.marial(context, sourcePayload, "smart_resident");
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            zBeachfront = cutelyVar.beachfront(applicationContext, fcmDataNotificationMarial);
        }
        return zBeachfront;
    }

    public final RemoteViews dern(Context context, FcmDataNotification payload, int layoutId, PendingIntent clapIntent, PendingIntent antiTheftIntent, PendingIntent privacyIntent) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), layoutId);
        remoteViews.setOnClickPendingIntent(impassible.residentClapButton, clapIntent);
        remoteViews.setOnClickPendingIntent(impassible.residentAntiTheftButton, antiTheftIntent);
        remoteViews.setOnClickPendingIntent(impassible.residentPrivacyButton, privacyIntent);
        return remoteViews;
    }

    public final boolean impromptu(Context context) {
        boolean zBeachfront;
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (notificationLock) {
            try {
                Context applicationContext = context.getApplicationContext();
                cutely cutelyVar = f18235attabal;
                Intrinsics.beachfront(applicationContext);
                if (cutelyVar.wireman(applicationContext)) {
                    com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("ResidentNotify", "常驻通知已存在，首页不重复覆盖");
                    zBeachfront = false;
                } else {
                    zBeachfront = cutelyVar.beachfront(applicationContext, cutelyVar.marial(applicationContext, new FcmDataNotification(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null), "resident"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBeachfront;
    }

    public final FcmDataNotification marial(Context context, FcmDataNotification sourcePayload, String pushType) {
        String pushId = sourcePayload.getPushId();
        if (StringsKt.empress(pushId)) {
            pushId = f18235attabal.saneness(context);
        }
        return FcmDataNotification.copy$default(sourcePayload, null, null, null, pushId, pushType, null, null, null, null, null, null, null, null, 8167, null);
    }

    public final String saneness(Context context) {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String strSaneness = com.blankj.utilcode.util.competently.saneness(dovishness.polder(string, "-", "", false, 4, null) + "-" + com.yolo.networklibrary.common.util.dern.monoploid(context));
        Intrinsics.checkNotNullExpressionValue(strSaneness, "encryptMD5ToString(...)");
        return strSaneness;
    }

    public final boolean wireman(Context context) {
        StatusBarNotification[] activeNotifications;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager != null && (activeNotifications = notificationManager.getActiveNotifications()) != null) {
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification.getId() == 12291) {
                    return true;
                }
            }
        }
        return false;
    }
}
