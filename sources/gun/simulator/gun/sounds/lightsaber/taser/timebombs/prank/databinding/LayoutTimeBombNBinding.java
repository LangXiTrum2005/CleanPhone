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
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutTimeBombNBinding implements ViewBinding {

    @NonNull
    public final ImageView ivAddOneMin;

    @NonNull
    public final ImageView ivAddOneSecond;

    @NonNull
    public final ImageView ivBgPause;

    @NonNull
    public final ImageView ivBgRefresh;

    @NonNull
    public final ImageView ivBgStart;

    @NonNull
    public final ImageView ivMinusOneMin;

    @NonNull
    public final ImageView ivMinusOneSecond;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Space spaceBg;

    @NonNull
    public final TextView tvTimer;

    private LayoutTimeBombNBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull Space space, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.ivAddOneMin = imageView;
        this.ivAddOneSecond = imageView2;
        this.ivBgPause = imageView3;
        this.ivBgRefresh = imageView4;
        this.ivBgStart = imageView5;
        this.ivMinusOneMin = imageView6;
        this.ivMinusOneSecond = imageView7;
        this.spaceBg = space;
        this.tvTimer = textView;
    }

    @NonNull
    public static LayoutTimeBombNBinding bind(@NonNull View view) {
        int i = R.id.iv_add_one_min;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_add_one_min);
        if (imageView != null) {
            i = R.id.iv_add_one_second;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_add_one_second);
            if (imageView2 != null) {
                i = R.id.iv_bg_pause;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bg_pause);
                if (imageView3 != null) {
                    i = R.id.iv_bg_refresh;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bg_refresh);
                    if (imageView4 != null) {
                        i = R.id.iv_bg_start;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bg_start);
                        if (imageView5 != null) {
                            i = R.id.iv_minus_one_min;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_minus_one_min);
                            if (imageView6 != null) {
                                i = R.id.iv_minus_one_second;
                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_minus_one_second);
                                if (imageView7 != null) {
                                    i = R.id.space_bg;
                                    Space space = (Space) ViewBindings.findChildViewById(view, R.id.space_bg);
                                    if (space != null) {
                                        i = R.id.tv_timer;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_timer);
                                        if (textView != null) {
                                            return new LayoutTimeBombNBinding((ConstraintLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, space, textView);
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
    public static LayoutTimeBombNBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutTimeBombNBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_time_bomb_n, viewGroup, false);
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
