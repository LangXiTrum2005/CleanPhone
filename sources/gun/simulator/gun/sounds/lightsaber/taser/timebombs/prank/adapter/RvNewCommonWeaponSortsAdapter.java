package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.basic.lib.basic.BasicRvViewHolderNotBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseRvAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.WeaponSorts;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ItemRvNewCommonWeaponSortBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class RvNewCommonWeaponSortsAdapter extends BaseRvAdapter<WeaponSorts, ViewHolder> {

    public static final class ViewHolder extends BaseRvAdapter.ViewHolder<WeaponSorts, ItemRvNewCommonWeaponSortBinding> {
        @Override // com.basic.lib.basic.BasicRvViewHolderNotBinding
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final void c(WeaponSorts weaponSorts) {
            ItemRvNewCommonWeaponSortBinding itemRvNewCommonWeaponSortBinding = (ItemRvNewCommonWeaponSortBinding) this.b;
            itemRvNewCommonWeaponSortBinding.ivWeapon.setImageResource(weaponSorts.getBackgroundSource());
            itemRvNewCommonWeaponSortBinding.tvWeapons.setText(this.f208a.getResources().getString(weaponSorts.getCategory()));
        }
    }

    @Override // com.basic.lib.withbinding.BasicRvAdapter
    public final BasicRvViewHolderNotBinding c(ViewGroup viewGroup, int i) {
        AbstractC2995aW.q(viewGroup, "parent");
        ItemRvNewCommonWeaponSortBinding itemRvNewCommonWeaponSortBindingInflate = ItemRvNewCommonWeaponSortBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AbstractC2995aW.p(itemRvNewCommonWeaponSortBindingInflate, "inflate(...)");
        return new ViewHolder(itemRvNewCommonWeaponSortBindingInflate);
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
