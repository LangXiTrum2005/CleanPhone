package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class DialogLaserEffectBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout background;

    @NonNull
    public final ImageView ivCloseDialog;

    @NonNull
    public final TextView ivTitle;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView rvLaserChoose;

    @NonNull
    public final TextView tvLaserInfo;

    private DialogLaserEffectBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.background = constraintLayout2;
        this.ivCloseDialog = imageView;
        this.ivTitle = textView;
        this.rvLaserChoose = recyclerView;
        this.tvLaserInfo = textView2;
    }

    @NonNull
    public static DialogLaserEffectBinding bind(@NonNull View view) {
        int i = R.id.background;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.background);
        if (constraintLayout != null) {
            i = R.id.iv_close_dialog;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close_dialog);
            if (imageView != null) {
                i = R.id.iv_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.iv_title);
                if (textView != null) {
                    i = R.id.rv_laser_choose;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_laser_choose);
                    if (recyclerView != null) {
                        i = R.id.tv_laser_info;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_laser_info);
                        if (textView2 != null) {
                            return new DialogLaserEffectBinding((ConstraintLayout) view, constraintLayout, imageView, textView, recyclerView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogLaserEffectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogLaserEffectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_laser_effect, viewGroup, false);
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
