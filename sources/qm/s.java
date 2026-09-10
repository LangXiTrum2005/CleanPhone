package qm;

import pm.a1;
import pm.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f49196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f49197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f49198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f49199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ s[] f49200e;

    static {
        q qVar = new q();
        f49196a = qVar;
        o oVar = new o();
        f49197b = oVar;
        r rVar = new r();
        f49198c = rVar;
        p pVar = new p();
        f49199d = pVar;
        f49200e = new s[]{qVar, oVar, rVar, pVar};
    }

    public static s b(a1 a1Var) {
        kotlin.jvm.internal.n.f(a1Var, "<this>");
        if (a1Var.Q()) {
            return f49197b;
        }
        if (a1Var instanceof pm.n) {
        }
        return pm.c.g(g.l(false, null, 24), pm.c.l(a1Var), l0.f48449b) ? f49199d : f49198c;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f49200e.clone();
    }

    public abstract s a(a1 a1Var);
}
