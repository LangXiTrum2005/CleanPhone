package androidx.datastore.preferences.protobuf;

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
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f4189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f4190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w[] f4191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w[] f4192e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4193a;

    /* JADX INFO: Fake field, exist only in values array */
    w EF0;

    static {
        h0 h0Var = h0.DOUBLE;
        w wVar = new w("DOUBLE", 0, 0, 1, h0Var);
        h0 h0Var2 = h0.FLOAT;
        w wVar2 = new w("FLOAT", 1, 1, 1, h0Var2);
        h0 h0Var3 = h0.LONG;
        w wVar3 = new w("INT64", 2, 2, 1, h0Var3);
        w wVar4 = new w("UINT64", 3, 3, 1, h0Var3);
        h0 h0Var4 = h0.INT;
        w wVar5 = new w("INT32", 4, 4, 1, h0Var4);
        w wVar6 = new w("FIXED64", 5, 5, 1, h0Var3);
        w wVar7 = new w("FIXED32", 6, 6, 1, h0Var4);
        h0 h0Var5 = h0.BOOLEAN;
        w wVar8 = new w("BOOL", 7, 7, 1, h0Var5);
        h0 h0Var6 = h0.STRING;
        w wVar9 = new w("STRING", 8, 8, 1, h0Var6);
        h0 h0Var7 = h0.MESSAGE;
        w wVar10 = new w("MESSAGE", 9, 9, 1, h0Var7);
        h0 h0Var8 = h0.BYTE_STRING;
        w wVar11 = new w("BYTES", 10, 10, 1, h0Var8);
        w wVar12 = new w("UINT32", 11, 11, 1, h0Var4);
        h0 h0Var9 = h0.ENUM;
        w wVar13 = new w("ENUM", 12, 12, 1, h0Var9);
        w wVar14 = new w("SFIXED32", 13, 13, 1, h0Var4);
        w wVar15 = new w("SFIXED64", 14, 14, 1, h0Var3);
        w wVar16 = new w("SINT32", 15, 15, 1, h0Var4);
        w wVar17 = new w("SINT64", 16, 16, 1, h0Var3);
        w wVar18 = new w("GROUP", 17, 17, 1, h0Var7);
        w wVar19 = new w("DOUBLE_LIST", 18, 18, 2, h0Var);
        w wVar20 = new w("FLOAT_LIST", 19, 19, 2, h0Var2);
        w wVar21 = new w("INT64_LIST", 20, 20, 2, h0Var3);
        w wVar22 = new w("UINT64_LIST", 21, 21, 2, h0Var3);
        w wVar23 = new w("INT32_LIST", 22, 22, 2, h0Var4);
        w wVar24 = new w("FIXED64_LIST", 23, 23, 2, h0Var3);
        w wVar25 = new w("FIXED32_LIST", 24, 24, 2, h0Var4);
        w wVar26 = new w("BOOL_LIST", 25, 25, 2, h0Var5);
        w wVar27 = new w("STRING_LIST", 26, 26, 2, h0Var6);
        w wVar28 = new w("MESSAGE_LIST", 27, 27, 2, h0Var7);
        w wVar29 = new w("BYTES_LIST", 28, 28, 2, h0Var8);
        w wVar30 = new w("UINT32_LIST", 29, 29, 2, h0Var4);
        w wVar31 = new w("ENUM_LIST", 30, 30, 2, h0Var9);
        w wVar32 = new w("SFIXED32_LIST", 31, 31, 2, h0Var4);
        w wVar33 = new w("SFIXED64_LIST", 32, 32, 2, h0Var3);
        w wVar34 = new w("SINT32_LIST", 33, 33, 2, h0Var4);
        w wVar35 = new w("SINT64_LIST", 34, 34, 2, h0Var3);
        w wVar36 = new w("DOUBLE_LIST_PACKED", 35, 35, 3, h0Var);
        f4189b = wVar36;
        w wVar37 = new w("FLOAT_LIST_PACKED", 36, 36, 3, h0Var2);
        w wVar38 = new w("INT64_LIST_PACKED", 37, 37, 3, h0Var3);
        w wVar39 = new w("UINT64_LIST_PACKED", 38, 38, 3, h0Var3);
        w wVar40 = new w("INT32_LIST_PACKED", 39, 39, 3, h0Var4);
        w wVar41 = new w("FIXED64_LIST_PACKED", 40, 40, 3, h0Var3);
        w wVar42 = new w("FIXED32_LIST_PACKED", 41, 41, 3, h0Var4);
        w wVar43 = new w("BOOL_LIST_PACKED", 42, 42, 3, h0Var5);
        w wVar44 = new w("UINT32_LIST_PACKED", 43, 43, 3, h0Var4);
        w wVar45 = new w("ENUM_LIST_PACKED", 44, 44, 3, h0Var9);
        w wVar46 = new w("SFIXED32_LIST_PACKED", 45, 45, 3, h0Var4);
        w wVar47 = new w("SFIXED64_LIST_PACKED", 46, 46, 3, h0Var3);
        w wVar48 = new w("SINT32_LIST_PACKED", 47, 47, 3, h0Var4);
        w wVar49 = new w("SINT64_LIST_PACKED", 48, 48, 3, h0Var3);
        f4190c = wVar49;
        f4192e = new w[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9, wVar10, wVar11, wVar12, wVar13, wVar14, wVar15, wVar16, wVar17, wVar18, wVar19, wVar20, wVar21, wVar22, wVar23, wVar24, wVar25, wVar26, wVar27, wVar28, wVar29, wVar30, wVar31, wVar32, wVar33, wVar34, wVar35, wVar36, wVar37, wVar38, wVar39, wVar40, wVar41, wVar42, wVar43, wVar44, wVar45, wVar46, wVar47, wVar48, wVar49, new w("GROUP_LIST", 49, 49, 2, h0Var7), new w("MAP", 50, 50, 4, h0.VOID)};
        w[] wVarArrValues = values();
        f4191d = new w[wVarArrValues.length];
        for (w wVar50 : wVarArrValues) {
            f4191d[wVar50.f4193a] = wVar50;
        }
    }

    public w(String str, int i10, int i11, int i12, h0 h0Var) {
        super(str, i10);
        this.f4193a = i11;
        int iC = v0.i.c(i12);
        if (iC == 1 || iC == 3) {
            h0Var.getClass();
        }
        if (i12 == 1) {
            h0Var.ordinal();
        }
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f4192e.clone();
    }
}
