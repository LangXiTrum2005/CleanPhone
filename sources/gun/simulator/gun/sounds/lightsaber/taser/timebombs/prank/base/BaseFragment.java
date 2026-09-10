package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogLockHintBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractApplicationC2673Ph;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseFragment<VB extends ViewBinding> extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2790a;
    public ViewBinding b;

    public BaseFragment() {
        new AtyAction(this);
        new PermissionAction((AbstractApplicationC2673Ph) App.n.f(), this);
    }

    public abstract void a();

    public abstract DialogLockHintBinding b(LayoutInflater layoutInflater);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC2995aW.q(layoutInflater, "inflater");
        DialogLockHintBinding dialogLockHintBindingB = b(layoutInflater);
        AbstractC2995aW.q(dialogLockHintBindingB, "<set-?>");
        return dialogLockHintBindingB.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f2790a = false;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f2790a) {
            return;
        }
        a();
        this.f2790a = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }
}
