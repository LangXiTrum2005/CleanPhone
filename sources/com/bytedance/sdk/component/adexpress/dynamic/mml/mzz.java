package com.bytedance.sdk.component.adexpress.dynamic.mml;

import android.text.TextUtils;
import com.smartdigimkt.x.d;
import java.util.HashMap;
import java.util.Map;
import p005e.a;

/* JADX INFO: loaded from: classes.dex */
public class mzz {
    public static final Map<String, Integer> qdl;
    private String lnr;
    private mo mml;
    private String mo;
    private mo mzz;
    private String ud;

    static {
        HashMap map = new HashMap();
        qdl = map;
        map.put("root", 8);
        map.put("footer", 6);
        map.put("empty", 6);
        map.put("title", 0);
        map.put("subtitle", 0);
        map.put("source", 0);
        map.put("score-count", 0);
        map.put("text_star", 0);
        map.put("text", 0);
        map.put("tag-group", 17);
        map.put("app-version", 0);
        map.put("development-name", 0);
        map.put("privacy-detail", 23);
        map.put(d.c.k, 1);
        map.put("image-wide", 1);
        map.put("image-square", 1);
        map.put("image-long", 1);
        map.put("image-splash", 1);
        map.put("image-cover", 1);
        map.put("app-icon", 1);
        map.put("icon-download", 1);
        map.put("logoad", 4);
        a.e(5, map, "logounion", 9, "logo-union");
        map.put("dislike", 3);
        map.put("close", 3);
        map.put("close-fill", 3);
        a.e(22, map, "webview-close", 12, "feedback-dislike");
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
        a.e(26, map, "carousel-vessel", 25, "leisure-interact");
        map.put("video-hd", 7);
        map.put("video", 7);
        map.put("video-vd", 7);
        map.put("video-sq", 7);
        map.put("muted", 10);
        a.e(11, map, "star", 19, "skip-countdowns");
        map.put("skip-with-countdowns-skip-btn", 21);
        map.put("skip-with-countdowns-video-countdown", 13);
        a.e(20, map, "skip-with-countdowns-skip-countdown", 14, "skip-with-time");
        map.put("skip-with-time-countdown", 13);
        map.put("skip-with-time-skip-btn", 15);
        map.put("skip", 27);
        map.put("timedown", 13);
        map.put("icon", 16);
        map.put("scoreCountWithIcon", 6);
        map.put("split-line", 18);
        map.put("creative-playable-bait", 0);
        map.put("score-count-type-2", 0);
        map.put("lottie", 28);
    }

    public String lnr() {
        return this.lnr;
    }

    public String mml() {
        return this.mo;
    }

    public int mo() {
        return this.mml.lq();
    }

    public mo mzz() {
        return this.mml;
    }

    public int qdl() {
        if (TextUtils.isEmpty(this.ud)) {
            return 0;
        }
        if (this.ud.equals("logo")) {
            String str = this.ud + this.lnr;
            this.ud = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.ud.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = qdl;
        if (map.get(this.ud) != null) {
            return map.get(this.ud).intValue();
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DynamicLayoutBrick{type='");
        sb.append(this.ud);
        sb.append("', data='");
        sb.append(this.lnr);
        sb.append("', value=");
        sb.append(this.mml);
        sb.append(", themeValue=");
        sb.append(this.mzz);
        sb.append(", dataExtraInfo='");
        return android.support.v4.media.a.r(sb, this.mo, "'}");
    }

    public String ud() {
        return this.ud;
    }

    public mo wd() {
        return this.mzz;
    }

    public void lnr(String str) {
        this.mo = str;
    }

    public void ud(String str) {
        this.lnr = str;
    }

    public void ud(mo moVar) {
        this.mzz = moVar;
    }

    public void qdl(String str) {
        this.ud = str;
    }

    public void qdl(mo moVar) {
        this.mml = moVar;
    }
}
