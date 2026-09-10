package com.ironsource;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ke implements Je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f26455a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26456a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f26457b = "sessionNumber";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f26458c = "firstSessionTimestamp";

        private a() {
        }
    }

    public Ke() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.Le
    public void a(Context context, int i10) {
        kotlin.jvm.internal.n.f(context, "context");
        this.f26455a.a(context, a.f26457b, i10);
    }

    @Override // com.ironsource.Le
    public int b(Context context, int i10) {
        kotlin.jvm.internal.n.f(context, "context");
        return this.f26455a.b(context, a.f26457b, i10);
    }

    public Ke(K8 sdkSharedPref) {
        kotlin.jvm.internal.n.f(sdkSharedPref, "sdkSharedPref");
        this.f26455a = sdkSharedPref;
    }

    @Override // com.ironsource.InterfaceC0538qe
    public long a(Context context, long j10) {
        kotlin.jvm.internal.n.f(context, "context");
        return this.f26455a.b(context, "firstSessionTimestamp", j10);
    }

    @Override // com.ironsource.InterfaceC0538qe
    public void b(Context context, long j10) {
        kotlin.jvm.internal.n.f(context, "context");
        this.f26455a.a(context, "firstSessionTimestamp", j10);
    }

    public /* synthetic */ Ke(K8 k8, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? new Me() : k8);
    }
}
