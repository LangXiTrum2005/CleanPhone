package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogRateUsBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogC4228oX extends AbstractDialogC3851k9 {
    public static final /* synthetic */ int e = 0;
    public final LifecycleOwner b;
    public final Activity c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC4228oX(Context context, LifecycleOwner lifecycleOwner, Activity activity, boolean z) {
        super(context, R.style.SoundPlaySettingBottomSheetDialog);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(activity, "mActivity");
        this.b = lifecycleOwner;
        this.c = activity;
        this.d = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final ViewBinding b() {
        DialogRateUsBinding dialogRateUsBindingInflate = DialogRateUsBinding.inflate(getLayoutInflater());
        AbstractC2995aW.p(dialogRateUsBindingInflate, "inflate(...)");
        return dialogRateUsBindingInflate;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractDialogC3851k9
    public final void c() {
        int i = 0;
        ((DialogRateUsBinding) a()).tvRate.setClickable(false);
        ((DialogRateUsBinding) a()).ratingBar.setRating(0.0f);
        ((DialogRateUsBinding) a()).ratingBar.setAlpha(0.0f);
        d();
        ((DialogRateUsBinding) a()).lavFiveStar.a(new C3788jX(this, i));
        ((DialogRateUsBinding) a()).lavRating.a(new C3788jX(this, 1));
        ((DialogRateUsBinding) a()).ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iX
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
                DialogC4228oX dialogC4228oX = this.f4505a;
                AbstractC2995aW.q(dialogC4228oX, "this$0");
                if (z) {
                    int i2 = (int) f;
                    if (i2 == 0) {
                        dialogC4228oX.d();
                        return;
                    }
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        LottieAnimationView lottieAnimationView = ((DialogRateUsBinding) dialogC4228oX.a()).lavFiveStar;
                        AbstractC2995aW.p(lottieAnimationView, "lavFiveStar");
                        Oh0.e(lottieAnimationView);
                        ((DialogRateUsBinding) dialogC4228oX.a()).tvRate.setEnabled(true);
                        ((DialogRateUsBinding) dialogC4228oX.a()).tvDialogRateTitle.setText(R.string.Oh_no);
                        ((DialogRateUsBinding) dialogC4228oX.a()).tvDialogRateContent.setText(dialogC4228oX.getContext().getResources().getString(R.string.d_love_feedback));
                        ((DialogRateUsBinding) dialogC4228oX.a()).tvRate.setText(R.string.Rate);
                        if (i2 == 1) {
                            ((DialogRateUsBinding) dialogC4228oX.a()).ivLogo.setImageResource(R.drawable.pic_one_star);
                            return;
                        } else if (i2 == 2) {
                            ((DialogRateUsBinding) dialogC4228oX.a()).ivLogo.setImageResource(R.drawable.pic_two_star);
                            return;
                        } else {
                            if (i2 != 3) {
                                return;
                            }
                            ((DialogRateUsBinding) dialogC4228oX.a()).ivLogo.setImageResource(R.drawable.pic_three_star);
                            return;
                        }
                    }
                    if (i2 == 4) {
                        LottieAnimationView lottieAnimationView2 = ((DialogRateUsBinding) dialogC4228oX.a()).lavFiveStar;
                        AbstractC2995aW.p(lottieAnimationView2, "lavFiveStar");
                        Oh0.e(lottieAnimationView2);
                        ((DialogRateUsBinding) dialogC4228oX.a()).tvRate.setEnabled(true);
                        ((DialogRateUsBinding) dialogC4228oX.a()).tvDialogRateTitle.setText(R.string.Thank_you);
                        ((DialogRateUsBinding) dialogC4228oX.a()).tvDialogRateContent.setText(R.string.Thanks_your_feedback);
                        ((DialogRateUsBinding) dialogC4228oX.a()).tvRate.setText(R.string.Rate);
                        ((DialogRateUsBinding) dialogC4228oX.a()).ivLogo.setImageResource(R.drawable.pic_four_star);
                        return;
                    }
                    if (i2 != 5) {
                        return;
                    }
                    LottieAnimationView lottieAnimationView3 = ((DialogRateUsBinding) dialogC4228oX.a()).lavFiveStar;
                    AbstractC2995aW.p(lottieAnimationView3, "lavFiveStar");
                    Oh0.c(lottieAnimationView3);
                    ((DialogRateUsBinding) dialogC4228oX.a()).tvRate.setEnabled(true);
                    ((DialogRateUsBinding) dialogC4228oX.a()).tvDialogRateTitle.setText(R.string.Wow);
                    ((DialogRateUsBinding) dialogC4228oX.a()).tvDialogRateContent.setText(R.string.Your_satisfaction);
                    ((DialogRateUsBinding) dialogC4228oX.a()).tvRate.setText(R.string.Google_Play);
                    ((DialogRateUsBinding) dialogC4228oX.a()).ivLogo.setImageResource(R.drawable.pic_five_star);
                }
            }
        });
        ((DialogRateUsBinding) a()).ratingBar.setOnTouchListener(new UK(this, 3));
        ((DialogRateUsBinding) a()).rootBg.setOnClickListener(new ViewOnClickListenerC3176ca(this, 7));
        TextView textView = ((DialogRateUsBinding) a()).tvRate;
        AbstractC2995aW.p(textView, "tvRate");
        Oh0.a(textView, new C4140nX(this, i));
    }

    public final void d() {
        LottieAnimationView lottieAnimationView = ((DialogRateUsBinding) a()).lavFiveStar;
        AbstractC2995aW.p(lottieAnimationView, "lavFiveStar");
        Oh0.e(lottieAnimationView);
        ((DialogRateUsBinding) a()).tvRate.setEnabled(false);
        ((DialogRateUsBinding) a()).tvDialogRateTitle.setText(R.string.Thanks_for_using);
        ((DialogRateUsBinding) a()).tvDialogRateContent.setText(getContext().getResources().getString(R.string.d_greatly_appreciate));
        ((DialogRateUsBinding) a()).tvRate.setText(R.string.Rate);
        ((DialogRateUsBinding) a()).ivLogo.setImageResource(R.drawable.pic_zero_star);
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        ((DialogRateUsBinding) a()).lavRating.setVisibility(0);
        ((DialogRateUsBinding) a()).lavRating.e();
    }
}
