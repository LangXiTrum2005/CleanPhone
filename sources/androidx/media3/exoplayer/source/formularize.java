package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.oilcan;
import com.ironsource.mediationsdk.logger.IronSourceError;
import incorrectly.ctenidium;
import java.io.IOException;

/* JADX INFO: compiled from: MediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public interface formularize {

    /* JADX INFO: compiled from: MediaSource.java */
    public interface dern {
        void attabal(formularize formularizeVar, oilcan oilcanVar);
    }

    /* JADX INFO: compiled from: MediaSource.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Object f12518attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f12519dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int f12520marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f12521saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final long f12522wireman;

        public saneness(Object obj) {
            this(obj, -1L);
        }

        public saneness attabal(Object obj) {
            return this.f12518attabal.equals(obj) ? this : new saneness(obj, this.f12521saneness, this.f12519dern, this.f12522wireman, this.f12520marial);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof saneness)) {
                return false;
            }
            saneness sanenessVar = (saneness) obj;
            return this.f12518attabal.equals(sanenessVar.f12518attabal) && this.f12521saneness == sanenessVar.f12521saneness && this.f12519dern == sanenessVar.f12519dern && this.f12522wireman == sanenessVar.f12522wireman && this.f12520marial == sanenessVar.f12520marial;
        }

        public int hashCode() {
            return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12518attabal.hashCode()) * 31) + this.f12521saneness) * 31) + this.f12519dern) * 31) + ((int) this.f12522wireman)) * 31) + this.f12520marial;
        }

        public boolean saneness() {
            return this.f12521saneness != -1;
        }

        public saneness(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public saneness(Object obj, long j, int i) {
            this(obj, -1, -1, j, i);
        }

        public saneness(Object obj, int i, int i2, long j) {
            this(obj, i, i2, j, -1);
        }

        public saneness(Object obj, int i, int i2, long j, int i3) {
            this.f12518attabal = obj;
            this.f12521saneness = i;
            this.f12519dern = i2;
            this.f12522wireman = j;
            this.f12520marial = i3;
        }
    }

    void attabal(Handler handler, impassible impassibleVar);

    void beachfront(apical apicalVar);

    void competently(dern dernVar);

    void cutely(dern dernVar);

    androidx.media3.common.adultoid dern();

    default boolean formularize() {
        return true;
    }

    default oilcan impassible() {
        return null;
    }

    apical kowloon(saneness sanenessVar, polyfoil.saneness sanenessVar2, long j);

    void marial(androidx.media3.exoplayer.drm.saneness sanenessVar);

    void maybeThrowSourceInfoRefreshError() throws IOException;

    void saneness(impassible impassibleVar);

    void taiyuan(dern dernVar);

    void triweekly(dern dernVar, vir.arytenoidectomy arytenoidectomyVar, ctenidium ctenidiumVar);

    void wireman(Handler handler, androidx.media3.exoplayer.drm.saneness sanenessVar);

    /* JADX INFO: compiled from: MediaSource.java */
    public interface attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f12517attabal = triweekly.f12716saneness;

        attabal marial(androidx.media3.exoplayer.upstream.saneness sanenessVar);

        formularize saneness(androidx.media3.common.adultoid adultoidVar);

        attabal wireman(puffin.monoploid monoploidVar);

        default attabal attabal(strother.polloi.attabal attabalVar) {
            return this;
        }

        @Deprecated
        default attabal beachfront(boolean z) {
            return this;
        }

        default attabal dern(polyfoil.marial marialVar) {
            return this;
        }
    }

    default void impromptu(androidx.media3.common.adultoid adultoidVar) {
    }
}
