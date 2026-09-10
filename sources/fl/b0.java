package fl;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends r implements pl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeVariable f40979a;

    public b0(TypeVariable typeVariable) {
        kotlin.jvm.internal.n.f(typeVariable, "typeVariable");
        this.f40979a = typeVariable;
    }

    @Override // pl.b
    public final d a(yl.c fqName) {
        Annotation[] declaredAnnotations;
        kotlin.jvm.internal.n.f(fqName, "fqName");
        TypeVariable typeVariable = this.f40979a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return d0.c.j(declaredAnnotations, fqName);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            return kotlin.jvm.internal.n.a(this.f40979a, ((b0) obj).f40979a);
        }
        return false;
    }

    @Override // pl.b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f40979a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? xj.v.f53866a : d0.c.m(declaredAnnotations);
    }

    public final int hashCode() {
        return this.f40979a.hashCode();
    }

    public final String toString() {
        return b0.class.getName() + ": " + this.f40979a;
    }
}
