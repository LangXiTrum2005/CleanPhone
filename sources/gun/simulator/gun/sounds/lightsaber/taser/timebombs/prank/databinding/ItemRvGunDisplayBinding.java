package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ItemRvGunDisplayBinding implements ViewBinding {

    @NonNull
    public final ImageView bgTextMachineGun;

    @NonNull
    public final ConstraintLayout conTitle;

    @NonNull
    public final Group groupLock;

    @NonNull
    public final ImageView ivGun;

    @NonNull
    public final ImageView ivGunDisplayBg;

    @NonNull
    public final ImageView ivLabelBullet;

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

    @NonNull
    public final TextView tvBulletsNumber;

    @NonNull
    public final TextView tvMachineGunName;

    private ItemRvGunDisplayBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull Group group, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull Space space, @NonNull Space space2, @NonNull Space space3, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.bgTextMachineGun = imageView;
        this.conTitle = constraintLayout2;
        this.groupLock = group;
        this.ivGun = imageView2;
        this.ivGunDisplayBg = imageView3;
        this.ivLabelBullet = imageView4;
        this.ivWatchAd = imageView5;
        this.spaceBottom = space;
        this.spaceLockTipTop = space2;
        this.spaceTop = space3;
        this.tvBulletsNumber = textView;
        this.tvMachineGunName = textView2;
    }

    @NonNull
    public static ItemRvGunDisplayBinding bind(@NonNull View view) {
        int i = R.id.bg_text_machine_gun;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.bg_text_machine_gun);
        if (imageView != null) {
            i = R.id.con_title;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_title);
            if (constraintLayout != null) {
                i = R.id.group_lock;
                Group group = (Group) ViewBindings.findChildViewById(view, R.id.group_lock);
                if (group != null) {
                    i = R.id.iv_gun;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_gun);
                    if (imageView2 != null) {
                        i = R.id.iv_gun_display_bg;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_gun_display_bg);
                        if (imageView3 != null) {
                            i = R.id.iv_label_bullet;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_label_bullet);
                            if (imageView4 != null) {
                                i = R.id.iv_watch_ad;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_ad);
                                if (imageView5 != null) {
                                    i = R.id.space_bottom;
                                    Space space = (Space) ViewBindings.findChildViewById(view, R.id.space_bottom);
                                    if (space != null) {
                                        i = R.id.space_lock_tip_top;
                                        Space space2 = (Space) ViewBindings.findChildViewById(view, R.id.space_lock_tip_top);
                                        if (space2 != null) {
                                            i = R.id.space_top;
                                            Space space3 = (Space) ViewBindings.findChildViewById(view, R.id.space_top);
                                            if (space3 != null) {
                                                i = R.id.tv_bullets_number;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bullets_number);
                                                if (textView != null) {
                                                    i = R.id.tv_machine_gun_name;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_machine_gun_name);
                                                    if (textView2 != null) {
                                                        return new ItemRvGunDisplayBinding((ConstraintLayout) view, imageView, constraintLayout, group, imageView2, imageView3, imageView4, imageView5, space, space2, space3, textView, textView2);
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
    public static ItemRvGunDisplayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemRvGunDisplayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_rv_gun_display, viewGroup, false);
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
