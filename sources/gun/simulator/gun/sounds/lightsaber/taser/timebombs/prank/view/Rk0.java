package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class Rk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SpineController f3675a;
    public final /* synthetic */ String b;
    public final /* synthetic */ WeaponUseActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rk0(SpineController spineController, WeaponUseActivity weaponUseActivity, String str, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3675a = spineController;
        this.b = str;
        this.c = weaponUseActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        String str = this.b;
        return new Rk0(this.f3675a, this.c, str, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Rk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C3443fb c3443fbA;
        AbstractC3375el.b0(obj);
        SpineController spineController = this.f3675a;
        spineController.showAllSlot();
        String str = this.b;
        spineController.showSlot("GUN", str);
        C4991x70 skeleton = spineController.getSkeleton("GUN");
        if (skeleton == null || (c3443fbA = skeleton.a(str)) == null) {
            return null;
        }
        float f = this.c.i;
        c3443fbA.h = f;
        c3443fbA.i = f;
        return C5033xf0.f5238a;
    }
}
