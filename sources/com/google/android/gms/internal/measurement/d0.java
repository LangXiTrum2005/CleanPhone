package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f23369a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f23370b;

    static {
        f0 f0Var;
        for (int i10 = 0; i10 < 2; i10++) {
            f0Var = null;
            try {
                f0Var = (f0) Class.forName(f23369a[i10]).asSubclass(f0.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (f0Var != null) {
                f23370b = f0Var;
            }
        }
        f0Var = new f0();
        f23370b = f0Var;
    }
}
