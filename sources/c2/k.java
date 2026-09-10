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
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f5909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f5910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5911c = C.TIME_UNSET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5912d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5913e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5914f = C.TIME_UNSET;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5915g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5918j;

    public k(m mVar) {
        this.f5909a = mVar;
    }

    @Override // c2.i
    public final void a(n2.m mVar, int i10) {
        a0 a0VarTrack = mVar.track(i10, 2);
        this.f5910b = a0VarTrack;
        a0VarTrack.b(this.f5909a.f5327c);
    }

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
        this.f5910b.getClass();
        int iZ = qVar.z();
        if ((iZ & 16) == 16 && (iZ & 7) == 0) {
            if (this.f5916h && this.f5913e > 0) {
                a0 a0Var = this.f5910b;
                a0Var.getClass();
                a0Var.a(this.f5914f, this.f5917i ? 1 : 0, this.f5913e, 0, null);
                this.f5913e = -1;
                this.f5914f = C.TIME_UNSET;
                this.f5916h = false;
            }
            this.f5916h = true;
        } else {
            if (!this.f5916h) {
                l1.a.s("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return;
            }
            int iA = b2.i.a(this.f5912d);
            if (i10 < iA) {
                String str = y.f44830a;
                Locale locale = Locale.US;
                l1.a.s("RtpVP8Reader", l1.d.f("Received RTP packet with unexpected sequence number. Expected: ", iA, "; received: ", i10, ". Dropping packet."));
                return;
            }
        }
        if ((iZ & 128) != 0) {
            int iZ2 = qVar.z();
            if ((iZ2 & 128) != 0 && (qVar.z() & 128) != 0) {
                qVar.N(1);
            }
            if ((iZ2 & 64) != 0) {
                qVar.N(1);
            }
            if ((iZ2 & 32) != 0 || (iZ2 & 16) != 0) {
                qVar.N(1);
            }
        }
        if (this.f5913e == -1 && this.f5916h) {
            this.f5917i = (qVar.j() & 1) == 0;
        }
        if (!this.f5918j) {
            int i11 = qVar.f44814b;
            qVar.M(i11 + 6);
            int iS = qVar.s() & 16383;
            int iS2 = qVar.s() & 16383;
            qVar.M(i11);
            p pVar = this.f5909a.f5327c;
            if (iS != pVar.f42650u || iS2 != pVar.f42651v) {
                a0 a0Var2 = this.f5910b;
                o oVarA = pVar.a();
                oVarA.f42607t = iS;
                oVarA.f42608u = iS2;
                q4.a.o(oVarA, a0Var2);
            }
            this.f5918j = true;
        }
        int iA2 = qVar.a();
        this.f5910b.g(iA2, qVar);
        int i12 = this.f5913e;
        if (i12 == -1) {
            this.f5913e = iA2;
        } else {
            this.f5913e = i12 + iA2;
        }
        this.f5914f = r9.b.B(90000, this.f5915g, j10, this.f5911c);
        if (z10) {
            a0 a0Var3 = this.f5910b;
            a0Var3.getClass();
            a0Var3.a(this.f5914f, this.f5917i ? 1 : 0, this.f5913e, 0, null);
            this.f5913e = -1;
            this.f5914f = C.TIME_UNSET;
            this.f5916h = false;
        }
        this.f5912d = i10;
    }

    @Override // c2.i
    public final void c(long j10) {
        go.k.t(this.f5911c == C.TIME_UNSET);
        this.f5911c = j10;
    }

    @Override // c2.i
    public final void seek(long j10, long j11) {
        this.f5911c = j10;
        this.f5913e = -1;
        this.f5915g = j11;
    }
}
