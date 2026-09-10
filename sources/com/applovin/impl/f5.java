package com.applovin.impl;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class f5 extends m3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c3 f7904k;

    public f5(c3 c3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        super(c3Var.e(), jSONObject, jSONObject2, lVar);
        this.f7904k = c3Var;
    }

    public boolean A() {
        return a("use_cached_adapter", Boolean.TRUE).booleanValue();
    }

    public d5.b t() {
        return d5.b.values()[a("signal_cache_level", ((Integer) this.f8395a.a(t3.V7)).intValue())];
    }

    @Override // com.applovin.impl.m3
    public String toString() {
        return "SignalProviderSpec{adObject=" + a() + '}';
    }

    public c3 u() {
        return this.f7904k;
    }

    public long v() {
        return a("signal_expiration_ms", ((Long) this.f8395a.a(t3.U7)).longValue());
    }

    public boolean w() {
        return a("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean x() {
        return a("prefer_collect_signal_when_initialized", Boolean.TRUE).booleanValue();
    }

    public boolean y() {
        return a("fail_collection_for_empty_signal", (Boolean) this.f8395a.a(t3.E8)).booleanValue();
    }

    public boolean z() {
        return a("ignore_init_failure", Boolean.FALSE).booleanValue();
    }
}
