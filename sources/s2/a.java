package s2;

import com.google.android.gms.internal.ads.q2;
import com.google.android.gms.internal.ads.s2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteOrder;
import l1.q;
import n2.e;
import n2.f;
import n2.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s2 f50074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2 f50076c = new q2();

    public a(s2 s2Var, int i10) {
        this.f50074a = s2Var;
        this.f50075b = i10;
    }

    @Override // n2.f
    public final e a(l lVar, long j10) {
        long position = lVar.getPosition();
        long jC = c(lVar);
        long peekPosition = lVar.getPeekPosition();
        lVar.advancePeekPosition(Math.max(6, this.f50074a.f19770c));
        long jC2 = c(lVar);
        long peekPosition2 = lVar.getPeekPosition();
        if (jC > j10 || jC2 <= j10) {
            return jC2 <= j10 ? new e(-2, jC2, peekPosition2) : new e(-1, jC, position);
        }
        return new e(0, C.TIME_UNSET, peekPosition);
    }

    public final long c(l lVar) {
        q2 q2Var;
        s2 s2Var;
        int iW;
        while (true) {
            long peekPosition = lVar.getPeekPosition();
            long length = lVar.getLength() - 6;
            q2Var = this.f50076c;
            s2Var = this.f50074a;
            if (peekPosition >= length) {
                break;
            }
            long peekPosition2 = lVar.getPeekPosition();
            q qVar = new q(17);
            int i10 = 0;
            boolean zD = false;
            lVar.peekFully(qVar.f44813a, 0, 2);
            char cG = qVar.g(0, ByteOrder.BIG_ENDIAN);
            int i11 = this.f50075b;
            if (cG != i11) {
                lVar.resetPeekPosition();
                lVar.advancePeekPosition((int) (peekPosition2 - lVar.getPosition()));
            } else {
                byte[] bArr = qVar.f44813a;
                while (i10 < 15 && (iW = lVar.w(bArr, 2 + i10, 15 - i10)) != -1) {
                    i10 += iW;
                }
                qVar.L(i10 + 2);
                lVar.resetPeekPosition();
                lVar.advancePeekPosition((int) (peekPosition2 - lVar.getPosition()));
                zD = n2.b.d(qVar, s2Var, i11, q2Var);
            }
            if (zD) {
                break;
            }
            lVar.advancePeekPosition(1);
        }
        if (lVar.getPeekPosition() < lVar.getLength() - 6) {
            return q2Var.f18888a;
        }
        lVar.advancePeekPosition((int) (lVar.getLength() - lVar.getPeekPosition()));
        return s2Var.f19777j;
    }
}
