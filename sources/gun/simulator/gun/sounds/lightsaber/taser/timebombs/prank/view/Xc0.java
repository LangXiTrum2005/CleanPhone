package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class Xc0 {
    public static WeakReference d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3980a;
    public C4813v60 b;
    public final Executor c;

    public Xc0(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
        this.c = scheduledExecutorService;
        this.f3980a = sharedPreferences;
    }

    public final synchronized Vc0 a() {
        Vc0 vc0;
        String strE = this.b.e();
        Pattern pattern = Vc0.d;
        vc0 = null;
        if (!TextUtils.isEmpty(strE)) {
            String[] strArrSplit = strE.split("!", -1);
            if (strArrSplit.length == 2) {
                vc0 = new Vc0(strArrSplit[0], strArrSplit[1]);
            }
        }
        return vc0;
    }

    public final synchronized void b() {
        this.b = C4813v60.b(this.f3980a, this.c);
    }

    public final synchronized void c(Vc0 vc0) {
        this.b.g(vc0.c);
    }
}
