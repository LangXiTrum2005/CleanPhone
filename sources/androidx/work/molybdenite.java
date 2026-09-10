package androidx.work;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: WorkRequest.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public UUID f14197attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Set<String> f14198dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public ocellation.arytenoidectomy f14199saneness;

    /* JADX INFO: compiled from: WorkRequest.java */
    public static abstract class attabal<B extends attabal<?, ?>, W extends molybdenite> {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public ocellation.arytenoidectomy f14201dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public Class<? extends ListenableWorker> f14202marial;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f14200attabal = false;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public Set<String> f14204wireman = new HashSet();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public UUID f14203saneness = UUID.randomUUID();

        public attabal(Class<? extends ListenableWorker> cls) {
            this.f14202marial = cls;
            this.f14201dern = new ocellation.arytenoidectomy(this.f14203saneness.toString(), cls.getName());
            attabal(cls.getName());
        }

        public final B attabal(String str) {
            this.f14204wireman.add(str);
            return (B) wireman();
        }

        public final B beachfront(wireman wiremanVar) {
            this.f14201dern.f34008marial = wiremanVar;
            return (B) wireman();
        }

        public abstract W dern();

        public final B marial(saneness sanenessVar) {
            this.f14201dern.f34002cutely = sanenessVar;
            return (B) wireman();
        }

        public final W saneness() {
            W w = (W) dern();
            saneness sanenessVar = this.f14201dern.f34002cutely;
            boolean z = sanenessVar.marial() || sanenessVar.beachfront() || sanenessVar.competently() || sanenessVar.impromptu();
            if (this.f14201dern.f34009monoploid && z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f14203saneness = UUID.randomUUID();
            ocellation.arytenoidectomy arytenoidectomyVar = new ocellation.arytenoidectomy(this.f14201dern);
            this.f14201dern = arytenoidectomyVar;
            arytenoidectomyVar.f33999attabal = this.f14203saneness.toString();
            return w;
        }

        public abstract B wireman();
    }

    public molybdenite(UUID uuid, ocellation.arytenoidectomy arytenoidectomyVar, Set<String> set) {
        this.f14197attabal = uuid;
        this.f14199saneness = arytenoidectomyVar;
        this.f14198dern = set;
    }

    public String attabal() {
        return this.f14197attabal.toString();
    }

    public ocellation.arytenoidectomy dern() {
        return this.f14199saneness;
    }

    public Set<String> saneness() {
        return this.f14198dern;
    }
}
