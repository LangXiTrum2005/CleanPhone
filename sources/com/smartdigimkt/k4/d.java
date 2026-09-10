package com.smartdigimkt.k4;

import com.smartdigimkt.j4.p;
import com.smartdigimkt.w3.e0;

/* JADX INFO: loaded from: classes.dex */
final class d extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f36204c;

    public d(e0 e0Var, a aVar) {
        super(e0Var);
        com.smartdigimkt.p4.a.b(e0Var.a() == 1);
        com.smartdigimkt.p4.a.b(e0Var.b() == 1);
        this.f36204c = aVar;
    }

    @Override // com.smartdigimkt.j4.p, com.smartdigimkt.w3.e0
    public e0.b a(int i2, e0.b bVar, boolean z2) {
        this.f36012b.a(i2, bVar, z2);
        bVar.a(bVar.f39263a, bVar.f39264b, bVar.f39265c, bVar.d, bVar.f(), this.f36204c);
        return bVar;
    }

    @Override // com.smartdigimkt.j4.p, com.smartdigimkt.w3.e0
    public e0.c a(int i2, e0.c cVar, boolean z2, long j) {
        e0.c cVarA = super.a(i2, cVar, z2, j);
        if (cVarA.f39272i == -9223372036854775807L) {
            cVarA.f39272i = this.f36204c.f36186e;
        }
        return cVarA;
    }
}
