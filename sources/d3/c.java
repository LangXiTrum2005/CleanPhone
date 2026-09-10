package d3;

import com.google.android.gms.internal.ads.xd1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.b0;
import i1.c0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l1.q;
import l1.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends no.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f38665b = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xd1 f38666c = new xd1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f38667d;

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // no.b
    public final c0 o(w2.a aVar, ByteBuffer byteBuffer) {
        b0 eVar;
        long j10;
        long j11;
        q qVar = this.f38665b;
        xd1 xd1Var = this.f38666c;
        x xVar = this.f38667d;
        if (xVar != null) {
            long j12 = aVar.f52921j;
            synchronized (xVar) {
                j11 = xVar.f44827b;
            }
            if (j12 != j11) {
                x xVar2 = new x(aVar.f47037g);
                this.f38667d = xVar2;
                xVar2.a(aVar.f47037g - aVar.f52921j);
            }
        } else {
            x xVar3 = new x(aVar.f47037g);
            this.f38667d = xVar3;
            xVar3.a(aVar.f47037g - aVar.f52921j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        qVar.K(bArrArray, iLimit);
        xd1Var.p(bArrArray, iLimit);
        xd1Var.t(39);
        long jI = (((long) xd1Var.i(1)) << 32) | ((long) xd1Var.i(32));
        xd1Var.t(20);
        int i10 = xd1Var.i(12);
        int i11 = xd1Var.i(8);
        qVar.N(14);
        if (i11 == 0) {
            eVar = new e();
        } else if (i11 == 255) {
            long jB = qVar.B();
            int i12 = i10 - 4;
            qVar.k(new byte[i12], 0, i12);
            eVar = new a(jB, jI, 0);
        } else if (i11 == 4) {
            int iZ = qVar.z();
            ArrayList arrayList = new ArrayList(iZ);
            for (int i13 = 0; i13 < iZ; i13++) {
                qVar.B();
                boolean z10 = (qVar.z() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z10) {
                    int iZ2 = qVar.z();
                    boolean z11 = (iZ2 & 64) != 0;
                    boolean z12 = (iZ2 & 32) != 0;
                    if (z11) {
                        qVar.B();
                    }
                    if (!z11) {
                        int iZ3 = qVar.z();
                        ArrayList arrayList3 = new ArrayList(iZ3);
                        for (int i14 = 0; i14 < iZ3; i14++) {
                            qVar.z();
                            qVar.B();
                            arrayList3.add(new fd.b(9));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z12) {
                        qVar.z();
                        qVar.B();
                    }
                    qVar.G();
                    qVar.z();
                    qVar.z();
                }
                arrayList.add(new am.e(arrayList2));
            }
            eVar = new f(arrayList);
        } else if (i11 == 5) {
            x xVar4 = this.f38667d;
            qVar.B();
            boolean z13 = (qVar.z() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z13) {
                j10 = C.TIME_UNSET;
            } else {
                int iZ4 = qVar.z();
                boolean z14 = (iZ4 & 64) != 0;
                boolean z15 = (iZ4 & 32) != 0;
                boolean z16 = (iZ4 & 16) != 0;
                long jD = (!z14 || z16) ? C.TIME_UNSET : a.d(jI, qVar);
                if (!z14) {
                    int iZ5 = qVar.z();
                    ArrayList arrayList4 = new ArrayList(iZ5);
                    for (int i15 = 0; i15 < iZ5; i15++) {
                        qVar.z();
                        xVar4.b(!z16 ? a.d(jI, qVar) : C.TIME_UNSET);
                        arrayList4.add(new rc.d(8));
                    }
                    list = arrayList4;
                }
                if (z15) {
                    qVar.z();
                    qVar.B();
                }
                qVar.G();
                qVar.z();
                qVar.z();
                j10 = jD;
            }
            eVar = new d(list, j10, xVar4.b(j10));
        } else if (i11 != 6) {
            eVar = null;
        } else {
            x xVar5 = this.f38667d;
            long jD2 = a.d(jI, qVar);
            eVar = new a(jD2, xVar5.b(jD2), 1);
        }
        return eVar == null ? new c0(new b0[0]) : new c0(eVar);
    }
}
