package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g7 f23024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g7 f23025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g7 f23026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g7[] f23027f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h7 f23028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23029b;

    /* JADX INFO: Fake field, exist only in values array */
    g7 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    g7 EF2;

    static {
        g7 g7Var = new g7("DOUBLE", 0, h7.f23040d, 1);
        g7 g7Var2 = new g7("FLOAT", 1, h7.f23039c, 5);
        h7 h7Var = h7.f23038b;
        g7 g7Var3 = new g7("INT64", 2, h7Var, 0);
        f23024c = g7Var3;
        g7 g7Var4 = new g7("UINT64", 3, h7Var, 0);
        h7 h7Var2 = h7.f23037a;
        g7 g7Var5 = new g7("INT32", 4, h7Var2, 0);
        g7 g7Var6 = new g7("FIXED64", 5, h7Var, 1);
        g7 g7Var7 = new g7("FIXED32", 6, h7Var2, 5);
        g7 g7Var8 = new g7("BOOL", 7, h7.f23041e, 0);
        g7 g7Var9 = new g7("STRING", 8, h7.f23042f, 2);
        f23025d = g7Var9;
        h7 h7Var3 = h7.f23045i;
        g7 g7Var10 = new g7("GROUP", 9, h7Var3, 3);
        f23026e = g7Var10;
        f23027f = new g7[]{g7Var, g7Var2, g7Var3, g7Var4, g7Var5, g7Var6, g7Var7, g7Var8, g7Var9, g7Var10, new g7("MESSAGE", 10, h7Var3, 2), new g7("BYTES", 11, h7.f23043g, 2), new g7("UINT32", 12, h7Var2, 0), new g7("ENUM", 13, h7.f23044h, 0), new g7("SFIXED32", 14, h7Var2, 5), new g7("SFIXED64", 15, h7Var, 1), new g7("SINT32", 16, h7Var2, 0), new g7("SINT64", 17, h7Var, 0)};
    }

    public g7(String str, int i10, h7 h7Var, int i11) {
        super(str, i10);
        this.f23028a = h7Var;
        this.f23029b = i11;
    }

    public static g7[] values() {
        return (g7[]) f23027f.clone();
    }
}
