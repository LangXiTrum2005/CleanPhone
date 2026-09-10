package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.hjq.permissions.Permission;
import com.hjq.permissions.XXPermissions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityRussianRouletteBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4190o20 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4629t20 f4773a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4190o20(C4629t20 c4629t20, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4773a = c4629t20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4190o20(this.f4773a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C4190o20 c4190o20 = (C4190o20) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c4190o20.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        AbstractC3375el.b0(obj);
        C4629t20 c4629t20 = this.f4773a;
        boolean z = c4629t20.b0;
        RussianRouletteActivity russianRouletteActivity = c4629t20.f5012a;
        if (z) {
            ActivityRussianRouletteBinding activityRussianRouletteBinding = c4629t20.d;
            activityRussianRouletteBinding.surfaceRoot.removeView(russianRouletteActivity.h);
            SurfaceView surfaceView = russianRouletteActivity.h;
            if (surfaceView != null) {
                surfaceView.setVisibility(0);
            }
            activityRussianRouletteBinding.surfaceRoot.addView(russianRouletteActivity.h);
            c4629t20.d().postDelayed(c4629t20.f, 60L);
        }
        if (c4629t20.c0) {
            AbstractC2995aW.q(russianRouletteActivity, com.umeng.analytics.pro.f.X);
            if (russianRouletteActivity.getPackageManager().hasSystemFeature("android.hardware.camera.flash") && (Build.VERSION.SDK_INT >= 23 || XXPermissions.isGranted(russianRouletteActivity, Permission.CAMERA))) {
                ((AbstractC3477fv) c4629t20.O.getValue()).d(true);
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            C2498In c2498In = App.n;
            if (C2498In.i().checkSelfPermission("android.permission.VIBRATE") == 0) {
                if (c4629t20.d0 && (lifecycleOwner = c4629t20.b) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                    WD.D(lifecycleScope, null, 0, new C4541s20(c4629t20, null), 3);
                }
            }
        } else if (c4629t20.d0) {
            WD.D(lifecycleScope, null, 0, new C4541s20(c4629t20, null), 3);
        }
        return C5033xf0.f5238a;
    }
}
