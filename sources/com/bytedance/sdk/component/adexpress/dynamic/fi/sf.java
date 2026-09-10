package com.bytedance.sdk.component.adexpress.dynamic.fi;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.lr.aw;
import com.bytedance.sdk.component.utils.uq;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class sf {
    private static String lr;
    private static final Set<String> ri = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));

    public static double lr(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString(TtmlNode.ATTR_TTS_FONT_SIZE));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:219:0x0435  */
    /* JADX WARN: Code duplicated, block: B:222:0x0443 A[Catch: Exception -> 0x0454, TryCatch #5 {Exception -> 0x0454, blocks: (B:220:0x0439, B:222:0x0443, B:227:0x044d), top: B:282:0x0439 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x0449 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:226:0x044c  */
    public static lr.ik ri(String str, String str2, String str3, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar, double d, int i2, double d2, String str4, aw awVar) {
        float f;
        float f2;
        lr.ik ikVarRi;
        int i3;
        com.bytedance.sdk.component.adexpress.dynamic.ka.di diVarFi;
        String strOptString = str;
        int i4 = i;
        String strKa = awVar.ka();
        int iXha = awVar.xha();
        if (com.bytedance.sdk.component.adexpress.ka.lr() && i2 != 4 && (TextUtils.equals(str2, "text_star") || TextUtils.equals(str2, "score-count") || TextUtils.equals(str2, "score-count-type-1") || TextUtils.equals(str2, "score-count-type-2"))) {
            return new lr.ik(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        lr.ik ikVar = new lr.ik();
        if (strOptString.startsWith("<svg") || ri.contains(str2)) {
            try {
                if ("close".equals(str2) || (com.bytedance.sdk.component.adexpress.ka.lr() && "close-fill".equals(str2))) {
                    float fOptDouble = (float) new JSONObject(str3).optDouble(TtmlNode.ATTR_TTS_FONT_SIZE);
                    ikVar.ri = fOptDouble;
                    ikVar.lr = fOptDouble;
                    return ikVar;
                }
            } catch (Exception unused) {
            }
            ikVar.ri = 10.0f;
            ikVar.lr = 10.0f;
            return ikVar;
        }
        if (!"logo".equals(str2)) {
            if ("development-name".equals(str2)) {
                strOptString = uq.ri(com.bytedance.sdk.component.adexpress.ka.ri(), "tt_text_privacy_development") + strOptString;
            }
            if ("app-version".equals(str2)) {
                strOptString = uq.ri(com.bytedance.sdk.component.adexpress.ka.ri(), "tt_text_privacy_app_version") + strOptString;
            }
            int i5 = 0;
            if ("score-count".equals(str2)) {
                try {
                    i5 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused2) {
                }
                if (com.bytedance.sdk.component.adexpress.ka.lr() && i5 < 0) {
                    return new lr.ik(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return ri("(" + String.format(uq.ri(com.bytedance.sdk.component.adexpress.ka.ri(), "tt_comment_num"), Integer.valueOf(i5)) + ")", str3);
            }
            if ("score-count-type-2".equals(str2)) {
                try {
                    i5 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused3) {
                }
                if (com.bytedance.sdk.component.adexpress.ka.lr() && i5 < 0) {
                    return new lr.ik(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return ri("(" + String.format(new DecimalFormat("###,###,###").format(i5), Integer.valueOf(i5)) + ")", str3);
            }
            if ("feedback-dislike".equals(str2) && com.bytedance.sdk.component.adexpress.ka.lr()) {
                lr.ik ikVar2 = new lr.ik();
                float fLr = (float) lr(str3);
                ikVar2.ri = fLr;
                ikVar2.lr = fLr;
                return ikVar2;
            }
            if ("skip-with-time-countdown".equals(str2) || TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
                if (!awVar.ri() || !com.bytedance.sdk.component.adexpress.ka.di.lr(strKa)) {
                    return d < 10.0d ? ri("0S", str3) : ri("00S", str3);
                }
                if (((int) (d + 0.5d)) - iXha < 10) {
                    return com.bytedance.sdk.component.adexpress.ka.lr() ? ri("0s", str3) : ri(String.format(uq.ri(com.bytedance.sdk.component.adexpress.ka.ri(), "tt_reward_full_skip"), "0"), str3);
                }
                return com.bytedance.sdk.component.adexpress.ka.lr() ? ri("00s", str3) : ri(String.format(uq.ri(com.bytedance.sdk.component.adexpress.ka.ri(), "tt_reward_full_skip"), "00"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
                return ri("| " + uq.ri(com.bytedance.sdk.component.adexpress.ka.ri(), "tt_reward_screen_skip_tx"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
                return ri("| ".concat(String.format(uq.ri(com.bytedance.sdk.component.adexpress.ka.ri(), "tt_reward_full_skip_count_down"), "00")), str3);
            }
            if ("skip-with-time-skip-btn".equals(str2)) {
                lr.ik ikVarRi2 = ri("| " + uq.ri(com.bytedance.sdk.component.adexpress.ka.ri(), "tt_reward_screen_skip_tx"), str3);
                if (com.bytedance.sdk.component.adexpress.ka.lr()) {
                    try {
                        ikVarRi2.lr = (float) ((((double) ikVarRi2.lr) * new JSONObject(str3).optDouble("lineHeight")) / 1.2d);
                    } catch (Throwable unused4) {
                    }
                    ikVarRi2.ri = ikVarRi2.lr;
                }
                return ikVarRi2;
            }
            if ("skip".equals(str2)) {
                return ri(uq.ri(com.bytedance.sdk.component.adexpress.ka.ri(), "tt_reward_screen_skip_tx"), str3);
            }
            if ("timedown".equals(str2)) {
                return ri("0.0", str3);
            }
            if ("text_star".equals(str2)) {
                return (!com.bytedance.sdk.component.adexpress.ka.lr() || (d2 >= 0.0d && d2 <= 5.0d)) ? ri("0.0", str3) : new lr.ik(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (TextUtils.equals("privacy-detail", str2)) {
                return ri("Permission list | Privacy policy", str3);
            }
            if ("arrowButton".equals(str2)) {
                return ri("Download", str3);
            }
            if ("text".equals(str2) && com.bytedance.sdk.component.adexpress.ka.lr() && TextUtils.isEmpty(strOptString) && (diVarFi = mjVar.qt().fi()) != null) {
                strOptString = diVarFi.saa() != null ? mjVar.qt().fi().saa().optString(com.bytedance.sdk.component.adexpress.ka.xha.ik(com.bytedance.sdk.component.adexpress.ka.ri())) : "";
            }
            if ("fillButton".equals(str2) || "text".equals(str2) || "button".equals(str2) || "downloadWithIcon".equals(str2) || "downloadButton".equals(str2) || "laceButton".equals(str2) || "cardButton".equals(str2) || "colourMixtureButton".equals(str2) || "arrowButton".equals(str2) || (("source".equals(str2) && !(com.bytedance.sdk.component.adexpress.ka.lr() && "open_ad".equals(strKa))) || TextUtils.equals("app-version", str2) || TextUtils.equals("development-name", str2))) {
                return ri(strOptString, str3);
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                int length = strOptString.length();
                float fOptDouble2 = (float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE);
                float fOptDouble3 = (float) jSONObject.optDouble("letterSpacing");
                float fOptDouble4 = (float) jSONObject.optDouble("lineHeight");
                float fOptDouble5 = (float) jSONObject.optDouble("maxWidth");
                float f3 = (length * (fOptDouble2 + fOptDouble3)) - fOptDouble3;
                if ("muted".equals(str2)) {
                    ikVar.ri = fOptDouble2;
                    ikVar.lr = fOptDouble2;
                    return ikVar;
                }
                if ("star".equals(str2)) {
                    if (com.bytedance.sdk.component.adexpress.ka.lr() && (d2 < 0.0d || d2 > 5.0d || i2 != 4)) {
                        return new lr.ik(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    lr.ik ikVarRi3 = ri("str", str3);
                    ikVarRi3.ri = fOptDouble2 * 5.0f;
                    return ikVarRi3;
                }
                if ("icon".equals(str2)) {
                    ikVar.ri = fOptDouble2;
                    ikVar.lr = fOptDouble2;
                    return ikVar;
                }
                if (z) {
                    int i6 = ((int) (f3 / fOptDouble5)) + 1;
                    if (z2 && i6 >= i4) {
                        i6 = i4;
                    }
                    f = (float) (((double) (fOptDouble4 * fOptDouble2 * i6)) * 1.2d);
                } else {
                    f = (float) (((double) (fOptDouble4 * fOptDouble2)) * 1.2d);
                    if (f3 <= fOptDouble5) {
                        f2 = f3;
                    }
                    if ("title".equals(str2) || (com.bytedance.sdk.component.adexpress.ka.lr() && "open_ad".equals(strKa) && "source".equals(str2))) {
                        try {
                            ikVarRi = ri(strOptString.replace('\n', ' '), str3, false);
                            if (z) {
                                i3 = ((int) (f3 / fOptDouble5)) + 1;
                                if (z2 || i3 < i4) {
                                    i4 = i3;
                                }
                                ikVarRi.lr *= i4;
                            }
                            return ikVarRi;
                        } catch (Exception unused5) {
                        }
                    }
                    ikVar.ri = f2;
                    ikVar.lr = f;
                }
                f2 = fOptDouble5;
                if ("title".equals(str2)) {
                    ikVarRi = ri(strOptString.replace('\n', ' '), str3, false);
                    if (z) {
                        i3 = ((int) (f3 / fOptDouble5)) + 1;
                        if (z2) {
                            i4 = i3;
                        } else {
                            i4 = i3;
                        }
                        ikVarRi.lr *= i4;
                    }
                    return ikVarRi;
                }
                ikVarRi = ri(strOptString.replace('\n', ' '), str3, false);
                if (z) {
                    i3 = ((int) (f3 / fOptDouble5)) + 1;
                    if (z2) {
                        i4 = i3;
                    } else {
                        i4 = i3;
                    }
                    ikVarRi.lr *= i4;
                }
                return ikVarRi;
            } catch (JSONException unused6) {
            }
        } else {
            if (!com.bytedance.sdk.component.adexpress.ka.lr() && ((!TextUtils.isEmpty(strOptString) && strOptString.contains("adx:")) || lr())) {
                return lr() ? ri(ikVar, strOptString, str3, lr) : ri(ikVar, strOptString, str3, "");
            }
            ikVar.ri = "union".equals(strOptString) ? 14.0f : 20.0f;
            ikVar.lr = 10.0f;
            if (com.bytedance.sdk.component.adexpress.ka.lr()) {
                String strIgq = awVar.igq();
                if ("union".equals(strOptString) && TextUtils.isEmpty(strIgq)) {
                    ikVar.ri = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                String str5 = str2 + strOptString;
                float fLr2 = (float) lr(str3);
                if (str5.contains("logoad")) {
                    String strZf = awVar.zf();
                    if (!TextUtils.isEmpty(strZf)) {
                        return ri(strZf, str3);
                    }
                    ikVar.ri = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                ikVar.lr = fLr2;
                return ikVar;
            }
        }
        return ikVar;
    }

    public static int[] lr(String str, float f, boolean z) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.ka.ri());
            textView.setTextSize(f);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static boolean lr() {
        return !TextUtils.isEmpty(lr);
    }

    public static String ri(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static lr.ik ri(lr.ik ikVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            ikVar.ri = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            ikVar.lr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return ikVar;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = ri(str);
        }
        if (TextUtils.isEmpty(str3)) {
            ikVar.ri = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            ikVar.lr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return ikVar;
        }
        return ri(str3, str2);
    }

    public static lr.ik ri(String str, String str2) {
        return ri(str, str2, false);
    }

    public static lr.ik ri(String str, String str2, boolean z) {
        lr.ik ikVar = new lr.ik();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] iArrRi = ri(str, (float) lr(str2), z);
            ikVar.ri = iArrRi[0];
            ikVar.lr = iArrRi[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                ikVar.lr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        } catch (Exception unused) {
        }
        return ikVar;
    }

    public static int[] ri(String str, float f, boolean z) {
        int[] iArrLr = lr(str, f, z);
        return new int[]{com.bytedance.sdk.component.adexpress.ka.xha.lr(com.bytedance.sdk.component.adexpress.ka.ri(), iArrLr[0]), com.bytedance.sdk.component.adexpress.ka.xha.lr(com.bytedance.sdk.component.adexpress.ka.ri(), iArrLr[1])};
    }

    public static String ri() {
        return lr;
    }
}
