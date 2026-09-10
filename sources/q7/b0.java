package q7;

import java.util.EnumSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum b0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("None"),
    f48666c("Enabled"),
    f48667d("RequireConfirm");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumSet f48665b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48669a;

    static {
        EnumSet enumSetAllOf = EnumSet.allOf(b0.class);
        kotlin.jvm.internal.n.e(enumSetAllOf, "allOf(SmartLoginOption::class.java)");
        f48665b = enumSetAllOf;
    }

    b0(String str) {
        this.f48669a = j;
    }
}
