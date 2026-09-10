package com.google.android.gms.internal.play_billing;

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
public final class o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o1 f24432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o1 f24433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o1[] f24434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o1[] f24435e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24436a;

    /* JADX INFO: Fake field, exist only in values array */
    o1 EF0;

    static {
        c2 c2Var = c2.f24247e;
        o1 o1Var = new o1("DOUBLE", 0, 0, 1, c2Var);
        c2 c2Var2 = c2.f24246d;
        o1 o1Var2 = new o1("FLOAT", 1, 1, 1, c2Var2);
        c2 c2Var3 = c2.f24245c;
        o1 o1Var3 = new o1("INT64", 2, 2, 1, c2Var3);
        o1 o1Var4 = new o1("UINT64", 3, 3, 1, c2Var3);
        c2 c2Var4 = c2.f24244b;
        o1 o1Var5 = new o1("INT32", 4, 4, 1, c2Var4);
        o1 o1Var6 = new o1("FIXED64", 5, 5, 1, c2Var3);
        o1 o1Var7 = new o1("FIXED32", 6, 6, 1, c2Var4);
        c2 c2Var5 = c2.f24248f;
        o1 o1Var8 = new o1("BOOL", 7, 7, 1, c2Var5);
        c2 c2Var6 = c2.f24249g;
        o1 o1Var9 = new o1("STRING", 8, 8, 1, c2Var6);
        c2 c2Var7 = c2.f24252j;
        o1 o1Var10 = new o1("MESSAGE", 9, 9, 1, c2Var7);
        c2 c2Var8 = c2.f24250h;
        o1 o1Var11 = new o1("BYTES", 10, 10, 1, c2Var8);
        o1 o1Var12 = new o1("UINT32", 11, 11, 1, c2Var4);
        c2 c2Var9 = c2.f24251i;
        o1 o1Var13 = new o1("ENUM", 12, 12, 1, c2Var9);
        o1 o1Var14 = new o1("SFIXED32", 13, 13, 1, c2Var4);
        o1 o1Var15 = new o1("SFIXED64", 14, 14, 1, c2Var3);
        o1 o1Var16 = new o1("SINT32", 15, 15, 1, c2Var4);
        o1 o1Var17 = new o1("SINT64", 16, 16, 1, c2Var3);
        o1 o1Var18 = new o1("GROUP", 17, 17, 1, c2Var7);
        o1 o1Var19 = new o1("DOUBLE_LIST", 18, 18, 2, c2Var);
        o1 o1Var20 = new o1("FLOAT_LIST", 19, 19, 2, c2Var2);
        o1 o1Var21 = new o1("INT64_LIST", 20, 20, 2, c2Var3);
        o1 o1Var22 = new o1("UINT64_LIST", 21, 21, 2, c2Var3);
        o1 o1Var23 = new o1("INT32_LIST", 22, 22, 2, c2Var4);
        o1 o1Var24 = new o1("FIXED64_LIST", 23, 23, 2, c2Var3);
        o1 o1Var25 = new o1("FIXED32_LIST", 24, 24, 2, c2Var4);
        o1 o1Var26 = new o1("BOOL_LIST", 25, 25, 2, c2Var5);
        o1 o1Var27 = new o1("STRING_LIST", 26, 26, 2, c2Var6);
        o1 o1Var28 = new o1("MESSAGE_LIST", 27, 27, 2, c2Var7);
        o1 o1Var29 = new o1("BYTES_LIST", 28, 28, 2, c2Var8);
        o1 o1Var30 = new o1("UINT32_LIST", 29, 29, 2, c2Var4);
        o1 o1Var31 = new o1("ENUM_LIST", 30, 30, 2, c2Var9);
        o1 o1Var32 = new o1("SFIXED32_LIST", 31, 31, 2, c2Var4);
        o1 o1Var33 = new o1("SFIXED64_LIST", 32, 32, 2, c2Var3);
        o1 o1Var34 = new o1("SINT32_LIST", 33, 33, 2, c2Var4);
        o1 o1Var35 = new o1("SINT64_LIST", 34, 34, 2, c2Var3);
        o1 o1Var36 = new o1("DOUBLE_LIST_PACKED", 35, 35, 3, c2Var);
        f24432b = o1Var36;
        o1 o1Var37 = new o1("FLOAT_LIST_PACKED", 36, 36, 3, c2Var2);
        o1 o1Var38 = new o1("INT64_LIST_PACKED", 37, 37, 3, c2Var3);
        o1 o1Var39 = new o1("UINT64_LIST_PACKED", 38, 38, 3, c2Var3);
        o1 o1Var40 = new o1("INT32_LIST_PACKED", 39, 39, 3, c2Var4);
        o1 o1Var41 = new o1("FIXED64_LIST_PACKED", 40, 40, 3, c2Var3);
        o1 o1Var42 = new o1("FIXED32_LIST_PACKED", 41, 41, 3, c2Var4);
        o1 o1Var43 = new o1("BOOL_LIST_PACKED", 42, 42, 3, c2Var5);
        o1 o1Var44 = new o1("UINT32_LIST_PACKED", 43, 43, 3, c2Var4);
        o1 o1Var45 = new o1("ENUM_LIST_PACKED", 44, 44, 3, c2Var9);
        o1 o1Var46 = new o1("SFIXED32_LIST_PACKED", 45, 45, 3, c2Var4);
        o1 o1Var47 = new o1("SFIXED64_LIST_PACKED", 46, 46, 3, c2Var3);
        o1 o1Var48 = new o1("SINT32_LIST_PACKED", 47, 47, 3, c2Var4);
        o1 o1Var49 = new o1("SINT64_LIST_PACKED", 48, 48, 3, c2Var3);
        f24433c = o1Var49;
        f24435e = new o1[]{o1Var, o1Var2, o1Var3, o1Var4, o1Var5, o1Var6, o1Var7, o1Var8, o1Var9, o1Var10, o1Var11, o1Var12, o1Var13, o1Var14, o1Var15, o1Var16, o1Var17, o1Var18, o1Var19, o1Var20, o1Var21, o1Var22, o1Var23, o1Var24, o1Var25, o1Var26, o1Var27, o1Var28, o1Var29, o1Var30, o1Var31, o1Var32, o1Var33, o1Var34, o1Var35, o1Var36, o1Var37, o1Var38, o1Var39, o1Var40, o1Var41, o1Var42, o1Var43, o1Var44, o1Var45, o1Var46, o1Var47, o1Var48, o1Var49, new o1("GROUP_LIST", 49, 49, 2, c2Var7), new o1("MAP", 50, 50, 4, c2.f24243a)};
        o1[] o1VarArrValues = values();
        f24434d = new o1[o1VarArrValues.length];
        for (o1 o1Var50 : o1VarArrValues) {
            f24434d[o1Var50.f24436a] = o1Var50;
        }
    }

    public o1(String str, int i10, int i11, int i12, c2 c2Var) {
        super(str, i10);
        this.f24436a = i11;
        int i13 = i12 - 1;
        if (i13 == 1 || i13 == 3) {
            c2Var.getClass();
        }
        if (i12 == 1) {
            c2 c2Var2 = c2.f24243a;
            c2Var.ordinal();
        }
    }

    public static o1[] values() {
        return (o1[]) f24435e.clone();
    }
}
