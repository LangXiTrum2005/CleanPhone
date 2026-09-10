package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: loaded from: classes4.dex */
public final class IL extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3213a;
    public final /* synthetic */ MainActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IL(MainActivity mainActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = mainActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new IL(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((IL) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075 A[RETURN] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        Weapon weapon;
        RL rl;
        GL gl;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3213a;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        MainActivity mainActivity = this.b;
        if (i != 0) {
            if (i == 1) {
                AbstractC3375el.b0(obj);
            } else if (i == 2) {
                AbstractC3375el.b0(obj);
                weapon = (Weapon) obj;
                if (weapon == null) {
                    super/*androidx.activity.ComponentActivity*/.onBackPressed();
                    return c5033xf0;
                }
                C2627Nn c2627Nn = AbstractC4437qp.f4904a;
                rl = TL.f3768a;
                gl = new GL(mainActivity, weapon, null);
                this.f3213a = 3;
                if (WD.X(gl, rl, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return c5033xf0;
        }
        AbstractC3375el.b0(obj);
        this.f3213a = 1;
        int i2 = MainActivity.j;
        mainActivity.getClass();
        obj = WD.X(new C4392qL(mainActivity, null), AbstractC4437qp.b, this);
        if (obj == enumC4602sk) {
            return enumC4602sk;
        }
        if (!((Boolean) obj).booleanValue()) {
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
            return c5033xf0;
        }
        ExecutorC4433qn executorC4433qn = AbstractC4437qp.b;
        HL hl = new HL(mainActivity, null);
        this.f3213a = 2;
        obj = WD.X(hl, executorC4433qn, this);
        if (obj == enumC4602sk) {
            return enumC4602sk;
        }
        weapon = (Weapon) obj;
        if (weapon == null) {
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
            return c5033xf0;
        }
        C2627Nn c2627Nn2 = AbstractC4437qp.f4904a;
        rl = TL.f3768a;
        gl = new GL(mainActivity, weapon, null);
        this.f3213a = 3;
        if (WD.X(gl, rl, this) == enumC4602sk) {
            return enumC4602sk;
        }
        return c5033xf0;
    }
}
