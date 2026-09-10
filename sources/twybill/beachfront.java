package twybill;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: compiled from: CachedContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f38997attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final TreeSet<triweekly> f38998dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public cutely f38999marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f39000saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ArrayList<attabal> f39001wireman;

    /* JADX INFO: compiled from: CachedContent.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long f39002attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f39003saneness;

        public attabal(long j, long j2) {
            this.f39002attabal = j;
            this.f39003saneness = j2;
        }

        public boolean attabal(long j, long j2) {
            long j3 = this.f39003saneness;
            if (j3 == -1) {
                return j >= this.f39002attabal;
            }
            if (j2 == -1) {
                return false;
            }
            long j4 = this.f39002attabal;
            return j4 <= j && j + j2 <= j4 + j3;
        }

        public boolean saneness(long j, long j2) {
            long j3 = this.f39002attabal;
            if (j3 > j) {
                return j2 == -1 || j + j2 > j3;
            }
            long j4 = this.f39003saneness;
            return j4 == -1 || j3 + j4 > j;
        }
    }

    public beachfront(int i, String str) {
        this(i, str, cutely.f39022dern);
    }

    public boolean apical(marial marialVar) {
        if (!this.f38998dern.remove(marialVar)) {
            return false;
        }
        File file = marialVar.f39032molybdenite;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public void attabal(triweekly triweeklyVar) {
        this.f38998dern.add(triweeklyVar);
    }

    public TreeSet<triweekly> beachfront() {
        return this.f38998dern;
    }

    public boolean competently() {
        return this.f38998dern.isEmpty();
    }

    public boolean cutely(long j, long j2) {
        for (int i = 0; i < this.f39001wireman.size(); i++) {
            if (this.f39001wireman.get(i).saneness(j, j2)) {
                return false;
            }
        }
        this.f39001wireman.add(new attabal(j, j2));
        return true;
    }

    public long dern(long j, long j2) {
        decarock.attabal.attabal(j >= 0);
        decarock.attabal.attabal(j2 >= 0);
        triweekly triweeklyVarMarial = marial(j, j2);
        if (triweeklyVarMarial.dern()) {
            return -Math.min(triweeklyVarMarial.wireman() ? Long.MAX_VALUE : triweeklyVarMarial.f39033monoploid, j2);
        }
        long j3 = j + j2;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        long jMax = triweeklyVarMarial.f39029arytenoidectomy + triweeklyVarMarial.f39033monoploid;
        if (jMax < j4) {
            for (triweekly triweeklyVar : this.f38998dern.tailSet(triweeklyVarMarial, false)) {
                long j5 = triweeklyVar.f39029arytenoidectomy;
                if (j5 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j5 + triweeklyVar.f39033monoploid);
                if (jMax >= j4) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && beachfront.class == obj.getClass()) {
            beachfront beachfrontVar = (beachfront) obj;
            if (this.f38997attabal == beachfrontVar.f38997attabal && this.f39000saneness.equals(beachfrontVar.f39000saneness) && this.f38998dern.equals(beachfrontVar.f38998dern) && this.f38999marial.equals(beachfrontVar.f38999marial)) {
                return true;
            }
        }
        return false;
    }

    public triweekly formularize(triweekly triweeklyVar, long j, boolean z) {
        long j2;
        decarock.attabal.competently(this.f38998dern.remove(triweeklyVar));
        File file = (File) decarock.attabal.marial(triweeklyVar.f39032molybdenite);
        if (z) {
            j2 = j;
            File fileImpassible = triweekly.impassible((File) decarock.attabal.marial(file.getParentFile()), this.f38997attabal, triweeklyVar.f39029arytenoidectomy, j2);
            if (file.renameTo(fileImpassible)) {
                file = fileImpassible;
            } else {
                decarock.triweekly.impromptu("CachedContent", "Failed to rename " + file + " to " + fileImpassible);
            }
        } else {
            j2 = j;
        }
        triweekly triweeklyVarMarial = triweeklyVar.marial(file, j2);
        this.f38998dern.add(triweeklyVarMarial);
        return triweeklyVarMarial;
    }

    public int hashCode() {
        return (((this.f38997attabal * 31) + this.f39000saneness.hashCode()) * 31) + this.f38999marial.hashCode();
    }

    public void impassible(long j) {
        for (int i = 0; i < this.f39001wireman.size(); i++) {
            if (this.f39001wireman.get(i).f39002attabal == j) {
                this.f39001wireman.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public boolean impromptu(long j, long j2) {
        for (int i = 0; i < this.f39001wireman.size(); i++) {
            if (this.f39001wireman.get(i).attabal(j, j2)) {
                return true;
            }
        }
        return false;
    }

    public triweekly marial(long j, long j2) {
        triweekly triweeklyVarFormularize = triweekly.formularize(this.f39000saneness, j);
        triweekly triweeklyVarFloor = this.f38998dern.floor(triweeklyVarFormularize);
        if (triweeklyVarFloor != null && triweeklyVarFloor.f39029arytenoidectomy + triweeklyVarFloor.f39033monoploid > j) {
            return triweeklyVarFloor;
        }
        triweekly triweeklyVarCeiling = this.f38998dern.ceiling(triweeklyVarFormularize);
        if (triweeklyVarCeiling != null) {
            long j3 = triweeklyVarCeiling.f39029arytenoidectomy - j;
            j2 = j2 == -1 ? j3 : Math.min(j3, j2);
        }
        return triweekly.apical(this.f39000saneness, j, j2);
    }

    public boolean saneness(taiyuan taiyuanVar) {
        cutely cutelyVar = this.f38999marial;
        cutely cutelyVarMarial = cutelyVar.marial(taiyuanVar);
        this.f38999marial = cutelyVarMarial;
        return !cutelyVarMarial.equals(cutelyVar);
    }

    public boolean taiyuan() {
        return this.f39001wireman.isEmpty();
    }

    public cutely wireman() {
        return this.f38999marial;
    }

    public beachfront(int i, String str, cutely cutelyVar) {
        this.f38997attabal = i;
        this.f39000saneness = str;
        this.f38999marial = cutelyVar;
        this.f38998dern = new TreeSet<>();
        this.f39001wireman = new ArrayList<>();
    }
}
