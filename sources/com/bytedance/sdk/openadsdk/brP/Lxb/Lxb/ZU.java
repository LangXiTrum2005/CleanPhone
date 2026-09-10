package com.bytedance.sdk.openadsdk.brP.Lxb.Lxb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.ZU.sLN;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.HD;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.xan;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZU implements lc {
    protected tD LD;
    protected com.bytedance.sdk.openadsdk.core.model.lk Lxb;
    private final WeakReference<Context> ebl;
    protected int lc;
    protected String lk;
    protected boolean ZU = false;
    protected final AtomicBoolean JXs = new AtomicBoolean(false);
    private boolean OY = false;

    public ZU(Context context, tD tDVar, String str) {
        this.ebl = new WeakReference<>(context);
        this.LD = tDVar;
        this.Lxb = tDVar.MGT();
        this.lk = str;
        "====tag===".concat(String.valueOf(str));
        if (kqm.Lxb() == null) {
            kqm.LD(context);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc
    public boolean JXs() {
        this.JXs.set(true);
        return this.Lxb != null && Lxb(lk(), this.Lxb.Lxb(), this.Lxb.lk());
    }

    public boolean LD() {
        com.bytedance.sdk.openadsdk.core.ZU.Lxb(this.LD, this.lk, 1, null);
        if (this.LD.nTb() == null) {
            com.bytedance.sdk.openadsdk.core.ZU.Lxb(this.LD, this.lk, -1, null);
            return false;
        }
        String strLxb = this.LD.nTb().Lxb();
        if (TextUtils.isEmpty(strLxb)) {
            tD tDVar = this.LD;
            com.bytedance.sdk.openadsdk.core.ZU.Lxb(tDVar, this.lk, -2, tDVar.nTb().ZU());
        } else {
            Uri uri = Uri.parse(strLxb);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            nJ.LD LD = nJ.LD(lk(), intent);
            if (LD.LD > 0) {
                if (!(lk() instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                try {
                    HashMap map = new HashMap();
                    Lxb(map);
                    map.put("matched_count", Integer.valueOf(LD.LD));
                    map.put("url", strLxb);
                    ComponentName componentName = LD.Lxb;
                    if (componentName != null) {
                        intent.setComponent(componentName);
                    }
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.LD, this.lk, "open_url_app", map);
                    lk().startActivity(intent);
                    sLN.Lxb().Lxb(map).Lxb(this.LD, this.lk);
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb("dp_start_act_success", this.LD, this.lk, map);
                    return true;
                } catch (Throwable th) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("exception", th.getMessage());
                        jSONObject.put("intent", intent.toString());
                        jSONObject.put("can_query_install", 1);
                    } catch (Exception unused) {
                    }
                    com.bytedance.sdk.openadsdk.core.ZU.Lxb(this.LD, this.lk, -4, jSONObject);
                }
            } else {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("intent", intent.toString());
                    jSONObject2.put("can_query_install", 1);
                } catch (Exception unused2) {
                }
                com.bytedance.sdk.openadsdk.core.ZU.Lxb(this.LD, this.lk, -3, jSONObject2);
            }
        }
        if (this.ZU && !this.JXs.get()) {
            return false;
        }
        this.ZU = true;
        Map<String, Object> map2 = new HashMap<>();
        Lxb(map2);
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.LD, this.lk, "open_fallback_url", map2);
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc
    public void Lxb(boolean z) {
        this.OY = z;
    }

    @Override // com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc
    public void ZU() {
        if (lk() == null) {
            return;
        }
        if (LD()) {
            this.JXs.set(true);
            this.LD.lk(true);
            return;
        }
        if (Lxb()) {
            this.LD.lk(true);
            return;
        }
        if (lc()) {
            return;
        }
        if (JXs()) {
            this.LD.lk(true);
        } else {
            if (this.LD.MGT() != null || this.LD.Sv() == null) {
                return;
            }
            xan.Lxb(lk(), this.LD.Sv(), this.LD, nJ.Lxb(this.lk), this.lk, true);
            this.LD.lk(true);
        }
    }

    public boolean lc() {
        HD hdWVT;
        IPMiBroadcastReceiver iPMiBroadcastReceiverLxb;
        try {
            tD tDVar = this.LD;
            if (tDVar == null || (hdWVT = tDVar.wVT()) == null || TextUtils.isEmpty(hdWVT.LD())) {
                return false;
            }
            if (hdWVT.Lxb() && this.LD.MGT() != null && !TextUtils.isEmpty(this.LD.MGT().lk()) && (iPMiBroadcastReceiverLxb = IPMiBroadcastReceiver.Lxb(lk())) != null) {
                iPMiBroadcastReceiverLxb.Lxb(this.LD.MGT().lk(), this.LD);
            }
            final boolean zLxb = LD.Lxb(lk(), hdWVT.LD(), this.LD);
            hg.LD(new OY("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ZU.1
                @Override // java.lang.Runnable
                public void run() {
                    if (zLxb) {
                        QAg.Lxb("oem_store", "1");
                    } else {
                        QAg.Lxb("oem_store", "-2");
                    }
                }
            });
            return zLxb;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("GPDownLoader", th.getMessage());
            return false;
        }
    }

    public Context lk() {
        WeakReference<Context> weakReference = this.ebl;
        return (weakReference == null || weakReference.get() == null) ? kqm.Lxb() : this.ebl.get();
    }

    @Override // com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc
    public void Lxb(int i) {
        this.lc = i;
    }

    public boolean Lxb(Context context, String str, String str2) {
        return Lxb(context, str, str2, this.lk, this.LD);
    }

    public static boolean Lxb(Context context, String str, String str2, String str3, tD tDVar) {
        if (lk.Lxb()) {
            return JXs.Lxb(context, str, str2, str3, tDVar);
        }
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, str3, "store_open", (JSONObject) null);
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
                        com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, str3, "store_open", (JSONObject) null);
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

    private void Lxb(Map<String, Object> map) {
        tD tDVar = this.LD;
        if (tDVar != null && tDVar.qK() == 0) {
            tD tDVar2 = this.LD;
            map.put("auto_click", Boolean.valueOf((tDVar2 == null || tDVar2.ZU()) ? false : true));
        }
        tD tDVar3 = this.LD;
        if (tDVar3 != null && tDVar3.qK() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.lc >= 11));
        }
        map.put("can_query_install", 1);
    }

    @Override // com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc
    public boolean Lxb() {
        Intent intentLxb;
        if (this.Lxb == null) {
            return false;
        }
        tD tDVar = this.LD;
        if (tDVar != null && tDVar.bm() == 0) {
            return false;
        }
        String strLk = this.Lxb.lk();
        if (TextUtils.isEmpty(strLk) || !nJ.LD(lk(), strLk) || (intentLxb = nJ.Lxb(lk(), strLk)) == null) {
            return false;
        }
        intentLxb.putExtra("START_ONLY_FOR_ANDROID", true);
        try {
            lk().startActivity(intentLxb);
            HashMap map = new HashMap();
            Lxb(map);
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.LD, this.lk, "click_open", map);
            return true;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("GPDownLoader", th.getMessage());
            return false;
        }
    }
}
