package ads_mobile_sdk;

import saneness.tdb;

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
/* JADX INFO: loaded from: classes.dex */
public final class ig0 {
    public static final ig0 b;
    public static final ig0 c;
    public static final ig0[] d;
    public static final /* synthetic */ ig0[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    ig0 EF0;

    static {
        e91 e91Var = e91.DOUBLE;
        ig0 ig0Var = new ig0("DOUBLE", 0, 0, 1, e91Var);
        e91 e91Var2 = e91.FLOAT;
        ig0 ig0Var2 = new ig0("FLOAT", 1, 1, 1, e91Var2);
        e91 e91Var3 = e91.LONG;
        ig0 ig0Var3 = new ig0("INT64", 2, 2, 1, e91Var3);
        ig0 ig0Var4 = new ig0("UINT64", 3, 3, 1, e91Var3);
        e91 e91Var4 = e91.INT;
        ig0 ig0Var5 = new ig0("INT32", 4, 4, 1, e91Var4);
        ig0 ig0Var6 = new ig0("FIXED64", 5, 5, 1, e91Var3);
        ig0 ig0Var7 = new ig0("FIXED32", 6, 6, 1, e91Var4);
        e91 e91Var5 = e91.BOOLEAN;
        ig0 ig0Var8 = new ig0("BOOL", 7, 7, 1, e91Var5);
        e91 e91Var6 = e91.STRING;
        ig0 ig0Var9 = new ig0("STRING", 8, 8, 1, e91Var6);
        e91 e91Var7 = e91.MESSAGE;
        ig0 ig0Var10 = new ig0("MESSAGE", 9, 9, 1, e91Var7);
        e91 e91Var8 = e91.BYTE_STRING;
        ig0 ig0Var11 = new ig0("BYTES", 10, 10, 1, e91Var8);
        ig0 ig0Var12 = new ig0("UINT32", 11, 11, 1, e91Var4);
        e91 e91Var9 = e91.ENUM;
        ig0 ig0Var13 = new ig0("ENUM", 12, 12, 1, e91Var9);
        ig0 ig0Var14 = new ig0("SFIXED32", 13, 13, 1, e91Var4);
        ig0 ig0Var15 = new ig0("SFIXED64", 14, 14, 1, e91Var3);
        ig0 ig0Var16 = new ig0("SINT32", 15, 15, 1, e91Var4);
        ig0 ig0Var17 = new ig0("SINT64", 16, 16, 1, e91Var3);
        ig0 ig0Var18 = new ig0("GROUP", 17, 17, 1, e91Var7);
        ig0 ig0Var19 = new ig0("DOUBLE_LIST", 18, 18, 2, e91Var);
        ig0 ig0Var20 = new ig0("FLOAT_LIST", 19, 19, 2, e91Var2);
        ig0 ig0Var21 = new ig0("INT64_LIST", 20, 20, 2, e91Var3);
        ig0 ig0Var22 = new ig0("UINT64_LIST", 21, 21, 2, e91Var3);
        ig0 ig0Var23 = new ig0("INT32_LIST", 22, 22, 2, e91Var4);
        ig0 ig0Var24 = new ig0("FIXED64_LIST", 23, 23, 2, e91Var3);
        ig0 ig0Var25 = new ig0("FIXED32_LIST", 24, 24, 2, e91Var4);
        ig0 ig0Var26 = new ig0("BOOL_LIST", 25, 25, 2, e91Var5);
        ig0 ig0Var27 = new ig0("STRING_LIST", 26, 26, 2, e91Var6);
        ig0 ig0Var28 = new ig0("MESSAGE_LIST", 27, 27, 2, e91Var7);
        ig0 ig0Var29 = new ig0("BYTES_LIST", 28, 28, 2, e91Var8);
        ig0 ig0Var30 = new ig0("UINT32_LIST", 29, 29, 2, e91Var4);
        ig0 ig0Var31 = new ig0("ENUM_LIST", 30, 30, 2, e91Var9);
        ig0 ig0Var32 = new ig0("SFIXED32_LIST", 31, 31, 2, e91Var4);
        ig0 ig0Var33 = new ig0("SFIXED64_LIST", 32, 32, 2, e91Var3);
        ig0 ig0Var34 = new ig0("SINT32_LIST", 33, 33, 2, e91Var4);
        ig0 ig0Var35 = new ig0("SINT64_LIST", 34, 34, 2, e91Var3);
        ig0 ig0Var36 = new ig0("DOUBLE_LIST_PACKED", 35, 35, 3, e91Var);
        b = ig0Var36;
        ig0 ig0Var37 = new ig0("FLOAT_LIST_PACKED", 36, 36, 3, e91Var2);
        ig0 ig0Var38 = new ig0("INT64_LIST_PACKED", 37, 37, 3, e91Var3);
        ig0 ig0Var39 = new ig0("UINT64_LIST_PACKED", 38, 38, 3, e91Var3);
        ig0 ig0Var40 = new ig0("INT32_LIST_PACKED", 39, 39, 3, e91Var4);
        ig0 ig0Var41 = new ig0("FIXED64_LIST_PACKED", 40, 40, 3, e91Var3);
        ig0 ig0Var42 = new ig0("FIXED32_LIST_PACKED", 41, 41, 3, e91Var4);
        ig0 ig0Var43 = new ig0("BOOL_LIST_PACKED", 42, 42, 3, e91Var5);
        ig0 ig0Var44 = new ig0("UINT32_LIST_PACKED", 43, 43, 3, e91Var4);
        ig0 ig0Var45 = new ig0("ENUM_LIST_PACKED", 44, 44, 3, e91Var9);
        ig0 ig0Var46 = new ig0("SFIXED32_LIST_PACKED", 45, 45, 3, e91Var4);
        ig0 ig0Var47 = new ig0("SFIXED64_LIST_PACKED", 46, 46, 3, e91Var3);
        ig0 ig0Var48 = new ig0("SINT32_LIST_PACKED", 47, 47, 3, e91Var4);
        ig0 ig0Var49 = new ig0("SINT64_LIST_PACKED", 48, 48, 3, e91Var3);
        c = ig0Var49;
        e = new ig0[]{ig0Var, ig0Var2, ig0Var3, ig0Var4, ig0Var5, ig0Var6, ig0Var7, ig0Var8, ig0Var9, ig0Var10, ig0Var11, ig0Var12, ig0Var13, ig0Var14, ig0Var15, ig0Var16, ig0Var17, ig0Var18, ig0Var19, ig0Var20, ig0Var21, ig0Var22, ig0Var23, ig0Var24, ig0Var25, ig0Var26, ig0Var27, ig0Var28, ig0Var29, ig0Var30, ig0Var31, ig0Var32, ig0Var33, ig0Var34, ig0Var35, ig0Var36, ig0Var37, ig0Var38, ig0Var39, ig0Var40, ig0Var41, ig0Var42, ig0Var43, ig0Var44, ig0Var45, ig0Var46, ig0Var47, ig0Var48, ig0Var49, new ig0("GROUP_LIST", 49, 49, 2, e91Var7), new ig0("MAP", 50, 50, 4, e91.VOID)};
        ig0[] ig0VarArrValues = values();
        d = new ig0[ig0VarArrValues.length];
        for (ig0 ig0Var50 : ig0VarArrValues) {
            d[ig0Var50.a] = ig0Var50;
        }
    }

    public ig0(String str, int i, int i2, int i3, e91 e91Var) {
        super(str, i);
        this.a = i2;
        int iAttabal = tdb.attabal(i3);
        if (iAttabal == 1 || iAttabal == 3) {
            e91Var.getClass();
        }
        if (i3 == 1) {
            e91Var.ordinal();
        }
    }

    public static ig0[] values() {
        return (ig0[]) e.clone();
    }

    public final int a() {
        return this.a;
    }
}
