package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.underlying;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mbridge.msdk.MBridgeConstans;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4593sf0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UnderlyingRvViewHolder<T, VB extends ViewBinding> extends RecyclerView.ViewHolder implements InterfaceC4593sf0 {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2303Ba
    public final void a() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2303Ba
    public final void b(LifecycleOwner lifecycleOwner, Lifecycle.State state) {
        AbstractC2995aW.q(lifecycleOwner, "source");
        AbstractC2995aW.q(state, "targetState");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4593sf0
    public final void onClickView(View view) {
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }
}
