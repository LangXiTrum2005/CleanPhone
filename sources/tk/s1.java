package tk;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final am.h f51061a = am.h.f3706c;

    public static void a(StringBuilder sb2, zk.c cVar) {
        cl.z zVarG = v1.g(cVar);
        cl.z zVarJ = cVar.J();
        if (zVarG != null) {
            sb2.append(d(zVarG.getType()));
            sb2.append(".");
        }
        boolean z10 = (zVarG == null || zVarJ == null) ? false : true;
        if (z10) {
            sb2.append("(");
        }
        if (zVarJ != null) {
            sb2.append(d(zVarJ.getType()));
            sb2.append(".");
        }
        if (z10) {
            sb2.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(zk.s sVar) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        a(sb2, sVar);
        yl.f name = ((cl.p) sVar).getName();
        kotlin.jvm.internal.n.e(name, "descriptor.name");
        sb2.append(f51061a.O(name, true));
        List listB = sVar.B();
        kotlin.jvm.internal.n.e(listB, "descriptor.valueParameters");
        xj.n.t0(listB, sb2, ", ", "(", ")", b.l, 48);
        sb2.append(": ");
        pm.y returnType = sVar.getReturnType();
        kotlin.jvm.internal.n.c(returnType);
        sb2.append(d(returnType));
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static String c(zk.h0 h0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h0Var.I() ? "var " : "val ");
        a(sb2, h0Var);
        yl.f name = h0Var.getName();
        kotlin.jvm.internal.n.e(name, "descriptor.name");
        sb2.append(f51061a.O(name, true));
        sb2.append(": ");
        pm.y type = h0Var.getType();
        kotlin.jvm.internal.n.e(type, "descriptor.type");
        sb2.append(d(type));
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static String d(pm.y type) {
        kotlin.jvm.internal.n.f(type, "type");
        return f51061a.Y(type);
    }
}
