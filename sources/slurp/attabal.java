package slurp;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.service.notification.StatusBarNotification;
import androidx.p001lifecycle.Lifecycle;
import androidx.p001lifecycle.trm;
import com.codejoy.boom.clap.fcm.NotifySettingHelper;
import com.codejoy.boom.clap.fcm.recall.NotificationRecallActivity;
import com.codejoy.boom.clap.fcm.recall.NotificationRecallReceiver;
import com.codejoy.boom.clap.helper.dern;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import tau.saneness;

/* JADX INFO: compiled from: RecallNotifyHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lslurp/attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "entrance", "", "dern", "(Landroid/content/Context;Ljava/lang/String;)V", "attabal", "(Landroid/content/Context;)V", "", "saneness", "()Z", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f37635attabal = new attabal();

    public final void attabal(Context context) {
        StatusBarNotification[] activeNotifications;
        Intrinsics.checkNotNullParameter(context, "context");
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        boolean z = false;
        if (notificationManager != null && (activeNotifications = notificationManager.getActiveNotifications()) != null) {
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification.getId() == 8194) {
                    z = true;
                    break;
                }
            }
        }
        if (notificationManager != null) {
            notificationManager.cancel(8194);
        }
        if (z) {
            dern.f18260attabal.saneness("RecallNotify", "应用回到前台，已清理召回通知");
        }
    }

    public final void dern(Context context, String entrance) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entrance, "entrance");
        NotifySettingHelper notifySettingHelper = NotifySettingHelper.f18231attabal;
        if (!notifySettingHelper.marial(context)) {
            dern.f18260attabal.saneness("RecallNotify", "召回拦截：通知权限或渠道不可用");
            return;
        }
        if (saneness()) {
            dern.f18260attabal.saneness("RecallNotify", "召回拦截：应用已回到前台");
            return;
        }
        saneness sanenessVar = saneness.f38666attabal;
        if (!sanenessVar.formularize()) {
            dern.f18260attabal.saneness("RecallNotify", "召回拦截：本次安装已展示过");
            return;
        }
        dern dernVar = dern.f18260attabal;
        dernVar.saneness("RecallNotify", "召回展示条件通过：entrance=" + entrance);
        Intent intent = new Intent(context, (Class<?>) NotificationRecallReceiver.class);
        intent.setAction("action_notification_recall_dismiss");
        intent.putExtra("extra_recall_entrance", entrance);
        Unit unit = Unit.f29295attabal;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 8194, intent, 201326592);
        Intent intent2 = new Intent(context, (Class<?>) NotificationRecallActivity.class);
        intent2.putExtra("extra_recall_entrance", entrance);
        if (!notifySettingHelper.polloi(context, intent2, 8194, broadcast)) {
            dernVar.saneness("RecallNotify", "召回通知展示失败，一次性状态保留");
            return;
        }
        stonecrop.saneness.f38162attabal.attabal("21a_recall_show_notify", entrance);
        sanenessVar.walach(false);
        dernVar.saneness("RecallNotify", "召回通知展示成功，一次性状态已消费");
    }

    public final boolean saneness() {
        return trm.INSTANCE.attabal().getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED);
    }
}
