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
public final class c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c1 f23336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c1 f23337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c1[] f23338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c1[] f23339e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23340a;

    /* JADX INFO: Fake field, exist only in values array */
    c1 EF0;

    static {
        v1 v1Var = v1.f24065e;
        c1 c1Var = new c1("DOUBLE", 0, 0, 1, v1Var);
        v1 v1Var2 = v1.f24064d;
        c1 c1Var2 = new c1("FLOAT", 1, 1, 1, v1Var2);
        v1 v1Var3 = v1.f24063c;
        c1 c1Var3 = new c1("INT64", 2, 2, 1, v1Var3);
        c1 c1Var4 = new c1("UINT64", 3, 3, 1, v1Var3);
        v1 v1Var4 = v1.f24062b;
        c1 c1Var5 = new c1("INT32", 4, 4, 1, v1Var4);
        c1 c1Var6 = new c1("FIXED64", 5, 5, 1, v1Var3);
        c1 c1Var7 = new c1("FIXED32", 6, 6, 1, v1Var4);
        v1 v1Var5 = v1.f24066f;
        c1 c1Var8 = new c1("BOOL", 7, 7, 1, v1Var5);
        v1 v1Var6 = v1.f24067g;
        c1 c1Var9 = new c1("STRING", 8, 8, 1, v1Var6);
        v1 v1Var7 = v1.f24070j;
        c1 c1Var10 = new c1("MESSAGE", 9, 9, 1, v1Var7);
        v1 v1Var8 = v1.f24068h;
        c1 c1Var11 = new c1("BYTES", 10, 10, 1, v1Var8);
        c1 c1Var12 = new c1("UINT32", 11, 11, 1, v1Var4);
        v1 v1Var9 = v1.f24069i;
        c1 c1Var13 = new c1("ENUM", 12, 12, 1, v1Var9);
        c1 c1Var14 = new c1("SFIXED32", 13, 13, 1, v1Var4);
        c1 c1Var15 = new c1("SFIXED64", 14, 14, 1, v1Var3);
        c1 c1Var16 = new c1("SINT32", 15, 15, 1, v1Var4);
        c1 c1Var17 = new c1("SINT64", 16, 16, 1, v1Var3);
        c1 c1Var18 = new c1("GROUP", 17, 17, 1, v1Var7);
        c1 c1Var19 = new c1("DOUBLE_LIST", 18, 18, 2, v1Var);
        c1 c1Var20 = new c1("FLOAT_LIST", 19, 19, 2, v1Var2);
        c1 c1Var21 = new c1("INT64_LIST", 20, 20, 2, v1Var3);
        c1 c1Var22 = new c1("UINT64_LIST", 21, 21, 2, v1Var3);
        c1 c1Var23 = new c1("INT32_LIST", 22, 22, 2, v1Var4);
        c1 c1Var24 = new c1("FIXED64_LIST", 23, 23, 2, v1Var3);
        c1 c1Var25 = new c1("FIXED32_LIST", 24, 24, 2, v1Var4);
        c1 c1Var26 = new c1("BOOL_LIST", 25, 25, 2, v1Var5);
        c1 c1Var27 = new c1("STRING_LIST", 26, 26, 2, v1Var6);
        c1 c1Var28 = new c1("MESSAGE_LIST", 27, 27, 2, v1Var7);
        c1 c1Var29 = new c1("BYTES_LIST", 28, 28, 2, v1Var8);
        c1 c1Var30 = new c1("UINT32_LIST", 29, 29, 2, v1Var4);
        c1 c1Var31 = new c1("ENUM_LIST", 30, 30, 2, v1Var9);
        c1 c1Var32 = new c1("SFIXED32_LIST", 31, 31, 2, v1Var4);
        c1 c1Var33 = new c1("SFIXED64_LIST", 32, 32, 2, v1Var3);
        c1 c1Var34 = new c1("SINT32_LIST", 33, 33, 2, v1Var4);
        c1 c1Var35 = new c1("SINT64_LIST", 34, 34, 2, v1Var3);
        c1 c1Var36 = new c1("DOUBLE_LIST_PACKED", 35, 35, 3, v1Var);
        f23336b = c1Var36;
        c1 c1Var37 = new c1("FLOAT_LIST_PACKED", 36, 36, 3, v1Var2);
        c1 c1Var38 = new c1("INT64_LIST_PACKED", 37, 37, 3, v1Var3);
        c1 c1Var39 = new c1("UINT64_LIST_PACKED", 38, 38, 3, v1Var3);
        c1 c1Var40 = new c1("INT32_LIST_PACKED", 39, 39, 3, v1Var4);
        c1 c1Var41 = new c1("FIXED64_LIST_PACKED", 40, 40, 3, v1Var3);
        c1 c1Var42 = new c1("FIXED32_LIST_PACKED", 41, 41, 3, v1Var4);
        c1 c1Var43 = new c1("BOOL_LIST_PACKED", 42, 42, 3, v1Var5);
        c1 c1Var44 = new c1("UINT32_LIST_PACKED", 43, 43, 3, v1Var4);
        c1 c1Var45 = new c1("ENUM_LIST_PACKED", 44, 44, 3, v1Var9);
        c1 c1Var46 = new c1("SFIXED32_LIST_PACKED", 45, 45, 3, v1Var4);
        c1 c1Var47 = new c1("SFIXED64_LIST_PACKED", 46, 46, 3, v1Var3);
        c1 c1Var48 = new c1("SINT32_LIST_PACKED", 47, 47, 3, v1Var4);
        c1 c1Var49 = new c1("SINT64_LIST_PACKED", 48, 48, 3, v1Var3);
        f23337c = c1Var49;
        f23339e = new c1[]{c1Var, c1Var2, c1Var3, c1Var4, c1Var5, c1Var6, c1Var7, c1Var8, c1Var9, c1Var10, c1Var11, c1Var12, c1Var13, c1Var14, c1Var15, c1Var16, c1Var17, c1Var18, c1Var19, c1Var20, c1Var21, c1Var22, c1Var23, c1Var24, c1Var25, c1Var26, c1Var27, c1Var28, c1Var29, c1Var30, c1Var31, c1Var32, c1Var33, c1Var34, c1Var35, c1Var36, c1Var37, c1Var38, c1Var39, c1Var40, c1Var41, c1Var42, c1Var43, c1Var44, c1Var45, c1Var46, c1Var47, c1Var48, c1Var49, new c1("GROUP_LIST", 49, 49, 2, v1Var7), new c1("MAP", 50, 50, 4, v1.f24061a)};
        c1[] c1VarArrValues = values();
        f23338d = new c1[c1VarArrValues.length];
        for (c1 c1Var50 : c1VarArrValues) {
            f23338d[c1Var50.f23340a] = c1Var50;
        }
    }

    public c1(String str, int i10, int i11, int i12, v1 v1Var) {
        super(str, i10);
        this.f23340a = i11;
        int i13 = i12 - 1;
        if (i13 == 1 || i13 == 3) {
            v1Var.getClass();
        }
        if (i12 == 1) {
            v1 v1Var2 = v1.f24061a;
            v1Var.ordinal();
        }
    }

    public static c1[] values() {
        return (c1[]) f23339e.clone();
    }
}
