package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import android.os.Vibrator;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4164nk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4340pk0 f4757a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4164nk0(AbstractC4340pk0 abstractC4340pk0, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4757a = abstractC4340pk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4164nk0(this.f4757a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C4164nk0 c4164nk0 = (C4164nk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c4164nk0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029 A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x0029, B:15:0x0035), top: B:21:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x0029, B:15:0x0035), top: B:21:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC4340pk0 abstractC4340pk0;
        Vibrator vibratorD;
        AbstractC3375el.b0(obj);
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            C2498In c2498In = App.n;
            if (C2498In.i().checkSelfPermission("android.permission.VIBRATE") == 0) {
                abstractC4340pk0 = this.f4757a;
                if (abstractC4340pk0.b.getSwitchHaptic() && (vibratorD = abstractC4340pk0.d()) != null) {
                    try {
                        if (i >= 26) {
                            vibratorD.vibrate(abstractC4340pk0.e().f4608a);
                        } else {
                            vibratorD.vibrate(40L);
                        }
                    } catch (Throwable th) {
                        AbstractC3375el.v(th);
                    }
                }
            }
        } else {
            abstractC4340pk0 = this.f4757a;
            if (abstractC4340pk0.b.getSwitchHaptic()) {
                if (i >= 26) {
                    vibratorD.vibrate(abstractC4340pk0.e().f4608a);
                } else {
                    vibratorD.vibrate(40L);
                }
            }
        }
        return C5033xf0.f5238a;
    }
}
