package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
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
public final class ActivityGunBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout clBg;

    @NonNull
    public final ConstraintLayout conReloadTv;

    @NonNull
    public final ConstraintLayout conWeaponBanner;

    @NonNull
    public final FrameLayout flSpine;

    @NonNull
    public final Group groupReloadBullets;

    @NonNull
    public final ImageView ivBoom;

    @NonNull
    public final ImageView ivReloadBullets;

    @NonNull
    public final LottieAnimationView lavReloadBulletsCircle;

    @NonNull
    public final LottieAnimationView lavReloadBulletsHand;

    @NonNull
    public final ConstraintLayout layoutGunParent;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Space spaceTopBar;

    @NonNull
    public final StatusBarFitView statusBar;

    @NonNull
    public final View strokeViewTop;

    @NonNull
    public final FrameLayout surfaceRoot;

    @NonNull
    public final TextView tvReloadBullets;

    @NonNull
    public final TextureView tvVideo;

    @NonNull
    public final ViewStub vbBombEffect;

    @NonNull
    public final ViewStub vbTimeBomb;

    @NonNull
    public final ViewStub vbTimeBombC4;

    @NonNull
    public final ViewStub vbTimeBombN;

    @NonNull
    public final ViewStub vbTimeBombS;

    @NonNull
    public final VideoView videoView;

    private ActivityGunBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull FrameLayout frameLayout, @NonNull Group group, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LottieAnimationView lottieAnimationView, @NonNull LottieAnimationView lottieAnimationView2, @NonNull ConstraintLayout constraintLayout5, @NonNull Space space, @NonNull StatusBarFitView statusBarFitView, @NonNull View view, @NonNull FrameLayout frameLayout2, @NonNull TextView textView, @NonNull TextureView textureView, @NonNull ViewStub viewStub, @NonNull ViewStub viewStub2, @NonNull ViewStub viewStub3, @NonNull ViewStub viewStub4, @NonNull ViewStub viewStub5, @NonNull VideoView videoView) {
        this.rootView = constraintLayout;
        this.clBg = constraintLayout2;
        this.conReloadTv = constraintLayout3;
        this.conWeaponBanner = constraintLayout4;
        this.flSpine = frameLayout;
        this.groupReloadBullets = group;
        this.ivBoom = imageView;
        this.ivReloadBullets = imageView2;
        this.lavReloadBulletsCircle = lottieAnimationView;
        this.lavReloadBulletsHand = lottieAnimationView2;
        this.layoutGunParent = constraintLayout5;
        this.spaceTopBar = space;
        this.statusBar = statusBarFitView;
        this.strokeViewTop = view;
        this.surfaceRoot = frameLayout2;
        this.tvReloadBullets = textView;
        this.tvVideo = textureView;
        this.vbBombEffect = viewStub;
        this.vbTimeBomb = viewStub2;
        this.vbTimeBombC4 = viewStub3;
        this.vbTimeBombN = viewStub4;
        this.vbTimeBombS = viewStub5;
        this.videoView = videoView;
    }

    @NonNull
    public static ActivityGunBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.con_reload_tv;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_reload_tv);
        if (constraintLayout2 != null) {
            i = R.id.con_weapon_banner;
            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_weapon_banner);
            if (constraintLayout3 != null) {
                i = R.id.fl_spine;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fl_spine);
                if (frameLayout != null) {
                    i = R.id.group_reload_bullets;
                    Group group = (Group) ViewBindings.findChildViewById(view, R.id.group_reload_bullets);
                    if (group != null) {
                        i = R.id.iv_boom;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_boom);
                        if (imageView != null) {
                            i = R.id.iv_reload_bullets;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_reload_bullets);
                            if (imageView2 != null) {
                                i = R.id.lav_reload_bullets_circle;
                                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.lav_reload_bullets_circle);
                                if (lottieAnimationView != null) {
                                    i = R.id.lav_reload_bullets_hand;
                                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.lav_reload_bullets_hand);
                                    if (lottieAnimationView2 != null) {
                                        i = R.id.layout_gun_parent;
                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.layout_gun_parent);
                                        if (constraintLayout4 != null) {
                                            i = R.id.space_top_bar;
                                            Space space = (Space) ViewBindings.findChildViewById(view, R.id.space_top_bar);
                                            if (space != null) {
                                                i = R.id.status_bar;
                                                StatusBarFitView statusBarFitView = (StatusBarFitView) ViewBindings.findChildViewById(view, R.id.status_bar);
                                                if (statusBarFitView != null) {
                                                    i = R.id.strokeViewTop;
                                                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.strokeViewTop);
                                                    if (viewFindChildViewById != null) {
                                                        i = R.id.surface_root;
                                                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.surface_root);
                                                        if (frameLayout2 != null) {
                                                            i = R.id.tv_reload_bullets;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reload_bullets);
                                                            if (textView != null) {
                                                                i = R.id.tv_video;
                                                                TextureView textureView = (TextureView) ViewBindings.findChildViewById(view, R.id.tv_video);
                                                                if (textureView != null) {
                                                                    i = R.id.vb_bomb_effect;
                                                                    ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, R.id.vb_bomb_effect);
                                                                    if (viewStub != null) {
                                                                        i = R.id.vb_time_bomb;
                                                                        ViewStub viewStub2 = (ViewStub) ViewBindings.findChildViewById(view, R.id.vb_time_bomb);
                                                                        if (viewStub2 != null) {
                                                                            i = R.id.vb_time_bomb_c4;
                                                                            ViewStub viewStub3 = (ViewStub) ViewBindings.findChildViewById(view, R.id.vb_time_bomb_c4);
                                                                            if (viewStub3 != null) {
                                                                                i = R.id.vb_time_bomb_n;
                                                                                ViewStub viewStub4 = (ViewStub) ViewBindings.findChildViewById(view, R.id.vb_time_bomb_n);
                                                                                if (viewStub4 != null) {
                                                                                    i = R.id.vb_time_bomb_s;
                                                                                    ViewStub viewStub5 = (ViewStub) ViewBindings.findChildViewById(view, R.id.vb_time_bomb_s);
                                                                                    if (viewStub5 != null) {
                                                                                        i = R.id.video_view;
                                                                                        VideoView videoView = (VideoView) ViewBindings.findChildViewById(view, R.id.video_view);
                                                                                        if (videoView != null) {
                                                                                            return new ActivityGunBinding(constraintLayout, constraintLayout, constraintLayout2, constraintLayout3, frameLayout, group, imageView, imageView2, lottieAnimationView, lottieAnimationView2, constraintLayout4, space, statusBarFitView, viewFindChildViewById, frameLayout2, textView, textureView, viewStub, viewStub2, viewStub3, viewStub4, viewStub5, videoView);
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
    public static ActivityGunBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityGunBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_gun, viewGroup, false);
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
