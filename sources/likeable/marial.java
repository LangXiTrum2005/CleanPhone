package likeable;

import cybernatic.merc;
import cybernatic.monoploid;
import cybernatic.polder;
import cybernatic.privatdozent;
import decarock.grimness;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: ChunkReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public long[] f33013apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final privatdozent f33014attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f33015beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f33016competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f33017cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f33018dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int[] f33019formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f33020impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f33021marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f33022saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f33023taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f33024wireman;

    public marial(int i, int i2, long j, int i3, privatdozent privatdozentVar) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        decarock.attabal.attabal(z);
        this.f33024wireman = j;
        this.f33021marial = i3;
        this.f33014attabal = privatdozentVar;
        this.f33022saneness = wireman(i, i2 == 2 ? 1667497984 : 1651965952);
        this.f33018dern = i2 == 2 ? wireman(i, 1650720768) : -1;
        this.f33013apical = new long[512];
        this.f33019formularize = new int[512];
    }

    public static int wireman(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    public void apical() {
        this.f33023taiyuan++;
    }

    public void attabal() {
        this.f33020impromptu++;
    }

    public long beachfront() {
        return marial(this.f33020impromptu);
    }

    public long competently() {
        return marial(1);
    }

    public boolean cutely(int i) {
        return this.f33022saneness == i || this.f33018dern == i;
    }

    public void dern() {
        this.f33013apical = Arrays.copyOf(this.f33013apical, this.f33017cutely);
        this.f33019formularize = Arrays.copyOf(this.f33019formularize, this.f33017cutely);
    }

    public boolean formularize() {
        return Arrays.binarySearch(this.f33019formularize, this.f33020impromptu) >= 0;
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
    public boolean impassible(monoploid monoploidVar) throws IOException {
        int i = this.f33016competently;
        int iMarial = i - this.f33014attabal.marial(monoploidVar, i, false);
        this.f33016competently = iMarial;
        boolean z = iMarial == 0;
        if (z) {
            if (this.f33015beachfront > 0) {
                this.f33014attabal.wireman(beachfront(), formularize() ? 1 : 0, this.f33015beachfront, 0, null);
            }
            attabal();
        }
        return z;
    }

    public final polder impromptu(int i) {
        return new polder(((long) this.f33019formularize[i]) * competently(), this.f33013apical[i]);
    }

    public void kowloon(long j) {
        if (this.f33017cutely == 0) {
            this.f33020impromptu = 0;
        } else {
            this.f33020impromptu = this.f33019formularize[grimness.competently(this.f33013apical, j, true, true)];
        }
    }

    public final long marial(int i) {
        return (this.f33024wireman * ((long) i)) / ((long) this.f33021marial);
    }

    public void saneness(long j) {
        if (this.f33017cutely == this.f33019formularize.length) {
            long[] jArr = this.f33013apical;
            this.f33013apical = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f33019formularize;
            this.f33019formularize = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f33013apical;
        int i = this.f33017cutely;
        jArr2[i] = j;
        this.f33019formularize[i] = this.f33023taiyuan;
        this.f33017cutely = i + 1;
    }

    public merc.attabal taiyuan(long j) {
        int iCompetently = (int) (j / competently());
        int iBeachfront = grimness.beachfront(this.f33019formularize, iCompetently, true, true);
        if (this.f33019formularize[iBeachfront] == iCompetently) {
            return new merc.attabal(impromptu(iBeachfront));
        }
        polder polderVarImpromptu = impromptu(iBeachfront);
        int i = iBeachfront + 1;
        return i < this.f33013apical.length ? new merc.attabal(polderVarImpromptu, impromptu(i)) : new merc.attabal(polderVarImpromptu);
    }

    public void triweekly(int i) {
        this.f33015beachfront = i;
        this.f33016competently = i;
    }
}
