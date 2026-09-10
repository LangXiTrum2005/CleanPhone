package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xan {
    private static boolean Lxb = false;

    public static boolean LD(Context context, String str, com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i, String str2, boolean z) {
        try {
            Intent intentLxb = Lxb(context, str, tDVar, i, (PAGNativeAd) null, (PangleAd) null, str2, z, true);
            if (!(context instanceof Activity)) {
                intentLxb.addFlags(268435456);
            }
            context.startActivity(intentLxb);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void Lxb(boolean z) {
        Lxb = z;
    }

    private static com.bytedance.sdk.openadsdk.STP.Lxb.LD Lxb(int i, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        com.bytedance.sdk.openadsdk.STP.Lxb.LD ld = new com.bytedance.sdk.openadsdk.STP.Lxb.LD();
        ld.Lxb(com.bytedance.sdk.openadsdk.ZU.LD.Lxb.Lxb);
        ld.Lxb(tDVar);
        ld.LD(nJ.Lxb(tDVar));
        ld.Lxb(i);
        ld.Lxb(false);
        ld.LD(tDVar.sRq());
        return ld;
    }

    public static boolean Lxb(Context context, com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i, @Nullable PAGNativeAd pAGNativeAd, @Nullable PangleAd pangleAd, String str, @Nullable com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc lcVar, boolean z, int i2) {
        String strLxb;
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(Lxb(-1, tDVar));
        if (context != null && tDVar != null && i != -1) {
            com.bytedance.sdk.openadsdk.core.model.JVA jvaNTb = tDVar.nTb();
            HashMap map = new HashMap();
            if (tDVar.qK() == 0) {
                map.put("dpl_probability_jump", Boolean.valueOf(i2 >= 11));
            }
            if (i2 != 0 && tDVar.chu()) {
                map.put("dsp_click_type", Integer.valueOf(i2));
            }
            if (jvaNTb != null && !TextUtils.isEmpty(jvaNTb.Lxb())) {
                if (Lxb(context, tDVar, i, str, z, map)) {
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(Lxb(2, tDVar));
                    return true;
                }
                if (jvaNTb.lk() != 2 || tDVar.FGm() == 5 || tDVar.FGm() == 15) {
                    if (jvaNTb.lk() == 1 && !TextUtils.isEmpty(jvaNTb.LD())) {
                        strLxb = jvaNTb.LD();
                    } else {
                        strLxb = Lxb(tDVar);
                    }
                } else if (lcVar != null) {
                    if (!lcVar.Lxb()) {
                        if (lcVar.JXs()) {
                            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str, "open_fallback_url", map);
                            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(Lxb(3, tDVar));
                            return true;
                        }
                        strLxb = Lxb(jvaNTb, tDVar);
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(Lxb(3, tDVar));
                    } else {
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str, "open_fallback_url", map);
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(Lxb(3, tDVar));
                        return true;
                    }
                } else {
                    strLxb = Lxb(jvaNTb, tDVar);
                }
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str, "open_fallback_url", map);
            } else {
                strLxb = Lxb(tDVar);
            }
            String str2 = strLxb;
            if (tDVar.qK() == 0 && !TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
                String strSubstring = str2.substring(str2.indexOf("?id=") + 4);
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(Lxb(4, tDVar));
                return com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ZU.Lxb(context, str2, strSubstring, str, tDVar);
            }
            return Lxb(context, tDVar, i, pAGNativeAd, pangleAd, str, z, str2);
        }
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(Lxb(1, tDVar));
        return false;
    }

    private static String Lxb(com.bytedance.sdk.openadsdk.core.model.JVA jva, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (!TextUtils.isEmpty(jva.LD())) {
            return jva.LD();
        }
        return Lxb(tDVar);
    }

    private static String Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (tDVar.chu() && tDVar.SlV() != null) {
            return tDVar.SlV().QAg();
        }
        return tDVar.Sv();
    }

    public static boolean Lxb(Context context, com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i, String str, boolean z, Map<String, Object> map) {
        if (tDVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.JVA jvaNTb = tDVar.nTb();
        if (jvaNTb != null && !TextUtils.isEmpty(jvaNTb.Lxb())) {
            if (map == null) {
                map = new HashMap<>();
            }
            Map<String, Object> map2 = map;
            String strLxb = jvaNTb.Lxb();
            if (com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lk.Lxb()) {
                return com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lk.Lxb(context, strLxb, tDVar, i, map2, z);
            }
            Uri uri = Uri.parse(strLxb);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (nJ.OY(context)) {
                nJ.LD LD = nJ.LD(context, intent);
                if (LD.LD > 0) {
                    if (kqm.ZU().OY()) {
                        nJ.Lxb(tDVar, str);
                    }
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    map2.put("can_query_install", 1);
                    map2.put("matched_count", Integer.valueOf(LD.LD));
                    map2.put("url", strLxb);
                    ComponentName componentName = LD.Lxb;
                    if (componentName != null) {
                        intent.setComponent(componentName);
                    }
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str, "open_url_app", map2);
                    try {
                        context.startActivity(intent);
                        com.bytedance.sdk.openadsdk.ZU.sLN.Lxb().Lxb(map2).Lxb(tDVar, str);
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb("dp_start_act_success", tDVar, str, map2);
                        return true;
                    } catch (Exception e) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("exception", e.getMessage());
                            jSONObject.put("intent", intent.toString());
                            jSONObject.put("can_query_install", 1);
                        } catch (Exception unused) {
                        }
                        ZU.Lxb(tDVar, str, -4, jSONObject);
                        if (!kqm.ZU().OY()) {
                            Lxb(context, tDVar.Sv(), tDVar, i, str, z);
                            com.bytedance.sdk.component.utils.sLN.Lxb("WebHelper", "openDetailPage() -> context.startActivity(intent) fail :", e);
                        }
                        return false;
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("intent", intent.toString());
                    jSONObject2.put("can_query_install", 1);
                } catch (Exception unused2) {
                }
                ZU.Lxb(tDVar, str, -3, jSONObject2);
            } else {
                try {
                    if (kqm.ZU().OY()) {
                        nJ.Lxb(tDVar, str);
                    }
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    map2.put("can_query_install", 0);
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str, "open_url_app", map2);
                    context.startActivity(intent);
                    com.bytedance.sdk.openadsdk.ZU.sLN.Lxb().Lxb(map2).Lxb(tDVar, str);
                    return true;
                } catch (Throwable unused3) {
                }
            }
            return false;
        }
        ZU.Lxb(tDVar, str, jvaNTb == null ? -1 : -2, jvaNTb != null ? jvaNTb.ZU() : null);
        return false;
    }

    public static boolean Lxb(Context context, com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i, PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str2) && !com.bytedance.sdk.openadsdk.core.model.eK.LD(tDVar)) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(Lxb(5, tDVar));
            return false;
        }
        int iSRq = tDVar.sRq();
        if (iSRq != 2 && iSRq != 8) {
            com.bytedance.sdk.component.utils.LD.Lxb(context, Lxb(context, str2, tDVar, i, pAGNativeAd, pangleAd, str, z), null);
            Lxb = false;
            return true;
        }
        return com.bytedance.sdk.openadsdk.utils.DY.Lxb(context, str2, tDVar, com.bytedance.sdk.openadsdk.ZU.LD.Lxb.Lxb);
    }

    public static boolean Lxb(Context context, String str, com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i, String str2, boolean z) {
        try {
            context.startActivity(Lxb(context, str, tDVar, i, (PAGNativeAd) null, (PangleAd) null, str2, z));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Intent Lxb(Context context, String str, com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i, @Nullable PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str2, boolean z) {
        return Lxb(context, str, tDVar, i, pAGNativeAd, pangleAd, str2, z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent Lxb(Context context, String str, com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i, @Nullable PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str2, boolean z, boolean z2) {
        Intent intent;
        if (!z2 && com.bytedance.sdk.openadsdk.core.model.eK.LD(tDVar) && (pAGNativeAd != 0 || pangleAd != null)) {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            intent.putExtra("ad_pending_download", Lxb(tDVar, z));
            String strSLN = com.bytedance.sdk.openadsdk.core.model.eK.sLN(tDVar);
            if (!TextUtils.isEmpty(strSLN)) {
                if (strSLN.contains("?")) {
                    str = strSLN.concat("&orientation=portrait");
                } else {
                    str = strSLN.concat("?orientation=portrait");
                }
            }
        } else {
            intent = (z2 || tDVar.sRq() != 3 || !(tDVar.kqm() == 2 || (tDVar.kqm() == 1 && Lxb)) || tDVar.Yc()) ? new Intent(context, (Class<?>) TTLandingPageActivity.class) : new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        }
        intent.putExtra("url", str);
        intent.putExtra("gecko_id", tDVar.oc());
        intent.putExtra("web_title", tDVar.FD());
        intent.putExtra("sdk_version", BuildConfig.VERSION_CODE);
        intent.putExtra("adid", tDVar.bG());
        intent.putExtra("log_extra", tDVar.Lv());
        com.bytedance.sdk.openadsdk.multipro.LD.Lxb lxbLk = null;
        intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, tDVar.Lpq() == null ? null : tDVar.Lpq().Lxb());
        intent.putExtra("event_tag", str2);
        intent.putExtra("source", i);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, tDVar.JD().toString());
        } else {
            aH.Lxb().lc();
            aH.Lxb().Lxb(tDVar);
        }
        if (tDVar.FGm() == 5 || tDVar.FGm() == 15 || tDVar.FGm() == 50) {
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.multipro.LD.Lxb.InterfaceC0115Lxb) {
                    lxbLk = ((com.bytedance.sdk.openadsdk.multipro.LD.Lxb.InterfaceC0115Lxb) pAGNativeAd).lc();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.LD) {
                    lxbLk = ((com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.LD) pAGNativeAd).LD();
                }
                if (lxbLk != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, lxbLk.Lxb().toString());
                }
            }
            if ((pangleAd instanceof com.bytedance.sdk.openadsdk.core.lk.lc) && (lxbLk = ((com.bytedance.sdk.openadsdk.core.lk.lc) pangleAd).lk()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, lxbLk.Lxb().toString());
            }
            if (lxbLk != null) {
                intent.putExtra("video_is_auto_play", lxbLk.ZU);
                if (com.bytedance.sdk.component.utils.sLN.ZU()) {
                    lxbLk.Lxb().toString();
                }
            }
        }
        return intent;
    }

    private static boolean Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, boolean z) {
        if (z && tDVar != null && tDVar.sRq() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.eK.LD(tDVar);
        }
        return false;
    }
}
