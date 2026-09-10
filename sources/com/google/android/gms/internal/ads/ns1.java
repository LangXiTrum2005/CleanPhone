package com.google.android.gms.internal.ads;

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
public final class ns1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ns1 f17939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ns1 f17940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ns1[] f17941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ns1[] f17942e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17943a;

    /* JADX INFO: Fake field, exist only in values array */
    ns1 EF0;

    static {
        gt1 gt1Var = gt1.f14959e;
        ns1 ns1Var = new ns1("DOUBLE", 0, 0, 1, gt1Var);
        gt1 gt1Var2 = gt1.f14958d;
        ns1 ns1Var2 = new ns1("FLOAT", 1, 1, 1, gt1Var2);
        gt1 gt1Var3 = gt1.f14957c;
        ns1 ns1Var3 = new ns1("INT64", 2, 2, 1, gt1Var3);
        ns1 ns1Var4 = new ns1("UINT64", 3, 3, 1, gt1Var3);
        gt1 gt1Var4 = gt1.f14956b;
        ns1 ns1Var5 = new ns1("INT32", 4, 4, 1, gt1Var4);
        ns1 ns1Var6 = new ns1("FIXED64", 5, 5, 1, gt1Var3);
        ns1 ns1Var7 = new ns1("FIXED32", 6, 6, 1, gt1Var4);
        gt1 gt1Var5 = gt1.f14960f;
        ns1 ns1Var8 = new ns1("BOOL", 7, 7, 1, gt1Var5);
        gt1 gt1Var6 = gt1.f14961g;
        ns1 ns1Var9 = new ns1("STRING", 8, 8, 1, gt1Var6);
        gt1 gt1Var7 = gt1.f14964j;
        ns1 ns1Var10 = new ns1("MESSAGE", 9, 9, 1, gt1Var7);
        gt1 gt1Var8 = gt1.f14962h;
        ns1 ns1Var11 = new ns1("BYTES", 10, 10, 1, gt1Var8);
        ns1 ns1Var12 = new ns1("UINT32", 11, 11, 1, gt1Var4);
        gt1 gt1Var9 = gt1.f14963i;
        ns1 ns1Var13 = new ns1("ENUM", 12, 12, 1, gt1Var9);
        ns1 ns1Var14 = new ns1("SFIXED32", 13, 13, 1, gt1Var4);
        ns1 ns1Var15 = new ns1("SFIXED64", 14, 14, 1, gt1Var3);
        ns1 ns1Var16 = new ns1("SINT32", 15, 15, 1, gt1Var4);
        ns1 ns1Var17 = new ns1("SINT64", 16, 16, 1, gt1Var3);
        ns1 ns1Var18 = new ns1("GROUP", 17, 17, 1, gt1Var7);
        ns1 ns1Var19 = new ns1("DOUBLE_LIST", 18, 18, 2, gt1Var);
        ns1 ns1Var20 = new ns1("FLOAT_LIST", 19, 19, 2, gt1Var2);
        ns1 ns1Var21 = new ns1("INT64_LIST", 20, 20, 2, gt1Var3);
        ns1 ns1Var22 = new ns1("UINT64_LIST", 21, 21, 2, gt1Var3);
        ns1 ns1Var23 = new ns1("INT32_LIST", 22, 22, 2, gt1Var4);
        ns1 ns1Var24 = new ns1("FIXED64_LIST", 23, 23, 2, gt1Var3);
        ns1 ns1Var25 = new ns1("FIXED32_LIST", 24, 24, 2, gt1Var4);
        ns1 ns1Var26 = new ns1("BOOL_LIST", 25, 25, 2, gt1Var5);
        ns1 ns1Var27 = new ns1("STRING_LIST", 26, 26, 2, gt1Var6);
        ns1 ns1Var28 = new ns1("MESSAGE_LIST", 27, 27, 2, gt1Var7);
        ns1 ns1Var29 = new ns1("BYTES_LIST", 28, 28, 2, gt1Var8);
        ns1 ns1Var30 = new ns1("UINT32_LIST", 29, 29, 2, gt1Var4);
        ns1 ns1Var31 = new ns1("ENUM_LIST", 30, 30, 2, gt1Var9);
        ns1 ns1Var32 = new ns1("SFIXED32_LIST", 31, 31, 2, gt1Var4);
        ns1 ns1Var33 = new ns1("SFIXED64_LIST", 32, 32, 2, gt1Var3);
        ns1 ns1Var34 = new ns1("SINT32_LIST", 33, 33, 2, gt1Var4);
        ns1 ns1Var35 = new ns1("SINT64_LIST", 34, 34, 2, gt1Var3);
        ns1 ns1Var36 = new ns1("DOUBLE_LIST_PACKED", 35, 35, 3, gt1Var);
        f17939b = ns1Var36;
        ns1 ns1Var37 = new ns1("FLOAT_LIST_PACKED", 36, 36, 3, gt1Var2);
        ns1 ns1Var38 = new ns1("INT64_LIST_PACKED", 37, 37, 3, gt1Var3);
        ns1 ns1Var39 = new ns1("UINT64_LIST_PACKED", 38, 38, 3, gt1Var3);
        ns1 ns1Var40 = new ns1("INT32_LIST_PACKED", 39, 39, 3, gt1Var4);
        ns1 ns1Var41 = new ns1("FIXED64_LIST_PACKED", 40, 40, 3, gt1Var3);
        ns1 ns1Var42 = new ns1("FIXED32_LIST_PACKED", 41, 41, 3, gt1Var4);
        ns1 ns1Var43 = new ns1("BOOL_LIST_PACKED", 42, 42, 3, gt1Var5);
        ns1 ns1Var44 = new ns1("UINT32_LIST_PACKED", 43, 43, 3, gt1Var4);
        ns1 ns1Var45 = new ns1("ENUM_LIST_PACKED", 44, 44, 3, gt1Var9);
        ns1 ns1Var46 = new ns1("SFIXED32_LIST_PACKED", 45, 45, 3, gt1Var4);
        ns1 ns1Var47 = new ns1("SFIXED64_LIST_PACKED", 46, 46, 3, gt1Var3);
        ns1 ns1Var48 = new ns1("SINT32_LIST_PACKED", 47, 47, 3, gt1Var4);
        ns1 ns1Var49 = new ns1("SINT64_LIST_PACKED", 48, 48, 3, gt1Var3);
        f17940c = ns1Var49;
        f17942e = new ns1[]{ns1Var, ns1Var2, ns1Var3, ns1Var4, ns1Var5, ns1Var6, ns1Var7, ns1Var8, ns1Var9, ns1Var10, ns1Var11, ns1Var12, ns1Var13, ns1Var14, ns1Var15, ns1Var16, ns1Var17, ns1Var18, ns1Var19, ns1Var20, ns1Var21, ns1Var22, ns1Var23, ns1Var24, ns1Var25, ns1Var26, ns1Var27, ns1Var28, ns1Var29, ns1Var30, ns1Var31, ns1Var32, ns1Var33, ns1Var34, ns1Var35, ns1Var36, ns1Var37, ns1Var38, ns1Var39, ns1Var40, ns1Var41, ns1Var42, ns1Var43, ns1Var44, ns1Var45, ns1Var46, ns1Var47, ns1Var48, ns1Var49, new ns1("GROUP_LIST", 49, 49, 2, gt1Var7), new ns1("MAP", 50, 50, 4, gt1.f14955a)};
        ns1[] ns1VarArrValues = values();
        f17941d = new ns1[ns1VarArrValues.length];
        for (ns1 ns1Var50 : ns1VarArrValues) {
            f17941d[ns1Var50.f17943a] = ns1Var50;
        }
    }

    public ns1(String str, int i10, int i11, int i12, gt1 gt1Var) {
        super(str, i10);
        this.f17943a = i11;
        int i13 = i12 - 1;
        if (i13 == 1 || i13 == 3) {
            gt1Var.getClass();
        }
        if (i12 == 1) {
            gt1 gt1Var2 = gt1.f14955a;
            gt1Var.ordinal();
        }
    }

    public static ns1[] values() {
        return (ns1[]) f17942e.clone();
    }
}
