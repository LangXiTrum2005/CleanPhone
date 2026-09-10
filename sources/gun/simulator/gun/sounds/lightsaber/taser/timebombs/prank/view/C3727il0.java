package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.scenes.scene2d.Stage;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.il0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3727il0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Integer f4517a;
    public final /* synthetic */ int b;
    public final /* synthetic */ WeaponUseActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3727il0(Integer num, int i, WeaponUseActivity weaponUseActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4517a = num;
        this.b = i;
        this.c = weaponUseActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3727il0(this.f4517a, this.b, this.c, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C3727il0 c3727il0 = (C3727il0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c3727il0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        Stage stage = AbstractC3197ck0.f4241a;
        AbstractC3197ck0.j.set(0, this.f4517a);
        WeaponUseActivity weaponUseActivity = this.c;
        int i = this.b;
        if (i != 0) {
            weaponUseActivity.s(i);
        } else {
            Object obj2 = AbstractC3197ck0.k.get(weaponUseActivity.h);
            AbstractC2995aW.p(obj2, "get(...)");
            weaponUseActivity.s(((Number) obj2).intValue());
        }
        return C5033xf0.f5238a;
    }
}
