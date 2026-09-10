package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class Ck0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2938a;

    public Ck0(MainActivity mainActivity) {
        AbstractC2995aW.q(mainActivity, com.umeng.analytics.pro.f.X);
        Resources resources = mainActivity.getResources();
        String packageName = mainActivity.getPackageName();
        Object systemService = mainActivity.getSystemService("notification");
        AbstractC2995aW.o(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            fp0.f();
            NotificationChannel notificationChannelC = TR.c(packageName, resources.getString(R.string.app_name));
            notificationChannelC.enableVibration(false);
            notificationManager.createNotificationChannel(notificationChannelC);
        }
        int i2 = i >= 31 ? 201326592 : 134217728;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(mainActivity, packageName);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentTitle(resources.getString(R.string.new_weapon_unlocked));
        builder.setContentText(resources.getString(R.string.Claim_your_reward));
        builder.setShowWhen(true);
        builder.setOnlyAlertOnce(false);
        builder.setPriority(-1);
        builder.setChannelId(packageName);
        builder.setVisibility(1);
        builder.setColorized(true);
        builder.setContentIntent(PendingIntent.getActivity(mainActivity, 0, new Intent(mainActivity, (Class<?>) MainActivity.class), i2));
    }
}
