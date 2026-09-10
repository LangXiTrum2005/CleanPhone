package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.C0310e1;
import com.ironsource.C0474n4;
import com.ironsource.Z9;
import com.ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f29485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected C0310e1 f29486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected JSONObject f29487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f29488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f29489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f29490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f29491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected JSONObject f29492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected List<String> f29493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f29494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f29495k = new Object();
    private final Object l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final IronSource.a f29496m;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public m(C0310e1 c0310e1, AbstractAdapter abstractAdapter) {
        this.f29486b = c0310e1;
        this.f29496m = c0310e1.b();
        this.f29485a = abstractAdapter;
        JSONObject jSONObjectC = c0310e1.c();
        this.f29487c = jSONObjectC;
        try {
            jSONObjectC.put(IronSourceLoadParameters.Constants.DEMAND_ONLY, true);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
        }
        this.f29488d = a.NOT_LOADED;
        this.f29489e = null;
        this.f29491g = "";
        this.f29492h = null;
        this.f29493i = new ArrayList();
    }

    public boolean a(a aVar, a aVar2) {
        synchronized (this.f29495k) {
            try {
                if (this.f29488d != aVar) {
                    return false;
                }
                b(aVar2);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.f29486b.f() + ": current state=" + this.f29488d + ", new state=" + aVar);
        synchronized (this.f29495k) {
            this.f29488d = aVar;
        }
    }

    public C0310e1 f() {
        return this.f29486b;
    }

    public String g() {
        return this.f29491g;
    }

    public String h() {
        return this.f29486b.f();
    }

    public int i() {
        return this.f29486b.d();
    }

    public Map<String, Object> j() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f29485a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f29485a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f29486b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f29486b.a());
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            map.put("instanceType", Integer.valueOf(this.f29486b.d()));
            if (!TextUtils.isEmpty(this.f29491g)) {
                map.put("auctionId", this.f29491g);
            }
            JSONObject jSONObject = this.f29492h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.f29492h);
            }
            if (!TextUtils.isEmpty(this.f29494j)) {
                map.put("dynamicDemandSource", this.f29494j);
            }
            if (o()) {
                map.put("isOneFlow", 1);
            }
            return map;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + h() + ")", e10);
            return map;
        }
    }

    public String k() {
        a aVar = this.f29488d;
        return aVar == null ? "null" : aVar.toString();
    }

    public String l() {
        return this.f29486b.i();
    }

    public List<String> m() {
        return this.f29493i;
    }

    public boolean n() {
        return this.f29486b.j();
    }

    public boolean o() {
        return this.f29487c.optBoolean("isOneFlow", false);
    }

    public void p() {
        synchronized (this.l) {
            try {
                Timer timer = this.f29489e;
                if (timer != null) {
                    timer.cancel();
                    this.f29489e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.f29495k) {
            try {
                aVar2 = this.f29488d;
                if (Arrays.asList(aVarArr).contains(this.f29488d)) {
                    b(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar2;
    }

    public void b(String str) {
        this.f29494j = com.ironsource.mediationsdk.d.b().c(str);
    }

    public boolean a(a aVar) {
        boolean z10;
        synchronized (this.f29495k) {
            z10 = this.f29488d == aVar;
        }
        return z10;
    }

    public void a(boolean z10) {
        try {
            this.f29487c.put("isOneFlow", z10);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.verbose("Can't set isOneFlow = " + z10 + ". Error: " + e10.getMessage());
        }
    }

    public void a(TimerTask timerTask) {
        synchronized (this.l) {
            p();
            Timer timer = new Timer();
            this.f29489e = timer;
            timer.schedule(timerTask, this.f29490f);
        }
    }

    public void a(String str) {
        this.f29491g = str;
    }

    public void a(JSONObject jSONObject) {
        this.f29492h = jSONObject;
    }

    public void a(List<String> list, String str, int i10, String str2, String str3) {
        Iterator it = ((List) Z9.a((ArrayList) list, new ArrayList())).iterator();
        while (it.hasNext()) {
            String str4 = str;
            com.ironsource.mediationsdk.d.b().a(str3, str4, com.ironsource.mediationsdk.d.b().a((String) it.next(), str4, i10, str2, "", "", "", ""));
            str = str4;
        }
    }
}
