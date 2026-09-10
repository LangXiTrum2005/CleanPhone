package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.LD.Lxb.JVA;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ro0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f3682a = null;
    public static String b = null;
    public static boolean c = false;
    public static JVA d = null;
    public static int e = 1;

    public static JVA a() {
        if (d == null) {
            JVA.Lxb lxb = new JVA.Lxb("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            d = lxb.Lxb(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit).LD(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit).lk(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit).Lxb();
        }
        return d;
    }
}
