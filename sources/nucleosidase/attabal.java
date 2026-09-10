package nucleosidase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lehua.impassible;

/* JADX INFO: compiled from: ClientMetrics.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final attabal f33964marial = new C0754attabal().saneness();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final marial f33965attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final saneness f33966dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<dern> f33967saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f33968wireman;

    /* JADX INFO: renamed from: nucleosidase.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClientMetrics.java */
    public static final class C0754attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public marial f33969attabal = null;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public List<dern> f33971saneness = new ArrayList();

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public saneness f33970dern = null;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public String f33972wireman = "";

        public C0754attabal attabal(dern dernVar) {
            this.f33971saneness.add(dernVar);
            return this;
        }

        public C0754attabal dern(String str) {
            this.f33972wireman = str;
            return this;
        }

        public C0754attabal marial(marial marialVar) {
            this.f33969attabal = marialVar;
            return this;
        }

        public attabal saneness() {
            return new attabal(this.f33969attabal, Collections.unmodifiableList(this.f33971saneness), this.f33970dern, this.f33972wireman);
        }

        public C0754attabal wireman(saneness sanenessVar) {
            this.f33970dern = sanenessVar;
            return this;
        }
    }

    public attabal(marial marialVar, List<dern> list, saneness sanenessVar, String str) {
        this.f33965attabal = marialVar;
        this.f33967saneness = list;
        this.f33966dern = sanenessVar;
        this.f33968wireman = str;
    }

    public static C0754attabal marial() {
        return new C0754attabal();
    }

    public String attabal() {
        return this.f33968wireman;
    }

    public byte[] beachfront() {
        return impassible.attabal(this);
    }

    public List<dern> dern() {
        return this.f33967saneness;
    }

    public saneness saneness() {
        return this.f33966dern;
    }

    public marial wireman() {
        return this.f33965attabal;
    }
}
