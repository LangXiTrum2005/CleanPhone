package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.ValueAnimator;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class Kk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3324a;
    public /* synthetic */ Object b;
    public final /* synthetic */ WeaponUseActivity c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kk0(WeaponUseActivity weaponUseActivity, String str, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = weaponUseActivity;
        this.d = str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        Kk0 kk0 = new Kk0(this.c, this.d, interfaceC2857Wj);
        kk0.b = obj;
        return kk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Kk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C3443fb c3443fb;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3324a;
        String str = this.d;
        WeaponUseActivity weaponUseActivity = this.c;
        if (i != 0) {
            if (i == 1) {
                AbstractC3375el.b0(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3443fb = (C3443fb) this.b;
                AbstractC3375el.b0(obj);
            }
            C3443fb c3443fb2 = (C3443fb) obj;
            Objects.toString(c3443fb);
            Objects.toString(c3443fb2);
            if (c3443fb != null && c3443fb2 != null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(250L);
                valueAnimatorOfFloat.addUpdateListener(new Hk0(weaponUseActivity, str, 0));
                valueAnimatorOfFloat.start();
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) this.b;
        Jk0 jk0 = new Jk0(weaponUseActivity, str, null);
        this.b = interfaceC4514rk;
        this.f3324a = 1;
        obj = WD.X(jk0, AbstractC4437qp.b, this);
        if (obj == enumC4602sk) {
            return enumC4602sk;
        }
        C3443fb c3443fb3 = (C3443fb) obj;
        Ik0 ik0 = new Ik0(weaponUseActivity, str, null);
        this.b = c3443fb3;
        this.f3324a = 2;
        Object objX = WD.X(ik0, AbstractC4437qp.b, this);
        if (objX == enumC4602sk) {
            return enumC4602sk;
        }
        c3443fb = c3443fb3;
        obj = objX;
        C3443fb c3443fb4 = (C3443fb) obj;
        Objects.toString(c3443fb);
        Objects.toString(c3443fb4);
        if (c3443fb != null) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.setDuration(250L);
            valueAnimatorOfFloat2.addUpdateListener(new Hk0(weaponUseActivity, str, 0));
            valueAnimatorOfFloat2.start();
        }
        return C5033xf0.f5238a;
    }
}
