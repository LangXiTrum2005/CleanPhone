package com.smartdigimkt.w3;

import com.smartdigimkt.j4.f0;

/* JADX INFO: loaded from: classes6.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f39367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.smartdigimkt.j4.s.a f39369c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39370e;
    public final int f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f0 f39371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.smartdigimkt.m4.i f39372i;
    public volatile long j;
    public volatile long k;

    public u(e0 e0Var, long j, f0 f0Var, com.smartdigimkt.m4.i iVar) {
        this(e0Var, null, new com.smartdigimkt.j4.s.a(0), j, -9223372036854775807L, 1, false, f0Var, iVar);
    }

    public u a(com.smartdigimkt.j4.s.a aVar, long j, long j2) {
        return new u(this.f39367a, this.f39368b, aVar, j, aVar.a() ? j2 : -9223372036854775807L, this.f, this.g, this.f39371h, this.f39372i);
    }

    public u b(int i2) {
        u uVar = new u(this.f39367a, this.f39368b, this.f39369c, this.d, this.f39370e, i2, this.g, this.f39371h, this.f39372i);
        a(this, uVar);
        return uVar;
    }

    public u(e0 e0Var, Object obj, com.smartdigimkt.j4.s.a aVar, long j, long j2, int i2, boolean z2, f0 f0Var, com.smartdigimkt.m4.i iVar) {
        this.f39367a = e0Var;
        this.f39368b = obj;
        this.f39369c = aVar;
        this.d = j;
        this.f39370e = j2;
        this.j = j;
        this.k = j;
        this.f = i2;
        this.g = z2;
        this.f39371h = f0Var;
        this.f39372i = iVar;
    }

    public u a(int i2) {
        u uVar = new u(this.f39367a, this.f39368b, this.f39369c.a(i2), this.d, this.f39370e, this.f, this.g, this.f39371h, this.f39372i);
        a(this, uVar);
        return uVar;
    }

    public u a(e0 e0Var, Object obj) {
        u uVar = new u(e0Var, obj, this.f39369c, this.d, this.f39370e, this.f, this.g, this.f39371h, this.f39372i);
        a(this, uVar);
        return uVar;
    }

    public u a(boolean z2) {
        u uVar = new u(this.f39367a, this.f39368b, this.f39369c, this.d, this.f39370e, this.f, z2, this.f39371h, this.f39372i);
        a(this, uVar);
        return uVar;
    }

    public u a(f0 f0Var, com.smartdigimkt.m4.i iVar) {
        u uVar = new u(this.f39367a, this.f39368b, this.f39369c, this.d, this.f39370e, this.f, this.g, f0Var, iVar);
        a(this, uVar);
        return uVar;
    }

    private static void a(u uVar, u uVar2) {
        uVar2.j = uVar.j;
        uVar2.k = uVar.k;
    }
}
