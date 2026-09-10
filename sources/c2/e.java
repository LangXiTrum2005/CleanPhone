package c2;

import b2.m;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Utf8;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.e0;
import java.util.Locale;
import l1.q;
import l1.y;
import m1.n;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f5872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f5873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f5874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a0 f5875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f5880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5881k;

    public e(m mVar, int i10) {
        this.f5871a = i10;
        switch (i10) {
            case 1:
                this.f5872b = new q();
                this.f5873c = new q(n.f45820a);
                this.f5874d = mVar;
                this.f5877g = C.TIME_UNSET;
                this.f5878h = -1;
                break;
            default:
                this.f5873c = new q(n.f45820a);
                this.f5874d = mVar;
                this.f5872b = new q();
                this.f5877g = C.TIME_UNSET;
                this.f5878h = -1;
                break;
        }
    }

    @Override // c2.i
    public final void a(n2.m mVar, int i10) {
        int i11 = this.f5871a;
        m mVar2 = this.f5874d;
        switch (i11) {
            case 0:
                a0 a0VarTrack = mVar.track(i10, 2);
                this.f5875e = a0VarTrack;
                String str = y.f44830a;
                a0VarTrack.b(mVar2.f5327c);
                break;
            default:
                a0 a0VarTrack2 = mVar.track(i10, 2);
                this.f5875e = a0VarTrack2;
                a0VarTrack2.b(mVar2.f5327c);
                break;
        }
    }

    @Override // c2.i
    public final void b(q qVar, long j10, int i10, boolean z10) throws e0 {
        int i11;
        int i12;
        int i13 = this.f5871a;
        q qVar2 = this.f5872b;
        switch (i13) {
            case 0:
                try {
                    int i14 = qVar.f44813a[0] & 31;
                    this.f5875e.getClass();
                    if (i14 != 28) {
                        this.f5881k = false;
                        this.f5879i = 0;
                    }
                    if (i14 > 0 && i14 < 24) {
                        int iA = qVar.a();
                        this.f5879i = f() + this.f5879i;
                        this.f5875e.g(iA, qVar);
                        this.f5879i += iA;
                        this.f5876f = (qVar.f44813a[0] & 31) == 5 ? 1 : 0;
                    } else if (i14 == 24) {
                        qVar.z();
                        while (qVar.a() > 4) {
                            int iG = qVar.G();
                            this.f5879i = f() + this.f5879i;
                            this.f5875e.g(iG, qVar);
                            this.f5879i += iG;
                        }
                        this.f5876f = 0;
                    } else {
                        if (i14 != 28) {
                            throw e0.b(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i14)), null);
                        }
                        byte[] bArr = qVar.f44813a;
                        byte b10 = bArr[0];
                        byte b11 = bArr[1];
                        int i15 = (b10 & 224) | (b11 & 31);
                        boolean z11 = (b11 & 128) > 0;
                        boolean z12 = (b11 & 64) > 0;
                        if (z11) {
                            i12 = 0;
                            this.f5881k = false;
                            this.f5879i = 0;
                            this.f5879i = f();
                            byte[] bArr2 = qVar.f44813a;
                            i11 = 1;
                            bArr2[1] = (byte) i15;
                            qVar2.getClass();
                            qVar2.K(bArr2, bArr2.length);
                            qVar2.M(1);
                        } else {
                            i11 = 1;
                            i12 = 0;
                            if (!this.f5881k) {
                                int iA2 = b2.i.a(this.f5878h);
                                if (i10 != iA2) {
                                    this.f5881k = true;
                                    String str = y.f44830a;
                                    Locale locale = Locale.US;
                                    l1.a.s("RtpH264Reader", l1.d.f("Received RTP packet with unexpected sequence number. Expected: ", iA2, "; received: ", i10, ". Dropping packet."));
                                } else {
                                    byte[] bArr3 = qVar.f44813a;
                                    qVar2.getClass();
                                    qVar2.K(bArr3, bArr3.length);
                                    qVar2.M(2);
                                }
                            }
                        }
                        int iA3 = qVar2.a();
                        this.f5875e.g(iA3, qVar2);
                        this.f5879i += iA3;
                        if (z12) {
                            if ((i15 & 31) == 5) {
                                i12 = i11;
                            }
                            this.f5876f = i12;
                        }
                    }
                    if (this.f5877g == C.TIME_UNSET) {
                        this.f5877g = j10;
                    }
                    if (z10 && !this.f5881k) {
                        this.f5875e.a(r9.b.B(90000, this.f5880j, j10, this.f5877g), this.f5876f, this.f5879i, 0, null);
                    }
                    this.f5878h = i10;
                    return;
                } catch (IndexOutOfBoundsException e10) {
                    throw e0.b(null, e10);
                }
            default:
                byte[] bArr4 = qVar.f44813a;
                if (bArr4.length == 0) {
                    throw e0.b("Empty RTP data packet.", null);
                }
                int i16 = (bArr4[0] >> 1) & 63;
                this.f5875e.getClass();
                if (i16 != 49) {
                    this.f5881k = false;
                    this.f5879i = 0;
                }
                if (i16 >= 0 && i16 < 48) {
                    int iA4 = qVar.a();
                    this.f5879i = g() + this.f5879i;
                    this.f5875e.g(iA4, qVar);
                    this.f5879i += iA4;
                    int i17 = (qVar.f44813a[0] >> 1) & 63;
                    this.f5876f = (i17 == 19 || i17 == 20) ? 1 : 0;
                } else if (i16 == 48) {
                    qVar.M(2);
                    int i18 = 0;
                    while (qVar.a() > 2) {
                        int iG2 = qVar.G();
                        int i19 = (qVar.f44813a[qVar.f44814b] & 126) >> 1;
                        if (qVar.a() < iG2) {
                            throw e0.b("Malformed Aggregation Packet. NAL unit size exceeds packet size.", null);
                        }
                        this.f5879i = g() + this.f5879i;
                        this.f5875e.g(iG2, qVar);
                        this.f5879i += iG2;
                        this.f5876f |= (i19 == 19 || i19 == 20) ? 1 : 0;
                        i18++;
                    }
                    if (qVar.a() > 0) {
                        throw e0.b("Malformed Aggregation Packet. Packet size exceeds NAL unit size.", null);
                    }
                    if (i18 < 2) {
                        throw e0.b("Aggregation Packet must contain at least 2 NAL units.", null);
                    }
                } else {
                    if (i16 != 49) {
                        throw e0.b(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i16)), null);
                    }
                    byte[] bArr5 = qVar.f44813a;
                    if (bArr5.length < 3) {
                        throw e0.b("Malformed FU header.", null);
                    }
                    int i20 = bArr5[1] & 7;
                    byte b12 = bArr5[2];
                    int i21 = b12 & Utf8.REPLACEMENT_BYTE;
                    boolean z13 = (b12 & 128) > 0;
                    boolean z14 = (b12 & 64) > 0;
                    if (z13) {
                        this.f5881k = false;
                        this.f5879i = 0;
                        this.f5879i = g();
                        byte[] bArr6 = (byte[]) qVar.f44813a.clone();
                        qVar2.getClass();
                        qVar2.K(bArr6, bArr6.length);
                        byte[] bArr7 = qVar2.f44813a;
                        bArr7[1] = (byte) ((i21 << 1) & 127);
                        bArr7[2] = (byte) i20;
                        qVar2.M(1);
                    } else if (!this.f5881k) {
                        int i22 = (this.f5878h + 1) % Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                        if (i10 != i22) {
                            this.f5881k = true;
                            String str2 = y.f44830a;
                            Locale locale2 = Locale.US;
                            l1.a.s("RtpH265Reader", l1.d.f("Received RTP packet with unexpected sequence number. Expected: ", i22, "; received: ", i10, ". Dropping packet."));
                        } else {
                            qVar2.getClass();
                            qVar2.K(bArr5, bArr5.length);
                            qVar2.M(3);
                        }
                    }
                    int iA5 = qVar2.a();
                    this.f5875e.g(iA5, qVar2);
                    this.f5879i += iA5;
                    if (z14) {
                        this.f5876f = (i21 == 19 || i21 == 20) ? 1 : 0;
                    }
                }
                if (this.f5877g == C.TIME_UNSET) {
                    this.f5877g = j10;
                }
                if (z10 && !this.f5881k) {
                    this.f5875e.a(r9.b.B(90000, this.f5880j, j10, this.f5877g), this.f5876f, this.f5879i, 0, null);
                }
                this.f5878h = i10;
                return;
        }
    }

    @Override // c2.i
    public final void c(long j10) {
        int i10 = this.f5871a;
    }

    public int f() {
        q qVar = this.f5873c;
        qVar.M(0);
        int iA = qVar.a();
        a0 a0Var = this.f5875e;
        a0Var.getClass();
        a0Var.g(iA, qVar);
        return iA;
    }

    public int g() {
        q qVar = this.f5873c;
        qVar.M(0);
        int iA = qVar.a();
        a0 a0Var = this.f5875e;
        a0Var.getClass();
        a0Var.g(iA, qVar);
        return iA;
    }

    @Override // c2.i
    public final void seek(long j10, long j11) {
        switch (this.f5871a) {
            case 0:
                this.f5877g = j10;
                this.f5879i = 0;
                this.f5880j = j11;
                break;
            default:
                this.f5877g = j10;
                this.f5879i = 0;
                this.f5880j = j11;
                break;
        }
    }

    private final void d(long j10) {
    }

    private final void e(long j10) {
    }
}
