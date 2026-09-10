package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ig {
    private static boolean ri = false;

    public static void ri(boolean z) {
        ri = z;
    }

    private static com.bytedance.sdk.openadsdk.slm.ri.lr ri(int i, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        com.bytedance.sdk.openadsdk.slm.ri.lr lrVar = new com.bytedance.sdk.openadsdk.slm.ri.lr();
        lrVar.ri(com.bytedance.sdk.openadsdk.ka.lr.ri.ri);
        lrVar.ri(wjvVar);
        lrVar.lr(com.bytedance.sdk.openadsdk.utils.ig.ri(wjvVar));
        lrVar.ri(i);
        lrVar.ri(false);
        lrVar.lr(wjvVar.adz());
        return lrVar;
    }

    public static boolean ri(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.ka.ri riVar, String str, com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ikVar, boolean z, int i2) {
        String strRi;
        com.bytedance.sdk.openadsdk.ka.ik.ri(ri(-1, wjvVar));
        if (context != null && wjvVar != null && i != -1) {
            com.bytedance.sdk.openadsdk.core.model.aw awVarLau = wjvVar.lau();
            HashMap map = new HashMap();
            if (wjvVar.yv() == 0) {
                map.put("dpl_probability_jump", Boolean.valueOf(i2 >= 11));
            }
            if (i2 != 0 && wjvVar.zz()) {
                map.put("dsp_click_type", Integer.valueOf(i2));
            }
            if (awVarLau != null && !TextUtils.isEmpty(awVarLau.ri())) {
                if (ri(context, wjvVar, i, str, z, map)) {
                    com.bytedance.sdk.openadsdk.ka.ik.ri(ri(2, wjvVar));
                    com.bytedance.sdk.openadsdk.utils.fi.ri(wjvVar);
                    return true;
                }
                if (awVarLau.ik() != 2 || wjvVar.vz() == 5 || wjvVar.vz() == 15) {
                    if (awVarLau.ik() == 1 && !TextUtils.isEmpty(awVarLau.lr())) {
                        strRi = awVarLau.lr();
                    } else {
                        strRi = ri(wjvVar);
                    }
                } else if (ikVar != null) {
                    if (!ikVar.ka(wjvVar)) {
                        if (ikVar.ik(wjvVar)) {
                            com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, str, "open_fallback_url", map);
                            com.bytedance.sdk.openadsdk.ka.ik.ri(ri(3, wjvVar));
                            com.bytedance.sdk.openadsdk.utils.fi.ri(wjvVar);
                            return true;
                        }
                        strRi = ri(awVarLau, wjvVar);
                        com.bytedance.sdk.openadsdk.ka.ik.ri(ri(3, wjvVar));
                    } else {
                        com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, str, "open_fallback_url", map);
                        com.bytedance.sdk.openadsdk.ka.ik.ri(ri(3, wjvVar));
                        com.bytedance.sdk.openadsdk.utils.fi.ri(wjvVar);
                        return true;
                    }
                } else {
                    strRi = ri(awVarLau, wjvVar);
                }
                com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, str, "open_fallback_url", map);
            } else {
                strRi = ri(wjvVar);
            }
            String str2 = strRi;
            if (wjvVar.yv() == 0 && !TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
                String strSubstring = str2.substring(str2.indexOf("?id=") + 4);
                com.bytedance.sdk.openadsdk.ka.ik.ri(ri(4, wjvVar));
                boolean zRi = com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.ri(context, str2, strSubstring, str, wjvVar);
                if (zRi) {
                    com.bytedance.sdk.openadsdk.utils.fi.ri(wjvVar);
                }
                return zRi;
            }
            boolean zRi2 = ri(context, wjvVar, i, pAGNativeAd, riVar, str, z, str2);
            if (zRi2) {
                com.bytedance.sdk.openadsdk.utils.fi.ri(wjvVar);
            }
            return zRi2;
        }
        com.bytedance.sdk.openadsdk.ka.ik.ri(ri(1, wjvVar));
        return false;
    }

    private static String ri(com.bytedance.sdk.openadsdk.core.model.aw awVar, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (!TextUtils.isEmpty(awVar.lr())) {
            return awVar.lr();
        }
        return ri(wjvVar);
    }

    private static String ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar.zz() && wjvVar.sr() != null) {
            return wjvVar.sr().jbs();
        }
        return wjvVar.smj();
    }

    public static boolean ri(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, String str, boolean z, Map<String, Object> map) {
        if (wjvVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.aw awVarLau = wjvVar.lau();
        if (awVarLau != null && !TextUtils.isEmpty(awVarLau.ri())) {
            if (map == null) {
                map = new HashMap<>();
            }
            return com.bytedance.sdk.openadsdk.ihz.ri.ri.ri.ri(context, awVarLau.ri(), wjvVar, i, map, z);
        }
        fi.ri(wjvVar, str, awVarLau == null ? -1 : -2, awVarLau != null ? awVarLau.ka() : null);
        return false;
    }

    public static boolean ri(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.ka.ri riVar, String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str2) && !com.bytedance.sdk.openadsdk.core.model.dw.lr(wjvVar)) {
            com.bytedance.sdk.openadsdk.ka.ik.ri(ri(5, wjvVar));
            return false;
        }
        int iAdz = wjvVar.adz();
        if (iAdz != 2 && iAdz != 8) {
            com.bytedance.sdk.component.utils.lr.ri(context, ri(context, str2, wjvVar, i, pAGNativeAd, riVar, str, z), null);
            ri = false;
            return true;
        }
        return com.bytedance.sdk.openadsdk.utils.wjv.ri(context, str2, wjvVar, com.bytedance.sdk.openadsdk.ka.lr.ri.ri, false);
    }

    public static void ri(Context context, String str, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, String str2, boolean z) {
        com.bytedance.sdk.component.utils.lr.ri(context, ri(context, str, wjvVar, i, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.ka.ri) null, str2, z), null);
    }

    public static void ri(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, final String str2, boolean z, ac acVar) {
        com.bytedance.sdk.component.utils.lr.ri(context, ri(context, str, wjvVar, i, null, null, str2, z, true, acVar), new com.bytedance.sdk.component.utils.lr.InterfaceC0216lr() { // from class: com.bytedance.sdk.openadsdk.core.ig.1
            @Override // com.bytedance.sdk.component.utils.lr.InterfaceC0216lr
            public void ri() {
                com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, str2, 3, (JSONObject) null);
            }

            @Override // com.bytedance.sdk.component.utils.lr.InterfaceC0216lr
            public void ri(Throwable th) {
                com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, str2, -2, (JSONObject) null);
            }
        });
    }

    private static Intent ri(Context context, String str, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.ka.ri riVar, String str2, boolean z) {
        return ri(context, str, wjvVar, i, pAGNativeAd, riVar, str2, z, false, null);
    }

    public static boolean ri(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", i2);
            com.bytedance.sdk.openadsdk.ka.ik.di(wjvVar, str, jSONObject);
            Intent intentRi = ri(context, wjvVar, str, i);
            if (intentRi == null) {
                return false;
            }
            return com.bytedance.sdk.component.utils.lr.ri(context, intentRi, null, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent ri(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, int i) {
        if (context == null || wjvVar == null || !com.bytedance.sdk.openadsdk.core.model.dw.lr(wjvVar)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
        intent.putExtra("ad_pending_download", false);
        String strSf = com.bytedance.sdk.openadsdk.core.model.dw.sf(wjvVar);
        if (!TextUtils.isEmpty(strSf)) {
            if (strSf.contains("?")) {
                strSf = strSf + "&orientation=portrait";
            } else {
                strSf = strSf + "?orientation=portrait";
            }
        }
        wjvVar.fi(strSf);
        wjvVar.di(str);
        wjvVar.ka(i);
        intent.putExtra("meta_index", dw.ri().ri(wjvVar));
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent ri(Context context, String str, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.ka.ri riVar, String str2, boolean z, boolean z2, ac acVar) {
        Intent intent;
        if (!z2 && com.bytedance.sdk.openadsdk.core.model.dw.lr(wjvVar) && (pAGNativeAd != 0 || riVar != null)) {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            boolean zRi = ri(wjvVar, z);
            intent.putExtra("ad_pending_download", zRi);
            String strSf = com.bytedance.sdk.openadsdk.core.model.dw.sf(wjvVar);
            if (!TextUtils.isEmpty(strSf)) {
                if (strSf.contains("?")) {
                    str = strSf + "&orientation=portrait";
                } else {
                    str = strSf + "?orientation=portrait";
                }
            }
            wjvVar.lr(zRi);
        } else if (!z2 && wjvVar.adz() == 3 && ((wjvVar.nd() == 2 || (wjvVar.nd() == 1 && ri)) && !wjvVar.ae())) {
            intent = new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        } else {
            intent = new Intent(context, (Class<?>) TTLandingPageActivity.class);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (z2 && acVar != null) {
            wjvVar.ac(acVar.lr());
            wjvVar.ri(acVar.ri());
        }
        wjvVar.fi(str);
        wjvVar.di(str2);
        wjvVar.ka(i);
        intent.putExtra("meta_index", dw.ri().ri(wjvVar));
        if (wjvVar.vz() == 5 || wjvVar.vz() == 15 || wjvVar.vz() == 50) {
            com.bytedance.sdk.openadsdk.tan.ik.ri riVarIk = null;
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.tan.ik.ri.InterfaceC0276ri) {
                    riVarIk = ((com.bytedance.sdk.openadsdk.tan.ik.ri.InterfaceC0276ri) pAGNativeAd).di();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.ri.lr.ri.lr) {
                    riVarIk = ((com.bytedance.sdk.openadsdk.ri.lr.ri.lr) pAGNativeAd).lr();
                }
                if (riVarIk != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, riVarIk.ri().toString());
                }
            }
            if (riVar != null && riVar.lr() && (riVarIk = riVar.ik()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, riVarIk.ri().toString());
            }
            if (riVarIk != null) {
                intent.putExtra("video_is_auto_play", riVarIk.ka);
                if (com.bytedance.sdk.component.utils.vr.ik()) {
                    riVarIk.ri().toString();
                }
            }
        }
        return intent;
    }

    private static boolean ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, boolean z) {
        if (z && wjvVar != null && wjvVar.adz() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.dw.lr(wjvVar);
        }
        return false;
    }
}
