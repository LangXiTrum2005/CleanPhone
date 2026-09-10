package v2;

import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.c0;
import i1.d0;
import i1.e0;
import i1.o;
import java.util.Objects;
import l1.q;
import n2.a0;
import n2.h;
import n2.k;
import n2.l;
import n2.m;
import oa.n1;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f52438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f52440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52441e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w2.b f52443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f52444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.c f52445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h3.k f52446j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f52437a = new q(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f52442f = -1;

    @Override // n2.k
    public final boolean a(l lVar) {
        String strU;
        h hVar = (h) lVar;
        q qVar = this.f52437a;
        qVar.J(2);
        hVar.peekFully(qVar.f44813a, 0, 2, false);
        if (qVar.G() == 65496) {
            while (true) {
                qVar.J(2);
                hVar.peekFully(qVar.f44813a, 0, 2, false);
                int iG = qVar.G();
                this.f52440d = iG;
                if (iG == 65498) {
                    break;
                }
                qVar.J(2);
                hVar.peekFully(qVar.f44813a, 0, 2);
                int iG2 = qVar.G() - 2;
                if (iG2 < 0) {
                    break;
                }
                if (this.f52440d != 65505) {
                    hVar.b(iG2, false);
                } else {
                    qVar.J(iG2);
                    hVar.peekFully(qVar.f44813a, 0, iG2, false);
                    if (Objects.equals(qVar.u(), "http://ns.adobe.com/xap/1.0/") && (strU = qVar.u()) != null) {
                        for (int i10 = 0; i10 < 4; i10++) {
                            if (strU.contains(c.f52450a[i10] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0102  */
    @Override // n2.k
    public final int b(l lVar, q2 q2Var) throws e0 {
        String strU;
        androidx.recyclerview.widget.c cVarA;
        n1 n1Var;
        int i10;
        w2.b bVar;
        long j10;
        int i11 = this.f52439c;
        long j11 = -1;
        q qVar = this.f52437a;
        if (i11 == 0) {
            qVar.J(2);
            lVar.readFully(qVar.f44813a, 0, 2);
            int iG = qVar.G();
            this.f52440d = iG;
            if (iG == 65498) {
                if (this.f52442f != -1) {
                    this.f52439c = 4;
                    return 0;
                }
                e();
                return 0;
            }
            if ((iG < 65488 || iG > 65497) && iG != 65281) {
                this.f52439c = 1;
            }
            return 0;
        }
        if (i11 == 1) {
            qVar.J(2);
            lVar.peekFully(qVar.f44813a, 0, 2);
            this.f52441e = qVar.G() - 2;
            lVar.skipFully(2);
            this.f52439c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f52445i == null || lVar != this.f52444h) {
                    this.f52444h = lVar;
                    this.f52445i = new androidx.recyclerview.widget.c(lVar, this.f52442f);
                }
                h3.k kVar = this.f52446j;
                kVar.getClass();
                int iB = kVar.b(this.f52445i, q2Var);
                if (iB == 1) {
                    q2Var.f18888a += this.f52442f;
                }
                return iB;
            }
            long position = lVar.getPosition();
            long j12 = this.f52442f;
            if (position != j12) {
                q2Var.f18888a = j12;
                return 1;
            }
            if (!lVar.peekFully(qVar.f44813a, 0, 1, true)) {
                e();
                return 0;
            }
            lVar.resetPeekPosition();
            if (this.f52446j == null) {
                this.f52446j = new h3.k(k3.k.f44294p9, 8);
            }
            androidx.recyclerview.widget.c cVar = new androidx.recyclerview.widget.c(lVar, this.f52442f);
            this.f52445i = cVar;
            if (!this.f52446j.a(cVar)) {
                e();
                return 0;
            }
            h3.k kVar2 = this.f52446j;
            long j13 = this.f52442f;
            m mVar = this.f52438b;
            mVar.getClass();
            kVar2.c(new androidx.recyclerview.widget.c(j13, mVar, 10));
            w2.b bVar2 = this.f52443g;
            bVar2.getClass();
            m mVar2 = this.f52438b;
            mVar2.getClass();
            a0 a0VarTrack = mVar2.track(1024, 4);
            o oVar = new o();
            oVar.l = d0.n("image/jpeg");
            oVar.f42599k = new c0(bVar2);
            q4.a.o(oVar, a0VarTrack);
            this.f52439c = 5;
            return 0;
        }
        if (this.f52440d == 65505) {
            q qVar2 = new q(this.f52441e);
            lVar.readFully(qVar2.f44813a, 0, this.f52441e);
            if (this.f52443g == null && "http://ns.adobe.com/xap/1.0/".equals(qVar2.u()) && (strU = qVar2.u()) != null) {
                long length = lVar.getLength();
                if (length == -1) {
                    bVar = null;
                } else {
                    try {
                        cVarA = c.a(strU);
                    } catch (e0 | NumberFormatException | XmlPullParserException unused) {
                        l1.a.s("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        cVarA = null;
                    }
                    if (cVarA != null && (i10 = (n1Var = (n1) cVarA.f4729c).f47283d) >= 2) {
                        int i12 = i10 - 1;
                        long j14 = -1;
                        long j15 = -1;
                        long j16 = -1;
                        long j17 = -1;
                        while (i12 >= 0) {
                            b bVar3 = (b) n1Var.get(i12);
                            String str = bVar3.f52447a;
                            boolean z10 = str.equals(MimeTypes.VIDEO_MP4) || str.equals("video/quicktime");
                            if (i12 == 0) {
                                length -= bVar3.f52449c;
                                j10 = 0;
                            } else {
                                j10 = length - bVar3.f52448b;
                            }
                            long j18 = length;
                            length = j10;
                            if (z10 && length != j18) {
                                j17 = j18 - length;
                                j16 = length;
                            }
                            if (i12 == 0) {
                                j15 = j18;
                                j14 = length;
                            }
                            i12--;
                            j11 = j11;
                        }
                        long j19 = j11;
                        if (j16 == j19 || j17 == j19 || j14 == j19 || j15 == j19) {
                            bVar = null;
                        } else {
                            bVar = new w2.b(j14, j15, cVarA.f4728b, j16, j17);
                        }
                    } else {
                        bVar = null;
                    }
                }
                this.f52443g = bVar;
                if (bVar != null) {
                    this.f52442f = bVar.f52925d;
                }
            }
        } else {
            lVar.skipFully(this.f52441e);
        }
        this.f52439c = 0;
        return 0;
    }

    @Override // n2.k
    public final void c(m mVar) {
        this.f52438b = mVar;
    }

    public final void e() {
        m mVar = this.f52438b;
        mVar.getClass();
        mVar.endTracks();
        this.f52438b.u(new n2.o(C.TIME_UNSET));
        this.f52439c = 6;
    }

    @Override // n2.k
    public final void release() {
        h3.k kVar = this.f52446j;
        if (kVar != null) {
            kVar.getClass();
        }
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f52439c = 0;
            this.f52446j = null;
        } else if (this.f52439c == 5) {
            h3.k kVar = this.f52446j;
            kVar.getClass();
            kVar.seek(j10, j11);
        }
    }
}
