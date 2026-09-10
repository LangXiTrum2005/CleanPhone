package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.smartdigimkt.x.g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class fco {
    private static boolean qdl = false;

    public static void qdl(boolean z2) {
        qdl = z2;
    }

    private static com.bytedance.sdk.openadsdk.bjy.qdl.ud qdl(int i2, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        com.bytedance.sdk.openadsdk.bjy.qdl.ud udVar = new com.bytedance.sdk.openadsdk.bjy.qdl.ud();
        udVar.qdl(com.bytedance.sdk.openadsdk.mml.ud.qdl.qdl);
        udVar.qdl(ljhVar);
        udVar.ud(com.bytedance.sdk.openadsdk.utils.gy.qdl(ljhVar));
        udVar.qdl(i2);
        udVar.qdl(false);
        udVar.ud(ljhVar.ygv());
        return udVar;
    }

    public static boolean qdl(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i2, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.mml.qdl qdlVar, String str, com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo moVar, boolean z2, int i3) {
        String strQdl;
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(-1, ljhVar));
        if (context != null && ljhVar != null && i2 != -1) {
            com.bytedance.sdk.openadsdk.core.model.exu exuVarBo = ljhVar.bo();
            HashMap map = new HashMap();
            if (ljhVar.ikv() == 0) {
                map.put("dpl_probability_jump", Boolean.valueOf(i3 >= 11));
            }
            if (i3 != 0 && ljhVar.uj()) {
                map.put("dsp_click_type", Integer.valueOf(i3));
            }
            if (exuVarBo != null && !TextUtils.isEmpty(exuVarBo.qdl())) {
                if (qdl(context, ljhVar, i2, str, z2, map)) {
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(2, ljhVar));
                    com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
                    return true;
                }
                if (exuVarBo.lnr() != 2 || ljhVar.vxg() == 5 || ljhVar.vxg() == 15) {
                    if (exuVarBo.lnr() == 1 && !TextUtils.isEmpty(exuVarBo.ud())) {
                        strQdl = exuVarBo.ud();
                    } else {
                        strQdl = qdl(ljhVar);
                    }
                } else if (moVar != null) {
                    if (!moVar.qdl(ljhVar)) {
                        if (moVar.mml(ljhVar)) {
                            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, "open_fallback_url", map);
                            com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(3, ljhVar));
                            com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
                            return true;
                        }
                        strQdl = qdl(exuVarBo, ljhVar);
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(3, ljhVar));
                    } else {
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, "open_fallback_url", map);
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(3, ljhVar));
                        com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
                        return true;
                    }
                } else {
                    strQdl = qdl(exuVarBo, ljhVar);
                }
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, "open_fallback_url", map);
            } else {
                strQdl = qdl(ljhVar);
            }
            String str2 = strQdl;
            if (ljhVar.ikv() == 0 && !TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
                String strSubstring = str2.substring(str2.indexOf("?id=") + 4);
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(4, ljhVar));
                boolean zQdl = com.bytedance.sdk.openadsdk.exc.qdl.qdl.mml.qdl(context, str2, strSubstring, str, ljhVar);
                if (zQdl) {
                    com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
                }
                return zQdl;
            }
            boolean zQdl2 = qdl(context, ljhVar, i2, pAGNativeAd, qdlVar, str, z2, str2);
            if (zQdl2) {
                com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
            }
            return zQdl2;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(1, ljhVar));
        return false;
    }

    private static String qdl(com.bytedance.sdk.openadsdk.core.model.exu exuVar, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (!TextUtils.isEmpty(exuVar.ud())) {
            return exuVar.ud();
        }
        return qdl(ljhVar);
    }

    private static String qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (ljhVar.uj() && ljhVar.aoy() != null) {
            return ljhVar.aoy().tvp();
        }
        return ljhVar.od();
    }

    public static boolean qdl(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i2, String str, boolean z2, Map<String, Object> map) {
        if (ljhVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.exu exuVarBo = ljhVar.bo();
        if (exuVarBo != null && !TextUtils.isEmpty(exuVarBo.qdl())) {
            if (map == null) {
                map = new HashMap<>();
            }
            Map<String, Object> map2 = map;
            String strQdl = exuVarBo.qdl();
            if (com.bytedance.sdk.openadsdk.exc.qdl.qdl.lnr.qdl()) {
                return com.bytedance.sdk.openadsdk.exc.qdl.qdl.lnr.qdl(context, strQdl, ljhVar, i2, map2, z2);
            }
            Uri uri = Uri.parse(strQdl);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (com.bytedance.sdk.openadsdk.utils.gy.mml(context)) {
                com.bytedance.sdk.openadsdk.utils.gy.ud udVarQdl = com.bytedance.sdk.openadsdk.utils.gy.qdl(context, intent);
                if (udVarQdl.ud > 0) {
                    if (yt.mml().to()) {
                        com.bytedance.sdk.openadsdk.utils.gy.qdl(ljhVar, str);
                    }
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    map2.put("can_query_install", 1);
                    map2.put("matched_count", Integer.valueOf(udVarQdl.ud));
                    map2.put("url", strQdl);
                    ComponentName componentName = udVarQdl.qdl;
                    if (componentName != null) {
                        intent.setComponent(componentName);
                    }
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, "open_url_app", map2);
                    try {
                        context.startActivity(intent);
                        com.bytedance.sdk.openadsdk.mml.exu.qdl().qdl(map2).qdl(ljhVar, str);
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl("dp_start_act_success", ljhVar, str, map2);
                        return true;
                    } catch (Exception e2) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(g.f39715A, e2.getMessage());
                            jSONObject.put("intent", intent.toString());
                            jSONObject.put("can_query_install", 1);
                        } catch (Exception unused) {
                        }
                        mml.qdl(ljhVar, str, -4, jSONObject);
                        if (!yt.mml().to()) {
                            qdl(context, ljhVar.od(), ljhVar, i2, str, z2);
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
                mml.qdl(ljhVar, str, -3, jSONObject2);
            } else {
                try {
                    if (yt.mml().to()) {
                        com.bytedance.sdk.openadsdk.utils.gy.qdl(ljhVar, str);
                    }
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    map2.put("can_query_install", 0);
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, "open_url_app", map2);
                    context.startActivity(intent);
                    com.bytedance.sdk.openadsdk.mml.exu.qdl().qdl(map2).qdl(ljhVar, str);
                    return true;
                } catch (Throwable unused3) {
                }
            }
            return false;
        }
        mml.qdl(ljhVar, str, exuVarBo == null ? -1 : -2, exuVarBo != null ? exuVarBo.mml() : null);
        return false;
    }

    public static boolean qdl(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i2, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.mml.qdl qdlVar, String str, boolean z2, String str2) {
        if (TextUtils.isEmpty(str2) && !com.bytedance.sdk.openadsdk.core.model.vu.ud(ljhVar)) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(5, ljhVar));
            return false;
        }
        int iYgv = ljhVar.ygv();
        if (iYgv != 2 && iYgv != 8) {
            com.bytedance.sdk.component.utils.ud.qdl(context, qdl(context, str2, ljhVar, i2, pAGNativeAd, qdlVar, str, z2), null);
            qdl = false;
            return true;
        }
        return com.bytedance.sdk.openadsdk.utils.oth.qdl(context, str2, ljhVar, com.bytedance.sdk.openadsdk.mml.ud.qdl.qdl);
    }

    public static void qdl(Context context, String str, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i2, String str2, boolean z2) {
        com.bytedance.sdk.component.utils.ud.qdl(context, qdl(context, str, ljhVar, i2, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.mml.qdl) null, str2, z2), null);
    }

    public static void qdl(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i2, final String str2, boolean z2, exc excVar) {
        com.bytedance.sdk.component.utils.ud.qdl(context, qdl(context, str, ljhVar, i2, null, null, str2, z2, true, excVar), new com.bytedance.sdk.component.utils.ud.InterfaceC0095ud() { // from class: com.bytedance.sdk.openadsdk.core.fco.1
            @Override // com.bytedance.sdk.component.utils.ud.InterfaceC0095ud
            public void qdl() {
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str2, 3, (JSONObject) null);
            }

            @Override // com.bytedance.sdk.component.utils.ud.InterfaceC0095ud
            public void qdl(Throwable th) {
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str2, -2, (JSONObject) null);
            }
        });
    }

    private static Intent qdl(Context context, String str, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i2, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.mml.qdl qdlVar, String str2, boolean z2) {
        return qdl(context, str, ljhVar, i2, pAGNativeAd, qdlVar, str2, z2, false, null);
    }

    public static boolean qdl(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str, int i2, int i3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", i3);
            com.bytedance.sdk.openadsdk.mml.lnr.mo(ljhVar, str, jSONObject);
            Intent intentQdl = qdl(context, ljhVar, str, i2);
            if (intentQdl == null) {
                return false;
            }
            return com.bytedance.sdk.component.utils.ud.qdl(context, intentQdl, null, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent qdl(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str, int i2) {
        if (context == null || ljhVar == null || !com.bytedance.sdk.openadsdk.core.model.vu.ud(ljhVar)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
        intent.putExtra("ad_pending_download", false);
        String strRq = com.bytedance.sdk.openadsdk.core.model.vu.rq(ljhVar);
        if (!TextUtils.isEmpty(strRq)) {
            if (strRq.contains("?")) {
                strRq = strRq.concat("&orientation=portrait");
            } else {
                strRq = strRq.concat("?orientation=portrait");
            }
        }
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            intent.putExtra("url", strRq);
            intent.putExtra("event_tag", str);
            intent.putExtra("source", i2);
            intent.putExtra("gecko_id", ljhVar.xmr());
            intent.putExtra("web_title", ljhVar.gsv());
            intent.putExtra("adid", ljhVar.yre());
            intent.putExtra("log_extra", ljhVar.ir());
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, ljhVar.rdz().toString());
            return intent;
        }
        ljhVar.mzz(strRq);
        ljhVar.mo(str);
        ljhVar.ud(i2);
        intent.putExtra("meta_index", koa.qdl().qdl(ljhVar));
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent qdl(Context context, String str, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i2, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.mml.qdl qdlVar, String str2, boolean z2, boolean z3, exc excVar) {
        Intent intent;
        if (!z3 && com.bytedance.sdk.openadsdk.core.model.vu.ud(ljhVar) && (pAGNativeAd != 0 || qdlVar != null)) {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            boolean zQdl = qdl(ljhVar, z2);
            intent.putExtra("ad_pending_download", zQdl);
            String strRq = com.bytedance.sdk.openadsdk.core.model.vu.rq(ljhVar);
            if (!TextUtils.isEmpty(strRq)) {
                if (strRq.contains("?")) {
                    str = strRq.concat("&orientation=portrait");
                } else {
                    str = strRq.concat("?orientation=portrait");
                }
            }
            ljhVar.ud(zQdl);
        } else if (!z3 && ljhVar.ygv() == 3 && ((ljhVar.taz() == 2 || (ljhVar.taz() == 1 && qdl)) && !ljhVar.cwa())) {
            intent = new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        } else {
            intent = new Intent(context, (Class<?>) TTLandingPageActivity.class);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            intent.putExtra("url", str);
            intent.putExtra("event_tag", str2);
            intent.putExtra("source", i2);
            intent.putExtra("gecko_id", ljhVar.xmr());
            if (!z3 || excVar == null) {
                intent.putExtra("web_title", ljhVar.gsv());
            } else {
                intent.putExtra("web_title", excVar.ud());
                intent.putExtra("only_loading", excVar.qdl());
            }
            intent.putExtra("adid", ljhVar.yre());
            intent.putExtra("log_extra", ljhVar.ir());
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, ljhVar.rdz().toString());
        } else {
            if (z3 && excVar != null) {
                ljhVar.aaj(excVar.ud());
                ljhVar.qdl(excVar.qdl());
            }
            ljhVar.mzz(str);
            ljhVar.mo(str2);
            ljhVar.ud(i2);
            intent.putExtra("meta_index", koa.qdl().qdl(ljhVar));
        }
        if (ljhVar.vxg() == 5 || ljhVar.vxg() == 15 || ljhVar.vxg() == 50) {
            com.bytedance.sdk.openadsdk.multipro.ud.qdl qdlVarLnr = null;
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.multipro.ud.qdl.InterfaceC0150qdl) {
                    qdlVarLnr = ((com.bytedance.sdk.openadsdk.multipro.ud.qdl.InterfaceC0150qdl) pAGNativeAd).mo();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.qdl.ud.qdl.ud) {
                    qdlVarLnr = ((com.bytedance.sdk.openadsdk.qdl.ud.qdl.ud) pAGNativeAd).ud();
                }
                if (qdlVarLnr != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, qdlVarLnr.qdl().toString());
                }
            }
            if (qdlVar != null && qdlVar.ud() && (qdlVarLnr = qdlVar.lnr()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, qdlVarLnr.qdl().toString());
            }
            if (qdlVarLnr != null) {
                intent.putExtra("video_is_auto_play", qdlVarLnr.mml);
                if (com.bytedance.sdk.component.utils.bjy.mml()) {
                    qdlVarLnr.qdl().toString();
                }
            }
        }
        return intent;
    }

    private static boolean qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, boolean z2) {
        if (z2 && ljhVar != null && ljhVar.ygv() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.vu.ud(ljhVar);
        }
        return false;
    }
}
