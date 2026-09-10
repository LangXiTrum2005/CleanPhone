package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.basic.lib.basic.BasicRvViewHolderNotBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseRvAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.ShootEffect;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ItemRvLightSaberEffectLayoutBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class RvLightSaberEffectChangeAdapter extends BaseRvAdapter<ShootEffect, EffectViewHolder> {

    public static final class EffectViewHolder extends BaseRvAdapter.ViewHolder<ShootEffect, ItemRvLightSaberEffectLayoutBinding> {
        @Override // com.basic.lib.basic.BasicRvViewHolderNotBinding
        public final void c(Object obj) {
            ((ItemRvLightSaberEffectLayoutBinding) this.b).ivEffect.setBackgroundResource(((ShootEffect) obj).getEffectId());
        }

        @Override // com.basic.lib.basic.BasicRvViewHolderNotBinding
        public final void d(boolean z) {
            super.d(z);
            ViewBinding viewBinding = this.b;
            ((ItemRvLightSaberEffectLayoutBinding) viewBinding).ivBorder.setVisibility(this.itemView.isSelected() ? 0 : 8);
            ((ItemRvLightSaberEffectLayoutBinding) viewBinding).ivTick.setVisibility(this.itemView.isSelected() ? 0 : 8);
            ((ItemRvLightSaberEffectLayoutBinding) viewBinding).ivStroke.setVisibility(this.itemView.isSelected() ? 8 : 0);
        }
    }

    @Override // com.basic.lib.withbinding.BasicRvAdapter
    public final BasicRvViewHolderNotBinding c(ViewGroup viewGroup, int i) {
        AbstractC2995aW.q(viewGroup, "parent");
        ItemRvLightSaberEffectLayoutBinding itemRvLightSaberEffectLayoutBindingInflate = ItemRvLightSaberEffectLayoutBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AbstractC2995aW.p(itemRvLightSaberEffectLayoutBindingInflate, "inflate(...)");
        return new EffectViewHolder(itemRvLightSaberEffectLayoutBindingInflate);
    }
}
