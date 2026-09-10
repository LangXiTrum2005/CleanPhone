package r1;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.google.android.gms.internal.ads.dm0;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.mk0;
import com.google.android.gms.internal.ads.t60;
import com.google.android.gms.internal.ads.xx1;
import com.ironsource.Xa;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import m0.s1;
import oa.j0;
import oa.n1;
import p1.c1;
import p1.l0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends y1.p implements l0 {
    public final Context E0;
    public final l2.v F0;
    public final a0 G0;
    public final y1.h H0;
    public int I0;
    public boolean J0;
    public i1.p K0;
    public i1.p L0;
    public long M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public boolean S0;
    public long T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, y1.i iVar, Handler handler, p1.v vVar, a0 a0Var) {
        super(context.getApplicationContext(), 1, iVar, 44100.0f);
        y1.h hVar = Build.VERSION.SDK_INT >= 35 ? new y1.h() : null;
        this.E0 = context.getApplicationContext();
        this.G0 = a0Var;
        this.H0 = hVar;
        this.R0 = -1000;
        this.F0 = new l2.v(handler, vVar, 1);
        this.T0 = C.TIME_UNSET;
        a0Var.f49237n = new qj.x(this, 1);
    }

    public final int A0(i1.p pVar) {
        c cVarA;
        a0 a0Var = this.G0;
        if (a0Var.X) {
            cVarA = c.f49256d;
        } else {
            g gVarB = ((u) a0Var.f49241r).b(a0Var.g(pVar));
            f6 f6Var = new f6();
            f6Var.f14258a = gVarB.f49289a;
            f6Var.f14259b = gVarB.f49290b;
            f6Var.f14260c = gVarB.f49291c;
            cVarA = f6Var.a();
        }
        if (!cVarA.f49257a) {
            return 0;
        }
        int i10 = cVarA.f49258b ? 1536 : 512;
        return cVarA.f49259c ? i10 | com.ironsource.mediationsdk.metadata.a.f29616n : i10;
    }

    public final void B0() {
        long j10;
        long jMax;
        long j11;
        j();
        a0 a0Var = this.G0;
        qd.i iVar = a0Var.f49225b;
        if (!a0Var.n() || a0Var.F) {
            j10 = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(a0Var.f49243t.a(), l1.y.S(((j) a0Var.f49239p.f13587e).f49311b, a0Var.j()));
            ArrayDeque arrayDeque = a0Var.f49232h;
            while (!arrayDeque.isEmpty() && jMin >= ((z) arrayDeque.getFirst()).f49400c) {
                a0Var.f49246w = (z) arrayDeque.remove();
            }
            z zVar = a0Var.f49246w;
            long jU = jMin - zVar.f49400c;
            long jA = l1.y.A(jU, zVar.f49398a.f42544a);
            if (arrayDeque.isEmpty()) {
                j1.n nVar = (j1.n) iVar.f48982d;
                if (!nVar.isActive()) {
                    j10 = Long.MIN_VALUE;
                } else if (nVar.f43622n >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                    long j12 = nVar.f43621m;
                    t60 t60Var = nVar.f43619j;
                    t60Var.getClass();
                    long jY = j12 - ((long) (((j1.m) t60Var.f20214q).y() * (t60Var.f20207i * t60Var.f20200b)));
                    int i10 = nVar.f43617h.f43597a;
                    int i11 = nVar.f43616g.f43597a;
                    if (i10 == i11) {
                        jU = l1.y.U(jU, jY, nVar.f43622n, RoundingMode.DOWN);
                        j10 = Long.MIN_VALUE;
                    } else {
                        j10 = Long.MIN_VALUE;
                        jU = l1.y.U(jU, jY * ((long) i10), nVar.f43622n * ((long) i11), RoundingMode.DOWN);
                    }
                } else {
                    j10 = Long.MIN_VALUE;
                    jU = (long) (((double) nVar.f43612c) * jU);
                }
                z zVar2 = a0Var.f49246w;
                j11 = zVar2.f49399b + jU;
                zVar2.f49401d = jU - jA;
            } else {
                j10 = Long.MIN_VALUE;
                z zVar3 = a0Var.f49246w;
                j11 = zVar3.f49399b + jA + zVar3.f49401d;
            }
            long j13 = ((e0) iVar.f48981c).f49274q;
            jMax = l1.y.S(((j) a0Var.f49239p.f13587e).f49311b, j13) + j11;
            long j14 = a0Var.Z;
            if (j13 > j14) {
                long jS = l1.y.S(((j) a0Var.f49239p.f13587e).f49311b, j13 - j14);
                a0Var.Z = j13;
                a0Var.f49224a0 += jS;
                if (a0Var.f49226b0 == null) {
                    a0Var.f49226b0 = new Handler(Looper.myLooper());
                }
                a0Var.f49226b0.removeCallbacksAndMessages(null);
                a0Var.f49226b0.postDelayed(new q1.c(a0Var, 5), 100L);
            }
        }
        if (jMax != j10) {
            if (!this.N0) {
                jMax = Math.max(this.M0, jMax);
            }
            this.M0 = jMax;
            this.N0 = false;
        }
    }

    @Override // y1.p
    public final p1.c F(y1.m mVar, i1.p pVar, i1.p pVar2) {
        p1.c cVarB = mVar.b(pVar, pVar2);
        int i10 = cVarB.f47975e;
        if (this.H == null && v0(pVar2)) {
            i10 |= 32768;
        }
        "OMX.google.raw.decoder".equals(mVar.f54127a);
        if (pVar2.f42644o > this.I0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new p1.c(mVar.f54127a, pVar, pVar2, i11 != 0 ? 0 : cVarB.f47974d, i11);
    }

    @Override // y1.p
    public final float M(float f10, i1.p pVar, i1.p[] pVarArr) {
        int iMax = -1;
        for (i1.p pVar2 : pVarArr) {
            int i10 = pVar2.G;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // y1.p
    public final ArrayList N(y1.g gVar, i1.p pVar, boolean z10) {
        n1 n1VarG;
        if (pVar.f42643n == null) {
            n1VarG = n1.f47281e;
        } else if (this.G0.h(pVar) != 0) {
            List listE = y1.u.e(MimeTypes.AUDIO_RAW, false, false);
            y1.m mVar = listE.isEmpty() ? null : (y1.m) listE.get(0);
            if (mVar != null) {
                n1VarG = j0.B(mVar);
            } else {
                n1VarG = y1.u.g(gVar, pVar, z10, false);
            }
        } else {
            n1VarG = y1.u.g(gVar, pVar, z10, false);
        }
        HashMap map = y1.u.f54183a;
        ArrayList arrayList = new ArrayList(n1VarG);
        Collections.sort(arrayList, new y1.q(new tb.n(3, this.E0, pVar)));
        return arrayList;
    }

    @Override // y1.p
    public final long O(long j10, long j11) {
        long jU;
        a0 a0Var = this.G0;
        boolean z10 = a0Var.l() && this.T0 != C.TIME_UNSET;
        if (this.S0) {
            if (!a0Var.n()) {
                jU = -9223372036854775807L;
            } else if (dm0.a(a0Var.f49239p)) {
                jU = l1.y.S(((j) a0Var.f49239p.f13587e).f49311b, a0Var.f49243t.f49344a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = a0Var.f49243t.f49344a.getBufferSizeInFrames();
                int iM = n2.b.m(((j) a0Var.f49239p.f13587e).f49310a);
                go.k.t(iM != -2147483647);
                jU = l1.y.U(bufferSizeInFrames, 1000000L, iM, RoundingMode.DOWN);
            }
            if (this.Q0 && z10 && jU != C.TIME_UNSET) {
                float fMin = Math.min(jU, this.T0 - j10);
                i1.g0 g0Var = a0Var.f49247x;
                return Math.max(Xa.f27908s, (long) ((fMin / (g0Var != null ? g0Var.f42544a : 1.0f)) / 2.0f));
            }
        } else if (z10 || this.f54162p0) {
            return 1000000L;
        }
        return Xa.f27908s;
    }

    @Override // y1.p
    public final com.google.android.gms.internal.consent_sdk.x Q(y1.m mVar, i1.p pVar, MediaCrypto mediaCrypto, float f10) {
        Pair pairC;
        i1.p[] pVarArr = this.f47914j;
        pVarArr.getClass();
        String str = mVar.f54127a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = pVar.f42644o;
        String str2 = pVar.f42643n;
        int i10 = pVar.F;
        boolean z10 = true;
        if (pVarArr.length != 1) {
            for (i1.p pVar2 : pVarArr) {
                if (mVar.b(pVar, pVar2).f47974d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, pVar2.f42644o);
                }
            }
        }
        this.I0 = iMax;
        if (!str.equals("OMX.google.opus.decoder") && !str.equals("c2.android.opus.decoder") && !str.equals("OMX.google.vorbis.decoder") && !str.equals("c2.android.vorbis.decoder")) {
            z10 = false;
        }
        this.J0 = z10;
        String str3 = mVar.f54129c;
        int i11 = this.I0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i10);
        int i12 = pVar.G;
        mediaFormat.setInteger("sample-rate", i12);
        l1.a.r(mediaFormat, pVar.f42646q);
        l1.a.n(mediaFormat, "max-input-size", i11);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if ("audio/ac4".equals(str2) && (pairC = l1.c.c(pVar)) != null) {
            l1.a.n(mediaFormat, "profile", ((Integer) pairC.first).intValue());
            l1.a.n(mediaFormat, AppLovinEventTypes.USER_COMPLETED_LEVEL, ((Integer) pairC.second).intValue());
        }
        int i13 = Build.VERSION.SDK_INT;
        i1.o oVar = new i1.o();
        oVar.f42600m = i1.d0.n(MimeTypes.AUDIO_RAW);
        oVar.E = i10;
        oVar.F = i12;
        oVar.G = 4;
        if (this.G0.h(new i1.p(oVar)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i13 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i13 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.R0));
        }
        D(mediaFormat);
        this.L0 = (!MimeTypes.AUDIO_RAW.equals(mVar.f54128b) || MimeTypes.AUDIO_RAW.equals(str2)) ? null : pVar;
        return new com.google.android.gms.internal.consent_sdk.x(mVar, mediaFormat, pVar, (Object) null, mediaCrypto, this.H0);
    }

    @Override // y1.p
    public final void R(o1.d dVar) {
        dm0 dm0Var;
        i1.p pVar = dVar.f47033c;
        if (pVar != null && Objects.equals(pVar.f42643n, MimeTypes.AUDIO_OPUS) && this.f54152e0) {
            ByteBuffer byteBuffer = dVar.f47038h;
            byteBuffer.getClass();
            i1.p pVar2 = dVar.f47033c;
            pVar2.getClass();
            int i10 = pVar2.I;
            if (byteBuffer.remaining() == 8) {
                int i11 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / C.NANOS_PER_SECOND);
                a0 a0Var = this.G0;
                t tVar = a0Var.f49243t;
                if (tVar == null || !tVar.c() || (dm0Var = a0Var.f49239p) == null || !((j) dm0Var.f13587e).f49320k) {
                    return;
                }
                a0Var.f49243t.f49344a.setOffloadDelayPadding(i10, i11);
            }
        }
    }

    @Override // y1.p
    public final void X(Exception exc) {
        l1.a.f("MediaCodecAudioRenderer", "Audio codec error", exc);
        l2.v vVar = this.F0;
        Handler handler = vVar.f44941a;
        if (handler != null) {
            handler.post(new l(vVar, exc, 3));
        }
    }

    @Override // y1.p
    public final void Y(String str, long j10, long j11) {
        l2.v vVar = this.F0;
        Handler handler = vVar.f44941a;
        if (handler != null) {
            handler.post(new l(vVar, str, j10, j11));
        }
    }

    @Override // y1.p
    public final void Z(p1.b bVar) {
        l2.v vVar = this.F0;
        Handler handler = vVar.f44941a;
        if (handler != null) {
            handler.post(new l2.u(17, vVar, bVar));
        }
    }

    @Override // p1.l0
    public final void a(i1.g0 g0Var) {
        a0 a0Var = this.G0;
        a0Var.getClass();
        a0Var.f49247x = new i1.g0(l1.y.i(g0Var.f42544a, 0.1f, 8.0f), l1.y.i(g0Var.f42545b, 0.1f, 8.0f));
        if (a0Var.v()) {
            a0Var.t();
            return;
        }
        z zVar = new z(g0Var, C.TIME_UNSET, C.TIME_UNSET);
        if (a0Var.n()) {
            a0Var.f49245v = zVar;
        } else {
            a0Var.f49246w = zVar;
        }
    }

    @Override // y1.p
    public final void a0(String str) {
        l2.v vVar = this.F0;
        Handler handler = vVar.f44941a;
        if (handler != null) {
            handler.post(new l(vVar, str, 5));
        }
    }

    @Override // p1.l0
    public final boolean b() {
        boolean z10 = this.P0;
        this.P0 = false;
        return z10;
    }

    @Override // y1.p
    public final p1.c b0(s1 s1Var) {
        i1.p pVar = (i1.p) s1Var.f45752c;
        pVar.getClass();
        this.K0 = pVar;
        p1.c cVarB0 = super.b0(s1Var);
        l2.v vVar = this.F0;
        Handler handler = vVar.f44941a;
        if (handler != null) {
            handler.post(new l(vVar, pVar, cVarB0));
        }
        return cVarB0;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00da A[Catch: m -> 0x00d8, TryCatch #0 {m -> 0x00d8, blocks: (B:36:0x00bf, B:39:0x00c5, B:41:0x00ce, B:45:0x00dc, B:44:0x00da), top: B:49:0x00bf }] */
    @Override // y1.p
    public final void c0(i1.p pVar, MediaFormat mediaFormat) throws p1.h {
        int iC;
        i1.p pVar2 = this.L0;
        int[] iArr = null;
        if (pVar2 != null) {
            pVar = pVar2;
        } else if (this.N != null) {
            mediaFormat.getClass();
            if (MimeTypes.AUDIO_RAW.equals(pVar.f42643n)) {
                iC = pVar.H;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iC = mediaFormat.getInteger("pcm-encoding");
            } else {
                iC = mediaFormat.containsKey("v-bits-per-sample") ? l1.y.C(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            i1.o oVar = new i1.o();
            oVar.f42600m = i1.d0.n(MimeTypes.AUDIO_RAW);
            oVar.G = iC;
            oVar.H = pVar.I;
            oVar.I = pVar.J;
            oVar.f42599k = pVar.l;
            oVar.f42589a = pVar.f42631a;
            oVar.f42590b = pVar.f42632b;
            oVar.f42591c = j0.x(pVar.f42633c);
            oVar.f42592d = pVar.f42634d;
            oVar.f42593e = pVar.f42635e;
            oVar.f42594f = pVar.f42636f;
            oVar.E = mediaFormat.getInteger("channel-count");
            oVar.F = mediaFormat.getInteger("sample-rate");
            pVar = new i1.p(oVar);
            if (this.J0) {
                int i10 = pVar.F;
                if (i10 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i10 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i10 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i10 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i10 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            boolean z10 = this.f54152e0;
            a0 a0Var = this.G0;
            if (z10) {
                c1 c1Var = this.f47908d;
                c1Var.getClass();
                if (c1Var.f47979a != 0) {
                    c1 c1Var2 = this.f47908d;
                    c1Var2.getClass();
                    a0Var.f49233i = c1Var2.f47979a;
                } else {
                    a0Var.f49233i = 0;
                }
            } else {
                a0Var.f49233i = 0;
            }
            a0Var.c(pVar, iArr);
        } catch (m e10) {
            throw d(e10, e10.f49323a, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @Override // y1.p
    public final void d0() {
        this.G0.getClass();
    }

    @Override // y1.p
    public final void f0() {
        this.G0.E = true;
    }

    @Override // p1.l0
    public final i1.g0 getPlaybackParameters() {
        return this.G0.f49247x;
    }

    @Override // p1.l0
    public final long getPositionUs() {
        if (this.f47912h == 2) {
            B0();
        }
        return this.M0;
    }

    @Override // p1.a
    public final String h() {
        return "MediaCodecAudioRenderer";
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    @Override // y1.p, p1.a, p1.y0
    public final void handleMessage(int i10, Object obj) {
        y1.h hVar;
        a0 a0Var = this.G0;
        if (i10 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (a0Var.H != fFloatValue) {
                a0Var.H = fFloatValue;
                if (a0Var.n()) {
                    a0Var.f49243t.f49344a.setVolume(a0Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            i1.e eVar = (i1.e) obj;
            eVar.getClass();
            if (a0Var.f49244u.equals(eVar)) {
                return;
            }
            a0Var.f49244u = eVar;
            if (a0Var.V) {
                return;
            }
            a0Var.r();
            return;
        }
        if (i10 == 6) {
            i1.f fVar = (i1.f) obj;
            fVar.getClass();
            if (a0Var.S.equals(fVar)) {
                return;
            }
            if (a0Var.f49243t != null) {
                a0Var.S.getClass();
            }
            a0Var.S = fVar;
            return;
        }
        if (i10 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            a0Var.T = audioDeviceInfo;
            t tVar = a0Var.f49243t;
            if (tVar != null) {
                tVar.f49344a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.R0 = ((Integer) obj).intValue();
            y1.j jVar = this.N;
            if (jVar != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.R0));
                jVar.b(bundle);
                return;
            }
            return;
        }
        if (i10 == 9) {
            obj.getClass();
            a0Var.f49248y = ((Boolean) obj).booleanValue();
            z zVar = new z(a0Var.v() ? i1.g0.f42543d : a0Var.f49247x, C.TIME_UNSET, C.TIME_UNSET);
            if (a0Var.n()) {
                a0Var.f49245v = zVar;
                return;
            } else {
                a0Var.f49246w = zVar;
                return;
            }
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (a0Var.R) {
                if (a0Var.Q == iIntValue) {
                    a0Var.R = false;
                    if (a0Var.Q != iIntValue) {
                        a0Var.Q = iIntValue;
                        a0Var.P = iIntValue != 0;
                        a0Var.r();
                    }
                }
            } else if (a0Var.Q != iIntValue) {
                a0Var.Q = iIntValue;
                a0Var.P = iIntValue != 0;
                a0Var.r();
            }
            if (Build.VERSION.SDK_INT < 35 || (hVar = this.H0) == null) {
                return;
            }
            hVar.d(iIntValue);
            return;
        }
        if (i10 == 19) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            AtomicInteger atomicInteger = a0.f49222c0;
            if (iIntValue2 == 0 || iIntValue2 == -1) {
                iIntValue2 = -1;
            }
            if (a0Var.U == iIntValue2) {
                return;
            }
            a0Var.U = iIntValue2;
            a0Var.r();
            return;
        }
        if (i10 != 20) {
            super.handleMessage(i10, obj);
            return;
        }
        obj.getClass();
        k kVar = (k) obj;
        if (kVar.equals(a0Var.f49241r)) {
            return;
        }
        ((u) a0Var.f49241r).d();
        a0Var.f49241r = kVar;
        x xVar = a0Var.f49242s;
        if (xVar != null) {
            u uVar = (u) kVar;
            uVar.f();
            if (uVar.f49362e == null) {
                mk0 mk0Var = new mk0(Thread.currentThread(), 2);
                uVar.f49362e = mk0Var;
                mk0Var.f17460b = false;
            }
            uVar.f49362e.a(xVar);
        }
        a0Var.r();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    @Override // y1.p
    public final boolean i0(long j10, long j11, y1.j jVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, i1.p pVar) throws p1.h {
        int i13;
        int i14;
        byteBuffer.getClass();
        this.T0 = C.TIME_UNSET;
        if (this.L0 != null && (i11 & 2) != 0) {
            jVar.getClass();
            jVar.t(i10);
            return true;
        }
        a0 a0Var = this.G0;
        if (z10) {
            if (jVar != null) {
                jVar.t(i10);
            }
            this.t0.f22028g += i12;
            a0Var.E = true;
            return true;
        }
        try {
            if (!a0Var.k(j12, byteBuffer, i12)) {
                this.T0 = j12;
                return false;
            }
            if (jVar != null) {
                jVar.t(i10);
            }
            this.t0.f22027f += i12;
            return true;
        } catch (n e10) {
            i1.p pVar2 = this.K0;
            if (this.f54152e0) {
                c1 c1Var = this.f47908d;
                c1Var.getClass();
                if (c1Var.f47979a != 0) {
                    i14 = IronSourceConstants.errorCode_showInProgress;
                } else {
                    i14 = IronSourceConstants.errorCode_biddingDataException;
                }
            } else {
                i14 = IronSourceConstants.errorCode_biddingDataException;
            }
            throw d(e10, pVar2, e10.f49324a, i14);
        } catch (o e11) {
            if (this.f54152e0) {
                c1 c1Var2 = this.f47908d;
                c1Var2.getClass();
                if (c1Var2.f47979a != 0) {
                    i13 = IronSourceConstants.errorCode_loadInProgress;
                } else {
                    i13 = IronSourceConstants.errorCode_isReadyException;
                }
            } else {
                i13 = IronSourceConstants.errorCode_isReadyException;
            }
            throw d(e11, pVar, e11.f49326b, i13);
        }
    }

    @Override // p1.a
    public final boolean j() {
        if (!this.f54162p0) {
            return false;
        }
        a0 a0Var = this.G0;
        if (a0Var.n()) {
            return a0Var.L && !a0Var.l();
        }
        return true;
    }

    @Override // p1.a
    public final boolean l() {
        return this.G0.l();
    }

    @Override // y1.p
    public final void l0() throws p1.h {
        try {
            a0 a0Var = this.G0;
            if (!a0Var.L && a0Var.n() && a0Var.e()) {
                a0Var.p();
                a0Var.L = true;
            }
            long j10 = this.f54168u0.f54147e;
            if (j10 != C.TIME_UNSET) {
                this.T0 = j10;
            }
        } catch (o e10) {
            throw d(e10, e10.f49327c, e10.f49326b, this.f54152e0 ? IronSourceConstants.errorCode_loadInProgress : IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // y1.p, p1.a
    public final void m() {
        l2.v vVar = this.F0;
        this.O0 = true;
        this.K0 = null;
        this.T0 = C.TIME_UNSET;
        this.Q0 = false;
        try {
            this.G0.f();
            try {
                super.m();
            } finally {
                vVar.a(this.t0);
            }
        } catch (Throwable th2) {
            try {
                super.m();
                throw th2;
            } finally {
                vVar.a(this.t0);
            }
        }
    }

    @Override // p1.a
    public final void n(boolean z10, boolean z11) {
        xx1 xx1Var = new xx1(1);
        this.t0 = xx1Var;
        l2.v vVar = this.F0;
        Handler handler = vVar.f44941a;
        if (handler != null) {
            handler.post(new l(vVar, xx1Var, 6));
        }
        c1 c1Var = this.f47908d;
        c1Var.getClass();
        boolean z12 = c1Var.f47980b;
        a0 a0Var = this.G0;
        if (z12) {
            go.k.t(a0Var.P);
            if (!a0Var.V) {
                a0Var.V = true;
                a0Var.r();
            }
        } else if (a0Var.V) {
            a0Var.V = false;
            a0Var.r();
        }
        q1.j jVar = this.f47910f;
        jVar.getClass();
        a0Var.f49236m = jVar;
        l1.u uVar = this.f47911g;
        uVar.getClass();
        ((u) a0Var.f49241r).f49363f = uVar;
    }

    @Override // y1.p, p1.a
    public final void o(long j10, boolean z10, boolean z11) {
        super.o(j10, z10, z11);
        this.G0.f();
        this.M0 = j10;
        this.T0 = C.TIME_UNSET;
        this.P0 = false;
        this.Q0 = false;
        this.N0 = true;
    }

    @Override // p1.a
    public final void p() {
        y1.h hVar;
        ((u) this.G0.f49241r).d();
        if (Build.VERSION.SDK_INT < 35 || (hVar = this.H0) == null) {
            return;
        }
        hVar.b();
    }

    @Override // p1.a
    public final void q() {
        a0 a0Var = this.G0;
        this.P0 = false;
        this.Q0 = false;
        this.T0 = C.TIME_UNSET;
        try {
            try {
                this.f54152e0 = false;
                m0();
                k0();
                na.g gVar = this.H;
                if (gVar != null) {
                    gVar.D(null);
                }
                this.H = null;
                if (this.O0) {
                    this.O0 = false;
                    a0Var.s();
                }
            } catch (Throwable th2) {
                na.g gVar2 = this.H;
                if (gVar2 != null) {
                    gVar2.D(null);
                }
                this.H = null;
                throw th2;
            }
        } catch (Throwable th3) {
            if (this.O0) {
                this.O0 = false;
                a0Var.s();
            }
            throw th3;
        }
    }

    @Override // p1.a
    public final void r() {
        this.G0.o();
        this.S0 = true;
    }

    @Override // p1.a
    public final void s() {
        B0();
        this.S0 = false;
        a0 a0Var = this.G0;
        a0Var.O = false;
        if (a0Var.n()) {
            t tVar = a0Var.f49243t;
            v vVar = tVar.f49348e;
            vVar.f49378k = 0L;
            vVar.f49386t = 0;
            vVar.f49385s = 0;
            vVar.l = 0L;
            vVar.f49391y = C.TIME_UNSET;
            vVar.f49392z = C.TIME_UNSET;
            if (vVar.f49387u == C.TIME_UNSET) {
                vVar.f49375h.a(0);
            }
            vVar.f49389w = vVar.a();
            if (!tVar.f49353j || tVar.c()) {
                tVar.f49344a.pause();
            }
        }
        this.Q0 = false;
    }

    @Override // y1.p
    public final boolean v0(i1.p pVar) {
        c1 c1Var = this.f47908d;
        c1Var.getClass();
        if (c1Var.f47979a != 0) {
            int iA0 = A0(pVar);
            if ((iA0 & 512) != 0) {
                c1 c1Var2 = this.f47908d;
                c1Var2.getClass();
                if (c1Var2.f47979a == 2 || (iA0 & 1024) != 0 || (pVar.I == 0 && pVar.J == 0)) {
                    return true;
                }
            }
        }
        return this.G0.h(pVar) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    @Override // y1.p
    public final int w0(y1.g gVar, i1.p pVar) {
        int iA0;
        n1 n1VarG;
        boolean z10;
        boolean z11;
        int iC = p1.a.c(1, 0, 0, 0);
        String str = pVar.f42643n;
        String str2 = pVar.f42643n;
        if (!i1.d0.i(str)) {
            return p1.a.c(0, 0, 0, 0);
        }
        int i10 = pVar.O;
        boolean z12 = i10 != 0;
        boolean z13 = i10 == 0 || i10 == 2;
        int i11 = 8;
        a0 a0Var = this.G0;
        if (z13) {
            if (z12) {
                List listE = y1.u.e(MimeTypes.AUDIO_RAW, false, false);
                if ((listE.isEmpty() ? null : (y1.m) listE.get(0)) == null) {
                    iA0 = 0;
                }
            }
            iA0 = A0(pVar);
            if (a0Var.h(pVar) != 0) {
                return p1.a.c(4, 8, 32, iA0);
            }
        } else {
            iA0 = 0;
        }
        if (!MimeTypes.AUDIO_RAW.equals(str2) || a0Var.h(pVar) != 0) {
            int i12 = pVar.F;
            int i13 = pVar.G;
            i1.o oVar = new i1.o();
            oVar.f42600m = i1.d0.n(MimeTypes.AUDIO_RAW);
            oVar.E = i12;
            oVar.F = i13;
            oVar.G = 2;
            if (a0Var.h(new i1.p(oVar)) != 0) {
                if (str2 == null) {
                    n1VarG = n1.f47281e;
                } else if (a0Var.h(pVar) != 0) {
                    List listE2 = y1.u.e(MimeTypes.AUDIO_RAW, false, false);
                    y1.m mVar = listE2.isEmpty() ? null : (y1.m) listE2.get(0);
                    if (mVar != null) {
                        n1VarG = j0.B(mVar);
                    } else {
                        n1VarG = y1.u.g(gVar, pVar, false, false);
                    }
                } else {
                    n1VarG = y1.u.g(gVar, pVar, false, false);
                }
                if (!n1VarG.isEmpty()) {
                    if (!z13) {
                        return p1.a.c(2, 0, 0, 0);
                    }
                    y1.m mVar2 = (y1.m) n1VarG.get(0);
                    Context context = this.E0;
                    boolean zE = mVar2.e(context, pVar);
                    if (!zE) {
                        int i14 = 1;
                        while (true) {
                            if (i14 >= n1VarG.f47283d) {
                                z10 = zE;
                                z11 = true;
                                break;
                            }
                            y1.m mVar3 = (y1.m) n1VarG.get(i14);
                            if (mVar3.e(context, pVar)) {
                                z11 = false;
                                mVar2 = mVar3;
                                z10 = true;
                                break;
                            }
                            i14++;
                        }
                    } else {
                        z10 = zE;
                        z11 = true;
                        break;
                    }
                    int i15 = z10 ? 4 : 3;
                    if (z10 && mVar2.f(pVar)) {
                        i11 = 16;
                    }
                    return (mVar2.f54133g ? 64 : 0) | i15 | i11 | 32 | (z11 ? 128 : 0) | iA0;
                }
            }
        }
        return iC;
    }

    @Override // p1.a
    public final l0 g() {
        return this;
    }
}
