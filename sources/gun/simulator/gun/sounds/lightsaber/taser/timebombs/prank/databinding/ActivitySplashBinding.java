package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivitySplashBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout conNativeAdPlacement;

    @NonNull
    public final ImageView ivAdPlacementSplash;

    @NonNull
    public final LottieAnimationView lavLoading;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View vBottomLine;

    private ActivitySplashBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull LottieAnimationView lottieAnimationView, @NonNull View view) {
        this.rootView = constraintLayout;
        this.conNativeAdPlacement = constraintLayout2;
        this.ivAdPlacementSplash = imageView;
        this.lavLoading = lottieAnimationView;
        this.vBottomLine = view;
    }

    @NonNull
    public static ActivitySplashBinding bind(@NonNull View view) {
        int i = R.id.con_native_ad_placement;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_native_ad_placement);
        if (constraintLayout != null) {
            i = R.id.iv_ad_placement_splash;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_ad_placement_splash);
            if (imageView != null) {
                i = R.id.lav_loading;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.lav_loading);
                if (lottieAnimationView != null) {
                    i = R.id.v_bottom_line;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.v_bottom_line);
                    if (viewFindChildViewById != null) {
                        return new ActivitySplashBinding((ConstraintLayout) view, constraintLayout, imageView, lottieAnimationView, viewFindChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySplashBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySplashBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_splash, viewGroup, false);
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
