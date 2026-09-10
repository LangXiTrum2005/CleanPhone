package jl;

import com.google.android.gms.internal.measurement.nf;
import com.ironsource.X3;
import il.y;
import kotlin.jvm.internal.n;
import wk.l;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yl.f f43969a = yl.f.e("message");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yl.f f43970b = yl.f.e("allowedTargets");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final yl.f f43971c = yl.f.e(X3.i.X);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f43972d = b0.Q(new wj.f(l.f53356t, y.f43122c), new wj.f(l.f53359w, y.f43123d), new wj.f(l.f53360x, y.f43125f));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public static kl.g a(yl.c kotlinName, pl.b annotationOwner, nf c4) {
        fl.d dVarA;
        n.f(kotlinName, "kotlinName");
        n.f(annotationOwner, "annotationOwner");
        n.f(c4, "c");
        if (kotlinName.equals(l.f53349m)) {
            yl.c DEPRECATED_ANNOTATION = y.f43124e;
            n.e(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            fl.d dVarA2 = annotationOwner.a(DEPRECATED_ANNOTATION);
            if (dVarA2 != null) {
                return new g(dVarA2, c4);
            }
        }
        yl.c cVar = (yl.c) f43972d.get(kotlinName);
        if (cVar == null || (dVarA = annotationOwner.a(cVar)) == null) {
            return null;
        }
        return b(c4, dVarA, false);
    }

    public static kl.g b(nf c4, fl.d annotation, boolean z10) {
        n.f(annotation, "annotation");
        n.f(c4, "c");
        yl.b bVarA = fl.c.a(d0.c.p(d0.c.l(annotation.f40988a)));
        if (bVarA.equals(yl.b.j(y.f43122c))) {
            return new j(annotation, c4);
        }
        if (bVarA.equals(yl.b.j(y.f43123d))) {
            return new i(annotation, c4);
        }
        if (bVarA.equals(yl.b.j(y.f43125f))) {
            return new b(c4, annotation, l.f53360x);
        }
        if (bVarA.equals(yl.b.j(y.f43124e))) {
            return null;
        }
        return new ml.f(c4, annotation, z10);
    }
}
