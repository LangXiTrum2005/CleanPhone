package stonecrop;

import android.os.Bundle;
import com.appsflyer.AppsFlyerLib;
import com.codejoy.boom.clap.BoomClapApplication;
import com.codejoy.boom.clap.data.bean.FcmDataNotification;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: compiled from: UdCustomNotificationReport.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ=\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001b\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00162\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lstonecrop/dern;", "", "<init>", "()V", "Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;", "payload", "", "beachfront", "(Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;)V", "marial", "", "action", "", "pushId", "pushType", "title", CampaignEx.JSON_KEY_DESC, "notificationUiStyle", "dern", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "saneness", "(ILcom/codejoy/boom/clap/data/bean/FcmDataNotification;)V", "", "attabal", "(ILcom/codejoy/boom/clap/data/bean/FcmDataNotification;)Ljava/util/Map;", "eventParams", "logTag", "wireman", "(Ljava/util/Map;Ljava/lang/String;)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f38161attabal = new dern();

    public final Map<String, Object> attabal(int action, FcmDataNotification payload) {
        return seminary.formularize(formularize.attabal("action", Integer.valueOf(action)), formularize.attabal("push_id", payload.getPushId()), formularize.attabal("push_type", payload.getPushType()), formularize.attabal("push_way", payload.getPushWay()), formularize.attabal("push_batch", payload.getPushBatch()), formularize.attabal("condition", payload.getCondition()), formularize.attabal("push_trace", payload.getPushTrace()), formularize.attabal("push_title", payload.getTitle()), formularize.attabal("push_introduce", payload.getBody()), formularize.attabal("push_image", payload.getImageUrl()), formularize.attabal("notification_ui_type", payload.getNotificationUiType()), formularize.attabal("message_id", payload.getMessageId()));
    }

    public final void beachfront(FcmDataNotification payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        saneness(1, payload);
    }

    public final void dern(int action, String pushId, String pushType, String title, String desc, String notificationUiStyle) {
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        Intrinsics.checkNotNullParameter(pushType, "pushType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(notificationUiStyle, "notificationUiStyle");
        saneness(action, new FcmDataNotification(title, desc, null, pushId, pushType, null, null, null, null, null, notificationUiStyle, null, null, 7140, null));
    }

    public final void marial(FcmDataNotification payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        saneness(2, payload);
    }

    public final void saneness(int action, FcmDataNotification payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        String str = Intrinsics.wireman(payload.getPushType(), "recall_notify") ? "RecallNotify" : "SmartPush";
        Map<String, Object> mapAttabal = attabal(action, payload);
        com.codejoy.boom.clap.helper.dern.f18260attabal.saneness(str, "ud_notification 实际上报参数：" + mapAttabal);
        try {
            Result.Companion companion = Result.INSTANCE;
            Bundle bundle = new Bundle();
            for (Map.Entry<String, Object> entry : mapAttabal.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    bundle.putInt(key, ((Number) value).intValue());
                } else {
                    bundle.putString(key, value.toString());
                }
            }
            FirebaseAnalytics.getInstance(BoomClapApplication.INSTANCE.attabal()).attabal("ud_notification", bundle);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        wireman(mapAttabal, str);
    }

    public final void wireman(Map<String, ? extends Object> eventParams, String logTag) {
        try {
            Result.Companion companion = Result.INSTANCE;
            AppsFlyerLib.getInstance().logEvent(BoomClapApplication.INSTANCE.attabal(), "ud_notification", eventParams);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }
}
