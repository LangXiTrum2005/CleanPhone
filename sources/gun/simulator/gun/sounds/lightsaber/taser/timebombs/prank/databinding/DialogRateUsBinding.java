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
import com.airbnb.lottie.LottieAnimationView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import per.wsj.library.AndRatingBar;

/* JADX INFO: loaded from: classes4.dex */
public final class DialogRateUsBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout clRateUs;

    @NonNull
    public final ImageView ivLogo;

    @NonNull
    public final LottieAnimationView lavFiveStar;

    @NonNull
    public final LottieAnimationView lavRating;

    @NonNull
    public final AndRatingBar ratingBar;

    @NonNull
    public final ConstraintLayout rootBg;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvDialogRateContent;

    @NonNull
    public final TextView tvDialogRateTitle;

    @NonNull
    public final TextView tvGuide;

    @NonNull
    public final TextView tvRate;

    private DialogRateUsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull LottieAnimationView lottieAnimationView, @NonNull LottieAnimationView lottieAnimationView2, @NonNull AndRatingBar andRatingBar, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = constraintLayout;
        this.clRateUs = constraintLayout2;
        this.ivLogo = imageView;
        this.lavFiveStar = lottieAnimationView;
        this.lavRating = lottieAnimationView2;
        this.ratingBar = andRatingBar;
        this.rootBg = constraintLayout3;
        this.tvDialogRateContent = textView;
        this.tvDialogRateTitle = textView2;
        this.tvGuide = textView3;
        this.tvRate = textView4;
    }

    @NonNull
    public static DialogRateUsBinding bind(@NonNull View view) {
        int i = R.id.cl_rate_us;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.cl_rate_us);
        if (constraintLayout != null) {
            i = R.id.ivLogo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivLogo);
            if (imageView != null) {
                i = R.id.lavFiveStar;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.lavFiveStar);
                if (lottieAnimationView != null) {
                    i = R.id.lavRating;
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.lavRating);
                    if (lottieAnimationView2 != null) {
                        i = R.id.rating_bar;
                        AndRatingBar andRatingBar = (AndRatingBar) ViewBindings.findChildViewById(view, R.id.rating_bar);
                        if (andRatingBar != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                            i = R.id.tv_dialog_rate_content;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dialog_rate_content);
                            if (textView != null) {
                                i = R.id.tv_dialog_rate_title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dialog_rate_title);
                                if (textView2 != null) {
                                    i = R.id.tvGuide;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGuide);
                                    if (textView3 != null) {
                                        i = R.id.tv_rate;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_rate);
                                        if (textView4 != null) {
                                            return new DialogRateUsBinding(constraintLayout2, constraintLayout, imageView, lottieAnimationView, lottieAnimationView2, andRatingBar, constraintLayout2, textView, textView2, textView3, textView4);
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
    public static DialogRateUsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogRateUsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_rate_us, viewGroup, false);
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
