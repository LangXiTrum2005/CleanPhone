package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z6 implements V6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f28096a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f28098b = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f28100d = 24;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28097a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f28099c = EnumC0244a7.SendEvent.b();

        private a() {
        }

        public final int a() {
            return f28099c;
        }
    }

    public Z6(JSONObject jSONObject) {
        this.f28096a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.V6
    public long a() {
        return ((long) this.f28096a.optInt("timeout", 24)) * 1000;
    }

    @Override // com.ironsource.U5
    public boolean b() {
        return this.f28096a.optBoolean(com.ironsource.mediationsdk.metadata.a.f29613j, false);
    }

    @Override // com.ironsource.V6
    public EnumC0244a7 c() {
        return EnumC0244a7.f28175b.a(this.f28096a.optInt(X3.f.f27739e, a.f28097a.a()));
    }
}
