package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3225d3 implements BS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4256a;
    public final /* synthetic */ J5 b;
    public final /* synthetic */ BS c;
    public final /* synthetic */ C3927l3 d;

    public C3225d3(C3927l3 c3927l3, int i, J5 j5, BS bs) {
        this.d = c3927l3;
        this.f4256a = i;
        this.b = j5;
        this.c = bs;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void d(A70 a70) {
        BS bs = this.c;
        if (bs != null) {
            bs.d(a70);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void e(InterfaceC3240dB interfaceC3240dB) {
        InterfaceC3592hB interfaceC3592hB = (InterfaceC3592hB) interfaceC3240dB;
        C3927l3 c3927l3 = this.d;
        c3927l3.getClass();
        X0 x0 = X0.j;
        if (x0.r().p != null && c3927l3.o != null && c3927l3.x) {
            C3751j3 c3751j3 = x0.r().p;
            Activity activity = (Activity) c3927l3.o.get();
            c3751j3.getClass();
            if (!activity.isDestroyed() && !activity.isFinishing()) {
                C3927l3 c3927l4 = (C3927l3) c3751j3.b;
                c3927l4.getClass();
                if (x0.r().k != -1) {
                    DialogC3665i3 dialogC3665i3 = new DialogC3665i3(c3751j3, (Context) c3927l4.o.get(), x0.r().l, 1);
                    c3927l4.w = dialogC3665i3;
                    dialogC3665i3.setOnShowListener(new DialogInterfaceOnShowListenerC3577h3(c3751j3, 0));
                    c3927l4.w.show();
                }
            }
        }
        BS bs = this.c;
        if (bs != null) {
            bs.e(interfaceC3592hB);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void h(boolean z) {
        C3927l3 c3927l3 = this.d;
        c3927l3.getClass();
        X0 x0 = X0.j;
        if (x0.r().p != null && c3927l3.o != null && c3927l3.x) {
            try {
                C3751j3 c3751j3 = x0.r().p;
                c3751j3.a();
                C3751j3 c3751j4 = x0.r().p;
                c3751j4.b();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        c3927l3.x = false;
        int i = this.f4256a;
        BS bs = this.c;
        if (i == 2) {
            J5 j5 = this.b;
            if (j5.g != null && z) {
                C4981x20.u().v(j5.h, new RunnableC3161cL(this, j5, bs, z));
                return;
            }
        }
        c3927l3.n = false;
        if (bs != null) {
            bs.h(z);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdClicked() {
        X0 x0 = X0.j;
        Context contextJ = x0.j();
        J5 j5 = this.b;
        this.d.n(contextJ, (C3491g4) j5.f3354a, (String) j5.b);
        BS bs = this.c;
        if (bs != null) {
            bs.onAdClicked();
        }
        AbstractC3570h.x();
        x0.k();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdClosed() {
        BS bs = this.c;
        if (bs != null) {
            bs.onAdClosed();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdImpression() {
        BS bs = this.c;
        if (bs != null) {
            bs.onAdImpression();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdShowed() {
        C3927l3 c3927l3 = this.d;
        c3927l3.n = true;
        Context contextJ = X0.j.j();
        J5 j5 = this.b;
        c3927l3.E(contextJ, (C3491g4) j5.f3354a, (String) j5.b);
        BS bs = this.c;
        if (bs != null) {
            bs.onAdShowed();
        }
    }
}
