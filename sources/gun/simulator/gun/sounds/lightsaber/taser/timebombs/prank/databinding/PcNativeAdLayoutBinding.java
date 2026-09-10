package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class PcNativeAdLayoutBinding implements ViewBinding {

    @NonNull
    public final TextView pcAdAdvertiser;

    @NonNull
    public final ImageView pcAdAppIcon;

    @NonNull
    public final TextView pcAdBody;

    @NonNull
    public final Button pcAdCallToAction;

    @NonNull
    public final TextView pcAdHeadline;

    @NonNull
    public final RelativeLayout pcAdMedia;

    @NonNull
    public final TextView pcAdPrice;

    @NonNull
    public final RatingBar pcAdStars;

    @NonNull
    public final TextView pcAdStore;

    @NonNull
    public final FrameLayout pcNativeView;

    @NonNull
    private final FrameLayout rootView;

    private PcNativeAdLayoutBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull Button button, @NonNull TextView textView3, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView4, @NonNull RatingBar ratingBar, @NonNull TextView textView5, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.pcAdAdvertiser = textView;
        this.pcAdAppIcon = imageView;
        this.pcAdBody = textView2;
        this.pcAdCallToAction = button;
        this.pcAdHeadline = textView3;
        this.pcAdMedia = relativeLayout;
        this.pcAdPrice = textView4;
        this.pcAdStars = ratingBar;
        this.pcAdStore = textView5;
        this.pcNativeView = frameLayout2;
    }

    @NonNull
    public static PcNativeAdLayoutBinding bind(@NonNull View view) {
        int i = R.id.pc_ad_advertiser;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.pc_ad_advertiser);
        if (textView != null) {
            i = R.id.pc_ad_app_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.pc_ad_app_icon);
            if (imageView != null) {
                i = R.id.pc_ad_body;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.pc_ad_body);
                if (textView2 != null) {
                    i = R.id.pc_ad_call_to_action;
                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.pc_ad_call_to_action);
                    if (button != null) {
                        i = R.id.pc_ad_headline;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.pc_ad_headline);
                        if (textView3 != null) {
                            i = R.id.pc_ad_media;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.pc_ad_media);
                            if (relativeLayout != null) {
                                i = R.id.pc_ad_price;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.pc_ad_price);
                                if (textView4 != null) {
                                    i = R.id.pc_ad_stars;
                                    RatingBar ratingBar = (RatingBar) ViewBindings.findChildViewById(view, R.id.pc_ad_stars);
                                    if (ratingBar != null) {
                                        i = R.id.pc_ad_store;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.pc_ad_store);
                                        if (textView5 != null) {
                                            FrameLayout frameLayout = (FrameLayout) view;
                                            return new PcNativeAdLayoutBinding(frameLayout, textView, imageView, textView2, button, textView3, relativeLayout, textView4, ratingBar, textView5, frameLayout);
                                        }
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
    public static PcNativeAdLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PcNativeAdLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.pc_native_ad_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
