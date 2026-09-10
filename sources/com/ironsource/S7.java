package com.ironsource;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum S7 {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27174b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27179a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001e  */
        /* JADX WARN: Code duplicated, block: B:15:0x0021 A[RETURN] */
        public final S7 a(Integer num) {
            for (S7 s10 : S7.values()) {
                int iB = s10.b();
                if (num != null && iB == num.intValue()) {
                    if (s10 == null) {
                        return S7.UnknownProvider;
                    }
                    return s10;
                }
            }
            s10 = null;
            if (s10 == null) {
                return S7.UnknownProvider;
            }
            return s10;
        }

        private a() {
        }

        public final S7 a(String dynamicDemandSourceId) {
            kotlin.jvm.internal.n.f(dynamicDemandSourceId, "dynamicDemandSourceId");
            List listI0 = an.h.I0(dynamicDemandSourceId, new String[]{"_"}, 0, 6);
            return listI0.size() < 2 ? S7.UnknownProvider : a(an.o.e0((String) listI0.get(1)));
        }
    }

    S7(int i10) {
        this.f27179a = i10;
    }

    public final int b() {
        return this.f27179a;
    }
}
