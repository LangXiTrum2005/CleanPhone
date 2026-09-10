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
public final class DialogExitRetainBinding implements ViewBinding {

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
    public final TextView tvExit;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvTry;

    private DialogExitRetainBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LottieAnimationView lottieAnimationView, @NonNull Space space, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.ivClose = imageView;
        this.ivWeapon = imageView2;
        this.lavWeapon = lottieAnimationView;
        this.spaceTop = space;
        this.tvExit = textView;
        this.tvTitle = textView2;
        this.tvTry = textView3;
    }

    @NonNull
    public static DialogExitRetainBinding bind(@NonNull View view) {
        int i = R.id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
        if (imageView != null) {
            i = R.id.iv_weapon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_weapon);
            if (imageView2 != null) {
                i = R.id.lav_weapon;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.lav_weapon);
                if (lottieAnimationView != null) {
                    i = R.id.space_top;
                    Space space = (Space) ViewBindings.findChildViewById(view, R.id.space_top);
                    if (space != null) {
                        i = R.id.tv_exit;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_exit);
                        if (textView != null) {
                            i = R.id.tv_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                            if (textView2 != null) {
                                i = R.id.tv_try;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_try);
                                if (textView3 != null) {
                                    return new DialogExitRetainBinding((ConstraintLayout) view, imageView, imageView2, lottieAnimationView, space, textView, textView2, textView3);
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
    public static DialogExitRetainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogExitRetainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_exit_retain, viewGroup, false);
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
