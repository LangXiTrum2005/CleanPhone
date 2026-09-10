package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class Yg0 {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static Yg0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2498In f4032a;

    public Yg0(C2498In c2498In) {
        this.f4032a = c2498In;
    }

    public final boolean a(C3761j8 c3761j8) {
        if (TextUtils.isEmpty(c3761j8.c)) {
            return true;
        }
        long j = c3761j8.f + c3761j8.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f4032a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
