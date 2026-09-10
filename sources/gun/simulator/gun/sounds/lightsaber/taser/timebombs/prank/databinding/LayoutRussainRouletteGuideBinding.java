package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.ArrowView;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutRussainRouletteGuideBinding implements ViewBinding {

    @NonNull
    public final ArrowView arrow1;

    @NonNull
    public final ArrowView arrow2;

    @NonNull
    public final ArrowView arrow3;

    @NonNull
    public final TextView btGotIt;

    @NonNull
    public final ConstraintLayout conGuide1;

    @NonNull
    public final TextView conGuide2;

    @NonNull
    public final ConstraintLayout conGuide3;

    @NonNull
    public final Group groupLayout;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView tv1;

    @NonNull
    public final TextView tv3;

    @NonNull
    public final TextView tvNotNecessary;

    @NonNull
    public final TextView tvOptional;

    private LayoutRussainRouletteGuideBinding(@NonNull View view, @NonNull ArrowView arrowView, @NonNull ArrowView arrowView2, @NonNull ArrowView arrowView3, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout2, @NonNull Group group, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.rootView = view;
        this.arrow1 = arrowView;
        this.arrow2 = arrowView2;
        this.arrow3 = arrowView3;
        this.btGotIt = textView;
        this.conGuide1 = constraintLayout;
        this.conGuide2 = textView2;
        this.conGuide3 = constraintLayout2;
        this.groupLayout = group;
        this.tv1 = textView3;
        this.tv3 = textView4;
        this.tvNotNecessary = textView5;
        this.tvOptional = textView6;
    }

    @NonNull
    public static LayoutRussainRouletteGuideBinding bind(@NonNull View view) {
        int i = R.id.arrow1;
        ArrowView arrowView = (ArrowView) ViewBindings.findChildViewById(view, R.id.arrow1);
        if (arrowView != null) {
            i = R.id.arrow2;
            ArrowView arrowView2 = (ArrowView) ViewBindings.findChildViewById(view, R.id.arrow2);
            if (arrowView2 != null) {
                i = R.id.arrow3;
                ArrowView arrowView3 = (ArrowView) ViewBindings.findChildViewById(view, R.id.arrow3);
                if (arrowView3 != null) {
                    i = R.id.bt_got_it;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.bt_got_it);
                    if (textView != null) {
                        i = R.id.con_guide1;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_guide1);
                        if (constraintLayout != null) {
                            i = R.id.con_guide2;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.con_guide2);
                            if (textView2 != null) {
                                i = R.id.con_guide3;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_guide3);
                                if (constraintLayout2 != null) {
                                    i = R.id.group_layout;
                                    Group group = (Group) ViewBindings.findChildViewById(view, R.id.group_layout);
                                    if (group != null) {
                                        i = R.id.tv1;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv1);
                                        if (textView3 != null) {
                                            i = R.id.tv3;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv3);
                                            if (textView4 != null) {
                                                i = R.id.tv_not_necessary;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_not_necessary);
                                                if (textView5 != null) {
                                                    i = R.id.tv_optional;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_optional);
                                                    if (textView6 != null) {
                                                        return new LayoutRussainRouletteGuideBinding(view, arrowView, arrowView2, arrowView3, textView, constraintLayout, textView2, constraintLayout2, group, textView3, textView4, textView5, textView6);
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
    public static LayoutRussainRouletteGuideBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.layout_russain_roulette_guide, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
