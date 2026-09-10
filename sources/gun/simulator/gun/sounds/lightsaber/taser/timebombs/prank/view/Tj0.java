package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.Color;
import com.mikhaellopez.circleview.CircleView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutWeaponActivityActionBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class Tj0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3787a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3109bk0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tj0(C3109bk0 c3109bk0, int i, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = c3109bk0;
        this.d = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        Tj0 tj0 = new Tj0(this.c, this.d, interfaceC2857Wj);
        tj0.b = obj;
        return tj0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Tj0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3787a;
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
        Sj0 sj0 = new Sj0(2, null);
        this.f3787a = 1;
        if (WD.X(sj0, AbstractC4437qp.b, this) == enumC4602sk) {
            return enumC4602sk;
        }
        C3109bk0 c3109bk0 = this.c;
        ((LayoutWeaponActivityActionBinding) c3109bk0.b).ivColorPicker.setVisibility(8);
        ((LayoutWeaponActivityActionBinding) c3109bk0.b).cvColorChoose.setVisibility(0);
        CircleView circleView = ((LayoutWeaponActivityActionBinding) c3109bk0.b).cvColorChoose;
        int i2 = this.d;
        circleView.setCircleColor(i2);
        Color color = new Color(((i2 >> 16) & 255) / 255.0f, ((i2 >> 8) & 255) / 255.0f, (i2 & 255) / 255.0f, ((i2 >> 24) & 255) / 255.0f);
        this.f3787a = 2;
        if (c3109bk0.f.k(color, this) == enumC4602sk) {
            return enumC4602sk;
        }
        return C5033xf0.f5238a;
    }
}
