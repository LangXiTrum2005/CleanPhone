package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import android.os.Vibrator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4453r20 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4629t20 f4913a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4453r20(C4629t20 c4629t20, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4913a = c4629t20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4453r20(this.f4913a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C4453r20 c4453r20 = (C4453r20) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c4453r20.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        C4629t20 c4629t20 = this.f4913a;
        Vibrator vibratorE = c4629t20.e();
        if (vibratorE != null) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibratorE.vibrate(((C3894kh0) c4629t20.Q.getValue()).f4608a);
                } else {
                    vibratorE.vibrate(40L);
                }
            } catch (Throwable th) {
                AbstractC3375el.v(th);
            }
        }
        return C5033xf0.f5238a;
    }
}
