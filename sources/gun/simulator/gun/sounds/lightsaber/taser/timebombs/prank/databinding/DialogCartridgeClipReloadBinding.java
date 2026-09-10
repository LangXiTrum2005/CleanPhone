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
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.StatusBarFitView;

/* JADX INFO: loaded from: classes4.dex */
public final class DialogCartridgeClipReloadBinding implements ViewBinding {

    @NonNull
    public final TextView btReload;

    @NonNull
    public final ConstraintLayout conNativeAdPlacement;

    @NonNull
    public final ConstraintLayout conWarning;

    @NonNull
    public final ImageView ivWeaponBullet;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final StatusBarFitView statusBar;

    @NonNull
    public final TextView tvOutOfAmmo;

    @NonNull
    public final TextView tvPleaseReload;

    @NonNull
    public final TextView tvTitleWarn;

    private DialogCartridgeClipReloadBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView, @NonNull StatusBarFitView statusBarFitView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = constraintLayout;
        this.btReload = textView;
        this.conNativeAdPlacement = constraintLayout2;
        this.conWarning = constraintLayout3;
        this.ivWeaponBullet = imageView;
        this.statusBar = statusBarFitView;
        this.tvOutOfAmmo = textView2;
        this.tvPleaseReload = textView3;
        this.tvTitleWarn = textView4;
    }

    @NonNull
    public static DialogCartridgeClipReloadBinding bind(@NonNull View view) {
        int i = R.id.bt_reload;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.bt_reload);
        if (textView != null) {
            i = R.id.con_native_ad_placement;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_native_ad_placement);
            if (constraintLayout != null) {
                i = R.id.con_warning;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_warning);
                if (constraintLayout2 != null) {
                    i = R.id.iv_weapon_bullet;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_weapon_bullet);
                    if (imageView != null) {
                        i = R.id.status_bar;
                        StatusBarFitView statusBarFitView = (StatusBarFitView) ViewBindings.findChildViewById(view, R.id.status_bar);
                        if (statusBarFitView != null) {
                            i = R.id.tv_out_of_ammo;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_out_of_ammo);
                            if (textView2 != null) {
                                i = R.id.tv_please_reload;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_please_reload);
                                if (textView3 != null) {
                                    i = R.id.tv_title_warn;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_warn);
                                    if (textView4 != null) {
                                        return new DialogCartridgeClipReloadBinding((ConstraintLayout) view, textView, constraintLayout, constraintLayout2, imageView, statusBarFitView, textView2, textView3, textView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogCartridgeClipReloadBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogCartridgeClipReloadBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_cartridge_clip_reload, viewGroup, false);
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
