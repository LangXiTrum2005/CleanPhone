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
public final class DialogLoadingRewardAdsBinding implements ViewBinding {

    @NonNull
    public final TextView btTryAgain;

    @NonNull
    public final ConstraintLayout conLoadingReward;

    @NonNull
    public final ConstraintLayout conLoadingRewardError;

    @NonNull
    public final ImageView ivLoading;

    @NonNull
    public final ImageView ivNotNetwork;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvFailLoadAds;

    @NonNull
    public final TextView tvLoading;

    private DialogLoadingRewardAdsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.btTryAgain = textView;
        this.conLoadingReward = constraintLayout2;
        this.conLoadingRewardError = constraintLayout3;
        this.ivLoading = imageView;
        this.ivNotNetwork = imageView2;
        this.tvFailLoadAds = textView2;
        this.tvLoading = textView3;
    }

    @NonNull
    public static DialogLoadingRewardAdsBinding bind(@NonNull View view) {
        int i = R.id.bt_try_again;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.bt_try_again);
        if (textView != null) {
            i = R.id.con_loading_reward;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_loading_reward);
            if (constraintLayout != null) {
                i = R.id.con_loading_reward_error;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_loading_reward_error);
                if (constraintLayout2 != null) {
                    i = R.id.iv_loading;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_loading);
                    if (imageView != null) {
                        i = R.id.iv_not_network;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_not_network);
                        if (imageView2 != null) {
                            i = R.id.tv_fail_load_ads;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_fail_load_ads);
                            if (textView2 != null) {
                                i = R.id.tv_loading;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_loading);
                                if (textView3 != null) {
                                    return new DialogLoadingRewardAdsBinding((ConstraintLayout) view, textView, constraintLayout, constraintLayout2, imageView, imageView2, textView2, textView3);
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
    public static DialogLoadingRewardAdsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogLoadingRewardAdsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_loading_reward_ads, viewGroup, false);
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
