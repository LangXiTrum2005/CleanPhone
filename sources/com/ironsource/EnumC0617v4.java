package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.v4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0617v4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30835b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30841a;

    /* JADX INFO: renamed from: com.ironsource.v4$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        public final EnumC0617v4 a(String str) {
            for (EnumC0617v4 enumC0617v4 : EnumC0617v4.values()) {
                if (kotlin.jvm.internal.n.a(enumC0617v4.b(), str)) {
                    if (enumC0617v4 == null) {
                        return EnumC0617v4.NONE;
                    }
                    return enumC0617v4;
                }
            }
            enumC0617v4 = null;
            if (enumC0617v4 == null) {
                return EnumC0617v4.NONE;
            }
            return enumC0617v4;
        }

        private a() {
        }
    }

    EnumC0617v4(String str) {
        this.f30841a = str;
    }

    public final String b() {
        return this.f30841a;
    }

    public static final EnumC0617v4 a(String str) {
        return f30835b.a(str);
    }
}
