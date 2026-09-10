package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.m1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0453m1 implements InterfaceC0471n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IronSource.a f29216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f29218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f29219f;

    /* JADX INFO: renamed from: com.ironsource.m1$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29220a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29221b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f29222c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f29223d = 1;

        private a() {
        }
    }

    public C0453m1(String version, String instanceId, IronSource.a adFormat, boolean z10, boolean z11, boolean z12) {
        kotlin.jvm.internal.n.f(version, "version");
        kotlin.jvm.internal.n.f(instanceId, "instanceId");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        this.f29214a = version;
        this.f29215b = instanceId;
        this.f29216c = adFormat;
        this.f29217d = z10;
        this.f29218e = z11;
        this.f29219f = z12;
    }

    @Override // com.ironsource.InterfaceC0471n1
    public ArrayList<InterfaceC0507p1> a() {
        ArrayList<InterfaceC0507p1> arrayList = new ArrayList<>();
        arrayList.add(new C0489o1.v(this.f29214a));
        arrayList.add(new C0489o1.x(this.f29215b));
        arrayList.add(new C0489o1.a(this.f29216c));
        if (this.f29217d) {
            arrayList.add(new C0489o1.p(1));
        }
        if (this.f29218e) {
            arrayList.add(new C0489o1.e(1));
        }
        if (this.f29219f) {
            arrayList.add(new C0489o1.o(1));
        }
        return arrayList;
    }

    public /* synthetic */ C0453m1(String str, String str2, IronSource.a aVar, boolean z10, boolean z11, boolean z12, int i10, kotlin.jvm.internal.g gVar) {
        this(str, str2, aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? true : z11, (i10 & 32) != 0 ? true : z12);
    }
}
