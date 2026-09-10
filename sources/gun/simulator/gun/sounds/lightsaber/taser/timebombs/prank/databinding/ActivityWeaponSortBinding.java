package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.StatusBarFitView;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityWeaponSortBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout conNativeAdPlacement;

    @NonNull
    public final ConstraintLayout conTitle;

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final ImageView ivBg;

    @NonNull
    public final ImageView ivSetting;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView rvWeapons;

    @NonNull
    public final StatusBarFitView statusBar;

    @NonNull
    public final TextView tvWeaponSort;

    private ActivityWeaponSortBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull RecyclerView recyclerView, @NonNull StatusBarFitView statusBarFitView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.conNativeAdPlacement = constraintLayout2;
        this.conTitle = constraintLayout3;
        this.ivBack = imageView;
        this.ivBg = imageView2;
        this.ivSetting = imageView3;
        this.rvWeapons = recyclerView;
        this.statusBar = statusBarFitView;
        this.tvWeaponSort = textView;
    }

    @NonNull
    public static ActivityWeaponSortBinding bind(@NonNull View view) {
        int i = R.id.con_native_ad_placement;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_native_ad_placement);
        if (constraintLayout != null) {
            i = R.id.con_title;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_title);
            if (constraintLayout2 != null) {
                i = R.id.iv_back;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
                if (imageView != null) {
                    i = R.id.iv_bg;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bg);
                    if (imageView2 != null) {
                        i = R.id.iv_setting;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_setting);
                        if (imageView3 != null) {
                            i = R.id.rv_weapons;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_weapons);
                            if (recyclerView != null) {
                                i = R.id.status_bar;
                                StatusBarFitView statusBarFitView = (StatusBarFitView) ViewBindings.findChildViewById(view, R.id.status_bar);
                                if (statusBarFitView != null) {
                                    i = R.id.tv_weapon_sort;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weapon_sort);
                                    if (textView != null) {
                                        return new ActivityWeaponSortBinding((ConstraintLayout) view, constraintLayout, constraintLayout2, imageView, imageView2, imageView3, recyclerView, statusBarFitView, textView);
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
    public static ActivityWeaponSortBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityWeaponSortBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_weapon_sort, viewGroup, false);
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
