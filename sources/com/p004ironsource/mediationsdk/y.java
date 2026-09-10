package com.p004ironsource.mediationsdk;

import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.a3;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.hi;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.q9;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class y implements hi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f26149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected a3 f26150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26151c;
    protected JSONObject d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f26152e;
    protected int f;
    protected Long g = null;

    public y(a3 a3Var, AbstractAdapter abstractAdapter) {
        this.f26150b = a3Var;
        this.f26149a = abstractAdapter;
        this.d = a3Var.c();
    }

    public void a(String str) {
        a(str, 0);
    }

    @Override // com.ironsource.hi.b
    public int b() {
        return this.f26150b.e();
    }

    @Override // com.ironsource.hi.b
    public String c() {
        return this.f26150b.f();
    }

    public abstract IronSource.AD_UNIT d();

    public Long e() {
        return this.g;
    }

    public String f() {
        return a.m(i(), " ", hashCode());
    }

    public int g() {
        return this.f26150b.d();
    }

    public boolean h() {
        return this.f26151c;
    }

    public String i() {
        return this.f26150b.h().isMultipleInstances() ? this.f26150b.h().getProviderTypeForReflection() : this.f26150b.h().getProviderName();
    }

    public String j() {
        return this.f26150b.g();
    }

    public abstract String k();

    public int l() {
        return 1;
    }

    public Map<String, Object> m() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f26149a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f26149a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f26150b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f26150b.a());
            map.put("instanceType", Integer.valueOf(p() ? 2 : 1));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(l()));
            if (!TextUtils.isEmpty(this.f26152e)) {
                map.put("dynamicDemandSource", this.f26152e);
                return map;
            }
        } catch (Throwable th) {
            q9.d().a(th);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + c() + ")", th);
        }
        return map;
    }

    public int n() {
        return this.f;
    }

    public boolean o() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        try {
            if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !this.f26149a.isUsingActivityBeforeImpression(d())) {
                return false;
            }
            ironLog.verbose(c() + " - is using activity before impression and activity is null");
            return true;
        } catch (Throwable th) {
            StringBuilder sbP = com.google.firebase.crashlytics.internal.model.a.p("Exception while calling adapter.isUsingActivityBeforeImpression() - ", th);
            sbP.append(th.getLocalizedMessage());
            b(sbP.toString());
            return true;
        }
    }

    public boolean p() {
        return this.f26150b.j();
    }

    public void q() {
        try {
            AbstractAdapter abstractAdapter = this.f26149a;
            if (abstractAdapter != null) {
                abstractAdapter.releaseMemory(this.f26150b.b(), this.d);
            }
        } catch (Throwable th) {
            q9.d().a(th);
            IronLog.INTERNAL.error("exception - " + th.getMessage());
        }
        this.f26149a = null;
    }

    public boolean r() {
        if (o()) {
            return false;
        }
        return p() || s();
    }

    public boolean s() {
        return this.f26150b.k();
    }

    private void a(String str, int i2) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + " " + c() + " : " + str, i2);
    }

    public void b(String str) {
        a(str, 3);
    }

    public void c(String str) {
        this.f26152e = d.b().c(str);
    }

    public void a(boolean z2) {
        this.f26151c = z2;
    }
}
