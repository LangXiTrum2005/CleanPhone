package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u12 {
    public static final AtomicInteger Y = new AtomicInteger();
    public long A;
    public int B;
    public boolean C;
    public boolean D;
    public long E;
    public long F;
    public float G;
    public ByteBuffer H;
    public int I;
    public ByteBuffer J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public ei0 Q;
    public AudioDeviceInfo R;
    public int S;
    public long T;
    public long U;
    public long V;
    public Handler W;
    public final ay0 X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m12 f20572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z12 f20573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t70 f20574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t70 f20575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ya1 f20576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f20577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o12 f20578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t12 f20579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t12 f20580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j02 f20581k;
    public uo0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public q12 f20582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q12 f20583n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q20 f20584o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k12 f20585p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r12 f20586q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j12 f20587r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z80 f20588s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public s12 f20589t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public s12 f20590u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public cc f20591v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f20593x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f20594y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f20595z;

    public u12(p12 p12Var) {
        int deviceId;
        Context context = (Context) p12Var.f18438b;
        this.f20571a = context == null ? null : context.getApplicationContext();
        this.f20588s = z80.f22559b;
        this.X = (ay0) p12Var.f18442f;
        this.f20585p = (k12) p12Var.f18441e;
        m12 m12Var = new m12();
        this.f20572b = m12Var;
        z12 z12Var = new z12();
        z12Var.f22466m = uu0.f20902b;
        this.f20573c = z12Var;
        this.f20574d = new t70(0);
        this.f20575e = new t70(1);
        this.f20576f = ca1.v(z12Var, m12Var);
        this.G = 1.0f;
        this.O = 0;
        this.Q = new ei0();
        cc ccVar = cc.f13129d;
        this.f20590u = new s12(ccVar, 0L, 0L);
        this.f20591v = ccVar;
        this.f20592w = false;
        this.f20577g = new ArrayDeque();
        this.f20579i = new t12();
        this.f20580j = new t12();
        int i10 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i10 = deviceId;
        }
        this.S = i10;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    public static int c(int i10, ByteBuffer byteBuffer) {
        int i11;
        int i12;
        int i13;
        byte b10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (i10 == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i11 = 0;
            } else {
                byte b11 = byteBuffer.get(26);
                int i19 = 28;
                int i20 = 28;
                for (int i21 = 0; i21 < b11; i21++) {
                    i20 += byteBuffer.get(i21 + 27);
                }
                byte b12 = byteBuffer.get(i20 + 26);
                for (int i22 = 0; i22 < b12; i22++) {
                    i19 += byteBuffer.get(i20 + 27 + i22);
                }
                i11 = i20 + i19;
            }
            int i23 = byteBuffer.get(i11 + 26) + 27 + i11;
            return (int) ((x10.D(byteBuffer.get(i23), byteBuffer.limit() - i23 > 1 ? byteBuffer.get(i23 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iPosition = byteBuffer.position();
                    String str = uu0.f20901a;
                    int iReverseBytes = byteBuffer.getInt(iPosition);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    if ((iReverseBytes & (-2097152)) != -2097152 || (i16 = (iReverseBytes >>> 19) & 3) == 1 || (i17 = (iReverseBytes >>> 17) & 3) == 0) {
                        i15 = -1;
                    } else {
                        int i24 = iReverseBytes >>> 12;
                        int i25 = (iReverseBytes >>> 10) & 3;
                        int i26 = i24 & 15;
                        if (i26 == 0 || i26 == 15 || i25 == 3) {
                            i15 = -1;
                        } else {
                            i15 = 1152;
                            if (i17 != 1) {
                                if (i17 != 2) {
                                    i15 = 384;
                                }
                            } else if (i16 != 3) {
                                i15 = 576;
                            }
                        }
                    }
                    if (i15 != -1) {
                        return i15;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return com.ironsource.mediationsdk.metadata.a.f29616n;
                default:
                    switch (i10) {
                        case 14:
                            int iPosition2 = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i27 = iPosition2;
                            while (true) {
                                if (i27 <= iLimit) {
                                    String str2 = uu0.f20901a;
                                    int iReverseBytes2 = byteBuffer.getInt(i27 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                    }
                                    if ((iReverseBytes2 & (-2)) == -126718022) {
                                        i18 = i27 - iPosition2;
                                    } else {
                                        i27++;
                                    }
                                } else {
                                    i18 = -1;
                                }
                            }
                            if (i18 != -1) {
                                return (40 << ((byteBuffer.get((byteBuffer.position() + i18) + ((byteBuffer.get((byteBuffer.position() + i18) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            }
                            return 0;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int iPosition3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition3);
                            return rb0.n(new gp0(bArr, 16)).f20105c;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 27), "Unexpected audio encoding: ", i10));
                    }
                    break;
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return x10.f21676b[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * NotificationCompat.FLAG_LOCAL_ONLY;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition4 = byteBuffer.position();
        byte b13 = byteBuffer.get(iPosition4);
        if (b13 != -2) {
            if (b13 != -1) {
                if (b13 != 31) {
                    i13 = (byteBuffer.get(iPosition4 + 4) & 1) << 6;
                    i14 = byteBuffer.get(iPosition4 + 5) & 252;
                } else {
                    i13 = (byteBuffer.get(iPosition4 + 5) & 7) << 4;
                    b10 = byteBuffer.get(iPosition4 + 6);
                }
                i12 = (i14 >> 2) | i13;
            } else {
                i13 = (byteBuffer.get(iPosition4 + 4) & 7) << 4;
                b10 = byteBuffer.get(iPosition4 + 7);
            }
            i14 = b10 & 60;
            i12 = (i14 >> 2) | i13;
        } else {
            i12 = ((byteBuffer.get(iPosition4 + 5) & 1) << 6) | ((byteBuffer.get(iPosition4 + 4) & 252) >> 2);
        }
        return (i12 + 1) * 32;
    }

    public final void a() {
        if (l()) {
            this.f20593x = 0L;
            this.f20594y = 0L;
            this.f20595z = 0L;
            this.A = 0L;
            this.B = 0;
            this.f20590u = new s12(this.f20591v, 0L, 0L);
            this.E = 0L;
            this.f20589t = null;
            this.f20577g.clear();
            this.H = null;
            this.I = 0;
            this.J = null;
            this.L = false;
            this.K = false;
            this.M = false;
            this.f20573c.f22468o = 0L;
            d(C.TIME_UNSET);
            this.f20578h = null;
            q12 q12Var = this.f20582m;
            if (q12Var != null) {
                this.f20583n = q12Var;
                this.f20582m = null;
            }
            Y.incrementAndGet();
            j12 j12Var = this.f20587r;
            if (j12Var.f15921e.f16649d.getPlayState() == 3) {
                j12Var.f15917a.pause();
            }
            if (j12Var.b()) {
                ay0 ay0Var = j12Var.f15924h;
                ay0Var.getClass();
                ((j12) ay0Var.f12539d).f15917a.unregisterStreamEventCallback((h12) ay0Var.f12538c);
                ((Handler) ay0Var.f12537b).removeCallbacksAndMessages(null);
            }
            uw uwVar = j12Var.f15920d;
            if (uwVar != null) {
                g12 g12Var = (g12) uwVar.f20918b;
                g12Var.getClass();
                ((AudioTrack) uwVar.f20919c).removeOnRoutingChangedListener(g12Var);
                uwVar.f20918b = null;
                j12Var.f15920d = null;
            }
            AudioTrack audioTrack = j12Var.f15917a;
            mk0 mk0Var = j12Var.f15925i;
            Handler handlerO = uu0.o();
            synchronized (j12.f15914o) {
                try {
                    if (j12.f15915p == null) {
                        j12.f15915p = Executors.newSingleThreadScheduledExecutor(new xt0());
                    }
                    j12.f15916q++;
                    j12.f15915p.schedule(new o1(audioTrack, handlerO, mk0Var, 17), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f20587r = null;
        }
        t12 t12Var = this.f20580j;
        t12Var.f20114a = null;
        t12Var.f20115b = C.TIME_UNSET;
        t12Var.f20116c = C.TIME_UNSET;
        t12 t12Var2 = this.f20579i;
        t12Var2.f20114a = null;
        t12Var2.f20115b = C.TIME_UNSET;
        t12Var2.f20116c = C.TIME_UNSET;
        this.U = 0L;
        this.V = 0L;
        Handler handler = this.W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void b() {
        a();
        ya1 ya1Var = this.f20576f;
        int i10 = ya1Var.f22210d;
        for (int i11 = 0; i11 < i10; i11++) {
            ((x40) ya1Var.get(i11)).zzj();
        }
        this.f20574d.zzj();
        this.f20575e.zzj();
        q20 q20Var = this.f20584o;
        if (q20Var != null) {
            int i12 = 0;
            while (true) {
                ca1 ca1Var = q20Var.f18889a;
                if (i12 >= ca1Var.size()) {
                    break;
                }
                x40 x40Var = (x40) ca1Var.get(i12);
                x40Var.b(a40.f11840d);
                x40Var.zzj();
                i12++;
            }
            q20Var.f18890b.clear();
            q20Var.f18891c = new ByteBuffer[0];
            z20 z20Var = z20.f22471e;
            q20Var.f18892d = false;
        }
        this.N = false;
    }

    public final void d(long j10) {
        long j11;
        q12 q12Var = this.f20583n;
        this.f20584o = (q20) q12Var.f18885f;
        if (j10 == C.TIME_UNSET) {
            j11 = 0;
        } else {
            j11 = j10 - this.F;
            if (((ci) q12Var.f18886g) != ci.f13168a && q12Var.f18887h != null) {
                ug ugVar = new ug();
                q12 q12Var2 = this.f20583n;
                ((ci) q12Var2.f18886g).o(q12Var2.f18887h, ugVar);
            }
        }
        q20 q20Var = this.f20584o;
        p30 p30Var = new p30();
        q12 q12Var3 = this.f20583n;
        p30Var.f18467b = (ci) q12Var3.f18886g;
        p30Var.f18468c = q12Var3.f18887h;
        p30Var.f18466a = j11;
        a40 a40VarB = p30Var.b();
        ArrayList arrayList = q20Var.f18890b;
        arrayList.clear();
        q20Var.f18892d = false;
        int i10 = 0;
        while (true) {
            ca1 ca1Var = q20Var.f18889a;
            if (i10 >= ca1Var.size()) {
                break;
            }
            x40 x40Var = (x40) ca1Var.get(i10);
            x40Var.b(a40VarB);
            if (x40Var.zzc()) {
                p30 p30Var2 = new p30();
                long j12 = a40VarB.f11841a;
                p30Var2.f18466a = j12;
                p30Var2.f18467b = a40VarB.f11842b;
                p30Var2.f18468c = a40VarB.f11843c;
                p30Var2.f18466a = x40Var.c(j12);
                a40VarB = p30Var2.b();
                arrayList.add(x40Var);
            }
            i10++;
        }
        q20Var.f18891c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= q20Var.e(); i11++) {
            q20Var.f18891c[i11] = ((x40) arrayList.get(i11)).zzf();
        }
    }

    public final j12 e(w02 w02Var) throws b12 {
        try {
            return this.f20585p.c(w02Var);
        } catch (v02 e10) {
            int i10 = w02Var.f21355b;
            int i11 = w02Var.f21356c;
            int i12 = w02Var.f21354a;
            int i13 = w02Var.f21357d;
            String strValueOf = String.valueOf((g22) this.f20583n.f18882c);
            int length = String.valueOf(i10).length();
            int length2 = String.valueOf(i11).length();
            int length3 = String.valueOf(i12).length();
            StringBuilder sb2 = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i13).length() + 2 + strValueOf.length());
            l1.d.p(sb2, "AudioTrack init failed 0 Config(", i10, ", ", i11);
            l1.d.p(sb2, ", ", i12, ", ", i13);
            b12 b12Var = new b12(q4.a.j(sb2, ") ", strValueOf, ""), e10);
            uo0 uo0Var = this.l;
            if (uo0Var == null) {
                throw b12Var;
            }
            uo0Var.i(b12Var);
            throw b12Var;
        }
    }

    public final void f(long j10) throws Exception {
        ByteBuffer byteBuffer;
        i(j10);
        if (this.J != null) {
            return;
        }
        if (!this.f20584o.b()) {
            ByteBuffer byteBuffer2 = this.H;
            if (byteBuffer2 != null) {
                h(byteBuffer2);
                i(j10);
                return;
            }
            return;
        }
        while (!this.f20584o.c()) {
            do {
                q20 q20Var = this.f20584o;
                if (q20Var.b()) {
                    ByteBuffer byteBuffer3 = q20Var.f18891c[q20Var.e()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        q20Var.d(x40.f21739a);
                        byteBuffer = q20Var.f18891c[q20Var.e()];
                    }
                } else {
                    byteBuffer = x40.f21739a;
                }
                if (byteBuffer.hasRemaining()) {
                    h(byteBuffer);
                    i(j10);
                } else {
                    ByteBuffer byteBuffer4 = this.H;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    q20 q20Var2 = this.f20584o;
                    ByteBuffer byteBuffer5 = this.H;
                    if (q20Var2.b() && !q20Var2.f18892d) {
                        q20Var2.d(byteBuffer5);
                    }
                }
            } while (this.J == null);
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0045 A[RETURN] */
    public final boolean g() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f20584o.b()) {
            i(Long.MIN_VALUE);
            if (this.J == null) {
                return true;
            }
            return false;
        }
        q20 q20Var = this.f20584o;
        if (q20Var.b() && !q20Var.f18892d) {
            q20Var.f18892d = true;
            ((x40) q20Var.f18890b.get(0)).zze();
        }
        f(Long.MIN_VALUE);
        if (!this.f20584o.c() || ((byteBuffer = this.J) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x029d  */
    /* JADX WARN: Code duplicated, block: B:102:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:110:0x02db  */
    /* JADX WARN: Code duplicated, block: B:116:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[PHI: r3
  0x00bd: PHI (r3v98 double) = (r3v93 double), (r3v106 double) binds: [B:46:0x00fb, B:34:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3 A[PHI: r3
  0x00c3: PHI (r3v94 double) = (r3v93 double), (r3v106 double) binds: [B:46:0x00fb, B:34:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e4 A[PHI: r3 r23
  0x00e4: PHI (r3v68 float) = (r3v63 float), (r3v105 float) binds: [B:57:0x01a2, B:41:0x00e2] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r23v7 long) = (r23v4 long), (r23v15 long) binds: [B:57:0x01a2, B:41:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea A[PHI: r3 r23
  0x00ea: PHI (r3v64 float) = (r3v63 float), (r3v105 float) binds: [B:57:0x01a2, B:41:0x00e2] A[DONT_GENERATE, DONT_INLINE]
  0x00ea: PHI (r23v5 long) = (r23v4 long), (r23v15 long) binds: [B:57:0x01a2, B:41:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01da  */
    /* JADX WARN: Code duplicated, block: B:72:0x01de  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x020f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0211  */
    /* JADX WARN: Code duplicated, block: B:90:0x0216  */
    /* JADX WARN: Code duplicated, block: B:92:0x0226 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0228  */
    /* JADX WARN: Code duplicated, block: B:94:0x0231  */
    /* JADX WARN: Code duplicated, block: B:95:0x0239  */
    /* JADX WARN: Code duplicated, block: B:96:0x0251  */
    /* JADX WARN: Code duplicated, block: B:97:0x0264  */
    /* JADX WARN: Code duplicated, block: B:98:0x0271  */
    /* JADX WARN: Code duplicated, block: B:99:0x0288  */
    public final void h(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        double d10;
        float fMax;
        float f11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        double dMax;
        double d11;
        ps1.c0(this.J == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f20583n.c()) {
                int iV = (int) uu0.v(uu0.t(20L), ((w02) this.f20583n.f18884e).f21355b, 1000000L, RoundingMode.UP);
                long jM = m();
                long j10 = iV;
                if (jM < j10) {
                    q12 q12Var = this.f20583n;
                    int i21 = ((w02) q12Var.f18884e).f21354a;
                    int i22 = q12Var.f18881b;
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i23 = (int) jM;
                    while (byteBuffer.hasRemaining() && i23 < iV) {
                        if (i21 != 2) {
                            if (i21 == 3) {
                                j10 = j10;
                                i12 = (byteBuffer.get() & 255) << 24;
                            } else if (i21 != 4) {
                                if (i21 != 21) {
                                    if (i21 == 22) {
                                        i17 = byteBuffer.get() & 255;
                                        i18 = (byteBuffer.get() & 255) << 8;
                                        i19 = (byteBuffer.get() & 255) << 16;
                                        i20 = (byteBuffer.get() & 255) << 24;
                                    } else if (i21 == 268435456) {
                                        i10 = (byteBuffer.get() & 255) << 24;
                                        i11 = (byteBuffer.get() & 255) << 16;
                                    } else if (i21 == 1342177280) {
                                        i14 = (byteBuffer.get() & 255) << 24;
                                        i15 = (byteBuffer.get() & 255) << 16;
                                        i16 = (byteBuffer.get() & 255) << 8;
                                    } else if (i21 != 1610612736) {
                                        j10 = j10;
                                        if (i21 == 1879048192) {
                                            dMax = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                            if (dMax < 0.0d) {
                                                d11 = (-dMax) * (-2.147483648E9d);
                                            } else {
                                                d11 = dMax * 2.147483647E9d;
                                            }
                                        } else if (i21 == 1895825408) {
                                            fMax = Math.max(-1.0f, Math.min(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), 1.0f));
                                            if (fMax < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                f11 = (-fMax) * (-2.1474836E9f);
                                            } else {
                                                f11 = fMax * 2.1474836E9f;
                                            }
                                            i12 = (int) f11;
                                        } else {
                                            if (i21 != 1912602624) {
                                                throw new IllegalStateException();
                                            }
                                            dMax = Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())), 1.0d));
                                            if (dMax < 0.0d) {
                                                d11 = (-dMax) * (-2.147483648E9d);
                                            } else {
                                                d11 = dMax * 2.147483647E9d;
                                            }
                                        }
                                        i12 = (int) d11;
                                    } else {
                                        i17 = (byteBuffer.get() & 255) << 24;
                                        i18 = (byteBuffer.get() & 255) << 16;
                                        i19 = (byteBuffer.get() & 255) << 8;
                                        i20 = byteBuffer.get() & 255;
                                    }
                                    i12 = i17 | i18 | i19 | i20;
                                } else {
                                    i14 = (byteBuffer.get() & 255) << 8;
                                    i15 = (byteBuffer.get() & 255) << 16;
                                    i16 = (byteBuffer.get() & 255) << 24;
                                }
                                i12 = i14 | i15 | i16;
                            } else {
                                j10 = j10;
                                fMax = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                if (fMax < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    f11 = (-fMax) * (-2.1474836E9f);
                                } else {
                                    f11 = fMax * 2.1474836E9f;
                                }
                                i12 = (int) f11;
                            }
                            i13 = (int) ((((long) i12) * ((long) i23)) / j10);
                            if (i21 != 2) {
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i21 != 3) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i21 != 4) {
                                if (i21 != 21) {
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                } else if (i21 != 22) {
                                    byteBufferOrder.put((byte) i13);
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                } else if (i21 != 268435456) {
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                } else if (i21 != 1342177280) {
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                } else if (i21 != 1610612736) {
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                    byteBufferOrder.put((byte) i13);
                                } else if (i21 != 1879048192) {
                                    if (i21 != 1895825408) {
                                        if (i13 < 0) {
                                            f10 = (-i13) / (-2.1474836E9f);
                                        } else {
                                            f10 = i13 / 2.1474836E9f;
                                        }
                                        byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f10)));
                                    } else {
                                        if (i21 == 1912602624) {
                                            throw new IllegalStateException();
                                        }
                                        if (i13 < 0) {
                                            d10 = (-i13) / (-2.147483648E9d);
                                        } else {
                                            d10 = ((double) i13) / 2.147483647E9d;
                                        }
                                        byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d10)));
                                    }
                                } else if (i13 < 0) {
                                    byteBufferOrder.putDouble((-i13) / (-2.147483648E9d));
                                } else {
                                    byteBufferOrder.putDouble(((double) i13) / 2.147483647E9d);
                                }
                            } else if (i13 < 0) {
                                byteBufferOrder.putFloat((-i13) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i13 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i22) {
                                i23++;
                                iPosition = byteBuffer.position();
                            }
                            j10 = j10;
                        } else {
                            i10 = (byteBuffer.get() & 255) << 16;
                            i11 = (byteBuffer.get() & 255) << 24;
                        }
                        i12 = i10 | i11;
                        i13 = (int) ((((long) i12) * ((long) i23)) / j10);
                        if (i21 != 2) {
                            byteBufferOrder.put((byte) (i13 >> 16));
                            byteBufferOrder.put((byte) (i13 >> 24));
                        } else if (i21 != 3) {
                            byteBufferOrder.put((byte) (i13 >> 24));
                        } else if (i21 != 4) {
                            if (i21 != 21) {
                                byteBufferOrder.put((byte) (i13 >> 8));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i21 != 22) {
                                byteBufferOrder.put((byte) i13);
                                byteBufferOrder.put((byte) (i13 >> 8));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i21 != 268435456) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                                byteBufferOrder.put((byte) (i13 >> 16));
                            } else if (i21 != 1342177280) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 8));
                            } else if (i21 != 1610612736) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 8));
                                byteBufferOrder.put((byte) i13);
                            } else if (i21 != 1879048192) {
                                if (i21 != 1895825408) {
                                    if (i13 < 0) {
                                        f10 = (-i13) / (-2.1474836E9f);
                                    } else {
                                        f10 = i13 / 2.1474836E9f;
                                    }
                                    byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f10)));
                                } else {
                                    if (i21 == 1912602624) {
                                        throw new IllegalStateException();
                                    }
                                    if (i13 < 0) {
                                        d10 = (-i13) / (-2.147483648E9d);
                                    } else {
                                        d10 = ((double) i13) / 2.147483647E9d;
                                    }
                                    byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d10)));
                                }
                            } else if (i13 < 0) {
                                byteBufferOrder.putDouble((-i13) / (-2.147483648E9d));
                            } else {
                                byteBufferOrder.putDouble(((double) i13) / 2.147483647E9d);
                            }
                        } else if (i13 < 0) {
                            byteBufferOrder.putFloat((-i13) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i13 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i22) {
                            i23++;
                            iPosition = byteBuffer.position();
                        }
                        j10 = j10;
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                    byteBuffer2 = byteBufferOrder;
                } else {
                    byteBuffer2 = byteBuffer;
                }
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.J = byteBuffer2;
        }
    }

    public final void i(long j10) throws Exception {
        if (this.J == null) {
            return;
        }
        t12 t12Var = this.f20580j;
        if (t12Var.f20114a != null && (Y.get() > 0 || SystemClock.elapsedRealtime() < t12Var.f20116c)) {
            return;
        }
        int iRemaining = this.J.remaining();
        boolean z10 = false;
        try {
            boolean zA = this.f20587r.a(this.I, this.J);
            this.T = SystemClock.elapsedRealtime();
            t12Var.f20114a = null;
            t12Var.f20115b = C.TIME_UNSET;
            t12Var.f20116c = C.TIME_UNSET;
            this.f20587r.b();
            if (this.f20583n.c()) {
                this.f20595z += (long) (iRemaining - this.J.remaining());
            }
            if (zA) {
                if (!this.f20583n.c()) {
                    ps1.c0(this.J == this.H);
                    this.A = (((long) this.B) * ((long) this.I)) + this.A;
                }
                this.J = null;
            }
        } catch (q02 e10) {
            boolean z11 = e10.f18852b;
            if (z11) {
                if (m() > 0) {
                    z10 = true;
                } else if (this.f20587r.b()) {
                    this.f20583n.getClass();
                    z10 = true;
                }
            }
            c12 c12Var = new c12(e10.f18851a, (g22) this.f20583n.f18882c, z10);
            uo0 uo0Var = this.l;
            if (uo0Var != null) {
                uo0Var.i(c12Var);
            }
            if (z11) {
                throw c12Var;
            }
            t12Var.b(c12Var);
        }
    }

    public final void j() {
        if (this.f20583n != null) {
            q12 q12Var = this.f20582m;
            if (q12Var != null) {
                this.f20583n = q12Var;
                this.f20582m = null;
            }
            try {
                this.f20583n = this.f20583n.b(this.f20585p.b(n((g22) this.f20583n.f18883d)));
            } catch (r02 e10) {
                throw new IllegalStateException(new a12(e10, (g22) this.f20583n.f18882c));
            }
        }
        a();
    }

    public final void k(long j10) {
        cc ccVar;
        boolean zC = this.f20583n.c();
        boolean z10 = false;
        ay0 ay0Var = this.X;
        if (zC) {
            int i10 = ((g22) this.f20583n.f18882c).J;
            ccVar = this.f20591v;
            i70 i70Var = (i70) ay0Var.f12539d;
            float f10 = ccVar.f13130a;
            i70Var.getClass();
            ps1.v(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (i70Var.f15632c != f10) {
                i70Var.f15632c = f10;
                i70Var.f15638i = true;
            }
            float f11 = ccVar.f13131b;
            ps1.v(f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (i70Var.f15633d != f11) {
                i70Var.f15633d = f11;
                i70Var.f15638i = true;
            }
        } else {
            ccVar = cc.f13129d;
        }
        cc ccVar2 = ccVar;
        this.f20591v = ccVar2;
        if (this.f20583n.c()) {
            int i11 = ((g22) this.f20583n.f18882c).J;
            z10 = this.f20592w;
            ((x12) ay0Var.f12538c).f21705j = z10;
        }
        this.f20592w = z10;
        this.f20577g.add(new s12(ccVar2, Math.max(0L, j10), uu0.u(((w02) this.f20583n.f18884e).f21355b, m())));
        d(j10);
        uo0 uo0Var = this.l;
        if (uo0Var != null) {
            boolean z11 = this.f20592w;
            iw0 iw0Var = ((w12) uo0Var.f20839b).A0;
            Handler handler = (Handler) iw0Var.f15864b;
            if (handler != null) {
                handler.post(new com.adjust.sdk.f0(3, iw0Var, z11));
            }
        }
    }

    public final boolean l() {
        return this.f20587r != null;
    }

    public final long m() {
        if (!this.f20583n.c()) {
            return this.A;
        }
        long j10 = this.f20595z;
        long j11 = this.f20583n.f18881b;
        String str = uu0.f20901a;
        return ((j10 + j11) - 1) / j11;
    }

    public final s02 n(g22 g22Var) {
        s02 s02Var = new s02(g22Var);
        s02Var.f19752b = this.f20588s;
        s02Var.f19753c = this.R;
        s02Var.f19754d = this.O;
        s02Var.f19756f = -1;
        s02Var.f19755e = this.S;
        return new s02(s02Var);
    }

    public final void o() {
        if (this.L) {
            return;
        }
        this.L = true;
        if (this.f20587r.b()) {
            this.M = false;
        }
        j12 j12Var = this.f20587r;
        if (j12Var.f15926j) {
            return;
        }
        j12Var.f15926j = true;
        l12 l12Var = j12Var.f15921e;
        long jD = j12Var.d();
        l12Var.f16667w = l12Var.d();
        l12Var.f16647b.getClass();
        l12Var.f16665u = uu0.t(SystemClock.elapsedRealtime());
        l12Var.f16668x = jD;
        j12Var.f15917a.stop();
    }

    public final int p(g22 g22Var) {
        boolean z10;
        int i10 = g22Var.J;
        if (!uu0.d(i10) || i10 == 2) {
            z10 = false;
        } else {
            i12 i12Var = new i12(g22Var);
            i12Var.I = 2;
            g22Var = new g22(i12Var);
            z10 = true;
        }
        int i11 = this.f20585p.a(n(g22Var)).f20564d;
        if (i11 != 1) {
            if (i11 != 2) {
                return 0;
            }
            if (!z10) {
                return 2;
            }
        }
        return 1;
    }

    public final void q(y02 y02Var) throws a12 {
        q20 q20Var;
        int iF;
        int iF2;
        g22 g22Var;
        r12 r12Var = this.f20586q;
        k12 k12Var = this.f20585p;
        if (r12Var == null && this.f20571a != null) {
            r12 r12Var2 = new r12(this);
            this.f20586q = r12Var2;
            k12Var.e();
            if (k12Var.f16269c == null) {
                k12Var.f16269c = new mk0(Thread.currentThread(), 0);
            }
            k12Var.f16269c.g(r12Var2);
        }
        g22 g22Var2 = y02Var.f22063a;
        String str = g22Var2.f14678o;
        int i10 = g22Var2.G;
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            int i11 = g22Var2.J;
            ps1.v(uu0.d(i11));
            iF = uu0.f(i11) * i10;
            z91 z91Var = new z91(4);
            z91Var.b(this.f20576f);
            z91Var.a(this.f20574d);
            x40[] x40VarArr = (x40[]) this.X.f12537b;
            ps1.s(2, x40VarArr);
            z91Var.e(2);
            System.arraycopy(x40VarArr, 0, z91Var.f21798a, z91Var.f21799b, 2);
            z91Var.f21799b += 2;
            q20Var = new q20(z91Var.f());
            if (q20Var.equals(this.f20584o)) {
                q20Var = this.f20584o;
            }
            int i12 = g22Var2.K;
            int i13 = g22Var2.L;
            z12 z12Var = this.f20573c;
            z12Var.f22463i = i12;
            z12Var.f22464j = i13;
            this.f20572b.f17212i = y02Var.f22064b;
            try {
                z20 z20VarA = q20Var.a(new z20(g22Var2.I, i10, i11));
                i12 i12Var = new i12(g22Var2);
                int i14 = z20VarA.f22474c;
                i12Var.I = i14;
                i12Var.H = z20VarA.f22472a;
                int i15 = z20VarA.f22473b;
                i12Var.F = i15;
                i12Var.G = i15 == i10 ? g22Var2.H : -1;
                g22Var = new g22(i12Var);
                iF2 = uu0.f(i14) * i15;
            } catch (p40 e10) {
                throw new a12(e10, g22Var2);
            }
        } else {
            q20Var = new q20(ya1.f22208e);
            iF = -1;
            iF2 = -1;
            g22Var = g22Var2;
        }
        q20 q20Var2 = q20Var;
        s02 s02VarN = n(g22Var);
        g22 g22Var3 = s02VarN.f19751a;
        try {
            w02 w02VarB = k12Var.b(s02VarN);
            if (w02VarB.f21354a == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 36);
                sb2.append("Invalid output encoding (isOffload=false)");
                throw new a12(sb2.toString(), g22Var3);
            }
            if (w02VarB.f21356c == 0) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(false).length() + 42);
                sb3.append("Invalid output channel config (isOffload=false)");
                throw new a12(sb3.toString(), g22Var3);
            }
            ci ciVar = y02Var.f22065c;
            r32 r32Var = y02Var.f22066d;
            q12 q12Var = new q12(g22Var2, g22Var, iF, iF2, w02VarB, q20Var2, ciVar, r32Var != null ? r32Var.f19359a : null);
            if (l()) {
                this.f20582m = q12Var;
            } else {
                this.f20583n = q12Var;
            }
        } catch (r02 e11) {
            throw new a12(e11, g22Var2);
        }
    }

    public final void r() {
        this.N = true;
        if (l()) {
            j12 j12Var = this.f20587r;
            l12 l12Var = j12Var.f15921e;
            if (l12Var.f16665u != C.TIME_UNSET) {
                l12Var.f16647b.getClass();
                l12Var.f16665u = uu0.t(SystemClock.elapsedRealtime());
            }
            l12Var.f16655j = uu0.u(l12Var.f16650e, l12Var.d());
            l12Var.f16653h.b(0);
            if (!j12Var.f15926j || j12Var.b()) {
                j12Var.f15917a.play();
            }
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final boolean s(long r21, java.nio.ByteBuffer r23, int r24) {
        /*
            Method dump skipped, instruction units count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u12.s(long, java.nio.ByteBuffer, int):boolean");
    }

    public final boolean t() {
        if (!l()) {
            return false;
        }
        if (this.f20587r.b() && this.M) {
            return false;
        }
        long jM = m();
        long jA = this.f20587r.f15921e.a();
        j12 j12Var = this.f20587r;
        j12Var.getClass();
        return jM > uu0.v(jA, (long) j12Var.f15917a.getSampleRate(), 1000000L, RoundingMode.UP);
    }
}
