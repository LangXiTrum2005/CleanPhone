package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.Color;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutWeaponActivityActionBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.ColorSeekBarVertical;

/* JADX INFO: loaded from: classes4.dex */
public final class Yj0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4036a;
    public final /* synthetic */ C3109bk0 b;
    public final /* synthetic */ ZX c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yj0(C3109bk0 c3109bk0, ZX zx, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = c3109bk0;
        this.c = zx;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Yj0(this.b, this.c, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Yj0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4036a;
        ZX zx = this.c;
        C3109bk0 c3109bk0 = this.b;
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
        ColorSeekBarVertical colorSeekBarVertical = ((LayoutWeaponActivityActionBinding) c3109bk0.b).chooseColorSeekBar;
        int i2 = zx.f4074a;
        this.f4036a = 1;
        if (colorSeekBarVertical.b(i2, this) == enumC4602sk) {
            return enumC4602sk;
        }
        ((LayoutWeaponActivityActionBinding) c3109bk0.b).cvColorChoose.setCircleColor(zx.f4074a);
        WeaponUseActivity weaponUseActivity = c3109bk0.f;
        int i3 = zx.f4074a;
        Color color = new Color(((i3 >> 16) & 255) / 255.0f, ((i3 >> 8) & 255) / 255.0f, (i3 & 255) / 255.0f, ((i3 >> 24) & 255) / 255.0f);
        this.f4036a = 2;
        if (weaponUseActivity.k(color, this) == enumC4602sk) {
            return enumC4602sk;
        }
        return C5033xf0.f5238a;
    }
}
