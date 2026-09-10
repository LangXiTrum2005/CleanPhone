package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.basic.lib.basic.BasicRvViewHolderNotBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseRvAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.ShootEffect;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ItemRvEffectLayoutBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class RvEffectChangeAdapter extends BaseRvAdapter<ShootEffect, EffectViewHolder> {

    public static final class EffectViewHolder extends BaseRvAdapter.ViewHolder<ShootEffect, ItemRvEffectLayoutBinding> {
        @Override // com.basic.lib.basic.BasicRvViewHolderNotBinding
        public final void c(Object obj) {
            ShootEffect shootEffect = (ShootEffect) obj;
            ItemRvEffectLayoutBinding itemRvEffectLayoutBinding = (ItemRvEffectLayoutBinding) this.b;
            itemRvEffectLayoutBinding.ivEffect.setBackgroundResource(shootEffect.getEffectId());
            itemRvEffectLayoutBinding.tvEffect.setText(this.f208a.getResources().getText(shootEffect.getEffectNameId()));
        }

        @Override // com.basic.lib.basic.BasicRvViewHolderNotBinding
        public final void d(boolean z) {
            super.d(z);
            ViewBinding viewBinding = this.b;
            ((ItemRvEffectLayoutBinding) viewBinding).ivBorder.setVisibility(this.itemView.isSelected() ? 0 : 8);
            ((ItemRvEffectLayoutBinding) viewBinding).ivTick.setVisibility(this.itemView.isSelected() ? 0 : 8);
            ((ItemRvEffectLayoutBinding) viewBinding).ivStroke.setVisibility(this.itemView.isSelected() ? 8 : 0);
        }
    }

    @Override // com.basic.lib.withbinding.BasicRvAdapter
    public final BasicRvViewHolderNotBinding c(ViewGroup viewGroup, int i) {
        AbstractC2995aW.q(viewGroup, "parent");
        ItemRvEffectLayoutBinding itemRvEffectLayoutBindingInflate = ItemRvEffectLayoutBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AbstractC2995aW.p(itemRvEffectLayoutBindingInflate, "inflate(...)");
        return new EffectViewHolder(itemRvEffectLayoutBindingInflate);
    }
}
