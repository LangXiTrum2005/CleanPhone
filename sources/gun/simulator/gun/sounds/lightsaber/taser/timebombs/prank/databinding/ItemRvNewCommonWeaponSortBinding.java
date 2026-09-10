package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ItemRvNewCommonWeaponSortBinding implements ViewBinding {

    @NonNull
    public final ImageView ivWeapon;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvWeapons;

    private ItemRvNewCommonWeaponSortBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.ivWeapon = imageView;
        this.tvWeapons = textView;
    }

    @NonNull
    public static ItemRvNewCommonWeaponSortBinding bind(@NonNull View view) {
        int i = R.id.iv_weapon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_weapon);
        if (imageView != null) {
            i = R.id.tv_weapons;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weapons);
            if (textView != null) {
                return new ItemRvNewCommonWeaponSortBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemRvNewCommonWeaponSortBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemRvNewCommonWeaponSortBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_rv_new_common_weapon_sort, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
