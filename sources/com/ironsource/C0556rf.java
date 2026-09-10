package com.ironsource;

import android.content.Context;

/* JADX INFO: renamed from: com.ironsource.rf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0556rf implements B3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30177d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30178e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f30179f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final K8 f30182c;

    /* JADX INFO: renamed from: com.ironsource.rf$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public C0556rf(Context context, String baseName, K8 sdkSharedPref) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(baseName, "baseName");
        kotlin.jvm.internal.n.f(sdkSharedPref, "sdkSharedPref");
        this.f30180a = context;
        this.f30181b = baseName;
        this.f30182c = sdkSharedPref;
    }

    @Override // com.ironsource.B3
    public void a(String identifier, int i10) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        this.f30182c.a(this.f30180a, new C0574sf(identifier, wi.d.h(this.f30181b, ".show_count_show_counter")).a(), i10);
    }

    @Override // com.ironsource.B3
    public Long b(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        return a(Long.valueOf(this.f30182c.b(this.f30180a, new C0574sf(identifier, wi.d.h(this.f30181b, ".pacing_last_show_time")).a(), -1L)));
    }

    @Override // com.ironsource.B3
    public Integer c(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        return a(Integer.valueOf(this.f30182c.b(this.f30180a, new C0574sf(identifier, wi.d.h(this.f30181b, ".show_count_show_counter")).a(), -1)));
    }

    public /* synthetic */ C0556rf(Context context, String str, K8 k8, int i10, kotlin.jvm.internal.g gVar) {
        this(context, str, (i10 & 4) != 0 ? new Me() : k8);
    }

    @Override // com.ironsource.B3
    public void a(String identifier, long j10) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        this.f30182c.a(this.f30180a, new C0574sf(identifier, wi.d.h(this.f30181b, ".pacing_last_show_time")).a(), j10);
    }

    @Override // com.ironsource.B3
    public void b(String identifier, long j10) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        this.f30182c.a(this.f30180a, new C0574sf(identifier, wi.d.h(this.f30181b, ".show_count_threshold")).a(), j10);
    }

    @Override // com.ironsource.B3
    public Long a(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        return a(Long.valueOf(this.f30182c.b(this.f30180a, new C0574sf(identifier, wi.d.h(this.f30181b, ".show_count_threshold")).a(), -1L)));
    }

    private final Long a(Long l) {
        if (l != null && l.longValue() == -1) {
            return null;
        }
        return l;
    }

    private final Integer a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }
}
