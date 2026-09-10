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
public final class ItemRvLightSaberEffectLayoutBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout effectBackground;

    @NonNull
    public final Group groupSelected;

    @NonNull
    public final ImageView ivBorder;

    @NonNull
    public final RadiusImageView ivEffect;

    @NonNull
    public final ImageView ivStroke;

    @NonNull
    public final ImageView ivTick;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemRvLightSaberEffectLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Group group, @NonNull ImageView imageView, @NonNull RadiusImageView radiusImageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3) {
        this.rootView = constraintLayout;
        this.effectBackground = constraintLayout2;
        this.groupSelected = group;
        this.ivBorder = imageView;
        this.ivEffect = radiusImageView;
        this.ivStroke = imageView2;
        this.ivTick = imageView3;
    }

    @NonNull
    public static ItemRvLightSaberEffectLayoutBinding bind(@NonNull View view) {
        int i = R.id.effect_background;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.effect_background);
        if (constraintLayout != null) {
            i = R.id.group_selected;
            Group group = (Group) ViewBindings.findChildViewById(view, R.id.group_selected);
            if (group != null) {
                i = R.id.iv_border;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_border);
                if (imageView != null) {
                    i = R.id.iv_effect;
                    RadiusImageView radiusImageView = (RadiusImageView) ViewBindings.findChildViewById(view, R.id.iv_effect);
                    if (radiusImageView != null) {
                        i = R.id.iv_stroke;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_stroke);
                        if (imageView2 != null) {
                            i = R.id.iv_tick;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_tick);
                            if (imageView3 != null) {
                                return new ItemRvLightSaberEffectLayoutBinding((ConstraintLayout) view, constraintLayout, group, imageView, radiusImageView, imageView2, imageView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemRvLightSaberEffectLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemRvLightSaberEffectLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_rv_light_saber_effect_layout, viewGroup, false);
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
