package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TimeBomb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Dy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2379Dy extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2379Dy(WeaponUseActivity weaponUseActivity, Weapon weapon, AbstractC4340pk0 abstractC4340pk0, int i) {
        super(0);
        this.f = i;
        this.g = weaponUseActivity;
        this.h = weapon;
        this.i = abstractC4340pk0;
    }

    public final C4370q40 b() {
        int i = this.f;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                Weapon weapon = (Weapon) obj2;
                return weapon instanceof TimeBomb ? new C4370q40((WeaponUseActivity) obj3, weapon.getConsecutiveInterval(), null) : new C4370q40((WeaponUseActivity) obj3, weapon.getConsecutiveInterval(), new C2353Cy((C2612My) obj, 0));
            case 1:
                C2498In c2498In = App.n;
                WeaponUseActivity weaponUseActivity = (WeaponUseActivity) obj3;
                C4213oI c4213oI = (C4213oI) obj;
                AbstractC3651ht.c(C2498In.g(), new C3599hI(weaponUseActivity, c4213oI, null));
                return new C4370q40(weaponUseActivity, ((Weapon) obj2).getConsecutiveInterval(), new C2353Cy(c4213oI, 1));
            case 2:
                return new C4370q40((WeaponUseActivity) obj3, ((Weapon) obj2).getConsecutiveInterval(), new C2353Cy((C5081y80) obj, 2));
            case 3:
                return new C4370q40((WeaponUseActivity) obj3, ((Weapon) obj2).getConsecutiveInterval(), new C3356eb0(0, (C3794jb0) obj, C3794jb0.class, "activeWhenShake", "activeWhenShake()V", 0));
            default:
                return new C4370q40((WeaponUseActivity) obj3, ((Weapon) obj2).getConsecutiveInterval(), new C2353Cy((Gb0) obj, 3));
        }
    }

    public final List c() {
        List listM;
        int i = this.f;
        Object obj = this.i;
        Object obj2 = this.g;
        Object obj3 = this.h;
        switch (i) {
            case 5:
                AbstractC3375el abstractC3375el = ((C4500rd) obj3).b;
                if (abstractC3375el == null) {
                    listM = null;
                } else {
                    listM = abstractC3375el.m((String) obj, (List) obj2);
                }
                if (listM == null) {
                    listM = (List) obj2;
                }
                List list = listM;
                ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
            default:
                AbstractC3375el abstractC3375el2 = ((C4500rd) obj3).b;
                AbstractC2995aW.n(abstractC3375el2);
                return abstractC3375el2.m(((C3048b3) obj).i.d, ((C3657hz) obj2).a());
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return b();
            case 5:
                return c();
            default:
                return c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2379Dy(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.f = i;
        this.h = obj;
        this.g = obj2;
        this.i = obj3;
    }
}
