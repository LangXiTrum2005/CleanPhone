package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.basic.lib.basic.view.RadiusImageView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ItemRvLaserBinding implements ViewBinding {

    @NonNull
    public final Group groupSelected;

    @NonNull
    public final ImageView ivBorder;

    @NonNull
    public final RadiusImageView ivLaser;

    @NonNull
    public final ImageView ivTick;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemRvLaserBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull ImageView imageView, @NonNull RadiusImageView radiusImageView, @NonNull ImageView imageView2) {
        this.rootView = constraintLayout;
        this.groupSelected = group;
        this.ivBorder = imageView;
        this.ivLaser = radiusImageView;
        this.ivTick = imageView2;
    }

    @NonNull
    public static ItemRvLaserBinding bind(@NonNull View view) {
        int i = R.id.group_selected;
        Group group = (Group) ViewBindings.findChildViewById(view, R.id.group_selected);
        if (group != null) {
            i = R.id.iv_border;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_border);
            if (imageView != null) {
                i = R.id.iv_laser;
                RadiusImageView radiusImageView = (RadiusImageView) ViewBindings.findChildViewById(view, R.id.iv_laser);
                if (radiusImageView != null) {
                    i = R.id.iv_tick;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_tick);
                    if (imageView2 != null) {
                        return new ItemRvLaserBinding((ConstraintLayout) view, group, imageView, radiusImageView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemRvLaserBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemRvLaserBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_rv_laser, viewGroup, false);
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
