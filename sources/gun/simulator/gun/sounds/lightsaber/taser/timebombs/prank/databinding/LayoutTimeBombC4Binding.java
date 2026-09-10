package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutTimeBombC4Binding implements ViewBinding {

    @NonNull
    public final Space guidelineBottom;

    @NonNull
    public final Space guidelineTop;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvNumber1;

    @NonNull
    public final TextView tvNumber2;

    @NonNull
    public final TextView tvNumber3;

    @NonNull
    public final TextView tvNumber4;

    @NonNull
    public final TextView tvNumber5;

    @NonNull
    public final TextView tvNumber6;

    @NonNull
    public final TextView tvNumber7;

    @NonNull
    public final TextView tvNumber8;

    @NonNull
    public final TextView tvNumber9;

    @NonNull
    public final TextView tvTimer;

    private LayoutTimeBombC4Binding(@NonNull ConstraintLayout constraintLayout, @NonNull Space space, @NonNull Space space2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10) {
        this.rootView = constraintLayout;
        this.guidelineBottom = space;
        this.guidelineTop = space2;
        this.tvNumber1 = textView;
        this.tvNumber2 = textView2;
        this.tvNumber3 = textView3;
        this.tvNumber4 = textView4;
        this.tvNumber5 = textView5;
        this.tvNumber6 = textView6;
        this.tvNumber7 = textView7;
        this.tvNumber8 = textView8;
        this.tvNumber9 = textView9;
        this.tvTimer = textView10;
    }

    @NonNull
    public static LayoutTimeBombC4Binding bind(@NonNull View view) {
        int i = R.id.guideline_bottom;
        Space space = (Space) ViewBindings.findChildViewById(view, R.id.guideline_bottom);
        if (space != null) {
            i = R.id.guideline_top;
            Space space2 = (Space) ViewBindings.findChildViewById(view, R.id.guideline_top);
            if (space2 != null) {
                i = R.id.tv_number_1;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_number_1);
                if (textView != null) {
                    i = R.id.tv_number_2;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_number_2);
                    if (textView2 != null) {
                        i = R.id.tv_number_3;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_number_3);
                        if (textView3 != null) {
                            i = R.id.tv_number_4;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_number_4);
                            if (textView4 != null) {
                                i = R.id.tv_number_5;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_number_5);
                                if (textView5 != null) {
                                    i = R.id.tv_number_6;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_number_6);
                                    if (textView6 != null) {
                                        i = R.id.tv_number_7;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_number_7);
                                        if (textView7 != null) {
                                            i = R.id.tv_number_8;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_number_8);
                                            if (textView8 != null) {
                                                i = R.id.tv_number_9;
                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_number_9);
                                                if (textView9 != null) {
                                                    i = R.id.tv_timer;
                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_timer);
                                                    if (textView10 != null) {
                                                        return new LayoutTimeBombC4Binding((ConstraintLayout) view, space, space2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
    public static LayoutTimeBombC4Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutTimeBombC4Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_time_bomb_c4, viewGroup, false);
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
