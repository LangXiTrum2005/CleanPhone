package c2;

import b2.m;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.o;
import i1.p;
import java.util.Locale;
import l1.q;
import l1.y;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f5860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f5861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5869k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5870m;

    public d(m mVar, int i10) {
        this.f5859a = i10;
        switch (i10) {
            case 1:
                this.f5860b = mVar;
                this.f5862d = C.TIME_UNSET;
                this.f5865g = -1;
                this.f5866h = C.TIME_UNSET;
                this.f5863e = 0L;
                this.f5864f = -1;
                this.f5867i = -1;
                this.f5868j = -1;
                break;
            default:
                this.f5860b = mVar;
                this.f5862d = C.TIME_UNSET;
                this.f5865g = -1;
                break;
        }
    }

    @Override // c2.i
    public final void a(n2.m mVar, int i10) {
        switch (this.f5859a) {
            case 0:
                a0 a0VarTrack = mVar.track(i10, 2);
                this.f5861c = a0VarTrack;
                a0VarTrack.b(this.f5860b.f5327c);
                break;
            default:
                a0 a0VarTrack2 = mVar.track(i10, 2);
                this.f5861c = a0VarTrack2;
                a0VarTrack2.b(this.f5860b.f5327c);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // c2.i
    public final void b(q qVar, long j10, int i10, boolean z10) {
        int i11;
        int i12;
        int i13 = this.f5859a;
        m mVar = this.f5860b;
        switch (i13) {
            case 0:
                this.f5861c.getClass();
                int i14 = qVar.f44814b;
                int iG = qVar.G();
                byte b10 = (iG & 1024) > 0;
                if ((iG & 512) == 0 && (iG & 504) == 0 && (iG & 7) == 0) {
                    if (b10 == true) {
                        if (this.f5870m && this.f5864f > 0) {
                            a0 a0Var = this.f5861c;
                            a0Var.getClass();
                            a0Var.a(this.f5866h, this.f5869k ? 1 : 0, this.f5864f, 0, null);
                            this.f5864f = 0;
                            this.f5866h = C.TIME_UNSET;
                            this.f5869k = false;
                            this.f5870m = false;
                        }
                        this.f5870m = true;
                        if ((qVar.j() & 252) < 128) {
                            l1.a.s("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                        } else {
                            byte[] bArr = qVar.f44813a;
                            bArr[i14] = 0;
                            bArr[i14 + 1] = 0;
                            qVar.M(i14);
                        }
                    } else if (this.f5870m) {
                        int iA = b2.i.a(this.f5865g);
                        if (i10 < iA) {
                            String str = y.f44830a;
                            Locale locale = Locale.US;
                            l1.a.s("RtpH263Reader", l1.d.f("Received RTP packet with unexpected sequence number. Expected: ", iA, "; received: ", i10, ". Dropping packet."));
                        }
                    } else {
                        l1.a.s("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                    }
                    if (this.f5864f == 0) {
                        boolean z11 = this.l;
                        int i15 = qVar.f44814b;
                        if (((qVar.B() >> 10) & 63) == 32) {
                            int iJ = qVar.j();
                            int i16 = (iJ >> 1) & 1;
                            if (!z11 && i16 == 0) {
                                int i17 = (iJ >> 2) & 7;
                                if (i17 == 1) {
                                    this.f5867i = 128;
                                    this.f5868j = 96;
                                } else {
                                    int i18 = i17 - 2;
                                    this.f5867i = 176 << i18;
                                    this.f5868j = 144 << i18;
                                }
                            }
                            qVar.M(i15);
                            this.f5869k = i16 == 0;
                        } else {
                            qVar.M(i15);
                            this.f5869k = false;
                        }
                        if (!this.l && this.f5869k) {
                            int i19 = this.f5867i;
                            p pVar = mVar.f5327c;
                            if (i19 != pVar.f42650u || this.f5868j != pVar.f42651v) {
                                a0 a0Var2 = this.f5861c;
                                o oVarA = pVar.a();
                                oVarA.f42607t = this.f5867i;
                                oVarA.f42608u = this.f5868j;
                                q4.a.o(oVarA, a0Var2);
                            }
                            this.l = true;
                        }
                    }
                    int iA2 = qVar.a();
                    this.f5861c.g(iA2, qVar);
                    this.f5864f += iA2;
                    this.f5866h = r9.b.B(90000, this.f5863e, j10, this.f5862d);
                    if (z10) {
                        a0 a0Var3 = this.f5861c;
                        a0Var3.getClass();
                        a0Var3.a(this.f5866h, this.f5869k ? 1 : 0, this.f5864f, 0, null);
                        this.f5864f = 0;
                        this.f5866h = C.TIME_UNSET;
                        this.f5869k = false;
                        this.f5870m = false;
                    }
                    this.f5865g = i10;
                } else {
                    l1.a.s("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                }
                break;
            default:
                this.f5861c.getClass();
                int iZ = qVar.z();
                if ((iZ & 8) == 8) {
                    if (this.f5869k && this.f5865g > 0) {
                        a0 a0Var4 = this.f5861c;
                        a0Var4.getClass();
                        a0Var4.a(this.f5866h, this.f5870m ? 1 : 0, this.f5865g, 0, null);
                        this.f5865g = -1;
                        this.f5866h = C.TIME_UNSET;
                        this.f5869k = false;
                    }
                    this.f5869k = true;
                } else if (this.f5869k) {
                    int iA3 = b2.i.a(this.f5864f);
                    if (i10 < iA3) {
                        String str2 = y.f44830a;
                        Locale locale2 = Locale.US;
                        l1.a.s("RtpVp9Reader", l1.d.f("Received RTP packet with unexpected sequence number. Expected: ", iA3, "; received: ", i10, ". Dropping packet."));
                    }
                } else {
                    l1.a.s("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                }
                if ((iZ & 128) == 0 || (qVar.z() & 128) == 0 || qVar.a() >= 1) {
                    int i20 = iZ & 16;
                    go.k.h("VP9 flexible mode is not supported.", i20 == 0);
                    if ((iZ & 32) != 0) {
                        qVar.N(1);
                        if (qVar.a() >= 1) {
                            if (i20 == 0) {
                                qVar.N(1);
                            }
                        }
                    }
                    if ((iZ & 2) != 0) {
                        int iZ2 = qVar.z();
                        int i21 = (iZ2 >> 5) & 7;
                        if ((iZ2 & 16) != 0) {
                            int i22 = i21 + 1;
                            if (qVar.a() >= i22 * 4) {
                                for (int i23 = 0; i23 < i22; i23++) {
                                    this.f5867i = qVar.G();
                                    this.f5868j = qVar.G();
                                }
                            }
                        }
                        if ((iZ2 & 8) != 0) {
                            int iZ3 = qVar.z();
                            if (qVar.a() >= iZ3) {
                                for (int i24 = 0; i24 < iZ3; i24++) {
                                    int iG2 = (qVar.G() & 12) >> 2;
                                    if (qVar.a() >= iG2) {
                                        qVar.N(iG2);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (this.f5865g == -1 && this.f5869k) {
                        this.f5870m = (qVar.j() & 4) == 0;
                    }
                    if (!this.l && (i11 = this.f5867i) != -1 && (i12 = this.f5868j) != -1) {
                        p pVar2 = mVar.f5327c;
                        if (i11 != pVar2.f42650u || i12 != pVar2.f42651v) {
                            a0 a0Var5 = this.f5861c;
                            o oVarA2 = pVar2.a();
                            oVarA2.f42607t = this.f5867i;
                            oVarA2.f42608u = this.f5868j;
                            q4.a.o(oVarA2, a0Var5);
                        }
                        this.l = true;
                    }
                    int iA4 = qVar.a();
                    this.f5861c.g(iA4, qVar);
                    int i25 = this.f5865g;
                    if (i25 == -1) {
                        this.f5865g = iA4;
                    } else {
                        this.f5865g = i25 + iA4;
                    }
                    this.f5866h = r9.b.B(90000, this.f5863e, j10, this.f5862d);
                    if (z10) {
                        a0 a0Var6 = this.f5861c;
                        a0Var6.getClass();
                        a0Var6.a(this.f5866h, this.f5870m ? 1 : 0, this.f5865g, 0, null);
                        this.f5865g = -1;
                        this.f5866h = C.TIME_UNSET;
                        this.f5869k = false;
                    }
                    this.f5864f = i10;
                }
                break;
        }
    }

    @Override // c2.i
    public final void c(long j10) {
        switch (this.f5859a) {
            case 0:
                go.k.t(this.f5862d == C.TIME_UNSET);
                this.f5862d = j10;
                break;
            default:
                go.k.t(this.f5862d == C.TIME_UNSET);
                this.f5862d = j10;
                break;
        }
    }

    @Override // c2.i
    public final void seek(long j10, long j11) {
        switch (this.f5859a) {
            case 0:
                this.f5862d = j10;
                this.f5864f = 0;
                this.f5863e = j11;
                break;
            default:
                this.f5862d = j10;
                this.f5865g = -1;
                this.f5863e = j11;
                break;
        }
    }
}
