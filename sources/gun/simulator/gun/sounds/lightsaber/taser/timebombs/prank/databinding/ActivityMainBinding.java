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
public final class ActivityMainBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout activityMain;

    @NonNull
    public final ConstraintLayout conNativeAdPlacement;

    @NonNull
    public final ConstraintLayout conTitle;

    @NonNull
    public final ImageView imgSetting;

    @NonNull
    public final ImageView ivBg;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView rvHomeGun;

    @NonNull
    public final StatusBarFitView statusBar;

    @NonNull
    public final TextView tvAppName;

    private ActivityMainBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RecyclerView recyclerView, @NonNull StatusBarFitView statusBarFitView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.activityMain = constraintLayout2;
        this.conNativeAdPlacement = constraintLayout3;
        this.conTitle = constraintLayout4;
        this.imgSetting = imageView;
        this.ivBg = imageView2;
        this.rvHomeGun = recyclerView;
        this.statusBar = statusBarFitView;
        this.tvAppName = textView;
    }

    @NonNull
    public static ActivityMainBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.con_native_ad_placement;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_native_ad_placement);
        if (constraintLayout2 != null) {
            i = R.id.con_title;
            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_title);
            if (constraintLayout3 != null) {
                i = R.id.img_setting;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_setting);
                if (imageView != null) {
                    i = R.id.iv_bg;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bg);
                    if (imageView2 != null) {
                        i = R.id.rv_home_gun;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_home_gun);
                        if (recyclerView != null) {
                            i = R.id.status_bar;
                            StatusBarFitView statusBarFitView = (StatusBarFitView) ViewBindings.findChildViewById(view, R.id.status_bar);
                            if (statusBarFitView != null) {
                                i = R.id.tv_app_name;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_name);
                                if (textView != null) {
                                    return new ActivityMainBinding(constraintLayout, constraintLayout, constraintLayout2, constraintLayout3, imageView, imageView2, recyclerView, statusBarFitView, textView);
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
    public static ActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
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
