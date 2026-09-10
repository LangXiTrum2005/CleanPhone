package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.p9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0515p9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30001b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30006a;

    /* JADX INFO: renamed from: com.ironsource.p9$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        public final EnumC0515p9 a(int i10) {
            for (EnumC0515p9 enumC0515p9 : EnumC0515p9.values()) {
                if (enumC0515p9.f30006a == i10) {
                    if (enumC0515p9 == null) {
                        return EnumC0515p9.NotSupported;
                    }
                    return enumC0515p9;
                }
            }
            enumC0515p9 = null;
            if (enumC0515p9 == null) {
                return EnumC0515p9.NotSupported;
            }
            return enumC0515p9;
        }

        private a() {
        }
    }

    EnumC0515p9(int i10) {
        this.f30006a = i10;
    }

    public final int b() {
        return this.f30006a;
    }

    public final boolean b(EnumC0515p9 instanceType) {
        kotlin.jvm.internal.n.f(instanceType, "instanceType");
        return instanceType.b() == this.f30006a;
    }
}
