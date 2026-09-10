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
public final class ItemRvWeaponSortBinding implements ViewBinding {

    @NonNull
    public final ImageView imgWeapon;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvWeapon;

    @NonNull
    public final ConstraintLayout weaponSort;

    private ItemRvWeaponSortBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.imgWeapon = imageView;
        this.tvWeapon = textView;
        this.weaponSort = constraintLayout2;
    }

    @NonNull
    public static ItemRvWeaponSortBinding bind(@NonNull View view) {
        int i = R.id.img_weapon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_weapon);
        if (imageView != null) {
            i = R.id.tv_weapon;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weapon);
            if (textView != null) {
                i = R.id.weapon_sort;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.weapon_sort);
                if (constraintLayout != null) {
                    return new ItemRvWeaponSortBinding((ConstraintLayout) view, imageView, textView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemRvWeaponSortBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemRvWeaponSortBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_rv_weapon_sort, viewGroup, false);
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
