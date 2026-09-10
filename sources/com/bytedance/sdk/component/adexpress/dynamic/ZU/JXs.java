package com.bytedance.sdk.component.adexpress.dynamic.ZU;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class JXs {
    public static final Map<String, Integer> Lxb;
    private lc JXs;
    private String LD;
    private lc ZU;
    private String lc;
    private String lk;

    static {
        HashMap map = new HashMap();
        Lxb = map;
        map.put("root", 8);
        map.put("footer", 6);
        map.put("empty", 6);
        map.put(CampaignEx.JSON_KEY_TITLE, 0);
        map.put("subtitle", 0);
        map.put("source", 0);
        map.put("score-count", 0);
        map.put("text_star", 0);
        map.put(MimeTypes.BASE_TYPE_TEXT, 0);
        map.put("tag-group", 17);
        map.put("app-version", 0);
        map.put("development-name", 0);
        map.put("privacy-detail", 23);
        map.put("image", 1);
        map.put("image-wide", 1);
        map.put("image-square", 1);
        map.put("image-long", 1);
        map.put("image-splash", 1);
        map.put("image-cover", 1);
        map.put("app-icon", 1);
        map.put("icon-download", 1);
        map.put("logoad", 4);
        AbstractC5044xl.r(5, map, "logounion", 9, "logo-union");
        map.put("dislike", 3);
        map.put("close", 3);
        map.put("close-fill", 3);
        AbstractC5044xl.r(22, map, "webview-close", 12, "feedback-dislike");
        map.put("button", 2);
        map.put("downloadWithIcon", 2);
        map.put("downloadButton", 2);
        map.put("fillButton", 2);
        map.put("laceButton", 2);
        map.put("cardButton", 2);
        map.put("colourMixtureButton", 2);
        map.put("arrowButton", 1);
        map.put("download-progress-button", 2);
        map.put("vessel", 6);
        map.put("image-group", 6);
        map.put("custom-component-vessel", 6);
        map.put("carousel", 24);
        AbstractC5044xl.r(26, map, "carousel-vessel", 25, "leisure-interact");
        map.put("video-hd", 7);
        map.put("video", 7);
        map.put("video-vd", 7);
        map.put("video-sq", 7);
        map.put("muted", 10);
        AbstractC5044xl.r(11, map, "star", 19, "skip-countdowns");
        map.put("skip-with-countdowns-skip-btn", 21);
        map.put("skip-with-countdowns-video-countdown", 13);
        AbstractC5044xl.r(20, map, "skip-with-countdowns-skip-countdown", 14, "skip-with-time");
        map.put("skip-with-time-countdown", 13);
        map.put("skip-with-time-skip-btn", 15);
        map.put("skip", 27);
        map.put("timedown", 13);
        map.put(RewardPlus.ICON, 16);
        map.put("scoreCountWithIcon", 6);
        map.put("split-line", 18);
        map.put("creative-playable-bait", 0);
        map.put("score-count-type-2", 0);
        map.put("lottie", 28);
    }

    public lc JXs() {
        return this.ZU;
    }

    public String LD() {
        return this.LD;
    }

    public int Lxb() {
        if (TextUtils.isEmpty(this.LD)) {
            return 0;
        }
        if (this.LD.equals("logo")) {
            String str = this.LD + this.lk;
            this.LD = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.LD.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = Lxb;
        if (map.get(this.LD) != null) {
            return map.get(this.LD).intValue();
        }
        return -1;
    }

    public String ZU() {
        return this.lc;
    }

    public lc ebl() {
        return this.JXs;
    }

    public int lc() {
        return this.ZU.ro();
    }

    public String lk() {
        return this.lk;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DynamicLayoutBrick{type='");
        sb.append(this.LD);
        sb.append("', data='");
        sb.append(this.lk);
        sb.append("', value=");
        sb.append(this.ZU);
        sb.append(", themeValue=");
        sb.append(this.JXs);
        sb.append(", dataExtraInfo='");
        return DM.m(sb, this.lc, "'}");
    }

    public void LD(String str) {
        this.lk = str;
    }

    public void lk(String str) {
        this.lc = str;
    }

    public void LD(lc lcVar) {
        this.JXs = lcVar;
    }

    public void Lxb(String str) {
        this.LD = str;
    }

    public void Lxb(lc lcVar) {
        this.ZU = lcVar;
    }
}
