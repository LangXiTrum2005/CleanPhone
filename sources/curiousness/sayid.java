package curiousness;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: XAesGcmKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sayid extends saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final sensatory f24468attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ebullioscopic.attabal f24469dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.dern f24470saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    @Nullable
    public final Integer f24471wireman;

    public sayid(sensatory sensatoryVar, ebullioscopic.dern dernVar, ebullioscopic.attabal attabalVar, @Nullable Integer num) {
        this.f24468attabal = sensatoryVar;
        this.f24470saneness = dernVar;
        this.f24469dern = attabalVar;
        this.f24471wireman = num;
    }

    public static ebullioscopic.attabal beachfront(sensatory sensatoryVar, @Nullable Integer num) {
        if (sensatoryVar.wireman() == sensatory.attabal.f24478saneness) {
            return hobby.trm.f27847attabal;
        }
        if (sensatoryVar.wireman() == sensatory.attabal.f24477attabal) {
            return hobby.trm.saneness(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + sensatoryVar.wireman());
    }

    public static sayid wireman(sensatory sensatoryVar, ebullioscopic.dern dernVar, @Nullable Integer num) throws GeneralSecurityException {
        sensatory.attabal attabalVarWireman = sensatoryVar.wireman();
        sensatory.attabal attabalVar = sensatory.attabal.f24478saneness;
        if (attabalVarWireman != attabalVar && num == null) {
            throw new GeneralSecurityException("For given Variant " + sensatoryVar.wireman() + " the value of idRequirement must be non-null");
        }
        if (sensatoryVar.wireman() == attabalVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (dernVar.dern() == 32) {
            return new sayid(sensatoryVar, dernVar, beachfront(sensatoryVar, num), num);
        }
        throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + dernVar.dern());
    }

    @Override // discernable.impromptu
    @Nullable
    public Integer attabal() {
        return this.f24471wireman;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public sensatory saneness() {
        return this.f24468attabal;
    }

    @Override // curiousness.saneness
    public ebullioscopic.attabal dern() {
        return this.f24469dern;
    }

    public ebullioscopic.dern marial() {
        return this.f24470saneness;
    }
}
