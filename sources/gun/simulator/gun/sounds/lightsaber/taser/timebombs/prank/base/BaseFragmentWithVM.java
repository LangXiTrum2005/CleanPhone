package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base;

import androidx.lifecycle.ViewModel;
import androidx.viewbinding.ViewBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X9;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseFragmentWithVM<VB extends ViewBinding, VM extends ViewModel> extends BaseFragment<VB> {
    public BaseFragmentWithVM() {
        AbstractC2340Cl.I(new X9(this, 2));
    }

    public abstract Class c();
}
