package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.SoundPool;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2900Ya extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3355eb f4023a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2900Ya(C3355eb c3355eb, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4023a = c3355eb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2900Ya(this.f4023a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C2900Ya c2900Ya = (C2900Ya) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c2900Ya.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        Integer num;
        AbstractC3375el.b0(obj);
        C3355eb c3355eb = this.f4023a;
        SoundPool soundPoolC = c3355eb.c();
        if (soundPoolC != null) {
            Integer num2 = c3355eb.t;
            AbstractC2995aW.n(num2);
            num = new Integer(soundPoolC.play(num2.intValue(), 1.0f, 1.0f, 1, 0, 1.0f));
        } else {
            num = null;
        }
        c3355eb.u = num;
        return C5033xf0.f5238a;
    }
}
