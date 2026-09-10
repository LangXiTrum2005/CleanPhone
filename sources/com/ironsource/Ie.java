package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ie implements J8, J8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Je f26301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0681ye f26302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0510p4 f26303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f26305e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26306a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f26307b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f26308c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f26309d = -1;

        private a() {
        }
    }

    public Ie(Je storage, InterfaceC0681ye initResponseStorage, InterfaceC0510p4 currentTimeProvider) {
        kotlin.jvm.internal.n.f(storage, "storage");
        kotlin.jvm.internal.n.f(initResponseStorage, "initResponseStorage");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        this.f26301a = storage;
        this.f26302b = initResponseStorage;
        this.f26303c = currentTimeProvider;
        this.f26304d = -1;
        this.f26305e = -1L;
    }

    private final int b(Context context, Je je2) {
        int iB = je2.b(context, 0) + 1;
        je2.a(context, iB);
        return iB;
    }

    @Override // com.ironsource.J8.a
    public void a(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        this.f26304d = b(context, this.f26301a);
        this.f26305e = a(context, this.f26301a);
    }

    @Override // com.ironsource.J8
    public int c() {
        return this.f26304d;
    }

    private final long a(Context context, Je je2) {
        long jA = je2.a(context, -1L);
        if (this.f26302b.a(context) || jA != -1) {
            return jA;
        }
        long jA2 = this.f26303c.a();
        IronLog.INTERNAL.verbose("set first session timestamp = " + jA2);
        je2.b(context, jA2);
        return jA2;
    }

    @Override // com.ironsource.J8
    public String b() {
        String strD = IronSourceUtils.d();
        kotlin.jvm.internal.n.e(strD, "getSessionId()");
        return strD;
    }

    public /* synthetic */ Ie(Je je2, InterfaceC0681ye interfaceC0681ye, InterfaceC0510p4 interfaceC0510p4, int i10, kotlin.jvm.internal.g gVar) {
        this(je2, (i10 & 2) != 0 ? new C0699ze() : interfaceC0681ye, (i10 & 4) != 0 ? new InterfaceC0510p4.a() : interfaceC0510p4);
    }

    @Override // com.ironsource.J8
    public long a() {
        return this.f26305e;
    }
}
