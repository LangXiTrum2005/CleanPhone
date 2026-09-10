package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.basic.lib.basic.BasicRvViewHolderNotBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseRvAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Bomb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.LightSaber;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.MechanicalGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Taser;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.TechnologyGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.WeaponSorts;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ItemRvGunDisplayBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ItemRvGunLightsaberDisplayBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2498In;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
public final class RvGunDisplayAdapter extends BaseRvAdapter<Weapon, BaseRvAdapter.ViewHolder<Weapon, ?>> {
    public final WeaponSorts e;
    public final int f = 1;

    public static final class LightSaberViewHolder extends BaseRvAdapter.ViewHolder<Weapon, ItemRvGunLightsaberDisplayBinding> {
        public final WeaponSorts c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LightSaberViewHolder(ItemRvGunLightsaberDisplayBinding itemRvGunLightsaberDisplayBinding, WeaponSorts weaponSorts) {
            super(itemRvGunLightsaberDisplayBinding);
            AbstractC2995aW.q(weaponSorts, "weaponSorts");
            this.c = weaponSorts;
        }

        @Override // com.basic.lib.basic.BasicRvViewHolderNotBinding
        public final void c(Object obj) {
            Weapon weapon = (Weapon) obj;
            ItemRvGunLightsaberDisplayBinding itemRvGunLightsaberDisplayBinding = (ItemRvGunLightsaberDisplayBinding) this.b;
            itemRvGunLightsaberDisplayBinding.ivGunDisplayBg.setImageResource(this.c.getCardBackground());
            itemRvGunLightsaberDisplayBinding.ivGun.setImageResource(weapon.getThumbnailId());
            C2498In c2498In = App.n;
            WD.D(C2498In.g(), AbstractC4437qp.b, 0, new b(weapon, this, null), 2);
            if (weapon.getNameId() == R.string.lightsaber_twelve) {
                itemRvGunLightsaberDisplayBinding.spaceBottom.setVisibility(0);
            }
        }
    }

    public static final class ViewHolder extends BaseRvAdapter.ViewHolder<Weapon, ItemRvGunDisplayBinding> {
        public final WeaponSorts c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemRvGunDisplayBinding itemRvGunDisplayBinding, WeaponSorts weaponSorts) {
            super(itemRvGunDisplayBinding);
            AbstractC2995aW.q(weaponSorts, "weaponSorts");
            this.c = weaponSorts;
        }

        @Override // com.basic.lib.basic.BasicRvViewHolderNotBinding
        public final void c(Object obj) {
            Weapon weapon = (Weapon) obj;
            ItemRvGunDisplayBinding itemRvGunDisplayBinding = (ItemRvGunDisplayBinding) this.b;
            itemRvGunDisplayBinding.ivGunDisplayBg.setImageResource(this.c.getCardBackground());
            itemRvGunDisplayBinding.tvMachineGunName.setTextSize(13.0f);
            itemRvGunDisplayBinding.spaceBottom.setVisibility(8);
            itemRvGunDisplayBinding.conTitle.setVisibility(0);
            itemRvGunDisplayBinding.ivLabelBullet.setVisibility(0);
            itemRvGunDisplayBinding.tvBulletsNumber.setVisibility(0);
            boolean z = weapon instanceof MechanicalGun;
            Context context = this.f208a;
            if (z) {
                itemRvGunDisplayBinding.conTitle.setVisibility(0);
                itemRvGunDisplayBinding.tvMachineGunName.setText(context.getResources().getString(weapon.getNameId()));
                if (weapon.getNameId() == R.string.weapon_name_m2_flamethrower) {
                    itemRvGunDisplayBinding.tvMachineGunName.setTextSize(11.0f);
                    ViewGroup.LayoutParams layoutParams = itemRvGunDisplayBinding.tvMachineGunName.getLayoutParams();
                    AbstractC2995aW.o(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.verticalBias = 1.0f;
                    itemRvGunDisplayBinding.tvMachineGunName.setLayoutParams(layoutParams2);
                }
                itemRvGunDisplayBinding.tvBulletsNumber.setText(String.valueOf(weapon.getMagazineCapacity()));
                itemRvGunDisplayBinding.ivGun.setImageResource(weapon.getThumbnailId());
            } else if (weapon instanceof Bomb) {
                itemRvGunDisplayBinding.conTitle.setVisibility(0);
                itemRvGunDisplayBinding.bgTextMachineGun.setBackgroundResource(R.drawable.bg_title_time_bomb);
                itemRvGunDisplayBinding.tvMachineGunName.setText(context.getResources().getString(weapon.getNameId()));
                itemRvGunDisplayBinding.ivLabelBullet.setVisibility(8);
                itemRvGunDisplayBinding.tvBulletsNumber.setVisibility(8);
                itemRvGunDisplayBinding.ivGun.setImageResource(weapon.getThumbnailId());
            } else if ((weapon instanceof TechnologyGun) || (weapon instanceof Taser)) {
                itemRvGunDisplayBinding.conTitle.setVisibility(4);
                itemRvGunDisplayBinding.ivGun.setImageResource(weapon.getThumbnailId());
            }
            C2498In c2498In = App.n;
            WD.D(C2498In.g(), AbstractC4437qp.b, 0, new d(weapon, this, null), 2);
        }
    }

    public RvGunDisplayAdapter(WeaponSorts weaponSorts) {
        this.e = weaponSorts;
    }

    @Override // com.basic.lib.withbinding.BasicRvAdapter
    public final BasicRvViewHolderNotBinding c(ViewGroup viewGroup, int i) {
        AbstractC2995aW.q(viewGroup, "parent");
        WeaponSorts weaponSorts = this.e;
        if (i == 0) {
            ItemRvGunDisplayBinding itemRvGunDisplayBindingInflate = ItemRvGunDisplayBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            AbstractC2995aW.p(itemRvGunDisplayBindingInflate, "inflate(...)");
            return new ViewHolder(itemRvGunDisplayBindingInflate, weaponSorts);
        }
        ItemRvGunLightsaberDisplayBinding itemRvGunLightsaberDisplayBindingInflate = ItemRvGunLightsaberDisplayBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AbstractC2995aW.p(itemRvGunLightsaberDisplayBindingInflate, "inflate(...)");
        return new LightSaberViewHolder(itemRvGunLightsaberDisplayBindingInflate, weaponSorts);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (this.f212a.get(i) instanceof LightSaber) {
            return this.f;
        }
        return 0;
    }

    @Override // com.basic.lib.withbinding.BasicRvAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(BaseRvAdapter.ViewHolder viewHolder, int i) {
        AbstractC2995aW.q(viewHolder, "holder");
        super.onBindViewHolder(viewHolder, i);
        if (viewHolder instanceof ViewHolder) {
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            if (viewHolder2.getAdapterPosition() == getItemCount() - 1 || viewHolder2.getAdapterPosition() == getItemCount() - 2) {
                ((ItemRvGunDisplayBinding) viewHolder2.b).spaceBottom.setVisibility(0);
            }
        }
    }
}
