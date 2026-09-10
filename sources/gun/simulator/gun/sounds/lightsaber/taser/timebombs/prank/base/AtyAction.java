package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.AtyAction;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class AtyAction implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleOwner f2787a;
    public ActivityResultCallback b;
    public ActivityResultLauncher c;

    public AtyAction(LifecycleOwner lifecycleOwner) {
        AbstractC2995aW.q(lifecycleOwner, "lifecycleOwner");
        this.f2787a = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public final void a(Intent intent, ActivityResultCallback activityResultCallback, ActivityOptionsCompat activityOptionsCompat) {
        AbstractC2995aW.q(intent, "intent");
        this.b = activityResultCallback;
        try {
            ActivityResultLauncher activityResultLauncher = this.c;
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(intent, activityOptionsCompat);
            } else {
                AbstractC2995aW.x0("mToActivity");
                throw null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            LifecycleOwner lifecycleOwner = this.f2787a;
            if (lifecycleOwner instanceof AppCompatActivity) {
                ((AppCompatActivity) lifecycleOwner).startActivityForResult(intent, 0, activityOptionsCompat != null ? activityOptionsCompat.toBundle() : null);
            } else if (lifecycleOwner instanceof Fragment) {
                ((Fragment) lifecycleOwner).startActivityForResult(intent, 0, activityOptionsCompat != null ? activityOptionsCompat.toBundle() : null);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreateAndRegister() {
        LifecycleOwner lifecycleOwner = this.f2787a;
        if (lifecycleOwner instanceof AppCompatActivity) {
            final int i = 0;
            ActivityResultLauncher activityResultLauncherRegisterForActivityResult = ((AppCompatActivity) lifecycleOwner).registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W6
                public final /* synthetic */ AtyAction b;

                {
                    this.b = this;
                }

                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    int i2 = i;
                    AtyAction atyAction = this.b;
                    ActivityResult activityResult = (ActivityResult) obj;
                    switch (i2) {
                        case 0:
                            AbstractC2995aW.q(atyAction, "this$0");
                            ActivityResultCallback activityResultCallback = atyAction.b;
                            if (activityResultCallback != null) {
                                AbstractC2995aW.n(activityResult);
                                activityResultCallback.onActivityResult(activityResult);
                            }
                            break;
                        default:
                            AbstractC2995aW.q(atyAction, "this$0");
                            ActivityResultCallback activityResultCallback2 = atyAction.b;
                            if (activityResultCallback2 != null) {
                                AbstractC2995aW.n(activityResult);
                                activityResultCallback2.onActivityResult(activityResult);
                            }
                            break;
                    }
                }
            });
            AbstractC2995aW.p(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
            this.c = activityResultLauncherRegisterForActivityResult;
            return;
        }
        if (lifecycleOwner instanceof Fragment) {
            final int i2 = 1;
            ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = ((Fragment) lifecycleOwner).registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W6
                public final /* synthetic */ AtyAction b;

                {
                    this.b = this;
                }

                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    int i3 = i2;
                    AtyAction atyAction = this.b;
                    ActivityResult activityResult = (ActivityResult) obj;
                    switch (i3) {
                        case 0:
                            AbstractC2995aW.q(atyAction, "this$0");
                            ActivityResultCallback activityResultCallback = atyAction.b;
                            if (activityResultCallback != null) {
                                AbstractC2995aW.n(activityResult);
                                activityResultCallback.onActivityResult(activityResult);
                            }
                            break;
                        default:
                            AbstractC2995aW.q(atyAction, "this$0");
                            ActivityResultCallback activityResultCallback2 = atyAction.b;
                            if (activityResultCallback2 != null) {
                                AbstractC2995aW.n(activityResult);
                                activityResultCallback2.onActivityResult(activityResult);
                            }
                            break;
                    }
                }
            });
            AbstractC2995aW.p(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
            this.c = activityResultLauncherRegisterForActivityResult2;
        }
    }
}
