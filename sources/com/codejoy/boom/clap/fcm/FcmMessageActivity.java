package com.codejoy.boom.clap.fcm;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.codejoy.boom.clap.MainActivity;
import com.codejoy.boom.clap.data.bean.FcmDataNotification;
import com.codejoy.boom.clap.module.splash.SplashActivity;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FcmMessageActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/codejoy/boom/clap/fcm/FcmMessageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FcmMessageActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.p000activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        String pushId;
        super.onCreate(savedInstanceState);
        getIntent().getStringExtra("key_notify_from_source");
        FcmDataNotification.Companion companion = FcmDataNotification.INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        FcmDataNotification fcmDataNotificationAttabal = companion.attabal(intent);
        if (fcmDataNotificationAttabal == null || (pushId = fcmDataNotificationAttabal.getPushId()) == null || pushId.length() <= 0) {
            String stringExtra = getIntent().getStringExtra("key_notify_push_id");
            String str = stringExtra == null ? "" : stringExtra;
            String stringExtra2 = getIntent().getStringExtra("key_notify_push_type");
            String str2 = stringExtra2 == null ? "" : stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("key_notify_title");
            String str3 = stringExtra3 == null ? "" : stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("key_notify_body");
            String str4 = stringExtra4 == null ? "" : stringExtra4;
            if (str.length() > 0) {
                stonecrop.dern.f38161attabal.dern(2, str, str2, str3, str4, "");
            }
        } else {
            if (!Intrinsics.wireman(fcmDataNotificationAttabal.getPushType(), "resident") && !Intrinsics.wireman(fcmDataNotificationAttabal.getPushType(), "smart_resident")) {
                tau.saneness.f38666attabal.hydrovane(true);
            }
            stonecrop.dern.f38161attabal.marial(fcmDataNotificationAttabal);
        }
        if (MainActivity.INSTANCE.dern()) {
            Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
            intent2.putExtras(getIntent());
            intent2.putExtra("key_from_notify", true);
            startActivity(intent2);
        } else {
            Intent intent3 = new Intent(this, (Class<?>) SplashActivity.class);
            intent3.putExtras(getIntent());
            intent3.putExtra("key_from_notify", true);
            startActivity(intent3);
        }
        finish();
    }
}
