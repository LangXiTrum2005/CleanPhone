package c2;

import b2.m;
import i1.o;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import l1.q;
import l1.y;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f5897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f5898b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5900d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5903g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5899c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5901e = -1;

    public h(m mVar) {
        this.f5897a = mVar;
    }

    @Override // c2.i
    public final void a(n2.m mVar, int i10) {
        a0 a0VarTrack = mVar.track(i10, 1);
        this.f5898b = a0VarTrack;
        a0VarTrack.b(this.f5897a.f5327c);
    }

    @Override // c2.i
    public final void b(q qVar, long j10, int i10, boolean z10) {
        this.f5898b.getClass();
        if (!this.f5902f) {
            int i11 = qVar.f44814b;
            go.k.h("ID Header has insufficient data", qVar.f44815c > 18);
            go.k.h("ID Header missing", qVar.x(8, StandardCharsets.UTF_8).equals("OpusHead"));
            go.k.h("version number must always be 1", qVar.z() == 1);
            qVar.M(i11);
            ArrayList arrayListC = n2.b.c(qVar.f44813a);
            o oVarA = this.f5897a.f5327c.a();
            oVarA.f42603p = arrayListC;
            q4.a.o(oVarA, this.f5898b);
            this.f5902f = true;
        } else if (this.f5903g) {
            int iA = b2.i.a(this.f5901e);
            if (i10 != iA) {
                String str = y.f44830a;
                Locale locale = Locale.US;
                l1.a.s("RtpOpusReader", l1.d.f("Received RTP packet with unexpected sequence number. Expected: ", iA, "; received: ", i10, "."));
            }
            int iA2 = qVar.a();
            this.f5898b.g(iA2, qVar);
            this.f5898b.a(r9.b.B(48000, this.f5900d, j10, this.f5899c), 1, iA2, 0, null);
        } else {
            go.k.h("Comment Header has insufficient data", qVar.f44815c >= 8);
            go.k.h("Comment Header should follow ID Header", qVar.x(8, StandardCharsets.UTF_8).equals("OpusTags"));
            this.f5903g = true;
        }
        this.f5901e = i10;
    }

    @Override // c2.i
    public final void c(long j10) {
        this.f5899c = j10;
    }

    @Override // c2.i
    public final void seek(long j10, long j11) {
        this.f5899c = j10;
        this.f5900d = j11;
    }
}
