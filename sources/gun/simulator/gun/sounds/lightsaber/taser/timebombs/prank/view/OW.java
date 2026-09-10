package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class OW implements FP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3506a;
    public final FP b;
    public final FP c;
    public final Class d;

    public OW(Context context, FP fp, FP fp2, Class cls) {
        this.f3506a = context.getApplicationContext();
        this.b = fp;
        this.c = fp2;
        this.d = cls;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC2340Cl.G((Uri) obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final EP b(Object obj, int i, int i2, YS ys) {
        Uri uri = (Uri) obj;
        return new EP(new C3697iS(uri), new NW(this.f3506a, this.b, this.c, uri, i, i2, ys, this.d));
    }
}
