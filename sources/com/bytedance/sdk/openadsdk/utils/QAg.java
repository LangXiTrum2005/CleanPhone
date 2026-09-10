package com.bytedance.sdk.openadsdk.utils;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Pair;
import androidx.core.view.GravityCompat;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class QAg {
    private static final Map<String, Pair<? extends Drawable, Integer>> Lxb = new HashMap();
    private static Integer LD = null;

    public static Drawable Lxb(Context context, String str) {
        return Lxb(context, str, true);
    }

    public static Drawable Lxb(Context context, String str, boolean z) {
        Pair<? extends Drawable, Integer> pair;
        LD = Integer.valueOf(com.bytedance.sdk.openadsdk.core.kqm.ZU().Za());
        "drawable name is: ".concat(String.valueOf(str));
        Map<String, Pair<? extends Drawable, Integer>> map = Lxb;
        map.size();
        if (!map.containsKey(str) || (pair = map.get(str)) == null) {
            Lxb();
            return Lxb(str, context, z);
        }
        Drawable drawable = (Drawable) pair.first;
        map.put(str, new Pair<>(drawable, Integer.valueOf(((Integer) pair.second).intValue() + 1)));
        return drawable;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x001e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Drawable Lxb(String str, Context context, boolean z) {
        byte b;
        Drawable layerDrawable;
        Drawable drawableLxb;
        str.getClass();
        switch (str.hashCode()) {
            case -2137782317:
                if (!str.equals("tt_leftbackicon_selector_for_dark")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -2023672829:
                if (!str.equals("tt_dislike_dialog_bg")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -2010340681:
                if (!str.equals("tt_leftbackbutton_titlebar_photo_preview")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1888785259:
                if (!str.equals("tt_seek_progress")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -1883903877:
                if (!str.equals("tt_dislike_middle_seletor")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -1881901373:
                if (!str.equals("tt_ad_cover_btn_begin_bg")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -1818605128:
                if (!str.equals("tt_leftbackicon_selector")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case -1724866088:
                if (!str.equals("tt_seek_thumb_normal")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case -1698792361:
                if (!str.equals("tt_stop_movebar_textpage")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -1500492368:
                if (!str.equals("tt_backup_btn_1")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case -1308443384:
                if (!str.equals("tt_ad_report_info_bg")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -1222892514:
                if (!str.equals("tt_playable_btn_bk")) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case -1163545839:
                if (!str.equals("tt_dislike_bottom_seletor")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case -1150582740:
                if (!str.equals("tt_seek_thumb_fullscreen")) {
                    b = -1;
                } else {
                    b = cw.k;
                }
                break;
            case -1147412691:
                if (!str.equals("tt_custom_dialog_bg")) {
                    b = -1;
                } else {
                    b = cw.l;
                }
                break;
            case -1107858393:
                if (!str.equals("tt_ad_loading_three_mid")) {
                    b = -1;
                } else {
                    b = cw.m;
                }
                break;
            case -876774215:
                if (!str.equals("tt_close_move_detail")) {
                    b = -1;
                } else {
                    b = cw.n;
                }
                break;
            case -875200849:
                if (!str.equals("tt_mute_btn_bg")) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            case -847552402:
                if (!str.equals("tt_seek_thumb")) {
                    b = -1;
                } else {
                    b = 18;
                }
                break;
            case -561153052:
                if (!str.equals("tt_reward_countdown_bg")) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case -508263579:
                if (!str.equals("tt_play_movebar_textpage")) {
                    b = -1;
                } else {
                    b = 20;
                }
                break;
            case -473198695:
                if (!str.equals("tt_refreshing_video_textpage")) {
                    b = -1;
                } else {
                    b = 21;
                }
                break;
            case -404284879:
                if (!str.equals("tt_playable_progress_style")) {
                    b = -1;
                } else {
                    b = 22;
                }
                break;
            case -292612462:
                if (!str.equals("tt_seek_thumb_fullscreen_selector")) {
                    b = -1;
                } else {
                    b = 23;
                }
                break;
            case -226695937:
                if (!str.equals("tt_ad_landing_loading_three_mid")) {
                    b = -1;
                } else {
                    b = 24;
                }
                break;
            case -154809169:
                if (!str.equals("tt_pangle_ad_mute_btn_bg")) {
                    b = -1;
                } else {
                    b = 25;
                }
                break;
            case -97103333:
                if (!str.equals("tt_video_black_desc_gradient")) {
                    b = -1;
                } else {
                    b = 26;
                }
                break;
            case 16094728:
                if (!str.equals("tt_ad_loading_three_left")) {
                    b = -1;
                } else {
                    b = 27;
                }
                break;
            case 27541452:
                if (!str.equals("tt_mute_wrapper")) {
                    b = -1;
                } else {
                    b = 28;
                }
                break;
            case 57270120:
                if (!str.equals("tt_dislike_top_bg")) {
                    b = -1;
                } else {
                    b = 29;
                }
                break;
            case 106179457:
                if (!str.equals("tt_comment_tv")) {
                    b = -1;
                } else {
                    b = 30;
                }
                break;
            case 242455215:
                if (!str.equals("tt_reward_full_new_bar_bg")) {
                    b = -1;
                } else {
                    b = 31;
                }
                break;
            case 247520514:
                if (!str.equals("tt_reward_full_video_backup_btn_bg")) {
                    b = -1;
                } else {
                    b = 32;
                }
                break;
            case 310787585:
                if (!str.equals("tt_full_reward_loading_progress_style")) {
                    b = -1;
                } else {
                    b = 33;
                }
                break;
            case 314734139:
                if (!str.equals("tt_detail_video_btn_bg")) {
                    b = -1;
                } else {
                    b = 34;
                }
                break;
            case 410262782:
                if (!str.equals("tt_pangle_banner_btn_bg")) {
                    b = -1;
                } else {
                    b = 35;
                }
                break;
            case 484030064:
                if (!str.equals("tt_seek_thumb_fullscreen_press")) {
                    b = -1;
                } else {
                    b = 36;
                }
                break;
            case 494589792:
                if (!str.equals("tt_browser_download_selector")) {
                    b = -1;
                } else {
                    b = 37;
                }
                break;
            case 504597563:
                if (!str.equals("tt_ad_loading_three_right")) {
                    b = -1;
                } else {
                    b = 38;
                }
                break;
            case 507305701:
                if (!str.equals("tt_pangle_btn_bg")) {
                    b = -1;
                } else {
                    b = 39;
                }
                break;
            case 708409173:
                if (!str.equals("tt_privacy_progress_style")) {
                    b = -1;
                } else {
                    b = 40;
                }
                break;
            case 991946046:
                if (!str.equals("tt_privacy_btn_bg")) {
                    b = -1;
                } else {
                    b = 41;
                }
                break;
            case 1054661938:
                if (!str.equals("tt_seek_thumb_press")) {
                    b = -1;
                } else {
                    b = 42;
                }
                break;
            case 1094767909:
                if (!str.equals("tt_unmute_wrapper")) {
                    b = -1;
                } else {
                    b = 43;
                }
                break;
            case 1115144587:
                if (!str.equals("tt_titlebar_close_seletor_for_dark")) {
                    b = -1;
                } else {
                    b = 44;
                }
                break;
            case 1193160467:
                if (!str.equals("tt_ad_landing_loading_three_right")) {
                    b = -1;
                } else {
                    b = 45;
                }
                break;
            case 1234814491:
                if (!str.equals("tt_landingpage_loading_text_rect")) {
                    b = -1;
                } else {
                    b = 46;
                }
                break;
            case 1241312517:
                if (!str.equals("tt_shadow_btn_back_withoutnight")) {
                    b = -1;
                } else {
                    b = 47;
                }
                break;
            case 1360033453:
                if (!str.equals("tt_circle_solid_mian")) {
                    b = -1;
                } else {
                    b = 48;
                }
                break;
            case 1391934389:
                if (!str.equals("tt_browser_progress_style")) {
                    b = -1;
                } else {
                    b = 49;
                }
                break;
            case 1459143575:
                if (!str.equals("tt_download_corner_bg")) {
                    b = -1;
                } else {
                    b = 50;
                }
                break;
            case 1473061455:
                if (!str.equals("tt_ad_report_info_button_bg")) {
                    b = -1;
                } else {
                    b = 51;
                }
                break;
            case 1562327088:
                if (!str.equals("tt_ad_landing_loading_three_left")) {
                    b = -1;
                } else {
                    b = 52;
                }
                break;
            case 1635801742:
                if (!str.equals("tt_pangle_ad_close_btn_bg")) {
                    b = -1;
                } else {
                    b = 53;
                }
                break;
            case 1733712735:
                if (!str.equals("tt_lefterbackicon_titlebar_press_wrapper")) {
                    b = -1;
                } else {
                    b = 54;
                }
                break;
            case 1859118378:
                if (!str.equals("tt_reward_video_download_btn_bg")) {
                    b = -1;
                } else {
                    b = 55;
                }
                break;
            case 1908435428:
                if (!str.equals("tt_ad_loading_rect")) {
                    b = -1;
                } else {
                    b = 56;
                }
                break;
            case 1967077738:
                if (!str.equals("tt_shadow_btn_back")) {
                    b = -1;
                } else {
                    b = 57;
                }
                break;
            case 1986221289:
                if (!str.equals("tt_dislike_top_seletor")) {
                    b = -1;
                } else {
                    b = 58;
                }
                break;
            case 1987199879:
                if (!str.equals("tt_video_loading_progress_bar")) {
                    b = -1;
                } else {
                    b = 59;
                }
                break;
            case 1995246663:
                if (!str.equals("tt_ad_skip_btn_bg2")) {
                    b = -1;
                } else {
                    b = 60;
                }
                break;
            case 2051103617:
                if (!str.equals("tt_privacy_webview_bg")) {
                    b = -1;
                } else {
                    b = 61;
                }
                break;
            case 2091139328:
                if (!str.equals("tt_titlebar_close_seletor")) {
                    b = -1;
                } else {
                    b = 62;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                drawableLxb = Lxb(com.bytedance.sdk.component.utils.tD.lk(context, "tt_lefterbackicon_titlebar_press_for_dark"), com.bytedance.sdk.component.utils.tD.lk(context, "tt_lefterbackicon_titlebar_for_dark"));
                break;
            case 1:
                drawableLxb = Lxb(0, -1, new int[]{le.lk(context, 8.0f)}, null, null, null);
                break;
            case 2:
                drawableLxb = Lxb(com.bytedance.sdk.component.utils.tD.lk(context, "tt_white_lefterbackicon_titlebar_press"), com.bytedance.sdk.component.utils.tD.lk(context, "tt_white_lefterbackicon_titlebar"));
                break;
            case 3:
                layerDrawable = new LayerDrawable(new Drawable[]{Lxb(0, Integer.valueOf(Color.parseColor("#A5FFFFFF")), new int[]{le.lk(context, 1.5f)}, new int[]{-1, le.lk(context, 1.0f)}, null, null), new ClipDrawable(Lxb(0, -1, new int[]{le.lk(context, 1.5f)}, new int[]{-1, le.lk(context, 1.0f)}, null, null), GravityCompat.START, 1), new ClipDrawable(Lxb(0, Integer.valueOf(Color.parseColor("#fff85959")), new int[]{le.lk(context, 1.5f)}, new int[]{-1, le.lk(context, 1.0f)}, null, null), GravityCompat.START, 1)});
                drawableLxb = layerDrawable;
                break;
            case 4:
                drawableLxb = Lxb(Lxb(0, Integer.valueOf(com.bytedance.sdk.component.utils.tD.ebl(context, "tt_fde6e6e6")), null, null, null, null), Lxb(0, Integer.valueOf(com.bytedance.sdk.component.utils.tD.ebl(context, "tt_fdffffff")), null, null, null, null));
                break;
            case 5:
                drawableLxb = Lxb(Lxb(0, Integer.valueOf(com.bytedance.sdk.component.utils.tD.ebl(context, "tt_2a90d7")), new int[]{le.lk(context, 6.0f)}, null, Integer.valueOf(le.lk(context, 1.0f)), Integer.valueOf(com.bytedance.sdk.component.utils.tD.ebl(context, "@color/tt_7f2a90d7"))), Lxb(0, Integer.valueOf(com.bytedance.sdk.component.utils.tD.ebl(context, "tt_2a90d7")), new int[]{le.lk(context, 6.0f)}, null, Integer.valueOf(le.lk(context, 1.0f)), Integer.valueOf(com.bytedance.sdk.component.utils.tD.ebl(context, "@color/tt_2a90d7"))));
                break;
            case 6:
                drawableLxb = com.bytedance.sdk.component.utils.tD.lk(context, "tt_lefterbackicon_titlebar");
                break;
            case 7:
                drawableLxb = Lxb(1, -1, null, new int[]{le.lk(context, 15.0f), le.lk(context, 15.0f)}, Integer.valueOf(le.lk(context, 1.0f)), 0);
                break;
            case 8:
                drawableLxb = Lxb(com.bytedance.sdk.component.utils.tD.lk(context, "tt_new_pause_video_press"), com.bytedance.sdk.component.utils.tD.lk(context, "tt_new_pause_video"));
                break;
            case 9:
                drawableLxb = Lxb(Lxb(0, Integer.valueOf(Color.parseColor("#33f32830")), new int[]{le.lk(context, 4.0f)}, null, null, null), Lxb(0, Integer.valueOf(Color.parseColor("#f32830")), new int[]{le.lk(context, 4.0f)}, null, null, null));
                break;
            case 10:
                drawableLxb = Lxb(0, -1, new int[]{le.lk(context, 12.0f), le.lk(context, 12.0f), 0, 0}, null, null, null);
                break;
            case 11:
                drawableLxb = Lxb(0, Integer.valueOf(com.bytedance.sdk.component.utils.tD.ebl(context, "tt_00000000")), new int[]{le.lk(context, 30.0f)}, null, Integer.valueOf(le.lk(context, 1.0f)), -1);
                break;
            case 12:
                drawableLxb = Lxb(Lxb(0, Integer.valueOf(com.bytedance.sdk.component.utils.tD.ebl(context, "tt_fde6e6e6")), new int[]{0, 0, le.lk(context, 5.0f), le.lk(context, 5.0f)}, null, null, null), Lxb(0, Integer.valueOf(com.bytedance.sdk.component.utils.tD.ebl(context, "tt_fdffffff")), new int[]{0, 0, le.lk(context, 5.0f), le.lk(context, 5.0f)}, null, null, null));
                break;
            case 13:
                drawableLxb = Lxb(1, -1, null, new int[]{le.lk(context, 18.0f), le.lk(context, 18.0f)}, null, null);
                break;
            case 14:
                drawableLxb = Lxb(0, -1, new int[]{le.lk(context, 6.0f)}, null, Integer.valueOf(le.lk(context, 0.8f)), -1);
                break;
            case 15:
                drawableLxb = Lxb(0, null, null, null, Integer.valueOf(le.lk(context, 1.5f)), -1);
                break;
            case 16:
                drawableLxb = Lxb(com.bytedance.sdk.component.utils.tD.lk(context, "tt_close_move_details_pressed"), com.bytedance.sdk.component.utils.tD.lk(context, "tt_close_move_details_normal"));
                break;
            case 17:
                drawableLxb = Lxb(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{le.lk(context, 28.0f), le.lk(context, 28.0f)}, null, null);
                break;
            case 18:
                drawableLxb = Lxb(Lxb(1, -1, null, new int[]{le.lk(context, 22.0f), le.lk(context, 22.0f)}, Integer.valueOf(le.lk(context, 1.0f)), 0), Lxb(1, -1, null, new int[]{le.lk(context, 15.0f), le.lk(context, 15.0f)}, Integer.valueOf(le.lk(context, 1.0f)), 0));
                break;
            case 19:
                drawableLxb = Lxb(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{le.lk(context, 28.0f), le.lk(context, 28.0f)}, null, null);
                break;
            case 20:
                drawableLxb = Lxb(com.bytedance.sdk.component.utils.tD.lk(context, "tt_new_play_video"), com.bytedance.sdk.component.utils.tD.lk(context, "tt_new_play_video"));
                break;
            case 21:
                drawableLxb = Lxb(com.bytedance.sdk.component.utils.tD.lk(context, "tt_refreshing_video_textpage_pressed"), com.bytedance.sdk.component.utils.tD.lk(context, "tt_refreshing_video_textpage_normal"));
                break;
            case 22:
                layerDrawable = new LayerDrawable(new Drawable[]{Lxb(0, Integer.valueOf(Color.parseColor("#4DFC625C")), new int[]{le.lk(context, 3.0f)}, null, null, null), new ClipDrawable(Lxb(0, Integer.valueOf(Color.parseColor("#FC625C")), new int[]{le.lk(context, 3.0f)}, null, null, null), GravityCompat.START, 1)});
                drawableLxb = layerDrawable;
                break;
            case 23:
                drawableLxb = Lxb(Lxb(1, -1, null, new int[]{le.lk(context, 18.0f), le.lk(context, 18.0f)}, Integer.valueOf(le.lk(context, 1.0f)), 0), Lxb(1, -1, null, new int[]{le.lk(context, 18.0f), le.lk(context, 18.0f)}, Integer.valueOf(le.lk(context, 1.0f)), 0));
                break;
            case 24:
                drawableLxb = Lxb(0, null, null, null, Integer.valueOf(le.lk(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case 25:
                drawableLxb = Lxb(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{le.lk(context, 28.0f), le.lk(context, 28.0f)}, null, null);
                break;
            case 26:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setColors(new int[]{com.bytedance.sdk.component.utils.tD.ebl(context, "tt_ff1a1a1a"), com.bytedance.sdk.component.utils.tD.ebl(context, "tt_00000000")});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                layerDrawable = gradientDrawable;
                drawableLxb = layerDrawable;
                break;
            case 27:
                drawableLxb = Lxb(0, null, new int[]{le.lk(context, 6.0f), 0, 0, le.lk(context, 6.0f)}, null, Integer.valueOf(le.lk(context, 1.5f)), -1);
                break;
            case 28:
                Drawable drawableLk = com.bytedance.sdk.component.utils.tD.lk(context, "tt_mute");
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[0], drawableLk);
                stateListDrawable.setAutoMirrored(true);
                layerDrawable = stateListDrawable;
                drawableLxb = layerDrawable;
                break;
            case 29:
                drawableLxb = Lxb(0, Integer.valueOf(com.bytedance.sdk.component.utils.tD.ebl(context, "tt_fdffffff")), new int[]{le.lk(context, 5.0f), le.lk(context, 5.0f), 0, 0}, null, null, null);
                break;
            case 30:
                drawableLxb = Lxb(0, -1, new int[]{le.lk(context, 4.0f)}, null, Integer.valueOf(le.lk(context, 1.0f)), Integer.valueOf(Color.parseColor("#0F161823")));
                break;
            case 31:
                drawableLxb = Lxb(0, Integer.valueOf(Color.parseColor("#ccffffff")), new int[]{le.lk(context, 18.0f)}, null, null, null);
                break;
            case 32:
                drawableLxb = Lxb(0, Integer.valueOf(Color.parseColor("#ff0088ff")), new int[]{le.lk(context, 6.0f)}, null, null, null);
                break;
            case 33:
                GradientDrawable gradientDrawableLxb = Lxb(0, Integer.valueOf(Color.parseColor("#EAEAEA")), new int[]{le.lk(context, 50.0f)}, null, null, null);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(le.lk(context, 15.0f));
                gradientDrawable2.setColors(new int[]{Color.parseColor("#1A73E8"), Color.parseColor("#569FFF")});
                gradientDrawable2.setGradientType(0);
                gradientDrawable2.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                drawableLxb = new LayerDrawable(new Drawable[]{gradientDrawableLxb, new ScaleDrawable(gradientDrawable2, GravityCompat.START, 1.0f, -1.0f)});
                break;
            case 34:
                drawableLxb = Lxb(0, Integer.valueOf(Color.parseColor("#26000000")), new int[]{le.lk(context, 4.0f)}, null, null, null);
                break;
            case 35:
                drawableLxb = Lxb(0, Integer.valueOf(Color.parseColor("#ff2f87f8")), new int[]{le.lk(context, 2.0f)}, new int[]{le.lk(context, 98.0f), le.lk(context, 25.0f)}, null, null);
                break;
            case 36:
                drawableLxb = Lxb(1, -1, null, new int[]{le.lk(context, 18.0f), le.lk(context, 18.0f)}, Integer.valueOf(le.lk(context, 1.0f)), 0);
                break;
            case 37:
                drawableLxb = Lxb(Lxb(0, Integer.valueOf(Color.parseColor("#2582c3")), null, null, null, null), Lxb(0, Integer.valueOf(Color.parseColor("#2a90d7")), null, null, null, null));
                break;
            case 38:
                drawableLxb = Lxb(0, null, new int[]{0, le.lk(context, 6.0f), le.lk(context, 6.0f), 0}, null, Integer.valueOf(le.lk(context, 1.5f)), -1);
                break;
            case 39:
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setSize(le.lk(context, 280.0f), le.lk(context, 38.0f));
                gradientDrawable3.setCornerRadius(le.lk(context, 19.0f));
                gradientDrawable3.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable3.setColors(new int[]{Color.parseColor("#fff02d42"), Color.parseColor("#fffc4b3c")});
                gradientDrawable3.setGradientType(0);
                gradientDrawable3.setUseLevel(true);
                layerDrawable = gradientDrawable3;
                drawableLxb = layerDrawable;
                break;
            case 40:
                drawableLxb = new LayerDrawable(new Drawable[]{Lxb(0, Integer.valueOf(Color.parseColor("#33007AFF")), null, null, null, null), new ClipDrawable(Lxb(0, Integer.valueOf(Color.parseColor("#007AFF")), null, null, null, null), GravityCompat.START, 1)});
                break;
            case 41:
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setSize(le.lk(context, 258.0f), le.lk(context, 43.0f));
                gradientDrawable4.setCornerRadius(le.lk(context, 22.0f));
                gradientDrawable4.setColors(new int[]{Color.parseColor("#73CBFC"), Color.parseColor("#3F9CF7")});
                gradientDrawable4.setGradientType(0);
                layerDrawable = gradientDrawable4;
                drawableLxb = layerDrawable;
                break;
            case 42:
                drawableLxb = Lxb(1, -1, null, new int[]{le.lk(context, 22.0f), le.lk(context, 22.0f)}, Integer.valueOf(le.lk(context, 1.0f)), 0);
                break;
            case 43:
                Drawable drawableLk2 = com.bytedance.sdk.component.utils.tD.lk(context, "tt_unmute");
                StateListDrawable stateListDrawable2 = new StateListDrawable();
                stateListDrawable2.addState(new int[0], drawableLk2);
                stateListDrawable2.setAutoMirrored(true);
                layerDrawable = stateListDrawable2;
                drawableLxb = layerDrawable;
                break;
            case 44:
                drawableLxb = Lxb(com.bytedance.sdk.component.utils.tD.lk(context, "tt_titlebar_close_press_for_dark"), com.bytedance.sdk.component.utils.tD.lk(context, "tt_titlebar_close_for_dark"));
                break;
            case 45:
                drawableLxb = Lxb(0, null, new int[]{0, le.lk(context, 6.0f), le.lk(context, 6.0f), 0}, null, Integer.valueOf(le.lk(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case 46:
                drawableLxb = Lxb(0, Integer.valueOf(Color.parseColor("#141A73E8")), new int[]{le.lk(context, 5.0f)}, null, null, null);
                break;
            case 47:
                Drawable drawableLk3 = com.bytedance.sdk.component.utils.tD.lk(context, "tt_shadow_lefterback_titlebar_press_withoutnight");
                StateListDrawable stateListDrawableLxb = Lxb(drawableLk3, com.bytedance.sdk.component.utils.tD.lk(context, "tt_shadow_lefterback_titlebar_withoutnight"));
                stateListDrawableLxb.addState(new int[]{-16842910}, drawableLk3);
                drawableLxb = stateListDrawableLxb;
                break;
            case 48:
                drawableLxb = Lxb(1, Integer.valueOf(com.bytedance.sdk.component.utils.tD.ebl(context, "tt_e0e0e0")), null, null, null, null);
                break;
            case 49:
                drawableLxb = new LayerDrawable(new Drawable[]{Lxb(0, -1, new int[]{0}, null, null, null), new ClipDrawable(Lxb(0, Integer.valueOf(Color.parseColor("#1A73E8")), new int[]{0}, null, null, null), 3, 1)});
                break;
            case 50:
                drawableLxb = Lxb(0, Integer.valueOf(com.bytedance.sdk.component.utils.tD.ebl(context, "tt_4a90e2")), new int[]{le.lk(context, 4.0f)}, null, null, null);
                break;
            case 51:
                drawableLxb = Lxb(Lxb(0, Integer.valueOf(Color.parseColor("#0D000000")), new int[]{le.lk(context, 2.0f)}, null, Integer.valueOf(le.lk(context, 1.0f)), Integer.valueOf(Color.parseColor("#1F000000"))), Lxb(0, -1, new int[]{le.lk(context, 2.0f)}, null, Integer.valueOf(le.lk(context, 1.0f)), Integer.valueOf(Color.parseColor("#1618231F"))));
                break;
            case 52:
                drawableLxb = Lxb(0, null, new int[]{le.lk(context, 6.0f), 0, 0, le.lk(context, 6.0f)}, null, Integer.valueOf(le.lk(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case 53:
                drawableLxb = Lxb(1, Integer.valueOf(Color.parseColor("#30333333")), null, new int[]{le.lk(context, 28.0f), le.lk(context, 28.0f)}, null, null);
                break;
            case 54:
                Drawable drawableLk4 = com.bytedance.sdk.component.utils.tD.lk(context, "tt_lefterbackicon_titlebar_press");
                StateListDrawable stateListDrawable3 = new StateListDrawable();
                stateListDrawable3.addState(new int[0], drawableLk4);
                stateListDrawable3.setAutoMirrored(true);
                layerDrawable = stateListDrawable3;
                drawableLxb = layerDrawable;
                break;
            case 55:
                drawableLxb = Lxb(0, Integer.valueOf(Color.parseColor("#ff007aff")), new int[]{le.lk(context, 18.0f)}, null, null, null);
                break;
            case Input.Keys.PERIOD /* 56 */:
                drawableLxb = Lxb(0, Integer.valueOf(Color.parseColor("#33FFFFFF")), new int[]{le.lk(context, 15.0f)}, null, null, null);
                break;
            case Input.Keys.ALT_LEFT /* 57 */:
                Drawable drawableLk5 = com.bytedance.sdk.component.utils.tD.lk(context, "tt_shadow_lefterback_titlebar_press");
                StateListDrawable stateListDrawableLxb2 = Lxb(drawableLk5, com.bytedance.sdk.component.utils.tD.lk(context, "tt_shadow_lefterback_titlebar"));
                stateListDrawableLxb2.addState(new int[]{-16842910}, drawableLk5);
                drawableLxb = stateListDrawableLxb2;
                break;
            case Input.Keys.ALT_RIGHT /* 58 */:
                drawableLxb = Lxb(Lxb(0, Integer.valueOf(com.bytedance.sdk.component.utils.tD.ebl(context, "tt_fde6e6e6")), new int[]{le.lk(context, 5.0f), le.lk(context, 5.0f), 0, 0}, null, null, null), Lxb(0, Integer.valueOf(com.bytedance.sdk.component.utils.tD.ebl(context, "tt_fdffffff")), new int[]{le.lk(context, 5.0f), le.lk(context, 5.0f), 0, 0}, null, null, null));
                break;
            case Input.Keys.SHIFT_LEFT /* 59 */:
                RotateDrawable rotateDrawable = new RotateDrawable();
                rotateDrawable.setDrawable(com.bytedance.sdk.component.utils.tD.lk(context, "tt_normalscreen_loading"));
                rotateDrawable.setFromDegrees(0.0f);
                rotateDrawable.setToDegrees(360.0f);
                rotateDrawable.setPivotX(0.5f);
                rotateDrawable.setPivotY(0.5f);
                layerDrawable = rotateDrawable;
                drawableLxb = layerDrawable;
                break;
            case 60:
                drawableLxb = Lxb(0, Integer.valueOf(Color.parseColor("#66161823")), new int[]{le.lk(context, 14.0f)}, null, null, null);
                break;
            case Input.Keys.TAB /* 61 */:
                drawableLxb = Lxb(0, -1, new int[]{le.lk(context, 14.5f)}, null, null, null);
                break;
            case Input.Keys.SPACE /* 62 */:
                drawableLxb = com.bytedance.sdk.component.utils.tD.lk(context, "tt_titlebar_close_drawable");
                break;
            default:
                drawableLxb = null;
                break;
        }
        if (z) {
            Lxb.put(str, new Pair<>(drawableLxb, 1));
        }
        return drawableLxb;
    }

    private static void Lxb() {
        Map<String, Pair<? extends Drawable, Integer>> map = Lxb;
        if (map.size() < LD.intValue()) {
            return;
        }
        String key = null;
        int iIntValue = Integer.MAX_VALUE;
        for (Map.Entry<String, Pair<? extends Drawable, Integer>> entry : map.entrySet()) {
            if (((Integer) entry.getValue().second).intValue() < iIntValue) {
                key = entry.getKey();
                iIntValue = ((Integer) entry.getValue().second).intValue();
                if (iIntValue == 1) {
                    break;
                }
            }
        }
        Lxb.remove(key);
    }

    private static GradientDrawable Lxb(int i, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        int length = iArr != null ? iArr.length : 0;
        if (length == 1) {
            gradientDrawable.setCornerRadius(iArr[0]);
        } else if (length == 4) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            gradientDrawable.setCornerRadii(new float[]{i2, i2, i3, i3, i4, i4, i5, i5});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawable.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }

    private static StateListDrawable Lxb(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (drawable != null) {
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        }
        if (drawable2 != null) {
            stateListDrawable.addState(new int[0], drawable2);
        }
        return stateListDrawable;
    }

    public static Drawable Lxb(Context context, int i) {
        return Lxb(context, Color.parseColor("#1A73E8"), i);
    }

    public static Drawable Lxb(Context context, int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(le.lk(context, i2));
        return gradientDrawable;
    }
}
