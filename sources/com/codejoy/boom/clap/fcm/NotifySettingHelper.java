package com.codejoy.boom.clap.fcm;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.molybdenite;
import com.codejoy.boom.clap.MainActivity;
import com.codejoy.boom.clap.arytenoidectomy;
import com.codejoy.boom.clap.data.bean.FcmDataNotification;
import com.codejoy.boom.clap.impassible;
import com.codejoy.boom.clap.kowloon;
import com.codejoy.boom.clap.module.result.ActivateResultActivity;
import com.codejoy.boom.clap.triweekly;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.measurement.AppMeasurement;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import decarock.preprohormone;
import igbo.polloi;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.premeiotic;
import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NotifySettingHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\rJ\u001f\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\rJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001eH\u0002¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020%2\u0006\u0010*\u001a\u00020%H\u0002¢\u0006\u0004\b+\u0010,JA\u00103\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020%2\b\u0010/\u001a\u0004\u0018\u00010'2\u0006\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u000fH\u0002¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\t2\u0006\u0010.\u001a\u00020%2\u0006\u00101\u001a\u00020\u000fH\u0002¢\u0006\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020%0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/codejoy/boom/clap/fcm/NotifySettingHelper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "impassible", "(Landroid/content/Context;)V", "", "notifyId", "Landroid/app/Notification;", "taiyuan", "(Landroid/content/Context;I)Landroid/app/Notification;", "apical", "", "marial", "(Landroid/content/Context;)Z", "Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;", "data", "monoploid", "(Landroid/content/Context;Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;Lwretchedly/dern;)Ljava/lang/Object;", "Landroid/content/Intent;", "intent", "Landroid/app/PendingIntent;", "deleteIntent", "polloi", "(Landroid/content/Context;Landroid/content/Intent;ILandroid/app/PendingIntent;)Z", "formularize", "cutely", "", "Landroid/app/NotificationChannel;", "competently", "(Landroid/content/Context;)Ljava/util/List;", "Landroid/app/NotificationChannelGroup;", "impromptu", "()Ljava/util/List;", "", "imageUrl", "Landroid/graphics/Bitmap;", "triweekly", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;", "messageId", "arytenoidectomy", "(Ljava/lang/String;)Ljava/lang/String;", "payload", "notificationUiStyle", "bitmap", BaseGmsClient.KEY_PENDING_INTENT, "expanded", "Landroid/widget/RemoteViews;", "beachfront", "(Landroid/content/Context;Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/app/PendingIntent;Z)Landroid/widget/RemoteViews;", "kowloon", "(Ljava/lang/String;Z)I", "saneness", "Ljava/util/List;", "notificationUiStyles", "Ljava/util/concurrent/atomic/AtomicInteger;", "dern", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextFcmNotificationId", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotifySettingHelper {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final NotifySettingHelper f18231attabal = new NotifySettingHelper();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final List<String> notificationUiStyles = adultoid.kowloon("custom_light_pink", "custom_light_purple", "custom_white");

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final AtomicInteger nextFcmNotificationId = new AtomicInteger(((int) (System.currentTimeMillis() % ((long) 2147473647))) + 10000);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f18234wireman = 8;

    public final Notification apical(Context context, int notifyId) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra("setting_silent_mode", false);
            PendingIntent activity = PendingIntent.getActivity(context, notifyId, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 134217728);
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
            String string = context.getString(arytenoidectomy.silent_mode_notify_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = context.getString(arytenoidectomy.silent_mode_notify_content);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = context.getString(arytenoidectomy.silent_mode_notify_btn);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), triweekly.layout_notification_silent_collapsed);
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), triweekly.layout_notification_silent_expanded);
            remoteViews.setTextViewText(impassible.tvTitle, string);
            remoteViews.setTextViewText(impassible.tvContent, string2);
            remoteViews2.setTextViewText(impassible.tvTitle, string);
            remoteViews2.setTextViewText(impassible.tvContent, string2);
            remoteViews2.setTextViewText(impassible.tvBtnContent, string3);
            remoteViews.setOnClickPendingIntent(impassible.deactivate, activity);
            remoteViews2.setOnClickPendingIntent(impassible.deactivate, activity);
            Notification notificationSaneness = new NotificationCompat.impassible(context, AppMeasurement.FCM_ORIGIN).cord(kowloon.logo).marial(true).impassible(remoteViews).formularize(remoteViews2).gintrap(1).oilcan(null).cuirassed(null).polloi(0, 0, 0).taiyuan(activity).dovishness(true).saneness();
            Intrinsics.checkNotNullExpressionValue(notificationSaneness, "build(...)");
            notificationSaneness.flags = 16;
            return notificationSaneness;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String arytenoidectomy(String messageId) {
        if (messageId.length() == 0) {
            messageId = String.valueOf(System.currentTimeMillis());
        }
        List<String> list = notificationUiStyles;
        return list.get(Math.floorMod(messageId.hashCode(), list.size()));
    }

    public final RemoteViews beachfront(Context context, FcmDataNotification payload, String notificationUiStyle, Bitmap bitmap, PendingIntent pendingIntent, boolean expanded) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), kowloon(notificationUiStyle, expanded));
        remoteViews.setTextViewText(impassible.tvNotifyTitle, payload.getTitle());
        remoteViews.setTextViewText(impassible.tvNotifySubTitle, payload.getBody());
        remoteViews.setOnClickPendingIntent(impassible.tvNotifyButton, pendingIntent);
        if (bitmap == null) {
            remoteViews.setViewVisibility(impassible.ivNotifyIcon, 8);
            return remoteViews;
        }
        remoteViews.setViewVisibility(impassible.ivNotifyIcon, 0);
        remoteViews.setImageViewBitmap(impassible.ivNotifyIcon, bitmap);
        return remoteViews;
    }

    public final List<NotificationChannel> competently(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return new ArrayList();
        }
        preprohormone.attabal();
        NotificationChannel notificationChannelAttabal = monoploid.beachfront.attabal(AppMeasurement.FCM_ORIGIN, "FCM", 4);
        notificationChannelAttabal.setShowBadge(true);
        notificationChannelAttabal.enableLights(false);
        notificationChannelAttabal.enableVibration(false);
        notificationChannelAttabal.setSound(null, null);
        return graveside.marial(notificationChannelAttabal);
    }

    public final Notification cutely(Context context, int notifyId) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intent intent = new Intent(context, (Class<?>) ActivateResultActivity.class);
            intent.putExtra("key_is_activated", false);
            intent.putExtra("entrance_key", "notification");
            PendingIntent activity = PendingIntent.getActivity(context, notifyId, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 134217728);
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), triweekly.layout_notification_collapsed);
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), triweekly.layout_notification_expanded);
            remoteViews.setOnClickPendingIntent(impassible.deactivate, activity);
            remoteViews2.setOnClickPendingIntent(impassible.deactivate, activity);
            Notification notificationSaneness = new NotificationCompat.impassible(context, AppMeasurement.FCM_ORIGIN).cord(kowloon.logo).marial(true).impassible(remoteViews).formularize(remoteViews2).gintrap(1).oilcan(null).cuirassed(null).polloi(0, 0, 0).taiyuan(activity).dovishness(true).saneness();
            Intrinsics.checkNotNullExpressionValue(notificationSaneness, "build(...)");
            notificationSaneness.flags = 16;
            return notificationSaneness;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Notification formularize(Context context, int notifyId) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intent intent = new Intent(context, (Class<?>) ActivateResultActivity.class);
            intent.putExtra("key_is_activated", false);
            intent.putExtra("entrance_key", "notification");
            PendingIntent activity = PendingIntent.getActivity(context, notifyId, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 134217728);
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), triweekly.layout_notification_collapsed);
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), triweekly.layout_notification_expanded);
            remoteViews.setOnClickPendingIntent(impassible.deactivate, activity);
            remoteViews2.setOnClickPendingIntent(impassible.deactivate, activity);
            Notification notificationSaneness = new NotificationCompat.impassible(context, AppMeasurement.FCM_ORIGIN).cord(kowloon.logo).marial(true).impassible(remoteViews).formularize(remoteViews2).gintrap(1).oilcan(null).cuirassed(null).polloi(0, 0, 0).taiyuan(activity).dovishness(true).saneness();
            Intrinsics.checkNotNullExpressionValue(notificationSaneness, "build(...)");
            notificationSaneness.flags = 16;
            return notificationSaneness;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void impassible(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (Build.VERSION.SDK_INT >= 26) {
                Object systemService = picketboat.saneness.getSystemService(context, NotificationManager.class);
                Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                NotificationManager notificationManager = (NotificationManager) systemService;
                notificationManager.createNotificationChannels(competently(context));
                notificationManager.createNotificationChannelGroups(impromptu());
            }
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    public final List<NotificationChannelGroup> impromptu() {
        return adultoid.formularize();
    }

    public final int kowloon(String notificationUiStyle, boolean expanded) {
        if (Intrinsics.wireman(notificationUiStyle, "custom_light_pink")) {
            return expanded ? triweekly.layout_custom_notification_light_pink_big : triweekly.layout_custom_notification_light_pink_small;
        }
        if (Intrinsics.wireman(notificationUiStyle, "custom_white")) {
            return expanded ? triweekly.layout_custom_notification_white_big : triweekly.layout_custom_notification_white_small;
        }
        return expanded ? triweekly.layout_custom_notification_light_purple_big : triweekly.layout_custom_notification_light_purple_small;
    }

    public final boolean marial(Context context) {
        NotificationChannel notificationChannel;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!polloi.saneness(context).attabal()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        return (notificationManager == null || (notificationChannel = notificationManager.getNotificationChannel(AppMeasurement.FCM_ORIGIN)) == null || notificationChannel.getImportance() == 0) ? false : true;
    }

    public final Object monoploid(Context context, FcmDataNotification fcmDataNotification, wretchedly.dern<? super Boolean> dernVar) {
        return kotlinx.coroutines.impromptu.competently(premeiotic.saneness(), new NotifySettingHelper$showFcmDataNotification$2(fcmDataNotification, context, null), dernVar);
    }

    public final boolean polloi(Context context, Intent intent, int notifyId, PendingIntent deleteIntent) {
        Object objM3351constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            Result.Companion companion = Result.INSTANCE;
            PendingIntent activity = PendingIntent.getActivity(context, notifyId, intent, 201326592);
            String string = context.getString(arytenoidectomy.bringback_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = context.getString(arytenoidectomy.bringback_body);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), triweekly.layout_recall_notification_collapsed);
            remoteViews.setTextViewText(impassible.tvRecallNotifyTitle, string);
            remoteViews.setTextViewText(impassible.tvRecallNotifyContent, string2);
            NotificationCompat.impassible impassibleVarTaiyuan = new NotificationCompat.impassible(context, AppMeasurement.FCM_ORIGIN).cord(kowloon.logo_round).stratoscope(new NotificationCompat.kowloon()).marial(true).impassible(remoteViews).apical(string).cutely(string2).gintrap(2).taiyuan(activity);
            Intrinsics.checkNotNullExpressionValue(impassibleVarTaiyuan, "setContentIntent(...)");
            if (deleteIntent != null) {
                impassibleVarTaiyuan.kowloon(deleteIntent);
            }
            Notification notificationSaneness = impassibleVarTaiyuan.saneness();
            notificationSaneness.flags = 16;
            Intrinsics.checkNotNullExpressionValue(notificationSaneness, "apply(...)");
            Object systemService = context.getSystemService("notification");
            Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).notify(notifyId, notificationSaneness);
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("RecallNotify", "召回通知提交成功：notifyId=" + notifyId);
            objM3351constructorimpl = Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.dern("RecallNotify", "召回通知提交失败：" + thM3354exceptionOrNullimpl.getMessage());
        }
        return Result.m3357isSuccessimpl(objM3351constructorimpl);
    }

    public final Notification taiyuan(Context context, int notifyId) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intent intent = new Intent(context, (Class<?>) ActivateResultActivity.class);
            intent.putExtra("key_is_activated", false);
            intent.putExtra("entrance_key", "notification");
            PendingIntent activity = PendingIntent.getActivity(context, notifyId, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 134217728);
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), triweekly.layout_notification_collapsed);
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), triweekly.layout_notification_expanded);
            remoteViews.setOnClickPendingIntent(impassible.deactivate, activity);
            remoteViews2.setOnClickPendingIntent(impassible.deactivate, activity);
            Notification notificationSaneness = new NotificationCompat.impassible(context, AppMeasurement.FCM_ORIGIN).cord(kowloon.logo).marial(true).impassible(remoteViews).formularize(remoteViews2).gintrap(1).oilcan(null).cuirassed(null).polloi(0, 0, 0).taiyuan(activity).dovishness(true).saneness();
            Intrinsics.checkNotNullExpressionValue(notificationSaneness, "build(...)");
            notificationSaneness.flags = 16;
            return notificationSaneness;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap triweekly(Context context, String imageUrl) {
        Object objM3351constructorimpl;
        String scheme = Uri.parse(imageUrl).getScheme();
        if (scheme == null) {
            scheme = "";
        }
        String lowerCase = scheme.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (!Intrinsics.wireman(lowerCase, "http") && !Intrinsics.wireman(lowerCase, HttpRequest.DEFAULT_SCHEME)) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl((Bitmap) com.bumptech.glide.saneness.graveside(context).competently().czestochowa(imageUrl).grimness(Opcodes.FCMPG, Sdk$SDKError.Reason.AD_NOT_LOADED_VALUE).overspeculate(new patty.preprohormone(molybdenite.attabal(4.0f))).preterite().get(10L, TimeUnit.SECONDS));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "推送图片加载失败，使用无图样式：" + thM3354exceptionOrNullimpl.getMessage());
        }
        return (Bitmap) (Result.m3356isFailureimpl(objM3351constructorimpl) ? null : objM3351constructorimpl);
    }
}
