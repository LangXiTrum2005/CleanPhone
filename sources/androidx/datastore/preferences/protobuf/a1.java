package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a1 f4050c = new a1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4052b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f4051a = new n0();

    public final d1 a(Class cls) {
        d1 d1VarW;
        Class cls2;
        e0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f4052b;
        d1 d1Var = (d1) concurrentHashMap.get(cls);
        if (d1Var != null) {
            return d1Var;
        }
        n0 n0Var = this.f4051a;
        n0Var.getClass();
        Class cls3 = e1.f4069a;
        if (!b0.class.isAssignableFrom(cls) && (cls2 = e1.f4069a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        c1 c1VarA = ((m0) n0Var.f4139a).a(cls);
        int i10 = c1VarA.f4062d;
        a aVar = c1VarA.f4059a;
        if ((i10 & 2) == 2) {
            if (b0.class.isAssignableFrom(cls)) {
                d1VarW = new w0(e1.f4071c, u.f4169a, aVar);
            } else {
                l1 l1Var = e1.f4070b;
                t tVar = u.f4170b;
                if (tVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                d1VarW = new w0(l1Var, tVar, aVar);
            }
        } else if (b0.class.isAssignableFrom(cls)) {
            t tVar2 = null;
            x0 x0Var = y0.f4200b;
            j0 j0Var = k0.f4115b;
            l1 l1Var2 = e1.f4071c;
            if (v0.i.c(c1VarA.a()) != 1) {
                tVar2 = u.f4169a;
            }
            t tVar3 = tVar2;
            r0 r0Var = s0.f4167b;
            if (!(c1VarA instanceof c1)) {
                int[] iArr = v0.f4175n;
                c1VarA.getClass();
                throw new ClassCastException();
            }
            d1VarW = v0.w(c1VarA, x0Var, j0Var, l1Var2, tVar3, r0Var);
        } else {
            t tVar4 = null;
            x0 x0Var2 = y0.f4199a;
            j0 j0Var2 = k0.f4114a;
            l1 l1Var3 = e1.f4070b;
            if (v0.i.c(c1VarA.a()) != 1 && (tVar4 = u.f4170b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            t tVar5 = tVar4;
            r0 r0Var2 = s0.f4166a;
            if (!(c1VarA instanceof c1)) {
                int[] iArr2 = v0.f4175n;
                c1VarA.getClass();
                throw new ClassCastException();
            }
            d1VarW = v0.w(c1VarA, x0Var2, j0Var2, l1Var3, tVar5, r0Var2);
        }
        d1 d1Var2 = (d1) concurrentHashMap.putIfAbsent(cls, d1VarW);
        return d1Var2 != null ? d1Var2 : d1VarW;
    }
}
