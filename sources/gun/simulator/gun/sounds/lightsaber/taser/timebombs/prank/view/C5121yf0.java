package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5121yf0 implements InterfaceC3616hZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5289a;
    public final Object b;

    public /* synthetic */ C5121yf0(Object obj, int i) {
        this.f5289a = i;
        this.b = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final int a() {
        int i = this.f5289a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Tg0.c((Bitmap) obj);
            case 1:
                return ((byte[]) obj).length;
            case 2:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) obj;
                return Tg0.d(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
            default:
                return 1;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final Class b() {
        switch (this.f5289a) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return this.b.getClass();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final Object get() {
        int i = this.f5289a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (Bitmap) obj;
            case 1:
                return (byte[]) obj;
            case 2:
                return (AnimatedImageDrawable) obj;
            default:
                return obj;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final void recycle() {
        switch (this.f5289a) {
            case 2:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.b;
                animatedImageDrawable.stop();
                animatedImageDrawable.clearAnimationCallbacks();
                break;
        }
    }

    public C5121yf0(byte[] bArr) {
        this.f5289a = 1;
        AbstractC2871Wx.V(bArr, "Argument must not be null");
        this.b = bArr;
    }

    public C5121yf0(File file) {
        this.f5289a = 3;
        AbstractC2871Wx.V(file, "Argument must not be null");
        this.b = file;
    }
}
