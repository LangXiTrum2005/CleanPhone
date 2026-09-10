package androidx.media3.exoplayer;

import incorrectly.ctenidium;

/* JADX INFO: compiled from: LoadControl.java */
/* JADX INFO: loaded from: classes.dex */
public interface czestochowa {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    @Deprecated
    public static final androidx.media3.exoplayer.source.formularize.saneness f11762attabal = new androidx.media3.exoplayer.source.formularize.saneness(new Object());

    /* JADX INFO: compiled from: LoadControl.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ctenidium f11763attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final float f11764beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final boolean f11765competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.formularize.saneness f11766dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final boolean f11767impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final long f11768marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final androidx.media3.common.oilcan f11769saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final long f11770taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final long f11771wireman;

        public attabal(ctenidium ctenidiumVar, androidx.media3.common.oilcan oilcanVar, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, long j, long j2, float f, boolean z, boolean z2, long j3) {
            this.f11763attabal = ctenidiumVar;
            this.f11769saneness = oilcanVar;
            this.f11766dern = sanenessVar;
            this.f11771wireman = j;
            this.f11768marial = j2;
            this.f11764beachfront = f;
            this.f11765competently = z;
            this.f11767impromptu = z2;
            this.f11770taiyuan = j3;
        }
    }

    @Deprecated
    default void apical(homozygous[] homozygousVarArr, ethene.restrictive restrictiveVar, hydromechanics.rotuma[] rotumaVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default boolean attabal(attabal attabalVar) {
        return taiyuan(attabalVar.f11769saneness, attabalVar.f11766dern, attabalVar.f11768marial, attabalVar.f11764beachfront, attabalVar.f11767impromptu, attabalVar.f11770taiyuan);
    }

    default void beachfront(ctenidium ctenidiumVar) {
        onReleased();
    }

    @Deprecated
    default boolean competently(long j, float f, boolean z, long j2) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    default void cutely(ctenidium ctenidiumVar) {
        onStopped();
    }

    default void dern(ctenidium ctenidiumVar) {
        onPrepared();
    }

    @Deprecated
    default boolean formularize(long j, long j2, float f) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    polyfoil.saneness getAllocator();

    @Deprecated
    default long getBackBufferDurationUs() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default void impassible(ctenidium ctenidiumVar, androidx.media3.common.oilcan oilcanVar, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, homozygous[] homozygousVarArr, ethene.restrictive restrictiveVar, hydromechanics.rotuma[] rotumaVarArr) {
        saneness(oilcanVar, sanenessVar, homozygousVarArr, restrictiveVar, rotumaVarArr);
    }

    default boolean impromptu(attabal attabalVar) {
        return formularize(attabalVar.f11771wireman, attabalVar.f11768marial, attabalVar.f11764beachfront);
    }

    default long marial(ctenidium ctenidiumVar) {
        return getBackBufferDurationUs();
    }

    @Deprecated
    default void onPrepared() {
        throw new IllegalStateException("onPrepared not implemented");
    }

    @Deprecated
    default void onReleased() {
        throw new IllegalStateException("onReleased not implemented");
    }

    @Deprecated
    default void onStopped() {
        throw new IllegalStateException("onStopped not implemented");
    }

    @Deprecated
    default boolean retainBackBufferFromKeyframe() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    @Deprecated
    default void saneness(androidx.media3.common.oilcan oilcanVar, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, homozygous[] homozygousVarArr, ethene.restrictive restrictiveVar, hydromechanics.rotuma[] rotumaVarArr) {
        apical(homozygousVarArr, restrictiveVar, rotumaVarArr);
    }

    @Deprecated
    default boolean taiyuan(androidx.media3.common.oilcan oilcanVar, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, long j, float f, boolean z, long j2) {
        return competently(j, f, z, j2);
    }

    default boolean wireman(ctenidium ctenidiumVar) {
        return retainBackBufferFromKeyframe();
    }
}
