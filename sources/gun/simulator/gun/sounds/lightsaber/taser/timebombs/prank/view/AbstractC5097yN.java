package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5097yN extends L9 {
    public static final byte[] B0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, com.umeng.analytics.pro.cw.m, 19, 32, 0, 0, 1, 101, -120, -124, com.umeng.analytics.pro.cw.k, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public InterfaceC2889Xp A;
    public boolean A0;
    public MediaCrypto B;
    public boolean C;
    public final long D;
    public float E;
    public float F;
    public InterfaceC4306pN G;
    public C4619sw H;
    public MediaFormat I;
    public boolean J;
    public float K;
    public ArrayDeque L;
    public C4921wN M;
    public C4745uN N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public C4059mc Z;
    public long a0;
    public int b0;
    public int c0;
    public ByteBuffer d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public int l0;
    public final InterfaceC4218oN m;
    public int m0;
    public final InterfaceC5185zN n;
    public boolean n0;
    public final boolean o;
    public boolean o0;
    public final float p;
    public boolean p0;
    public final C2677Pl q;
    public long q0;
    public final C2677Pl r;
    public long r0;
    public final C2677Pl s;
    public boolean s0;
    public final C3353ea t;
    public boolean t0;
    public final ArrayList u;
    public boolean u0;
    public final MediaCodec.BufferInfo v;
    public boolean v0;
    public final ArrayDeque w;
    public C2321Bs w0;
    public C4619sw x;
    public C2599Ml x0;
    public C4619sw y;
    public C5009xN y0;
    public InterfaceC2889Xp z;
    public long z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5097yN(int i, G7 g7, float f) {
        super(i);
        C2297Au c2297Au = InterfaceC5185zN.r1;
        this.m = g7;
        this.n = c2297Au;
        this.o = false;
        this.p = f;
        this.q = new C2677Pl(0);
        this.r = new C2677Pl(0);
        this.s = new C2677Pl(2);
        C3353ea c3353ea = new C3353ea(2);
        c3353ea.l = 32;
        this.t = c3353ea;
        this.u = new ArrayList();
        this.v = new MediaCodec.BufferInfo();
        this.E = 1.0f;
        this.F = 1.0f;
        this.D = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.w = new ArrayDeque();
        g0(C5009xN.d);
        c3353ea.g(0);
        c3353ea.d.order(ByteOrder.nativeOrder());
        this.K = -1.0f;
        this.O = 0;
        this.k0 = 0;
        this.b0 = -1;
        this.c0 = -1;
        this.a0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.q0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.r0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.z0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.l0 = 0;
        this.m0 = 0;
    }

    public final boolean A() throws C2321Bs {
        if (this.n0) {
            this.l0 = 1;
            if (this.Q || this.S) {
                this.m0 = 3;
                return false;
            }
            this.m0 = 2;
        } else {
            l0();
        }
        return true;
    }

    public final boolean B(long j, long j2) throws C2321Bs {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean Z;
        int iH;
        boolean z3;
        boolean z4 = this.c0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.v;
        if (!z4) {
            if (this.T && this.o0) {
                try {
                    iH = this.G.h(bufferInfo2);
                } catch (IllegalStateException unused) {
                    Y();
                    if (this.t0) {
                        b0();
                    }
                    return false;
                }
            } else {
                iH = this.G.h(bufferInfo2);
            }
            if (iH < 0) {
                if (iH != -2) {
                    if (this.Y && (this.s0 || this.l0 == 2)) {
                        Y();
                    }
                    return false;
                }
                this.p0 = true;
                MediaFormat mediaFormatA = this.G.a();
                if (this.O != 0 && mediaFormatA.getInteger("width") == 32 && mediaFormatA.getInteger("height") == 32) {
                    this.X = true;
                } else {
                    if (this.V) {
                        mediaFormatA.setInteger("channel-count", 1);
                    }
                    this.I = mediaFormatA;
                    this.J = true;
                }
                return true;
            }
            if (this.X) {
                this.X = false;
                this.G.j(iH, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                Y();
                return false;
            }
            this.c0 = iH;
            ByteBuffer byteBufferK = this.G.k(iH);
            this.d0 = byteBufferK;
            if (byteBufferK != null) {
                byteBufferK.position(bufferInfo2.offset);
                this.d0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.U && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j3 = this.q0;
                if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    bufferInfo2.presentationTimeUs = j3;
                }
            }
            long j4 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z3 = false;
                    break;
                }
                if (((Long) arrayList.get(i)).longValue() == j4) {
                    arrayList.remove(i);
                    z3 = true;
                    break;
                }
                i++;
            }
            this.e0 = z3;
            long j5 = this.r0;
            long j6 = bufferInfo2.presentationTimeUs;
            this.f0 = j5 == j6;
            m0(j6);
        }
        if (this.T && this.o0) {
            try {
                z = true;
                z2 = false;
                try {
                    Z = Z(j, j2, this.G, this.d0, this.c0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.e0, this.f0, this.y);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    Y();
                    if (this.t0) {
                        b0();
                    }
                    return z2;
                }
            } catch (IllegalStateException unused3) {
                z2 = false;
            }
        } else {
            z = true;
            z2 = false;
            bufferInfo = bufferInfo2;
            Z = Z(j, j2, this.G, this.d0, this.c0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.e0, this.f0, this.y);
        }
        if (Z) {
            V(bufferInfo.presentationTimeUs);
            boolean z5 = (bufferInfo.flags & 4) != 0;
            this.c0 = -1;
            this.d0 = null;
            if (!z5) {
                return z;
            }
            Y();
        }
        return z2;
    }

    public final boolean C() throws C2321Bs {
        InterfaceC4306pN interfaceC4306pN = this.G;
        if (interfaceC4306pN == null || this.l0 == 2 || this.s0) {
            return false;
        }
        int i = this.b0;
        C2677Pl c2677Pl = this.r;
        if (i < 0) {
            int iG = interfaceC4306pN.g();
            this.b0 = iG;
            if (iG < 0) {
                return false;
            }
            c2677Pl.d = this.G.b(iG);
            c2677Pl.e();
        }
        if (this.l0 == 1) {
            if (!this.Y) {
                this.o0 = true;
                this.G.l(this.b0, 0, 0L, 4);
                this.b0 = -1;
                c2677Pl.d = null;
            }
            this.l0 = 2;
            return false;
        }
        if (this.W) {
            this.W = false;
            c2677Pl.d.put(B0);
            this.G.l(this.b0, 38, 0L, 0);
            this.b0 = -1;
            c2677Pl.d = null;
            this.n0 = true;
            return true;
        }
        if (this.k0 == 1) {
            for (int i2 = 0; i2 < this.H.n.size(); i2++) {
                c2677Pl.d.put((byte[]) this.H.n.get(i2));
            }
            this.k0 = 2;
        }
        int iPosition = c2677Pl.d.position();
        C3692iN c3692iN = this.b;
        c3692iN.m();
        try {
            int iP = p(c3692iN, c2677Pl, 0);
            if (f()) {
                this.r0 = this.q0;
            }
            if (iP == -3) {
                return false;
            }
            if (iP == -5) {
                if (this.k0 == 2) {
                    c2677Pl.e();
                    this.k0 = 1;
                }
                S(c3692iN);
                return true;
            }
            if (c2677Pl.c(4)) {
                if (this.k0 == 2) {
                    c2677Pl.e();
                    this.k0 = 1;
                }
                this.s0 = true;
                if (!this.n0) {
                    Y();
                    return false;
                }
                try {
                    if (!this.Y) {
                        this.o0 = true;
                        this.G.l(this.b0, 0, 0L, 4);
                        this.b0 = -1;
                        c2677Pl.d = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw b(Ug0.u(e.getErrorCode()), this.x, e, false);
                }
            }
            if (!this.n0 && !c2677Pl.c(1)) {
                c2677Pl.e();
                if (this.k0 == 2) {
                    this.k0 = 1;
                }
                return true;
            }
            boolean zC = c2677Pl.c(1073741824);
            C2339Ck c2339Ck = c2677Pl.c;
            if (zC) {
                if (iPosition == 0) {
                    c2339Ck.getClass();
                } else {
                    if (c2339Ck.d == null) {
                        int[] iArr = new int[1];
                        c2339Ck.d = iArr;
                        c2339Ck.i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = c2339Ck.d;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            if (this.P && !zC) {
                ByteBuffer byteBuffer = c2677Pl.d;
                byte[] bArr = AbstractC5188zQ.f5325a;
                int iPosition2 = byteBuffer.position();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = i3 + 1;
                    if (i5 >= iPosition2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i6 = byteBuffer.get(i3) & 255;
                    if (i4 == 3) {
                        if (i6 == 1 && (byteBuffer.get(i5) & 31) == 7) {
                            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                            byteBufferDuplicate.position(i3 - 3);
                            byteBufferDuplicate.limit(iPosition2);
                            byteBuffer.position(0);
                            byteBuffer.put(byteBufferDuplicate);
                            break;
                        }
                    } else if (i6 == 0) {
                        i4++;
                    }
                    if (i6 != 0) {
                        i4 = 0;
                    }
                    i3 = i5;
                }
                if (c2677Pl.d.position() == 0) {
                    return true;
                }
                this.P = false;
            }
            long jMax = c2677Pl.f;
            C4059mc c4059mc = this.Z;
            if (c4059mc != null) {
                C4619sw c4619sw = this.x;
                if (c4059mc.b == 0) {
                    c4059mc.f4702a = jMax;
                }
                if (!c4059mc.c) {
                    ByteBuffer byteBuffer2 = c2677Pl.d;
                    byteBuffer2.getClass();
                    int i7 = 0;
                    int i8 = 0;
                    for (int i9 = 4; i7 < i9; i9 = 4) {
                        i8 = (i8 << 8) | (byteBuffer2.get(i7) & 255);
                        i7++;
                    }
                    int iT = AbstractC4496rb.t(i8);
                    if (iT == -1) {
                        c4059mc.c = true;
                        c4059mc.b = 0L;
                        c4059mc.f4702a = c2677Pl.f;
                        AbstractC4038mJ.f();
                        jMax = c2677Pl.f;
                    } else {
                        jMax = Math.max(0L, ((c4059mc.b - 529) * 1000000) / c4619sw.z) + c4059mc.f4702a;
                        c4059mc.b += (long) iT;
                    }
                }
                long j = this.q0;
                C4059mc c4059mc2 = this.Z;
                C4619sw c4619sw2 = this.x;
                c4059mc2.getClass();
                this.q0 = Math.max(j, Math.max(0L, ((c4059mc2.b - 529) * 1000000) / c4619sw2.z) + c4059mc2.f4702a);
            } else {
                zC = zC;
            }
            if (c2677Pl.c(Integer.MIN_VALUE)) {
                this.u.add(Long.valueOf(jMax));
            }
            if (this.u0) {
                ArrayDeque arrayDeque = this.w;
                if (arrayDeque.isEmpty()) {
                    this.y0.c.a(jMax, this.x);
                } else {
                    ((C5009xN) arrayDeque.peekLast()).c.a(jMax, this.x);
                }
                this.u0 = false;
            }
            this.q0 = Math.max(this.q0, jMax);
            c2677Pl.h();
            if (c2677Pl.c(268435456)) {
                L(c2677Pl);
            }
            X(c2677Pl);
            try {
                if (zC) {
                    this.G.i(this.b0, c2339Ck, jMax);
                } else {
                    this.G.l(this.b0, c2677Pl.d.limit(), jMax, 0);
                }
                this.b0 = -1;
                c2677Pl.d = null;
                this.n0 = true;
                this.k0 = 0;
                this.x0.c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw b(Ug0.u(e2.getErrorCode()), this.x, e2, false);
            }
        } catch (C2651Ol e3) {
            P(e3);
            a0(0);
            D();
            return true;
        }
    }

    public final void D() {
        try {
            this.G.flush();
        } finally {
            d0();
        }
    }

    public final boolean E() {
        if (this.G == null) {
            return false;
        }
        int i = this.m0;
        if (i == 3 || this.Q || ((this.R && !this.p0) || (this.S && this.o0))) {
            b0();
            return true;
        }
        if (i == 2) {
            int i2 = Ug0.f3833a;
            FW.s(i2 >= 23);
            if (i2 >= 23) {
                try {
                    l0();
                } catch (C2321Bs e) {
                    AbstractC4038mJ.g("Failed to update the DRM session, releasing the codec instead.", e);
                    b0();
                    return true;
                }
            }
        }
        D();
        return false;
    }

    public final List F(boolean z) {
        C4619sw c4619sw = this.x;
        InterfaceC5185zN interfaceC5185zN = this.n;
        ArrayList arrayListI = I(interfaceC5185zN, c4619sw, z);
        if (arrayListI.isEmpty() && z) {
            arrayListI = I(interfaceC5185zN, this.x, false);
            if (!arrayListI.isEmpty()) {
                String str = this.x.l;
                arrayListI.toString();
                AbstractC4038mJ.f();
            }
        }
        return arrayListI;
    }

    public boolean G() {
        return false;
    }

    public abstract float H(float f, C4619sw[] c4619swArr);

    public abstract ArrayList I(InterfaceC5185zN interfaceC5185zN, C4619sw c4619sw, boolean z);

    public final C2507Iw J(InterfaceC2889Xp interfaceC2889Xp) throws C2321Bs {
        InterfaceC2287Ak interfaceC2287AkE = interfaceC2889Xp.e();
        if (interfaceC2287AkE == null || (interfaceC2287AkE instanceof C2507Iw)) {
            return (C2507Iw) interfaceC2287AkE;
        }
        throw b(AdError.MEDIAVIEW_MISSING_ERROR_CODE, this.x, new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + interfaceC2287AkE), false);
    }

    public abstract C4130nN K(C4745uN c4745uN, C4619sw c4619sw, MediaCrypto mediaCrypto, float f);

    /* JADX WARN: Code duplicated, block: B:142:0x02af  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Code duplicated, block: B:202:0x037e  */
    /* JADX WARN: Code duplicated, block: B:229:0x03da  */
    public final void M(C4745uN c4745uN, MediaCrypto mediaCrypto) {
        float fH;
        int i;
        boolean z;
        boolean z2;
        int i2;
        String str = c4745uN.f5075a;
        int i3 = Ug0.f3833a;
        if (i3 < 23) {
            fH = -1.0f;
        } else {
            float f = this.F;
            C4619sw[] c4619swArr = this.h;
            c4619swArr.getClass();
            fH = H(f, c4619swArr);
        }
        if (fH <= this.p) {
            fH = -1.0f;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C4130nN c4130nNK = K(c4745uN, this.x, mediaCrypto, fH);
        if (i3 >= 31) {
            WU wu = this.e;
            wu.getClass();
            AbstractC4833vN.a(c4130nNK, wu);
        }
        try {
            FW.c("createCodec:" + str);
            this.G = this.m.v(c4130nNK);
            FW.A();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!c4745uN.d(this.x)) {
                C4619sw c4619sw = this.x;
                if (c4619sw != null) {
                    StringBuilder sbO = DM.o("id=");
                    sbO.append(c4619sw.f5005a);
                    sbO.append(", mimeType=");
                    sbO.append(c4619sw.l);
                    int i4 = c4619sw.h;
                    if (i4 != -1) {
                        sbO.append(", bitrate=");
                        sbO.append(i4);
                    }
                    String str2 = c4619sw.i;
                    if (str2 != null) {
                        sbO.append(", codecs=");
                        sbO.append(str2);
                    }
                    DrmInitData drmInitData = c4619sw.o;
                    if (drmInitData != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (int i5 = 0; i5 < drmInitData.schemeDataCount; i5++) {
                            UUID uuid = drmInitData.d(i5).uuid;
                            if (uuid.equals(AbstractC4147nc.b)) {
                                linkedHashSet.add(com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cenc);
                            } else if (uuid.equals(AbstractC4147nc.c)) {
                                linkedHashSet.add("clearkey");
                            } else if (uuid.equals(AbstractC4147nc.e)) {
                                linkedHashSet.add("playready");
                            } else if (uuid.equals(AbstractC4147nc.d)) {
                                linkedHashSet.add("widevine");
                            } else if (uuid.equals(AbstractC4147nc.f4750a)) {
                                linkedHashSet.add(GatewayException.GATEWAY_RESPONSE_DEPTH_UNIVERSAL);
                            } else {
                                linkedHashSet.add("unknown (" + uuid + ")");
                            }
                        }
                        sbO.append(", drm=[");
                        new SE(String.valueOf(','), 0).a(sbO, linkedHashSet.iterator());
                        sbO.append(']');
                    }
                    int i6 = c4619sw.q;
                    if (i6 != -1 && (i2 = c4619sw.r) != -1) {
                        sbO.append(", res=");
                        sbO.append(i6);
                        sbO.append("x");
                        sbO.append(i2);
                    }
                    float f2 = c4619sw.s;
                    if (f2 != -1.0f) {
                        sbO.append(", fps=");
                        sbO.append(f2);
                    }
                    int i7 = c4619sw.y;
                    if (i7 != -1) {
                        sbO.append(", channels=");
                        sbO.append(i7);
                    }
                    int i8 = c4619sw.z;
                    if (i8 != -1) {
                        sbO.append(", sample_rate=");
                        sbO.append(i8);
                    }
                    String str3 = c4619sw.c;
                    if (str3 != null) {
                        sbO.append(", language=");
                        sbO.append(str3);
                    }
                    String str4 = c4619sw.b;
                    if (str4 != null) {
                        sbO.append(", label=");
                        sbO.append(str4);
                    }
                    int i9 = c4619sw.d;
                    if (i9 != 0) {
                        ArrayList arrayList = new ArrayList();
                        if ((i9 & 4) != 0) {
                            arrayList.add("auto");
                        }
                        if ((i9 & 1) != 0) {
                            arrayList.add(MRAIDCommunicatorUtil.STATES_DEFAULT);
                        }
                        if ((i9 & 2) != 0) {
                            arrayList.add("forced");
                        }
                        sbO.append(", selectionFlags=[");
                        new SE(String.valueOf(','), 0).a(sbO, arrayList.iterator());
                        sbO.append("]");
                    }
                    int i10 = c4619sw.e;
                    if (i10 != 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if ((i10 & 1) != 0) {
                            arrayList2.add("main");
                        }
                        if ((i10 & 2) != 0) {
                            arrayList2.add("alt");
                        }
                        if ((i10 & 4) != 0) {
                            arrayList2.add("supplementary");
                        }
                        if ((i10 & 8) != 0) {
                            arrayList2.add("commentary");
                        }
                        if ((i10 & 16) != 0) {
                            arrayList2.add("dub");
                        }
                        if ((i10 & 32) != 0) {
                            arrayList2.add("emergency");
                        }
                        if ((i10 & 64) != 0) {
                            arrayList2.add("caption");
                        }
                        if ((i10 & 128) != 0) {
                            arrayList2.add("subtitle");
                        }
                        if ((i10 & 256) != 0) {
                            arrayList2.add("sign");
                        }
                        if ((i10 & 512) != 0) {
                            arrayList2.add("describes-video");
                        }
                        if ((i10 & 1024) != 0) {
                            arrayList2.add("describes-music");
                        }
                        if ((i10 & 2048) != 0) {
                            arrayList2.add("enhanced-intelligibility");
                        }
                        if ((i10 & 4096) != 0) {
                            arrayList2.add("transcribes-dialog");
                        }
                        if ((i10 & 8192) != 0) {
                            arrayList2.add("easy-read");
                        }
                        if ((i10 & 16384) != 0) {
                            arrayList2.add("trick-play");
                        }
                        sbO.append(", roleFlags=[");
                        new SE(String.valueOf(','), 0).a(sbO, arrayList2.iterator());
                        sbO.append("]");
                    }
                }
                Locale locale = Locale.US;
                AbstractC4038mJ.f();
            }
            this.N = c4745uN;
            this.K = fH;
            this.H = this.x;
            int i11 = Ug0.f3833a;
            if (i11 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str5 = Ug0.d;
                if (str5.startsWith("SM-T585") || str5.startsWith("SM-A510") || str5.startsWith("SM-A520") || str5.startsWith("SM-J700")) {
                    i = 2;
                } else if (i11 < 24) {
                    i = 0;
                } else {
                    i = 0;
                }
            } else if (i11 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i = 0;
            } else {
                String str6 = Ug0.b;
                if ("flounder".equals(str6) || "flounder_lte".equals(str6) || "grouper".equals(str6) || "tilapia".equals(str6)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            this.O = i;
            this.P = i11 < 21 && this.H.n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.Q = i11 < 18 || (i11 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i11 == 19 && Ug0.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
            this.R = i11 == 29 && "c2.android.aac.decoder".equals(str);
            if (i11 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
                if (i11 <= 19) {
                    String str7 = Ug0.b;
                    z = ("hb2000".equals(str7) || "stvm8".equals(str7)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str));
                }
            }
            this.S = z;
            this.T = i11 == 21 && "OMX.google.aac.decoder".equals(str);
            if (i11 < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(Ug0.c)) {
                String str8 = Ug0.b;
                if (str8.startsWith("baffin") || str8.startsWith("grand") || str8.startsWith("fortuna") || str8.startsWith("gprimelte") || str8.startsWith("j2y18lte") || str8.startsWith("ms01")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            this.U = z2;
            this.V = i11 <= 18 && this.H.y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
            String str9 = c4745uN.f5075a;
            this.Y = (i11 <= 25 && "OMX.rk.video_decoder.avc".equals(str9)) || (i11 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str9)) || ((i11 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str9) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str9) || "OMX.bcm.vdec.avc.tunnel".equals(str9) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str9) || "OMX.bcm.vdec.hevc.tunnel".equals(str9) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str9))) || (("Amazon".equals(Ug0.c) && "AFTS".equals(Ug0.d) && c4745uN.f) || G()));
            this.G.getClass();
            if ("c2.android.mp3.decoder".equals(str9)) {
                this.Z = new C4059mc();
            }
            if (this.f == 2) {
                this.a0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.x0.f3420a++;
            Q(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            FW.A();
            throw th;
        }
    }

    public final void N() {
        C4619sw c4619sw;
        if (this.G != null || this.g0 || (c4619sw = this.x) == null) {
            return;
        }
        if (this.A == null && i0(c4619sw)) {
            C4619sw c4619sw2 = this.x;
            z();
            String str = c4619sw2.l;
            boolean zEquals = MimeTypes.AUDIO_AAC.equals(str);
            C3353ea c3353ea = this.t;
            if (zEquals || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
                c3353ea.getClass();
                c3353ea.l = 32;
            } else {
                c3353ea.getClass();
                c3353ea.l = 1;
            }
            this.g0 = true;
            return;
        }
        f0(this.A);
        String str2 = this.x.l;
        InterfaceC2889Xp interfaceC2889Xp = this.z;
        if (interfaceC2889Xp != null) {
            if (this.B == null) {
                C2507Iw c2507IwJ = J(interfaceC2889Xp);
                if (c2507IwJ != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(c2507IwJ.f3247a, c2507IwJ.b);
                        this.B = mediaCrypto;
                        this.C = !c2507IwJ.c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e) {
                        throw b(6006, this.x, e, false);
                    }
                } else if (this.z.getError() == null) {
                    return;
                }
            }
            if (C2507Iw.d) {
                int state = this.z.getState();
                if (state == 1) {
                    C2863Wp error = this.z.getError();
                    error.getClass();
                    throw b(error.f3943a, this.x, error, false);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            O(this.B, this.C);
        } catch (C4921wN e2) {
            throw b(4001, this.x, e2, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x004a A[SYNTHETIC] */
    public final void O(MediaCrypto mediaCrypto, boolean z) throws C4921wN {
        C4921wN c4921wN;
        String str;
        C4921wN c4921wN2;
        String diagnosticInfo;
        if (this.L == null) {
            try {
                List listF = F(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.L = arrayDeque;
                if (this.o) {
                    arrayDeque.addAll(listF);
                } else if (!listF.isEmpty()) {
                    this.L.add((C4745uN) listF.get(0));
                }
                this.M = null;
            } catch (DN e) {
                throw new C4921wN(-49998, this.x, e, z);
            }
        }
        if (this.L.isEmpty()) {
            throw new C4921wN(-49999, this.x, null, z);
        }
        C4745uN c4745uN = (C4745uN) this.L.peekFirst();
        while (this.G == null) {
            C4745uN c4745uN2 = (C4745uN) this.L.peekFirst();
            if (!h0(c4745uN2)) {
                return;
            }
            try {
                M(c4745uN2, mediaCrypto);
            } catch (Exception e2) {
                if (c4745uN2 != c4745uN) {
                    throw e2;
                }
                try {
                    AbstractC4038mJ.f();
                    Thread.sleep(50L);
                    M(c4745uN2, mediaCrypto);
                } catch (Exception e3) {
                    AbstractC4038mJ.g("Failed to initialize decoder: " + c4745uN2, e3);
                    this.L.removeFirst();
                    C4619sw c4619sw = this.x;
                    String str2 = "Decoder init failed: " + c4745uN2.f5075a + ", " + c4619sw;
                    String str3 = c4619sw.l;
                    if (Ug0.f3833a >= 21) {
                        if (e3 instanceof MediaCodec.CodecException) {
                            diagnosticInfo = ((MediaCodec.CodecException) e3).getDiagnosticInfo();
                        } else {
                            diagnosticInfo = null;
                        }
                        str = diagnosticInfo;
                    } else {
                        str = null;
                    }
                    c4921wN = new C4921wN(str2, e3, str3, z, c4745uN2, str);
                    P(c4921wN);
                    c4921wN2 = this.M;
                    if (c4921wN2 == null) {
                        this.M = c4921wN;
                    } else {
                        this.M = new C4921wN(c4921wN2.getMessage(), c4921wN2.getCause(), c4921wN2.f5177a, c4921wN2.b, c4921wN2.c, c4921wN2.d);
                    }
                    if (!this.L.isEmpty()) {
                        throw this.M;
                    }
                }
                AbstractC4038mJ.g("Failed to initialize decoder: " + c4745uN2, e3);
                this.L.removeFirst();
                C4619sw c4619sw2 = this.x;
                String str4 = "Decoder init failed: " + c4745uN2.f5075a + ", " + c4619sw2;
                String str5 = c4619sw2.l;
                if (Ug0.f3833a >= 21) {
                    if (e3 instanceof MediaCodec.CodecException) {
                        diagnosticInfo = ((MediaCodec.CodecException) e3).getDiagnosticInfo();
                    } else {
                        diagnosticInfo = null;
                    }
                    str = diagnosticInfo;
                } else {
                    str = null;
                }
                c4921wN = new C4921wN(str4, e3, str5, z, c4745uN2, str);
                P(c4921wN);
                c4921wN2 = this.M;
                if (c4921wN2 == null) {
                    this.M = c4921wN;
                } else {
                    this.M = new C4921wN(c4921wN2.getMessage(), c4921wN2.getCause(), c4921wN2.f5177a, c4921wN2.b, c4921wN2.c, c4921wN2.d);
                }
                if (!this.L.isEmpty()) {
                    throw this.M;
                }
            }
        }
        this.L = null;
    }

    public abstract void P(Exception exc);

    public abstract void Q(String str, long j, long j2);

    public abstract void R(String str);

    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
    
        if (r13 != false) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2729Rl S(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3692iN r13) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN.S(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iN):gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rl");
    }

    public abstract void T(C4619sw c4619sw, MediaFormat mediaFormat);

    public void V(long j) {
        this.z0 = j;
        ArrayDeque arrayDeque = this.w;
        if (arrayDeque.isEmpty() || j < ((C5009xN) arrayDeque.peek()).f5221a) {
            return;
        }
        g0((C5009xN) arrayDeque.poll());
        W();
    }

    public abstract void W();

    public abstract void X(C2677Pl c2677Pl);

    public final void Y() throws C2321Bs {
        int i = this.m0;
        if (i == 1) {
            D();
            return;
        }
        if (i == 2) {
            D();
            l0();
        } else if (i != 3) {
            this.t0 = true;
            c0();
        } else {
            b0();
            N();
        }
    }

    public abstract boolean Z(long j, long j2, InterfaceC4306pN interfaceC4306pN, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C4619sw c4619sw);

    public final boolean a0(int i) throws C2321Bs {
        C3692iN c3692iN = this.b;
        c3692iN.m();
        C2677Pl c2677Pl = this.q;
        c2677Pl.e();
        int iP = p(c3692iN, c2677Pl, i | 4);
        if (iP == -5) {
            S(c3692iN);
            return true;
        }
        if (iP != -4 || !c2677Pl.c(4)) {
            return false;
        }
        this.s0 = true;
        Y();
        return false;
    }

    public final void b0() {
        try {
            InterfaceC4306pN interfaceC4306pN = this.G;
            if (interfaceC4306pN != null) {
                interfaceC4306pN.release();
                this.x0.b++;
                R(this.N.f5075a);
            }
            this.G = null;
            try {
                MediaCrypto mediaCrypto = this.B;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.B = null;
                f0(null);
                e0();
            }
        } catch (Throwable th) {
            this.G = null;
            try {
                MediaCrypto mediaCrypto2 = this.B;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.B = null;
                f0(null);
                e0();
            }
        }
    }

    public void d0() {
        this.b0 = -1;
        this.r.d = null;
        this.c0 = -1;
        this.d0 = null;
        this.a0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.o0 = false;
        this.n0 = false;
        this.W = false;
        this.X = false;
        this.e0 = false;
        this.f0 = false;
        this.u.clear();
        this.q0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.r0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.z0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        C4059mc c4059mc = this.Z;
        if (c4059mc != null) {
            c4059mc.f4702a = 0L;
            c4059mc.b = 0L;
            c4059mc.c = false;
        }
        this.l0 = 0;
        this.m0 = 0;
        this.k0 = this.j0 ? 1 : 0;
    }

    public final void e0() {
        d0();
        this.w0 = null;
        this.Z = null;
        this.L = null;
        this.N = null;
        this.H = null;
        this.I = null;
        this.J = false;
        this.p0 = false;
        this.K = -1.0f;
        this.O = 0;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.Y = false;
        this.j0 = false;
        this.k0 = 0;
        this.C = false;
    }

    public final void f0(InterfaceC2889Xp interfaceC2889Xp) {
        InterfaceC2889Xp interfaceC2889Xp2 = this.z;
        if (interfaceC2889Xp2 != interfaceC2889Xp) {
            if (interfaceC2889Xp != null) {
                interfaceC2889Xp.d(null);
            }
            if (interfaceC2889Xp2 != null) {
                interfaceC2889Xp2.b(null);
            }
        }
        this.z = interfaceC2889Xp;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public boolean g() {
        return this.t0;
    }

    public final void g0(C5009xN c5009xN) {
        this.y0 = c5009xN;
        if (c5009xN.b != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.A0 = true;
            U();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public boolean h() {
        boolean zIsReady;
        if (this.x != null) {
            if (f()) {
                zIsReady = this.k;
            } else {
                W20 w20 = this.g;
                w20.getClass();
                zIsReady = w20.isReady();
            }
            if (zIsReady || this.c0 >= 0 || (this.a0 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && SystemClock.elapsedRealtime() < this.a0)) {
                return true;
            }
        }
        return false;
    }

    public boolean h0(C4745uN c4745uN) {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public void i() {
        this.x = null;
        g0(C5009xN.d);
        this.w.clear();
        E();
    }

    public boolean i0(C4619sw c4619sw) {
        return false;
    }

    public abstract int j0(InterfaceC5185zN interfaceC5185zN, C4619sw c4619sw);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public void k(long j, boolean z) {
        int i;
        this.s0 = false;
        this.t0 = false;
        this.v0 = false;
        if (this.g0) {
            this.t.e();
            this.s.e();
            this.h0 = false;
        } else if (E()) {
            N();
        }
        VC vc = this.y0.c;
        synchronized (vc) {
            i = vc.b;
        }
        if (i > 0) {
            this.u0 = true;
        }
        this.y0.c.b();
        this.w.clear();
    }

    public final boolean k0(C4619sw c4619sw) {
        if (Ug0.f3833a >= 23 && this.G != null && this.m0 != 3 && this.f != 0) {
            float f = this.F;
            C4619sw[] c4619swArr = this.h;
            c4619swArr.getClass();
            float fH = H(f, c4619swArr);
            float f2 = this.K;
            if (f2 == fH) {
                return true;
            }
            if (fH == -1.0f) {
                if (this.n0) {
                    this.l0 = 1;
                    this.m0 = 3;
                    return false;
                }
                b0();
                N();
                return false;
            }
            if (f2 == -1.0f && fH <= this.p) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fH);
            this.G.e(bundle);
            this.K = fH;
        }
        return true;
    }

    public final void l0() throws C2321Bs {
        try {
            this.B.setMediaDrmSession(J(this.A).b);
            f0(this.A);
            this.l0 = 0;
            this.m0 = 0;
        } catch (MediaCryptoException e) {
            throw b(6006, this.x, e, false);
        }
    }

    public final void m0(long j) {
        Object objF;
        C4619sw c4619sw = (C4619sw) this.y0.c.e(j);
        if (c4619sw == null && this.A0 && this.I != null) {
            VC vc = this.y0.c;
            synchronized (vc) {
                objF = vc.b == 0 ? null : vc.f();
            }
            c4619sw = (C4619sw) objF;
        }
        if (c4619sw != null) {
            this.y = c4619sw;
        } else if (!this.J || this.y == null) {
            return;
        }
        T(this.y, this.I);
        this.J = false;
        this.A0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r7 >= r5.q0) goto L12;
     */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4619sw[] r6, long r7, long r9) {
        /*
            r5 = this;
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xN r6 = r5.y0
            long r6 = r6.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 == 0) goto L2d
            java.util.ArrayDeque r6 = r5.w
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L22
            long r7 = r5.z0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L22
            long r2 = r5.q0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L22
            goto L2d
        L22:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xN r7 = new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xN
            long r0 = r5.q0
            r7.<init>(r0, r9)
            r6.add(r7)
            goto L35
        L2d:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xN r6 = new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xN
            r6.<init>(r0, r9)
            r5.g0(r6)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN.o(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sw[], long, long):void");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void q(long j, long j2) throws C2321Bs {
        boolean z = false;
        if (this.v0) {
            this.v0 = false;
            Y();
        }
        C2321Bs c2321Bs = this.w0;
        if (c2321Bs != null) {
            this.w0 = null;
            throw c2321Bs;
        }
        try {
            if (this.t0) {
                c0();
                return;
            }
            if (this.x != null || a0(2)) {
                N();
                if (this.g0) {
                    FW.c("bypassRender");
                    while (w(j, j2)) {
                    }
                    FW.A();
                } else if (this.G != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    FW.c("drainAndFeed");
                    while (B(j, j2)) {
                        long j3 = this.D;
                        if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && SystemClock.elapsedRealtime() - jElapsedRealtime >= j3) {
                            break;
                        }
                    }
                    while (C()) {
                        long j4 = this.D;
                        if (j4 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && SystemClock.elapsedRealtime() - jElapsedRealtime >= j4) {
                            break;
                        }
                    }
                    FW.A();
                } else {
                    C2599Ml c2599Ml = this.x0;
                    int i = c2599Ml.d;
                    W20 w20 = this.g;
                    w20.getClass();
                    c2599Ml.d = i + w20.skipData(j - this.i);
                    a0(1);
                }
                synchronized (this.x0) {
                }
            }
        } catch (IllegalStateException e) {
            int i2 = Ug0.f3833a;
            if (i2 < 21 || !(e instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e;
                }
            }
            P(e);
            if (i2 >= 21 && (e instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e).isRecoverable()) {
                z = true;
            }
            if (z) {
                b0();
            }
            throw b(4003, this.x, y(e, this.N), z);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public void t(float f, float f2) {
        this.E = f;
        this.F = f2;
        k0(this.H);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final int u(C4619sw c4619sw) throws C2321Bs {
        try {
            return j0(this.n, c4619sw);
        } catch (DN e) {
            throw c(e, c4619sw);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final int v() {
        return 8;
    }

    public final boolean w(long j, long j2) {
        C3353ea c3353ea;
        FW.s(!this.t0);
        C3353ea c3353ea2 = this.t;
        int i = c3353ea2.k;
        if (!(i > 0)) {
            c3353ea = c3353ea2;
        } else {
            if (!Z(j, j2, null, c3353ea2.d, this.c0, 0, i, c3353ea2.f, c3353ea2.c(Integer.MIN_VALUE), c3353ea2.c(4), this.y)) {
                return false;
            }
            c3353ea = c3353ea2;
            V(c3353ea.j);
            c3353ea.e();
        }
        if (this.s0) {
            this.t0 = true;
            return false;
        }
        boolean z = this.h0;
        C2677Pl c2677Pl = this.s;
        if (z) {
            FW.s(c3353ea.i(c2677Pl));
            this.h0 = false;
        }
        if (this.i0) {
            if (c3353ea.k > 0) {
                return true;
            }
            z();
            this.i0 = false;
            N();
            if (!this.g0) {
                return false;
            }
        }
        FW.s(!this.s0);
        C3692iN c3692iN = this.b;
        c3692iN.m();
        c2677Pl.e();
        while (true) {
            c2677Pl.e();
            int iP = p(c3692iN, c2677Pl, 0);
            if (iP == -5) {
                S(c3692iN);
                break;
            }
            if (iP != -4) {
                if (iP == -3) {
                    break;
                }
                throw new IllegalStateException();
            }
            if (c2677Pl.c(4)) {
                this.s0 = true;
                break;
            }
            if (this.u0) {
                C4619sw c4619sw = this.x;
                c4619sw.getClass();
                this.y = c4619sw;
                T(c4619sw, null);
                this.u0 = false;
            }
            c2677Pl.h();
            if (!c3353ea.i(c2677Pl)) {
                this.h0 = true;
                break;
            }
        }
        if (c3353ea.k > 0) {
            c3353ea.h();
        }
        return c3353ea.k > 0 || this.s0 || this.i0;
    }

    public abstract C2729Rl x(C4745uN c4745uN, C4619sw c4619sw, C4619sw c4619sw2);

    public C4569sN y(IllegalStateException illegalStateException, C4745uN c4745uN) {
        return new C4569sN(illegalStateException, c4745uN);
    }

    public final void z() {
        this.i0 = false;
        this.t.e();
        this.s.e();
        this.h0 = false;
        this.g0 = false;
    }

    public void U() {
    }

    public void c0() {
    }

    public void L(C2677Pl c2677Pl) {
    }
}
