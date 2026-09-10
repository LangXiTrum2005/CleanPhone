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
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutBottomPlacementNativeAdBinding implements ViewBinding {

    @NonNull
    public final View adMediaView;

    @NonNull
    public final ImageView ivAdLabel;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View view2;

    @NonNull
    public final View view3;

    @NonNull
    public final View view4;

    private LayoutBottomPlacementNativeAdBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull View view2, @NonNull View view3, @NonNull View view4) {
        this.rootView = constraintLayout;
        this.adMediaView = view;
        this.ivAdLabel = imageView;
        this.view2 = view2;
        this.view3 = view3;
        this.view4 = view4;
    }

    @NonNull
    public static LayoutBottomPlacementNativeAdBinding bind(@NonNull View view) {
        int i = R.id.ad_media_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.ad_media_view);
        if (viewFindChildViewById != null) {
            i = R.id.iv_ad_label;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_ad_label);
            if (imageView != null) {
                i = R.id.view2;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.view2);
                if (viewFindChildViewById2 != null) {
                    i = R.id.view3;
                    View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.view3);
                    if (viewFindChildViewById3 != null) {
                        i = R.id.view4;
                        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.view4);
                        if (viewFindChildViewById4 != null) {
                            return new LayoutBottomPlacementNativeAdBinding((ConstraintLayout) view, viewFindChildViewById, imageView, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutBottomPlacementNativeAdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutBottomPlacementNativeAdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_bottom_placement_native_ad, viewGroup, false);
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
