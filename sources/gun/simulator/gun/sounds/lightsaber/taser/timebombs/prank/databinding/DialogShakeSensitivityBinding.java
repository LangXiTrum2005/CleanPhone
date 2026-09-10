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
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.LinerCustomSeekBar;

/* JADX INFO: loaded from: classes4.dex */
public final class DialogShakeSensitivityBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout background;

    @NonNull
    public final ConstraintLayout conSeekbar;

    @NonNull
    public final ImageView ivCloseDialog;

    @NonNull
    public final ImageView ivShake;

    @NonNull
    public final ImageView ivShakeSensitivity;

    @NonNull
    public final LinerCustomSeekBar ivShakeSensitivitySeekbar;

    @NonNull
    public final ConstraintLayout rootBg;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvAppName;

    @NonNull
    public final TextView tvMaxSensitivity;

    private DialogShakeSensitivityBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinerCustomSeekBar linerCustomSeekBar, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.background = constraintLayout2;
        this.conSeekbar = constraintLayout3;
        this.ivCloseDialog = imageView;
        this.ivShake = imageView2;
        this.ivShakeSensitivity = imageView3;
        this.ivShakeSensitivitySeekbar = linerCustomSeekBar;
        this.rootBg = constraintLayout4;
        this.tvAppName = textView;
        this.tvMaxSensitivity = textView2;
    }

    @NonNull
    public static DialogShakeSensitivityBinding bind(@NonNull View view) {
        int i = R.id.background;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.background);
        if (constraintLayout != null) {
            i = R.id.con_seekbar;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_seekbar);
            if (constraintLayout2 != null) {
                i = R.id.iv_close_dialog;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close_dialog);
                if (imageView != null) {
                    i = R.id.iv_shake;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_shake);
                    if (imageView2 != null) {
                        i = R.id.iv_shake_sensitivity;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_shake_sensitivity);
                        if (imageView3 != null) {
                            i = R.id.iv_shake_sensitivity_seekbar;
                            LinerCustomSeekBar linerCustomSeekBar = (LinerCustomSeekBar) ViewBindings.findChildViewById(view, R.id.iv_shake_sensitivity_seekbar);
                            if (linerCustomSeekBar != null) {
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                                i = R.id.tv_app_name;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_name);
                                if (textView != null) {
                                    i = R.id.tv_max_sensitivity;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_max_sensitivity);
                                    if (textView2 != null) {
                                        return new DialogShakeSensitivityBinding(constraintLayout3, constraintLayout, constraintLayout2, imageView, imageView2, imageView3, linerCustomSeekBar, constraintLayout3, textView, textView2);
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
    public static DialogShakeSensitivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogShakeSensitivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_shake_sensitivity, viewGroup, false);
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
