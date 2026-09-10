package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.SoundPool;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3267db extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3355eb f4275a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3267db(C3355eb c3355eb, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4275a = c3355eb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3267db(this.f4275a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C3267db c3267db = (C3267db) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c3267db.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        C3355eb c3355eb = this.f4275a;
        Integer num = c3355eb.u;
        if (num != null) {
            int iIntValue = num.intValue();
            SoundPool soundPoolC = c3355eb.c();
            if (soundPoolC != null) {
                soundPoolC.stop(iIntValue);
            }
            c3355eb.u = null;
        }
        return C5033xf0.f5238a;
    }
}
