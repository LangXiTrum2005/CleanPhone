package ads_mobile_sdk;

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
/* JADX INFO: loaded from: classes.dex */
public class ib3 {
    public static final ib3 c;
    public static final eb3 d;
    public static final fb3 e;
    public static final gb3 f;
    public static final /* synthetic */ ib3[] g;
    public final jb3 a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    ib3 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    ib3 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    ib3 EF2;

    static {
        ib3 ib3Var = new ib3("DOUBLE", 0, jb3.DOUBLE, 1);
        ib3 ib3Var2 = new ib3("FLOAT", 1, jb3.FLOAT, 5);
        jb3 jb3Var = jb3.LONG;
        ib3 ib3Var3 = new ib3("INT64", 2, jb3Var, 0);
        ib3 ib3Var4 = new ib3("UINT64", 3, jb3Var, 0);
        jb3 jb3Var2 = jb3.INT;
        ib3 ib3Var5 = new ib3("INT32", 4, jb3Var2, 0);
        ib3 ib3Var6 = new ib3("FIXED64", 5, jb3Var, 1);
        ib3 ib3Var7 = new ib3("FIXED32", 6, jb3Var2, 5);
        ib3 ib3Var8 = new ib3("BOOL", 7, jb3.BOOLEAN, 0);
        c = ib3Var8;
        eb3 eb3Var = new eb3();
        d = eb3Var;
        jb3 jb3Var3 = jb3.MESSAGE;
        fb3 fb3Var = new fb3(jb3Var3);
        e = fb3Var;
        gb3 gb3Var = new gb3(jb3Var3);
        f = gb3Var;
        final jb3 jb3Var4 = jb3.BYTE_STRING;
        g = new ib3[]{ib3Var, ib3Var2, ib3Var3, ib3Var4, ib3Var5, ib3Var6, ib3Var7, ib3Var8, eb3Var, fb3Var, gb3Var, new ib3(jb3Var4) { // from class: ads_mobile_sdk.hb3
        }, new ib3("UINT32", 12, jb3Var2, 0), new ib3("ENUM", 13, jb3.ENUM, 0), new ib3("SFIXED32", 14, jb3Var2, 5), new ib3("SFIXED64", 15, jb3Var, 1), new ib3("SINT32", 16, jb3Var2, 0), new ib3("SINT64", 17, jb3Var, 0)};
    }

    public ib3(String str, int i, jb3 jb3Var, int i2) {
        super(str, i);
        this.a = jb3Var;
        this.b = i2;
    }

    public static ib3[] values() {
        return (ib3[]) g.clone();
    }
}
