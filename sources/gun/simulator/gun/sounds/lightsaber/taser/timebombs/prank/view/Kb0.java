package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.efs.sdk.base.Constants;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class Kb0 {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final KC e = KC.i(2, "auto", Constants.CP_NONE);
    public static final KC f = KC.i(3, "dot", "sesame", "circle");
    public static final KC g = KC.i(2, "filled", C4304pL.OPEN);
    public static final KC h = KC.i(3, "after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3319a;
    public final int b;
    public final int c;

    public Kb0(int i, int i2, int i3) {
        this.f3319a = i;
        this.b = i2;
        this.c = i3;
    }
}
