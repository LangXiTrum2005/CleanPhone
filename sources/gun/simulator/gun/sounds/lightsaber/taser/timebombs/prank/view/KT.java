package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class KT extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3315a;
    public final int b;

    public KT(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.f3315a = z;
        this.b = i;
    }

    public static KT a(String str, Exception exc) {
        return new KT(str, exc, true, 1);
    }

    public static KT b(String str, Exception exc) {
        return new KT(str, exc, true, 4);
    }

    public static KT c(String str) {
        return new KT(str, null, false, 1);
    }
}
