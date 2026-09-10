package com.bytedance.sdk.openadsdk.brP.Lxb.Lxb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.HD;
import com.bytedance.sdk.openadsdk.core.model.JVA;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.xan;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JXs implements lc {
    public static Boolean Lxb;
    private static Boolean lc;
    protected int JXs;
    protected com.bytedance.sdk.openadsdk.core.model.lk LD;
    protected String ZU;
    private final WeakReference<Context> ebl;
    protected tD lk;

    public JXs(Context context, tD tDVar, String str) {
        this.ebl = new WeakReference<>(context);
        this.lk = tDVar;
        this.LD = tDVar.MGT();
        this.ZU = str;
        "====tag===".concat(String.valueOf(str));
        if (kqm.Lxb() == null) {
            kqm.LD(context);
        }
    }

    private static boolean ebl() {
        if (lc == null) {
            lc = Boolean.valueOf(nJ.OY(kqm.Lxb()));
        }
        return lc.booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc
    public boolean JXs() {
        return this.LD != null && Lxb(LD(), this.LD.Lxb(), this.LD.lk());
    }

    public Context LD() {
        WeakReference<Context> weakReference = this.ebl;
        return (weakReference == null || weakReference.get() == null) ? kqm.Lxb() : this.ebl.get();
    }

    @Override // com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc
    public void Lxb(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc
    public void ZU() {
        if (LD() == null) {
            return;
        }
        if (lk()) {
            this.lk.lk(true);
            return;
        }
        if (Lxb()) {
            this.lk.lk(true);
            return;
        }
        if (lc()) {
            return;
        }
        if (JXs()) {
            this.lk.lk(true);
        } else {
            if (this.lk.MGT() != null || this.lk.Sv() == null) {
                return;
            }
            xan.Lxb(LD(), this.lk.Sv(), this.lk, nJ.Lxb(this.ZU), this.ZU, true);
            this.lk.lk(true);
        }
    }

    public boolean lc() {
        HD hdWVT;
        IPMiBroadcastReceiver iPMiBroadcastReceiverLxb;
        try {
            tD tDVar = this.lk;
            if (tDVar == null || (hdWVT = tDVar.wVT()) == null || TextUtils.isEmpty(hdWVT.LD())) {
                return false;
            }
            if (hdWVT.Lxb() && this.lk.MGT() != null && !TextUtils.isEmpty(this.lk.MGT().lk()) && (iPMiBroadcastReceiverLxb = IPMiBroadcastReceiver.Lxb(LD())) != null) {
                iPMiBroadcastReceiverLxb.Lxb(this.lk.MGT().lk(), this.lk);
            }
            Context contextLD = LD();
            String strLD = hdWVT.LD();
            tD tDVar2 = this.lk;
            final boolean zLxb = lk.Lxb(contextLD, strLD, tDVar2, nJ.LD(tDVar2), null, true);
            hg.LD(new OY("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.JXs.1
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
            sLN.Lxb("GPDownLoader", th.getMessage());
            return false;
        }
    }

    public boolean lk() {
        com.bytedance.sdk.openadsdk.core.ZU.Lxb(this.lk, this.ZU, 1, null);
        JVA jvaNTb = this.lk.nTb();
        if (jvaNTb == null) {
            com.bytedance.sdk.openadsdk.core.ZU.Lxb(this.lk, this.ZU, -1, null);
            return false;
        }
        HashMap map = new HashMap();
        Lxb(map);
        String strLxb = jvaNTb.Lxb();
        Context contextLD = LD();
        tD tDVar = this.lk;
        if (lk.Lxb(contextLD, strLxb, tDVar, nJ.LD(tDVar), map, true)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.lk, this.ZU, "open_fallback_url", map);
        return false;
    }

    public static boolean Lxb(Context context, String str, String str2, String str3, tD tDVar) {
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

    public static boolean Lxb(tD tDVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent intentLxb;
        if (tDVar != null && tDVar.bm() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (intentLxb = nJ.Lxb(context, str)) == null) {
                return false;
            }
            intentLxb.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                intentLxb.addFlags(268435456);
            }
            context.startActivity(intentLxb);
            if (map == null) {
                map = new HashMap<>();
            }
            if (tDVar != null && tDVar.qK() == 0) {
                map.put("auto_click", Boolean.valueOf(!tDVar.ZU()));
            }
            map.put("can_query_install", Integer.valueOf(ebl() ? 1 : 0));
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc
    public void Lxb(int i) {
        this.JXs = i;
    }

    public boolean Lxb(Context context, String str, String str2) {
        return Lxb(context, str, str2, this.ZU, this.lk);
    }

    private void Lxb(Map<String, Object> map) {
        tD tDVar = this.lk;
        if (tDVar != null && tDVar.qK() == 0) {
            tD tDVar2 = this.lk;
            map.put("auto_click", Boolean.valueOf((tDVar2 == null || tDVar2.ZU()) ? false : true));
        }
        tD tDVar3 = this.lk;
        if (tDVar3 != null && tDVar3.qK() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.JXs >= 11));
        }
        map.put("can_query_install", Integer.valueOf(ebl() ? 1 : 0));
    }

    @Override // com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc
    public boolean Lxb() {
        if (this.LD == null) {
            return false;
        }
        tD tDVar = this.lk;
        if (tDVar != null && tDVar.bm() == 0) {
            return false;
        }
        String strLk = this.LD.lk();
        if (TextUtils.isEmpty(strLk)) {
            return false;
        }
        Context contextLD = LD();
        if (ebl() && !nJ.LD(contextLD, strLk)) {
            return false;
        }
        return Lxb(this.lk, strLk, contextLD, this.ZU, new HashMap());
    }
}
