package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2660Ou extends AbstractC2511Ja {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC4650tG.f5028a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2511Ja
    public final Bitmap c(InterfaceC2459Ha interfaceC2459Ha, Bitmap bitmap, int i, int i2) {
        return Id0.b(interfaceC2459Ha, bitmap, i, i2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final boolean equals(Object obj) {
        return obj instanceof C2660Ou;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final int hashCode() {
        return 1572326941;
    }
}
