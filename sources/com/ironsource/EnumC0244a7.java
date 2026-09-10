package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.a7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0244a7 {
    SendEvent(0),
    NativeController(1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28175b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28179a;

    /* JADX INFO: renamed from: com.ironsource.a7$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        public final EnumC0244a7 a(int i10) {
            for (EnumC0244a7 enumC0244a7 : EnumC0244a7.values()) {
                if (enumC0244a7.b() == i10) {
                    if (enumC0244a7 == null) {
                        return EnumC0244a7.SendEvent;
                    }
                    return enumC0244a7;
                }
            }
            enumC0244a7 = null;
            if (enumC0244a7 == null) {
                return EnumC0244a7.SendEvent;
            }
            return enumC0244a7;
        }

        private a() {
        }
    }

    EnumC0244a7(int i10) {
        this.f28179a = i10;
    }

    public final int b() {
        return this.f28179a;
    }
}
