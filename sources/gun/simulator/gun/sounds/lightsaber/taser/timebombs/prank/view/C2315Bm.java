package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2315Bm implements InterfaceC4726u7 {
    public static final Object d0 = new Object();
    public static ExecutorService e0;
    public static int f0;
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public InterfaceC3759j7[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public C4377q8 X;
    public C4518rm Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3144c7 f2890a;
    public long a0;
    public final C4568sM b;
    public boolean b0;
    public final boolean c;
    public boolean c0;
    public final C3713ie d;
    public final C3450fe0 e;
    public final InterfaceC3759j7[] f;
    public final InterfaceC3759j7[] g;
    public final C4581sZ h;
    public final C5078y7 i;
    public final ArrayDeque j;
    public final boolean k;
    public final int l;
    public C2289Am m;
    public final C4958wm n;
    public final C4958wm o;
    public final C2341Cm p;
    public WU q;
    public Wm0 r;
    public C4782um s;
    public C4782um t;
    public AudioTrack u;
    public Z6 v;
    public C4870vm w;
    public C4870vm x;
    public EU y;
    public ByteBuffer z;

    public C2315Bm(C4694tm c4694tm) {
        this.f2890a = c4694tm.f5050a;
        C4568sM c4568sM = c4694tm.b;
        this.b = c4568sM;
        int i = Ug0.f3833a;
        this.c = i >= 21 && c4694tm.c;
        this.k = i >= 23 && c4694tm.d;
        this.l = i >= 29 ? c4694tm.e : 0;
        this.p = c4694tm.f;
        C4581sZ c4581sZ = new C4581sZ();
        this.h = c4581sZ;
        c4581sZ.d();
        this.i = new C5078y7(new C5046xm(this));
        C3713ie c3713ie = new C3713ie();
        this.d = c3713ie;
        C3450fe0 c3450fe0 = new C3450fe0();
        c3450fe0.m = Ug0.e;
        this.e = c3450fe0;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C3087bZ(), c3713ie, c3450fe0);
        Collections.addAll(arrayList, (InterfaceC3759j7[]) c4568sM.b);
        this.f = (InterfaceC3759j7[]) arrayList.toArray(new InterfaceC3759j7[0]);
        this.g = new InterfaceC3759j7[]{new C4091mv()};
        this.J = 1.0f;
        this.v = Z6.g;
        this.W = 0;
        this.X = new C4377q8();
        EU eu = EU.d;
        this.x = new C4870vm(eu, false, 0L, 0L);
        this.y = eu;
        this.R = -1;
        this.K = new InterfaceC3759j7[0];
        this.L = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.n = new C4958wm();
        this.o = new C4958wm();
    }

    public static AudioFormat e(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static boolean n(AudioTrack audioTrack) {
        return Ug0.f3833a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void a(long j) {
        EU eu;
        boolean z;
        boolean zT = t();
        C4568sM c4568sM = this.b;
        if (zT) {
            eu = g().f5152a;
            C3500g80 c3500g80 = (C3500g80) c4568sM.d;
            float f = eu.f3024a;
            if (c3500g80.c != f) {
                c3500g80.c = f;
                c3500g80.i = true;
            }
            float f2 = c3500g80.d;
            float f3 = eu.b;
            if (f2 != f3) {
                c3500g80.d = f3;
                c3500g80.i = true;
            }
        } else {
            eu = EU.d;
        }
        EU eu2 = eu;
        int i = 0;
        if (t()) {
            z = g().b;
            ((P60) c4568sM.c).m = z;
        } else {
            z = false;
        }
        this.j.add(new C4870vm(eu2, z, Math.max(0L, j), (i() * 1000000) / ((long) this.t.e)));
        InterfaceC3759j7[] interfaceC3759j7Arr = this.t.i;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3759j7 interfaceC3759j7 : interfaceC3759j7Arr) {
            if (interfaceC3759j7.isActive()) {
                arrayList.add(interfaceC3759j7);
            } else {
                interfaceC3759j7.flush();
            }
        }
        int size = arrayList.size();
        this.K = (InterfaceC3759j7[]) arrayList.toArray(new InterfaceC3759j7[size]);
        this.L = new ByteBuffer[size];
        int i2 = 0;
        while (true) {
            InterfaceC3759j7[] interfaceC3759j7Arr2 = this.K;
            if (i2 >= interfaceC3759j7Arr2.length) {
                break;
            }
            InterfaceC3759j7 interfaceC3759j8 = interfaceC3759j7Arr2[i2];
            interfaceC3759j8.flush();
            this.L[i2] = interfaceC3759j8.getOutput();
            i2++;
        }
        Wm0 wm0 = this.r;
        if (wm0 != null) {
            C3491g4 c3491g4 = ((C4481rN) wm0.b).D0;
            Handler handler = (Handler) c3491g4.b;
            if (handler != null) {
                handler.post(new RunnableC4287p7(i, c3491g4, z));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    public final void b(C4619sw c4619sw, int[] iArr) throws C4375q7 {
        InterfaceC3759j7[] interfaceC3759j7Arr;
        int iIntValue;
        int i;
        int i2;
        int iZ;
        int iZ2;
        int i3;
        int iJ;
        int iA;
        int[] iArr2;
        boolean zEquals = MimeTypes.AUDIO_RAW.equals(c4619sw.l);
        int i4 = c4619sw.z;
        int i5 = c4619sw.y;
        if (zEquals) {
            int i6 = c4619sw.A;
            FW.h(Ug0.I(i6));
            iZ2 = Ug0.z(i6, i5);
            InterfaceC3759j7[] interfaceC3759j7Arr2 = (this.c && (i6 == 536870912 || i6 == 805306368 || i6 == 4)) ? this.g : this.f;
            int i7 = c4619sw.B;
            C3450fe0 c3450fe0 = this.e;
            c3450fe0.i = i7;
            c3450fe0.j = c4619sw.C;
            if (Ug0.f3833a < 21 && i5 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i8 = 0; i8 < 6; i8++) {
                    iArr2[i8] = i8;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.i = iArr2;
            C3585h7 c3585h7 = new C3585h7(i4, i5, i6);
            for (InterfaceC3759j7 interfaceC3759j7 : interfaceC3759j7Arr2) {
                try {
                    C3585h7 c3585h7A = interfaceC3759j7.a(c3585h7);
                    if (interfaceC3759j7.isActive()) {
                        c3585h7 = c3585h7A;
                    }
                } catch (C3673i7 e) {
                    throw new C4375q7(e, c4619sw);
                }
            }
            int i9 = c3585h7.c;
            int i10 = c3585h7.b;
            iIntValue = Ug0.p(i10);
            iZ = Ug0.z(i9, i10);
            i4 = c3585h7.f4446a;
            interfaceC3759j7Arr = interfaceC3759j7Arr2;
            i = i9;
            i2 = 0;
        } else {
            interfaceC3759j7Arr = new InterfaceC3759j7[0];
            if (u(c4619sw, this.v)) {
                String str = c4619sw.l;
                str.getClass();
                int iD = AbstractC5011xP.d(str, c4619sw.i);
                iIntValue = Ug0.p(i5);
                i = iD;
                i2 = 1;
            } else {
                Pair pairA = this.f2890a.a(c4619sw);
                if (pairA == null) {
                    throw new C4375q7("Unable to configure passthrough for: " + c4619sw, c4619sw);
                }
                int iIntValue2 = ((Integer) pairA.first).intValue();
                iIntValue = ((Integer) pairA.second).intValue();
                i = iIntValue2;
                i2 = 2;
            }
            iZ = -1;
            iZ2 = -1;
        }
        if (i == 0) {
            throw new C4375q7("Invalid output encoding (mode=" + i2 + ") for: " + c4619sw, c4619sw);
        }
        if (iIntValue == 0) {
            throw new C4375q7("Invalid output channel config (mode=" + i2 + ") for: " + c4619sw, c4619sw);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i4, iIntValue, i);
        FW.s(minBufferSize != -2);
        int i11 = iZ != -1 ? iZ : 1;
        double d = this.k ? 8.0d : 1.0d;
        C2341Cm c2341Cm = this.p;
        c2341Cm.getClass();
        if (i2 != 0) {
            if (i2 == 1) {
                iJ = AbstractC2995aW.r((((long) c2341Cm.f) * ((long) C2341Cm.a(i))) / 1000000);
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException();
                }
                int i12 = c2341Cm.e;
                if (i == 5) {
                    i12 *= c2341Cm.g;
                }
                int i13 = c4619sw.h;
                if (i13 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    roundingMode.getClass();
                    iA = i13 / 8;
                    int i14 = i13 - (8 * iA);
                    if (i14 != 0) {
                        int i15 = ((i13 ^ 8) >> 31) | 1;
                        switch (AbstractC4911wD.f5174a[roundingMode.ordinal()]) {
                            case 1:
                                if (i14 != 0) {
                                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                if (i15 < 0) {
                                    iA += i15;
                                }
                                break;
                            case 4:
                                iA += i15;
                                break;
                            case 5:
                                if (i15 > 0) {
                                    iA += i15;
                                }
                                break;
                            case 6:
                            case 7:
                            case 8:
                                int iAbs = Math.abs(i14);
                                int iAbs2 = iAbs - (Math.abs(8) - iAbs);
                                if (iAbs2 == 0) {
                                    if (roundingMode == RoundingMode.HALF_UP) {
                                        iA += i15;
                                    } else if ((roundingMode == RoundingMode.HALF_EVEN) & ((iA & 1) != 0)) {
                                        iA += i15;
                                    }
                                } else if (iAbs2 > 0) {
                                    iA += i15;
                                }
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                } else {
                    iA = C2341Cm.a(i);
                }
                iJ = AbstractC2995aW.r((((long) i12) * ((long) iA)) / 1000000);
            }
            i3 = iZ;
        } else {
            int i16 = c2341Cm.d * minBufferSize;
            int i17 = iZ;
            long j = i4;
            long j2 = i11;
            int iR = AbstractC2995aW.r(((((long) c2341Cm.b) * j) * j2) / 1000000);
            int i18 = c2341Cm.c;
            i3 = i17;
            iJ = Ug0.j(i16, iR, AbstractC2995aW.r(((((long) i18) * j) * j2) / 1000000));
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) iJ) * d)) + i11) - 1) / i11) * i11;
        this.b0 = false;
        C4782um c4782um = new C4782um(c4619sw, iZ2, i2, i3, i4, iIntValue, i, iMax, interfaceC3759j7Arr);
        if (m()) {
            this.s = c4782um;
        } else {
            this.t = c4782um;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final boolean c() {
        /*
            r9 = this;
            int r0 = r9.R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.R = r2
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.R
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.j7[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.queueEndOfStream()
        L1f:
            r9.p(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.R
            int r0 = r0 + r1
            r9.R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.v(r0, r7)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2315Bm.c():boolean");
    }

    public final void d() {
        if (m()) {
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.E = 0L;
            this.c0 = false;
            this.F = 0;
            this.x = new C4870vm(g().f5152a, g().b, 0L, 0L);
            this.I = 0L;
            this.w = null;
            this.j.clear();
            this.M = null;
            this.N = 0;
            this.O = null;
            this.T = false;
            this.S = false;
            this.R = -1;
            this.z = null;
            this.A = 0;
            this.e.o = 0L;
            int i = 0;
            while (true) {
                InterfaceC3759j7[] interfaceC3759j7Arr = this.K;
                if (i >= interfaceC3759j7Arr.length) {
                    break;
                }
                InterfaceC3759j7 interfaceC3759j7 = interfaceC3759j7Arr[i];
                interfaceC3759j7.flush();
                this.L[i] = interfaceC3759j7.getOutput();
                i++;
            }
            AudioTrack audioTrack = this.i.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.u.pause();
            }
            if (n(this.u)) {
                C2289Am c2289Am = this.m;
                c2289Am.getClass();
                this.u.unregisterStreamEventCallback(c2289Am.b);
                c2289Am.f2834a.removeCallbacksAndMessages(null);
            }
            if (Ug0.f3833a < 21 && !this.V) {
                this.W = 0;
            }
            C4782um c4782um = this.s;
            if (c4782um != null) {
                this.t = c4782um;
                this.s = null;
            }
            C5078y7 c5078y7 = this.i;
            c5078y7.c();
            c5078y7.c = null;
            c5078y7.f = null;
            AudioTrack audioTrack2 = this.u;
            C4581sZ c4581sZ = this.h;
            c4581sZ.c();
            synchronized (d0) {
                try {
                    if (e0 == null) {
                        e0 = Executors.newSingleThreadExecutor(new Qg0("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    f0++;
                    e0.execute(new RunnableC3976le0(12, audioTrack2, c4581sZ));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.u = null;
        }
        this.o.f5196a = null;
        this.n.f5196a = null;
    }

    public final int f(C4619sw c4619sw) {
        if (!MimeTypes.AUDIO_RAW.equals(c4619sw.l)) {
            return ((this.b0 || !u(c4619sw, this.v)) && this.f2890a.a(c4619sw) == null) ? 0 : 2;
        }
        int i = c4619sw.A;
        if (Ug0.I(i)) {
            return (i == 2 || (this.c && i == 4)) ? 2 : 1;
        }
        AbstractC4038mJ.f();
        return 0;
    }

    public final C4870vm g() {
        C4870vm c4870vm = this.w;
        if (c4870vm != null) {
            return c4870vm;
        }
        ArrayDeque arrayDeque = this.j;
        return !arrayDeque.isEmpty() ? (C4870vm) arrayDeque.getLast() : this.x;
    }

    public final long h() {
        C4782um c4782um = this.t;
        return c4782um.c == 0 ? this.B / ((long) c4782um.b) : this.C;
    }

    public final long i() {
        C4782um c4782um = this.t;
        return c4782um.c == 0 ? this.D / ((long) c4782um.d) : this.E;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x02f1 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0100, code lost:
    
        if (r10.a() == 0) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.nio.ByteBuffer r26, long r27, int r29) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2315Bm.j(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean k() {
        return m() && this.i.b(i());
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0154  */
    /* JADX WARN: Code duplicated, block: B:92:? A[SYNTHETIC] */
    public final boolean l() throws C4462r7 {
        boolean z;
        AudioTrack audioTrackA;
        WU wu;
        C4581sZ c4581sZ = this.h;
        synchronized (c4581sZ) {
            z = c4581sZ.f4984a;
        }
        if (!z) {
            return false;
        }
        try {
            C4782um c4782um = this.t;
            c4782um.getClass();
            try {
                audioTrackA = c4782um.a(this.Z, this.v, this.W);
            } catch (C4462r7 e) {
                Wm0 wm0 = this.r;
                if (wm0 != null) {
                    wm0.C(e);
                }
                throw e;
            }
        } catch (C4462r7 e2) {
            C4782um c4782um2 = this.t;
            if (c4782um2.h > 1000000) {
                C4782um c4782um3 = new C4782um(c4782um2.f5100a, c4782um2.b, c4782um2.c, c4782um2.d, c4782um2.e, c4782um2.f, c4782um2.g, 1000000, c4782um2.i);
                try {
                    try {
                        audioTrackA = c4782um3.a(this.Z, this.v, this.W);
                        this.t = c4782um3;
                    } catch (C4462r7 e3) {
                        Wm0 wm1 = this.r;
                        if (wm1 != null) {
                            wm1.C(e3);
                        }
                        throw e3;
                    }
                } catch (C4462r7 e4) {
                    e2.addSuppressed(e4);
                    if (this.t.c == 1) {
                        throw e2;
                    }
                    this.b0 = true;
                    throw e2;
                }
            }
            if (this.t.c == 1) {
                throw e2;
            }
            this.b0 = true;
            throw e2;
        }
        this.u = audioTrackA;
        if (n(audioTrackA)) {
            AudioTrack audioTrack = this.u;
            if (this.m == null) {
                this.m = new C2289Am(this);
            }
            C2289Am c2289Am = this.m;
            Handler handler = c2289Am.f2834a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ExecutorC5134ym(0, handler), c2289Am.b);
            if (this.l != 3) {
                AudioTrack audioTrack2 = this.u;
                C4619sw c4619sw = this.t.f5100a;
                audioTrack2.setOffloadDelayPadding(c4619sw.B, c4619sw.C);
            }
        }
        int i = Ug0.f3833a;
        if (i >= 31 && (wu = this.q) != null) {
            AbstractC4431qm.a(this.u, wu);
        }
        this.W = this.u.getAudioSessionId();
        AudioTrack audioTrack3 = this.u;
        C4782um c4782um4 = this.t;
        boolean z2 = c4782um4.c == 2;
        int i2 = c4782um4.g;
        int i3 = c4782um4.d;
        int i4 = c4782um4.h;
        C5078y7 c5078y7 = this.i;
        c5078y7.c = audioTrack3;
        c5078y7.d = i3;
        c5078y7.e = i4;
        c5078y7.f = new C4990x7(audioTrack3);
        c5078y7.g = audioTrack3.getSampleRate();
        c5078y7.h = z2 && i < 23 && (i2 == 5 || i2 == 6);
        boolean zI = Ug0.I(i2);
        c5078y7.q = zI;
        c5078y7.i = zI ? (((long) (i4 / i3)) * 1000000) / ((long) c5078y7.g) : -9223372036854775807L;
        c5078y7.t = 0L;
        c5078y7.u = 0L;
        c5078y7.v = 0L;
        c5078y7.p = false;
        c5078y7.y = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        c5078y7.z = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        c5078y7.r = 0L;
        c5078y7.o = 0L;
        c5078y7.j = 1.0f;
        if (m()) {
            if (i >= 21) {
                this.u.setVolume(this.J);
            } else {
                AudioTrack audioTrack4 = this.u;
                float f = this.J;
                audioTrack4.setStereoVolume(f, f);
            }
        }
        this.X.getClass();
        C4518rm c4518rm = this.Y;
        if (c4518rm != null && i >= 23) {
            AbstractC4343pm.a(this.u, c4518rm);
        }
        this.H = true;
        return true;
    }

    public final boolean m() {
        return this.u != null;
    }

    public final void o() {
        if (this.T) {
            return;
        }
        this.T = true;
        long jI = i();
        C5078y7 c5078y7 = this.i;
        c5078y7.A = c5078y7.a();
        c5078y7.y = SystemClock.elapsedRealtime() * 1000;
        c5078y7.B = jI;
        this.u.stop();
        this.A = 0;
    }

    public final void p(long j) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.L[i - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC3759j7.f4537a;
                }
            }
            if (i == length) {
                v(byteBuffer, j);
            } else {
                InterfaceC3759j7 interfaceC3759j7 = this.K[i];
                if (i > this.R) {
                    interfaceC3759j7.queueInput(byteBuffer);
                }
                ByteBuffer output = interfaceC3759j7.getOutput();
                this.L[i] = output;
                if (output.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void q() {
        d();
        for (InterfaceC3759j7 interfaceC3759j7 : this.f) {
            interfaceC3759j7.reset();
        }
        for (InterfaceC3759j7 interfaceC3759j8 : this.g) {
            interfaceC3759j8.reset();
        }
        this.U = false;
        this.b0 = false;
    }

    public final void r(EU eu, boolean z) {
        C4870vm c4870vmG = g();
        if (eu.equals(c4870vmG.f5152a) && z == c4870vmG.b) {
            return;
        }
        C4870vm c4870vm = new C4870vm(eu, z, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        if (m()) {
            this.w = c4870vm;
        } else {
            this.x = c4870vm;
        }
    }

    public final void s(EU eu) {
        if (m()) {
            try {
                this.u.setPlaybackParams(AbstractC4255om.l().allowDefaults().setSpeed(eu.f3024a).setPitch(eu.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                AbstractC4038mJ.g("Failed to set playback params", e);
            }
            eu = new EU(this.u.getPlaybackParams().getSpeed(), this.u.getPlaybackParams().getPitch());
            float f = eu.f3024a;
            C5078y7 c5078y7 = this.i;
            c5078y7.j = f;
            C4990x7 c4990x7 = c5078y7.f;
            if (c4990x7 != null) {
                c4990x7.a();
            }
            c5078y7.c();
        }
        this.y = eu;
    }

    public final boolean t() {
        if (!this.Z && MimeTypes.AUDIO_RAW.equals(this.t.f5100a.l)) {
            int i = this.t.f5100a.A;
            if (this.c) {
                int i2 = Ug0.f3833a;
                if (i == 536870912 || i == 805306368 || i == 4) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean u(C4619sw c4619sw, Z6 z6) {
        int i;
        int iP;
        int playbackOffloadSupport;
        int i2 = Ug0.f3833a;
        if (i2 < 29 || (i = this.l) == 0) {
            return false;
        }
        String str = c4619sw.l;
        str.getClass();
        int iD = AbstractC5011xP.d(str, c4619sw.i);
        if (iD == 0 || (iP = Ug0.p(c4619sw.y)) == 0) {
            return false;
        }
        AudioFormat audioFormatE = e(c4619sw.z, iP, iD);
        AudioAttributes audioAttributes = (AudioAttributes) z6.a().b;
        if (i2 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatE, audioAttributes);
        } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatE, audioAttributes)) {
            playbackOffloadSupport = (i2 == 30 && Ug0.d.startsWith("Pixel")) ? 2 : 1;
        } else {
            playbackOffloadSupport = 0;
        }
        if (playbackOffloadSupport == 0) {
            return false;
        }
        if (playbackOffloadSupport == 1) {
            return ((c4619sw.B != 0 || c4619sw.C != 0) && (i == 1)) ? false : true;
        }
        if (playbackOffloadSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    public final void v(ByteBuffer byteBuffer, long j) throws Exception {
        int iWrite;
        Wm0 wm0;
        C2788Ts c2788Ts;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.O;
            if (byteBuffer2 != null) {
                FW.h(byteBuffer2 == byteBuffer);
            } else {
                this.O = byteBuffer;
                if (Ug0.f3833a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.P;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.P = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.P, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.Q = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i = Ug0.f3833a;
            if (i < 21) {
                long j2 = this.D;
                C5078y7 c5078y7 = this.i;
                int iA = c5078y7.e - ((int) (j2 - (c5078y7.a() * ((long) c5078y7.d))));
                if (iA > 0) {
                    iWrite = this.u.write(this.P, this.Q, Math.min(iRemaining2, iA));
                    if (iWrite > 0) {
                        this.Q += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else if (this.Z) {
                FW.s(j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                AudioTrack audioTrack = this.u;
                if (i >= 26) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j * 1000);
                } else {
                    if (this.z == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.z = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.z.putInt(1431633921);
                    }
                    if (this.A == 0) {
                        this.z.putInt(4, iRemaining2);
                        this.z.putLong(8, j * 1000);
                        this.z.position(0);
                        this.A = iRemaining2;
                    }
                    int iRemaining3 = this.z.remaining();
                    if (iRemaining3 <= 0) {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.A = 0;
                        } else {
                            this.A -= iWrite;
                        }
                    } else {
                        int iWrite2 = audioTrack.write(this.z, iRemaining3, 1);
                        if (iWrite2 < 0) {
                            this.A = 0;
                            iWrite = iWrite2;
                        } else if (iWrite2 < iRemaining3) {
                            iWrite = 0;
                        } else {
                            iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                            if (iWrite < 0) {
                                this.A = 0;
                            } else {
                                this.A -= iWrite;
                            }
                        }
                    }
                }
            } else {
                iWrite = this.u.write(byteBuffer, iRemaining2, 1);
            }
            this.a0 = SystemClock.elapsedRealtime();
            C4958wm c4958wm = this.o;
            if (iWrite < 0) {
                C4638t7 c4638t7 = new C4638t7(iWrite, this.t.f5100a, ((i >= 24 && iWrite == -6) || iWrite == -32) && this.E > 0);
                Wm0 wm1 = this.r;
                if (wm1 != null) {
                    wm1.C(c4638t7);
                }
                if (c4638t7.b) {
                    throw c4638t7;
                }
                c4958wm.a(c4638t7);
                return;
            }
            c4958wm.f5196a = null;
            if (n(this.u)) {
                if (this.E > 0) {
                    this.c0 = false;
                }
                if (this.U && (wm0 = this.r) != null && iWrite < iRemaining2 && !this.c0 && (c2788Ts = ((C4481rN) wm0.b).M0) != null) {
                    c2788Ts.f3798a.G = true;
                }
            }
            int i2 = this.t.c;
            if (i2 == 0) {
                this.D += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i2 != 0) {
                    FW.s(byteBuffer == this.M);
                    this.E = (((long) this.F) * ((long) this.N)) + this.E;
                }
                this.O = null;
            }
        }
    }
}
