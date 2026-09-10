package androidx.work;

/* JADX INFO: compiled from: OneTimeWorkRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class formularize extends molybdenite {
    public formularize(attabal attabalVar) {
        super(attabalVar.f14203saneness, attabalVar.f14201dern, attabalVar.f14204wireman);
    }

    public static formularize wireman(Class<? extends ListenableWorker> cls) {
        return new attabal(cls).saneness();
    }

    /* JADX INFO: compiled from: OneTimeWorkRequest.java */
    public static final class attabal extends molybdenite.attabal<attabal, formularize> {
        public attabal(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f14201dern.f34014wireman = OverwritingInputMerger.class.getName();
        }

        @Override // androidx.work.molybdenite.attabal
        /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
        public formularize dern() {
            if (this.f14200attabal && this.f14201dern.f34002cutely.impromptu()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new formularize(this);
        }

        @Override // androidx.work.molybdenite.attabal
        /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
        public attabal wireman() {
            return this;
        }
    }
}
