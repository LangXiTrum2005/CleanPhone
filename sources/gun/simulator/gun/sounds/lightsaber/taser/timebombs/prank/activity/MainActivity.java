package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.efs.sdk.base.core.util.NetworkUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvWeaponSortsAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseRvAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseSyncActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityMainBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3485g1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2398Er;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2498In;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4831vL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DialogC2411Fe;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ExecutorC4433qn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fk0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ma0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S3;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ViewOnClickListenerC3176ca;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zb0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class MainActivity extends BaseSyncActivity<ActivityMainBinding> {
    public static final /* synthetic */ int j = 0;
    public BaseRvAdapter d;
    public boolean e;
    public DialogC2411Fe g;
    public boolean h;
    public final Ma0 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ma0 f2777a = AbstractC2340Cl.I(FL.i);
    public final Ma0 b = AbstractC2340Cl.I(FL.g);
    public final Ma0 c = AbstractC2340Cl.I(FL.h);
    public final ArrayList f = AbstractC2340Cl.L("0", "1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4");

    public MainActivity() {
        AbstractC2340Cl.I(new EL(this, 3));
        this.i = AbstractC2340Cl.I(new EL(this, 0));
    }

    /* JADX WARN: Code duplicated, block: B:57:0x010c A[PHI: r2
  0x010c: PHI (r2v3 java.util.Iterator) = (r2v1 java.util.Iterator), (r2v4 java.util.Iterator) binds: [B:56:0x00f5, B:75:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0112  */
    /* JADX WARN: Code duplicated, block: B:61:0x011f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0154 A[PHI: r1 r2
  0x0154: PHI (r1v12 java.lang.Object) = (r1v13 java.lang.Object), (r1v13 java.lang.Object), (r1v15 java.lang.Object) binds: [B:60:0x011d, B:62:0x0123, B:72:0x0150] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r2v2 java.util.Iterator) = (r2v3 java.util.Iterator), (r2v3 java.util.Iterator), (r2v5 java.util.Iterator) binds: [B:60:0x011d, B:62:0x0123, B:72:0x0150] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0157  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0076 -> B:27:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c7 -> B:38:0x00cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00da -> B:45:0x00db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0142 -> B:68:0x0145). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0154 -> B:75:0x0155). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity r10, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj r11) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity.h(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wj):java.lang.Object");
    }

    public static final void i(MainActivity mainActivity) {
        mainActivity.getClass();
        WZ.b().i(mainActivity, AbstractC3485g1.d, new DL());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseSyncActivity
    public final ViewBinding getViewBinding() {
        ActivityMainBinding activityMainBindingInflate = ActivityMainBinding.inflate(getLayoutInflater());
        AbstractC2995aW.p(activityMainBindingInflate, "inflate(...)");
        return activityMainBindingInflate;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity
    public final void initData() {
        super.initData();
        S3.a("main_page_display");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity
    public final void initView() {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        ExecutorC4433qn executorC4433qn = AbstractC4437qp.b;
        WD.D(lifecycleScope, executorC4433qn, 0, new CL(2, null), 2);
        int i = 1;
        C2398Er.a().e(this, 1, new C4831vL(this, i));
        this.g = new DialogC2411Fe(this);
        VQ.a().g(this, ((ActivityMainBinding) getMBinding()).conNativeAdPlacement, AbstractC3485g1.f, "NavLarge_Home", new C2498In(i), 1, new QL(this, 0));
        WD.D(LifecycleOwnerKt.getLifecycleScope(this), null, 0, new BL(this, null), 3);
        ((ActivityMainBinding) getMBinding()).imgSetting.setOnClickListener(new ViewOnClickListenerC3176ca(this, 3));
        WD.D(LifecycleOwnerKt.getLifecycleScope(this), executorC4433qn, 0, new NL(this, null), 2);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        int intExtra;
        super.onActivityResult(i, i2, intent);
        if (i != 1111 || i2 != -1 || intent == null || (intExtra = intent.getIntExtra("weaponSortIndex", -1)) < 0) {
            return;
        }
        Intent intent2 = new Intent(getBaseContext(), (Class<?>) WeaponSortActivity.class);
        intent2.putExtra("weaponSort", (Parcelable) ((RvWeaponSortsAdapter) this.f2777a.getValue()).b(intExtra));
        startActivity(intent2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        WD.D(LifecycleOwnerKt.getLifecycleScope(this), null, 0, new IL(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        VQ.a().j(((ActivityMainBinding) getMBinding()).conNativeAdPlacement);
        Zb0 zb0 = WeaponUseActivity.n;
        C2498In c2498In = App.n;
        WD.D(C2498In.g(), null, 0, new Fk0(2, null), 3);
        MediaPlayer mediaPlayer = BF.g;
        try {
            if (mediaPlayer != null) {
                try {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                    }
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                }
                mediaPlayer.release();
                BF.g = null;
            }
            BF.g = null;
            MediaPlayer mediaPlayer2 = BF.h;
            if (mediaPlayer2 != null) {
                mediaPlayer2.stop();
            }
            MediaPlayer mediaPlayer3 = BF.h;
            if (mediaPlayer3 != null) {
                mediaPlayer3.release();
            }
            BF.h = null;
            super.onDestroy();
        } catch (Throwable th) {
            mediaPlayer.release();
            BF.g = null;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        VQ.a().b(((ActivityMainBinding) getMBinding()).conNativeAdPlacement);
        this.e = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        DialogC2411Fe dialogC2411Fe;
        super.onResume();
        VQ.a().c(((ActivityMainBinding) getMBinding()).conNativeAdPlacement);
        DialogC2411Fe dialogC2411Fe2 = this.g;
        if ((dialogC2411Fe2 == null || !dialogC2411Fe2.isShowing()) && !NetworkUtil.isConnected(this) && (dialogC2411Fe = this.g) != null) {
            dialogC2411Fe.b = false;
            dialogC2411Fe.show();
        }
        DialogC2411Fe dialogC2411Fe3 = this.g;
        int i = 2;
        if (dialogC2411Fe3 != null) {
            dialogDismissBackFromDesktop(this.e, dialogC2411Fe3, new EL(this, i));
        }
        WD.D(LifecycleOwnerKt.getLifecycleScope(this), AbstractC4437qp.b, 0, new LL(this, null), 2);
    }
}
