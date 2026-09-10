package com.codejoy.boom.clap.fcm.recall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.codejoy.boom.clap.helper.dern;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import stonecrop.saneness;

/* JADX INFO: compiled from: NotificationRecallActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/codejoy/boom/clap/fcm/recall/NotificationRecallReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationRecallReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int f18241saneness = 8;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (Intrinsics.wireman(intent != null ? intent.getAction() : null, "action_notification_recall_dismiss")) {
            String stringExtra = intent.getStringExtra("extra_recall_entrance");
            dern.f18260attabal.saneness("RecallNotify", "用户划掉召回通知：entrance=" + (stringExtra == null ? "" : stringExtra));
            saneness.f38162attabal.attabal("21c_recall_close_notify", stringExtra);
        }
    }
}
