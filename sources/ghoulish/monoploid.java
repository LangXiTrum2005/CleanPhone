package ghoulish;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.privatdozent;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.jacoco.core.runtime.AgentOptions;

/* JADX INFO: compiled from: H265Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class monoploid implements impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final sealless f27006attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public privatdozent f27010dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public long f27011formularize;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f27014marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public String f27015saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public attabal f27018wireman;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final boolean[] f27007beachfront = new boolean[3];

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final gintrap f27008competently = new gintrap(32, 128);

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final gintrap f27013impromptu = new gintrap(33, 128);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final gintrap f27016taiyuan = new gintrap(34, 128);

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final gintrap f27009cutely = new gintrap(39, 128);

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final gintrap f27005apical = new gintrap(40, 128);

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public long f27012impassible = C.TIME_UNSET;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final decarock.stratoscope f27017triweekly = new decarock.stratoscope();

    /* JADX INFO: compiled from: H265Reader.java */
    public static final class attabal {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public long f27019apical;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final privatdozent f27020attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public boolean f27021beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public boolean f27022competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public boolean f27023cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f27024dern;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public long f27025formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public boolean f27026impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public boolean f27027impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public long f27028marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public long f27029saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public boolean f27030taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f27031wireman;

        public attabal(privatdozent privatdozentVar) {
            this.f27020attabal = privatdozentVar;
        }

        public static boolean dern(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        public static boolean wireman(int i) {
            return i < 32 || i == 40;
        }

        public void attabal(long j) {
            this.f27026impassible = this.f27024dern;
            marial((int) (j - this.f27029saneness));
            this.f27019apical = this.f27029saneness;
            this.f27029saneness = j;
            marial(0);
            this.f27030taiyuan = false;
        }

        public void beachfront(byte[] bArr, int i, int i2) {
            if (this.f27021beachfront) {
                int i3 = this.f27031wireman;
                int i4 = (i + 2) - i3;
                if (i4 >= i2) {
                    this.f27031wireman = i3 + (i2 - i);
                } else {
                    this.f27022competently = (bArr[i4] & 128) != 0;
                    this.f27021beachfront = false;
                }
            }
        }

        public void competently() {
            this.f27021beachfront = false;
            this.f27022competently = false;
            this.f27027impromptu = false;
            this.f27030taiyuan = false;
            this.f27023cutely = false;
        }

        public void impromptu(long j, int i, int i2, long j2, boolean z) {
            this.f27022competently = false;
            this.f27027impromptu = false;
            this.f27028marial = j2;
            this.f27031wireman = 0;
            this.f27029saneness = j;
            if (!wireman(i2)) {
                if (this.f27030taiyuan && !this.f27023cutely) {
                    if (z) {
                        marial(i);
                    }
                    this.f27030taiyuan = false;
                }
                if (dern(i2)) {
                    this.f27027impromptu = !this.f27023cutely;
                    this.f27023cutely = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.f27024dern = z2;
            this.f27021beachfront = z2 || i2 <= 9;
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
        public final void marial(int i) {
            long j = this.f27025formularize;
            if (j == C.TIME_UNSET) {
                return;
            }
            boolean z = this.f27026impassible;
            this.f27020attabal.wireman(j, z ? 1 : 0, (int) (this.f27029saneness - this.f27019apical), i, null);
        }

        public void saneness(long j, int i, boolean z) {
            if (this.f27023cutely && this.f27022competently) {
                this.f27026impassible = this.f27024dern;
                this.f27023cutely = false;
            } else if (this.f27027impromptu || this.f27022competently) {
                if (z && this.f27030taiyuan) {
                    marial(i + ((int) (j - this.f27029saneness)));
                }
                this.f27019apical = this.f27029saneness;
                this.f27025formularize = this.f27028marial;
                this.f27026impassible = this.f27024dern;
                this.f27030taiyuan = true;
            }
        }
    }

    public monoploid(sealless seallessVar) {
        this.f27006attabal = seallessVar;
    }

    @RequiresNonNull({AgentOptions.OUTPUT, "sampleReader"})
    private void beachfront(long j, int i, int i2, long j2) {
        this.f27018wireman.saneness(j, i, this.f27014marial);
        if (!this.f27014marial) {
            this.f27008competently.saneness(i2);
            this.f27013impromptu.saneness(i2);
            this.f27016taiyuan.saneness(i2);
            if (this.f27008competently.dern() && this.f27013impromptu.dern() && this.f27016taiyuan.dern()) {
                this.f27010dern.dern(impromptu(this.f27015saneness, this.f27008competently, this.f27013impromptu, this.f27016taiyuan));
                this.f27014marial = true;
            }
        }
        if (this.f27009cutely.saneness(i2)) {
            gintrap gintrapVar = this.f27009cutely;
            this.f27017triweekly.walach(this.f27009cutely.f26891wireman, tailoring.attabal.polloi(gintrapVar.f26891wireman, gintrapVar.f26889marial));
            this.f27017triweekly.splinterproof(5);
            this.f27006attabal.attabal(j2, this.f27017triweekly);
        }
        if (this.f27005apical.saneness(i2)) {
            gintrap gintrapVar2 = this.f27005apical;
            this.f27017triweekly.walach(this.f27005apical.f26891wireman, tailoring.attabal.polloi(gintrapVar2.f26891wireman, gintrapVar2.f26889marial));
            this.f27017triweekly.splinterproof(5);
            this.f27006attabal.attabal(j2, this.f27017triweekly);
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void competently(byte[] bArr, int i, int i2) {
        this.f27018wireman.beachfront(bArr, i, i2);
        if (!this.f27014marial) {
            this.f27008competently.attabal(bArr, i, i2);
            this.f27013impromptu.attabal(bArr, i, i2);
            this.f27016taiyuan.attabal(bArr, i, i2);
        }
        this.f27009cutely.attabal(bArr, i, i2);
        this.f27005apical.attabal(bArr, i, i2);
    }

    public static androidx.media3.common.polloi impromptu(String str, gintrap gintrapVar, gintrap gintrapVar2, gintrap gintrapVar3) {
        int i = gintrapVar.f26889marial;
        byte[] bArr = new byte[gintrapVar2.f26889marial + i + gintrapVar3.f26889marial];
        System.arraycopy(gintrapVar.f26891wireman, 0, bArr, 0, i);
        System.arraycopy(gintrapVar2.f26891wireman, 0, bArr, gintrapVar.f26889marial, gintrapVar2.f26889marial);
        System.arraycopy(gintrapVar3.f26891wireman, 0, bArr, gintrapVar.f26889marial + gintrapVar2.f26889marial, gintrapVar3.f26889marial);
        tailoring.attabal.C0805attabal c0805attabalImpromptu = tailoring.attabal.impromptu(gintrapVar2.f26891wireman, 3, gintrapVar2.f26889marial);
        return new androidx.media3.common.polloi.saneness().cultivated(str).sensatory("video/hevc").privatdozent(decarock.marial.dern(c0805attabalImpromptu.f38554attabal, c0805attabalImpromptu.f38565saneness, c0805attabalImpromptu.f38558dern, c0805attabalImpromptu.f38568wireman, c0805attabalImpromptu.f38561impromptu, c0805attabalImpromptu.f38566taiyuan)).palmyra(c0805attabalImpromptu.f38552apical).dent(c0805attabalImpromptu.f38559formularize).creditor(new androidx.media3.common.impromptu.saneness().wireman(c0805attabalImpromptu.f38562kowloon).dern(c0805attabalImpromptu.f38553arytenoidectomy).marial(c0805attabalImpromptu.f38564monoploid).competently(c0805attabalImpromptu.f38555beachfront + 8).saneness(c0805attabalImpromptu.f38556competently + 8).attabal()).sayid(c0805attabalImpromptu.f38560impassible).coffeecake(c0805attabalImpromptu.f38567triweekly).premeiotic(Collections.singletonList(bArr)).polder();
    }

    @EnsuresNonNull({AgentOptions.OUTPUT, "sampleReader"})
    private void marial() {
        decarock.attabal.taiyuan(this.f27010dern);
        decarock.grimness.impromptu(this.f27018wireman);
    }

    @Override // ghoulish.impassible
    public void attabal(decarock.stratoscope stratoscopeVar) {
        marial();
        while (stratoscopeVar.attabal() > 0) {
            int iBeachfront = stratoscopeVar.beachfront();
            int iCompetently = stratoscopeVar.competently();
            byte[] bArrMarial = stratoscopeVar.marial();
            this.f27011formularize += (long) stratoscopeVar.attabal();
            this.f27010dern.saneness(stratoscopeVar, stratoscopeVar.attabal());
            while (iBeachfront < iCompetently) {
                int iDern = tailoring.attabal.dern(bArrMarial, iBeachfront, iCompetently, this.f27007beachfront);
                if (iDern == iCompetently) {
                    competently(bArrMarial, iBeachfront, iCompetently);
                    return;
                }
                int iMarial = tailoring.attabal.marial(bArrMarial, iDern);
                int i = iDern - iBeachfront;
                if (i > 0) {
                    competently(bArrMarial, iBeachfront, iDern);
                }
                int i2 = iCompetently - iDern;
                long j = this.f27011formularize - ((long) i2);
                beachfront(j, i2, i < 0 ? -i : 0, this.f27012impassible);
                taiyuan(j, i2, iMarial, this.f27012impassible);
                iBeachfront = iDern + 3;
            }
        }
    }

    @Override // ghoulish.impassible
    public void dern(boolean z) {
        marial();
        if (z) {
            this.f27018wireman.attabal(this.f27011formularize);
        }
    }

    @Override // ghoulish.impassible
    public void saneness(cybernatic.polloi polloiVar, polder.wireman wiremanVar) {
        wiremanVar.attabal();
        this.f27015saneness = wiremanVar.saneness();
        privatdozent privatdozentVarTrack = polloiVar.track(wiremanVar.dern(), 2);
        this.f27010dern = privatdozentVarTrack;
        this.f27018wireman = new attabal(privatdozentVarTrack);
        this.f27006attabal.saneness(polloiVar, wiremanVar);
    }

    @Override // ghoulish.impassible
    public void seek() {
        this.f27011formularize = 0L;
        this.f27012impassible = C.TIME_UNSET;
        tailoring.attabal.attabal(this.f27007beachfront);
        this.f27008competently.wireman();
        this.f27013impromptu.wireman();
        this.f27016taiyuan.wireman();
        this.f27009cutely.wireman();
        this.f27005apical.wireman();
        attabal attabalVar = this.f27018wireman;
        if (attabalVar != null) {
            attabalVar.competently();
        }
    }

    @RequiresNonNull({"sampleReader"})
    public final void taiyuan(long j, int i, int i2, long j2) {
        this.f27018wireman.impromptu(j, i, i2, j2, this.f27014marial);
        if (!this.f27014marial) {
            this.f27008competently.marial(i2);
            this.f27013impromptu.marial(i2);
            this.f27016taiyuan.marial(i2);
        }
        this.f27009cutely.marial(i2);
        this.f27005apical.marial(i2);
    }

    @Override // ghoulish.impassible
    public void wireman(long j, int i) {
        this.f27012impassible = j;
    }
}
