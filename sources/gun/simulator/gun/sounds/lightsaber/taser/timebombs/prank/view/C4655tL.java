package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.SharedPreferences;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4655tL extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Weapon f5031a;
    public int b;
    public final /* synthetic */ SharedPreferences c;
    public final /* synthetic */ MainActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4655tL(SharedPreferences sharedPreferences, MainActivity mainActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = sharedPreferences;
        this.d = mainActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4655tL(this.c, this.d, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4655tL) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a6 A[RETURN] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Weapon weapon;
        RL rl;
        C4567sL c4567sL;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.b;
        SharedPreferences sharedPreferences = this.c;
        boolean z = true;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            if (sharedPreferences.contains("FIRST_OPEN_TIME")) {
                long j = sharedPreferences.getLong("FIRST_OPEN_TIME", 0L);
                if (j != 0 && System.currentTimeMillis() - j > 172800000) {
                    ArrayList arrayListA = AbstractC3862kJ.a();
                    if (!arrayListA.isEmpty()) {
                        Iterator it = arrayListA.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((Weapon) next) == null);
                        weapon = (Weapon) next;
                        if (weapon == null) {
                            return Boolean.FALSE;
                        }
                        this.f5031a = weapon;
                        this.b = 1;
                        AbstractC3862kJ.b(weapon);
                        if (C5033xf0.f5238a == enumC4602sk) {
                            return enumC4602sk;
                        }
                        sharedPreferences.edit().putLong("FIRST_OPEN_TIME", 0L).apply();
                        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
                        rl = TL.f3768a;
                        c4567sL = new C4567sL(this.d, weapon, null);
                        this.f5031a = null;
                        this.b = 2;
                        if (WD.X(c4567sL, rl, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    } else {
                        z = false;
                    }
                }
            } else {
                sharedPreferences.edit().putLong("FIRST_OPEN_TIME", System.currentTimeMillis()).apply();
            }
            return Boolean.FALSE;
        }
        if (i == 1) {
            weapon = this.f5031a;
            AbstractC3375el.b0(obj);
            sharedPreferences.edit().putLong("FIRST_OPEN_TIME", 0L).apply();
            C2627Nn c2627Nn2 = AbstractC4437qp.f4904a;
            rl = TL.f3768a;
            c4567sL = new C4567sL(this.d, weapon, null);
            this.f5031a = null;
            this.b = 2;
            if (WD.X(c4567sL, rl, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return Boolean.valueOf(z);
    }
}
