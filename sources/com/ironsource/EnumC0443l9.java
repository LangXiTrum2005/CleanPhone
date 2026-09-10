package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.l9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0443l9 {
    APP_ACTIVITY(0),
    DIRECT_INTENT(1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29175b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29179a;

    /* JADX INFO: renamed from: com.ironsource.l9$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        public final EnumC0443l9 a(int i10) {
            for (EnumC0443l9 enumC0443l9 : EnumC0443l9.values()) {
                if (enumC0443l9.b() == i10) {
                    if (enumC0443l9 == null) {
                        return EnumC0443l9.APP_ACTIVITY;
                    }
                    return enumC0443l9;
                }
            }
            enumC0443l9 = null;
            if (enumC0443l9 == null) {
                return EnumC0443l9.APP_ACTIVITY;
            }
            return enumC0443l9;
        }

        private a() {
        }
    }

    EnumC0443l9(int i10) {
        this.f29179a = i10;
    }

    public final int b() {
        return this.f29179a;
    }
}
