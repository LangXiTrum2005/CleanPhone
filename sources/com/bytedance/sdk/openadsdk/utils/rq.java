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
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class rq {
    private static final Map<String, Pair<? extends Drawable, Integer>> qdl = new HashMap();
    private static Integer ud = null;

    public static Drawable qdl(Context context, String str) {
        return qdl(context, str, true);
    }

    public static Drawable qdl(Context context, String str, boolean z2) {
        Pair<? extends Drawable, Integer> pair;
        ud = Integer.valueOf(com.bytedance.sdk.openadsdk.core.yt.mml().exu());
        "drawable name is: ".concat(String.valueOf(str));
        Map<String, Pair<? extends Drawable, Integer>> map = qdl;
        map.size();
        if (!map.containsKey(str) || (pair = map.get(str)) == null) {
            qdl();
            return qdl(str, context, z2);
        }
        Drawable drawable = (Drawable) pair.first;
        map.put(str, new Pair<>(drawable, Integer.valueOf(((Integer) pair.second).intValue() + 1)));
        return drawable;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0032  */
    private static Drawable qdl(String str, Context context, boolean z2) {
        Drawable layerDrawable;
        Drawable drawableQdl;
        str.getClass();
        switch (str) {
            case "tt_leftbackicon_selector_for_dark":
                drawableQdl = qdl(com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_lefterbackicon_titlebar_press_for_dark"), com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_lefterbackicon_titlebar_for_dark"));
                break;
            case "tt_dislike_dialog_bg":
                drawableQdl = qdl(0, -1, new int[]{ax.ud(context, 8.0f)}, null, null, null);
                break;
            case "tt_leftbackbutton_titlebar_photo_preview":
                drawableQdl = qdl(com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_white_lefterbackicon_titlebar_press"), com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_white_lefterbackicon_titlebar"));
                break;
            case "tt_seek_progress":
                layerDrawable = new LayerDrawable(new Drawable[]{qdl(0, Integer.valueOf(Color.parseColor("#A5FFFFFF")), new int[]{ax.ud(context, 1.5f)}, new int[]{-1, ax.ud(context, 1.0f)}, null, null), new ClipDrawable(qdl(0, -1, new int[]{ax.ud(context, 1.5f)}, new int[]{-1, ax.ud(context, 1.0f)}, null, null), 8388611, 1), new ClipDrawable(qdl(0, Integer.valueOf(Color.parseColor("#fff85959")), new int[]{ax.ud(context, 1.5f)}, new int[]{-1, ax.ud(context, 1.0f)}, null, null), 8388611, 1)});
                drawableQdl = layerDrawable;
                break;
            case "tt_dislike_middle_seletor":
                drawableQdl = qdl(qdl(0, Integer.valueOf(com.bytedance.sdk.component.utils.ljh.wd(context, "tt_fde6e6e6")), null, null, null, null), qdl(0, Integer.valueOf(com.bytedance.sdk.component.utils.ljh.wd(context, "tt_fdffffff")), null, null, null, null));
                break;
            case "tt_ad_cover_btn_begin_bg":
                drawableQdl = qdl(qdl(0, Integer.valueOf(com.bytedance.sdk.component.utils.ljh.wd(context, "tt_2a90d7")), new int[]{ax.ud(context, 6.0f)}, null, Integer.valueOf(ax.ud(context, 1.0f)), Integer.valueOf(com.bytedance.sdk.component.utils.ljh.wd(context, "@color/tt_7f2a90d7"))), qdl(0, Integer.valueOf(com.bytedance.sdk.component.utils.ljh.wd(context, "tt_2a90d7")), new int[]{ax.ud(context, 6.0f)}, null, Integer.valueOf(ax.ud(context, 1.0f)), Integer.valueOf(com.bytedance.sdk.component.utils.ljh.wd(context, "@color/tt_2a90d7"))));
                break;
            case "tt_leftbackicon_selector":
                drawableQdl = com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_lefterbackicon_titlebar");
                break;
            case "tt_seek_thumb_normal":
                drawableQdl = qdl(1, -1, null, new int[]{ax.ud(context, 15.0f), ax.ud(context, 15.0f)}, Integer.valueOf(ax.ud(context, 1.0f)), 0);
                break;
            case "tt_stop_movebar_textpage":
                drawableQdl = qdl(com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_new_pause_video_press"), com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_new_pause_video"));
                break;
            case "tt_backup_btn_1":
                drawableQdl = qdl(qdl(0, Integer.valueOf(Color.parseColor("#33f32830")), new int[]{ax.ud(context, 4.0f)}, null, null, null), qdl(0, Integer.valueOf(Color.parseColor("#f32830")), new int[]{ax.ud(context, 4.0f)}, null, null, null));
                break;
            case "tt_ad_report_info_bg":
                drawableQdl = qdl(0, -1, new int[]{ax.ud(context, 12.0f), ax.ud(context, 12.0f), 0, 0}, null, null, null);
                break;
            case "tt_playable_btn_bk":
                drawableQdl = qdl(0, Integer.valueOf(com.bytedance.sdk.component.utils.ljh.wd(context, "tt_00000000")), new int[]{ax.ud(context, 30.0f)}, null, Integer.valueOf(ax.ud(context, 1.0f)), -1);
                break;
            case "tt_dislike_bottom_seletor":
                drawableQdl = qdl(qdl(0, Integer.valueOf(com.bytedance.sdk.component.utils.ljh.wd(context, "tt_fde6e6e6")), new int[]{0, 0, ax.ud(context, 5.0f), ax.ud(context, 5.0f)}, null, null, null), qdl(0, Integer.valueOf(com.bytedance.sdk.component.utils.ljh.wd(context, "tt_fdffffff")), new int[]{0, 0, ax.ud(context, 5.0f), ax.ud(context, 5.0f)}, null, null, null));
                break;
            case "tt_seek_thumb_fullscreen":
                drawableQdl = qdl(1, -1, null, new int[]{ax.ud(context, 18.0f), ax.ud(context, 18.0f)}, null, null);
                break;
            case "tt_custom_dialog_bg":
                drawableQdl = qdl(0, -1, new int[]{ax.ud(context, 6.0f)}, null, Integer.valueOf(ax.ud(context, 0.8f)), -1);
                break;
            case "tt_ad_loading_three_mid":
                drawableQdl = qdl(0, null, null, null, Integer.valueOf(ax.ud(context, 1.5f)), -1);
                break;
            case "tt_close_move_detail":
                drawableQdl = qdl(com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_close_move_details_pressed"), com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_close_move_details_normal"));
                break;
            case "tt_mute_btn_bg":
                drawableQdl = qdl(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{ax.ud(context, 28.0f), ax.ud(context, 28.0f)}, null, null);
                break;
            case "tt_seek_thumb":
                drawableQdl = qdl(qdl(1, -1, null, new int[]{ax.ud(context, 22.0f), ax.ud(context, 22.0f)}, Integer.valueOf(ax.ud(context, 1.0f)), 0), qdl(1, -1, null, new int[]{ax.ud(context, 15.0f), ax.ud(context, 15.0f)}, Integer.valueOf(ax.ud(context, 1.0f)), 0));
                break;
            case "tt_reward_countdown_bg":
                drawableQdl = qdl(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{ax.ud(context, 28.0f), ax.ud(context, 28.0f)}, null, null);
                break;
            case "tt_play_movebar_textpage":
                drawableQdl = qdl(com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_new_play_video"), com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_new_play_video"));
                break;
            case "tt_refreshing_video_textpage":
                drawableQdl = qdl(com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_refreshing_video_textpage_pressed"), com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_refreshing_video_textpage_normal"));
                break;
            case "tt_playable_progress_style":
                layerDrawable = new LayerDrawable(new Drawable[]{qdl(0, Integer.valueOf(Color.parseColor("#4DFC625C")), new int[]{ax.ud(context, 3.0f)}, null, null, null), new ClipDrawable(qdl(0, Integer.valueOf(Color.parseColor("#FC625C")), new int[]{ax.ud(context, 3.0f)}, null, null, null), 8388611, 1)});
                drawableQdl = layerDrawable;
                break;
            case "tt_seek_thumb_fullscreen_selector":
                drawableQdl = qdl(qdl(1, -1, null, new int[]{ax.ud(context, 18.0f), ax.ud(context, 18.0f)}, Integer.valueOf(ax.ud(context, 1.0f)), 0), qdl(1, -1, null, new int[]{ax.ud(context, 18.0f), ax.ud(context, 18.0f)}, Integer.valueOf(ax.ud(context, 1.0f)), 0));
                break;
            case "tt_ad_landing_loading_three_mid":
                drawableQdl = qdl(0, null, null, null, Integer.valueOf(ax.ud(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case "tt_pangle_ad_mute_btn_bg":
                drawableQdl = qdl(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{ax.ud(context, 28.0f), ax.ud(context, 28.0f)}, null, null);
                break;
            case "tt_video_black_desc_gradient":
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setColors(new int[]{com.bytedance.sdk.component.utils.ljh.wd(context, "tt_ff1a1a1a"), com.bytedance.sdk.component.utils.ljh.wd(context, "tt_00000000")});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                layerDrawable = gradientDrawable;
                drawableQdl = layerDrawable;
                break;
            case "tt_ad_loading_three_left":
                drawableQdl = qdl(0, null, new int[]{ax.ud(context, 6.0f), 0, 0, ax.ud(context, 6.0f)}, null, Integer.valueOf(ax.ud(context, 1.5f)), -1);
                break;
            case "tt_mute_wrapper":
                Drawable drawableLnr = com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_mute");
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[0], drawableLnr);
                stateListDrawable.setAutoMirrored(true);
                layerDrawable = stateListDrawable;
                drawableQdl = layerDrawable;
                break;
            case "tt_dislike_top_bg":
                drawableQdl = qdl(0, Integer.valueOf(com.bytedance.sdk.component.utils.ljh.wd(context, "tt_fdffffff")), new int[]{ax.ud(context, 5.0f), ax.ud(context, 5.0f), 0, 0}, null, null, null);
                break;
            case "tt_comment_tv":
                drawableQdl = qdl(0, -1, new int[]{ax.ud(context, 4.0f)}, null, Integer.valueOf(ax.ud(context, 1.0f)), Integer.valueOf(Color.parseColor("#0F161823")));
                break;
            case "tt_reward_full_new_bar_bg":
                drawableQdl = qdl(0, Integer.valueOf(Color.parseColor("#ccffffff")), new int[]{ax.ud(context, 18.0f)}, null, null, null);
                break;
            case "tt_reward_full_video_backup_btn_bg":
                drawableQdl = qdl(0, Integer.valueOf(Color.parseColor("#ff0088ff")), new int[]{ax.ud(context, 6.0f)}, null, null, null);
                break;
            case "tt_full_reward_loading_progress_style":
                GradientDrawable gradientDrawableQdl = qdl(0, Integer.valueOf(Color.parseColor("#EAEAEA")), new int[]{ax.ud(context, 50.0f)}, null, null, null);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(ax.ud(context, 15.0f));
                gradientDrawable2.setColors(new int[]{Color.parseColor("#1A73E8"), Color.parseColor("#569FFF")});
                gradientDrawable2.setGradientType(0);
                gradientDrawable2.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                drawableQdl = new LayerDrawable(new Drawable[]{gradientDrawableQdl, new ScaleDrawable(gradientDrawable2, 8388611, 1.0f, -1.0f)});
                break;
            case "tt_detail_video_btn_bg":
                drawableQdl = qdl(0, Integer.valueOf(Color.parseColor("#26000000")), new int[]{ax.ud(context, 4.0f)}, null, null, null);
                break;
            case "tt_pangle_banner_btn_bg":
                drawableQdl = qdl(0, Integer.valueOf(Color.parseColor("#ff2f87f8")), new int[]{ax.ud(context, 2.0f)}, new int[]{ax.ud(context, 98.0f), ax.ud(context, 25.0f)}, null, null);
                break;
            case "tt_seek_thumb_fullscreen_press":
                drawableQdl = qdl(1, -1, null, new int[]{ax.ud(context, 18.0f), ax.ud(context, 18.0f)}, Integer.valueOf(ax.ud(context, 1.0f)), 0);
                break;
            case "tt_browser_download_selector":
                drawableQdl = qdl(qdl(0, Integer.valueOf(Color.parseColor("#2582c3")), null, null, null, null), qdl(0, Integer.valueOf(Color.parseColor("#2a90d7")), null, null, null, null));
                break;
            case "tt_ad_loading_three_right":
                drawableQdl = qdl(0, null, new int[]{0, ax.ud(context, 6.0f), ax.ud(context, 6.0f), 0}, null, Integer.valueOf(ax.ud(context, 1.5f)), -1);
                break;
            case "tt_pangle_btn_bg":
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setSize(ax.ud(context, 280.0f), ax.ud(context, 38.0f));
                gradientDrawable3.setCornerRadius(ax.ud(context, 19.0f));
                gradientDrawable3.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable3.setColors(new int[]{Color.parseColor("#fff02d42"), Color.parseColor("#fffc4b3c")});
                gradientDrawable3.setGradientType(0);
                gradientDrawable3.setUseLevel(true);
                layerDrawable = gradientDrawable3;
                drawableQdl = layerDrawable;
                break;
            case "tt_privacy_progress_style":
                drawableQdl = new LayerDrawable(new Drawable[]{qdl(0, Integer.valueOf(Color.parseColor("#33007AFF")), null, null, null, null), new ClipDrawable(qdl(0, Integer.valueOf(Color.parseColor("#007AFF")), null, null, null, null), 8388611, 1)});
                break;
            case "tt_privacy_btn_bg":
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setSize(ax.ud(context, 258.0f), ax.ud(context, 43.0f));
                gradientDrawable4.setCornerRadius(ax.ud(context, 22.0f));
                gradientDrawable4.setColors(new int[]{Color.parseColor("#73CBFC"), Color.parseColor("#3F9CF7")});
                gradientDrawable4.setGradientType(0);
                layerDrawable = gradientDrawable4;
                drawableQdl = layerDrawable;
                break;
            case "tt_seek_thumb_press":
                drawableQdl = qdl(1, -1, null, new int[]{ax.ud(context, 22.0f), ax.ud(context, 22.0f)}, Integer.valueOf(ax.ud(context, 1.0f)), 0);
                break;
            case "tt_unmute_wrapper":
                Drawable drawableLnr2 = com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_unmute");
                StateListDrawable stateListDrawable2 = new StateListDrawable();
                stateListDrawable2.addState(new int[0], drawableLnr2);
                stateListDrawable2.setAutoMirrored(true);
                layerDrawable = stateListDrawable2;
                drawableQdl = layerDrawable;
                break;
            case "tt_titlebar_close_seletor_for_dark":
                drawableQdl = qdl(com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_titlebar_close_press_for_dark"), com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_titlebar_close_for_dark"));
                break;
            case "tt_ad_landing_loading_three_right":
                drawableQdl = qdl(0, null, new int[]{0, ax.ud(context, 6.0f), ax.ud(context, 6.0f), 0}, null, Integer.valueOf(ax.ud(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case "tt_landingpage_loading_text_rect":
                drawableQdl = qdl(0, Integer.valueOf(Color.parseColor("#141A73E8")), new int[]{ax.ud(context, 5.0f)}, null, null, null);
                break;
            case "tt_shadow_btn_back_withoutnight":
                Drawable drawableLnr3 = com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_shadow_lefterback_titlebar_press_withoutnight");
                StateListDrawable stateListDrawableQdl = qdl(drawableLnr3, com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_shadow_lefterback_titlebar_withoutnight"));
                stateListDrawableQdl.addState(new int[]{-16842910}, drawableLnr3);
                drawableQdl = stateListDrawableQdl;
                break;
            case "tt_circle_solid_mian":
                drawableQdl = qdl(1, Integer.valueOf(com.bytedance.sdk.component.utils.ljh.wd(context, "tt_e0e0e0")), null, null, null, null);
                break;
            case "tt_browser_progress_style":
                drawableQdl = new LayerDrawable(new Drawable[]{qdl(0, -1, new int[]{0}, null, null, null), new ClipDrawable(qdl(0, Integer.valueOf(Color.parseColor("#1A73E8")), new int[]{0}, null, null, null), 3, 1)});
                break;
            case "tt_download_corner_bg":
                drawableQdl = qdl(0, Integer.valueOf(com.bytedance.sdk.component.utils.ljh.wd(context, "tt_4a90e2")), new int[]{ax.ud(context, 4.0f)}, null, null, null);
                break;
            case "tt_ad_report_info_button_bg":
                drawableQdl = qdl(qdl(0, Integer.valueOf(Color.parseColor("#0D000000")), new int[]{ax.ud(context, 2.0f)}, null, Integer.valueOf(ax.ud(context, 1.0f)), Integer.valueOf(Color.parseColor("#1F000000"))), qdl(0, -1, new int[]{ax.ud(context, 2.0f)}, null, Integer.valueOf(ax.ud(context, 1.0f)), Integer.valueOf(Color.parseColor("#1618231F"))));
                break;
            case "tt_ad_landing_loading_three_left":
                drawableQdl = qdl(0, null, new int[]{ax.ud(context, 6.0f), 0, 0, ax.ud(context, 6.0f)}, null, Integer.valueOf(ax.ud(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case "tt_pangle_ad_close_btn_bg":
                drawableQdl = qdl(1, Integer.valueOf(Color.parseColor("#30333333")), null, new int[]{ax.ud(context, 28.0f), ax.ud(context, 28.0f)}, null, null);
                break;
            case "tt_lefterbackicon_titlebar_press_wrapper":
                Drawable drawableLnr4 = com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_lefterbackicon_titlebar_press");
                StateListDrawable stateListDrawable3 = new StateListDrawable();
                stateListDrawable3.addState(new int[0], drawableLnr4);
                stateListDrawable3.setAutoMirrored(true);
                layerDrawable = stateListDrawable3;
                drawableQdl = layerDrawable;
                break;
            case "tt_reward_video_download_btn_bg":
                drawableQdl = qdl(0, Integer.valueOf(Color.parseColor("#ff007aff")), new int[]{ax.ud(context, 18.0f)}, null, null, null);
                break;
            case "tt_ad_loading_rect":
                drawableQdl = qdl(0, Integer.valueOf(Color.parseColor("#33FFFFFF")), new int[]{ax.ud(context, 15.0f)}, null, null, null);
                break;
            case "tt_shadow_btn_back":
                Drawable drawableLnr5 = com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_shadow_lefterback_titlebar_press");
                StateListDrawable stateListDrawableQdl2 = qdl(drawableLnr5, com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_shadow_lefterback_titlebar"));
                stateListDrawableQdl2.addState(new int[]{-16842910}, drawableLnr5);
                drawableQdl = stateListDrawableQdl2;
                break;
            case "tt_dislike_top_seletor":
                drawableQdl = qdl(qdl(0, Integer.valueOf(com.bytedance.sdk.component.utils.ljh.wd(context, "tt_fde6e6e6")), new int[]{ax.ud(context, 5.0f), ax.ud(context, 5.0f), 0, 0}, null, null, null), qdl(0, Integer.valueOf(com.bytedance.sdk.component.utils.ljh.wd(context, "tt_fdffffff")), new int[]{ax.ud(context, 5.0f), ax.ud(context, 5.0f), 0, 0}, null, null, null));
                break;
            case "tt_video_loading_progress_bar":
                RotateDrawable rotateDrawable = new RotateDrawable();
                rotateDrawable.setDrawable(com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_normalscreen_loading"));
                rotateDrawable.setFromDegrees(0.0f);
                rotateDrawable.setToDegrees(360.0f);
                rotateDrawable.setPivotX(0.5f);
                rotateDrawable.setPivotY(0.5f);
                layerDrawable = rotateDrawable;
                drawableQdl = layerDrawable;
                break;
            case "tt_ad_skip_btn_bg2":
                drawableQdl = qdl(0, Integer.valueOf(Color.parseColor("#66161823")), new int[]{ax.ud(context, 14.0f)}, null, null, null);
                break;
            case "tt_privacy_webview_bg":
                drawableQdl = qdl(0, -1, new int[]{ax.ud(context, 14.5f)}, null, null, null);
                break;
            case "tt_titlebar_close_seletor":
                drawableQdl = com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_titlebar_close_drawable");
                break;
            default:
                drawableQdl = null;
                break;
        }
        if (z2) {
            qdl.put(str, new Pair<>(drawableQdl, 1));
        }
        return drawableQdl;
    }

    private static void qdl() {
        Map<String, Pair<? extends Drawable, Integer>> map = qdl;
        if (map.size() < ud.intValue()) {
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
        qdl.remove(key);
    }

    private static GradientDrawable qdl(int i2, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i2);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        int length = iArr != null ? iArr.length : 0;
        if (length == 1) {
            gradientDrawable.setCornerRadius(iArr[0]);
        } else if (length == 4) {
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            gradientDrawable.setCornerRadii(new float[]{i3, i3, i4, i4, i5, i5, i6, i6});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawable.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }

    private static StateListDrawable qdl(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (drawable != null) {
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        }
        if (drawable2 != null) {
            stateListDrawable.addState(new int[0], drawable2);
        }
        return stateListDrawable;
    }

    public static Drawable qdl(Context context, int i2) {
        return qdl(context, Color.parseColor("#1A73E8"), i2);
    }

    public static Drawable qdl(Context context, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(ax.ud(context, i3));
        return gradientDrawable;
    }
}
