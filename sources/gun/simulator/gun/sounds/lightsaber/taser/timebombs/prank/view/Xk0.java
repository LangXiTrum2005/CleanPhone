package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class Xk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3992a;
    public /* synthetic */ Object b;
    public final /* synthetic */ WeaponUseActivity c;
    public final /* synthetic */ String d;
    public final /* synthetic */ SpineController e;
    public final /* synthetic */ View f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xk0(WeaponUseActivity weaponUseActivity, String str, SpineController spineController, View view, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = weaponUseActivity;
        this.d = str;
        this.e = spineController;
        this.f = view;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        Xk0 xk0 = new Xk0(this.c, this.d, this.e, this.f, interfaceC2857Wj);
        xk0.b = obj;
        return xk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Xk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        View view;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3992a;
        WeaponUseActivity weaponUseActivity = this.c;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            Wk0 wk0 = new Wk0(this.e, weaponUseActivity, this.d, null);
            this.f3992a = 1;
            if (WD.X(wk0, AbstractC4437qp.b, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        AbstractC4340pk0 abstractC4340pk0 = weaponUseActivity.d;
        if (abstractC4340pk0 != null && (abstractC4340pk0 instanceof Gb0) && (view = this.f) != null) {
            view.setOnTouchListener(new Dk0(abstractC4340pk0, 4));
        }
        return C5033xf0.f5238a;
    }
}
