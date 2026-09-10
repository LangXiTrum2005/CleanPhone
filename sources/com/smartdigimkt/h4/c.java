package com.smartdigimkt.h4;

import com.smartdigimkt.p4.c0;
import com.smartdigimkt.p4.r;
import com.smartdigimkt.p4.s;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements com.smartdigimkt.e4.b {
    private static final int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f35635e = 4;
    private static final int f = 5;
    private static final int g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f35636h = 255;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f35637a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f35638b = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c0 f35639c;

    @Override // com.smartdigimkt.e4.b
    public com.smartdigimkt.e4.a a(com.smartdigimkt.e4.e eVar) throws com.smartdigimkt.e4.c {
        com.smartdigimkt.e4.a.b eVar2;
        c0 c0Var = this.f35639c;
        if (c0Var == null || eVar.f34612i != c0Var.c()) {
            c0 c0Var2 = new c0(eVar.d);
            this.f35639c = c0Var2;
            c0Var2.a(eVar.d - eVar.f34612i);
        }
        ByteBuffer byteBuffer = eVar.f40353c;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f35637a.a(bArrArray, iLimit);
        this.f35638b.a(bArrArray, iLimit);
        this.f35638b.c(39);
        long jA = (((long) this.f35638b.a(1)) << 32) | ((long) this.f35638b.a(32));
        this.f35638b.c(20);
        int iA = this.f35638b.a(12);
        int iA2 = this.f35638b.a(8);
        this.f35637a.f(14);
        if (iA2 == 0) {
            eVar2 = new e();
        } else if (iA2 == 255) {
            eVar2 = a.a(this.f35637a, iA, jA);
        } else if (iA2 == 4) {
            eVar2 = f.a(this.f35637a);
        } else if (iA2 != 5) {
            eVar2 = iA2 != 6 ? null : g.a(this.f35637a, jA, this.f35639c);
        } else {
            eVar2 = d.a(this.f35637a, jA, this.f35639c);
        }
        return eVar2 == null ? new com.smartdigimkt.e4.a(new com.smartdigimkt.e4.a.b[0]) : new com.smartdigimkt.e4.a(eVar2);
    }
}
