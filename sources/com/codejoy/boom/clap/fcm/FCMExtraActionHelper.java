package com.codejoy.boom.clap.fcm;

import android.app.KeyguardManager;
import android.content.Context;
import android.net.Uri;
import android.os.PowerManager;
import androidx.p001lifecycle.Lifecycle;
import androidx.p001lifecycle.trm;
import com.codejoy.boom.clap.data.bean.FcmDataNotification;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.sakeen;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: FCMExtraActionHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0019R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/codejoy/boom/clap/fcm/FCMExtraActionHelper;", "", "<init>", "()V", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "Landroid/content/Context;", "context", "", "apical", "(Lcom/google/firebase/messaging/RemoteMessage;Landroid/content/Context;)V", "", "taiyuan", "(Lcom/google/firebase/messaging/RemoteMessage;Landroid/content/Context;)Z", "includeNotificationPayload", "Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;", "beachfront", "(Lcom/google/firebase/messaging/RemoteMessage;Z)Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;", "arytenoidectomy", "(Lcom/google/firebase/messaging/RemoteMessage;)Z", "", "excludeLanguages", "impassible", "(Ljava/lang/String;)Z", "impromptu", "(Landroid/content/Context;)Z", "formularize", "()Z", "triweekly", "kowloon", "Lkotlinx/coroutines/saran;", "saneness", "Lkotlinx/coroutines/saran;", "applicationScope", "Lformularization/attabal;", "dern", "Lformularization/attabal;", "notificationMutex", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FCMExtraActionHelper {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final FCMExtraActionHelper f18216attabal = new FCMExtraActionHelper();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final saran applicationScope = privatdozent.attabal(sakeen.saneness(null, 1, null).plus(premeiotic.saneness()));

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final formularization.attabal notificationMutex = formularization.beachfront.saneness(false, 1, null);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f18219wireman = 8;

    /* JADX INFO: compiled from: FCMExtraActionHelper.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/codejoy/boom/clap/fcm/FCMExtraActionHelper$attabal", "Lcom/google/gson/reflect/TypeToken;", "", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal extends TypeToken<List<? extends String>> {
    }

    public static /* synthetic */ FcmDataNotification competently(FCMExtraActionHelper fCMExtraActionHelper, RemoteMessage remoteMessage, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return fCMExtraActionHelper.beachfront(remoteMessage, z);
    }

    public static final Unit cutely() {
        return Unit.f29295attabal;
    }

    public final void apical(RemoteMessage remoteMessage, Context context) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        Intrinsics.checkNotNullParameter(context, "context");
        if (remoteMessage.saneness() == null) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "没有可回退展示的 notification payload");
            return;
        }
        FcmDataNotification fcmDataNotificationBeachfront = beachfront(remoteMessage, true);
        if (StringsKt.empress(fcmDataNotificationBeachfront.getTitle()) && StringsKt.empress(fcmDataNotificationBeachfront.getBody())) {
            return;
        }
        kotlinx.coroutines.cutely.wireman(applicationScope, null, null, new FCMExtraActionHelper$handleFcmNotification$1(context, fcmDataNotificationBeachfront, null), 3, null);
    }

    public final boolean arytenoidectomy(RemoteMessage remoteMessage) {
        String str = remoteMessage.getData().get("min_version");
        Integer intOrNull = str != null ? StringsKt.toIntOrNull(str) : null;
        String str2 = remoteMessage.getData().get("max_version");
        Integer intOrNull2 = str2 != null ? StringsKt.toIntOrNull(str2) : null;
        boolean z = true;
        if (intOrNull == null && intOrNull2 == null) {
            return true;
        }
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : Integer.MAX_VALUE;
        if (iIntValue <= iIntValue2 && (iIntValue > 1150 || 1150 > iIntValue2)) {
            z = false;
        }
        if (!z) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "展示拦截：版本范围不匹配");
        }
        return z;
    }

    public final FcmDataNotification beachfront(RemoteMessage remoteMessage, boolean includeNotificationPayload) {
        String str;
        Uri uriSaneness;
        Uri uriNormalizeScheme;
        RemoteMessage.saneness sanenessVarSaneness = remoteMessage.saneness();
        String string = null;
        if (!includeNotificationPayload) {
            sanenessVarSaneness = null;
        }
        String strWireman = remoteMessage.getData().get("push_title");
        if (strWireman == null) {
            strWireman = "";
        }
        if (StringsKt.empress(strWireman) && (strWireman = remoteMessage.getData().get("title")) == null) {
            strWireman = "";
        }
        if (StringsKt.empress(strWireman)) {
            strWireman = sanenessVarSaneness != null ? sanenessVarSaneness.wireman() : null;
            if (strWireman == null) {
                strWireman = "";
            }
        }
        String str2 = strWireman;
        String strAttabal = remoteMessage.getData().get("push_introduce");
        if (strAttabal == null) {
            strAttabal = "";
        }
        if (StringsKt.empress(strAttabal)) {
            strAttabal = remoteMessage.getData().get("body");
            if (strAttabal == null) {
                strAttabal = "";
            }
            if (StringsKt.empress(strAttabal) && (strAttabal = remoteMessage.getData().get(CampaignEx.JSON_KEY_DESC)) == null) {
                strAttabal = "";
            }
        }
        if (StringsKt.empress(strAttabal)) {
            strAttabal = sanenessVarSaneness != null ? sanenessVarSaneness.attabal() : null;
            if (strAttabal == null) {
                strAttabal = "";
            }
        }
        String str3 = strAttabal;
        String str4 = remoteMessage.getData().get("push_image");
        if (str4 == null) {
            str4 = "";
        }
        if (StringsKt.empress(str4) && (str4 = remoteMessage.getData().get(CampaignEx.JSON_KEY_IMAGE_URL)) == null) {
            str4 = "";
        }
        if (StringsKt.empress(str4)) {
            if (sanenessVarSaneness != null && (uriSaneness = sanenessVarSaneness.saneness()) != null && (uriNormalizeScheme = uriSaneness.normalizeScheme()) != null) {
                string = uriNormalizeScheme.toString();
            }
            str4 = string == null ? "" : string;
        }
        String str5 = str4;
        String str6 = remoteMessage.getData().get("push_id");
        String str7 = str6 == null ? "" : str6;
        String str8 = remoteMessage.getData().get("push_type");
        if (str8 == null) {
            str8 = "";
        }
        if (StringsKt.empress(str8)) {
            str8 = "custom";
        }
        String str9 = str8;
        String str10 = remoteMessage.getData().get("push_way");
        String str11 = str10 == null ? "" : str10;
        String str12 = remoteMessage.getData().get("push_batch");
        String str13 = str12 == null ? "" : str12;
        String str14 = remoteMessage.getData().get("condition");
        String str15 = str14 == null ? "" : str14;
        String str16 = remoteMessage.getData().get("push_trace");
        String str17 = str16 == null ? "" : str16;
        String str18 = remoteMessage.getData().get("exclude_languages");
        String str19 = str18 == null ? "" : str18;
        String str20 = remoteMessage.getData().get("notification_ui_type");
        String str21 = str20 == null ? "" : str20;
        String str22 = remoteMessage.getData().get("message_id");
        if (str22 == null) {
            str22 = "";
        }
        if (StringsKt.empress(str22)) {
            String messageId = remoteMessage.getMessageId();
            str = messageId != null ? messageId : "";
        } else {
            str = str22;
        }
        return new FcmDataNotification(str2, str3, str5, str7, str9, str11, str13, str15, str17, str19, str21, str, null, 4096, null);
    }

    public final boolean formularize() {
        return trm.INSTANCE.attabal().getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED);
    }

    public final boolean impassible(String excludeLanguages) {
        Object objM3351constructorimpl;
        boolean z = false;
        if (StringsKt.empress(excludeLanguages)) {
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Object objFromJson = new Gson().fromJson(excludeLanguages, new attabal().getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            List list = (List) objFromJson;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (dovishness.stratoscope((String) it.next(), jugal.attabal.f29013attabal.beachfront(), true)) {
                        z = true;
                        break;
                    }
                }
            }
            objM3351constructorimpl = Result.m3351constructorimpl(Boolean.valueOf(z));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3356isFailureimpl(objM3351constructorimpl)) {
            objM3351constructorimpl = bool;
        }
        boolean zBooleanValue = ((Boolean) objM3351constructorimpl).booleanValue();
        if (zBooleanValue) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "展示拦截：当前系统语言在排除列表中");
        }
        return zBooleanValue;
    }

    public final boolean impromptu(Context context) {
        if (!NotifySettingHelper.f18231attabal.marial(context)) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "展示拦截：通知权限或渠道不可用");
            return false;
        }
        tau.saneness sanenessVar = tau.saneness.f38666attabal;
        if (System.currentTimeMillis() - sanenessVar.competently() <= TimeUnit.HOURS.toMillis(1L)) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "展示拦截：仍在一小时冷却期");
            return false;
        }
        if (sanenessVar.rotuma()) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "展示拦截：安装首日");
            return false;
        }
        if (formularize()) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "展示拦截：应用在前台");
            return false;
        }
        if (sanenessVar.wireman()) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "展示拦截：今天已点击过智能推送");
            return false;
        }
        if (!triweekly()) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "展示拦截：不在 08:00–23:00 时段");
            return false;
        }
        if (kowloon(context)) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "智能推送展示条件全部通过");
            return true;
        }
        com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "展示拦截：屏幕未亮起或设备已锁定");
        return false;
    }

    public final boolean kowloon(Context context) {
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        Object systemService2 = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        if (powerManager == null || !powerManager.isInteractive()) {
            return false;
        }
        return keyguardManager == null || !keyguardManager.isKeyguardLocked();
    }

    public final boolean taiyuan(RemoteMessage remoteMessage, Context context) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = remoteMessage.getData().get("action");
        if (str == null) {
            str = "";
        }
        boolean z = false;
        if (Intrinsics.wireman(str, "refresh_topic")) {
            String str2 = remoteMessage.getData().get("isForceRefreshTopic");
            if (str2 != null && dovishness.stratoscope(str2, a.g, true)) {
                z = true;
            }
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "收到 refresh_topic 控制消息：强制=" + z);
            FcmActionHelper.f18220attabal.cutely(str, z, new Function0() { // from class: com.codejoy.boom.clap.fcm.attabal
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FCMExtraActionHelper.cutely();
                }
            });
            return true;
        }
        FcmDataNotification fcmDataNotificationCompetently = competently(this, remoteMessage, false, 2, null);
        Context applicationContext = context.getApplicationContext();
        if (Intrinsics.wireman(fcmDataNotificationCompetently.getPushType(), "smart_resident")) {
            if (arytenoidectomy(remoteMessage) && !impassible(fcmDataNotificationCompetently.getExcludeLanguages())) {
                if (tau.saneness.f38666attabal.rotuma()) {
                    com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "smart_resident 展示拦截：安装首日");
                    return true;
                }
                com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "收到 smart_resident，展示常驻通知");
                cutely cutelyVar = cutely.f18235attabal;
                Intrinsics.beachfront(applicationContext);
                cutelyVar.competently(applicationContext, fcmDataNotificationCompetently);
            }
            return true;
        }
        if (fcmDataNotificationCompetently.getTitle().length() == 0 && fcmDataNotificationCompetently.getBody().length() == 0 && fcmDataNotificationCompetently.getImageUrl().length() == 0) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "data payload 没有通知内容，交给回退流程");
            return false;
        }
        com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
        String pushId = fcmDataNotificationCompetently.getPushId();
        if (StringsKt.empress(pushId)) {
            pushId = "待生成";
        }
        dernVar.saneness("SmartPush", "智能推送进入展示队列：pushId=" + ((Object) pushId) + "，pushType=" + fcmDataNotificationCompetently.getPushType() + "，pushWay=" + fcmDataNotificationCompetently.getPushWay() + "，pushBatch=" + fcmDataNotificationCompetently.getPushBatch() + "，uiType=" + fcmDataNotificationCompetently.getNotificationUiType() + "，messageId=" + fcmDataNotificationCompetently.getMessageId());
        kotlinx.coroutines.cutely.wireman(applicationScope, null, null, new FCMExtraActionHelper$handleFcmDataMsg$3(remoteMessage, fcmDataNotificationCompetently, applicationContext, null), 3, null);
        return true;
    }

    public final boolean triweekly() {
        int i = Calendar.getInstance().get(11);
        return 8 <= i && i < 23;
    }
}
