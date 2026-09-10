package com.bytedance.sdk.component.adexpress.dynamic.mzz;

import android.support.v4.media.a;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.ud.exu;
import com.bytedance.sdk.component.utils.ljh;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rq {
    private static final Set<String> qdl = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));
    private static String ud;

    /* JADX WARN: Code duplicated, block: B:219:0x042a  */
    /* JADX WARN: Code duplicated, block: B:222:0x0438 A[Catch: Exception -> 0x0449, TryCatch #2 {Exception -> 0x0449, blocks: (B:220:0x042e, B:222:0x0438, B:227:0x0442), top: B:277:0x042e }] */
    /* JADX WARN: Code duplicated, block: B:224:0x043e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:226:0x0441  */
    public static ud.lnr qdl(String str, String str2, String str3, boolean z2, boolean z3, int i2, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar, double d, int i3, double d2, String str4, exu exuVar) {
        float f;
        float f2;
        ud.lnr lnrVarQdl;
        int i4;
        com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz;
        String strOptString = str;
        int i5 = i2;
        String strMml = exuVar.mml();
        int iWd = exuVar.wd();
        if (com.bytedance.sdk.component.adexpress.mml.ud() && i3 != 4 && (TextUtils.equals(str2, "text_star") || TextUtils.equals(str2, "score-count") || TextUtils.equals(str2, "score-count-type-1") || TextUtils.equals(str2, "score-count-type-2"))) {
            return new ud.lnr(0.0f, 0.0f);
        }
        ud.lnr lnrVar = new ud.lnr();
        if (strOptString.startsWith("<svg") || qdl.contains(str2)) {
            try {
                if ("close".equals(str2) || (com.bytedance.sdk.component.adexpress.mml.ud() && "close-fill".equals(str2))) {
                    float fOptDouble = (float) new JSONObject(str3).optDouble(TtmlNode.ATTR_TTS_FONT_SIZE);
                    lnrVar.qdl = fOptDouble;
                    lnrVar.ud = fOptDouble;
                    return lnrVar;
                }
            } catch (Exception unused) {
            }
            lnrVar.qdl = 10.0f;
            lnrVar.ud = 10.0f;
            return lnrVar;
        }
        if (!"logo".equals(str2)) {
            if ("development-name".equals(str2)) {
                strOptString = ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_text_privacy_development") + strOptString;
            }
            if ("app-version".equals(str2)) {
                strOptString = ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_text_privacy_app_version") + strOptString;
            }
            int i6 = 0;
            if ("score-count".equals(str2)) {
                try {
                    i6 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused2) {
                }
                if (com.bytedance.sdk.component.adexpress.mml.ud() && i6 < 0) {
                    return new ud.lnr(0.0f, 0.0f);
                }
                return qdl("(" + String.format(ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_comment_num"), Integer.valueOf(i6)) + ")", str3);
            }
            if ("score-count-type-2".equals(str2)) {
                try {
                    i6 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused3) {
                }
                if (com.bytedance.sdk.component.adexpress.mml.ud() && i6 < 0) {
                    return new ud.lnr(0.0f, 0.0f);
                }
                return qdl("(" + String.format(new DecimalFormat("###,###,###").format(i6), Integer.valueOf(i6)) + ")", str3);
            }
            if ("feedback-dislike".equals(str2) && com.bytedance.sdk.component.adexpress.mml.ud()) {
                ud.lnr lnrVar2 = new ud.lnr();
                float fUd = (float) ud(str3);
                lnrVar2.qdl = fUd;
                lnrVar2.ud = fUd;
                return lnrVar2;
            }
            if ("skip-with-time-countdown".equals(str2) || TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
                if (!exuVar.qdl() || !com.bytedance.sdk.component.adexpress.mml.mo.ud(strMml)) {
                    return d < 10.0d ? qdl("0S", str3) : qdl("00S", str3);
                }
                if (((int) (d + 0.5d)) - iWd < 10) {
                    return com.bytedance.sdk.component.adexpress.mml.ud() ? qdl("0s", str3) : qdl(String.format(ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_reward_full_skip"), "0"), str3);
                }
                return com.bytedance.sdk.component.adexpress.mml.ud() ? qdl("00s", str3) : qdl(String.format(ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_reward_full_skip"), "00"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
                return qdl("| " + ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_reward_screen_skip_tx"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
                return qdl("| ".concat(String.format(ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_reward_full_skip_count_down"), "00")), str3);
            }
            if ("skip-with-time-skip-btn".equals(str2)) {
                ud.lnr lnrVarQdl2 = qdl("| " + ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_reward_screen_skip_tx"), str3);
                if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                    try {
                        lnrVarQdl2.ud = (float) ((((double) lnrVarQdl2.ud) * new JSONObject(str3).optDouble("lineHeight")) / 1.2d);
                    } catch (Throwable unused4) {
                    }
                    lnrVarQdl2.qdl = lnrVarQdl2.ud;
                }
                return lnrVarQdl2;
            }
            if ("skip".equals(str2)) {
                return qdl(ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_reward_screen_skip_tx"), str3);
            }
            if ("timedown".equals(str2)) {
                return qdl("0.0", str3);
            }
            if ("text_star".equals(str2)) {
                return (!com.bytedance.sdk.component.adexpress.mml.ud() || (d2 >= 0.0d && d2 <= 5.0d)) ? qdl("0.0", str3) : new ud.lnr(0.0f, 0.0f);
            }
            if (TextUtils.equals("privacy-detail", str2)) {
                return qdl("Permission list | Privacy policy", str3);
            }
            if ("arrowButton".equals(str2)) {
                return qdl("Download", str3);
            }
            if ("text".equals(str2) && com.bytedance.sdk.component.adexpress.mml.ud() && TextUtils.isEmpty(strOptString) && (moVarMzz = jpcVar.to().mzz()) != null) {
                strOptString = moVarMzz.en() != null ? jpcVar.to().mzz().en().optString(com.bytedance.sdk.component.adexpress.mml.wd.lnr(com.bytedance.sdk.component.adexpress.mml.qdl())) : "";
            }
            if ("fillButton".equals(str2) || "text".equals(str2) || "button".equals(str2) || "downloadWithIcon".equals(str2) || "downloadButton".equals(str2) || "laceButton".equals(str2) || "cardButton".equals(str2) || "colourMixtureButton".equals(str2) || "arrowButton".equals(str2) || (("source".equals(str2) && !(com.bytedance.sdk.component.adexpress.mml.ud() && "open_ad".equals(strMml))) || TextUtils.equals("app-version", str2) || TextUtils.equals("development-name", str2))) {
                return qdl(strOptString, str3);
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                int length = strOptString.length();
                float fOptDouble2 = (float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE);
                float fOptDouble3 = (float) jSONObject.optDouble("letterSpacing");
                float fOptDouble4 = (float) jSONObject.optDouble("lineHeight");
                float fOptDouble5 = (float) jSONObject.optDouble("maxWidth");
                float f3 = ((fOptDouble2 + fOptDouble3) * length) - fOptDouble3;
                if ("muted".equals(str2)) {
                    lnrVar.qdl = fOptDouble2;
                    lnrVar.ud = fOptDouble2;
                    return lnrVar;
                }
                if ("star".equals(str2)) {
                    if (com.bytedance.sdk.component.adexpress.mml.ud() && (d2 < 0.0d || d2 > 5.0d || i3 != 4)) {
                        return new ud.lnr(0.0f, 0.0f);
                    }
                    ud.lnr lnrVarQdl3 = qdl("str", str3);
                    lnrVarQdl3.qdl = fOptDouble2 * 5.0f;
                    return lnrVarQdl3;
                }
                if ("icon".equals(str2)) {
                    lnrVar.qdl = fOptDouble2;
                    lnrVar.ud = fOptDouble2;
                    return lnrVar;
                }
                if (z2) {
                    int i7 = ((int) (f3 / fOptDouble5)) + 1;
                    if (z3 && i7 >= i5) {
                        i7 = i5;
                    }
                    f = (float) (((double) (fOptDouble4 * fOptDouble2 * i7)) * 1.2d);
                } else {
                    f = (float) (((double) (fOptDouble4 * fOptDouble2)) * 1.2d);
                    if (f3 <= fOptDouble5) {
                        f2 = f3;
                    }
                    if ("title".equals(str2) || (com.bytedance.sdk.component.adexpress.mml.ud() && "open_ad".equals(strMml) && "source".equals(str2))) {
                        try {
                            lnrVarQdl = qdl(strOptString.replace('\n', ' '), str3, false);
                            if (z2) {
                                i4 = ((int) (f3 / fOptDouble5)) + 1;
                                if (z3 || i4 < i5) {
                                    i5 = i4;
                                }
                                lnrVarQdl.ud *= i5;
                            }
                            return lnrVarQdl;
                        } catch (Exception unused5) {
                        }
                    }
                    lnrVar.qdl = f2;
                    lnrVar.ud = f;
                }
                f2 = fOptDouble5;
                if ("title".equals(str2)) {
                    lnrVarQdl = qdl(strOptString.replace('\n', ' '), str3, false);
                    if (z2) {
                        i4 = ((int) (f3 / fOptDouble5)) + 1;
                        if (z3) {
                            i5 = i4;
                        } else {
                            i5 = i4;
                        }
                        lnrVarQdl.ud *= i5;
                    }
                    return lnrVarQdl;
                }
                lnrVarQdl = qdl(strOptString.replace('\n', ' '), str3, false);
                if (z2) {
                    i4 = ((int) (f3 / fOptDouble5)) + 1;
                    if (z3) {
                        i5 = i4;
                    } else {
                        i5 = i4;
                    }
                    lnrVarQdl.ud *= i5;
                }
                return lnrVarQdl;
            } catch (JSONException unused6) {
            }
        } else {
            if (!com.bytedance.sdk.component.adexpress.mml.ud() && ((!TextUtils.isEmpty(strOptString) && strOptString.contains("adx:")) || ud())) {
                return ud() ? qdl(lnrVar, strOptString, str3, ud) : qdl(lnrVar, strOptString, str3, "");
            }
            lnrVar.qdl = "union".equals(strOptString) ? 14.0f : 20.0f;
            lnrVar.ud = 10.0f;
            if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                String strBqt = exuVar.bqt();
                if ("union".equals(strOptString) && TextUtils.isEmpty(strBqt)) {
                    lnrVar.qdl = 0.0f;
                }
                String strM = a.m(str2, strOptString);
                float fUd2 = (float) ud(str3);
                if (strM.contains("logoad")) {
                    String strKoa = exuVar.koa();
                    if (!TextUtils.isEmpty(strKoa)) {
                        return qdl(strKoa, str3);
                    }
                    lnrVar.qdl = 0.0f;
                }
                lnrVar.ud = fUd2;
                return lnrVar;
            }
        }
        return lnrVar;
    }

    public static double ud(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString(TtmlNode.ATTR_TTS_FONT_SIZE));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static int[] ud(String str, float f, boolean z2) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.mml.qdl());
            textView.setTextSize(f);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z2) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static boolean ud() {
        return !TextUtils.isEmpty(ud);
    }

    public static String qdl(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static ud.lnr qdl(ud.lnr lnrVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            lnrVar.qdl = 0.0f;
            lnrVar.ud = 0.0f;
            return lnrVar;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = qdl(str);
        }
        if (TextUtils.isEmpty(str3)) {
            lnrVar.qdl = 0.0f;
            lnrVar.ud = 0.0f;
            return lnrVar;
        }
        return qdl(str3, str2);
    }

    public static ud.lnr qdl(String str, String str2) {
        return qdl(str, str2, false);
    }

    public static ud.lnr qdl(String str, String str2, boolean z2) {
        ud.lnr lnrVar = new ud.lnr();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] iArrQdl = qdl(str, (float) ud(str2), z2);
            lnrVar.qdl = iArrQdl[0];
            lnrVar.ud = iArrQdl[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                lnrVar.ud = 0.0f;
            }
        } catch (Exception unused) {
        }
        return lnrVar;
    }

    public static int[] qdl(String str, float f, boolean z2) {
        int[] iArrUd = ud(str, f, z2);
        return new int[]{com.bytedance.sdk.component.adexpress.mml.wd.ud(com.bytedance.sdk.component.adexpress.mml.qdl(), iArrUd[0]), com.bytedance.sdk.component.adexpress.mml.wd.ud(com.bytedance.sdk.component.adexpress.mml.qdl(), iArrUd[1])};
    }

    public static String qdl() {
        return ud;
    }
}
