package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w0 f24646c = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f24648b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f24647a = new k0();

    public final z0 a(Class cls) {
        z0 z0VarZ;
        Class cls2;
        b0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f24648b;
        z0 z0Var = (z0) concurrentHashMap.get(cls);
        if (z0Var != null) {
            return z0Var;
        }
        k0 k0Var = this.f24647a;
        k0Var.getClass();
        Class cls3 = a1.f24535a;
        if (!x.class.isAssignableFrom(cls) && (cls2 = a1.f24535a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        y0 y0VarA = ((j0) k0Var.f24598a).a(cls);
        int i10 = y0VarA.f24657d;
        a aVar = y0VarA.f24654a;
        if ((i10 & 2) == 2) {
            if (x.class.isAssignableFrom(cls)) {
                z0VarZ = new s0(a1.f24537c, r.f24615a, aVar);
            } else {
                d1 d1Var = a1.f24536b;
                q qVar = r.f24616b;
                if (qVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                z0VarZ = new s0(d1Var, qVar, aVar);
            }
        } else if (x.class.isAssignableFrom(cls)) {
            q qVar2 = null;
            t0 t0Var = u0.f24643b;
            g0 g0Var = h0.f24567b;
            d1 d1Var2 = a1.f24537c;
            if (v0.i.c(y0VarA.a()) != 1) {
                qVar2 = r.f24615a;
            }
            q qVar3 = qVar2;
            m0 m0Var = n0.f24610b;
            if (!(y0VarA instanceof y0)) {
                int[] iArr = r0.f24617n;
                y0VarA.getClass();
                throw new ClassCastException();
            }
            z0VarZ = r0.z(y0VarA, t0Var, g0Var, d1Var2, qVar3, m0Var);
        } else {
            q qVar4 = null;
            t0 t0Var2 = u0.f24642a;
            g0 g0Var2 = h0.f24566a;
            d1 d1Var3 = a1.f24536b;
            if (v0.i.c(y0VarA.a()) != 1 && (qVar4 = r.f24616b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            q qVar5 = qVar4;
            m0 m0Var2 = n0.f24609a;
            if (!(y0VarA instanceof y0)) {
                int[] iArr2 = r0.f24617n;
                y0VarA.getClass();
                throw new ClassCastException();
            }
            z0VarZ = r0.z(y0VarA, t0Var2, g0Var2, d1Var3, qVar5, m0Var2);
        }
        z0 z0Var2 = (z0) concurrentHashMap.putIfAbsent(cls, z0VarZ);
        return z0Var2 != null ? z0Var2 : z0VarZ;
    }
}
