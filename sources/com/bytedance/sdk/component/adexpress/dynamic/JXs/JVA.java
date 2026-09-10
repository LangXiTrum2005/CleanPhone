package com.bytedance.sdk.component.adexpress.dynamic.JXs;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.LD.NXR;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.component.utils.tD;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JVA {
    private static String LD;
    private static final Set<String> Lxb = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));

    public static double LD(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString(TtmlNode.ATTR_TTS_FONT_SIZE));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:217:0x046b  */
    /* JADX WARN: Code duplicated, block: B:220:0x047a A[Catch: Exception -> 0x048c, TryCatch #2 {Exception -> 0x048c, blocks: (B:218:0x046f, B:220:0x047a, B:225:0x0484), top: B:275:0x046f }] */
    /* JADX WARN: Code duplicated, block: B:222:0x0480 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:224:0x0483  */
    public static LD.lk Lxb(String str, String str2, String str3, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy, double d, int i2, double d2, String str4, NXR nxr) {
        int i3;
        int i4;
        int i5;
        float f;
        float f2;
        LD.lk lkVarLxb;
        int i6;
        com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs;
        String strOptString = str;
        String strZU = nxr.ZU();
        int iEbl = nxr.ebl();
        if (com.bytedance.sdk.component.adexpress.ZU.LD() && i2 != 4 && (TextUtils.equals(str2, "text_star") || TextUtils.equals(str2, "score-count") || TextUtils.equals(str2, "score-count-type-1") || TextUtils.equals(str2, "score-count-type-2"))) {
            return new LD.lk(0.0f, 0.0f);
        }
        LD.lk lkVar = new LD.lk();
        if (strOptString.startsWith("<svg") || Lxb.contains(str2)) {
            try {
                if (!"close".equals(str2)) {
                    if (com.bytedance.sdk.component.adexpress.ZU.LD() && "close-fill".equals(str2)) {
                    }
                    lkVar.Lxb = 10.0f;
                    lkVar.LD = 10.0f;
                    return lkVar;
                }
                float fOptDouble = (float) new JSONObject(str3).optDouble(TtmlNode.ATTR_TTS_FONT_SIZE);
                lkVar.Lxb = fOptDouble;
                lkVar.LD = fOptDouble;
                return lkVar;
            } catch (Exception unused) {
            }
        } else {
            if ("logo".equals(str2)) {
                if (!com.bytedance.sdk.component.adexpress.ZU.LD() && ((!TextUtils.isEmpty(str) && strOptString.contains("adx:")) || LD())) {
                    return LD() ? Lxb(lkVar, strOptString, str3, LD) : Lxb(lkVar, strOptString, str3, "");
                }
                lkVar.Lxb = "union".equals(strOptString) ? 10.0f : 20.0f;
                lkVar.LD = 10.0f;
                if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                    String strH = DM.h(str2, strOptString);
                    float fLD = (float) LD(str3);
                    if (strH.contains("logoad")) {
                        return Lxb(tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_logo_en"), str3);
                    }
                    lkVar.LD = fLD;
                }
                return lkVar;
            }
            if ("development-name".equals(str2)) {
                strOptString = tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_text_privacy_development") + strOptString;
            }
            if ("app-version".equals(str2)) {
                strOptString = tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_text_privacy_app_version") + strOptString;
            }
            if ("score-count".equals(str2)) {
                try {
                    i3 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused2) {
                    i3 = 0;
                }
                if (com.bytedance.sdk.component.adexpress.ZU.LD() && i3 < 0) {
                    return new LD.lk(0.0f, 0.0f);
                }
                return Lxb("(" + String.format(tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_comment_num"), Integer.valueOf(i3)) + ")", str3);
            }
            if ("score-count-type-2".equals(str2)) {
                try {
                    i4 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused3) {
                    i4 = 0;
                }
                if (com.bytedance.sdk.component.adexpress.ZU.LD() && i4 < 0) {
                    return new LD.lk(0.0f, 0.0f);
                }
                return Lxb("(" + String.format(new DecimalFormat("###,###,###").format(i4), Integer.valueOf(i4)) + ")", str3);
            }
            if ("feedback-dislike".equals(str2)) {
                if (!com.bytedance.sdk.component.adexpress.ZU.LD()) {
                    return Lxb(tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_reward_feedback"), str3);
                }
                LD.lk lkVar2 = new LD.lk();
                float fLD2 = (float) LD(str3);
                lkVar2.Lxb = fLD2;
                lkVar2.LD = fLD2;
                return lkVar2;
            }
            if ("skip-with-time-countdown".equals(str2) || TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
                if (!nxr.Lxb() || !com.bytedance.sdk.component.adexpress.ZU.ebl.LD(strZU)) {
                    return d < 10.0d ? Lxb("0S", str3) : Lxb("00S", str3);
                }
                if (((int) (d + 0.5d)) - iEbl < 10) {
                    return com.bytedance.sdk.component.adexpress.ZU.LD() ? Lxb("0s", str3) : Lxb(String.format(tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_reward_full_skip"), "0"), str3);
                }
                return com.bytedance.sdk.component.adexpress.ZU.LD() ? Lxb("00s", str3) : Lxb(String.format(tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_reward_full_skip"), "00"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
                return Lxb("| " + tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_reward_screen_skip_tx"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
                return Lxb("| ".concat(String.format(tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_reward_full_skip_count_down"), "00")), str3);
            }
            if ("skip-with-time-skip-btn".equals(str2)) {
                LD.lk lkVarLxb2 = Lxb("| " + tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_reward_screen_skip_tx"), str3);
                if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                    try {
                        lkVarLxb2.LD = (float) ((((double) lkVarLxb2.LD) * new JSONObject(str3).optDouble("lineHeight")) / 1.2d);
                    } catch (Throwable unused4) {
                    }
                    lkVarLxb2.Lxb = lkVarLxb2.LD;
                }
                return lkVarLxb2;
            }
            if ("skip".equals(str2)) {
                return Lxb(tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_reward_screen_skip_tx"), str3);
            }
            if ("timedown".equals(str2)) {
                return Lxb("0.0", str3);
            }
            if ("text_star".equals(str2)) {
                return (!com.bytedance.sdk.component.adexpress.ZU.LD() || (d2 >= 0.0d && d2 <= 5.0d)) ? Lxb("0.0", str3) : new LD.lk(0.0f, 0.0f);
            }
            if (TextUtils.equals("privacy-detail", str2)) {
                return Lxb("Permission list | Privacy policy", str3);
            }
            if ("arrowButton".equals(str2)) {
                return Lxb("Download", str3);
            }
            if (MimeTypes.BASE_TYPE_TEXT.equals(str2) && com.bytedance.sdk.component.adexpress.ZU.LD() && TextUtils.isEmpty(strOptString) && (lcVarJXs = oy.nBu().JXs()) != null) {
                strOptString = lcVarJXs.jeq() != null ? oy.nBu().JXs().jeq().optString(com.bytedance.sdk.component.adexpress.ZU.OY.lk(com.bytedance.sdk.component.adexpress.ZU.Lxb())) : "";
            }
            if ("fillButton".equals(str2) || MimeTypes.BASE_TYPE_TEXT.equals(str2) || "button".equals(str2) || "downloadWithIcon".equals(str2) || "downloadButton".equals(str2) || "laceButton".equals(str2) || "cardButton".equals(str2) || "colourMixtureButton".equals(str2) || "arrowButton".equals(str2) || (("source".equals(str2) && !(com.bytedance.sdk.component.adexpress.ZU.LD() && "open_ad".equals(strZU))) || TextUtils.equals("app-version", str2) || TextUtils.equals("development-name", str2))) {
                return Lxb(strOptString, str3);
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                int length = strOptString.length();
                float fOptDouble2 = (float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE);
                float fOptDouble3 = (float) jSONObject.optDouble("letterSpacing");
                float fOptDouble4 = (float) jSONObject.optDouble("lineHeight");
                float fOptDouble5 = (float) jSONObject.optDouble("maxWidth");
                float f3 = ((fOptDouble2 + fOptDouble3) * length) - fOptDouble3;
                sLN.Lxb("DynamicBaseWidget", "getDomSizeFromNative letterSpacing==" + fOptDouble3 + ",lineHeight==" + fOptDouble4 + ",maxWidth ==" + fOptDouble5 + ",totalStrLength" + f3);
                if ("muted".equals(str2)) {
                    lkVar.Lxb = fOptDouble2;
                    lkVar.LD = fOptDouble2;
                    return lkVar;
                }
                if ("star".equals(str2)) {
                    if (com.bytedance.sdk.component.adexpress.ZU.LD() && (d2 < 0.0d || d2 > 5.0d || i2 != 4)) {
                        return new LD.lk(0.0f, 0.0f);
                    }
                    LD.lk lkVarLxb3 = Lxb("str", str3);
                    lkVarLxb3.Lxb = fOptDouble2 * 5.0f;
                    return lkVarLxb3;
                }
                if (RewardPlus.ICON.equals(str2)) {
                    lkVar.Lxb = fOptDouble2;
                    lkVar.LD = fOptDouble2;
                    return lkVar;
                }
                if (!z) {
                    i5 = i;
                    f = (float) (((double) (fOptDouble4 * fOptDouble2)) * 1.2d);
                    if (f3 <= fOptDouble5) {
                        f2 = f3;
                    }
                    if (CampaignEx.JSON_KEY_TITLE.equals(str2) || (com.bytedance.sdk.component.adexpress.ZU.LD() && "open_ad".equals(strZU) && "source".equals(str2))) {
                        try {
                            lkVarLxb = Lxb(strOptString.replace('\n', ' '), str3, false);
                            if (z) {
                                i6 = ((int) (f3 / fOptDouble5)) + 1;
                                if (z2 || i6 < i5) {
                                    i5 = i6;
                                }
                                lkVarLxb.LD *= i5;
                            }
                            return lkVarLxb;
                        } catch (Exception unused5) {
                        }
                    }
                    lkVar.Lxb = f2;
                    lkVar.LD = f;
                    return lkVar;
                }
                int i7 = ((int) (f3 / fOptDouble5)) + 1;
                i5 = i;
                if (z2 && i7 >= i5) {
                    i7 = i5;
                }
                f = (float) (((double) (fOptDouble4 * fOptDouble2 * i7)) * 1.2d);
                f2 = fOptDouble5;
                if (CampaignEx.JSON_KEY_TITLE.equals(str2)) {
                    lkVarLxb = Lxb(strOptString.replace('\n', ' '), str3, false);
                    if (z) {
                        i6 = ((int) (f3 / fOptDouble5)) + 1;
                        if (z2) {
                            i5 = i6;
                        } else {
                            i5 = i6;
                        }
                        lkVarLxb.LD *= i5;
                    }
                    return lkVarLxb;
                }
                lkVarLxb = Lxb(strOptString.replace('\n', ' '), str3, false);
                if (z) {
                    i6 = ((int) (f3 / fOptDouble5)) + 1;
                    if (z2) {
                        i5 = i6;
                    } else {
                        i5 = i6;
                    }
                    lkVarLxb.LD *= i5;
                }
                return lkVarLxb;
                return lkVar;
            } catch (JSONException unused6) {
            }
        }
    }

    public static int[] LD(String str, float f, boolean z) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.ZU.Lxb());
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

    public static boolean LD() {
        return !TextUtils.isEmpty(LD);
    }

    public static String Lxb(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static LD.lk Lxb(LD.lk lkVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            lkVar.Lxb = 0.0f;
            lkVar.LD = 0.0f;
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = Lxb(str);
            }
            if (TextUtils.isEmpty(str3)) {
                lkVar.Lxb = 0.0f;
                lkVar.LD = 0.0f;
            } else {
                return Lxb(str3, str2);
            }
        }
        return lkVar;
    }

    public static LD.lk Lxb(String str, String str2) {
        return Lxb(str, str2, false);
    }

    public static LD.lk Lxb(String str, String str2, boolean z) {
        LD.lk lkVar = new LD.lk();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] iArrLxb = Lxb(str, (float) LD(str2), z);
            lkVar.Lxb = iArrLxb[0];
            lkVar.LD = iArrLxb[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                lkVar.LD = 0.0f;
            }
        } catch (Exception unused) {
        }
        return lkVar;
    }

    public static int[] Lxb(String str, float f, boolean z) {
        int[] iArrLD = LD(str, f, z);
        return new int[]{com.bytedance.sdk.component.adexpress.ZU.OY.LD(com.bytedance.sdk.component.adexpress.ZU.Lxb(), iArrLD[0]), com.bytedance.sdk.component.adexpress.ZU.OY.LD(com.bytedance.sdk.component.adexpress.ZU.Lxb(), iArrLD[1])};
    }

    public static String Lxb() {
        return LD;
    }
}
