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
public final class DialogCheckNetworkBinding implements ViewBinding {

    @NonNull
    public final TextView btTryAgain;

    @NonNull
    public final ConstraintLayout conLoadingReward;

    @NonNull
    public final ImageView ivNotNetwork;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvFailLoadAds;

    @NonNull
    public final TextView tvNotInternet;

    private DialogCheckNetworkBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.btTryAgain = textView;
        this.conLoadingReward = constraintLayout2;
        this.ivNotNetwork = imageView;
        this.tvFailLoadAds = textView2;
        this.tvNotInternet = textView3;
    }

    @NonNull
    public static DialogCheckNetworkBinding bind(@NonNull View view) {
        int i = R.id.bt_try_again;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.bt_try_again);
        if (textView != null) {
            i = R.id.con_loading_reward;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_loading_reward);
            if (constraintLayout != null) {
                i = R.id.iv_not_network;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_not_network);
                if (imageView != null) {
                    i = R.id.tv_fail_load_ads;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_fail_load_ads);
                    if (textView2 != null) {
                        i = R.id.tv_not_internet;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_not_internet);
                        if (textView3 != null) {
                            return new DialogCheckNetworkBinding((ConstraintLayout) view, textView, constraintLayout, imageView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogCheckNetworkBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogCheckNetworkBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_check_network, viewGroup, false);
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
