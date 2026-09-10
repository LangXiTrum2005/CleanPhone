package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ItemRvGunLightsaberDisplayBinding implements ViewBinding {

    @NonNull
    public final Group groupLock;

    @NonNull
    public final ImageView ivGun;

    @NonNull
    public final ImageView ivGunDisplayBg;

    @NonNull
    public final ImageView ivWatchAd;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Space spaceBottom;

    @NonNull
    public final Space spaceLockTipTop;

    @NonNull
    public final Space spaceTop;

    private ItemRvGunLightsaberDisplayBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull Space space, @NonNull Space space2, @NonNull Space space3) {
        this.rootView = constraintLayout;
        this.groupLock = group;
        this.ivGun = imageView;
        this.ivGunDisplayBg = imageView2;
        this.ivWatchAd = imageView3;
        this.spaceBottom = space;
        this.spaceLockTipTop = space2;
        this.spaceTop = space3;
    }

    @NonNull
    public static ItemRvGunLightsaberDisplayBinding bind(@NonNull View view) {
        int i = R.id.group_lock;
        Group group = (Group) ViewBindings.findChildViewById(view, R.id.group_lock);
        if (group != null) {
            i = R.id.iv_gun;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_gun);
            if (imageView != null) {
                i = R.id.iv_gun_display_bg;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_gun_display_bg);
                if (imageView2 != null) {
                    i = R.id.iv_watch_ad;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_ad);
                    if (imageView3 != null) {
                        i = R.id.space_bottom;
                        Space space = (Space) ViewBindings.findChildViewById(view, R.id.space_bottom);
                        if (space != null) {
                            i = R.id.space_lock_tip_top;
                            Space space2 = (Space) ViewBindings.findChildViewById(view, R.id.space_lock_tip_top);
                            if (space2 != null) {
                                i = R.id.space_top;
                                Space space3 = (Space) ViewBindings.findChildViewById(view, R.id.space_top);
                                if (space3 != null) {
                                    return new ItemRvGunLightsaberDisplayBinding((ConstraintLayout) view, group, imageView, imageView2, imageView3, space, space2, space3);
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
    public static ItemRvGunLightsaberDisplayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemRvGunLightsaberDisplayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_rv_gun_lightsaber_display, viewGroup, false);
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
