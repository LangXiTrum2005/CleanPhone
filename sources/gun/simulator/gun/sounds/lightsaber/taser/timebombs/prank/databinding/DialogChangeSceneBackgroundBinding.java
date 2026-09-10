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
public final class DialogChangeSceneBackgroundBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout background;

    @NonNull
    public final ImageView ivCloseDialog;

    @NonNull
    public final TextView ivTitle;

    @NonNull
    public final ConstraintLayout rootBg;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView rvSceneChoose;

    private DialogChangeSceneBackgroundBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3, @NonNull RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.background = constraintLayout2;
        this.ivCloseDialog = imageView;
        this.ivTitle = textView;
        this.rootBg = constraintLayout3;
        this.rvSceneChoose = recyclerView;
    }

    @NonNull
    public static DialogChangeSceneBackgroundBinding bind(@NonNull View view) {
        int i = R.id.background;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.background);
        if (constraintLayout != null) {
            i = R.id.iv_close_dialog;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close_dialog);
            if (imageView != null) {
                i = R.id.iv_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.iv_title);
                if (textView != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                    i = R.id.rv_scene_choose;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_scene_choose);
                    if (recyclerView != null) {
                        return new DialogChangeSceneBackgroundBinding(constraintLayout2, constraintLayout, imageView, textView, constraintLayout2, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogChangeSceneBackgroundBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogChangeSceneBackgroundBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_change_scene_background, viewGroup, false);
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
