package ads_mobile_sdk;

import com.google.android.gms.ads.AdSize;
import p002kotlin.time.DurationUnit;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class zs2 {
    public static final zs2 b;
    public static final zs2 c;
    public static final zs2 d;
    public static final zs2 e;
    public static final /* synthetic */ zs2[] f;
    public final long a;

    static {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        zs2 zs2Var = new zs2(0, p002kotlin.time.dern.molybdenite(30, durationUnit), "FAST");
        b = zs2Var;
        zs2 zs2Var2 = new zs2(1, p002kotlin.time.dern.molybdenite(100, durationUnit), "MEDIUM");
        c = zs2Var2;
        zs2 zs2Var3 = new zs2(2, p002kotlin.time.dern.molybdenite(AdSize.MEDIUM_RECTANGLE_WIDTH, durationUnit), "SLOW");
        d = zs2Var3;
        zs2 zs2Var4 = new zs2(3, p002kotlin.time.dern.molybdenite(1000, durationUnit), "SUPER_SLOW");
        e = zs2Var4;
        zs2[] zs2VarArr = {zs2Var, zs2Var2, zs2Var3, zs2Var4};
        f = zs2VarArr;
        p002kotlin.enums.attabal.attabal(zs2VarArr);
    }

    public zs2(int i, long j, String str) {
        super(str, i);
        this.a = j;
    }

    public static zs2[] values() {
        return (zs2[]) f.clone();
    }

    public final long a() {
        return this.a;
    }
}
