package o2;

import com.google.android.gms.internal.ads.bl0;
import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.d0;
import i1.e0;
import i1.o;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import l1.y;
import n2.a0;
import n2.j;
import n2.k;
import n2.l;
import n2.m;
import n2.r;
import n2.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f47055q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f47056r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f47057s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f47058t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f47060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f47062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47064f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f47066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f47067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f47068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a0 f47069k;
    public a0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t f47070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f47071n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f47072o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f47073p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f47059a = new byte[1];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47065g = -1;

    static {
        String str = y.f44830a;
        Charset charset = StandardCharsets.UTF_8;
        f47057s = "#!AMR\n".getBytes(charset);
        f47058t = "#!AMR-WB\n".getBytes(charset);
    }

    public a() {
        j jVar = new j();
        this.f47060b = jVar;
        this.l = jVar;
    }

    @Override // n2.k
    public final boolean a(l lVar) {
        return f(lVar);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00eb A[PHI: r4
  0x00eb: PHI (r4v1 n2.l) = (r4v0 n2.l), (r4v6 n2.l) binds: [B:53:0x00e9, B:56:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    @Override // n2.k
    public final int b(l lVar, q2 q2Var) throws e0 {
        l lVar2;
        int iC;
        int i10;
        this.f47069k.getClass();
        String str = y.f44830a;
        if (lVar.getPosition() == 0 && !f(lVar)) {
            throw e0.a(null, "Could not find AMR header.");
        }
        if (!this.f47073p) {
            this.f47073p = true;
            boolean z10 = this.f47061c;
            String str2 = MimeTypes.AUDIO_AMR_WB;
            String str3 = z10 ? MimeTypes.AUDIO_AMR_WB : "audio/amr";
            if (!z10) {
                str2 = MimeTypes.AUDIO_AMR_NB;
            }
            int i11 = z10 ? 16000 : 8000;
            int i12 = z10 ? f47056r[8] : f47055q[7];
            a0 a0Var = this.f47069k;
            o oVar = new o();
            oVar.l = d0.n(str3);
            oVar.f42600m = d0.n(str2);
            oVar.f42601n = i12;
            oVar.E = 1;
            oVar.F = i11;
            q4.a.o(oVar, a0Var);
        }
        int i13 = 0;
        if (this.f47064f == 0) {
            try {
                int iE = e(lVar);
                this.f47063e = iE;
                this.f47064f = iE;
                if (this.f47065g == -1) {
                    lVar.getPosition();
                    this.f47065g = this.f47063e;
                }
                if (this.f47065g == this.f47063e) {
                    this.f47066h++;
                }
                t tVar = this.f47070m;
                if (tVar instanceof r) {
                    r rVar = (r) tVar;
                    long j10 = this.f47067i + this.f47062d + 20000;
                    long position = lVar.getPosition() + ((long) this.f47063e);
                    bl0 bl0Var = rVar.f46488b;
                    int i14 = bl0Var.f12818a;
                    if (i14 == 0 || j10 - bl0Var.c(i14 - 1) >= 100000) {
                        bl0 bl0Var2 = rVar.f46487a;
                        bl0 bl0Var3 = rVar.f46488b;
                        if (bl0Var3.f12818a == 0 && j10 > 0) {
                            bl0Var2.a(0L);
                            bl0Var3.a(0L);
                        }
                        bl0Var2.a(position);
                        bl0Var3.a(j10);
                    }
                    if (this.f47071n && Math.abs(this.f47072o - j10) < 20000) {
                        this.f47071n = false;
                        this.l = this.f47069k;
                    }
                }
                lVar2 = lVar;
                iC = this.l.c(lVar2, this.f47064f, true);
                if (iC == -1) {
                    i13 = -1;
                } else {
                    i10 = this.f47064f - iC;
                    this.f47064f = i10;
                    if (i10 <= 0) {
                        this.l.a(this.f47062d + this.f47067i, 1, this.f47063e, 0, null);
                        this.f47062d += 20000;
                    }
                }
            } catch (EOFException unused) {
                lVar2 = lVar;
            }
        } else {
            lVar2 = lVar;
            iC = this.l.c(lVar2, this.f47064f, true);
            if (iC == -1) {
                i13 = -1;
            } else {
                i10 = this.f47064f - iC;
                this.f47064f = i10;
                if (i10 <= 0) {
                    this.l.a(this.f47062d + this.f47067i, 1, this.f47063e, 0, null);
                    this.f47062d += 20000;
                }
            }
        }
        lVar2.getLength();
        if (this.f47070m == null) {
            n2.o oVar2 = new n2.o(C.TIME_UNSET);
            this.f47070m = oVar2;
            this.f47068j.u(oVar2);
        }
        if (i13 == -1) {
            t tVar2 = this.f47070m;
            if (tVar2 instanceof r) {
                long j11 = this.f47067i + this.f47062d;
                ((r) tVar2).f46489c = j11;
                this.f47068j.u(tVar2);
                this.f47069k.e(j11);
            }
        }
        return i13;
    }

    @Override // n2.k
    public final void c(m mVar) {
        this.f47068j = mVar;
        a0 a0VarTrack = mVar.track(0, 1);
        this.f47069k = a0VarTrack;
        this.l = a0VarTrack;
        mVar.endTracks();
    }

    public final int e(l lVar) throws e0 {
        boolean z10;
        lVar.resetPeekPosition();
        byte[] bArr = this.f47059a;
        lVar.peekFully(bArr, 0, 1);
        byte b10 = bArr[0];
        if ((b10 & 131) > 0) {
            throw e0.a(null, "Invalid padding bits for frame header " + ((int) b10));
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.f47061c) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? f47056r[i10] : f47055q[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f47061c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw e0.a(null, sb2.toString());
    }

    public final boolean f(l lVar) {
        lVar.resetPeekPosition();
        byte[] bArr = f47057s;
        byte[] bArr2 = new byte[bArr.length];
        lVar.peekFully(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f47061c = false;
            lVar.skipFully(bArr.length);
            return true;
        }
        lVar.resetPeekPosition();
        byte[] bArr3 = f47058t;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.peekFully(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f47061c = true;
        lVar.skipFully(bArr3.length);
        return true;
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        this.f47062d = 0L;
        this.f47063e = 0;
        this.f47064f = 0;
        this.f47072o = j11;
        t tVar = this.f47070m;
        if (!(tVar instanceof r)) {
            if (j10 == 0 || !(tVar instanceof g3.a)) {
                this.f47067i = 0L;
                return;
            } else {
                g3.a aVar = (g3.a) tVar;
                this.f47067i = (Math.max(0L, j10 - aVar.f41420b) * 8000000) / ((long) aVar.f41423e);
                return;
            }
        }
        r rVar = (r) tVar;
        bl0 bl0Var = rVar.f46488b;
        long jC = bl0Var.f12818a == 0 ? C.TIME_UNSET : bl0Var.c(y.c(rVar.f46487a, j10));
        this.f47067i = jC;
        if (Math.abs(this.f47072o - jC) < 20000) {
            return;
        }
        this.f47071n = true;
        this.l = this.f47060b;
    }

    @Override // n2.k
    public final void release() {
    }
}
