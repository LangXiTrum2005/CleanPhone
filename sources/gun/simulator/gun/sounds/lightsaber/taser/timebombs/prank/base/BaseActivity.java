package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.gyf.immersionbar.a;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractApplicationC2673Ph;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3651ht;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3435fU;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4997xB;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.T8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseActivity<VB extends ViewBinding> extends AppCompatActivity implements InterfaceC4997xB {
    public VB mBinding;
    private boolean mIsOnResume;
    private final String TAG = getClass().getSimpleName();
    private final AtyAction mAtyAction = new AtyAction(this);
    private final PermissionAction mPermissionAction = new PermissionAction((AbstractApplicationC2673Ph) App.n.f(), this);

    public static /* synthetic */ void dialogDismissBackFromDesktop$default(BaseActivity baseActivity, boolean z, Dialog dialog, InterfaceC2714Qw interfaceC2714Qw, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dialogDismissBackFromDesktop");
        }
        if ((i & 4) != 0) {
            interfaceC2714Qw = null;
        }
        baseActivity.dialogDismissBackFromDesktop(z, dialog, interfaceC2714Qw);
    }

    public void dialogDismissBackFromDesktop(boolean z, Dialog dialog, InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(dialog, "dialog");
        if (z && NetworkUtil.isConnected(getBaseContext())) {
            AbstractC3651ht.b(dialog);
            if (interfaceC2714Qw != null) {
                interfaceC2714Qw.invoke();
            }
        }
    }

    public final VB getMBinding() {
        VB vb = this.mBinding;
        if (vb != null) {
            return vb;
        }
        AbstractC2995aW.x0("mBinding");
        throw null;
    }

    public final String getTAG() {
        return this.TAG;
    }

    public void grantPermission(String[] strArr, InterfaceC3435fU interfaceC3435fU) {
        AbstractC2995aW.q(strArr, "permissions");
        AbstractC2995aW.q(interfaceC3435fU, "permissionCallback");
        PermissionAction permissionAction = this.mPermissionAction;
        permissionAction.getClass();
        try {
            ActivityResultLauncher activityResultLauncher = permissionAction.c;
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(strArr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean hasPermission(String str) {
        AbstractC2995aW.q(str, "permission");
        PermissionAction permissionAction = this.mPermissionAction;
        permissionAction.getClass();
        return Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(permissionAction.f2791a, str) == 0;
    }

    public abstract void initContentView(View view);

    public void initData() {
    }

    public void initListener() {
    }

    public abstract void initView();

    public final boolean isInitedVB() {
        return this.mBinding != null;
    }

    public final boolean isResuming() {
        return this.mIsOnResume;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVarK = a.k(this);
        aVarK.d();
        T8 t8 = aVarK.k;
        t8.getClass();
        t8.f3757a = 0;
        t8.e = true;
        aVarK.e();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.mIsOnResume = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.mIsOnResume = true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public final void setMBinding(VB vb) {
        AbstractC2995aW.q(vb, "<set-?>");
        this.mBinding = vb;
    }

    public boolean setStatusBarLightMode() {
        return true;
    }

    public boolean setTranslucent() {
        return true;
    }

    public void toAty(Class<? extends Activity> cls) {
        AbstractC2995aW.q(cls, "cls");
        AtyAction atyAction = this.mAtyAction;
        atyAction.getClass();
        Object obj = atyAction.f2787a;
        AbstractC2995aW.o(obj, "null cannot be cast to non-null type android.content.Context");
        atyAction.a(new Intent((Context) obj, cls), null, null);
    }

    public void toAtyCallback(Class<? extends Activity> cls, ActivityResultCallback<ActivityResult> activityResultCallback, ActivityOptionsCompat activityOptionsCompat) {
        AbstractC2995aW.q(cls, "cls");
        AtyAction atyAction = this.mAtyAction;
        atyAction.getClass();
        Object obj = atyAction.f2787a;
        AbstractC2995aW.o(obj, "null cannot be cast to non-null type android.content.Context");
        atyAction.a(new Intent((Context) obj, cls), activityResultCallback, activityOptionsCompat);
    }

    public void toAtyCallback(Intent intent, ActivityResultCallback<ActivityResult> activityResultCallback, ActivityOptionsCompat activityOptionsCompat) {
        AbstractC2995aW.q(intent, "intent");
        this.mAtyAction.a(intent, activityResultCallback, activityOptionsCompat);
    }
}
