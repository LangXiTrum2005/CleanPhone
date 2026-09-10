package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import com.hjq.permissions.Permission;
import com.hjq.permissions.XXPermissions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4993x80 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5209a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C5081y80 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4993x80(C5081y80 c5081y80, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = c5081y80;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C4993x80 c4993x80 = new C4993x80(this.c, interfaceC2857Wj);
        c4993x80.b = obj;
        return c4993x80;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4993x80) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3477fv abstractC3477fvA;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f5209a;
        C5081y80 c5081y80 = this.c;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            C4905w80 c4905w80 = new C4905w80(c5081y80, null);
            this.f5209a = 1;
            obj = WD.X(c4905w80, AbstractC4437qp.b, this);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            WeaponUseActivity weaponUseActivity = c5081y80.f4847a;
            AbstractC2995aW.q(weaponUseActivity, com.umeng.analytics.pro.f.X);
            if (weaponUseActivity.getPackageManager().hasSystemFeature("android.hardware.camera.flash") && ((Build.VERSION.SDK_INT >= 23 || XXPermissions.isGranted(weaponUseActivity, Permission.CAMERA)) && (abstractC3477fvA = c5081y80.a()) != null)) {
                abstractC3477fvA.d(true);
            }
        }
        return C5033xf0.f5238a;
    }
}
