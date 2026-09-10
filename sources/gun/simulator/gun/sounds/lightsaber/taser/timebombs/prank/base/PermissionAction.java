package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.PermissionAction;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractApplicationC2673Ph;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class PermissionAction implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2791a;
    public final LifecycleOwner b;
    public ActivityResultLauncher c;
    public ActivityResultLauncher d;

    public PermissionAction(AbstractApplicationC2673Ph abstractApplicationC2673Ph, LifecycleOwner lifecycleOwner) {
        AbstractC2995aW.q(lifecycleOwner, "lifecycleOwner");
        this.f2791a = abstractApplicationC2673Ph;
        this.b = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreateAndRegister() {
        final int i = 0;
        ActivityResultCallback activityResultCallback = new ActivityResultCallback(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eU
            public final /* synthetic */ PermissionAction b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResultLauncher activityResultLauncher;
                FragmentActivity fragmentActivityRequireActivity;
                int i2 = i;
                PermissionAction permissionAction = this.b;
                switch (i2) {
                    case 0:
                        Map map = (Map) obj;
                        AbstractC2995aW.q(permissionAction, "this$0");
                        AbstractC2995aW.q(map, "result");
                        boolean z = !map.containsValue(Boolean.FALSE);
                        boolean z2 = false;
                        for (String str : map.keySet()) {
                            Objects.toString(map.get(str));
                            LifecycleOwner lifecycleOwner = permissionAction.b;
                            if (lifecycleOwner instanceof AppCompatActivity) {
                                fragmentActivityRequireActivity = (FragmentActivity) lifecycleOwner;
                            } else if (lifecycleOwner instanceof Fragment) {
                                fragmentActivityRequireActivity = ((Fragment) lifecycleOwner).requireActivity();
                            }
                            boolean zShouldShowRequestPermissionRationale = ActivityCompat.shouldShowRequestPermissionRationale(fragmentActivityRequireActivity, str);
                            if (!z2) {
                                z2 = !zShouldShowRequestPermissionRationale;
                            }
                            break;
                        }
                        if (!z && z2 && (activityResultLauncher = permissionAction.d) != null) {
                            Intent intent = new Intent();
                            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", permissionAction.f2791a.getPackageName(), null));
                            activityResultLauncher.launch(intent);
                            break;
                        }
                        break;
                    default:
                        AbstractC2995aW.q(permissionAction, "this$0");
                        AbstractC2995aW.q((ActivityResult) obj, "it");
                        break;
                }
            }
        };
        final int i2 = 1;
        ActivityResultCallback activityResultCallback2 = new ActivityResultCallback(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eU
            public final /* synthetic */ PermissionAction b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResultLauncher activityResultLauncher;
                FragmentActivity fragmentActivityRequireActivity;
                int i3 = i2;
                PermissionAction permissionAction = this.b;
                switch (i3) {
                    case 0:
                        Map map = (Map) obj;
                        AbstractC2995aW.q(permissionAction, "this$0");
                        AbstractC2995aW.q(map, "result");
                        boolean z = !map.containsValue(Boolean.FALSE);
                        boolean z2 = false;
                        for (String str : map.keySet()) {
                            Objects.toString(map.get(str));
                            LifecycleOwner lifecycleOwner = permissionAction.b;
                            if (lifecycleOwner instanceof AppCompatActivity) {
                                fragmentActivityRequireActivity = (FragmentActivity) lifecycleOwner;
                            } else if (lifecycleOwner instanceof Fragment) {
                                fragmentActivityRequireActivity = ((Fragment) lifecycleOwner).requireActivity();
                            }
                            boolean zShouldShowRequestPermissionRationale = ActivityCompat.shouldShowRequestPermissionRationale(fragmentActivityRequireActivity, str);
                            if (!z2) {
                                z2 = !zShouldShowRequestPermissionRationale;
                            }
                            break;
                        }
                        if (!z && z2 && (activityResultLauncher = permissionAction.d) != null) {
                            Intent intent = new Intent();
                            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", permissionAction.f2791a.getPackageName(), null));
                            activityResultLauncher.launch(intent);
                            break;
                        }
                        break;
                    default:
                        AbstractC2995aW.q(permissionAction, "this$0");
                        AbstractC2995aW.q((ActivityResult) obj, "it");
                        break;
                }
            }
        };
        LifecycleOwner lifecycleOwner = this.b;
        if (lifecycleOwner instanceof AppCompatActivity) {
            this.c = ((AppCompatActivity) lifecycleOwner).registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), activityResultCallback);
            this.d = ((AppCompatActivity) lifecycleOwner).registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), activityResultCallback2);
        } else if (lifecycleOwner instanceof Fragment) {
            this.c = ((Fragment) lifecycleOwner).registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), activityResultCallback);
            this.d = ((Fragment) lifecycleOwner).registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), activityResultCallback2);
        }
    }
}
