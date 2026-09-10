package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.SoundPool;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.c70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3145c70 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SoundPool f4206a;
    public int b;
    public final /* synthetic */ EnumC3410f70 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3145c70(EnumC3410f70 enumC3410f70, int i, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = enumC3410f70;
        this.d = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3145c70(this.c, this.d, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3145c70) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        SoundPool soundPool;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.b;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            SoundPool soundPool2 = (SoundPool) C3498g70.f4404a.getValue();
            this.f4206a = soundPool2;
            this.b = 1;
            EnumC3410f70 enumC3410f70 = this.c;
            enumC3410f70.getClass();
            Object objX = WD.X(new C2968a70(enumC3410f70, null), AbstractC4437qp.b, this);
            if (objX == enumC4602sk) {
                return enumC4602sk;
            }
            soundPool = soundPool2;
            obj = objX;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            soundPool = this.f4206a;
            AbstractC3375el.b0(obj);
        }
        return new Integer(soundPool.play(((Number) obj).intValue(), 1.0f, 1.0f, 1, this.d, 1.0f));
    }
}
