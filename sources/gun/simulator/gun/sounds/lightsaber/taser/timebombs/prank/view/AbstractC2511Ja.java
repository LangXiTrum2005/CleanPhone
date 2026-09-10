package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2511Ja implements Gd0 {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gd0
    public final InterfaceC3616hZ a(C2923Yx c2923Yx, InterfaceC3616hZ interfaceC3616hZ, int i, int i2) {
        if (!Tg0.j(i, i2)) {
            throw new IllegalArgumentException(AbstractC3950lJ.q("Cannot apply transformation on width: ", i, " or height: ", i2, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        InterfaceC2459Ha interfaceC2459Ha = com.bumptech.glide.a.a(c2923Yx).f214a;
        Bitmap bitmap = (Bitmap) interfaceC3616hZ.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(interfaceC2459Ha, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? interfaceC3616hZ : C2485Ia.c(bitmapC, interfaceC2459Ha);
    }

    public abstract Bitmap c(InterfaceC2459Ha interfaceC2459Ha, Bitmap bitmap, int i, int i2);
}
