package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ce0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ee0 f13142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh f13143c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ce0(ee0 ee0Var, df0 df0Var, int i10) {
        this.f13141a = i10;
        switch (i10) {
            case 1:
                this.f13142b = ee0Var;
                this.f13143c = (qh) df0Var;
                break;
            default:
                this.f13142b = ee0Var;
                this.f13143c = (qh) df0Var;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
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
    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f13141a) {
            case 0:
                this.f13142b.g(this.f13143c);
                break;
            default:
                this.f13142b.h(this.f13143c);
                break;
        }
    }
}
