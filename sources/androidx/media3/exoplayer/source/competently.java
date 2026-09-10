package androidx.media3.exoplayer.source;

import ethene.yemenite;

/* JADX INFO: compiled from: ExternallyLoadedMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class competently extends androidx.media3.exoplayer.source.attabal {

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public androidx.media3.common.adultoid f12469cutely;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final marial f12470impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final long f12471taiyuan;

    @Override // androidx.media3.exoplayer.source.formularize
    public void beachfront(apical apicalVar) {
        ((beachfront) apicalVar).taiyuan();
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public synchronized androidx.media3.common.adultoid dern() {
        return this.f12469cutely;
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public synchronized void impromptu(androidx.media3.common.adultoid adultoidVar) {
        this.f12469cutely = adultoidVar;
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public apical kowloon(formularize.saneness sanenessVar, polyfoil.saneness sanenessVar2, long j) {
        androidx.media3.common.adultoid adultoidVarDern = dern();
        decarock.attabal.marial(adultoidVarDern.f10619saneness);
        decarock.attabal.beachfront(adultoidVarDern.f10619saneness.f10712saneness, "Externally loaded mediaItems require a MIME type.");
        androidx.media3.common.adultoid.impromptu impromptuVar = adultoidVarDern.f10619saneness;
        return new beachfront(impromptuVar.f10706attabal, impromptuVar.f10712saneness, this.f12470impromptu);
    }

    @Override // androidx.media3.exoplayer.source.attabal
    public void rotuma(vir.arytenoidectomy arytenoidectomyVar) {
        preprohormone(new yemenite(this.f12471taiyuan, true, false, false, null, dern()));
    }

    public competently(androidx.media3.common.adultoid adultoidVar, long j, marial marialVar) {
        this.f12469cutely = adultoidVar;
        this.f12471taiyuan = j;
        this.f12470impromptu = marialVar;
    }

    @Override // androidx.media3.exoplayer.source.attabal
    public void cord() {
    }

    @Override // androidx.media3.exoplayer.source.formularize
    public void maybeThrowSourceInfoRefreshError() {
    }

    /* JADX INFO: compiled from: ExternallyLoadedMediaSource.java */
    public static final class saneness implements formularize.attabal {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long f12472dern;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final marial f12473wireman;

        public saneness(long j, marial marialVar) {
            this.f12472dern = j;
            this.f12473wireman = marialVar;
        }

        @Override // androidx.media3.exoplayer.source.formularize.attabal
        /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
        public competently saneness(androidx.media3.common.adultoid adultoidVar) {
            return new competently(adultoidVar, this.f12472dern, this.f12473wireman);
        }

        @Override // androidx.media3.exoplayer.source.formularize.attabal
        public formularize.attabal marial(androidx.media3.exoplayer.upstream.saneness sanenessVar) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.formularize.attabal
        public formularize.attabal wireman(puffin.monoploid monoploidVar) {
            return this;
        }
    }
}
