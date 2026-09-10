package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2407Fa implements InterfaceC3966lZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3071a;
    public final InterfaceC2459Ha b;

    public C2407Fa() {
        this.f3071a = 0;
        this.b = new G7();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final InterfaceC3616hZ a(Object obj, int i, int i2, YS ys) {
        switch (this.f3071a) {
            case 0:
                return c(AbstractC4107n5.h(obj), i, i2, ys);
            default:
                return C2485Ia.c(((C3940l90) ((InterfaceC2508Ix) obj)).b(), this.b);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final /* bridge */ /* synthetic */ boolean b(Object obj, YS ys) {
        switch (this.f3071a) {
            case 0:
                AbstractC4107n5.y(obj);
                break;
            default:
                break;
        }
        return true;
    }

    public final C2485Ia c(ImageDecoder.Source source, int i, int i2, YS ys) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C2394En(i, i2, ys));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new C2485Ia(bitmapDecodeBitmap, this.b);
    }

    public C2407Fa(InterfaceC2459Ha interfaceC2459Ha) {
        this.f3071a = 1;
        this.b = interfaceC2459Ha;
    }
}
