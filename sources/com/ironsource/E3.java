package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class E3 implements InterfaceC0531q7, InterfaceC0531q7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xc f25993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0646wf f25994b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25995a;

        static {
            int[] iArr = new int[I3.values().length];
            try {
                iArr[I3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25995a = iArr;
        }
    }

    public E3() {
        this(null, null, null, 7, null);
    }

    @Override // com.ironsource.InterfaceC0531q7
    public synchronized G3 a(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        G3 g3A = this.f25993a.a(identifier);
        if (g3A.d()) {
            return g3A;
        }
        return this.f25994b.a(identifier);
    }

    @Override // com.ironsource.InterfaceC0531q7.a
    public synchronized void b(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        this.f25993a.b(identifier);
        this.f25994b.b(identifier);
    }

    public E3(InterfaceC0510p4 currentTimeProvider, J7 pacingDataRepository, Q8 showCountDataRepository) {
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.n.f(pacingDataRepository, "pacingDataRepository");
        kotlin.jvm.internal.n.f(showCountDataRepository, "showCountDataRepository");
        this.f25993a = new Xc(currentTimeProvider, pacingDataRepository);
        this.f25994b = new C0646wf(currentTimeProvider, showCountDataRepository);
    }

    @Override // com.ironsource.InterfaceC0531q7.a
    public synchronized Object a(String identifier, I3 cappingType, InterfaceC0495o7 cappingConfig) {
        Object objA;
        try {
            kotlin.jvm.internal.n.f(identifier, "identifier");
            kotlin.jvm.internal.n.f(cappingType, "cappingType");
            kotlin.jvm.internal.n.f(cappingConfig, "cappingConfig");
            int i10 = a.f25995a[cappingType.ordinal()];
            if (i10 == 1) {
                objA = this.f25993a.a(identifier, cappingType, cappingConfig);
            } else if (i10 == 2) {
                objA = this.f25994b.a(identifier, cappingType, cappingConfig);
            } else if (i10 == 3) {
                objA = wj.r.f53297a;
            } else {
                throw new aa.b((byte) 0, 20);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return objA;
    }

    public /* synthetic */ E3(InterfaceC0510p4 interfaceC0510p4, J7 j10, Q8 q10, int i10, kotlin.jvm.internal.g gVar) {
        interfaceC0510p4 = (i10 & 1) != 0 ? new InterfaceC0510p4.a() : interfaceC0510p4;
        if ((i10 & 2) != 0) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            kotlin.jvm.internal.n.e(applicationContext, "getInstance().applicationContext");
            j10 = new Zc(new C0556rf(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i10 & 4) != 0) {
            Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
            kotlin.jvm.internal.n.e(applicationContext2, "getInstance().applicationContext");
            q10 = new C0610uf(new C0556rf(applicationContext2, "capping_service", null, 4, null));
        }
        this(interfaceC0510p4, j10, q10);
    }
}
