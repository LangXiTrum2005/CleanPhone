package v0;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.c1;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b0 {
    private static final g DEFAULT_INSTANCE;
    private static volatile z0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private d0 strings_ = b1.f4054d;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        b0.j(g.class, gVar);
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
    public static void l(g gVar, Set set) {
        d0 d0Var = gVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) d0Var).f4053a) {
            int size = d0Var.size();
            gVar.strings_ = ((b1) d0Var).m(size == 0 ? 10 : size * 2);
        }
        List list = gVar.strings_;
        Charset charset = e0.f4067a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(set.size() + list.size());
        }
        int size2 = list.size();
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                    list.remove(size3);
                }
                throw new NullPointerException(str);
            }
            list.add(obj);
        }
    }

    public static g m() {
        return DEFAULT_INSTANCE;
    }

    public static f o() {
        return (f) ((z) DEFAULT_INSTANCE.c(5));
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final Object c(int i10) {
        z0 a0Var;
        switch (i.c(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new c1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0 z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (g.class) {
                    try {
                        a0Var = PARSER;
                        if (a0Var == null) {
                            a0Var = new a0();
                            PARSER = a0Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return a0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final d0 n() {
        return this.strings_;
    }
}
