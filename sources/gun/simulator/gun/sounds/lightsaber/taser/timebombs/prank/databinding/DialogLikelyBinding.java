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
public final class DialogLikelyBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout constraintLayout;

    @NonNull
    public final ImageView picLikelyLogo;

    @NonNull
    public final ConstraintLayout rootBg;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvLike;

    @NonNull
    public final TextView tvNotReally;

    @NonNull
    public final TextView tvTitle;

    private DialogLikelyBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.constraintLayout = constraintLayout2;
        this.picLikelyLogo = imageView;
        this.rootBg = constraintLayout3;
        this.tvLike = textView;
        this.tvNotReally = textView2;
        this.tvTitle = textView3;
    }

    @NonNull
    public static DialogLikelyBinding bind(@NonNull View view) {
        int i = R.id.constraintLayout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayout);
        if (constraintLayout != null) {
            i = R.id.picLikelyLogo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.picLikelyLogo);
            if (imageView != null) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                i = R.id.tvLike;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvLike);
                if (textView != null) {
                    i = R.id.tvNotReally;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNotReally);
                    if (textView2 != null) {
                        i = R.id.tvTitle;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                        if (textView3 != null) {
                            return new DialogLikelyBinding(constraintLayout2, constraintLayout, imageView, constraintLayout2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogLikelyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogLikelyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_likely, viewGroup, false);
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
