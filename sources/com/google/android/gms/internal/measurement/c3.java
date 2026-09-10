package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
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
public final class c3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c3 f23342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c3 f23343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c3 f23344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c3[] f23345f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3 f23346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23347b;

    /* JADX INFO: Fake field, exist only in values array */
    c3 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    c3 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    c3 EF0;

    static {
        c3 c3Var = new c3("DOUBLE", 0, d3.f23374d, 1);
        c3 c3Var2 = new c3("FLOAT", 1, d3.f23373c, 5);
        d3 d3Var = d3.f23372b;
        c3 c3Var3 = new c3("INT64", 2, d3Var, 0);
        c3 c3Var4 = new c3("UINT64", 3, d3Var, 0);
        d3 d3Var2 = d3.f23371a;
        c3 c3Var5 = new c3("INT32", 4, d3Var2, 0);
        c3 c3Var6 = new c3("FIXED64", 5, d3Var, 1);
        c3 c3Var7 = new c3("FIXED32", 6, d3Var2, 5);
        c3 c3Var8 = new c3("BOOL", 7, d3.f23375e, 0);
        c3 c3Var9 = new c3("STRING", 8, d3.f23376f, 2);
        f23342c = c3Var9;
        d3 d3Var3 = d3.f23379i;
        c3 c3Var10 = new c3("GROUP", 9, d3Var3, 3);
        f23343d = c3Var10;
        c3 c3Var11 = new c3("MESSAGE", 10, d3Var3, 2);
        f23344e = c3Var11;
        f23345f = new c3[]{c3Var, c3Var2, c3Var3, c3Var4, c3Var5, c3Var6, c3Var7, c3Var8, c3Var9, c3Var10, c3Var11, new c3("BYTES", 11, d3.f23377g, 2), new c3("UINT32", 12, d3Var2, 0), new c3("ENUM", 13, d3.f23378h, 0), new c3("SFIXED32", 14, d3Var2, 5), new c3("SFIXED64", 15, d3Var, 1), new c3("SINT32", 16, d3Var2, 0), new c3("SINT64", 17, d3Var, 0)};
    }

    public c3(String str, int i10, d3 d3Var, int i11) {
        super(str, i10);
        this.f23346a = d3Var;
        this.f23347b = i11;
    }

    public static c3[] values() {
        return (c3[]) f23345f.clone();
    }
}
