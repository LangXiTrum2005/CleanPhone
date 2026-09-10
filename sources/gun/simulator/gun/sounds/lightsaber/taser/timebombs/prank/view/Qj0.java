package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutWeaponActivityActionBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class Qj0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3620a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3109bk0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qj0(C3109bk0 c3109bk0, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = c3109bk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        Qj0 qj0 = new Qj0(this.c, interfaceC2857Wj);
        qj0.b = obj;
        return qj0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Qj0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3620a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            Pj0 pj0 = new Pj0(2, null);
            this.f3620a = 1;
            obj = WD.X(pj0, AbstractC4437qp.b, this);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C3109bk0 c3109bk0 = this.c;
        if (zBooleanValue) {
            ((LayoutWeaponActivityActionBinding) c3109bk0.b).ivColorPicker.setVisibility(8);
            ((LayoutWeaponActivityActionBinding) c3109bk0.b).cvColorChoose.setVisibility(0);
        } else {
            ((LayoutWeaponActivityActionBinding) c3109bk0.b).ivColorPicker.setVisibility(0);
            ((LayoutWeaponActivityActionBinding) c3109bk0.b).cvColorChoose.setVisibility(8);
        }
        ((LayoutWeaponActivityActionBinding) c3109bk0.b).ivGunEffect.setVisibility(0);
        ((LayoutWeaponActivityActionBinding) c3109bk0.b).ivGunEffect.setImageResource(R.drawable.icon_lightsaber_effect);
        ((LayoutWeaponActivityActionBinding) c3109bk0.b).ivShake.setVisibility(0);
        return C5033xf0.f5238a;
    }
}
