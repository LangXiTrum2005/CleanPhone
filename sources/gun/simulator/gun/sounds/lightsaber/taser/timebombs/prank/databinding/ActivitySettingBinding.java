package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.StatusBarFitView;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivitySettingBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout conTitle;

    @NonNull
    public final Group groupRate;

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final ImageView ivBg;

    @NonNull
    public final ImageView ivBgm;

    @NonNull
    public final ImageView ivBullet;

    @NonNull
    public final ImageView ivClickSound;

    @NonNull
    public final ImageView ivExplosion;

    @NonNull
    public final ImageView ivFeedback;

    @NonNull
    public final ImageView ivFlash;

    @NonNull
    public final ImageView ivHaptic;

    @NonNull
    public final ImageView ivMoreApps;

    @NonNull
    public final ImageView ivPrivacyPolicy;

    @NonNull
    public final ImageView ivRate;

    @NonNull
    public final ImageView ivScreenFlash;

    @NonNull
    public final ImageView ivShakeSound;

    @NonNull
    public final ImageView ivShare;

    @NonNull
    public final ImageView ivSound;

    @NonNull
    public final ScrollView layout;

    @NonNull
    public final View layoutAboutUs;

    @NonNull
    public final View layoutAllWeapons;

    @NonNull
    public final View layoutApp;

    @NonNull
    public final View layoutFeedback;

    @NonNull
    public final View layoutLightSaber;

    @NonNull
    public final View layoutMachineGun;

    @NonNull
    public final View layoutMoreApps;

    @NonNull
    public final View layoutPrivacyPolicy;

    @NonNull
    public final View layoutRate;

    @NonNull
    public final View layoutShare;

    @NonNull
    public final View layoutTimeBomb;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final StatusBarFitView statusBar;

    @NonNull
    public final CheckBox switchBgm;

    @NonNull
    public final CheckBox switchBullet;

    @NonNull
    public final CheckBox switchClickSound;

    @NonNull
    public final CheckBox switchExplosion;

    @NonNull
    public final Space switchFeedback;

    @NonNull
    public final CheckBox switchFiringSound;

    @NonNull
    public final CheckBox switchFlash;

    @NonNull
    public final CheckBox switchHaptic;

    @NonNull
    public final Space switchMoreApps;

    @NonNull
    public final Space switchPrivacyPolicy;

    @NonNull
    public final Space switchRate;

    @NonNull
    public final CheckBox switchScreenFlash;

    @NonNull
    public final CheckBox switchShakeSound;

    @NonNull
    public final Space switchShare;

    @NonNull
    public final TextView tvAboutUs;

    @NonNull
    public final TextView tvAllWeapons;

    @NonNull
    public final TextView tvApp;

    @NonNull
    public final TextView tvBgm;

    @NonNull
    public final TextView tvBullet;

    @NonNull
    public final TextView tvClickSound;

    @NonNull
    public final TextView tvExplosion;

    @NonNull
    public final TextView tvFeedback;

    @NonNull
    public final TextView tvFlash;

    @NonNull
    public final TextView tvHaptic;

    @NonNull
    public final TextView tvLightSaber;

    @NonNull
    public final TextView tvMachineGun;

    @NonNull
    public final TextView tvMoreApps;

    @NonNull
    public final TextView tvPrivacyPolicy;

    @NonNull
    public final TextView tvRate;

    @NonNull
    public final TextView tvScreenFlash;

    @NonNull
    public final TextView tvShakeSound;

    @NonNull
    public final TextView tvShare;

    @NonNull
    public final TextView tvSound;

    @NonNull
    public final TextView tvTimeBomb;

    @NonNull
    public final TextView tvWeaponSort;

    private ActivitySettingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Group group, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull ImageView imageView9, @NonNull ImageView imageView10, @NonNull ImageView imageView11, @NonNull ImageView imageView12, @NonNull ImageView imageView13, @NonNull ImageView imageView14, @NonNull ImageView imageView15, @NonNull ImageView imageView16, @NonNull ScrollView scrollView, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull View view6, @NonNull View view7, @NonNull View view8, @NonNull View view9, @NonNull View view10, @NonNull View view11, @NonNull StatusBarFitView statusBarFitView, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull CheckBox checkBox3, @NonNull CheckBox checkBox4, @NonNull Space space, @NonNull CheckBox checkBox5, @NonNull CheckBox checkBox6, @NonNull CheckBox checkBox7, @NonNull Space space2, @NonNull Space space3, @NonNull Space space4, @NonNull CheckBox checkBox8, @NonNull CheckBox checkBox9, @NonNull Space space5, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull TextView textView14, @NonNull TextView textView15, @NonNull TextView textView16, @NonNull TextView textView17, @NonNull TextView textView18, @NonNull TextView textView19, @NonNull TextView textView20, @NonNull TextView textView21) {
        this.rootView = constraintLayout;
        this.conTitle = constraintLayout2;
        this.groupRate = group;
        this.ivBack = imageView;
        this.ivBg = imageView2;
        this.ivBgm = imageView3;
        this.ivBullet = imageView4;
        this.ivClickSound = imageView5;
        this.ivExplosion = imageView6;
        this.ivFeedback = imageView7;
        this.ivFlash = imageView8;
        this.ivHaptic = imageView9;
        this.ivMoreApps = imageView10;
        this.ivPrivacyPolicy = imageView11;
        this.ivRate = imageView12;
        this.ivScreenFlash = imageView13;
        this.ivShakeSound = imageView14;
        this.ivShare = imageView15;
        this.ivSound = imageView16;
        this.layout = scrollView;
        this.layoutAboutUs = view;
        this.layoutAllWeapons = view2;
        this.layoutApp = view3;
        this.layoutFeedback = view4;
        this.layoutLightSaber = view5;
        this.layoutMachineGun = view6;
        this.layoutMoreApps = view7;
        this.layoutPrivacyPolicy = view8;
        this.layoutRate = view9;
        this.layoutShare = view10;
        this.layoutTimeBomb = view11;
        this.statusBar = statusBarFitView;
        this.switchBgm = checkBox;
        this.switchBullet = checkBox2;
        this.switchClickSound = checkBox3;
        this.switchExplosion = checkBox4;
        this.switchFeedback = space;
        this.switchFiringSound = checkBox5;
        this.switchFlash = checkBox6;
        this.switchHaptic = checkBox7;
        this.switchMoreApps = space2;
        this.switchPrivacyPolicy = space3;
        this.switchRate = space4;
        this.switchScreenFlash = checkBox8;
        this.switchShakeSound = checkBox9;
        this.switchShare = space5;
        this.tvAboutUs = textView;
        this.tvAllWeapons = textView2;
        this.tvApp = textView3;
        this.tvBgm = textView4;
        this.tvBullet = textView5;
        this.tvClickSound = textView6;
        this.tvExplosion = textView7;
        this.tvFeedback = textView8;
        this.tvFlash = textView9;
        this.tvHaptic = textView10;
        this.tvLightSaber = textView11;
        this.tvMachineGun = textView12;
        this.tvMoreApps = textView13;
        this.tvPrivacyPolicy = textView14;
        this.tvRate = textView15;
        this.tvScreenFlash = textView16;
        this.tvShakeSound = textView17;
        this.tvShare = textView18;
        this.tvSound = textView19;
        this.tvTimeBomb = textView20;
        this.tvWeaponSort = textView21;
    }

    @NonNull
    public static ActivitySettingBinding bind(@NonNull View view) {
        int i = R.id.con_title;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.con_title);
        if (constraintLayout != null) {
            i = R.id.group_rate;
            Group group = (Group) ViewBindings.findChildViewById(view, R.id.group_rate);
            if (group != null) {
                i = R.id.iv_back;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
                if (imageView != null) {
                    i = R.id.iv_bg;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bg);
                    if (imageView2 != null) {
                        i = R.id.iv_bgm;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bgm);
                        if (imageView3 != null) {
                            i = R.id.iv_bullet;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bullet);
                            if (imageView4 != null) {
                                i = R.id.iv_click_sound;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_click_sound);
                                if (imageView5 != null) {
                                    i = R.id.iv_explosion;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_explosion);
                                    if (imageView6 != null) {
                                        i = R.id.iv_feedback;
                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_feedback);
                                        if (imageView7 != null) {
                                            i = R.id.iv_flash;
                                            ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_flash);
                                            if (imageView8 != null) {
                                                i = R.id.iv_haptic;
                                                ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_haptic);
                                                if (imageView9 != null) {
                                                    i = R.id.iv_more_apps;
                                                    ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_more_apps);
                                                    if (imageView10 != null) {
                                                        i = R.id.iv_privacy_policy;
                                                        ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_privacy_policy);
                                                        if (imageView11 != null) {
                                                            i = R.id.iv_rate;
                                                            ImageView imageView12 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_rate);
                                                            if (imageView12 != null) {
                                                                i = R.id.iv_screen_flash;
                                                                ImageView imageView13 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_screen_flash);
                                                                if (imageView13 != null) {
                                                                    i = R.id.iv_shake_sound;
                                                                    ImageView imageView14 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_shake_sound);
                                                                    if (imageView14 != null) {
                                                                        i = R.id.iv_share;
                                                                        ImageView imageView15 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_share);
                                                                        if (imageView15 != null) {
                                                                            i = R.id.iv_sound;
                                                                            ImageView imageView16 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sound);
                                                                            if (imageView16 != null) {
                                                                                i = R.id.layout;
                                                                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.layout);
                                                                                if (scrollView != null) {
                                                                                    i = R.id.layout_about_us;
                                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_about_us);
                                                                                    if (viewFindChildViewById != null) {
                                                                                        i = R.id.layout_all_weapons;
                                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.layout_all_weapons);
                                                                                        if (viewFindChildViewById2 != null) {
                                                                                            i = R.id.layout_app;
                                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.layout_app);
                                                                                            if (viewFindChildViewById3 != null) {
                                                                                                i = R.id.layout_feedback;
                                                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.layout_feedback);
                                                                                                if (viewFindChildViewById4 != null) {
                                                                                                    i = R.id.layout_light_saber;
                                                                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(view, R.id.layout_light_saber);
                                                                                                    if (viewFindChildViewById5 != null) {
                                                                                                        i = R.id.layout_machine_gun;
                                                                                                        View viewFindChildViewById6 = ViewBindings.findChildViewById(view, R.id.layout_machine_gun);
                                                                                                        if (viewFindChildViewById6 != null) {
                                                                                                            i = R.id.layout_more_apps;
                                                                                                            View viewFindChildViewById7 = ViewBindings.findChildViewById(view, R.id.layout_more_apps);
                                                                                                            if (viewFindChildViewById7 != null) {
                                                                                                                i = R.id.layout_privacy_policy;
                                                                                                                View viewFindChildViewById8 = ViewBindings.findChildViewById(view, R.id.layout_privacy_policy);
                                                                                                                if (viewFindChildViewById8 != null) {
                                                                                                                    i = R.id.layout_rate;
                                                                                                                    View viewFindChildViewById9 = ViewBindings.findChildViewById(view, R.id.layout_rate);
                                                                                                                    if (viewFindChildViewById9 != null) {
                                                                                                                        i = R.id.layout_share;
                                                                                                                        View viewFindChildViewById10 = ViewBindings.findChildViewById(view, R.id.layout_share);
                                                                                                                        if (viewFindChildViewById10 != null) {
                                                                                                                            i = R.id.layout_time_bomb;
                                                                                                                            View viewFindChildViewById11 = ViewBindings.findChildViewById(view, R.id.layout_time_bomb);
                                                                                                                            if (viewFindChildViewById11 != null) {
                                                                                                                                i = R.id.status_bar;
                                                                                                                                StatusBarFitView statusBarFitView = (StatusBarFitView) ViewBindings.findChildViewById(view, R.id.status_bar);
                                                                                                                                if (statusBarFitView != null) {
                                                                                                                                    i = R.id.switch_bgm;
                                                                                                                                    CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.switch_bgm);
                                                                                                                                    if (checkBox != null) {
                                                                                                                                        i = R.id.switch_bullet;
                                                                                                                                        CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, R.id.switch_bullet);
                                                                                                                                        if (checkBox2 != null) {
                                                                                                                                            i = R.id.switch_click_sound;
                                                                                                                                            CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(view, R.id.switch_click_sound);
                                                                                                                                            if (checkBox3 != null) {
                                                                                                                                                i = R.id.switch_explosion;
                                                                                                                                                CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(view, R.id.switch_explosion);
                                                                                                                                                if (checkBox4 != null) {
                                                                                                                                                    i = R.id.switch_feedback;
                                                                                                                                                    Space space = (Space) ViewBindings.findChildViewById(view, R.id.switch_feedback);
                                                                                                                                                    if (space != null) {
                                                                                                                                                        i = R.id.switch_firing_sound;
                                                                                                                                                        CheckBox checkBox5 = (CheckBox) ViewBindings.findChildViewById(view, R.id.switch_firing_sound);
                                                                                                                                                        if (checkBox5 != null) {
                                                                                                                                                            i = R.id.switch_flash;
                                                                                                                                                            CheckBox checkBox6 = (CheckBox) ViewBindings.findChildViewById(view, R.id.switch_flash);
                                                                                                                                                            if (checkBox6 != null) {
                                                                                                                                                                i = R.id.switch_haptic;
                                                                                                                                                                CheckBox checkBox7 = (CheckBox) ViewBindings.findChildViewById(view, R.id.switch_haptic);
                                                                                                                                                                if (checkBox7 != null) {
                                                                                                                                                                    i = R.id.switch_more_apps;
                                                                                                                                                                    Space space2 = (Space) ViewBindings.findChildViewById(view, R.id.switch_more_apps);
                                                                                                                                                                    if (space2 != null) {
                                                                                                                                                                        i = R.id.switch_privacy_policy;
                                                                                                                                                                        Space space3 = (Space) ViewBindings.findChildViewById(view, R.id.switch_privacy_policy);
                                                                                                                                                                        if (space3 != null) {
                                                                                                                                                                            i = R.id.switch_rate;
                                                                                                                                                                            Space space4 = (Space) ViewBindings.findChildViewById(view, R.id.switch_rate);
                                                                                                                                                                            if (space4 != null) {
                                                                                                                                                                                i = R.id.switch_screen_flash;
                                                                                                                                                                                CheckBox checkBox8 = (CheckBox) ViewBindings.findChildViewById(view, R.id.switch_screen_flash);
                                                                                                                                                                                if (checkBox8 != null) {
                                                                                                                                                                                    i = R.id.switch_shake_sound;
                                                                                                                                                                                    CheckBox checkBox9 = (CheckBox) ViewBindings.findChildViewById(view, R.id.switch_shake_sound);
                                                                                                                                                                                    if (checkBox9 != null) {
                                                                                                                                                                                        i = R.id.switch_share;
                                                                                                                                                                                        Space space5 = (Space) ViewBindings.findChildViewById(view, R.id.switch_share);
                                                                                                                                                                                        if (space5 != null) {
                                                                                                                                                                                            i = R.id.tv_about_us;
                                                                                                                                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_about_us);
                                                                                                                                                                                            if (textView != null) {
                                                                                                                                                                                                i = R.id.tv_all_weapons;
                                                                                                                                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_all_weapons);
                                                                                                                                                                                                if (textView2 != null) {
                                                                                                                                                                                                    i = R.id.tv_app;
                                                                                                                                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app);
                                                                                                                                                                                                    if (textView3 != null) {
                                                                                                                                                                                                        i = R.id.tv_bgm;
                                                                                                                                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bgm);
                                                                                                                                                                                                        if (textView4 != null) {
                                                                                                                                                                                                            i = R.id.tv_bullet;
                                                                                                                                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bullet);
                                                                                                                                                                                                            if (textView5 != null) {
                                                                                                                                                                                                                i = R.id.tv_click_sound;
                                                                                                                                                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_click_sound);
                                                                                                                                                                                                                if (textView6 != null) {
                                                                                                                                                                                                                    i = R.id.tv_explosion;
                                                                                                                                                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_explosion);
                                                                                                                                                                                                                    if (textView7 != null) {
                                                                                                                                                                                                                        i = R.id.tv_feedback;
                                                                                                                                                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_feedback);
                                                                                                                                                                                                                        if (textView8 != null) {
                                                                                                                                                                                                                            i = R.id.tv_flash;
                                                                                                                                                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_flash);
                                                                                                                                                                                                                            if (textView9 != null) {
                                                                                                                                                                                                                                i = R.id.tv_haptic;
                                                                                                                                                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_haptic);
                                                                                                                                                                                                                                if (textView10 != null) {
                                                                                                                                                                                                                                    i = R.id.tv_light_saber;
                                                                                                                                                                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_light_saber);
                                                                                                                                                                                                                                    if (textView11 != null) {
                                                                                                                                                                                                                                        i = R.id.tv_machine_gun;
                                                                                                                                                                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_machine_gun);
                                                                                                                                                                                                                                        if (textView12 != null) {
                                                                                                                                                                                                                                            i = R.id.tv_more_apps;
                                                                                                                                                                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_more_apps);
                                                                                                                                                                                                                                            if (textView13 != null) {
                                                                                                                                                                                                                                                i = R.id.tv_privacy_policy;
                                                                                                                                                                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_privacy_policy);
                                                                                                                                                                                                                                                if (textView14 != null) {
                                                                                                                                                                                                                                                    i = R.id.tv_rate;
                                                                                                                                                                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_rate);
                                                                                                                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                                                                                                                        i = R.id.tv_screen_flash;
                                                                                                                                                                                                                                                        TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_screen_flash);
                                                                                                                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                                                                                                                            i = R.id.tv_shake_sound;
                                                                                                                                                                                                                                                            TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_shake_sound);
                                                                                                                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                                                                                                                i = R.id.tv_share;
                                                                                                                                                                                                                                                                TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_share);
                                                                                                                                                                                                                                                                if (textView18 != null) {
                                                                                                                                                                                                                                                                    i = R.id.tv_sound;
                                                                                                                                                                                                                                                                    TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sound);
                                                                                                                                                                                                                                                                    if (textView19 != null) {
                                                                                                                                                                                                                                                                        i = R.id.tv_time_bomb;
                                                                                                                                                                                                                                                                        TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_bomb);
                                                                                                                                                                                                                                                                        if (textView20 != null) {
                                                                                                                                                                                                                                                                            i = R.id.tv_weapon_sort;
                                                                                                                                                                                                                                                                            TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_weapon_sort);
                                                                                                                                                                                                                                                                            if (textView21 != null) {
                                                                                                                                                                                                                                                                                return new ActivitySettingBinding((ConstraintLayout) view, constraintLayout, group, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, scrollView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8, viewFindChildViewById9, viewFindChildViewById10, viewFindChildViewById11, statusBarFitView, checkBox, checkBox2, checkBox3, checkBox4, space, checkBox5, checkBox6, checkBox7, space2, space3, space4, checkBox8, checkBox9, space5, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21);
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
    public static ActivitySettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_setting, viewGroup, false);
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
