package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.StatusBarFitView;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityRussianRouletteBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout conWeaponBanner;

    @NonNull
    public final FrameLayout flSpine;

    @NonNull
    public final Group groupReload;

    @NonNull
    public final Group groupReloadDone;

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final ImageView ivBullet;

    @NonNull
    public final ImageView ivFiringEffect;

    @NonNull
    public final ImageView ivHelp;

    @NonNull
    public final ImageView ivImmersive;

    @NonNull
    public final ImageView ivMaskBottom;

    @NonNull
    public final ImageView ivMaskTop;

    @NonNull
    public final ImageView ivScene;

    @NonNull
    public final ImageView ivSetting;

    @NonNull
    public final LottieAnimationView lavShootWarn;

    @NonNull
    public final View mask;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final StatusBarFitView statusBar;

    @NonNull
    public final View strokeViewTop;

    @NonNull
    public final FrameLayout surfaceRoot;

    @NonNull
    public final TextView tvBullet;

    @NonNull
    public final TextView tvGuide;

    @NonNull
    public final TextView tvReload;

    @NonNull
    public final TextView tvReloadDone;

    @NonNull
    public final VideoView vvScene;

    private ActivityRussianRouletteBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout, @NonNull Group group, @NonNull Group group2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull ImageView imageView9, @NonNull LottieAnimationView lottieAnimationView, @NonNull View view, @NonNull StatusBarFitView statusBarFitView, @NonNull View view2, @NonNull FrameLayout frameLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull VideoView videoView) {
        this.rootView = constraintLayout;
        this.conWeaponBanner = constraintLayout2;
        this.flSpine = frameLayout;
        this.groupReload = group;
        this.groupReloadDone = group2;
        this.ivBack = imageView;
        this.ivBullet = imageView2;
        this.ivFiringEffect = imageView3;
        this.ivHelp = imageView4;
        this.ivImmersive = imageView5;
        this.ivMaskBottom = imageView6;
        this.ivMaskTop = imageView7;
        this.ivScene = imageView8;
        this.ivSetting = imageView9;
        this.lavShootWarn = lottieAnimationView;
        this.mask = view;
        this.statusBar = statusBarFitView;
        this.strokeViewTop = view2;
        this.surfaceRoot = frameLayout2;
        this.tvBullet = textView;
        this.tvGuide = textView2;
        this.tvReload = textView3;
        this.tvReloadDone = textView4;
        this.vvScene = videoView;
    }

    @NonNull
    public static ActivityRussianRouletteBinding bind(@NonNull View view) {
        int i = R.id.con_weapon_banner;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_weapon_banner);
        if (constraintLayout != null) {
            i = R.id.fl_spine;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fl_spine);
            if (frameLayout != null) {
                i = R.id.group_reload;
                Group group = (Group) ViewBindings.findChildViewById(view, R.id.group_reload);
                if (group != null) {
                    i = R.id.group_reload_done;
                    Group group2 = (Group) ViewBindings.findChildViewById(view, R.id.group_reload_done);
                    if (group2 != null) {
                        i = R.id.iv_back;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
                        if (imageView != null) {
                            i = R.id.iv_bullet;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bullet);
                            if (imageView2 != null) {
                                i = R.id.iv_firing_effect;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_firing_effect);
                                if (imageView3 != null) {
                                    i = R.id.iv_help;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_help);
                                    if (imageView4 != null) {
                                        i = R.id.iv_immersive;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_immersive);
                                        if (imageView5 != null) {
                                            i = R.id.iv_mask_bottom;
                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_mask_bottom);
                                            if (imageView6 != null) {
                                                i = R.id.iv_mask_top;
                                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_mask_top);
                                                if (imageView7 != null) {
                                                    i = R.id.iv_scene;
                                                    ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_scene);
                                                    if (imageView8 != null) {
                                                        i = R.id.iv_setting;
                                                        ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_setting);
                                                        if (imageView9 != null) {
                                                            i = R.id.lav_shoot_warn;
                                                            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.lav_shoot_warn);
                                                            if (lottieAnimationView != null) {
                                                                i = R.id.mask;
                                                                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.mask);
                                                                if (viewFindChildViewById != null) {
                                                                    i = R.id.status_bar;
                                                                    StatusBarFitView statusBarFitView = (StatusBarFitView) ViewBindings.findChildViewById(view, R.id.status_bar);
                                                                    if (statusBarFitView != null) {
                                                                        i = R.id.strokeViewTop;
                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.strokeViewTop);
                                                                        if (viewFindChildViewById2 != null) {
                                                                            i = R.id.surface_root;
                                                                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.surface_root);
                                                                            if (frameLayout2 != null) {
                                                                                i = R.id.tv_bullet;
                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bullet);
                                                                                if (textView != null) {
                                                                                    i = R.id.tv_guide;
                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_guide);
                                                                                    if (textView2 != null) {
                                                                                        i = R.id.tvReload;
                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReload);
                                                                                        if (textView3 != null) {
                                                                                            i = R.id.tv_reload_done;
                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reload_done);
                                                                                            if (textView4 != null) {
                                                                                                i = R.id.vv_scene;
                                                                                                VideoView videoView = (VideoView) ViewBindings.findChildViewById(view, R.id.vv_scene);
                                                                                                if (videoView != null) {
                                                                                                    return new ActivityRussianRouletteBinding((ConstraintLayout) view, constraintLayout, frameLayout, group, group2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, lottieAnimationView, viewFindChildViewById, statusBarFitView, viewFindChildViewById2, frameLayout2, textView, textView2, textView3, textView4, videoView);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityRussianRouletteBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityRussianRouletteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_russian_roulette, viewGroup, false);
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
