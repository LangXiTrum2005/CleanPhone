package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.widget.FrameLayout;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityGunBinding;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class Zk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeaponUseActivity f4089a;
    public int b;
    public final /* synthetic */ WeaponUseActivity c;
    public final /* synthetic */ HashMap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zk0(WeaponUseActivity weaponUseActivity, HashMap map, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = weaponUseActivity;
        this.d = map;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Zk0(this.c, this.d, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Zk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        WeaponUseActivity weaponUseActivity;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.b;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            SpineController.Builder builder = new SpineController.Builder(this.d);
            WeaponUseActivity weaponUseActivity2 = this.c;
            FrameLayout frameLayout = ((ActivityGunBinding) weaponUseActivity2.getMBinding()).flSpine;
            AbstractC2995aW.p(frameLayout, "flSpine");
            SpineController.Builder spineAnimationCallback = SpineController.Builder.addSpineView$default(builder, frameLayout, null, 2, null).setSpineAnimationCallback(new Yk0(weaponUseActivity2));
            this.f4089a = weaponUseActivity2;
            this.b = 1;
            obj = SpineController.Builder.build$default(spineAnimationCallback, this.c, null, this, 2, null);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
            weaponUseActivity = weaponUseActivity2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            weaponUseActivity = this.f4089a;
            AbstractC3375el.b0(obj);
        }
        weaponUseActivity.g = (SpineController) obj;
        return C5033xf0.f5238a;
    }
}
