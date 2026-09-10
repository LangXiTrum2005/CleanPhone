package c2;

import b2.m;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.p;
import java.util.Locale;
import l1.q;
import l1.y;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f5895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5896g;

    public g(m mVar) {
        this.f5895f = mVar;
        this.f5893d = C.TIME_UNSET;
        this.f5891b = -1;
    }

    @Override // c2.i
    public void a(n2.m mVar, int i10) {
        a0 a0VarTrack = mVar.track(i10, 2);
        this.f5896g = a0VarTrack;
        String str = y.f44830a;
        a0VarTrack.b(((m) this.f5895f).f5327c);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    @Override // c2.i
    public void b(q qVar, long j10, int i10, boolean z10) {
        int i11;
        int iA;
        ((a0) this.f5896g).getClass();
        int i12 = this.f5891b;
        if (i12 != -1 && i10 != (iA = b2.i.a(i12))) {
            String str = y.f44830a;
            Locale locale = Locale.US;
            l1.a.s("RtpMpeg4Reader", l1.d.f("Received RTP packet with unexpected sequence number. Expected: ", iA, "; received: ", i10, ". Dropping packet."));
        }
        int iA2 = qVar.a();
        ((a0) this.f5896g).g(iA2, qVar);
        if (this.f5892c == 0) {
            byte[] bArr = qVar.f44813a;
            byte[] bArr2 = {0, 0, 1, -74};
            go.k.o(bArr, "array");
            int i13 = 0;
            loop0: while (true) {
                if (i13 >= bArr.length - 3) {
                    i13 = -1;
                    break;
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= 4) {
                        break loop0;
                    } else if (bArr[i13 + i14] != bArr2[i14]) {
                        break;
                    } else {
                        i14++;
                    }
                }
                i13++;
            }
            if (i13 != -1) {
                qVar.M(i13 + 4);
                if ((qVar.j() >> 6) == 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
            } else {
                i11 = 0;
            }
            this.f5890a = i11;
        }
        this.f5892c += iA2;
        if (z10) {
            if (this.f5893d == C.TIME_UNSET) {
                this.f5893d = j10;
            }
            ((a0) this.f5896g).a(r9.b.B(90000, this.f5894e, j10, this.f5893d), this.f5890a, this.f5892c, 0, null);
            this.f5892c = 0;
        }
        this.f5891b = i10;
    }

    @Override // c2.i
    public void seek(long j10, long j11) {
        this.f5893d = j10;
        this.f5894e = j11;
        this.f5892c = 0;
    }

    public g(int i10, int i11, p pVar, int i12, Object obj, long j10, long j11) {
        this.f5890a = i10;
        this.f5891b = i11;
        this.f5895f = pVar;
        this.f5892c = i12;
        this.f5896g = obj;
        this.f5893d = j10;
        this.f5894e = j11;
    }

    @Override // c2.i
    public void c(long j10) {
    }
}
