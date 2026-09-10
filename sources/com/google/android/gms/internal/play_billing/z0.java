package com.google.android.gms.internal.play_billing;

import com.applovin.impl.ca;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends t1 {
    private static final z0 zzb;
    private y1 zzd = q2.f24453e;

    static {
        z0 z0Var = new z0();
        zzb = z0Var;
        t1.k(z0.class, z0Var);
    }

    public static y0 n() {
        return (y0) zzb.f();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void o(z0 z0Var, ArrayList arrayList) {
        y1 y1Var = z0Var.zzd;
        if (!((d1) y1Var).f24256a) {
            int size = y1Var.size();
            z0Var.zzd = y1Var.f(size + size);
        }
        List list = z0Var.zzd;
        Charset charset = z1.f24507a;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof q2) {
            q2 q2Var = (q2) list;
            int i10 = q2Var.f24455c + size2;
            int length = q2Var.f24454b.length;
            if (i10 > length) {
                if (length != 0) {
                    while (length < i10) {
                        length = ca.v(length, 3, 2, 1, 10);
                    }
                    q2Var.f24454b = Arrays.copyOf(q2Var.f24454b, length);
                } else {
                    q2Var.f24454b = new Object[Math.max(i10, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i11 = 0; i11 < size4; i11++) {
            Object obj = arrayList.get(i11);
            if (obj == null) {
                String strH = defpackage.e.h(list.size() - size3, "Element at index ", " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        throw new NullPointerException(strH);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object d(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new r2(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", x0.class});
        }
        if (i11 == 3) {
            return new z0();
        }
        if (i11 == 4) {
            return new y0(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
