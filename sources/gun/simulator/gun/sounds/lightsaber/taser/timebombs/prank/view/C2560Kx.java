package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.security.MessageDigest;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2560Kx implements Gd0 {
    public final Gd0 b;

    public C2560Kx(Gd0 gd0) {
        AbstractC2871Wx.V(gd0, "Argument must not be null");
        this.b = gd0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gd0
    public final InterfaceC3616hZ a(C2923Yx c2923Yx, InterfaceC3616hZ interfaceC3616hZ, int i, int i2) {
        GifDrawable gifDrawable = (GifDrawable) interfaceC3616hZ.get();
        InterfaceC3616hZ c2485Ia = new C2485Ia(gifDrawable.f218a.f3291a.l, com.bumptech.glide.a.a(c2923Yx).f214a);
        Gd0 gd0 = this.b;
        InterfaceC3616hZ interfaceC3616hZA = gd0.a(c2923Yx, c2485Ia, i, i2);
        if (!c2485Ia.equals(interfaceC3616hZA)) {
            c2485Ia.recycle();
        }
        gifDrawable.f218a.f3291a.c(gd0, (Bitmap) interfaceC3616hZA.get());
        return interfaceC3616hZ;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final boolean equals(Object obj) {
        if (obj instanceof C2560Kx) {
            return this.b.equals(((C2560Kx) obj).b);
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final int hashCode() {
        return this.b.hashCode();
    }
}
