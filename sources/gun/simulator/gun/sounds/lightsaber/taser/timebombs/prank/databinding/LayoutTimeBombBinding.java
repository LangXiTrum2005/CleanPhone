package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutTimeBombBinding implements ViewBinding {

    @NonNull
    public final ImageView bgTime;

    @NonNull
    public final Space consoleBottom;

    @NonNull
    public final Space guidelineLeft;

    @NonNull
    public final Space guidelineRight;

    @NonNull
    public final FrameLayout ivAddOneMin;

    @NonNull
    public final FrameLayout ivAddOneSecond;

    @NonNull
    public final FrameLayout ivBgPause;

    @NonNull
    public final FrameLayout ivBgRefresh;

    @NonNull
    public final ImageView ivBgStart;

    @NonNull
    public final ImageView ivBullets;

    @NonNull
    public final ImageView ivConsole;

    @NonNull
    public final FrameLayout ivMinusOneMin;

    @NonNull
    public final FrameLayout ivMinusOneSecond;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvBulletsNumberAll;

    @NonNull
    public final TextView tvBulletsNumberInCartridgeClip;

    @NonNull
    public final TextView tvSeparatorBulletsNumber;

    @NonNull
    public final TextView tvTimer;

    @NonNull
    public final TextView tvUnlimited;

    private LayoutTimeBombBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull Space space, @NonNull Space space2, @NonNull Space space3, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull FrameLayout frameLayout4, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull FrameLayout frameLayout5, @NonNull FrameLayout frameLayout6, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = constraintLayout;
        this.bgTime = imageView;
        this.consoleBottom = space;
        this.guidelineLeft = space2;
        this.guidelineRight = space3;
        this.ivAddOneMin = frameLayout;
        this.ivAddOneSecond = frameLayout2;
        this.ivBgPause = frameLayout3;
        this.ivBgRefresh = frameLayout4;
        this.ivBgStart = imageView2;
        this.ivBullets = imageView3;
        this.ivConsole = imageView4;
        this.ivMinusOneMin = frameLayout5;
        this.ivMinusOneSecond = frameLayout6;
        this.tvBulletsNumberAll = textView;
        this.tvBulletsNumberInCartridgeClip = textView2;
        this.tvSeparatorBulletsNumber = textView3;
        this.tvTimer = textView4;
        this.tvUnlimited = textView5;
    }

    @NonNull
    public static LayoutTimeBombBinding bind(@NonNull View view) {
        int i = R.id.bg_time;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.bg_time);
        if (imageView != null) {
            i = R.id.console_bottom;
            Space space = (Space) ViewBindings.findChildViewById(view, R.id.console_bottom);
            if (space != null) {
                i = R.id.guideline_left;
                Space space2 = (Space) ViewBindings.findChildViewById(view, R.id.guideline_left);
                if (space2 != null) {
                    i = R.id.guideline_right;
                    Space space3 = (Space) ViewBindings.findChildViewById(view, R.id.guideline_right);
                    if (space3 != null) {
                        i = R.id.iv_add_one_min;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.iv_add_one_min);
                        if (frameLayout != null) {
                            i = R.id.iv_add_one_second;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.iv_add_one_second);
                            if (frameLayout2 != null) {
                                i = R.id.iv_bg_pause;
                                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.iv_bg_pause);
                                if (frameLayout3 != null) {
                                    i = R.id.iv_bg_refresh;
                                    FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.iv_bg_refresh);
                                    if (frameLayout4 != null) {
                                        i = R.id.iv_bg_start;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bg_start);
                                        if (imageView2 != null) {
                                            i = R.id.iv_bullets;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bullets);
                                            if (imageView3 != null) {
                                                i = R.id.iv_console;
                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_console);
                                                if (imageView4 != null) {
                                                    i = R.id.iv_minus_one_min;
                                                    FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.iv_minus_one_min);
                                                    if (frameLayout5 != null) {
                                                        i = R.id.iv_minus_one_second;
                                                        FrameLayout frameLayout6 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.iv_minus_one_second);
                                                        if (frameLayout6 != null) {
                                                            i = R.id.tv_bullets_number_all;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bullets_number_all);
                                                            if (textView != null) {
                                                                i = R.id.tv_bullets_number_in_cartridge_clip;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bullets_number_in_cartridge_clip);
                                                                if (textView2 != null) {
                                                                    i = R.id.tv_separator_bullets_number;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_separator_bullets_number);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tv_timer;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_timer);
                                                                        if (textView4 != null) {
                                                                            i = R.id.tv_unlimited;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_unlimited);
                                                                            if (textView5 != null) {
                                                                                return new LayoutTimeBombBinding((ConstraintLayout) view, imageView, space, space2, space3, frameLayout, frameLayout2, frameLayout3, frameLayout4, imageView2, imageView3, imageView4, frameLayout5, frameLayout6, textView, textView2, textView3, textView4, textView5);
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
    public static LayoutTimeBombBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutTimeBombBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_time_bomb, viewGroup, false);
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
