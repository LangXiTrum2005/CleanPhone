package com.bytedance.sdk.openadsdk.exc.qdl.qdl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.bjy;
import com.bytedance.sdk.openadsdk.core.fco;
import com.bytedance.sdk.openadsdk.core.model.exu;
import com.bytedance.sdk.openadsdk.core.model.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.oth;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mzz implements mo {
    public static Boolean qdl;
    protected int lnr;
    private final WeakReference<Context> mml;
    protected String ud;

    public mzz(Context context, String str) {
        this.mml = new WeakReference<>(context);
        this.ud = str;
        "====tag===".concat(String.valueOf(str));
        if (yt.qdl() == null) {
            yt.ud(context);
        }
    }

    private static boolean ud() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo
    public void lnr(ljh ljhVar) {
        if (qdl() == null || ljhVar == null) {
            return;
        }
        if (ud(ljhVar)) {
            ljhVar.mzz(true);
            com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
            return;
        }
        if (qdl(ljhVar)) {
            ljhVar.mzz(true);
            com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
            return;
        }
        if (qdl(ljhVar, false)) {
            com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
            return;
        }
        if (mml(ljhVar)) {
            ljhVar.mzz(true);
            com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
        } else {
            if (ljhVar.fhs() != null || ljhVar.od() == null) {
                return;
            }
            fco.qdl(qdl(), ljhVar.od(), ljhVar, gy.qdl(this.ud), this.ud, true);
            ljhVar.mzz(true);
            com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo
    public boolean mml(ljh ljhVar) {
        com.bytedance.sdk.openadsdk.core.model.mo moVarFhs;
        if (ljhVar == null || (moVarFhs = ljhVar.fhs()) == null) {
            return false;
        }
        return qdl(qdl(), ljhVar, moVarFhs.qdl(), moVarFhs.lnr());
    }

    @Override // com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo
    public void qdl(boolean z2) {
    }

    public static boolean qdl(Context context, String str, String str2, String str3, ljh ljhVar) {
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, str3, "store_open", (JSONObject) null);
                com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri uri = Uri.parse("market://details?id=".concat(str2));
                intent2.setData(uri);
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(uri);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        context.startActivity(intent3);
                        com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, str3, "store_open", (JSONObject) null);
                        com.bytedance.sdk.openadsdk.utils.mzz.qdl(ljhVar);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th);
            }
        }
        return false;
    }

    public boolean ud(ljh ljhVar) {
        com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar, this.ud, 1, null);
        exu exuVarBo = ljhVar.bo();
        if (exuVarBo == null) {
            com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar, this.ud, -1, null);
            return false;
        }
        HashMap map = new HashMap();
        qdl(ljhVar, map);
        if (lnr.qdl(qdl(), exuVarBo.qdl(), ljhVar, gy.ud(ljhVar), map, true)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, this.ud, "open_fallback_url", map);
        return false;
    }

    public static boolean ud(ljh ljhVar, Context context, boolean z2) {
        String strLnr;
        IPMiBroadcastReceiver iPMiBroadcastReceiverQdl;
        if (ljhVar != null && context != null) {
            try {
                koa koaVarGjm = ljhVar.gjm();
                if (koaVarGjm != null && !TextUtils.isEmpty(koaVarGjm.tvp())) {
                    if (koaVarGjm.jpc() && qdl(ljhVar, context, z2)) {
                        return true;
                    }
                    if (koaVarGjm.wd()) {
                        if (ljhVar.rdp() == 1) {
                            strLnr = koaVarGjm.qdl();
                        } else {
                            strLnr = (ljhVar.fhs() == null || TextUtils.isEmpty(ljhVar.fhs().lnr())) ? null : ljhVar.fhs().lnr();
                        }
                        if (!TextUtils.isEmpty(strLnr) && (iPMiBroadcastReceiverQdl = IPMiBroadcastReceiver.qdl(context)) != null) {
                            iPMiBroadcastReceiverQdl.qdl(strLnr, ljhVar);
                        }
                    }
                    final boolean zQdl = lnr.qdl(context, koaVarGjm.tvp(), ljhVar, gy.ud(ljhVar), qdl(ljhVar, z2, koaVarGjm), true);
                    com.bytedance.sdk.openadsdk.utils.fco.ud(new jpc("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.exc.qdl.qdl.mzz.3
                        @Override // java.lang.Runnable
                        public void run() {
                            if (zQdl) {
                                tvp.qdl("oem_store", "1");
                            } else {
                                tvp.qdl("oem_store", "-2");
                            }
                        }
                    });
                    return zQdl;
                }
            } catch (Throwable th) {
                aaj.lnr("GPDownLoader", th.getMessage());
            }
        }
        return false;
    }

    public static boolean qdl(ljh ljhVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent intentQdl;
        if (ljhVar != null && ljhVar.ab() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (intentQdl = gy.qdl(context, str)) == null) {
                return false;
            }
            intentQdl.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                intentQdl.addFlags(268435456);
            }
            context.startActivity(intentQdl);
            if (map == null) {
                map = new HashMap<>();
            }
            if (ljhVar != null && ljhVar.ikv() == 0) {
                map.put("auto_click", Boolean.valueOf(!ljhVar.bjy()));
            }
            map.put("can_query_install", Integer.valueOf(ud() ? 1 : 0));
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo
    public void qdl(int i2) {
        this.lnr = i2;
    }

    public boolean qdl(Context context, ljh ljhVar, String str, String str2) {
        return qdl(context, str, str2, this.ud, ljhVar);
    }

    public Context qdl() {
        WeakReference<Context> weakReference = this.mml;
        return (weakReference == null || weakReference.get() == null) ? yt.qdl() : this.mml.get();
    }

    private void qdl(ljh ljhVar, Map<String, Object> map) {
        if (ljhVar != null && ljhVar.ikv() == 0) {
            map.put("auto_click", Boolean.valueOf(!ljhVar.bjy()));
        }
        if (ljhVar != null && ljhVar.ikv() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.lnr >= 11));
        }
        map.put("can_query_install", Integer.valueOf(ud() ? 1 : 0));
    }

    @Override // com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo
    public boolean qdl(ljh ljhVar) {
        com.bytedance.sdk.openadsdk.core.model.mo moVarFhs;
        if (ljhVar == null || (moVarFhs = ljhVar.fhs()) == null || ljhVar.ab() == 0) {
            return false;
        }
        String strLnr = moVarFhs.lnr();
        if (TextUtils.isEmpty(strLnr)) {
            return false;
        }
        return qdl(ljhVar, strLnr, qdl(), this.ud, new HashMap());
    }

    public boolean qdl(ljh ljhVar, boolean z2) {
        return ud(ljhVar, qdl(), z2);
    }

    private static void qdl(final JSONObject jSONObject, ljh ljhVar, String str, final int i2) {
        try {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), ljhVar, str, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.exc.qdl.qdl.mzz.1
                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject qdl() {
                    try {
                        jSONObject.put("status", i2);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static boolean qdl(ljh ljhVar, Context context, boolean z2) {
        if (ljhVar != null && ljhVar.gjm() != null && ljhVar.gjm().jpc() && !TextUtils.isEmpty(ljhVar.gjm().tvp()) && context != null) {
            try {
                koa koaVarGjm = ljhVar.gjm();
                String strQdl = gy.qdl(ljhVar);
                final JSONObject jSONObject = koaVarGjm.to();
                jSONObject.put("from_web", z2 ? 1 : 0);
                jSONObject.put("is_w2a", ljhVar.rdp());
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), ljhVar, strQdl, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.exc.qdl.qdl.mzz.2
                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject qdl() {
                        try {
                            jSONObject.put("status", 0);
                        } catch (Throwable unused) {
                        }
                        return jSONObject;
                    }
                });
                Intent intentQdl = qdl(context, koaVarGjm);
                if (intentQdl == null) {
                    qdl(jSONObject, ljhVar, strQdl, -2);
                    return false;
                }
                if (context instanceof Activity) {
                    if (!oth.qdl((Activity) context)) {
                        context = null;
                    }
                } else {
                    Activity activityUd = bjy.qdl().mzz().ud();
                    if (activityUd != null && oth.qdl(activityUd)) {
                        context = activityUd;
                    }
                }
                if (!(context instanceof Activity)) {
                    qdl(jSONObject, ljhVar, strQdl, -5);
                    return false;
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && intentQdl.resolveActivity(packageManager) != null) {
                    try {
                        ((Activity) context).startActivityForResult(intentQdl, 0);
                        qdl(jSONObject, ljhVar, strQdl, 1);
                        return true;
                    } catch (Throwable unused) {
                        qdl(jSONObject, ljhVar, strQdl, -3);
                        return false;
                    }
                }
                qdl(jSONObject, ljhVar, strQdl, -4);
                return false;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    private static Intent qdl(Context context, koa koaVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String strMml = koaVar.mml();
            if (!TextUtils.isEmpty(strMml)) {
                intent.setPackage(strMml);
            } else {
                intent.setPackage("com.android.vending");
            }
            intent.setData(Uri.parse(koaVar.tvp()));
            boolean z2 = true;
            if (koaVar.ud() != 1) {
                z2 = false;
            }
            intent.putExtra("overlay", z2);
            if (TextUtils.isEmpty(koaVar.lnr())) {
                intent.putExtra("callerId", context.getPackageName());
            } else {
                intent.putExtra("callerId", koaVar.lnr());
            }
            koaVar.qdl(intent);
            return intent;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private static Map<String, Object> qdl(ljh ljhVar, boolean z2, koa koaVar) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oem_vendor_type", koaVar.mo());
            jSONObject.put("from_web", z2 ? 1 : 0);
            jSONObject.put("is_w2a", ljhVar.rdp());
            map.put("pag_json_data", jSONObject.toString());
        } catch (Throwable unused) {
        }
        return map;
    }

    public static boolean qdl(String str, ljh ljhVar) {
        String queryParameter;
        if (str != null && !str.isEmpty()) {
            try {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String host = uri.getHost();
                if ("market".equals(scheme) && "details".equals(host)) {
                    return true;
                }
                if ((!"http".equals(scheme) && !HttpRequest.DEFAULT_SCHEME.equals(scheme)) || (!"play.google.com".equals(host) && !"market.android.com".equals(host))) {
                    if ("market".equals(scheme) && "webstoreredirect".equals(host) && (queryParameter = uri.getQueryParameter("uri")) != null) {
                        return qdl(queryParameter, ljhVar);
                    }
                }
                return true;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    public static boolean qdl(ljh ljhVar, String str) {
        if (ljhVar == null || ljhVar.gjm() == null) {
            return false;
        }
        String strMzz = ljhVar.gjm().mzz();
        if (TextUtils.isEmpty(strMzz)) {
            return false;
        }
        return Pattern.compile(strMzz).matcher(str).matches();
    }
}
