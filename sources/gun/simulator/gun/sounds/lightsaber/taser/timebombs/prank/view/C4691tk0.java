package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwnerKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4691tk0 extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4691tk0(int i, Object obj, Object obj2) {
        super(0);
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40] */
    /* JADX WARN: Type inference failed for: r0v3, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40] */
    /* JADX WARN: Type inference failed for: r0v4, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gr, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eV] */
    public final D40 b() {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 2:
                C2476Hr c2476Hr = (C2476Hr) obj2;
                ?? c2450Gr = (D40) c2476Hr.d;
                if (c2450Gr == 0) {
                    Enum[] enumArr = (Enum[]) c2476Hr.c;
                    c2450Gr = new C2450Gr((String) obj, enumArr.length);
                    for (Enum r0 : enumArr) {
                        c2450Gr.j(r0.name(), false);
                    }
                }
                return c2450Gr;
            default:
                return AbstractC3375el.i((String) obj2, C3442fa0.d, new D40[0], new C4140nX((C2476Hr) obj, 15));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                WeaponSortActivity weaponSortActivity = (WeaponSortActivity) obj2;
                Weapon weapon = (Weapon) obj;
                WD.D(LifecycleOwnerKt.getLifecycleScope(weaponSortActivity), AbstractC4437qp.b, 0, new C4603sk0(weaponSortActivity, weapon, null), 2);
                Intent intent = new Intent(weaponSortActivity, (Class<?>) WeaponUseActivity.class);
                intent.putExtra("weapon", weapon);
                weaponSortActivity.startActivity(intent);
                return C5033xf0.f5238a;
            case 1:
                DialogC4476rI dialogC4476rI = (DialogC4476rI) obj;
                return new DialogC4228oX((Context) obj2, dialogC4476rI.c, dialogC4476rI.b, false);
            case 2:
                return b();
            default:
                return b();
        }
    }
}
