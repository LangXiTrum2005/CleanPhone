package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.AssetManager;
import android.net.Uri;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4812v6 implements FP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f5118a;
    public final InterfaceC4724u6 b;

    public C4812v6(AssetManager assetManager, InterfaceC4724u6 interfaceC4724u6) {
        this.f5118a = assetManager;
        this.b = interfaceC4724u6;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final EP b(Object obj, int i, int i2, YS ys) {
        Uri uri = (Uri) obj;
        return new EP(new C3697iS(uri), this.b.s(this.f5118a, uri.toString().substring(22)));
    }
}
