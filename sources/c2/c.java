package c2;

import b2.m;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Locale;
import l1.q;
import l1.y;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f5850h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f5851i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f5852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0 f5855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5858g;

    public c(m mVar) {
        this.f5852a = mVar;
        String str = mVar.f5327c.f42643n;
        str.getClass();
        this.f5853b = MimeTypes.AUDIO_AMR_WB.equals(str);
        this.f5854c = mVar.f5326b;
        this.f5856e = C.TIME_UNSET;
        this.f5858g = -1;
        this.f5857f = 0L;
    }

    @Override // c2.i
    public final void a(n2.m mVar, int i10) {
        a0 a0VarTrack = mVar.track(i10, 1);
        this.f5855d = a0VarTrack;
        a0VarTrack.b(this.f5852a.f5327c);
    }

    @Override // c2.i
    public final void b(q qVar, long j10, int i10, boolean z10) {
        int iA;
        this.f5855d.getClass();
        int i11 = this.f5858g;
        if (i11 != -1 && i10 != (iA = b2.i.a(i11))) {
            String str = y.f44830a;
            Locale locale = Locale.US;
            l1.a.s("RtpAmrReader", l1.d.f("Received RTP packet with unexpected sequence number. Expected: ", iA, "; received: ", i10, "."));
        }
        qVar.N(1);
        int iJ = (qVar.j() >> 3) & 15;
        boolean z11 = (iJ >= 0 && iJ <= 8) || iJ == 15;
        boolean z12 = this.f5853b;
        String str2 = z12 ? "WB" : "NB";
        if (!z11) {
            throw new IllegalArgumentException(j1.f.B("Illegal AMR %s frame type %s", str2, Integer.valueOf(iJ)));
        }
        int i12 = z12 ? f5851i[iJ] : f5850h[iJ];
        int iA2 = qVar.a();
        go.k.h("compound payload not supported currently", iA2 == i12);
        this.f5855d.g(iA2, qVar);
        this.f5855d.a(r9.b.B(this.f5854c, this.f5857f, j10, this.f5856e), 1, iA2, 0, null);
        this.f5858g = i10;
    }

    @Override // c2.i
    public final void c(long j10) {
        this.f5856e = j10;
    }

    @Override // c2.i
    public final void seek(long j10, long j11) {
        this.f5856e = j10;
        this.f5857f = j11;
    }
}
