package l;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.charging.screenshow.battery.animations.themes.MyApp;
import com.charging.screenshow.battery.animations.themes.notify.FeatureNotifySender;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferencesUtil;
import com.charging.screenshow.battery.animations.themes.utils.async.Async;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ MyApp f45124Y;

    public /* synthetic */ a(MyApp myApp, int i2) {
        this.X = i2;
        this.f45124Y = myApp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                Async.a().f13317c.post(new a(this.f45124Y, 1));
                break;
            case 1:
                MyApp myApp = this.f45124Y;
                try {
                    PendingIntent broadcast = PendingIntent.getBroadcast(myApp, 21342, new Intent("com.anime4k.live.wallpaper.broadcast"), Build.VERSION.SDK_INT >= 31 ? 67108864 : 134217728);
                    Object systemService = myApp.getSystemService(NotificationCompat.CATEGORY_ALARM);
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
                    ((AlarmManager) systemService).setAndAllowWhileIdle(0, System.currentTimeMillis() + ((long) 600000), broadcast);
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    FeatureNotifySender.a(this.f45124Y);
                    AppPreferencesUtil.d(AppPreferencesUtil.f13313a, AppExt.a()).putLong("last_show_notify", System.currentTimeMillis()).apply();
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
