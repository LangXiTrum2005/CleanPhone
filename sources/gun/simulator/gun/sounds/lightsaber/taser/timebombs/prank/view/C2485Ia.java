package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2485Ia implements InterfaceC3616hZ, InterfaceC3506gD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3223a = 1;
    public final Object b;
    public final Object c;

    public C2485Ia(Bitmap bitmap, InterfaceC2459Ha interfaceC2459Ha) {
        AbstractC2871Wx.V(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        AbstractC2871Wx.V(interfaceC2459Ha, "BitmapPool must not be null");
        this.c = interfaceC2459Ha;
    }

    public static C2485Ia c(Bitmap bitmap, InterfaceC2459Ha interfaceC2459Ha) {
        if (bitmap == null) {
            return null;
        }
        return new C2485Ia(bitmap, interfaceC2459Ha);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final int a() {
        switch (this.f3223a) {
            case 0:
                return Tg0.c((Bitmap) this.b);
            default:
                return ((InterfaceC3616hZ) this.c).a();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final Class b() {
        switch (this.f3223a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final Object get() {
        int i = this.f3223a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (Bitmap) obj;
            default:
                return new BitmapDrawable((Resources) obj, (Bitmap) ((InterfaceC3616hZ) this.c).get());
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3506gD
    public final void initialize() {
        switch (this.f3223a) {
            case 0:
                ((Bitmap) this.b).prepareToDraw();
                break;
            default:
                InterfaceC3616hZ interfaceC3616hZ = (InterfaceC3616hZ) this.c;
                if (interfaceC3616hZ instanceof InterfaceC3506gD) {
                    ((InterfaceC3506gD) interfaceC3616hZ).initialize();
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final void recycle() {
        int i = this.f3223a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((InterfaceC2459Ha) obj).a((Bitmap) this.b);
                break;
            default:
                ((InterfaceC3616hZ) obj).recycle();
                break;
        }
    }

    public C2485Ia(Resources resources, InterfaceC3616hZ interfaceC3616hZ) {
        AbstractC2871Wx.V(resources, "Argument must not be null");
        this.b = resources;
        AbstractC2871Wx.V(interfaceC3616hZ, "Argument must not be null");
        this.c = interfaceC3616hZ;
    }
}
