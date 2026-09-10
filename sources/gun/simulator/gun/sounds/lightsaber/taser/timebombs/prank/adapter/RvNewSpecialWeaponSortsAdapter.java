package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.basic.lib.basic.BasicRvViewHolderNotBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseRvAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.WeaponSorts;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ItemRvNewSpecialWeaponSortBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class RvNewSpecialWeaponSortsAdapter extends BaseRvAdapter<WeaponSorts, ViewHolder> {

    public static final class ViewHolder extends BaseRvAdapter.ViewHolder<WeaponSorts, ItemRvNewSpecialWeaponSortBinding> {
        @Override // com.basic.lib.basic.BasicRvViewHolderNotBinding
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final void c(WeaponSorts weaponSorts) {
            ItemRvNewSpecialWeaponSortBinding itemRvNewSpecialWeaponSortBinding = (ItemRvNewSpecialWeaponSortBinding) this.b;
            itemRvNewSpecialWeaponSortBinding.ivWeapon.setImageResource(weaponSorts.getBackgroundSource());
            itemRvNewSpecialWeaponSortBinding.tvWeapons.setText(this.f208a.getResources().getString(weaponSorts.getCategory()));
            itemRvNewSpecialWeaponSortBinding.tvComingSoon.setVisibility(getPosition() == 6 ? 0 : 8);
        }
    }

    @Override // com.basic.lib.withbinding.BasicRvAdapter
    public final BasicRvViewHolderNotBinding c(ViewGroup viewGroup, int i) {
        AbstractC2995aW.q(viewGroup, "parent");
        ItemRvNewSpecialWeaponSortBinding itemRvNewSpecialWeaponSortBindingInflate = ItemRvNewSpecialWeaponSortBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AbstractC2995aW.p(itemRvNewSpecialWeaponSortBindingInflate, "inflate(...)");
        return new ViewHolder(itemRvNewSpecialWeaponSortBindingInflate);
    }

    @Override // com.basic.lib.withbinding.BasicRvAdapter
    /* JADX INFO: renamed from: e */
    public final void onBindViewHolder(BasicRvViewHolderNotBinding basicRvViewHolderNotBinding, int i) {
        ViewHolder viewHolder = (ViewHolder) basicRvViewHolderNotBinding;
        AbstractC2995aW.q(viewHolder, "holder");
        WeaponSorts weaponSorts = (WeaponSorts) b(i);
        if (weaponSorts != null) {
            viewHolder.c(weaponSorts);
        }
    }

    @Override // com.basic.lib.withbinding.BasicRvAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        AbstractC2995aW.q(viewHolder2, "holder");
        WeaponSorts weaponSorts = (WeaponSorts) b(i);
        if (weaponSorts != null) {
            viewHolder2.c(weaponSorts);
        }
    }
}
