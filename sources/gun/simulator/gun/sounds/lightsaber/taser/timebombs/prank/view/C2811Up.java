package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2811Up implements Gd0 {
    public final Gd0 b;
    public final boolean c;

    public C2811Up(Gd0 gd0, boolean z) {
        this.b = gd0;
        this.c = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gd0
    public final InterfaceC3616hZ a(C2923Yx c2923Yx, InterfaceC3616hZ interfaceC3616hZ, int i, int i2) {
        InterfaceC2459Ha interfaceC2459Ha = com.bumptech.glide.a.a(c2923Yx).f214a;
        Drawable drawable = (Drawable) interfaceC3616hZ.get();
        C2485Ia c2485IaS = AbstractC3375el.s(interfaceC2459Ha, drawable, i, i2);
        if (c2485IaS != null) {
            InterfaceC3616hZ interfaceC3616hZA = this.b.a(c2923Yx, c2485IaS, i, i2);
            if (!interfaceC3616hZA.equals(c2485IaS)) {
                return new C2485Ia(c2923Yx.getResources(), interfaceC3616hZA);
            }
            interfaceC3616hZA.recycle();
            return interfaceC3616hZ;
        }
        if (!this.c) {
            return interfaceC3616hZ;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final boolean equals(Object obj) {
        if (obj instanceof C2811Up) {
            return this.b.equals(((C2811Up) obj).b);
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final int hashCode() {
        return this.b.hashCode();
    }
}
