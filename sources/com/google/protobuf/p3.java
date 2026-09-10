package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p3 f24916c = new p3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f24918b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2 f24917a = new u2(0);

    public final x3 a(Class cls) {
        x3 x3VarB;
        Class cls2;
        Internal.checkNotNull(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f24918b;
        x3 x3Var = (x3) concurrentHashMap.get(cls);
        if (x3Var != null) {
            return x3Var;
        }
        u2 u2Var = this.f24917a;
        u2Var.getClass();
        Class cls3 = y3.f25041a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = y3.f25041a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        z2 z2VarA = ((a3) u2Var.f24959a).a(cls);
        if (z2VarA.a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                x3VarB = new e3(y3.f25043c, l1.f24894a, z2VarA.b());
            } else {
                q4 q4Var = y3.f25042b;
                i1 i1Var = l1.f24895b;
                if (i1Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                x3VarB = new e3(q4Var, i1Var, z2VarA.b());
            }
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            x3VarB = s2.f24947a[z2VarA.getSyntax().ordinal()] != 1 ? d3.B(z2VarA, i3.f24861b, p2.f24915b, y3.f25043c, l1.f24894a, y2.f25040b) : d3.B(z2VarA, i3.f24861b, p2.f24915b, y3.f25043c, null, y2.f25040b);
        } else if (s2.f24947a[z2VarA.getSyntax().ordinal()] != 1) {
            h3 h3Var = i3.f24860a;
            n2 n2Var = p2.f24914a;
            q4 q4Var2 = y3.f25042b;
            i1 i1Var2 = l1.f24895b;
            if (i1Var2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            x3VarB = d3.B(z2VarA, h3Var, n2Var, q4Var2, i1Var2, y2.f25039a);
        } else {
            x3VarB = d3.B(z2VarA, i3.f24860a, p2.f24914a, y3.f25042b, null, y2.f25039a);
        }
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(x3VarB, "schema");
        x3 x3Var2 = (x3) concurrentHashMap.putIfAbsent(cls, x3VarB);
        return x3Var2 != null ? x3Var2 : x3VarB;
    }
}
