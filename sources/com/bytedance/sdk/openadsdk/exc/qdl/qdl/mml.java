package com.bytedance.sdk.openadsdk.exc.qdl.qdl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.fco;
import com.bytedance.sdk.openadsdk.core.model.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.exu;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.smartdigimkt.x.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mml implements mo {
    protected int mml;
    private final WeakReference<Context> mzz;
    protected String qdl;
    protected boolean ud = false;
    protected final AtomicBoolean lnr = new AtomicBoolean(false);
    private boolean mo = false;

    public mml(Context context, String str) {
        this.mzz = new WeakReference<>(context);
        this.qdl = str;
        "====tag===".concat(String.valueOf(str));
        if (yt.qdl() == null) {
            yt.ud(context);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo
    public void lnr(ljh ljhVar) {
        if (qdl() == null) {
            return;
        }
        if (ud(ljhVar)) {
            this.lnr.set(true);
            ljhVar.mzz(true);
            return;
        }
        if (qdl(ljhVar)) {
            ljhVar.mzz(true);
            return;
        }
        if (qdl(ljhVar, false)) {
            return;
        }
        if (mml(ljhVar)) {
            ljhVar.mzz(true);
        } else {
            if (ljhVar.fhs() != null || ljhVar.od() == null) {
                return;
            }
            fco.qdl(qdl(), ljhVar.od(), ljhVar, gy.qdl(this.qdl), this.qdl, true);
            ljhVar.mzz(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo
    public boolean mml(ljh ljhVar) {
        if (ljhVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.mo moVarFhs = ljhVar.fhs();
        this.lnr.set(true);
        return moVarFhs != null && qdl(qdl(), ljhVar, moVarFhs.qdl(), moVarFhs.lnr());
    }

    @Override // com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo
    public boolean qdl(ljh ljhVar) {
        return false;
    }

    public boolean ud(ljh ljhVar) {
        com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar, this.qdl, 1, null);
        if (ljhVar.bo() == null) {
            com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar, this.qdl, -1, null);
            return false;
        }
        String strQdl = ljhVar.bo().qdl();
        if (TextUtils.isEmpty(strQdl)) {
            com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar, this.qdl, -2, ljhVar.bo().mml());
        } else {
            Uri uri = Uri.parse(strQdl);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            gy.ud udVarQdl = gy.qdl(qdl(), intent);
            if (udVarQdl.ud > 0) {
                if (!(qdl() instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                try {
                    HashMap map = new HashMap();
                    qdl(ljhVar, map);
                    map.put("matched_count", Integer.valueOf(udVarQdl.ud));
                    map.put("url", strQdl);
                    ComponentName componentName = udVarQdl.qdl;
                    if (componentName != null) {
                        intent.setComponent(componentName);
                    }
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, this.qdl, "open_url_app", map);
                    qdl().startActivity(intent);
                    exu.qdl().qdl(map).qdl(ljhVar, this.qdl);
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl("dp_start_act_success", ljhVar, this.qdl, map);
                    return true;
                } catch (Throwable th) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(g.f39715A, th.getMessage());
                        jSONObject.put("intent", intent.toString());
                        jSONObject.put("can_query_install", 1);
                    } catch (Exception unused) {
                    }
                    com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar, this.qdl, -4, jSONObject);
                }
            } else {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("intent", intent.toString());
                    jSONObject2.put("can_query_install", 1);
                } catch (Exception unused2) {
                }
                com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar, this.qdl, -3, jSONObject2);
            }
        }
        if (this.ud && !this.lnr.get()) {
            return false;
        }
        this.ud = true;
        Map<String, Object> map2 = new HashMap<>();
        qdl(ljhVar, map2);
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, this.qdl, "open_fallback_url", map2);
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo
    public void qdl(boolean z2) {
        this.mo = z2;
    }

    @Override // com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo
    public void qdl(int i2) {
        this.mml = i2;
    }

    public boolean qdl(Context context, ljh ljhVar, String str, String str2) {
        return qdl(context, str, str2, this.qdl, ljhVar);
    }

    public static boolean qdl(Context context, String str, String str2, String str3, ljh ljhVar) {
        if (lnr.qdl()) {
            return mzz.qdl(context, str, str2, str3, ljhVar);
        }
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

    public Context qdl() {
        WeakReference<Context> weakReference = this.mzz;
        return (weakReference == null || weakReference.get() == null) ? yt.qdl() : this.mzz.get();
    }

    private void qdl(ljh ljhVar, Map<String, Object> map) {
        if (ljhVar != null && ljhVar.ikv() == 0) {
            map.put("auto_click", Boolean.valueOf(!ljhVar.bjy()));
        }
        if (ljhVar != null && ljhVar.ikv() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.mml >= 11));
        }
        map.put("can_query_install", 1);
    }

    public boolean qdl(ljh ljhVar, boolean z2) {
        IPMiBroadcastReceiver iPMiBroadcastReceiverQdl;
        if (ljhVar != null) {
            try {
                koa koaVarGjm = ljhVar.gjm();
                if (koaVarGjm != null && !TextUtils.isEmpty(koaVarGjm.tvp())) {
                    if (koaVarGjm.wd() && ljhVar.fhs() != null && !TextUtils.isEmpty(ljhVar.fhs().lnr()) && (iPMiBroadcastReceiverQdl = IPMiBroadcastReceiver.qdl(qdl())) != null) {
                        iPMiBroadcastReceiverQdl.qdl(ljhVar.fhs().lnr(), ljhVar);
                    }
                    final boolean zQdl = ud.qdl(qdl(), koaVarGjm.tvp(), ljhVar);
                    com.bytedance.sdk.openadsdk.utils.fco.ud(new jpc("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.exc.qdl.qdl.mml.1
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
}
