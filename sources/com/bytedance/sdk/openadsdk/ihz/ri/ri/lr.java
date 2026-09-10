package com.bytedance.sdk.openadsdk.ihz.ri.ri;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.ig;
import com.bytedance.sdk.openadsdk.core.model.aw;
import com.bytedance.sdk.openadsdk.core.model.di;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.model.zf;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.core.slm;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.fi;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements ik {
    private final WeakReference<Context> ik;
    protected int lr;
    protected String ri;

    public lr(Context context, String str) {
        this.ik = new WeakReference<>(context);
        this.ri = str;
        "====tag===".concat(String.valueOf(str));
        if (nr.ri() == null) {
            nr.lr(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fi(wjv wjvVar) {
        if (lr(wjvVar)) {
            wjvVar.di(true);
            fi.ri(wjvVar);
            return;
        }
        if (ka(wjvVar)) {
            wjvVar.di(true);
            fi.ri(wjvVar);
            return;
        }
        if (ri(wjvVar, false)) {
            fi.ri(wjvVar);
            return;
        }
        if (ik(wjvVar)) {
            wjvVar.di(true);
            fi.ri(wjvVar);
        } else {
            if (wjvVar.tyz() != null || wjvVar.smj() == null) {
                return;
            }
            ig.ri(ri(), wjvVar.smj(), wjvVar, com.bytedance.sdk.openadsdk.utils.ig.ri(this.ri), this.ri, true);
            wjvVar.di(true);
            fi.ri(wjvVar);
        }
    }

    private static boolean lr() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.ihz.ri.ri.ik
    public boolean ik(wjv wjvVar) {
        di diVarTyz;
        if (wjvVar == null || (diVarTyz = wjvVar.tyz()) == null) {
            return false;
        }
        return ri(ri(), wjvVar, diVarTyz.ri(), diVarTyz.ik());
    }

    @Override // com.bytedance.sdk.openadsdk.ihz.ri.ri.ik
    public boolean ka(wjv wjvVar) {
        di diVarTyz;
        if (wjvVar == null || (diVarTyz = wjvVar.tyz()) == null || wjvVar.gqj() == 0) {
            return false;
        }
        String strIk = diVarTyz.ik();
        if (TextUtils.isEmpty(strIk)) {
            return false;
        }
        return ri(wjvVar, strIk, ri(), this.ri, new HashMap());
    }

    public static boolean ri(Context context, String str, String str2, String str3, wjv wjvVar) {
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, str3, "store_open", (JSONObject) null);
                fi.ri(wjvVar);
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
                        com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, str3, "store_open", (JSONObject) null);
                        fi.ri(wjvVar);
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

    public boolean lr(wjv wjvVar) {
        aw awVarLau = wjvVar.lau();
        if (awVarLau == null) {
            return false;
        }
        HashMap map = new HashMap();
        ri(wjvVar, map);
        if (ri.ri(ri(), awVarLau.ri(), wjvVar, com.bytedance.sdk.openadsdk.utils.ig.lr(wjvVar), map, true)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, this.ri, "open_fallback_url", map);
        return false;
    }

    public static boolean lr(wjv wjvVar, Context context, boolean z) {
        String strIk;
        IPBroadcastReceiver iPBroadcastReceiverRi;
        if (wjvVar != null && context != null) {
            try {
                zf zfVarXz = wjvVar.xz();
                if (zfVarXz != null && !TextUtils.isEmpty(zfVarXz.qt())) {
                    if (zfVarXz.jbs() && ri(wjvVar, context, z)) {
                        return true;
                    }
                    if (zfVarXz.xha() || zfVarXz.mj()) {
                        if (wjvVar.nr() == 1) {
                            strIk = zfVarXz.ri();
                        } else {
                            strIk = (wjvVar.tyz() == null || TextUtils.isEmpty(wjvVar.tyz().ik())) ? null : wjvVar.tyz().ik();
                        }
                        if (!TextUtils.isEmpty(strIk) && (iPBroadcastReceiverRi = IPBroadcastReceiver.ri(context, wjvVar)) != null) {
                            iPBroadcastReceiverRi.ri(strIk, wjvVar);
                        }
                    }
                    final boolean zRi = ri.ri(context, zfVarXz.qt(), wjvVar, com.bytedance.sdk.openadsdk.utils.ig.lr(wjvVar), ri(wjvVar, z, zfVarXz), true);
                    dzy.ik((Runnable) new com.bytedance.sdk.component.mj.lr.ik("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.4
                        @Override // java.lang.Runnable
                        public void run() {
                            if (zRi) {
                                qt.ri("oem_store", "1");
                            } else {
                                qt.ri("oem_store", "-2");
                            }
                        }
                    });
                    return zRi;
                }
            } catch (Throwable th) {
                ac.ik("GPDownLoader", th.getMessage());
            }
        }
        return false;
    }

    public static boolean ri(wjv wjvVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent intentRi;
        if (wjvVar != null && wjvVar.gqj() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (intentRi = com.bytedance.sdk.openadsdk.utils.ig.ri(context, str)) == null) {
                return false;
            }
            intentRi.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                intentRi.addFlags(268435456);
            }
            context.startActivity(intentRi);
            if (map == null) {
                map = new HashMap<>();
            }
            if (wjvVar != null && wjvVar.yv() == 0) {
                map.put("auto_click", Boolean.valueOf(!wjvVar.tan()));
            }
            map.put("can_query_install", Integer.valueOf(lr() ? 1 : 0));
            com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.ihz.ri.ri.ik
    public void ri(int i) {
        this.lr = i;
    }

    public boolean ri(Context context, wjv wjvVar, String str, String str2) {
        return ri(context, str, str2, this.ri, wjvVar);
    }

    public Context ri() {
        WeakReference<Context> weakReference = this.ik;
        return (weakReference == null || weakReference.get() == null) ? nr.ri() : this.ik.get();
    }

    @Override // com.bytedance.sdk.openadsdk.ihz.ri.ri.ik
    public void ri(final wjv wjvVar) {
        if (ri() == null || wjvVar == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.wjv.fi.ri("gp_downloader_async", 0) == 1) {
            dzy.jbs().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.1
                @Override // java.lang.Runnable
                public void run() {
                    lr.this.fi(wjvVar);
                }
            });
        } else {
            fi(wjvVar);
        }
    }

    private void ri(wjv wjvVar, Map<String, Object> map) {
        if (wjvVar != null && wjvVar.yv() == 0) {
            map.put("auto_click", Boolean.valueOf(!wjvVar.tan()));
        }
        if (wjvVar != null && wjvVar.yv() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.lr >= 11));
        }
        map.put("can_query_install", Integer.valueOf(lr() ? 1 : 0));
    }

    public boolean ri(wjv wjvVar, boolean z) {
        return lr(wjvVar, ri(), z);
    }

    private static void ri(final JSONObject jSONObject, wjv wjvVar, String str, final int i) {
        try {
            com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVar, str, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.2
                @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                public JSONObject ri() {
                    try {
                        jSONObject.put("status", i);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static boolean ri(wjv wjvVar, Context context, boolean z) {
        if (wjvVar != null && wjvVar.xz() != null && wjvVar.xz().jbs() && !TextUtils.isEmpty(wjvVar.xz().qt()) && context != null) {
            try {
                zf zfVarXz = wjvVar.xz();
                String strRi = com.bytedance.sdk.openadsdk.utils.ig.ri(wjvVar);
                final JSONObject jSONObjectSf = zfVarXz.sf();
                jSONObjectSf.put("from_web", z ? 1 : 0);
                jSONObjectSf.put("is_w2a", wjvVar.nr());
                com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVar, strRi, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.ihz.ri.ri.lr.3
                    @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                    public JSONObject ri() {
                        try {
                            jSONObjectSf.put("status", 0);
                        } catch (Throwable unused) {
                        }
                        return jSONObjectSf;
                    }
                });
                Intent intentRi = ri(context, zfVarXz);
                if (intentRi == null) {
                    ri(jSONObjectSf, wjvVar, strRi, -2);
                    return false;
                }
                if (context instanceof Activity) {
                    if (!com.bytedance.sdk.openadsdk.utils.wjv.ri((Activity) context)) {
                        context = null;
                    }
                } else {
                    Activity activityLr = slm.ri().fi().lr();
                    if (activityLr != null && com.bytedance.sdk.openadsdk.utils.wjv.ri(activityLr)) {
                        context = activityLr;
                    }
                }
                if (!(context instanceof Activity)) {
                    ri(jSONObjectSf, wjvVar, strRi, -5);
                    return false;
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && intentRi.resolveActivity(packageManager) != null) {
                    try {
                        ((Activity) context).startActivityForResult(intentRi, 0);
                        ri(jSONObjectSf, wjvVar, strRi, 1);
                        return true;
                    } catch (Throwable unused) {
                        ri(jSONObjectSf, wjvVar, strRi, -3);
                        return false;
                    }
                }
                ri(jSONObjectSf, wjvVar, strRi, -4);
                return false;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    private static Intent ri(Context context, zf zfVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String strKa = zfVar.ka();
            if (!TextUtils.isEmpty(strKa)) {
                intent.setPackage(strKa);
            } else {
                intent.setPackage("com.android.vending");
            }
            intent.setData(Uri.parse(zfVar.qt()));
            boolean z = true;
            if (zfVar.lr() != 1) {
                z = false;
            }
            intent.putExtra("overlay", z);
            if (TextUtils.isEmpty(zfVar.ik())) {
                intent.putExtra("callerId", context.getPackageName());
            } else {
                intent.putExtra("callerId", zfVar.ik());
            }
            zfVar.ri(intent);
            return intent;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private static Map<String, Object> ri(wjv wjvVar, boolean z, zf zfVar) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oem_vendor_type", zfVar.di());
            jSONObject.put("from_web", z ? 1 : 0);
            jSONObject.put("is_w2a", wjvVar.nr());
            map.put("pag_json_data", jSONObject.toString());
        } catch (Throwable unused) {
        }
        return map;
    }

    public static boolean ri(String str, wjv wjvVar) {
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
                        return ri(queryParameter, wjvVar);
                    }
                }
                return true;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    public static boolean ri(wjv wjvVar, String str) {
        if (wjvVar == null || wjvVar.xz() == null) {
            return false;
        }
        String strFi = wjvVar.xz().fi();
        if (TextUtils.isEmpty(strFi)) {
            return false;
        }
        return Pattern.compile(strFi).matcher(str).matches();
    }
}
