package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import com.mikhaellopez.circleview.CircleView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutWeaponActivityActionBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.ColorSeekBarVertical;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3335eI extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4314a;
    public final /* synthetic */ C4213oI b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3335eI(C4213oI c4213oI, String str, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = c4213oI;
        this.c = str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3335eI(this.b, this.c, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C3335eI) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        LayoutWeaponActivityActionBinding layoutWeaponActivityActionBinding;
        ColorSeekBarVertical colorSeekBarVertical;
        C4991x70 skeleton;
        C4991x70 skeleton2;
        C4991x70 skeleton3;
        C4991x70 skeleton4;
        LayoutWeaponActivityActionBinding layoutWeaponActivityActionBinding2;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4314a;
        CircleView circleView = null;
        String str = this.c;
        C4213oI c4213oI = this.b;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            SpineController spineController = c4213oI.N;
            N70 n70B = (spineController == null || (skeleton4 = spineController.getSkeleton("LIGHT_RECTANGLE")) == null) ? null : skeleton4.b("glow");
            if (n70B != null) {
                n70B.c = AbstractC4496rb.k(AbstractC4496rb.z(str));
            }
            SpineController spineController2 = c4213oI.N;
            N70 n70B2 = (spineController2 == null || (skeleton3 = spineController2.getSkeleton("LIGHT_RECTANGLE1")) == null) ? null : skeleton3.b("glow");
            if (n70B2 != null) {
                n70B2.c = AbstractC4496rb.k(AbstractC4496rb.z(str));
            }
            N70 n70B3 = (spineController2 == null || (skeleton2 = spineController2.getSkeleton("LIGHT_SABER_EFFECT")) == null) ? null : skeleton2.b(c4213oI.b0);
            if (n70B3 != null) {
                n70B3.c = AbstractC4496rb.k(AbstractC4496rb.z(str));
            }
            N70 n70B4 = (spineController2 == null || (skeleton = spineController2.getSkeleton("LIGHT_SABER_EFFECT1")) == null) ? null : skeleton.b(c4213oI.b0);
            if (n70B4 != null) {
                n70B4.c = AbstractC4496rb.k(AbstractC4496rb.z(str));
            }
            C3109bk0 c3109bk0M = c4213oI.f4847a.m();
            if (c3109bk0M != null && (layoutWeaponActivityActionBinding = (LayoutWeaponActivityActionBinding) c3109bk0M.b) != null && (colorSeekBarVertical = layoutWeaponActivityActionBinding.chooseColorSeekBar) != null) {
                String strL = AbstractC5044xl.l(str, "colorString", 1, "this as java.lang.String).substring(startIndex)", "FF");
                WD.k(16);
                int i2 = (int) Long.parseLong(strL, 16);
                this.f4314a = 1;
                if (colorSeekBarVertical.b(i2, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        C3109bk0 c3109bk0M2 = c4213oI.f4847a.m();
        if (c3109bk0M2 != null && (layoutWeaponActivityActionBinding2 = (LayoutWeaponActivityActionBinding) c3109bk0M2.b) != null) {
            circleView = layoutWeaponActivityActionBinding2.cvColorChoose;
        }
        if (circleView != null) {
            String strL2 = AbstractC5044xl.l(str, "colorString", 1, "this as java.lang.String).substring(startIndex)", "FF");
            WD.k(16);
            circleView.setCircleColor((int) Long.parseLong(strL2, 16));
        }
        return C5033xf0.f5238a;
    }
}
