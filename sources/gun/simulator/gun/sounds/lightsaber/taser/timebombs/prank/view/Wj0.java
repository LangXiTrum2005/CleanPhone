package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.Color;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutWeaponActivityActionBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.ColorSeekBarVertical;

/* JADX INFO: loaded from: classes4.dex */
public final class Wj0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3935a;
    public int b;
    public final /* synthetic */ C3109bk0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wj0(C3109bk0 c3109bk0, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = c3109bk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Wj0(this.c, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Wj0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:67:0x01e2  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        int i;
        long j;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = this.b;
        C3109bk0 c3109bk0 = this.c;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.f3935a;
                AbstractC3375el.b0(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        Weapon weapon = c3109bk0.e;
        String name = weapon != null ? weapon.getName() : null;
        if (name != null) {
            switch (name) {
                case "LightSaber-A":
                    String strL = AbstractC5044xl.l((String) ((C2856Wi) AbstractC3194cj.B.getValue()).b, "colorString", 1, "this as java.lang.String).substring(startIndex)", "FF");
                    WD.k(16);
                    j = Long.parseLong(strL, 16);
                    i = (int) j;
                    break;
                case "LightSaber-B":
                    String strL2 = AbstractC5044xl.l((String) ((C2856Wi) AbstractC3194cj.C.getValue()).b, "colorString", 1, "this as java.lang.String).substring(startIndex)", "FF");
                    WD.k(16);
                    j = Long.parseLong(strL2, 16);
                    i = (int) j;
                    break;
                case "LightSaber-C":
                    String strL3 = AbstractC5044xl.l((String) ((C2856Wi) AbstractC3194cj.D.getValue()).b, "colorString", 1, "this as java.lang.String).substring(startIndex)", "FF");
                    WD.k(16);
                    j = Long.parseLong(strL3, 16);
                    i = (int) j;
                    break;
                case "LightSaber-D":
                    String strL4 = AbstractC5044xl.l((String) ((C2856Wi) AbstractC3194cj.E.getValue()).b, "colorString", 1, "this as java.lang.String).substring(startIndex)", "FF");
                    WD.k(16);
                    j = Long.parseLong(strL4, 16);
                    i = (int) j;
                    break;
                case "LightSaber-E":
                    String strL5 = AbstractC5044xl.l((String) ((C2856Wi) AbstractC3194cj.F.getValue()).b, "colorString", 1, "this as java.lang.String).substring(startIndex)", "FF");
                    WD.k(16);
                    j = Long.parseLong(strL5, 16);
                    i = (int) j;
                    break;
                case "LightSaber-F":
                    String strL6 = AbstractC5044xl.l((String) ((C2856Wi) AbstractC3194cj.G.getValue()).b, "colorString", 1, "this as java.lang.String).substring(startIndex)", "FF");
                    WD.k(16);
                    j = Long.parseLong(strL6, 16);
                    i = (int) j;
                    break;
                case "LightSaber-G":
                    String strL7 = AbstractC5044xl.l((String) ((C2856Wi) AbstractC3194cj.H.getValue()).b, "colorString", 1, "this as java.lang.String).substring(startIndex)", "FF");
                    WD.k(16);
                    j = Long.parseLong(strL7, 16);
                    i = (int) j;
                    break;
                case "LightSaber-H":
                    String strL8 = AbstractC5044xl.l((String) ((C2856Wi) AbstractC3194cj.I.getValue()).b, "colorString", 1, "this as java.lang.String).substring(startIndex)", "FF");
                    WD.k(16);
                    j = Long.parseLong(strL8, 16);
                    i = (int) j;
                    break;
                case "LightSaber-I":
                    String strL9 = AbstractC5044xl.l((String) ((C2856Wi) AbstractC3194cj.J.getValue()).b, "colorString", 1, "this as java.lang.String).substring(startIndex)", "FF");
                    WD.k(16);
                    j = Long.parseLong(strL9, 16);
                    i = (int) j;
                    break;
                case "LightSaber-J":
                    String strL10 = AbstractC5044xl.l((String) ((C2856Wi) AbstractC3194cj.K.getValue()).b, "colorString", 1, "this as java.lang.String).substring(startIndex)", "FF");
                    WD.k(16);
                    j = Long.parseLong(strL10, 16);
                    i = (int) j;
                    break;
                case "LightSaber-K":
                    String strL11 = AbstractC5044xl.l((String) ((C2856Wi) AbstractC3194cj.L.getValue()).b, "colorString", 1, "this as java.lang.String).substring(startIndex)", "FF");
                    WD.k(16);
                    j = Long.parseLong(strL11, 16);
                    i = (int) j;
                    break;
                case "LightSaber-L":
                    String strL12 = AbstractC5044xl.l((String) ((C2856Wi) AbstractC3194cj.M.getValue()).b, "colorString", 1, "this as java.lang.String).substring(startIndex)", "FF");
                    WD.k(16);
                    j = Long.parseLong(strL12, 16);
                    i = (int) j;
                    break;
                default:
                    i = -1;
                    break;
            }
        } else {
            i = -1;
        }
        ColorSeekBarVertical colorSeekBarVertical = ((LayoutWeaponActivityActionBinding) c3109bk0.b).chooseColorSeekBar;
        this.f3935a = i;
        this.b = 1;
        if (colorSeekBarVertical.b(i, this) == enumC4602sk) {
            return enumC4602sk;
        }
        WeaponUseActivity weaponUseActivity = c3109bk0.f;
        if (weaponUseActivity != null) {
            Color color = new Color(((i >> 16) & 255) / 255.0f, ((i >> 8) & 255) / 255.0f, (i & 255) / 255.0f, ((i >> 24) & 255) / 255.0f);
            this.b = 2;
            if (weaponUseActivity.k(color, this) == enumC4602sk) {
                return enumC4602sk;
            }
        }
        return C5033xf0.f5238a;
    }
}
