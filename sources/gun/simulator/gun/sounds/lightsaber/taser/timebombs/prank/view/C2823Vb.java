package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2823Vb implements InterfaceC3966lZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3877a;
    public final C2407Fa b;

    public C2823Vb(int i) {
        this.f3877a = i;
        if (i != 1) {
            this.b = new C2407Fa();
        } else {
            this.b = new C2407Fa();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final InterfaceC3616hZ a(Object obj, int i, int i2, YS ys) {
        int i3 = this.f3877a;
        C2407Fa c2407Fa = this.b;
        switch (i3) {
            case 0:
                return c2407Fa.c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, ys);
            default:
                return c2407Fa.c(ImageDecoder.createSource(AbstractC3092bc.b((InputStream) obj)), i, i2, ys);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final /* bridge */ /* synthetic */ boolean b(Object obj, YS ys) {
        switch (this.f3877a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
