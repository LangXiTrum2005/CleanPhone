package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.umeng.analytics.MobclickAgent;

/* JADX INFO: loaded from: classes4.dex */
public abstract class S3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f3697a = null;
    public static boolean b = false;

    public static void a(String str) {
        Context context = f3697a;
        if (context == null || b) {
            return;
        }
        MobclickAgent.onEvent(context, str);
    }

    public static void b(String str, String str2) {
        Context context = f3697a;
        if (context == null || b) {
            return;
        }
        MobclickAgent.onEvent(context, str, str2);
    }
}
