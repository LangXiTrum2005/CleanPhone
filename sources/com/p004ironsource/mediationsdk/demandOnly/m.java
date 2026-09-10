package com.p004ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.p004ironsource.a3;
import com.p004ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.p004ironsource.mediationsdk.AbstractAdapter;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.d;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mk;
import com.p004ironsource.q9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f25860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected a3 f25861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected JSONObject f25862c;
    private a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f25863e;
    long f;
    protected String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected JSONObject f25864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected List<String> f25865i;
    protected String j;
    private final Object k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f25866l = new Object();
    protected final IronSource.AD_UNIT m;

    public enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public m(a3 a3Var, AbstractAdapter abstractAdapter) {
        this.f25861b = a3Var;
        this.m = a3Var.b();
        this.f25860a = abstractAdapter;
        JSONObject jSONObjectC = a3Var.c();
        this.f25862c = jSONObjectC;
        try {
            jSONObjectC.put(IronSourceLoadParameters.Constants.DEMAND_ONLY, true);
        } catch (JSONException e2) {
            q9.d().a(e2);
        }
        this.d = a.NOT_LOADED;
        this.f25863e = null;
        this.g = "";
        this.f25864h = null;
        this.f25865i = new ArrayList();
    }

    public a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.k) {
            try {
                aVar2 = this.d;
                if (Arrays.asList(aVarArr).contains(this.d)) {
                    b(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar2;
    }

    public void b(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.f25861b.f() + ": current state=" + this.d + ", new state=" + aVar);
        synchronized (this.k) {
            this.d = aVar;
        }
    }

    public a3 f() {
        return this.f25861b;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.f25861b.f();
    }

    public int i() {
        return this.f25861b.d();
    }

    public Map<String, Object> j() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f25860a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f25860a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f25861b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f25861b.a());
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            map.put("instanceType", Integer.valueOf(this.f25861b.d()));
            if (!TextUtils.isEmpty(this.g)) {
                map.put("auctionId", this.g);
            }
            JSONObject jSONObject = this.f25864h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.f25864h);
            }
            if (!TextUtils.isEmpty(this.j)) {
                map.put("dynamicDemandSource", this.j);
            }
            if (o()) {
                map.put("isOneFlow", 1);
                return map;
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + h() + ")", e2);
        }
        return map;
    }

    public String k() {
        a aVar = this.d;
        return aVar == null ? AbstractJsonLexerKt.NULL : aVar.toString();
    }

    public String l() {
        return this.f25861b.i();
    }

    public List<String> m() {
        return this.f25865i;
    }

    public boolean n() {
        return this.f25861b.j();
    }

    public boolean o() {
        return this.f25862c.optBoolean("isOneFlow", false);
    }

    public void p() {
        synchronized (this.f25866l) {
            try {
                Timer timer = this.f25863e;
                if (timer != null) {
                    timer.cancel();
                    this.f25863e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str) {
        this.g = str;
    }

    public void b(String str) {
        this.j = d.b().c(str);
    }

    public void a(List<String> list, String str, int i2, String str2, String str3) {
        Iterator it = ((List) mk.a((ArrayList) list, new ArrayList())).iterator();
        while (it.hasNext()) {
            String str4 = str;
            int i3 = i2;
            d.b().a(str3, str4, d.b().a((String) it.next(), str4, i3, str2, "", "", "", ""));
            str = str4;
            i2 = i3;
        }
    }

    public void a(TimerTask timerTask) {
        synchronized (this.f25866l) {
            p();
            Timer timer = new Timer();
            this.f25863e = timer;
            timer.schedule(timerTask, this.f);
        }
    }

    public void a(JSONObject jSONObject) {
        this.f25864h = jSONObject;
    }

    public void a(boolean z2) {
        try {
            this.f25862c.put("isOneFlow", z2);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.verbose("Can't set isOneFlow = " + z2 + ". Error: " + e2.getMessage());
        }
    }

    public boolean a(a aVar) {
        boolean z2;
        synchronized (this.k) {
            z2 = this.d == aVar;
        }
        return z2;
    }

    public boolean a(a aVar, a aVar2) {
        synchronized (this.k) {
            try {
                if (this.d != aVar) {
                    return false;
                }
                b(aVar2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
