package androidx.media3.exoplayer;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: MediaPeriodInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class wostteth {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.formularize.saneness f13003attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final boolean f13004beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f13005competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f13006dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final boolean f13007impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long f13008marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f13009saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final boolean f13010taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f13011wireman;

    public wostteth(androidx.media3.exoplayer.source.formularize.saneness sanenessVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        decarock.attabal.attabal(!z4 || z2);
        decarock.attabal.attabal(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        decarock.attabal.attabal(z5);
        this.f13003attabal = sanenessVar;
        this.f13009saneness = j;
        this.f13006dern = j2;
        this.f13011wireman = j3;
        this.f13008marial = j4;
        this.f13004beachfront = z;
        this.f13005competently = z2;
        this.f13007impromptu = z3;
        this.f13010taiyuan = z4;
    }

    public wostteth attabal(long j) {
        return j == this.f13006dern ? this : new wostteth(this.f13003attabal, this.f13009saneness, j, this.f13011wireman, this.f13008marial, this.f13004beachfront, this.f13005competently, this.f13007impromptu, this.f13010taiyuan);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wostteth.class == obj.getClass()) {
            wostteth wosttethVar = (wostteth) obj;
            if (this.f13009saneness == wosttethVar.f13009saneness && this.f13006dern == wosttethVar.f13006dern && this.f13011wireman == wosttethVar.f13011wireman && this.f13008marial == wosttethVar.f13008marial && this.f13004beachfront == wosttethVar.f13004beachfront && this.f13005competently == wosttethVar.f13005competently && this.f13007impromptu == wosttethVar.f13007impromptu && this.f13010taiyuan == wosttethVar.f13010taiyuan && decarock.grimness.dern(this.f13003attabal, wosttethVar.f13003attabal)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f13003attabal.hashCode()) * 31) + ((int) this.f13009saneness)) * 31) + ((int) this.f13006dern)) * 31) + ((int) this.f13011wireman)) * 31) + ((int) this.f13008marial)) * 31) + (this.f13004beachfront ? 1 : 0)) * 31) + (this.f13005competently ? 1 : 0)) * 31) + (this.f13007impromptu ? 1 : 0)) * 31) + (this.f13010taiyuan ? 1 : 0);
    }

    public wostteth saneness(long j) {
        return j == this.f13009saneness ? this : new wostteth(this.f13003attabal, j, this.f13006dern, this.f13011wireman, this.f13008marial, this.f13004beachfront, this.f13005competently, this.f13007impromptu, this.f13010taiyuan);
    }
}
