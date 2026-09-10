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
public final class qu1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qu1 f19208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qu1 f19209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final qu1 f19210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ qu1[] f19211f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ru1 f19212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19213b;

    /* JADX INFO: Fake field, exist only in values array */
    qu1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    qu1 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    qu1 EF0;

    static {
        qu1 qu1Var = new qu1("DOUBLE", 0, ru1.f19677d, 1);
        qu1 qu1Var2 = new qu1("FLOAT", 1, ru1.f19676c, 5);
        ru1 ru1Var = ru1.f19675b;
        qu1 qu1Var3 = new qu1("INT64", 2, ru1Var, 0);
        qu1 qu1Var4 = new qu1("UINT64", 3, ru1Var, 0);
        ru1 ru1Var2 = ru1.f19674a;
        qu1 qu1Var5 = new qu1("INT32", 4, ru1Var2, 0);
        qu1 qu1Var6 = new qu1("FIXED64", 5, ru1Var, 1);
        qu1 qu1Var7 = new qu1("FIXED32", 6, ru1Var2, 5);
        qu1 qu1Var8 = new qu1("BOOL", 7, ru1.f19678e, 0);
        qu1 qu1Var9 = new qu1("STRING", 8, ru1.f19679f, 2);
        f19208c = qu1Var9;
        ru1 ru1Var3 = ru1.f19682i;
        qu1 qu1Var10 = new qu1("GROUP", 9, ru1Var3, 3);
        f19209d = qu1Var10;
        qu1 qu1Var11 = new qu1("MESSAGE", 10, ru1Var3, 2);
        f19210e = qu1Var11;
        f19211f = new qu1[]{qu1Var, qu1Var2, qu1Var3, qu1Var4, qu1Var5, qu1Var6, qu1Var7, qu1Var8, qu1Var9, qu1Var10, qu1Var11, new qu1("BYTES", 11, ru1.f19680g, 2), new qu1("UINT32", 12, ru1Var2, 0), new qu1("ENUM", 13, ru1.f19681h, 0), new qu1("SFIXED32", 14, ru1Var2, 5), new qu1("SFIXED64", 15, ru1Var, 1), new qu1("SINT32", 16, ru1Var2, 0), new qu1("SINT64", 17, ru1Var, 0)};
    }

    public qu1(String str, int i10, ru1 ru1Var, int i11) {
        super(str, i10);
        this.f19212a = ru1Var;
        this.f19213b = i11;
    }

    public static qu1[] values() {
        return (qu1[]) f19211f.clone();
    }
}
