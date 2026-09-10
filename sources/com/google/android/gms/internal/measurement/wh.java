package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum wh {
    /* JADX INFO: Fake field, exist only in values array */
    STRING('s', 1, "-#", true),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN('b', 2, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR('c', 3, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    DECIMAL('d', 4, "-0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    OCTAL('o', 4, "-#0(", false),
    HEX('x', 4, "-#0(", true),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT('f', 5, "-#0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT('e', 5, "-#0+ (", true),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL('g', 5, "-0+ ,(", true),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT_HEX('a', 5, "-#0+ ", true);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wh[] f24128f = new wh[26];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f24130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24133d;

    static {
        for (wh whVar : values()) {
            f24128f[(whVar.f24130a | ' ') - 97] = whVar;
        }
    }

    wh(char c4, int i10, String str, boolean z10) {
        this.f24130a = c4;
        this.f24131b = i10;
        xh xhVar = xh.f24157e;
        int i11 = true != z10 ? 0 : 128;
        for (int i12 = 0; i12 < str.length(); i12++) {
            int iCharAt = ((int) ((xh.f24156d >>> ((str.charAt(i12) - ' ') * 3)) & 7)) - 1;
            if (iCharAt < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
            i11 |= 1 << iCharAt;
        }
        this.f24132c = i11;
        this.f24133d = wi.d.k(new StringBuilder(String.valueOf(c4).length() + 1), "%", c4);
    }
}
