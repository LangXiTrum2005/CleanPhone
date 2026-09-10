package com.charging.screenshow.battery.animations.themes.notify;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.charging.screenshow.battery.animations.themes.MyApp;
import com.charging.screenshow.battery.animations.themes.broadcast.AlarmReceiver;
import com.charging.screenshow.battery.animations.themes.utils.async.Async;
import com.smartdigimkt.u2.m;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/notify/AlarmUtil;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AlarmUtil {
    public static void a(MyApp myApp) {
        try {
            Object systemService = myApp.getSystemService(NotificationCompat.CATEGORY_ALARM);
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            AlarmManager alarmManager = (AlarmManager) systemService;
            PendingIntent broadcast = PendingIntent.getBroadcast(myApp, 21342, new Intent(myApp, (Class<?>) AlarmReceiver.class), Build.VERSION.SDK_INT >= 31 ? 67108864 : 134217728);
            if (broadcast != null) {
                alarmManager.cancel(broadcast);
                broadcast.cancel();
            }
        } catch (Exception unused) {
        }
        Async.a().f13316b.schedule(new a(myApp, 0), m.D0, TimeUnit.MILLISECONDS);
    }
}
