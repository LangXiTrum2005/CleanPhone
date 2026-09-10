package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.WeaponSorts;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4919wL extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeaponSorts f5176a;
    public final /* synthetic */ MainActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4919wL(WeaponSorts weaponSorts, MainActivity mainActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f5176a = weaponSorts;
        this.b = mainActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4919wL(this.f5176a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C4919wL c4919wL = (C4919wL) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c4919wL.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC3375el.b0(obj);
        Ma0 ma0 = AbstractC3194cj.b;
        if (!((Boolean) ((C2856Wi) ma0.getValue()).a()).booleanValue()) {
            S3.b("first_category", this.f5176a.getAnalyticsName());
            ((C2856Wi) ma0.getValue()).b(Boolean.TRUE);
        }
        C2856Wi c2856Wi = (C2856Wi) AbstractC3194cj.m.getValue();
        ArrayList arrayList = this.b.f;
        AbstractC2995aW.q(arrayList, "list");
        int size = arrayList.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            str = i != arrayList.size() - 1 ? str + arrayList.get(i) + "|" : str + arrayList.get(i);
        }
        c2856Wi.b(str);
        return C5033xf0.f5238a;
    }
}
