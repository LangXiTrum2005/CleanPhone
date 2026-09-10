package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.xc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0661xc implements Ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31066a;

    /* JADX INFO: renamed from: com.ironsource.xc$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31067a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f31068b = "IronSource";

        private a() {
        }
    }

    public C0661xc(String networkInstanceId) {
        kotlin.jvm.internal.n.f(networkInstanceId, "networkInstanceId");
        this.f31066a = networkInstanceId;
    }

    @Override // com.ironsource.Ed
    public String value() {
        if (this.f31066a.length() == 0) {
            return "";
        }
        return (kotlin.jvm.internal.n.a(this.f31066a, "0") || kotlin.jvm.internal.n.a(this.f31066a, "IronSource")) ? "IronSource" : defpackage.e.n("IronSource_", this.f31066a);
    }
}
