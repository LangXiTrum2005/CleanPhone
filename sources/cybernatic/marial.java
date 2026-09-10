package cybernatic;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: compiled from: BinarySearchSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f24693attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public dern f24694dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final beachfront f24695saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f24696wireman;

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class attabal implements merc {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final wireman f24697attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final long f24698beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final long f24699competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long f24700dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final long f24701marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f24702saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final long f24703wireman;

        public attabal(wireman wiremanVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f24697attabal = wiremanVar;
            this.f24702saneness = j;
            this.f24700dern = j2;
            this.f24703wireman = j3;
            this.f24701marial = j4;
            this.f24698beachfront = j5;
            this.f24699competently = j6;
        }

        @Override // cybernatic.merc
        public long getDurationUs() {
            return this.f24702saneness;
        }

        @Override // cybernatic.merc
        public merc.attabal getSeekPoints(long j) {
            return new merc.attabal(new polder(j, dern.impromptu(this.f24697attabal.attabal(j), this.f24700dern, this.f24703wireman, this.f24701marial, this.f24698beachfront, this.f24699competently)));
        }

        public long impromptu(long j) {
            return this.f24697attabal.attabal(j);
        }

        @Override // cybernatic.merc
        public boolean isSeekable() {
            return true;
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long f24704attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public long f24705beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public long f24706competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long f24707dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public long f24708impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public long f24709marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f24710saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public long f24711wireman;

        public dern(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f24704attabal = j;
            this.f24710saneness = j2;
            this.f24711wireman = j3;
            this.f24709marial = j4;
            this.f24705beachfront = j5;
            this.f24706competently = j6;
            this.f24707dern = j7;
            this.f24708impromptu = impromptu(j2, j3, j4, j5, j6, j7);
        }

        public static long impromptu(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return decarock.grimness.arytenoidectomy(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        public final long apical() {
            return this.f24708impromptu;
        }

        public final void arytenoidectomy(long j, long j2) {
            this.f24711wireman = j;
            this.f24705beachfront = j2;
            triweekly();
        }

        public final long cutely() {
            return this.f24705beachfront;
        }

        public final long formularize() {
            return this.f24704attabal;
        }

        public final long impassible() {
            return this.f24710saneness;
        }

        public final void kowloon(long j, long j2) {
            this.f24709marial = j;
            this.f24706competently = j2;
            triweekly();
        }

        public final long taiyuan() {
            return this.f24706competently;
        }

        public final void triweekly() {
            this.f24708impromptu = impromptu(this.f24710saneness, this.f24711wireman, this.f24709marial, this.f24705beachfront, this.f24706competently, this.f24707dern);
        }
    }

    /* JADX INFO: renamed from: cybernatic.marial$marial, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class C0582marial {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final C0582marial f24712wireman = new C0582marial(-3, C.TIME_UNSET, -1);

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f24713attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long f24714dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f24715saneness;

        public C0582marial(int i, long j, long j2) {
            this.f24713attabal = i;
            this.f24715saneness = j;
            this.f24714dern = j2;
        }

        public static C0582marial beachfront(long j, long j2) {
            return new C0582marial(-2, j, j2);
        }

        public static C0582marial marial(long j) {
            return new C0582marial(0, C.TIME_UNSET, j);
        }

        public static C0582marial wireman(long j, long j2) {
            return new C0582marial(-1, j, j2);
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface wireman {
        long attabal(long j);
    }

    public marial(wireman wiremanVar, beachfront beachfrontVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f24695saneness = beachfrontVar;
        this.f24696wireman = i;
        this.f24693attabal = new attabal(wiremanVar, j, j2, j3, j4, j5, j6);
    }

    public dern attabal(long j) {
        return new dern(j, this.f24693attabal.impromptu(j), this.f24693attabal.f24700dern, this.f24693attabal.f24703wireman, this.f24693attabal.f24701marial, this.f24693attabal.f24698beachfront, this.f24693attabal.f24699competently);
    }

    public final int competently(monoploid monoploidVar, long j, restrictive restrictiveVar) {
        if (j == monoploidVar.getPosition()) {
            return 0;
        }
        restrictiveVar.f24743attabal = j;
        return 1;
    }

    public int dern(monoploid monoploidVar, restrictive restrictiveVar) throws IOException {
        while (true) {
            dern dernVar = (dern) decarock.attabal.taiyuan(this.f24694dern);
            long jCutely = dernVar.cutely();
            long jTaiyuan = dernVar.taiyuan();
            long jApical = dernVar.apical();
            if (jTaiyuan - jCutely <= this.f24696wireman) {
                marial(false, jCutely);
                return competently(monoploidVar, jCutely, restrictiveVar);
            }
            if (!taiyuan(monoploidVar, jApical)) {
                return competently(monoploidVar, jApical, restrictiveVar);
            }
            monoploidVar.resetPeekPosition();
            C0582marial c0582marialAttabal = this.f24695saneness.attabal(monoploidVar, dernVar.impassible());
            int i = c0582marialAttabal.f24713attabal;
            if (i == -3) {
                marial(false, jApical);
                return competently(monoploidVar, jApical, restrictiveVar);
            }
            if (i == -2) {
                dernVar.arytenoidectomy(c0582marialAttabal.f24715saneness, c0582marialAttabal.f24714dern);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    taiyuan(monoploidVar, c0582marialAttabal.f24714dern);
                    marial(true, c0582marialAttabal.f24714dern);
                    return competently(monoploidVar, c0582marialAttabal.f24714dern, restrictiveVar);
                }
                dernVar.kowloon(c0582marialAttabal.f24715saneness, c0582marialAttabal.f24714dern);
            }
        }
    }

    public final void impromptu(long j) {
        dern dernVar = this.f24694dern;
        if (dernVar == null || dernVar.formularize() != j) {
            this.f24694dern = attabal(j);
        }
    }

    public final void marial(boolean z, long j) {
        this.f24694dern = null;
        this.f24695saneness.saneness();
        beachfront(z, j);
    }

    public final merc saneness() {
        return this.f24693attabal;
    }

    public final boolean taiyuan(monoploid monoploidVar, long j) throws IOException {
        long position = j - monoploidVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        monoploidVar.skipFully((int) position);
        return true;
    }

    public final boolean wireman() {
        return this.f24694dern != null;
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface beachfront {
        C0582marial attabal(monoploid monoploidVar, long j) throws IOException;

        default void saneness() {
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class saneness implements wireman {
        @Override // cybernatic.marial.wireman
        public long attabal(long j) {
            return j;
        }
    }

    public void beachfront(boolean z, long j) {
    }
}
