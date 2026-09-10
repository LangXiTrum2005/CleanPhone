package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.KnobProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutWeaponBulletsNumberBinding implements ViewBinding {

    @NonNull
    public final ImageView ivBullets;

    @NonNull
    public final KnobProgressBar kpbBulletsNumber;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView tvBulletsNumberAll;

    @NonNull
    public final TextView tvBulletsNumberInCartridgeClip;

    @NonNull
    public final TextView tvSeparatorBulletsNumber;

    @NonNull
    public final TextView tvUnlimited;

    private LayoutWeaponBulletsNumberBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull KnobProgressBar knobProgressBar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = view;
        this.ivBullets = imageView;
        this.kpbBulletsNumber = knobProgressBar;
        this.tvBulletsNumberAll = textView;
        this.tvBulletsNumberInCartridgeClip = textView2;
        this.tvSeparatorBulletsNumber = textView3;
        this.tvUnlimited = textView4;
    }

    @NonNull
    public static LayoutWeaponBulletsNumberBinding bind(@NonNull View view) {
        int i = R.id.iv_bullets;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bullets);
        if (imageView != null) {
            i = R.id.kpb_bullets_number;
            KnobProgressBar knobProgressBar = (KnobProgressBar) ViewBindings.findChildViewById(view, R.id.kpb_bullets_number);
            if (knobProgressBar != null) {
                i = R.id.tv_bullets_number_all;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bullets_number_all);
                if (textView != null) {
                    i = R.id.tv_bullets_number_in_cartridge_clip;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bullets_number_in_cartridge_clip);
                    if (textView2 != null) {
                        i = R.id.tv_separator_bullets_number;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_separator_bullets_number);
                        if (textView3 != null) {
                            i = R.id.tv_unlimited;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_unlimited);
                            if (textView4 != null) {
                                return new LayoutWeaponBulletsNumberBinding(view, imageView, knobProgressBar, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutWeaponBulletsNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.layout_weapon_bullets_number, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
