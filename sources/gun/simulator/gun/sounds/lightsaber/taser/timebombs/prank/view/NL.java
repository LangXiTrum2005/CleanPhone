package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.SharedPreferences;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class NL extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f3453a;
    public int b;
    public final /* synthetic */ MainActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NL(MainActivity mainActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = mainActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new NL(this.c, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((NL) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6 A[RETURN] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        SharedPreferences sharedPreferencesB;
        RL rl;
        ML ml;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.b;
        MainActivity mainActivity = this.c;
        if (i != 0) {
            if (i == 1) {
                sharedPreferencesB = this.f3453a;
                AbstractC3375el.b0(obj);
            } else if (i == 2) {
                AbstractC3375el.b0(obj);
                if (((Boolean) obj).booleanValue()) {
                    C2627Nn c2627Nn = AbstractC4437qp.f4904a;
                    rl = TL.f3768a;
                    ml = new ML(mainActivity, null);
                    this.b = 3;
                    if (WD.X(ml, rl, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        sharedPreferencesB = C3850k80.b(mainActivity, "SpHelper");
        this.f3453a = sharedPreferencesB;
        this.b = 1;
        int i2 = MainActivity.j;
        mainActivity.getClass();
        obj = WD.X(new C4655tL(sharedPreferencesB, mainActivity, null), AbstractC4437qp.b, this);
        if (obj == enumC4602sk) {
            return enumC4602sk;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String string = sharedPreferencesB.getString("WEAPON_NAME_LIST", AbstractC3197ck0.a());
        if (string == null) {
            string = AbstractC3197ck0.a();
        }
        ArrayList arrayListV0 = AbstractC2853Wf.v0(AbstractC3089ba0.L0(string, new String[]{"||"}));
        String string2 = sharedPreferencesB.getString("WEAPON_SORT_INDEX_LIST", "0||1||2||3||4");
        if (string2 == null) {
            string2 = "";
        }
        ArrayList arrayListV1 = AbstractC2853Wf.v0(AbstractC3089ba0.L0(string2, new String[]{"||"}));
        App.r = arrayListV0;
        App.s = arrayListV1;
        if (!zBooleanValue) {
            C4755uX c4755uX = C4755uX.f5081a;
            this.f3453a = null;
            this.b = 2;
            obj = c4755uX.b(this);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
            if (((Boolean) obj).booleanValue()) {
                C2627Nn c2627Nn2 = AbstractC4437qp.f4904a;
                rl = TL.f3768a;
                ml = new ML(mainActivity, null);
                this.b = 3;
                if (WD.X(ml, rl, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        }
        return C5033xf0.f5238a;
    }
}
