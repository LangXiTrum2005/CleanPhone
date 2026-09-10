package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.basic.lib.basic.view.RadiusImageView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ItemRvEffectLayoutBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout effectBackground;

    @NonNull
    public final Group groupSelected;

    @NonNull
    public final ImageView img;

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

    @NonNull
    public final TextView tvEffect;

    private ItemRvEffectLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Group group, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RadiusImageView radiusImageView, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.effectBackground = constraintLayout2;
        this.groupSelected = group;
        this.img = imageView;
        this.ivBorder = imageView2;
        this.ivEffect = radiusImageView;
        this.ivStroke = imageView3;
        this.ivTick = imageView4;
        this.tvEffect = textView;
    }

    @NonNull
    public static ItemRvEffectLayoutBinding bind(@NonNull View view) {
        int i = R.id.effect_background;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.effect_background);
        if (constraintLayout != null) {
            i = R.id.group_selected;
            Group group = (Group) ViewBindings.findChildViewById(view, R.id.group_selected);
            if (group != null) {
                i = R.id.img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img);
                if (imageView != null) {
                    i = R.id.iv_border;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_border);
                    if (imageView2 != null) {
                        i = R.id.iv_effect;
                        RadiusImageView radiusImageView = (RadiusImageView) ViewBindings.findChildViewById(view, R.id.iv_effect);
                        if (radiusImageView != null) {
                            i = R.id.iv_stroke;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_stroke);
                            if (imageView3 != null) {
                                i = R.id.iv_tick;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_tick);
                                if (imageView4 != null) {
                                    i = R.id.tv_effect;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_effect);
                                    if (textView != null) {
                                        return new ItemRvEffectLayoutBinding((ConstraintLayout) view, constraintLayout, group, imageView, imageView2, radiusImageView, imageView3, imageView4, textView);
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
    public static ItemRvEffectLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemRvEffectLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_rv_effect_layout, viewGroup, false);
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
