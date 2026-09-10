package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f22873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p1 f22874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p1 f22875c;

    static {
        Class<?> cls;
        Class<?> cls2;
        p1 p1Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f22873a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                p1Var = (p1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f22874b = p1Var;
        f22875c = new p1();
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
    public static void a(p1 p1Var, Object obj, Object obj2) {
        p1Var.getClass();
        m0 m0Var = (m0) obj;
        o1 o1Var = m0Var.zzc;
        o1 o1Var2 = ((m0) obj2).zzc;
        o1 o1Var3 = o1.f22883e;
        if (!o1Var3.equals(o1Var2)) {
            if (o1Var3.equals(o1Var)) {
                int i10 = o1Var.f22884a + o1Var2.f22884a;
                int[] iArrCopyOf = Arrays.copyOf(o1Var.f22885b, i10);
                System.arraycopy(o1Var2.f22885b, 0, iArrCopyOf, o1Var.f22884a, o1Var2.f22884a);
                Object[] objArrCopyOf = Arrays.copyOf(o1Var.f22886c, i10);
                System.arraycopy(o1Var2.f22886c, 0, objArrCopyOf, o1Var.f22884a, o1Var2.f22884a);
                o1Var = new o1(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                o1Var.getClass();
                if (!o1Var2.equals(o1Var3)) {
                    if (!o1Var.f22887d) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = o1Var.f22884a + o1Var2.f22884a;
                    o1Var.c(i11);
                    System.arraycopy(o1Var2.f22885b, 0, o1Var.f22885b, o1Var.f22884a, o1Var2.f22884a);
                    System.arraycopy(o1Var2.f22886c, 0, o1Var.f22886c, o1Var.f22884a, o1Var2.f22884a);
                    o1Var.f22884a = i11;
                }
            }
        }
        m0Var.zzc = o1Var;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
