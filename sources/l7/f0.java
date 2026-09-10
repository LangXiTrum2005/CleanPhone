package l7;

import com.ironsource.C0375hc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f45120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f45121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f0[] f45122c;

    static {
        f0 f0Var = new f0(C0375hc.f28788a, 0);
        f45120a = f0Var;
        f0 f0Var2 = new f0(C0375hc.f28789b, 1);
        f45121b = f0Var2;
        f45122c = new f0[]{f0Var, f0Var2, new f0("DELETE", 2)};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f45122c.clone();
    }
}
