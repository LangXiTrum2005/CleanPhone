package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Dg0 implements FP {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(ProxyConfig.MATCH_HTTP, "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FP f2981a;

    public Dg0(FP fp) {
        this.f2981a = fp;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final boolean a(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final EP b(Object obj, int i, int i2, YS ys) {
        return this.f2981a.b(new C3742iy(((Uri) obj).toString()), i, i2, ys);
    }
}
