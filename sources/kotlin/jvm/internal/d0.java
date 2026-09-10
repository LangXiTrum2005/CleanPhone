package kotlin.jvm.internal;

import tk.r1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f44761a;

    static {
        e0 e0Var = null;
        try {
            e0Var = (e0) r1.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (e0Var == null) {
            e0Var = new e0();
        }
        f44761a = e0Var;
    }

    public static qk.d a(Class cls) {
        return f44761a.b(cls);
    }
}
