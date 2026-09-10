package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.ef, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0324ef {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28546b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28551a;

    /* JADX INFO: renamed from: com.ironsource.ef$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        public final EnumC0324ef a(int i10) {
            for (EnumC0324ef enumC0324ef : EnumC0324ef.values()) {
                if (enumC0324ef.f28551a == i10) {
                    if (enumC0324ef == null) {
                        return EnumC0324ef.CurrentlyLoadedAds;
                    }
                    return enumC0324ef;
                }
            }
            enumC0324ef = null;
            if (enumC0324ef == null) {
                return EnumC0324ef.CurrentlyLoadedAds;
            }
            return enumC0324ef;
        }

        private a() {
        }
    }

    EnumC0324ef(int i10) {
        this.f28551a = i10;
    }

    public final int b() {
        return this.f28551a;
    }
}
