package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.basic.lib.basic.BasicRvViewHolderNotBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseRvAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ItemRvLaserBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class RvLaserSelectAdapter extends BaseRvAdapter<Integer, LaserViewHolder> {

    public static final class LaserViewHolder extends BaseRvAdapter.ViewHolder<Integer, ItemRvLaserBinding> {
        @Override // com.basic.lib.basic.BasicRvViewHolderNotBinding
        public final void c(Object obj) {
            ((ItemRvLaserBinding) this.b).ivLaser.setImageResource(((Number) obj).intValue());
        }

        @Override // com.basic.lib.basic.BasicRvViewHolderNotBinding
        public final void d(boolean z) {
            super.d(z);
            ViewBinding viewBinding = this.b;
            ((ItemRvLaserBinding) viewBinding).ivBorder.setVisibility(this.itemView.isSelected() ? 0 : 8);
            ((ItemRvLaserBinding) viewBinding).ivTick.setVisibility(this.itemView.isSelected() ? 0 : 8);
        }
    }

    @Override // com.basic.lib.withbinding.BasicRvAdapter
    public final BasicRvViewHolderNotBinding c(ViewGroup viewGroup, int i) {
        AbstractC2995aW.q(viewGroup, "parent");
        ItemRvLaserBinding itemRvLaserBindingInflate = ItemRvLaserBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AbstractC2995aW.p(itemRvLaserBindingInflate, "inflate(...)");
        return new LaserViewHolder(itemRvLaserBindingInflate);
    }
}
