package com.smartdigimkt.q4;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.inmobi.commons.core.configs.CrashConfig;
import com.p004ironsource.d9;
import com.smartdigimkt.a4.k;
import com.smartdigimkt.p4.d0;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.p4.o;
import com.smartdigimkt.w3.m;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class e extends com.smartdigimkt.d4.b {
    private static final String Y1 = "MediaCodecVideoRenderer";
    private static final String Z1 = "crop-left";
    private static final String a2 = "crop-right";
    private static final String b2 = "crop-bottom";
    private static final String c2 = "crop-top";
    private static final int[] d2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static final int e2 = 10;
    private static boolean f2;
    private static boolean g2;
    private boolean A1;
    private long B1;
    private long C1;
    private long D1;
    private int E1;
    private int F1;
    private int G1;
    private long H1;
    private int I1;
    private float J1;
    private int K1;
    private int L1;
    private int M1;
    private float N1;
    private int O1;
    private int P1;
    private int Q1;
    private float R1;
    private boolean S1;
    private int T1;
    c U1;
    private long V1;
    private long W1;
    private int X1;
    private final Context n1;
    private final f o1;
    private final h.a p1;
    private final long q1;
    private final int r1;
    private final boolean s1;
    private final long[] t1;
    private final long[] u1;
    private b v1;
    private boolean w1;
    private Surface x1;
    private Surface y1;
    private int z1;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f37900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f37901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f37902c;

        public b(int i2, int i3, int i4) {
            this.f37900a = i2;
            this.f37901b = i3;
            this.f37902c = i4;
        }
    }

    public final class c implements MediaCodec.OnFrameRenderedListener {
        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            e eVar = e.this;
            if (this != eVar.U1) {
                return;
            }
            eVar.Q();
        }

        private c(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }
    }

    public e(Context context, com.smartdigimkt.d4.c cVar) {
        this(context, cVar, 0L);
    }

    private void M() {
        MediaCodec mediaCodecY;
        this.A1 = false;
        if (f0.f37540a < 23 || !this.S1 || (mediaCodecY = y()) == null) {
            return;
        }
        this.U1 = new c(mediaCodecY);
    }

    private void N() {
        this.O1 = -1;
        this.P1 = -1;
        this.R1 = -1.0f;
        this.Q1 = -1;
    }

    private static boolean O() {
        return f0.f37540a <= 22 && "foster".equals(f0.f37541b) && "NVIDIA".equals(f0.f37542c);
    }

    private void P() {
        if (this.E1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.p1.a(this.E1, jElapsedRealtime - this.D1);
            this.E1 = 0;
            this.D1 = jElapsedRealtime;
        }
    }

    private void R() {
        int i2 = this.K1;
        if (i2 == -1 && this.L1 == -1) {
            return;
        }
        if (this.O1 == i2 && this.P1 == this.L1 && this.Q1 == this.M1 && this.R1 == this.N1) {
            return;
        }
        this.p1.a(i2, this.L1, this.M1, this.N1);
        this.O1 = this.K1;
        this.P1 = this.L1;
        this.Q1 = this.M1;
        this.R1 = this.N1;
    }

    private void S() {
        if (this.A1) {
            this.p1.a(this.x1);
        }
    }

    private void T() {
        int i2 = this.O1;
        if (i2 == -1 && this.P1 == -1) {
            return;
        }
        this.p1.a(i2, this.P1, this.Q1, this.R1);
    }

    private void U() {
        this.C1 = this.q1 > 0 ? SystemClock.elapsedRealtime() + this.q1 : -9223372036854775807L;
    }

    private static boolean e(long j) {
        return j < -30000;
    }

    private static boolean f(long j) {
        return j < -500000;
    }

    @Override // com.smartdigimkt.d4.b
    public void H() {
        Surface surface;
        try {
            super.H();
            this.G1 = 0;
            surface = this.y1;
            if (surface != null) {
                if (this.x1 == surface) {
                    this.x1 = null;
                }
            }
        } finally {
            this.G1 = 0;
            if (this.y1 != null) {
                Surface surface2 = this.x1;
                surface = this.y1;
                if (surface2 == surface) {
                    this.x1 = null;
                }
                surface.release();
                this.y1 = null;
            }
        }
    }

    public void Q() {
        if (this.A1) {
            return;
        }
        this.A1 = true;
        this.p1.a(this.x1);
    }

    @Override // com.smartdigimkt.d4.b
    public int a(com.smartdigimkt.d4.c cVar, com.smartdigimkt.a4.g<k> gVar, m mVar) throws com.smartdigimkt.d4.d.c {
        boolean z2;
        int i2;
        int i3;
        String str = mVar.f;
        if (!o.m(str)) {
            return 0;
        }
        com.smartdigimkt.a4.e eVar = mVar.f39336i;
        if (eVar != null) {
            z2 = false;
            for (int i4 = 0; i4 < eVar.d; i4++) {
                z2 |= eVar.a(i4).f;
            }
        } else {
            z2 = false;
        }
        com.smartdigimkt.d4.a aVarA = cVar.a(str, z2);
        if (aVarA == null) {
            return (!z2 || cVar.a(str, false) == null) ? 1 : 2;
        }
        if (!com.smartdigimkt.w3.a.a(gVar, eVar)) {
            return 2;
        }
        boolean zA = aVarA.a(mVar.f39333c);
        if (zA && (i2 = mVar.k) > 0 && (i3 = mVar.f39337l) > 0) {
            if (f0.f37540a >= 21) {
                zA = aVarA.a(i2, i3, mVar.m);
            } else {
                boolean z3 = i2 * i3 <= com.smartdigimkt.d4.d.b();
                if (!z3) {
                    Log.d(Y1, "FalseCheck [legacyFrameSize, " + mVar.k + "x" + mVar.f39337l + "] [" + f0.f37543e + d9.i.f24752e);
                }
                zA = z3;
            }
        }
        return (zA ? 4 : 3) | (aVarA.d ? 16 : 8) | (aVarA.f34435e ? 32 : 0);
    }

    @Override // com.smartdigimkt.d4.b
    public boolean b(com.smartdigimkt.d4.a aVar) {
        return this.x1 != null || c(aVar);
    }

    @Override // com.smartdigimkt.d4.b
    public void c(long j) {
        this.G1--;
        while (true) {
            int i2 = this.X1;
            if (i2 == 0 || j < this.u1[0]) {
                return;
            }
            long[] jArr = this.t1;
            this.W1 = jArr[0];
            int i3 = i2 - 1;
            this.X1 = i3;
            System.arraycopy(jArr, 1, jArr, 0, i3);
            long[] jArr2 = this.u1;
            System.arraycopy(jArr2, 1, jArr2, 0, this.X1);
        }
    }

    public boolean d(long j, long j2) {
        return e(j);
    }

    @Override // com.smartdigimkt.d4.b, com.smartdigimkt.w3.y
    public boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.A1 || (((surface = this.y1) != null && this.x1 == surface) || y() == null || this.S1))) {
            this.C1 = -9223372036854775807L;
            return true;
        }
        if (this.C1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.C1) {
            return true;
        }
        this.C1 = -9223372036854775807L;
        return false;
    }

    @Override // com.smartdigimkt.d4.b, com.smartdigimkt.w3.a
    public void s() {
        this.K1 = -1;
        this.L1 = -1;
        this.N1 = -1.0f;
        this.J1 = -1.0f;
        this.W1 = -9223372036854775807L;
        this.V1 = -9223372036854775807L;
        this.X1 = 0;
        N();
        M();
        this.o1.a();
        this.U1 = null;
        this.S1 = false;
        try {
            super.s();
        } finally {
            this.W0.a();
            this.p1.a(this.W0);
        }
    }

    @Override // com.smartdigimkt.d4.b, com.smartdigimkt.w3.a
    public void t() {
        super.t();
        this.E1 = 0;
        this.D1 = SystemClock.elapsedRealtime();
        this.H1 = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.smartdigimkt.d4.b, com.smartdigimkt.w3.a
    public void u() {
        this.C1 = -9223372036854775807L;
        P();
        super.u();
    }

    @Override // com.smartdigimkt.d4.b
    public void x() throws com.smartdigimkt.w3.g {
        super.x();
        this.G1 = 0;
    }

    public e(Context context, com.smartdigimkt.d4.c cVar, long j) {
        this(context, cVar, j, null, null, -1);
    }

    @Override // com.smartdigimkt.d4.b
    public void b(m mVar) throws com.smartdigimkt.w3.g {
        super.b(mVar);
        this.p1.a(mVar);
        this.J1 = mVar.o;
        this.I1 = mVar.f39338n;
    }

    public void d(int i2) {
        com.smartdigimkt.z3.d dVar = this.W0;
        dVar.g += i2;
        this.E1 += i2;
        int i3 = this.F1 + i2;
        this.F1 = i3;
        dVar.f40349h = Math.max(i3, dVar.f40349h);
        if (this.E1 >= this.r1) {
            P();
        }
    }

    public boolean e(long j, long j2) {
        return e(j) && j2 > 100000;
    }

    public e(Context context, com.smartdigimkt.d4.c cVar, long j, Handler handler, h hVar, int i2) {
        this(context, cVar, j, null, false, handler, hVar, i2);
    }

    /* JADX WARN: Code duplicated, block: B:370:0x059d  */
    /* JADX WARN: Code duplicated, block: B:385:0x05c8  */
    public boolean e(String str) {
        byte b3 = 0;
        if (f0.f37540a >= 27 || str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (e.class) {
            try {
                if (!f2) {
                    switch (f0.f37541b) {
                        case "1601":
                        case "1713":
                        case "1714":
                        case "A10-70F":
                        case "A1601":
                        case "A2016a40":
                        case "A7000-a":
                        case "A7000plus":
                        case "A7010a48":
                        case "A7020a48":
                        case "AquaPowerM":
                        case "Aura_Note_2":
                        case "BLACK-1X":
                        case "BRAVIA_ATV2":
                        case "C1":
                        case "ComioS1":
                        case "CP8676_I02":
                        case "CPH1609":
                        case "CPY83_I00":
                        case "cv1":
                        case "cv3":
                        case "deb":
                        case "E5643":
                        case "ELUGA_A3_Pro":
                        case "ELUGA_Note":
                        case "ELUGA_Prim":
                        case "ELUGA_Ray_X":
                        case "EverStar_S":
                        case "F3111":
                        case "F3113":
                        case "F3116":
                        case "F3211":
                        case "F3213":
                        case "F3215":
                        case "F3311":
                        case "flo":
                        case "GiONEE_CBL7513":
                        case "GiONEE_GBL7319":
                        case "GIONEE_GBL7360":
                        case "GIONEE_SWW1609":
                        case "GIONEE_SWW1627":
                        case "GIONEE_SWW1631":
                        case "GIONEE_WBL5708":
                        case "GIONEE_WBL7365":
                        case "GIONEE_WBL7519":
                        case "griffin":
                        case "htc_e56ml_dtul":
                        case "hwALE-H":
                        case "HWBLN-H":
                        case "HWCAM-H":
                        case "HWVNS-H":
                        case "iball8735_9806":
                        case "Infinix-X572":
                        case "iris60":
                        case "itel_S41":
                        case "j2xlteins":
                        case "JGZ":
                        case "K50a40":
                        case "le_x6":
                        case "LS-5017":
                        case "M5c":
                        case "manning":
                        case "marino_f":
                        case "MEIZU_M5":
                        case "mh":
                        case "mido":
                        case "MX6":
                        case "namath":
                        case "nicklaus_f":
                        case "NX541J":
                        case "NX573J":
                        case "OnePlus5T":
                        case "p212":
                        case "P681":
                        case "P85":
                        case "panell_d":
                        case "panell_dl":
                        case "panell_ds":
                        case "panell_dt":
                        case "PB2-670M":
                        case "PGN528":
                        case "PGN610":
                        case "PGN611":
                        case "Phantom6":
                        case "Pixi4-7_3G":
                        case "Pixi5-10_4G":
                        case "PLE":
                        case "PRO7S":
                        case "Q350":
                        case "Q4260":
                        case "Q427":
                        case "Q4310":
                        case "Q5":
                        case "QM16XE_U":
                        case "QX1":
                        case "santoni":
                        case "Slate_Pro":
                        case "SVP-DTV15":
                        case "s905x018":
                        case "taido_row":
                        case "TB3-730F":
                        case "TB3-730X":
                        case "TB3-850F":
                        case "TB3-850M":
                        case "tcl_eu":
                        case "V1":
                        case "V23GB":
                        case "V5":
                        case "vernee_M5":
                        case "watson":
                        case "whyred":
                        case "woods_f":
                        case "woods_fn":
                        case "X3_HK":
                        case "XE2X":
                        case "XT1663":
                        case "Z12_PRO":
                        case "Z80":
                            g2 = true;
                            break;
                    }
                    String str2 = f0.d;
                    int iHashCode = str2.hashCode();
                    if (iHashCode != 2006354) {
                        if (iHashCode == 2006367 && str2.equals("AFTN")) {
                            b3 = 1;
                        } else {
                            b3 = -1;
                        }
                    } else if (!str2.equals("AFTA")) {
                        b3 = -1;
                    }
                    if (b3 == 0 || b3 == 1) {
                        g2 = true;
                    }
                    f2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g2;
    }

    public e(Context context, com.smartdigimkt.d4.c cVar, long j, com.smartdigimkt.a4.g<k> gVar, boolean z2, Handler handler, h hVar, int i2) {
        super(2, cVar, gVar, z2);
        this.q1 = j;
        this.r1 = i2;
        Context applicationContext = context.getApplicationContext();
        this.n1 = applicationContext;
        this.o1 = new f(applicationContext);
        this.p1 = new h.a(handler, hVar);
        this.s1 = O();
        this.t1 = new long[10];
        this.u1 = new long[10];
        this.W1 = -9223372036854775807L;
        this.V1 = -9223372036854775807L;
        this.C1 = -9223372036854775807L;
        this.K1 = -1;
        this.L1 = -1;
        this.N1 = -1.0f;
        this.J1 = -1.0f;
        this.z1 = 1;
        N();
    }

    public void b(MediaCodec mediaCodec, int i2, long j) {
        R();
        d0.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i2, true);
        d0.a();
        this.H1 = SystemClock.elapsedRealtime() * 1000;
        this.W0.f40348e++;
        this.F1 = 0;
        Q();
    }

    public boolean c(long j, long j2) {
        return f(j);
    }

    public void c(MediaCodec mediaCodec, int i2, long j) {
        d0.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i2, false);
        d0.a();
        this.W0.f++;
    }

    private boolean c(com.smartdigimkt.d4.a aVar) {
        if (f0.f37540a < 23 || this.S1 || e(aVar.f34432a)) {
            return false;
        }
        return !aVar.f || com.smartdigimkt.q4.c.b(this.n1);
    }

    public void b(MediaCodec mediaCodec, int i2, long j, long j2) {
        R();
        d0.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i2, j2);
        d0.a();
        this.H1 = SystemClock.elapsedRealtime() * 1000;
        this.W0.f40348e++;
        this.F1 = 0;
        Q();
    }

    @Override // com.smartdigimkt.d4.b, com.smartdigimkt.w3.a
    public void a(boolean z2) throws com.smartdigimkt.w3.g {
        super.a(z2);
        int i2 = o().f39201a;
        this.T1 = i2;
        this.S1 = i2 != 0;
        this.p1.b(this.W0);
        this.o1.b();
    }

    private static int b(com.smartdigimkt.d4.a aVar, m mVar) {
        if (mVar.g != -1) {
            int size = mVar.f39335h.size();
            int length = 0;
            for (int i2 = 0; i2 < size; i2++) {
                length += mVar.f39335h.get(i2).length;
            }
            return mVar.g + length;
        }
        return a(aVar, mVar.f, mVar.k, mVar.f39337l);
    }

    @Override // com.smartdigimkt.w3.a
    public void a(m[] mVarArr, long j) throws com.smartdigimkt.w3.g {
        if (this.W1 == -9223372036854775807L) {
            this.W1 = j;
        } else {
            int i2 = this.X1;
            if (i2 == this.t1.length) {
                Log.w(Y1, "Too many stream changes, so dropping offset: " + this.t1[this.X1 - 1]);
            } else {
                this.X1 = i2 + 1;
            }
            long[] jArr = this.t1;
            int i3 = this.X1 - 1;
            jArr[i3] = j;
            this.u1[i3] = this.V1;
        }
        super.a(mVarArr, j);
    }

    @Override // com.smartdigimkt.d4.b, com.smartdigimkt.w3.a
    public void a(long j, boolean z2) throws com.smartdigimkt.w3.g {
        super.a(j, z2);
        M();
        this.B1 = -9223372036854775807L;
        this.F1 = 0;
        this.V1 = -9223372036854775807L;
        int i2 = this.X1;
        if (i2 != 0) {
            this.W1 = this.t1[i2 - 1];
            this.X1 = 0;
        }
        if (z2) {
            U();
        } else {
            this.C1 = -9223372036854775807L;
        }
    }

    @Override // com.smartdigimkt.w3.a, com.smartdigimkt.w3.x.b
    public void a(int i2, Object obj) throws com.smartdigimkt.w3.g {
        if (i2 == 1) {
            a((Surface) obj);
            return;
        }
        if (i2 == 4) {
            this.z1 = ((Integer) obj).intValue();
            MediaCodec mediaCodecY = y();
            if (mediaCodecY != null) {
                mediaCodecY.setVideoScalingMode(this.z1);
                return;
            }
            return;
        }
        super.a(i2, obj);
    }

    private void a(Surface surface) throws com.smartdigimkt.w3.g {
        if (surface == null) {
            Surface surface2 = this.y1;
            if (surface2 != null) {
                surface = surface2;
            } else {
                com.smartdigimkt.d4.a aVarA = A();
                if (aVarA != null && c(aVarA)) {
                    surface = com.smartdigimkt.q4.c.a(this.n1, aVarA.f);
                    this.y1 = surface;
                }
            }
        }
        if (this.x1 != surface) {
            this.x1 = surface;
            int iD = d();
            if (iD == 1 || iD == 2) {
                MediaCodec mediaCodecY = y();
                if (f0.f37540a >= 23 && mediaCodecY != null && surface != null && !this.w1) {
                    a(mediaCodecY, surface);
                } else {
                    H();
                    D();
                }
            }
            if (surface != null && surface != this.y1) {
                T();
                M();
                if (iD == 2) {
                    U();
                    return;
                }
                return;
            }
            N();
            M();
            return;
        }
        if (surface == null || surface == this.y1) {
            return;
        }
        T();
        S();
    }

    @Override // com.smartdigimkt.d4.b
    public void a(com.smartdigimkt.d4.a aVar, MediaCodec mediaCodec, m mVar, MediaCrypto mediaCrypto) throws com.smartdigimkt.d4.d.c {
        b bVarA = a(aVar, mVar, q());
        this.v1 = bVarA;
        MediaFormat mediaFormatA = a(mVar, bVarA, this.s1, this.T1);
        if (this.x1 == null) {
            com.smartdigimkt.p4.a.b(c(aVar));
            if (this.y1 == null) {
                this.y1 = com.smartdigimkt.q4.c.a(this.n1, aVar.f);
            }
            this.x1 = this.y1;
        }
        mediaCodec.configure(mediaFormatA, this.x1, mediaCrypto, 0);
        if (f0.f37540a < 23 || !this.S1) {
            return;
        }
        this.U1 = new c(mediaCodec);
    }

    @Override // com.smartdigimkt.d4.b
    public int a(MediaCodec mediaCodec, com.smartdigimkt.d4.a aVar, m mVar, m mVar2) {
        if (!a(aVar.d, mVar, mVar2)) {
            return 0;
        }
        int i2 = mVar2.k;
        b bVar = this.v1;
        if (i2 > bVar.f37900a || mVar2.f39337l > bVar.f37901b || b(aVar, mVar2) > this.v1.f37902c) {
            return 0;
        }
        return mVar.b(mVar2) ? 1 : 3;
    }

    @Override // com.smartdigimkt.d4.b
    public void a(String str, long j, long j2) {
        this.p1.a(str, j, j2);
        this.w1 = e(str);
    }

    @Override // com.smartdigimkt.d4.b
    public void a(com.smartdigimkt.z3.e eVar) {
        this.G1++;
        this.V1 = Math.max(eVar.d, this.V1);
        if (f0.f37540a >= 23 || !this.S1) {
            return;
        }
        Q();
    }

    @Override // com.smartdigimkt.d4.b
    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z2 = mediaFormat.containsKey(a2) && mediaFormat.containsKey(Z1) && mediaFormat.containsKey(b2) && mediaFormat.containsKey(c2);
        if (z2) {
            integer = (mediaFormat.getInteger(a2) - mediaFormat.getInteger(Z1)) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.K1 = integer;
        if (z2) {
            integer2 = (mediaFormat.getInteger(b2) - mediaFormat.getInteger(c2)) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.L1 = integer2;
        float f = this.J1;
        this.N1 = f;
        if (f0.f37540a >= 21) {
            int i2 = this.I1;
            if (i2 == 90 || i2 == 270) {
                int i3 = this.K1;
                this.K1 = integer2;
                this.L1 = i3;
                this.N1 = 1.0f / f;
            }
        } else {
            this.M1 = this.I1;
        }
        mediaCodec.setVideoScalingMode(this.z1);
    }

    @Override // com.smartdigimkt.d4.b
    public boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j3, boolean z2) throws com.smartdigimkt.w3.g {
        MediaCodec mediaCodec2;
        long j4;
        if (this.B1 == -9223372036854775807L) {
            this.B1 = j;
        }
        long j5 = j3 - this.W1;
        if (z2) {
            c(mediaCodec, i2, j5);
            return true;
        }
        long j6 = j3 - j;
        if (this.x1 == this.y1) {
            if (!e(j6)) {
                return false;
            }
            c(mediaCodec, i2, j5);
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        boolean z3 = d() == 2;
        if (!this.A1 || (z3 && e(j6, jElapsedRealtime - this.H1))) {
            if (f0.f37540a >= 21) {
                b(mediaCodec, i2, j5, System.nanoTime());
            } else {
                b(mediaCodec, i2, j5);
            }
            return true;
        }
        if (z3 && j != this.B1) {
            long jNanoTime = System.nanoTime();
            long jA = this.o1.a(j3, ((j6 - (jElapsedRealtime - j2)) * 1000) + jNanoTime);
            long j7 = (jA - jNanoTime) / 1000;
            if (c(j7, j2)) {
                mediaCodec2 = mediaCodec;
                j4 = j5;
                if (a(mediaCodec2, i2, j4, j)) {
                    return false;
                }
            } else {
                mediaCodec2 = mediaCodec;
                j4 = j5;
            }
            if (d(j7, j2)) {
                a(mediaCodec2, i2, j4);
                return true;
            }
            if (f0.f37540a >= 21) {
                if (j7 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                    b(mediaCodec2, i2, j4, jA);
                    return true;
                }
            } else if (j7 < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                b(mediaCodec2, i2, j4);
                return true;
            }
        }
        return false;
    }

    public void a(MediaCodec mediaCodec, int i2, long j) {
        d0.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i2, false);
        d0.a();
        d(1);
    }

    public boolean a(MediaCodec mediaCodec, int i2, long j, long j2) throws com.smartdigimkt.w3.g {
        int iB = b(j2);
        if (iB == 0) {
            return false;
        }
        this.W0.f40350i++;
        d(this.G1 + iB);
        x();
        return true;
    }

    private static void a(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    private static void a(MediaFormat mediaFormat, int i2) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i2);
    }

    public MediaFormat a(m mVar, b bVar, boolean z2, int i2) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mVar.f);
        mediaFormat.setInteger("width", mVar.k);
        mediaFormat.setInteger("height", mVar.f39337l);
        com.smartdigimkt.d4.e.a(mediaFormat, mVar.f39335h);
        com.smartdigimkt.d4.e.a(mediaFormat, "frame-rate", mVar.m);
        com.smartdigimkt.d4.e.a(mediaFormat, "rotation-degrees", mVar.f39338n);
        com.smartdigimkt.d4.e.a(mediaFormat, mVar.r);
        mediaFormat.setInteger("max-width", bVar.f37900a);
        mediaFormat.setInteger("max-height", bVar.f37901b);
        com.smartdigimkt.d4.e.a(mediaFormat, "max-input-size", bVar.f37902c);
        if (f0.f37540a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        }
        if (z2) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i2 != 0) {
            a(mediaFormat, i2);
        }
        return mediaFormat;
    }

    public b a(com.smartdigimkt.d4.a aVar, m mVar, m[] mVarArr) throws com.smartdigimkt.d4.d.c {
        int iMax = mVar.k;
        int iMax2 = mVar.f39337l;
        int iB = b(aVar, mVar);
        if (mVarArr.length == 1) {
            return new b(iMax, iMax2, iB);
        }
        boolean z2 = false;
        for (m mVar2 : mVarArr) {
            if (a(aVar.d, mVar, mVar2)) {
                int i2 = mVar2.k;
                z2 |= i2 == -1 || mVar2.f39337l == -1;
                iMax = Math.max(iMax, i2);
                iMax2 = Math.max(iMax2, mVar2.f39337l);
                iB = Math.max(iB, b(aVar, mVar2));
            }
        }
        if (z2) {
            Log.w(Y1, "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointA = a(aVar, mVar);
            if (pointA != null) {
                iMax = Math.max(iMax, pointA.x);
                iMax2 = Math.max(iMax2, pointA.y);
                iB = Math.max(iB, a(aVar, mVar.f, iMax, iMax2));
                Log.w(Y1, "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new b(iMax, iMax2, iB);
    }

    private static Point a(com.smartdigimkt.d4.a aVar, m mVar) throws com.smartdigimkt.d4.d.c {
        int i2 = mVar.f39337l;
        int i3 = mVar.k;
        boolean z2 = i2 > i3;
        int i4 = z2 ? i2 : i3;
        if (z2) {
            i2 = i3;
        }
        float f = i2 / i4;
        for (int i5 : d2) {
            int i6 = (int) (i5 * f);
            if (i5 <= i4 || i6 <= i2) {
                break;
            }
            if (f0.f37540a >= 21) {
                int i7 = z2 ? i6 : i5;
                if (!z2) {
                    i5 = i6;
                }
                Point pointA = aVar.a(i7, i5);
                if (aVar.a(pointA.x, pointA.y, mVar.m)) {
                    return pointA;
                }
            } else {
                int iA = f0.a(i5, 16) * 16;
                int iA2 = f0.a(i6, 16) * 16;
                if (iA * iA2 <= com.smartdigimkt.d4.d.b()) {
                    int i8 = z2 ? iA2 : iA;
                    if (!z2) {
                        iA = iA2;
                    }
                    return new Point(i8, iA);
                }
            }
        }
        return null;
    }

    private static int a(com.smartdigimkt.d4.a aVar, String str, int i2, int i3) {
        int iA;
        int i4 = 4;
        if (i2 == -1 || i3 == -1) {
            return -1;
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                iA = i2 * i3;
                i4 = 2;
                return (iA * 3) / (i4 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                iA = i2 * i3;
                return (iA * 3) / (i4 * 2);
            case "video/avc":
                String str2 = f0.d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(f0.f37542c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && aVar.f)))) {
                    return -1;
                }
                iA = f0.a(i3, 16) * f0.a(i2, 16) * 256;
                i4 = 2;
                return (iA * 3) / (i4 * 2);
            default:
                return -1;
        }
    }

    private static boolean a(boolean z2, m mVar, m mVar2) {
        if (mVar.f.equals(mVar2.f) && mVar.f39338n == mVar2.f39338n) {
            return (z2 || (mVar.k == mVar2.k && mVar.f39337l == mVar2.f39337l)) && f0.a(mVar.r, mVar2.r);
        }
        return false;
    }
}
