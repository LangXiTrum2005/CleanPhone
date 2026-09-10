package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class DialogLockHintBinding implements ViewBinding {

    @NonNull
    public final Space bottom;

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final ImageView ivWeapon;

    @NonNull
    public final LottieAnimationView lavWeapon;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Space spaceTop;

    @NonNull
    public final TextView tvAdTime;

    @NonNull
    public final TextView tvExit;

    @NonNull
    public final TextView tvHint;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvWeapon;

    private DialogLockHintBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Space space, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LottieAnimationView lottieAnimationView, @NonNull Space space2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = constraintLayout;
        this.bottom = space;
        this.ivClose = imageView;
        this.ivWeapon = imageView2;
        this.lavWeapon = lottieAnimationView;
        this.spaceTop = space2;
        this.tvAdTime = textView;
        this.tvExit = textView2;
        this.tvHint = textView3;
        this.tvTitle = textView4;
        this.tvWeapon = textView5;
    }

    @NonNull
    public static DialogLockHintBinding bind(@NonNull View view) {
        int i = R.id.bottom;
        Space space = (Space) ViewBindings.findChildViewById(view, R.id.bottom);
        if (space != null) {
            i = R.id.iv_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
            if (imageView != null) {
                i = R.id.iv_weapon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_weapon);
                if (imageView2 != null) {
                    i = R.id.lav_weapon;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.lav_weapon);
                    if (lottieAnimationView != null) {
                        i = R.id.space_top;
                        Space space2 = (Space) ViewBindings.findChildViewById(view, R.id.space_top);
                        if (space2 != null) {
                            i = R.id.tv_ad_time;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ad_time);
                            if (textView != null) {
                                i = R.id.tv_exit;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_exit);
                                if (textView2 != null) {
                                    i = R.id.tv_hint;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_hint);
                                    if (textView3 != null) {
                                        i = R.id.tv_title;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                        if (textView4 != null) {
                                            i = R.id.tv_weapon;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weapon);
                                            if (textView5 != null) {
                                                return new DialogLockHintBinding((ConstraintLayout) view, space, imageView, imageView2, lottieAnimationView, space2, textView, textView2, textView3, textView4, textView5);
                                            }
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
    public static DialogLockHintBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogLockHintBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_lock_hint, viewGroup, false);
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
