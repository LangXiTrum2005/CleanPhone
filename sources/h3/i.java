package h3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import n2.s;
import n2.t;
import n2.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j[] f42139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42140c;

    public i(long j10, j[] jVarArr, int i10) {
        this.f42138a = j10;
        this.f42139b = jVarArr;
        this.f42140c = i10;
    }

    @Override // n2.t
    public final long getDurationUs() {
        return this.f42138a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x009c A[SYNTHETIC] */
    @Override // n2.t
    public final s getSeekPoints(long j10) {
        long j11;
        long j12;
        long jMin;
        long j13;
        int i10;
        long jMin2;
        r rVar;
        long[] jArr;
        int iA;
        int iA2;
        int iB;
        j[] jVarArr = this.f42139b;
        int length = jVarArr.length;
        u uVar = u.f46492c;
        if (length == 0) {
            return new s(uVar, uVar);
        }
        int i11 = this.f42140c;
        if (i11 != -1) {
            r rVar2 = jVarArr[i11].f42142b;
            int iA3 = rVar2.a(j10);
            if (iA3 == -1) {
                iA3 = rVar2.b(j10);
            }
            long[] jArr2 = rVar2.f42199c;
            long[] jArr3 = rVar2.f42202f;
            if (iA3 == -1) {
                return new s(uVar, uVar);
            }
            j12 = jArr3[iA3];
            j11 = jArr2[iA3];
            if (j12 < j10 && iA3 < rVar2.f42198b - 1 && (iB = rVar2.b(j10)) != -1 && iB != iA3) {
                j13 = jArr3[iB];
                jMin = jArr2[iB];
            }
            jMin2 = j11;
            for (i10 = 0; i10 < jVarArr.length; i10++) {
                if (i10 != i11) {
                    rVar = jVarArr[i10].f42142b;
                    jArr = rVar.f42199c;
                    iA = rVar.a(j12);
                    if (iA == -1) {
                        iA = rVar.b(j12);
                    }
                    if (iA != -1) {
                        jMin2 = Math.min(jArr[iA], jMin2);
                    }
                    if (j13 == C.TIME_UNSET) {
                        iA2 = rVar.a(j13);
                        if (iA2 == -1) {
                            iA2 = rVar.b(j13);
                        }
                        if (iA2 == -1) {
                            jMin = Math.min(jArr[iA2], jMin);
                        }
                    }
                }
            }
            u uVar2 = new u(j12, jMin2);
            return j13 == C.TIME_UNSET ? new s(uVar2, uVar2) : new s(uVar2, new u(j13, jMin));
        }
        j11 = Long.MAX_VALUE;
        j12 = j10;
        jMin = -1;
        j13 = C.TIME_UNSET;
        jMin2 = j11;
        while (i10 < jVarArr.length) {
            if (i10 != i11) {
                rVar = jVarArr[i10].f42142b;
                jArr = rVar.f42199c;
                iA = rVar.a(j12);
                if (iA == -1) {
                    iA = rVar.b(j12);
                }
                if (iA != -1) {
                    jMin2 = Math.min(jArr[iA], jMin2);
                }
                if (j13 == C.TIME_UNSET) {
                    iA2 = rVar.a(j13);
                    if (iA2 == -1) {
                        iA2 = rVar.b(j13);
                    }
                    if (iA2 == -1) {
                        jMin = Math.min(jArr[iA2], jMin);
                    }
                }
            }
        }
        u uVar3 = new u(j12, jMin2);
        if (j13 == C.TIME_UNSET) {
        }
    }

    @Override // n2.t
    public final boolean isSeekable() {
        return true;
    }
}
