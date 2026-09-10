package v1;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.d0;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;
import n2.a0;
import n2.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements a0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i1.p f52386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i1.p f52387g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f52388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1.p f52389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i1.p f52390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f52391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52392e;

    static {
        i1.o oVar = new i1.o();
        oVar.f42600m = d0.n(MimeTypes.APPLICATION_ID3);
        f52386f = new i1.p(oVar);
        i1.o oVar2 = new i1.o();
        oVar2.f42600m = d0.n(MimeTypes.APPLICATION_EMSG);
        f52387g = new i1.p(oVar2);
    }

    public p(a0 a0Var, int i10) {
        this.f52388a = a0Var;
        if (i10 == 1) {
            this.f52389b = f52386f;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(l1.d.e(i10, "Unknown metadataType: "));
            }
            this.f52389b = f52387g;
        }
        this.f52391d = new byte[0];
        this.f52392e = 0;
    }

    @Override // n2.a0
    public final void a(long j10, int i10, int i11, int i12, z zVar) {
        this.f52390c.getClass();
        int i13 = this.f52392e - i12;
        l1.q qVar = new l1.q(Arrays.copyOfRange(this.f52391d, i13 - i11, i13));
        byte[] bArr = this.f52391d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.f52392e = i12;
        String str = this.f52390c.f42643n;
        i1.p pVar = this.f52389b;
        String str2 = pVar.f42643n;
        String str3 = pVar.f42643n;
        if (!Objects.equals(str, str2)) {
            if (!MimeTypes.APPLICATION_EMSG.equals(this.f52390c.f42643n)) {
                l1.a.s("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f52390c.f42643n);
                return;
            }
            y2.a aVarM = x2.b.M(qVar);
            i1.p pVarA = aVarM.a();
            if (pVarA == null || !Objects.equals(str3, pVarA.f42643n)) {
                l1.a.s("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + aVarM.a());
                return;
            }
            byte[] bArrC = aVarM.c();
            bArrC.getClass();
            qVar = new l1.q(bArrC);
        }
        int iA = qVar.a();
        a0 a0Var = this.f52388a;
        a0Var.g(iA, qVar);
        a0Var.a(j10, i10, iA, 0, zVar);
    }

    @Override // n2.a0
    public final void b(i1.p pVar) {
        this.f52390c = pVar;
        this.f52388a.b(this.f52389b);
    }

    @Override // n2.a0
    public final void d(l1.q qVar, int i10, int i11) {
        int i12 = this.f52392e + i10;
        byte[] bArr = this.f52391d;
        if (bArr.length < i12) {
            this.f52391d = Arrays.copyOf(bArr, (i12 / 2) + i12);
        }
        qVar.k(this.f52391d, this.f52392e, i10);
        this.f52392e += i10;
    }

    @Override // n2.a0
    public final int f(i1.i iVar, int i10, boolean z10) throws EOFException {
        int i11 = this.f52392e + i10;
        byte[] bArr = this.f52391d;
        if (bArr.length < i11) {
            this.f52391d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int i12 = iVar.read(this.f52391d, this.f52392e, i10);
        if (i12 != -1) {
            this.f52392e += i12;
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }
}
