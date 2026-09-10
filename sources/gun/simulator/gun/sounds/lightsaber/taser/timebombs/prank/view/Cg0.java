package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Cg0 implements FP {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bg0 f2933a;

    public Cg0(Bg0 bg0) {
        this.f2933a = bg0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final boolean a(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final EP b(Object obj, int i, int i2, YS ys) {
        Uri uri = (Uri) obj;
        return new EP(new C3697iS(uri), this.f2933a.i(uri));
    }
}
