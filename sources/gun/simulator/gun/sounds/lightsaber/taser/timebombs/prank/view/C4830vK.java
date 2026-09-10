package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4830vK extends C4654tK {
    public final /* synthetic */ int d = 0;
    public Object e;

    public C4830vK(long j) {
        super(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4654tK
    public final int b(Object obj) {
        switch (this.d) {
            case 0:
                InterfaceC3616hZ interfaceC3616hZ = (InterfaceC3616hZ) obj;
                if (interfaceC3616hZ == null) {
                    return 1;
                }
                return interfaceC3616hZ.a();
            default:
                return 1;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4654tK
    public final void c(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                InterfaceC3616hZ interfaceC3616hZ = (InterfaceC3616hZ) obj2;
                VO vo = (VO) this.e;
                if (vo == null || interfaceC3616hZ == null) {
                    return;
                }
                ((C4439qr) vo).e.e(interfaceC3616hZ, true);
                return;
            default:
                DP dp = (DP) obj;
                dp.getClass();
                ArrayDeque arrayDeque = DP.d;
                synchronized (arrayDeque) {
                    arrayDeque.offer(dp);
                    break;
                }
                return;
        }
    }

    public final void f(int i) {
        long j;
        if (i >= 40) {
            e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (this) {
                j = this.b;
            }
            e(j / 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4830vK(NN nn) {
        super(500L);
        this.e = nn;
    }
}
