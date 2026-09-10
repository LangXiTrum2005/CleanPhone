package androidx.media3.exoplayer;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: DecoderReuseEvaluation.java */
/* JADX INFO: loaded from: classes.dex */
public final class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f11531attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final androidx.media3.common.polloi f11532dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f11533marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final androidx.media3.common.polloi f11534saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f11535wireman;

    public arytenoidectomy(String str, androidx.media3.common.polloi polloiVar, androidx.media3.common.polloi polloiVar2, int i, int i2) {
        decarock.attabal.attabal(i == 0 || i2 == 0);
        this.f11531attabal = decarock.attabal.wireman(str);
        this.f11534saneness = (androidx.media3.common.polloi) decarock.attabal.marial(polloiVar);
        this.f11532dern = (androidx.media3.common.polloi) decarock.attabal.marial(polloiVar2);
        this.f11535wireman = i;
        this.f11533marial = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && arytenoidectomy.class == obj.getClass()) {
            arytenoidectomy arytenoidectomyVar = (arytenoidectomy) obj;
            if (this.f11535wireman == arytenoidectomyVar.f11535wireman && this.f11533marial == arytenoidectomyVar.f11533marial && this.f11531attabal.equals(arytenoidectomyVar.f11531attabal) && this.f11534saneness.equals(arytenoidectomyVar.f11534saneness) && this.f11532dern.equals(arytenoidectomyVar.f11532dern)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f11535wireman) * 31) + this.f11533marial) * 31) + this.f11531attabal.hashCode()) * 31) + this.f11534saneness.hashCode()) * 31) + this.f11532dern.hashCode();
    }
}
