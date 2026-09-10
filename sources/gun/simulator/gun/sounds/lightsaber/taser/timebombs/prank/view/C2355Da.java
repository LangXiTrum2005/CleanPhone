package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2355Da implements InterfaceC3966lZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2974a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C2355Da(int i, Object obj, Object obj2) {
        this.f2974a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final InterfaceC3616hZ a(Object obj, int i, int i2, YS ys) {
        VX vx;
        boolean z;
        C3737is c3737is;
        switch (this.f2974a) {
            case 0:
                InterfaceC3616hZ interfaceC3616hZA = ((InterfaceC3966lZ) this.b).a(obj, i, i2, ys);
                Resources resources = (Resources) this.c;
                if (interfaceC3616hZA == null) {
                    return null;
                }
                return new C2485Ia(resources, interfaceC3616hZA);
            case 1:
                InterfaceC3616hZ interfaceC3616hZC = ((C4142nZ) this.b).c((Uri) obj, ys);
                if (interfaceC3616hZC == null) {
                    return null;
                }
                return AbstractC3375el.s((InterfaceC2459Ha) this.c, (Drawable) ((AbstractC2759Sp) interfaceC3616hZC).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof VX) {
                    vx = (VX) inputStream;
                    z = false;
                } else {
                    vx = new VX(inputStream, (C4391qK) this.c);
                    z = true;
                }
                ArrayDeque arrayDeque = C3737is.c;
                synchronized (arrayDeque) {
                    c3737is = (C3737is) arrayDeque.poll();
                    break;
                }
                if (c3737is == null) {
                    c3737is = new C3737is();
                }
                c3737is.f4525a = vx;
                C4305pM c4305pM = new C4305pM(c3737is);
                C3692iN c3692iN = new C3692iN(12, vx, c3737is);
                try {
                    C2629Np c2629Np = (C2629Np) this.b;
                    return c2629Np.a(new C4568sM(c2629Np.c, c4305pM, c2629Np.d), i, i2, ys, c3692iN);
                } finally {
                    c3737is.release();
                    if (z) {
                        vx.release();
                    }
                }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3966lZ
    public final boolean b(Object obj, YS ys) {
        int i = this.f2974a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((InterfaceC3966lZ) obj2).b(obj, ys);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((C2629Np) obj2).getClass();
                return true;
        }
    }

    public C2355Da(Resources resources, InterfaceC3966lZ interfaceC3966lZ) {
        this.f2974a = 0;
        this.c = resources;
        this.b = interfaceC3966lZ;
    }
}
