package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2797Ub implements InterfaceC3966lZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3826a;
    public final C2629Np b;

    public /* synthetic */ C2797Ub(C2629Np c2629Np, int i) {
        this.f3826a = i;
        this.b = c2629Np;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final InterfaceC3616hZ a(Object obj, int i, int i2, YS ys) {
        int i3 = this.f3826a;
        C2629Np c2629Np = this.b;
        switch (i3) {
            case 0:
                return c2629Np.a(new C4568sM(obj, c2629Np.d, (Object) c2629Np.c, 1), i, i2, ys, C2629Np.k);
            default:
                return c2629Np.a(new C4568sM((ParcelFileDescriptor) obj, c2629Np.d, c2629Np.c), i, i2, ys, C2629Np.k);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final boolean b(Object obj, YS ys) {
        int i = this.f3826a;
        C2629Np c2629Np = this.b;
        switch (i) {
            case 0:
                c2629Np.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
                    c2629Np.getClass();
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                        return true;
                    }
                }
                return false;
        }
    }
}
