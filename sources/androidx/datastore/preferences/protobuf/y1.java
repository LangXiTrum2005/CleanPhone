package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
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
public class y1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u1 f4201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v1 f4202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w1 f4203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ y1[] f4204f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f4205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4206b;

    /* JADX INFO: Fake field, exist only in values array */
    y1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    y1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    y1 EF2;

    static {
        y1 y1Var = new y1("DOUBLE", 0, z1.DOUBLE, 1);
        y1 y1Var2 = new y1("FLOAT", 1, z1.FLOAT, 5);
        z1 z1Var = z1.LONG;
        y1 y1Var3 = new y1("INT64", 2, z1Var, 0);
        y1 y1Var4 = new y1("UINT64", 3, z1Var, 0);
        z1 z1Var2 = z1.INT;
        y1 y1Var5 = new y1("INT32", 4, z1Var2, 0);
        y1 y1Var6 = new y1("FIXED64", 5, z1Var, 1);
        y1 y1Var7 = new y1("FIXED32", 6, z1Var2, 5);
        y1 y1Var8 = new y1("BOOL", 7, z1.BOOLEAN, 0);
        u1 u1Var = new u1("STRING", 8, z1.STRING, 2);
        f4201c = u1Var;
        z1 z1Var3 = z1.MESSAGE;
        v1 v1Var = new v1("GROUP", 9, z1Var3, 3);
        f4202d = v1Var;
        w1 w1Var = new w1("MESSAGE", 10, z1Var3, 2);
        f4203e = w1Var;
        f4204f = new y1[]{y1Var, y1Var2, y1Var3, y1Var4, y1Var5, y1Var6, y1Var7, y1Var8, u1Var, v1Var, w1Var, new x1("BYTES", 11, z1.BYTE_STRING, 2), new y1("UINT32", 12, z1Var2, 0), new y1("ENUM", 13, z1.ENUM, 0), new y1("SFIXED32", 14, z1Var2, 5), new y1("SFIXED64", 15, z1Var, 1), new y1("SINT32", 16, z1Var2, 0), new y1("SINT64", 17, z1Var, 0)};
    }

    public y1(String str, int i10, z1 z1Var, int i11) {
        super(str, i10);
        this.f4205a = z1Var;
        this.f4206b = i11;
    }

    public static y1 valueOf(String str) {
        return (y1) Enum.valueOf(y1.class, str);
    }

    public static y1[] values() {
        return (y1[]) f4204f.clone();
    }
}
