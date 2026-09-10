package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2536Jz extends AbstractC3866kN {
    public static final AtomicInteger L = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public InterfaceC2562Kz C;
    public C3591hA D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public AC I;
    public boolean J;
    public boolean K;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final InterfaceC4429ql p;
    public final C4868vl q;
    public final InterfaceC2562Kz r;
    public final boolean s;
    public final boolean t;
    public final Mc0 u;
    public final InterfaceC2484Hz v;
    public final List w;
    public final DrmInitData x;
    public final C3241dC y;
    public final JT z;

    public C2536Jz(InterfaceC2484Hz interfaceC2484Hz, InterfaceC4429ql interfaceC4429ql, C4868vl c4868vl, C4619sw c4619sw, boolean z, InterfaceC4429ql interfaceC4429ql2, C4868vl c4868vl2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, Mc0 mc0, DrmInitData drmInitData, InterfaceC2562Kz interfaceC2562Kz, C3241dC c3241dC, JT jt, boolean z6, WU wu) {
        super(interfaceC4429ql, c4868vl, c4619sw, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.K = z3;
        this.l = i3;
        this.q = c4868vl2;
        this.p = interfaceC4429ql2;
        this.F = c4868vl2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = mc0;
        this.t = z4;
        this.v = interfaceC2484Hz;
        this.w = list;
        this.x = drmInitData;
        this.r = interfaceC2562Kz;
        this.y = c3241dC;
        this.z = jt;
        this.n = z6;
        C5086yC c5086yC = AC.b;
        this.I = C3965lY.e;
        this.k = L.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (FW.h0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3866kN
    public final boolean b() {
        throw null;
    }

    public final void c(InterfaceC4429ql interfaceC4429ql, C4868vl c4868vl, boolean z, boolean z2) {
        C4868vl c4868vlB;
        long j;
        long j2;
        boolean z3 = false;
        if (z) {
            z3 = this.E != 0;
            c4868vlB = c4868vl;
        } else {
            c4868vlB = c4868vl.b(this.E);
        }
        try {
            C2938Zm c2938ZmF = f(interfaceC4429ql, c4868vlB, z2);
            if (z3) {
                c2938ZmF.skipFully(this.E);
            }
            while (!this.G) {
                try {
                    try {
                        if (((C2615Nb) this.C).f3461a.a(c2938ZmF, C2615Nb.d) != 0) {
                            break;
                        }
                    } catch (EOFException e) {
                        if ((this.d.e & 16384) == 0) {
                            throw e;
                        }
                        ((C2615Nb) this.C).f3461a.seek(0L, 0L);
                        j = c2938ZmF.d;
                        j2 = c4868vl.f;
                    }
                } catch (Throwable th) {
                    this.E = (int) (c2938ZmF.d - c4868vl.f);
                    throw th;
                }
            }
            j = c2938ZmF.d;
            j2 = c4868vl.f;
            this.E = (int) (j - j2);
            FW.v(interfaceC4429ql);
        } catch (Throwable th2) {
            FW.v(interfaceC4429ql);
            throw th2;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void cancelLoad() {
        this.G = true;
    }

    public final int e(int i) {
        FW.s(!this.n);
        if (i >= this.I.size()) {
            return 0;
        }
        return ((Integer) this.I.get(i)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    public final C2938Zm f(InterfaceC4429ql interfaceC4429ql, C4868vl c4868vl, boolean z) throws InterruptedIOException {
        long jN;
        C2615Nb c2615Nb;
        C2615Nb c2615Nb2;
        Mc0 mc0;
        InterfaceC4177nt c3042b0;
        int i;
        List listSingletonList;
        int i2;
        InterfaceC4177nt np;
        long jD = interfaceC4429ql.d(c4868vl);
        int i3 = 1;
        if (z) {
            try {
                Mc0 mc1 = this.u;
                boolean z2 = this.s;
                long j = this.g;
                synchronized (mc1) {
                    try {
                        FW.s(mc1.f3411a == 9223372036854775806L);
                        if (mc1.b == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            if (z2) {
                                mc1.d.set(Long.valueOf(j));
                            } else {
                                while (mc1.b == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                    mc1.wait();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        C2938Zm c2938Zm = new C2938Zm(interfaceC4429ql, c4868vl.f, jD);
        if (this.C == null) {
            JT jt = this.z;
            c2938Zm.f = 0;
            try {
                jt.B(10);
                c2938Zm.peekFully(jt.f3266a, 0, 10, false);
                if (jt.v() != 4801587) {
                    jN = -9223372036854775807L;
                    break;
                }
                jt.F(3);
                int iS = jt.s();
                int i4 = iS + 10;
                byte[] bArr = jt.f3266a;
                if (i4 > bArr.length) {
                    jt.B(i4);
                    System.arraycopy(bArr, 0, jt.f3266a, 0, 10);
                }
                c2938Zm.peekFully(jt.f3266a, 10, iS, false);
                Metadata metadataK0 = this.y.k0(iS, jt.f3266a);
                if (metadataK0 == null) {
                    jN = -9223372036854775807L;
                    break;
                }
                int iF = metadataK0.f();
                int i5 = 0;
                while (true) {
                    if (i5 >= iF) {
                        jN = -9223372036854775807L;
                        break;
                    }
                    Metadata.Entry entryE = metadataK0.e(i5);
                    if (entryE instanceof PrivFrame) {
                        PrivFrame privFrame = (PrivFrame) entryE;
                        if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.owner)) {
                            System.arraycopy(privFrame.privateData, 0, jt.f3266a, 0, 8);
                            jt.E(0);
                            jt.D(8);
                            jN = jt.n() & 8589934591L;
                            break;
                        }
                    }
                    i5++;
                }
            } catch (EOFException unused2) {
            }
            c2938Zm.f = 0;
            InterfaceC2562Kz interfaceC2562Kz = this.r;
            if (interfaceC2562Kz != null) {
                C2615Nb c2615Nb3 = (C2615Nb) interfaceC2562Kz;
                InterfaceC4177nt interfaceC4177nt = c2615Nb3.f3461a;
                FW.s(!((interfaceC4177nt instanceof C4240oe0) || (interfaceC4177nt instanceof C2455Gw)));
                InterfaceC4177nt interfaceC4177nt2 = c2615Nb3.f3461a;
                boolean z3 = interfaceC4177nt2 instanceof Rl0;
                Mc0 mc2 = c2615Nb3.c;
                C4619sw c4619sw = c2615Nb3.b;
                if (z3) {
                    np = new Rl0(c4619sw.c, mc2);
                } else if (interfaceC4177nt2 instanceof J3) {
                    np = new J3();
                } else if (interfaceC4177nt2 instanceof C3042b0) {
                    np = new C3042b0();
                } else if (interfaceC4177nt2 instanceof C3307e0) {
                    np = new C3307e0();
                } else {
                    if (!(interfaceC4177nt2 instanceof NP)) {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(interfaceC4177nt2.getClass().getSimpleName()));
                    }
                    np = new NP();
                }
                c2615Nb2 = new C2615Nb(np, c4619sw, mc2);
                jN = jN;
            } else {
                InterfaceC2484Hz interfaceC2484Hz = this.v;
                Uri uri = c4868vl.f5150a;
                C4619sw c4619sw2 = this.d;
                List list = this.w;
                Mc0 mc3 = this.u;
                Map responseHeaders = interfaceC4429ql.getResponseHeaders();
                ((C3467fn) interfaceC2484Hz).getClass();
                int iJ = FW.J(c4619sw2.l);
                List list2 = (List) responseHeaders.get("Content-Type");
                int iJ2 = FW.J((list2 == null || list2.isEmpty()) ? null : (String) list2.get(0));
                int iK = FW.K(uri);
                ArrayList arrayList = new ArrayList(7);
                C3467fn.a(iJ, arrayList);
                C3467fn.a(iJ2, arrayList);
                C3467fn.a(iK, arrayList);
                int[] iArr = C3467fn.b;
                int i6 = 0;
                for (int i7 = 7; i6 < i7; i7 = 7) {
                    C3467fn.a(iArr[i6], arrayList);
                    i6++;
                }
                c2938Zm.f = 0;
                int i8 = 0;
                InterfaceC4177nt interfaceC4177nt3 = null;
                while (true) {
                    if (i8 >= arrayList.size()) {
                        jN = jN;
                        interfaceC4177nt3.getClass();
                        c2615Nb = new C2615Nb(interfaceC4177nt3, c4619sw2, mc3);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList.get(i8)).intValue();
                    if (iIntValue == 0) {
                        jN = jN;
                        arrayList = arrayList;
                        mc0 = mc3;
                        c3042b0 = new C3042b0();
                    } else if (iIntValue == i3) {
                        jN = jN;
                        arrayList = arrayList;
                        mc0 = mc3;
                        c3042b0 = new C3307e0();
                    } else if (iIntValue == 2) {
                        jN = jN;
                        arrayList = arrayList;
                        mc0 = mc3;
                        c3042b0 = new J3();
                    } else if (iIntValue == 7) {
                        jN = jN;
                        arrayList = arrayList;
                        mc0 = mc3;
                        c3042b0 = new NP(0L);
                    } else if (iIntValue != 8) {
                        if (iIntValue == 11) {
                            if (list != null) {
                                i2 = 48;
                                listSingletonList = list;
                            } else {
                                C4531rw c4531rw = new C4531rw();
                                c4531rw.k = MimeTypes.APPLICATION_CEA608;
                                listSingletonList = Collections.singletonList(new C4619sw(c4531rw));
                                i2 = 16;
                            }
                            String str = c4619sw2.i;
                            if (!TextUtils.isEmpty(str)) {
                                if (AbstractC5011xP.c(str, MimeTypes.AUDIO_AAC) == null) {
                                    i2 |= 2;
                                }
                                if (AbstractC5011xP.c(str, "video/avc") == null) {
                                    i2 |= 4;
                                }
                            }
                            c3042b0 = new C4240oe0(2, mc3, new C4237od(i2, listSingletonList));
                        } else if (iIntValue != 13) {
                            jN = jN;
                            arrayList = arrayList;
                            mc0 = mc3;
                            c3042b0 = null;
                        } else {
                            c3042b0 = new Rl0(c4619sw2.c, mc3);
                            arrayList = arrayList;
                        }
                        mc0 = mc3;
                    } else {
                        jN = jN;
                        arrayList = arrayList;
                        Metadata metadata = c4619sw2.j;
                        if (metadata != null) {
                            int i9 = 0;
                            while (true) {
                                if (i9 < metadata.f()) {
                                    Metadata.Entry entryE2 = metadata.e(i9);
                                    if (entryE2 instanceof HlsTrackMetadataEntry) {
                                        if (!((HlsTrackMetadataEntry) entryE2).variantInfos.isEmpty()) {
                                            i = 4;
                                            break;
                                        }
                                    } else {
                                        i9++;
                                    }
                                }
                                i = 0;
                                break;
                            }
                        }
                        i = 0;
                        break;
                        mc0 = mc3;
                        c3042b0 = new C2455Gw(i, mc0, null, list != null ? list : Collections.emptyList(), null);
                    }
                    c3042b0.getClass();
                    try {
                        boolean zB = c3042b0.b(c2938Zm);
                        c2938Zm.f = 0;
                        if (zB) {
                            c2615Nb = new C2615Nb(c3042b0, c4619sw2, mc0);
                            break;
                        }
                    } catch (EOFException unused3) {
                        c2938Zm.f = 0;
                    } catch (Throwable th2) {
                        c2938Zm.f = 0;
                        throw th2;
                    }
                    if (interfaceC4177nt3 == null && (iIntValue == iJ || iIntValue == iJ2 || iIntValue == iK || iIntValue == 11)) {
                        interfaceC4177nt3 = c3042b0;
                    }
                    i8++;
                    mc3 = mc0;
                    arrayList = arrayList;
                    jN = jN;
                    i3 = 1;
                }
                c2615Nb2 = c2615Nb;
            }
            this.C = c2615Nb2;
            InterfaceC4177nt interfaceC4177nt4 = c2615Nb2.f3461a;
            if ((interfaceC4177nt4 instanceof J3) || (interfaceC4177nt4 instanceof C3042b0) || (interfaceC4177nt4 instanceof C3307e0) || (interfaceC4177nt4 instanceof NP)) {
                C3591hA c3591hA = this.D;
                long jB = jN != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? this.u.b(jN) : this.g;
                if (c3591hA.V != jB) {
                    c3591hA.V = jB;
                    for (C3503gA c3503gA : c3591hA.v) {
                        if (c3503gA.F != jB) {
                            c3503gA.F = jB;
                            c3503gA.z = true;
                        }
                    }
                }
            } else {
                C3591hA c3591hA2 = this.D;
                if (c3591hA2.V != 0) {
                    c3591hA2.V = 0L;
                    for (C3503gA c3503gA2 : c3591hA2.v) {
                        if (c3503gA2.F != 0) {
                            c3503gA2.F = 0L;
                            c3503gA2.z = true;
                        }
                    }
                }
            }
            this.D.x.clear();
            ((C2615Nb) this.C).f3461a.d(this.D);
        }
        C3591hA c3591hA3 = this.D;
        DrmInitData drmInitData = this.x;
        if (!Ug0.a(c3591hA3.W, drmInitData)) {
            c3591hA3.W = drmInitData;
            int i10 = 0;
            while (true) {
                C3503gA[] c3503gAArr = c3591hA3.v;
                if (i10 >= c3503gAArr.length) {
                    break;
                }
                if (c3591hA3.O[i10]) {
                    C3503gA c3503gA3 = c3503gAArr[i10];
                    c3503gA3.I = drmInitData;
                    c3503gA3.z = true;
                }
                i10++;
            }
        }
        return c2938Zm;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void load() {
        InterfaceC2562Kz interfaceC2562Kz;
        this.D.getClass();
        if (this.C == null && (interfaceC2562Kz = this.r) != null) {
            InterfaceC4177nt interfaceC4177nt = ((C2615Nb) interfaceC2562Kz).f3461a;
            if ((interfaceC4177nt instanceof C4240oe0) || (interfaceC4177nt instanceof C2455Gw)) {
                this.C = interfaceC2562Kz;
                this.F = false;
            }
        }
        if (this.F) {
            InterfaceC4429ql interfaceC4429ql = this.p;
            interfaceC4429ql.getClass();
            C4868vl c4868vl = this.q;
            c4868vl.getClass();
            c(interfaceC4429ql, c4868vl, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.t) {
            c(this.i, this.b, this.A, true);
        }
        this.H = !this.G;
    }
}
