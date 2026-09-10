package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.LightSaber;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.MechanicalGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Taser;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TechnologyGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TimeBomb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3814jl0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4568a;
    public final /* synthetic */ WeaponUseActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3814jl0(WeaponUseActivity weaponUseActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = weaponUseActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3814jl0(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3814jl0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x016f A[RETURN] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C4839vT c4839vT;
        RL rl;
        C3727il0 c3727il0;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4568a;
        WeaponUseActivity weaponUseActivity = this.b;
        if (i != 0) {
            if (i == 1) {
                AbstractC3375el.b0(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        Weapon weaponN = weaponUseActivity.n();
        if (weaponN instanceof MechanicalGun) {
            List listK = AbstractC2340Cl.K(new Integer(R.string.weapon_name_m2_flamethrower), new Integer(R.string.weapon_name_rpg_7), new Integer(R.string.weapon_name_m84));
            Weapon weaponN2 = weaponUseActivity.n();
            if (!AbstractC2853Wf.d0(listK, weaponN2 != null ? new Integer(weaponN2.getNameId()) : null)) {
                AbstractC4340pk0 abstractC4340pk0 = weaponUseActivity.d;
                AbstractC2995aW.o(abstractC4340pk0, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.GunFireHelper");
                ((C2612My) abstractC4340pk0).A = ((Boolean) ((C2856Wi) AbstractC3194cj.S.getValue()).a()).booleanValue();
            }
            c4839vT = new C4839vT(AbstractC3197ck0.l.get(0), ((C2856Wi) AbstractC3194cj.c.getValue()).a());
        } else if (weaponN instanceof LightSaber) {
            AbstractC4340pk0 abstractC4340pk1 = weaponUseActivity.d;
            AbstractC2995aW.o(abstractC4340pk1, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.LightSaberFireHelper");
            ((C4213oI) abstractC4340pk1).Y = ((Boolean) ((C2856Wi) AbstractC3194cj.T.getValue()).a()).booleanValue();
            c4839vT = new C4839vT(AbstractC3197ck0.l.get(1), ((C2856Wi) AbstractC3194cj.d.getValue()).a());
        } else if (weaponN instanceof Taser) {
            c4839vT = new C4839vT(AbstractC3197ck0.l.get(2), ((C2856Wi) AbstractC3194cj.e.getValue()).a());
        } else if (weaponN instanceof TimeBomb) {
            C2627Nn c2627Nn = AbstractC4437qp.f4904a;
            RL rl2 = TL.f3768a;
            C3640hl0 c3640hl0 = new C3640hl0(weaponUseActivity, null);
            this.f4568a = 1;
            if (WD.X(c3640hl0, rl2, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            c4839vT = weaponN instanceof TechnologyGun ? new C4839vT(AbstractC3197ck0.l.get(4), ((C2856Wi) AbstractC3194cj.f.getValue()).a()) : new C4839vT(AbstractC3197ck0.l.get(0), new Integer(0));
        }
        Integer num = (Integer) c4839vT.f5132a;
        int iIntValue = ((Number) c4839vT.b).intValue();
        C2627Nn c2627Nn2 = AbstractC4437qp.f4904a;
        rl = TL.f3768a;
        c3727il0 = new C3727il0(num, iIntValue, weaponUseActivity, null);
        this.f4568a = 2;
        if (WD.X(c3727il0, rl, this) == enumC4602sk) {
            return enumC4602sk;
        }
        return C5033xf0.f5238a;
        c4839vT = new C4839vT(AbstractC3197ck0.l.get(3), ((C2856Wi) AbstractC3194cj.g.getValue()).a());
        Integer num2 = (Integer) c4839vT.f5132a;
        int iIntValue2 = ((Number) c4839vT.b).intValue();
        C2627Nn c2627Nn3 = AbstractC4437qp.f4904a;
        rl = TL.f3768a;
        c3727il0 = new C3727il0(num2, iIntValue2, weaponUseActivity, null);
        this.f4568a = 2;
        if (WD.X(c3727il0, rl, this) == enumC4602sk) {
            return enumC4602sk;
        }
        return C5033xf0.f5238a;
    }
}
