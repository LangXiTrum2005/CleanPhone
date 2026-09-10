package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.basic.lib.basic.view.RadiusImageView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutNativeAdBinding implements ViewBinding {

    @NonNull
    public final TextView btDownload;

    @NonNull
    public final ConstraintLayout cdMediaView;

    @NonNull
    public final ImageView ivAdLabel;

    @NonNull
    public final FrameLayout ivAdMediaView;

    @NonNull
    public final RadiusImageView ivAdTitle;

    @NonNull
    public final RadiusImageView ivNativePlacement;

    @NonNull
    public final ConstraintLayout nativeAdView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvNativeAdContent;

    @NonNull
    public final TextView tvNativeAdTitle;

    private LayoutNativeAdBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull RadiusImageView radiusImageView, @NonNull RadiusImageView radiusImageView2, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.btDownload = textView;
        this.cdMediaView = constraintLayout2;
        this.ivAdLabel = imageView;
        this.ivAdMediaView = frameLayout;
        this.ivAdTitle = radiusImageView;
        this.ivNativePlacement = radiusImageView2;
        this.nativeAdView = constraintLayout3;
        this.tvNativeAdContent = textView2;
        this.tvNativeAdTitle = textView3;
    }

    @NonNull
    public static LayoutNativeAdBinding bind(@NonNull View view) {
        int i = R.id.bt_download;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.bt_download);
        if (textView != null) {
            i = R.id.cd_media_view;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.cd_media_view);
            if (constraintLayout != null) {
                i = R.id.iv_ad_label;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_ad_label);
                if (imageView != null) {
                    i = R.id.iv_ad_media_view;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.iv_ad_media_view);
                    if (frameLayout != null) {
                        i = R.id.iv_ad_title;
                        RadiusImageView radiusImageView = (RadiusImageView) ViewBindings.findChildViewById(view, R.id.iv_ad_title);
                        if (radiusImageView != null) {
                            i = R.id.iv_native_placement;
                            RadiusImageView radiusImageView2 = (RadiusImageView) ViewBindings.findChildViewById(view, R.id.iv_native_placement);
                            if (radiusImageView2 != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                i = R.id.tv_native_ad_content;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_native_ad_content);
                                if (textView2 != null) {
                                    i = R.id.tv_native_ad_title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_native_ad_title);
                                    if (textView3 != null) {
                                        return new LayoutNativeAdBinding(constraintLayout2, textView, constraintLayout, imageView, frameLayout, radiusImageView, radiusImageView2, constraintLayout2, textView2, textView3);
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
    public static LayoutNativeAdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutNativeAdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_native_ad, viewGroup, false);
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
