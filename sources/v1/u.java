package v1;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.d0;
import i1.e0;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l1.x;
import l1.y;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements n2.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f52427i = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f52428j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f52430b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k3.k f52432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f52433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n2.m f52434f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f52436h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.q f52431c = new l1.q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f52435g = new byte[1024];

    public u(String str, x xVar, k3.k kVar, boolean z10) {
        this.f52429a = str;
        this.f52430b = xVar;
        this.f52432d = kVar;
        this.f52433e = z10;
    }

    @Override // n2.k
    public final boolean a(n2.l lVar) {
        n2.h hVar = (n2.h) lVar;
        hVar.peekFully(this.f52435g, 0, 6, false);
        byte[] bArr = this.f52435g;
        l1.q qVar = this.f52431c;
        qVar.K(bArr, 6);
        if (t3.h.a(qVar)) {
            return true;
        }
        hVar.peekFully(this.f52435g, 6, 3, false);
        qVar.K(this.f52435g, 9);
        return t3.h.a(qVar);
    }

    @Override // n2.k
    public final int b(n2.l lVar, q2 q2Var) throws e0 {
        String strN;
        this.f52434f.getClass();
        int length = (int) lVar.getLength();
        int i10 = this.f52436h;
        byte[] bArr = this.f52435g;
        if (i10 == bArr.length) {
            this.f52435g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f52435g;
        int i11 = this.f52436h;
        int i12 = lVar.read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            int i13 = this.f52436h + i12;
            this.f52436h = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        l1.q qVar = new l1.q(this.f52435g);
        t3.h.d(qVar);
        String strN2 = qVar.n(StandardCharsets.UTF_8);
        long jU = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strN2)) {
                while (true) {
                    String strN3 = qVar.n(StandardCharsets.UTF_8);
                    if (strN3 == null) {
                        break;
                    }
                    if (t3.h.f50478a.matcher(strN3).matches()) {
                        do {
                            strN = qVar.n(StandardCharsets.UTF_8);
                            if (strN == null) {
                                break;
                            }
                        } while (!strN.isEmpty());
                    } else {
                        Matcher matcher2 = t3.g.f50474a.matcher(strN3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    e(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = t3.h.c(strGroup);
                String str = y.f44830a;
                long jB = this.f52430b.b(y.U((jU + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                a0 a0VarE = e(jB - jC2);
                byte[] bArr3 = this.f52435g;
                int i14 = this.f52436h;
                l1.q qVar2 = this.f52431c;
                qVar2.K(bArr3, i14);
                a0VarE.g(this.f52436h, qVar2);
                a0VarE.a(jB, 1, this.f52436h, 0, null);
                return -1;
            }
            if (strN2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f52427i.matcher(strN2);
                if (!matcher3.find()) {
                    throw e0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strN2));
                }
                Matcher matcher4 = f52428j.matcher(strN2);
                if (!matcher4.find()) {
                    throw e0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strN2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = t3.h.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j10 = Long.parseLong(strGroup3);
                String str2 = y.f44830a;
                jU = y.U(j10, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strN2 = qVar.n(StandardCharsets.UTF_8);
        }
    }

    @Override // n2.k
    public final void c(n2.m mVar) {
        if (this.f52433e) {
            mVar = new bc.s(mVar, this.f52432d);
        }
        this.f52434f = mVar;
        mVar.u(new n2.o(C.TIME_UNSET));
    }

    public final a0 e(long j10) {
        a0 a0VarTrack = this.f52434f.track(0, 3);
        i1.o oVar = new i1.o();
        oVar.f42600m = d0.n(MimeTypes.TEXT_VTT);
        oVar.f42592d = this.f52429a;
        oVar.f42605r = j10;
        q4.a.o(oVar, a0VarTrack);
        this.f52434f.endTracks();
        return a0VarTrack;
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // n2.k
    public final void release() {
    }
}
