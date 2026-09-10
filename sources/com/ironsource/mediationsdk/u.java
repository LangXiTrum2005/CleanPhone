package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.C0310e1;
import com.ironsource.C0474n4;
import com.ironsource.If;
import com.ironsource.L8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u implements L8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f29722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected C0310e1 f29723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected JSONObject f29725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f29726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f29727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Long f29728g = null;

    public u(C0310e1 c0310e1, AbstractAdapter abstractAdapter) {
        this.f29723b = c0310e1;
        this.f29722a = abstractAdapter;
        this.f29725d = c0310e1.c();
    }

    public abstract IronSource.a a();

    public void a(boolean z10) {
        this.f29724c = z10;
    }

    @Override // com.ironsource.L8.b
    public int b() {
        return this.f29723b.e();
    }

    @Override // com.ironsource.L8.b
    public String c() {
        return this.f29723b.f();
    }

    public Long d() {
        return this.f29728g;
    }

    public String e() {
        return h() + " " + hashCode();
    }

    public int f() {
        return this.f29723b.d();
    }

    public boolean g() {
        return this.f29724c;
    }

    public String h() {
        return this.f29723b.h().isMultipleInstances() ? this.f29723b.h().getProviderTypeForReflection() : this.f29723b.h().getProviderName();
    }

    public String i() {
        return this.f29723b.g();
    }

    public abstract String j();

    public int k() {
        return 1;
    }

    public Map<String, Object> l() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f29722a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f29722a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f29723b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f29723b.a());
            map.put("instanceType", Integer.valueOf(o() ? 2 : 1));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(k()));
            if (!TextUtils.isEmpty(this.f29726e)) {
                map.put("dynamicDemandSource", this.f29726e);
            }
            return map;
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + c() + ")", th2);
            return map;
        }
    }

    public int m() {
        return this.f29727f;
    }

    public boolean n() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        try {
            if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !this.f29722a.isUsingActivityBeforeImpression(If.a(a()))) {
                return false;
            }
            ironLog.verbose(c() + " - is using activity before impression and activity is null");
            return true;
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            b("Exception while calling adapter.isUsingActivityBeforeImpression() - " + th2.getLocalizedMessage());
            return true;
        }
    }

    public boolean o() {
        return this.f29723b.j();
    }

    public void p() {
        this.f29722a = null;
    }

    public boolean q() {
        if (n()) {
            return false;
        }
        return o() || r();
    }

    public boolean r() {
        return this.f29723b.k();
    }

    public void a(String str) {
        a(str, 0);
    }

    public void b(String str) {
        a(str, 3);
    }

    public void c(String str) {
        this.f29726e = d.b().c(str);
    }

    private void a(String str, int i10) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, j() + " " + c() + " : " + str, i10);
    }
}
