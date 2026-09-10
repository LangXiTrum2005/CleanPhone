package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 implements li0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18888a = Long.MIN_VALUE;

    public i1.s a() {
        return new i1.s(this);
    }

    public long b(ByteBuffer byteBuffer) {
        bc bcVar;
        ac acVar;
        long j10 = this.f18888a;
        if (j10 > 0) {
            return j10;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            yb ybVar = new yb(new s10(byteBufferDuplicate), u10.f20565c);
            ArrayList arrayList = ybVar.f22390f;
            List bx1Var = arrayList;
            if (ybVar.f22386b != null && ybVar.f22387c != yw1.f22384g) {
                bx1Var = arrayList;
                bx1Var = new bx1(arrayList, ybVar);
            }
            bx1Var = arrayList;
            Iterator it = bx1Var.iterator();
            while (true) {
                bcVar = null;
                if (!it.hasNext()) {
                    acVar = null;
                    break;
                }
                zb zbVar = (zb) it.next();
                if (zbVar instanceof ac) {
                    acVar = (ac) zbVar;
                    break;
                }
            }
            ArrayList arrayList2 = acVar.f22390f;
            List<zb> bx1Var2 = arrayList2;
            if (acVar.f22386b != null && acVar.f22387c != yw1.f22384g) {
                bx1Var2 = arrayList2;
                bx1Var2 = new bx1(arrayList2, acVar);
            }
            bx1Var2 = arrayList2;
            for (zb zbVar2 : bx1Var2) {
                if (zbVar2 instanceof bc) {
                    bcVar = (bc) zbVar2;
                    break;
                }
            }
            long j11 = (bcVar.f12714m * 1000) / bcVar.l;
            this.f18888a = j11;
            return j11;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.li0
    /* JADX INFO: renamed from: zza */
    public void mo161zza(Object obj) {
        uo0 uo0Var;
        o12 o12Var = (o12) obj;
        long j10 = this.f18888a;
        u12 u12Var = o12Var.f18090b;
        if (o12Var.equals(u12Var.f20578h) && (uo0Var = u12Var.l) != null) {
            w12 w12Var = (w12) uo0Var.f20839b;
            w12Var.L0 = true;
            iw0 iw0Var = w12Var.A0;
            Handler handler = (Handler) iw0Var.f15864b;
            if (handler != null) {
                handler.post(new x02(iw0Var, j10));
            }
        }
    }
}
