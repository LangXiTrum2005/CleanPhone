package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.mikhaellopez.circleview.CircleView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.ColorSeekBarVertical;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.KnobProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutWeaponActivityActionBinding implements ViewBinding {

    @NonNull
    public final ColorSeekBarVertical chooseColorSeekBar;

    @NonNull
    public final ConstraintLayout conColorChoose;

    @NonNull
    public final CircleView cvColorChoose;

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final ImageView ivBullets;

    @NonNull
    public final ImageView ivColorChoose;

    @NonNull
    public final ImageView ivColorPicker;

    @NonNull
    public final ImageView ivGunEffect;

    @NonNull
    public final ImageView ivImmersive;

    @NonNull
    public final ImageView ivResetColorChoose;

    @NonNull
    public final ImageView ivSceneMenu;

    @NonNull
    public final ImageView ivSetting;

    @NonNull
    public final ImageView ivShake;

    @NonNull
    public final ImageView ivUnlimitedBullet;

    @NonNull
    public final ImageView ivWatchAd;

    @NonNull
    public final KnobProgressBar kpbBulletsNumber;

    @NonNull
    public final View layoutClickCover;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView tvBulletsNumberAll;

    @NonNull
    public final TextView tvBulletsNumberInCartridgeClip;

    @NonNull
    public final TextView tvSeparatorBulletsNumber;

    @NonNull
    public final TextView tvUnlimited;

    private LayoutWeaponActivityActionBinding(@NonNull View view, @NonNull ColorSeekBarVertical colorSeekBarVertical, @NonNull ConstraintLayout constraintLayout, @NonNull CircleView circleView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull ImageView imageView9, @NonNull ImageView imageView10, @NonNull ImageView imageView11, @NonNull ImageView imageView12, @NonNull KnobProgressBar knobProgressBar, @NonNull View view2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = view;
        this.chooseColorSeekBar = colorSeekBarVertical;
        this.conColorChoose = constraintLayout;
        this.cvColorChoose = circleView;
        this.ivBack = imageView;
        this.ivBullets = imageView2;
        this.ivColorChoose = imageView3;
        this.ivColorPicker = imageView4;
        this.ivGunEffect = imageView5;
        this.ivImmersive = imageView6;
        this.ivResetColorChoose = imageView7;
        this.ivSceneMenu = imageView8;
        this.ivSetting = imageView9;
        this.ivShake = imageView10;
        this.ivUnlimitedBullet = imageView11;
        this.ivWatchAd = imageView12;
        this.kpbBulletsNumber = knobProgressBar;
        this.layoutClickCover = view2;
        this.tvBulletsNumberAll = textView;
        this.tvBulletsNumberInCartridgeClip = textView2;
        this.tvSeparatorBulletsNumber = textView3;
        this.tvUnlimited = textView4;
    }

    @NonNull
    public static LayoutWeaponActivityActionBinding bind(@NonNull View view) {
        int i = R.id.choose_color_seek_bar;
        ColorSeekBarVertical colorSeekBarVertical = (ColorSeekBarVertical) ViewBindings.findChildViewById(view, R.id.choose_color_seek_bar);
        if (colorSeekBarVertical != null) {
            i = R.id.con_color_choose;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_color_choose);
            if (constraintLayout != null) {
                i = R.id.cv_color_choose;
                CircleView circleView = (CircleView) ViewBindings.findChildViewById(view, R.id.cv_color_choose);
                if (circleView != null) {
                    i = R.id.iv_back;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
                    if (imageView != null) {
                        i = R.id.iv_bullets;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bullets);
                        if (imageView2 != null) {
                            i = R.id.iv_color_choose;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_color_choose);
                            if (imageView3 != null) {
                                i = R.id.iv_color_picker;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_color_picker);
                                if (imageView4 != null) {
                                    i = R.id.iv_gun_effect;
                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_gun_effect);
                                    if (imageView5 != null) {
                                        i = R.id.iv_immersive;
                                        ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_immersive);
                                        if (imageView6 != null) {
                                            i = R.id.iv_reset_color_choose;
                                            ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_reset_color_choose);
                                            if (imageView7 != null) {
                                                i = R.id.iv_scene_menu;
                                                ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_scene_menu);
                                                if (imageView8 != null) {
                                                    i = R.id.iv_setting;
                                                    ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_setting);
                                                    if (imageView9 != null) {
                                                        i = R.id.iv_shake;
                                                        ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_shake);
                                                        if (imageView10 != null) {
                                                            i = R.id.iv_unlimited_bullet;
                                                            ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_unlimited_bullet);
                                                            if (imageView11 != null) {
                                                                i = R.id.iv_watch_ad;
                                                                ImageView imageView12 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_ad);
                                                                if (imageView12 != null) {
                                                                    i = R.id.kpb_bullets_number;
                                                                    KnobProgressBar knobProgressBar = (KnobProgressBar) ViewBindings.findChildViewById(view, R.id.kpb_bullets_number);
                                                                    if (knobProgressBar != null) {
                                                                        i = R.id.layout_click_cover;
                                                                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_click_cover);
                                                                        if (viewFindChildViewById != null) {
                                                                            i = R.id.tv_bullets_number_all;
                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bullets_number_all);
                                                                            if (textView != null) {
                                                                                i = R.id.tv_bullets_number_in_cartridge_clip;
                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bullets_number_in_cartridge_clip);
                                                                                if (textView2 != null) {
                                                                                    i = R.id.tv_separator_bullets_number;
                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_separator_bullets_number);
                                                                                    if (textView3 != null) {
                                                                                        i = R.id.tv_unlimited;
                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_unlimited);
                                                                                        if (textView4 != null) {
                                                                                            return new LayoutWeaponActivityActionBinding(view, colorSeekBarVertical, constraintLayout, circleView, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, knobProgressBar, viewFindChildViewById, textView, textView2, textView3, textView4);
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
    public static LayoutWeaponActivityActionBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.layout_weapon_activity_action, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
