package androidx.recyclerview.widget;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.a3;
import com.google.android.gms.internal.ads.f3;
import com.google.android.gms.internal.ads.h3;
import com.google.android.gms.internal.ads.n2;
import com.google.android.gms.internal.ads.o2;
import com.google.android.gms.internal.ads.ps1;
import com.google.android.gms.internal.ads.ql0;
import com.google.android.gms.internal.ads.qv0;
import com.google.android.gms.internal.ads.v71;
import com.google.android.gms.internal.ads.wj;
import com.google.android.gms.internal.ads.xj;
import com.google.android.gms.tasks.OnFailureListener;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements n2, o2, qv0, OnFailureListener, n2.l, n2.m, s1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4729c;

    public /* synthetic */ c(long j10, Object obj, int i10) {
        this.f4727a = i10;
        this.f4728b = j10;
        this.f4729c = obj;
    }

    @Override // s1.g
    public long A() {
        return 0L;
    }

    @Override // s1.g
    public long B(long j10, long j11) {
        return ((n2.g) this.f4729c).f46457a;
    }

    public void D(int i10) {
        if (i10 < 64) {
            this.f4728b &= ~(1 << i10);
            return;
        }
        c cVar = (c) this.f4729c;
        if (cVar != null) {
            cVar.D(i10 - 64);
        }
    }

    public int E(int i10) {
        c cVar = (c) this.f4729c;
        if (cVar == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f4728b);
            }
            return Long.bitCount(((1 << i10) - 1) & this.f4728b);
        }
        if (i10 < 64) {
            return Long.bitCount(((1 << i10) - 1) & this.f4728b);
        }
        return Long.bitCount(this.f4728b) + cVar.E(i10 - 64);
    }

    public void F() {
        if (((c) this.f4729c) == null) {
            this.f4729c = new c(0);
        }
    }

    public boolean G(int i10) {
        if (i10 < 64) {
            return ((1 << i10) & this.f4728b) != 0;
        }
        F();
        return ((c) this.f4729c).G(i10 - 64);
    }

    public void H(int i10, boolean z10) {
        if (i10 >= 64) {
            F();
            ((c) this.f4729c).H(i10 - 64, z10);
            return;
        }
        long j10 = this.f4728b;
        boolean z11 = (Long.MIN_VALUE & j10) != 0;
        long j11 = (1 << i10) - 1;
        this.f4728b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            L(i10);
        } else {
            D(i10);
        }
        if (z11 || ((c) this.f4729c) != null) {
            F();
            ((c) this.f4729c).H(0, z11);
        }
    }

    public xn.l I() {
        h2.d dVar = new h2.d(4, false);
        while (true) {
            String utf8LineStrict = ((lo.g) this.f4729c).readUtf8LineStrict(this.f4728b);
            this.f4728b -= (long) utf8LineStrict.length();
            if (utf8LineStrict.length() == 0) {
                return dVar.i();
            }
            int iV0 = an.h.v0(utf8LineStrict, ':', 1, 4);
            if (iV0 != -1) {
                String strSubstring = utf8LineStrict.substring(0, iV0);
                kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = utf8LineStrict.substring(iV0 + 1);
                kotlin.jvm.internal.n.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                dVar.g(strSubstring, strSubstring2);
            } else if (utf8LineStrict.charAt(0) == ':') {
                String strSubstring3 = utf8LineStrict.substring(1);
                kotlin.jvm.internal.n.e(strSubstring3, "this as java.lang.String).substring(startIndex)");
                dVar.g("", strSubstring3);
            } else {
                dVar.g("", utf8LineStrict);
            }
        }
    }

    public boolean J(int i10) {
        if (i10 >= 64) {
            F();
            return ((c) this.f4729c).J(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f4728b;
        boolean z10 = (j11 & j10) != 0;
        long j12 = j11 & (~j10);
        this.f4728b = j12;
        long j13 = j10 - 1;
        this.f4728b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        c cVar = (c) this.f4729c;
        if (cVar != null) {
            if (cVar.G(0)) {
                L(63);
            }
            ((c) this.f4729c).J(0);
        }
        return z10;
    }

    public void K() {
        this.f4728b = 0L;
        c cVar = (c) this.f4729c;
        if (cVar != null) {
            cVar.K();
        }
    }

    public void L(int i10) {
        if (i10 < 64) {
            this.f4728b |= 1 << i10;
        } else {
            F();
            ((c) this.f4729c).L(i10 - 64);
        }
    }

    @Override // n2.l
    public void advancePeekPosition(int i10) {
        ((n2.l) this.f4729c).advancePeekPosition(i10);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public void b(int i10) {
        ((n2) this.f4729c).b(i10);
    }

    @Override // s1.g
    public long d(long j10, long j11) {
        return ((n2.g) this.f4729c).f46460d[(int) j10];
    }

    @Override // com.google.android.gms.internal.ads.o2
    public h3 e(int i10, int i11) {
        return ((o2) this.f4729c).e(i10, i11);
    }

    @Override // n2.m
    public void endTracks() {
        ((n2.m) this.f4729c).endTracks();
    }

    @Override // s1.g
    public long g(long j10, long j11) {
        return 0L;
    }

    @Override // n2.l
    public long getLength() {
        return ((n2.l) this.f4729c).getLength() - this.f4728b;
    }

    @Override // n2.l
    public long getPeekPosition() {
        return ((n2.l) this.f4729c).getPeekPosition() - this.f4728b;
    }

    @Override // n2.l
    public long getPosition() {
        return ((n2.l) this.f4729c).getPosition() - this.f4728b;
    }

    @Override // s1.g
    public long getTimeUs(long j10) {
        return ((n2.g) this.f4729c).f46461e[(int) j10] - this.f4728b;
    }

    @Override // s1.g
    public long h(long j10, long j11) {
        return C.TIME_UNSET;
    }

    @Override // s1.g
    public t1.j i(long j10) {
        n2.g gVar = (n2.g) this.f4729c;
        int i10 = (int) j10;
        return new t1.j(null, gVar.f46459c[i10], gVar.f46458b[i10]);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public boolean j(int i10, boolean z10) {
        return ((n2) this.f4729c).j(i10, true);
    }

    @Override // s1.g
    public long k(long j10, long j11) {
        return l1.y.f(((n2.g) this.f4729c).f46461e, j10 + this.f4728b, true);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public boolean m(byte[] bArr, int i10, int i11, boolean z10) {
        return ((n2) this.f4729c).m(bArr, i10, i11, z10);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public void o(a3 a3Var) {
        ((o2) this.f4729c).o(new f3(this, a3Var, a3Var));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public /* synthetic */ void onFailure(Exception exc) {
        v9.e eVar = (v9.e) this.f4729c;
        ((AtomicLong) eVar.f52505d).set(this.f4728b);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public void p(byte[] bArr, int i10, int i11) {
        ((n2) this.f4729c).p(bArr, i10, i11);
    }

    @Override // n2.l
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) {
        return ((n2.l) this.f4729c).peekFully(bArr, i10, i11, z10);
    }

    @Override // s1.g
    public long q(long j10) {
        return ((n2.g) this.f4729c).f46457a;
    }

    @Override // i1.i
    public int read(byte[] bArr, int i10, int i11) {
        return ((n2.l) this.f4729c).read(bArr, i10, i11);
    }

    @Override // n2.l
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) {
        return ((n2.l) this.f4729c).readFully(bArr, 0, i11, z10);
    }

    @Override // n2.l
    public void resetPeekPosition() {
        ((n2.l) this.f4729c).resetPeekPosition();
    }

    @Override // n2.l
    public int skip(int i10) {
        return ((n2.l) this.f4729c).skip(i10);
    }

    @Override // n2.l
    public boolean skipFully(int i10, boolean z10) {
        return ((n2.l) this.f4729c).skipFully(i10, true);
    }

    @Override // com.google.android.gms.internal.ads.vx1
    public int t(byte[] bArr, int i10, int i11) {
        return ((n2) this.f4729c).t(bArr, i10, i11);
    }

    public String toString() {
        switch (this.f4727a) {
            case 0:
                if (((c) this.f4729c) == null) {
                    return Long.toBinaryString(this.f4728b);
                }
                return ((c) this.f4729c).toString() + "xx" + Long.toBinaryString(this.f4728b);
            default:
                return super.toString();
        }
    }

    @Override // n2.m
    public n2.a0 track(int i10, int i11) {
        return ((n2.m) this.f4729c).track(i10, i11);
    }

    @Override // n2.m
    public void u(n2.t tVar) {
        ((n2.m) this.f4729c).u(new n2.y(this, tVar, tVar));
    }

    @Override // com.google.android.gms.internal.ads.n2
    public void v(byte[] bArr, int i10, int i11) {
        ((n2) this.f4729c).v(bArr, i10, i11);
    }

    @Override // n2.l
    public int w(byte[] bArr, int i10, int i11) {
        return ((n2.l) this.f4729c).w(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public boolean x(byte[] bArr, int i10, int i11, boolean z10) {
        return ((n2) this.f4729c).x(bArr, 0, i11, z10);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public int y(byte[] bArr, int i10, int i11) {
        return ((n2) this.f4729c).y(bArr, i10, i11);
    }

    @Override // s1.g
    public boolean z() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.qv0
    public Object zza(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((zzg) ((ql0) this.f4729c).f18847a).zzx()) {
            return null;
        }
        long j10 = this.f4728b;
        wj wjVarP = xj.P();
        wjVarP.b();
        ((xj) wjVarP.f19193b).L(j10);
        byte[] bArrB = ((xj) wjVarP.e()).b();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
        v71.D(sQLiteDatabase, j10, bArrB);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public int zzd() {
        return ((n2) this.f4729c).zzd();
    }

    @Override // com.google.android.gms.internal.ads.n2
    public void zzf(int i10) {
        ((n2) this.f4729c).zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public void zzl() {
        ((n2) this.f4729c).zzl();
    }

    @Override // com.google.android.gms.internal.ads.n2
    public long zzm() {
        return ((n2) this.f4729c).zzm() - this.f4728b;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public long zzn() {
        return ((n2) this.f4729c).zzn() - this.f4728b;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public long zzo() {
        return ((n2) this.f4729c).zzo() - this.f4728b;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public void zzv() {
        ((o2) this.f4729c).zzv();
    }

    public c(n2 n2Var, long j10) {
        this.f4727a = 1;
        this.f4729c = n2Var;
        ps1.v(n2Var.zzn() >= j10);
        this.f4728b = j10;
    }

    @Override // n2.l
    public void peekFully(byte[] bArr, int i10, int i11) {
        ((n2.l) this.f4729c).peekFully(bArr, i10, i11);
    }

    @Override // n2.l
    public void readFully(byte[] bArr, int i10, int i11) {
        ((n2.l) this.f4729c).readFully(bArr, i10, i11);
    }

    @Override // n2.l
    public void skipFully(int i10) {
        ((n2.l) this.f4729c).skipFully(i10);
    }

    public /* synthetic */ c(Object obj, long j10, int i10) {
        this.f4727a = i10;
        this.f4729c = obj;
        this.f4728b = j10;
    }

    public c(p9.b bVar) {
        this.f4727a = 7;
        k9.c0.h(bVar);
        this.f4729c = bVar;
    }

    public c(lo.g source) {
        this.f4727a = 8;
        kotlin.jvm.internal.n.f(source, "source");
        this.f4729c = source;
        this.f4728b = 262144L;
    }

    public c(n2.l lVar, long j10) {
        this.f4727a = 9;
        this.f4729c = lVar;
        go.k.i(lVar.getPosition() >= j10);
        this.f4728b = j10;
    }

    public c(int i10) {
        this.f4727a = i10;
        switch (i10) {
            case 4:
                this.f4729c = new ArrayList();
                break;
            default:
                this.f4728b = 0L;
                break;
        }
    }
}
