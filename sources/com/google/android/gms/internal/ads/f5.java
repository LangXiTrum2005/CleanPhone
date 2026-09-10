package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l2 f14214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f14215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f7 f14216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f14217e;

    static {
        aa1 aa1Var = ca1.f13122b;
        ya1 ya1Var = ya1.f22208e;
        List list = Collections.EMPTY_LIST;
        t3 t3Var = t3.f20138a;
        new b0();
        f7 f7Var = f7.B;
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ f5(String str, b0 b0Var, l2 l2Var, w1 w1Var, f7 f7Var) {
        t3 t3Var = t3.f20138a;
        this.f14213a = str;
        this.f14214b = l2Var;
        this.f14215c = w1Var;
        this.f14216d = f7Var;
        this.f14217e = b0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        if (!this.f14213a.equals(f5Var.f14213a) || !this.f14217e.equals(f5Var.f14217e) || !Objects.equals(this.f14214b, f5Var.f14214b) || !this.f14215c.equals(f5Var.f14215c) || !Objects.equals(this.f14216d, f5Var.f14216d)) {
            return false;
        }
        t3 t3Var = t3.f20138a;
        return t3Var.equals(t3Var);
    }

    public final int hashCode() {
        int iHashCode = this.f14213a.hashCode() * 31;
        l2 l2Var = this.f14214b;
        return (this.f14216d.hashCode() + ((this.f14217e.hashCode() + ((this.f14215c.hashCode() + ((iHashCode + (l2Var != null ? l2Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}
