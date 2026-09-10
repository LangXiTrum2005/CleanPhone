package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.O6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class r3 implements r0.e {
    private static WeakReference l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicBoolean f9156m = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f9157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f9158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f9159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q3 f9160d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f9163g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f9166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b0 f9167k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f9161e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f9162f = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f9164h = 2;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.p.g("AppLovinSdk", "Started mediation debugger");
                if (!r3.this.c() || r3.l.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = r3.l = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(r3.this.f9160d, r3.this.f9157a.e());
                }
                r3.f9156m.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.p.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = r3.l = null;
            }
        }
    }

    public r3(com.applovin.impl.sdk.l lVar) {
        this.f9157a = lVar;
        this.f9158b = lVar.Q();
        Context contextP = com.applovin.impl.sdk.l.p();
        this.f9159c = contextP;
        q3 q3Var = new q3(contextP);
        this.f9160d = q3Var;
        this.f9167k = new b0(lVar, q3Var);
    }

    private void f() {
        this.f9157a.e().a(new a());
    }

    public void e() {
        if (this.f9162f.compareAndSet(false, true)) {
            this.f9157a.s0().a((k5) new y5(this, this.f9157a), f6.b.OTHER);
        }
    }

    public boolean g() {
        return this.f9163g;
    }

    public void h() {
        a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f9160d + "}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        WeakReference weakReference = l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Activity activityW0 = this.f9157a.w0();
        if (activityW0 == null || activityW0.isFinishing()) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        } else {
            new AlertDialog.Builder(activityW0).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new ba(this, 0)).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    public void a(boolean z10, int i10) {
        this.f9163g = z10;
        this.f9164h = i10;
    }

    public void a(Map map) {
        this.f9166j = map;
        e();
        if (!c() && f9156m.compareAndSet(false, true)) {
            if (!this.f9165i) {
                f();
                this.f9165i = true;
            }
            Intent intent = new Intent(this.f9159c, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            com.applovin.impl.sdk.p.g("AppLovinSdk", "Starting mediation debugger...");
            this.f9159c.startActivity(intent);
            return;
        }
        com.applovin.impl.sdk.p.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    public List a(String str) {
        Map map = this.f9166j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f9166j.get(str);
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g3 g3Var = (g3) it.next();
            if (g3Var.z() && g3Var.q() == g3.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new aa(this, 0), TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i10) {
        h();
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        JSONArray jSONArrayX = defpackage.e.x(O6.E1, jSONObject);
        ArrayList arrayList = new ArrayList(jSONArrayX.length());
        for (int i10 = 0; i10 < jSONArrayX.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayX, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                g3 g3Var = new g3(jSONObject2, lVar);
                arrayList.add(g3Var);
                this.f9161e.put(g3Var.b(), g3Var);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject, List list, com.applovin.impl.sdk.l lVar) {
        JSONArray jSONArrayX = defpackage.e.x("ad_units", jSONObject);
        ArrayList arrayList = new ArrayList(jSONArrayX.length());
        for (int i10 = 0; i10 < jSONArrayX.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayX, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new n(jSONObject2, this.f9161e, lVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(List list, com.applovin.impl.sdk.l lVar) {
        List<String> adUnitIds = lVar.L() != null ? lVar.L().getAdUnitIds() : null;
        if (adUnitIds != null && !adUnitIds.isEmpty()) {
            ArrayList arrayList = new ArrayList(adUnitIds.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (adUnitIds.contains(nVar.c())) {
                    arrayList.add(nVar);
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            a0 a0Var = new a0(str);
            if (a0Var.h()) {
                arrayList.add(a0Var);
            } else if (com.applovin.impl.sdk.p.a()) {
                this.f9158b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.r0.e
    public void a(String str, JSONObject jSONObject, int i10) {
        List listA = a(jSONObject, this.f9157a);
        List listA2 = a(jSONObject, listA, this.f9157a);
        List listA3 = a(listA2, this.f9157a);
        List listA4 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f9160d.a(listA, listA2, listA3, listA4, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f9157a);
        if (!listA4.isEmpty()) {
            this.f9167k.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new aa(this, 1), TimeUnit.SECONDS.toMillis(this.f9164h));
        } else {
            a(listA);
        }
    }

    @Override // com.applovin.impl.r0.e
    public void a(String str, int i10, String str2, JSONObject jSONObject) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9158b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i10);
        }
        com.applovin.impl.sdk.p.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f9157a.E().a("fetchMediationDebuggerInfo", str, i10, str2);
        this.f9160d.a(null, null, null, null, null, null, null, false, this.f9157a);
        this.f9162f.set(false);
    }
}
