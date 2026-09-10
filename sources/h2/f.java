package h2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import f2.c0;
import f2.c1;
import go.k;
import i1.d0;
import i1.p;
import j2.n;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import k3.i;
import k3.j;
import k3.m;
import m0.s1;
import oa.e0;
import oa.j0;
import oa.n1;
import p1.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends p1.a implements Handler.Callback {
    public k3.c A;
    public k3.c B;
    public int C;
    public final Handler D;
    public final v E;
    public final s1 F;
    public boolean G;
    public boolean H;
    public p I;
    public long J;
    public long K;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f42081s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o1.d f42082t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f42083u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f42084v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f42085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f42086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public k3.e f42087y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i f42088z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v vVar, Looper looper) {
        super(3);
        s4.i iVar = e.f42080l9;
        this.E = vVar;
        this.D = looper == null ? null : new Handler(looper, this);
        this.f42084v = iVar;
        this.f42081s = new n(2);
        this.f42082t = new o1.d(1);
        this.F = new s1(12, false);
        this.K = C.TIME_UNSET;
        this.J = C.TIME_UNSET;
    }

    @Override // p1.a
    public final int A(p pVar) {
        boolean zEquals = Objects.equals(pVar.f42643n, "application/x-media3-cues");
        String str = pVar.f42643n;
        if (!zEquals) {
            s4.i iVar = (s4.i) this.f42084v;
            iVar.getClass();
            if (!((n) iVar.f50111a).a(pVar) && !Objects.equals(str, MimeTypes.APPLICATION_CEA608) && !Objects.equals(str, MimeTypes.APPLICATION_MP4CEA608) && !Objects.equals(str, MimeTypes.APPLICATION_CEA708)) {
                return d0.l(str) ? p1.a.c(1, 0, 0, 0) : p1.a.c(0, 0, 0, 0);
            }
        }
        return p1.a.c(pVar.O == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void D() {
        boolean z10 = Objects.equals(this.I.f42643n, MimeTypes.APPLICATION_CEA608) || Objects.equals(this.I.f42643n, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(this.I.f42643n, MimeTypes.APPLICATION_CEA708);
        String str = this.I.f42643n;
        if (!z10) {
            throw new IllegalStateException(j1.f.B("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
        }
    }

    public final long E() {
        if (this.C == -1) {
            return Long.MAX_VALUE;
        }
        this.A.getClass();
        if (this.C >= this.A.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.A.getEventTime(this.C);
    }

    public final long F(long j10) {
        k.t(j10 != C.TIME_UNSET);
        return j10 - this.f47915k;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    public final void G() {
        k3.e bVar;
        byte b10 = 1;
        this.f42085w = true;
        p pVar = this.I;
        pVar.getClass();
        n nVar = (n) ((s4.i) this.f42084v).f50111a;
        String str = pVar.f42643n;
        int i10 = pVar.K;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    b10 = !str.equals(MimeTypes.APPLICATION_MP4CEA608) ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals(MimeTypes.APPLICATION_CEA608)) {
                        b10 = -1;
                    }
                    break;
                case 1566016562:
                    b10 = !str.equals(MimeTypes.APPLICATION_CEA708) ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                case 1:
                    bVar = new l3.c(str, i10);
                    break;
                case 2:
                    bVar = new l3.f(i10, pVar.f42646q);
                    break;
                default:
                    if (nVar.a(pVar)) {
                        throw new IllegalArgumentException(defpackage.e.n("Attempted to create decoder for unsupported MIME type: ", str));
                    }
                    m mVarG = nVar.g(pVar);
                    mVarG.getClass().getSimpleName().concat("Decoder");
                    bVar = new b(mVarG);
                    break;
                    break;
            }
        } else {
            if (nVar.a(pVar)) {
                throw new IllegalArgumentException(defpackage.e.n("Attempted to create decoder for unsupported MIME type: ", str));
            }
            m mVarG2 = nVar.g(pVar);
            mVarG2.getClass().getSimpleName().concat("Decoder");
            bVar = new b(mVarG2);
        }
        this.f42087y = bVar;
        bVar.a(this.l);
    }

    public final void H(k1.c cVar) {
        n1 n1Var = cVar.f44243a;
        v vVar = this.E;
        vVar.f48170a.f47947m.e(27, new n7.a(n1Var, 1));
        vVar.f48170a.f47947m.e(27, new j(cVar, 14));
    }

    public final void I() {
        this.f42088z = null;
        this.C = -1;
        k3.c cVar = this.A;
        if (cVar != null) {
            cVar.h();
            this.A = null;
        }
        k3.c cVar2 = this.B;
        if (cVar2 != null) {
            cVar2.h();
            this.B = null;
        }
    }

    @Override // p1.a
    public final String h() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        H((k1.c) message.obj);
        return true;
    }

    @Override // p1.a
    public final boolean j() {
        return this.H;
    }

    @Override // p1.a
    public final boolean l() {
        p pVar = this.I;
        if (pVar != null) {
            if (Objects.equals(pVar.f42643n, "application/x-media3-cues")) {
                a aVar = this.f42083u;
                aVar.getClass();
                if (aVar.c(this.J) == Long.MIN_VALUE) {
                    try {
                        c1 c1Var = this.f47913i;
                        c1Var.getClass();
                        c1Var.maybeThrowError();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.H) {
                    return false;
                }
                if (this.G) {
                    k3.c cVar = this.A;
                    long j10 = this.J;
                    if (cVar == null || cVar.getEventTimeCount() <= 0 || cVar.getEventTime(cVar.getEventTimeCount() - 1) <= j10) {
                        k3.c cVar2 = this.B;
                        long j11 = this.J;
                        if ((cVar2 == null || cVar2.getEventTimeCount() <= 0 || cVar2.getEventTime(cVar2.getEventTimeCount() - 1) <= j11) && this.f42088z != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // p1.a
    public final void m() {
        this.I = null;
        this.K = C.TIME_UNSET;
        n1 n1Var = n1.f47281e;
        F(this.J);
        k1.c cVar = new k1.c(n1Var);
        Handler handler = this.D;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            H(cVar);
        }
        this.J = C.TIME_UNSET;
        if (this.f42087y != null) {
            I();
            k3.e eVar = this.f42087y;
            eVar.getClass();
            eVar.release();
            this.f42087y = null;
            this.f42086x = 0;
        }
    }

    @Override // p1.a
    public final void o(long j10, boolean z10, boolean z11) {
        this.J = j10;
        a aVar = this.f42083u;
        if (aVar != null) {
            aVar.clear();
        }
        n1 n1Var = n1.f47281e;
        F(this.J);
        k1.c cVar = new k1.c(n1Var);
        Handler handler = this.D;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            H(cVar);
        }
        this.G = false;
        this.H = false;
        this.K = C.TIME_UNSET;
        p pVar = this.I;
        if (pVar == null || Objects.equals(pVar.f42643n, "application/x-media3-cues")) {
            return;
        }
        if (this.f42086x == 0) {
            I();
            k3.e eVar = this.f42087y;
            eVar.getClass();
            eVar.flush();
            eVar.a(this.l);
            return;
        }
        I();
        k3.e eVar2 = this.f42087y;
        eVar2.getClass();
        eVar2.release();
        this.f42087y = null;
        this.f42086x = 0;
        G();
    }

    @Override // p1.a
    public final void t(p[] pVarArr, long j10, long j11, c0 c0Var) {
        p pVar = pVarArr[0];
        this.I = pVar;
        if (Objects.equals(pVar.f42643n, "application/x-media3-cues")) {
            this.f42083u = this.I.L == 1 ? new c() : new d(0, false);
            return;
        }
        D();
        if (this.f42087y != null) {
            this.f42086x = 1;
        } else {
            G();
        }
    }

    @Override // p1.a
    public final void w(long j10, long j11) {
        boolean z10;
        s1 s1Var;
        boolean z11;
        long eventTime;
        if (this.f47917n) {
            long j12 = this.K;
            if (j12 != C.TIME_UNSET && j10 >= j12) {
                I();
                this.H = true;
            }
        }
        if (this.H) {
            return;
        }
        p pVar = this.I;
        pVar.getClass();
        boolean zEquals = Objects.equals(pVar.f42643n, "application/x-media3-cues");
        Handler handler = this.D;
        s1 s1Var2 = this.F;
        boolean zD = false;
        zD = false;
        zD = false;
        if (zEquals) {
            this.f42083u.getClass();
            if (!this.G) {
                o1.d dVar = this.f42082t;
                if (v(s1Var2, dVar, 0) == -4) {
                    if (dVar.c(4)) {
                        this.G = true;
                    } else {
                        dVar.j();
                        ByteBuffer byteBuffer = dVar.f47035e;
                        byteBuffer.getClass();
                        long j13 = dVar.f47037g;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f42081s.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        d2.c cVar = new d2.c(9);
                        e0 e0VarU = j0.u();
                        for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i10);
                            bundle2.getClass();
                            e0VarU.b(cVar.apply(bundle2));
                        }
                        k3.a aVar = new k3.a(e0VarU.g(), j13, bundle.getLong(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D));
                        dVar.g();
                        zD = this.f42083u.d(aVar, j10);
                    }
                }
            }
            long jC = this.f42083u.c(this.J);
            if (jC == Long.MIN_VALUE && this.G && !zD) {
                this.H = true;
            }
            if (jC != Long.MIN_VALUE && jC <= j10) {
                zD = true;
            }
            if (zD) {
                j0 j0VarA = this.f42083u.a(j10);
                long jB = this.f42083u.b(j10);
                F(jB);
                k1.c cVar2 = new k1.c(j0VarA);
                if (handler != null) {
                    handler.obtainMessage(1, cVar2).sendToTarget();
                } else {
                    H(cVar2);
                }
                this.f42083u.e(jB);
            }
            this.J = j10;
            return;
        }
        D();
        this.J = j10;
        if (this.B == null) {
            k3.e eVar = this.f42087y;
            eVar.getClass();
            eVar.setPositionUs(j10);
            try {
                k3.e eVar2 = this.f42087y;
                eVar2.getClass();
                this.B = (k3.c) eVar2.dequeueOutputBuffer();
            } catch (k3.f e10) {
                l1.a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.I, e10);
                n1 n1Var = n1.f47281e;
                F(this.J);
                k1.c cVar3 = new k1.c(n1Var);
                if (handler != null) {
                    handler.obtainMessage(1, cVar3).sendToTarget();
                } else {
                    H(cVar3);
                }
                I();
                k3.e eVar3 = this.f42087y;
                eVar3.getClass();
                eVar3.release();
                this.f42087y = null;
                this.f42086x = 0;
                G();
                return;
            }
        }
        if (this.f47912h != 2) {
            return;
        }
        if (this.A != null) {
            long jE = E();
            z10 = false;
            while (jE <= j10) {
                this.C++;
                jE = E();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        k3.c cVar4 = this.B;
        if (cVar4 == null) {
            s1Var = s1Var2;
            z11 = z10;
        } else if (cVar4.c(4)) {
            if (!z10 && E() == Long.MAX_VALUE) {
                if (this.f42086x == 2) {
                    I();
                    k3.e eVar4 = this.f42087y;
                    eVar4.getClass();
                    eVar4.release();
                    this.f42087y = null;
                    this.f42086x = 0;
                    G();
                } else {
                    I();
                    this.H = true;
                }
            }
            s1Var = s1Var2;
            z11 = z10;
        } else {
            s1Var = s1Var2;
            if (cVar4.f47040c <= j10) {
                k3.c cVar5 = this.A;
                if (cVar5 != null) {
                    z11 = z10;
                    cVar5.h();
                }
                z11 = z10;
                this.C = cVar4.getNextEventTimeIndex(j10);
                this.A = cVar4;
                this.B = null;
                z11 = true;
            }
        }
        if (z11) {
            this.A.getClass();
            int nextEventTimeIndex = this.A.getNextEventTimeIndex(j10);
            if (nextEventTimeIndex == 0 || this.A.getEventTimeCount() == 0) {
                eventTime = this.A.f47040c;
            } else if (nextEventTimeIndex == -1) {
                k3.c cVar6 = this.A;
                eventTime = cVar6.getEventTime(cVar6.getEventTimeCount() - 1);
            } else {
                eventTime = this.A.getEventTime(nextEventTimeIndex - 1);
            }
            F(eventTime);
            k1.c cVar7 = new k1.c(this.A.getCues(j10));
            if (handler != null) {
                handler.obtainMessage(1, cVar7).sendToTarget();
            } else {
                H(cVar7);
            }
        }
        if (this.f42086x == 2) {
            return;
        }
        while (!this.G) {
            try {
                i iVar = this.f42088z;
                if (iVar == null) {
                    k3.e eVar5 = this.f42087y;
                    eVar5.getClass();
                    iVar = (i) eVar5.dequeueInputBuffer();
                    if (iVar == null) {
                        return;
                    } else {
                        this.f42088z = iVar;
                    }
                }
                if (this.f42086x == 1) {
                    iVar.f22444b = 4;
                    k3.e eVar6 = this.f42087y;
                    eVar6.getClass();
                    eVar6.b(iVar);
                    this.f42088z = null;
                    this.f42086x = 2;
                    return;
                }
                int iV = v(s1Var, iVar, 0);
                if (iV == -4) {
                    if (iVar.c(4)) {
                        this.G = true;
                        this.f42085w = false;
                    } else {
                        p pVar2 = (p) s1Var.f45752c;
                        if (pVar2 == null) {
                            return;
                        }
                        iVar.f44291j = pVar2.f42648s;
                        iVar.j();
                        this.f42085w &= !iVar.c(1);
                    }
                    if (!this.f42085w) {
                        k3.e eVar7 = this.f42087y;
                        eVar7.getClass();
                        eVar7.b(iVar);
                        this.f42088z = null;
                    }
                } else if (iV == -3) {
                    return;
                }
            } catch (k3.f e11) {
                l1.a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.I, e11);
                n1 n1Var2 = n1.f47281e;
                F(this.J);
                k1.c cVar8 = new k1.c(n1Var2);
                if (handler != null) {
                    handler.obtainMessage(1, cVar8).sendToTarget();
                } else {
                    H(cVar8);
                }
                I();
                k3.e eVar8 = this.f42087y;
                eVar8.getClass();
                eVar8.release();
                this.f42087y = null;
                this.f42086x = 0;
                G();
                return;
            }
        }
    }
}
