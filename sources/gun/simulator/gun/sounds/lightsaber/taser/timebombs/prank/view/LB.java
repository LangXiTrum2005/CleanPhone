package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import com.hjq.permissions.IPermissionInterceptor;
import com.hjq.permissions.OnPermissionCallback;
import com.hjq.permissions.PermissionFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class LB {
    public static void a(IPermissionInterceptor iPermissionInterceptor, Activity activity, List list, List list2, boolean z, OnPermissionCallback onPermissionCallback) {
        if (onPermissionCallback == null) {
            return;
        }
        onPermissionCallback.onDenied(list2, z);
    }

    public static void c(IPermissionInterceptor iPermissionInterceptor, Activity activity, List list, List list2, boolean z, OnPermissionCallback onPermissionCallback) {
        if (onPermissionCallback == null) {
            return;
        }
        onPermissionCallback.onGranted(list2, z);
    }

    public static void d(IPermissionInterceptor iPermissionInterceptor, Activity activity, List list, OnPermissionCallback onPermissionCallback) {
        PermissionFragment.launch(activity, new ArrayList(list), iPermissionInterceptor, onPermissionCallback);
    }

    public static void b(IPermissionInterceptor iPermissionInterceptor, Activity activity, List list, boolean z, OnPermissionCallback onPermissionCallback) {
    }
}
