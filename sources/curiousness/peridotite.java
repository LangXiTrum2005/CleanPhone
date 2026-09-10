package curiousness;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: LegacyKmsEnvelopeAeadKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class peridotite extends saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final mathsort f24446attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    @Nullable
    public final Integer f24447dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.attabal f24448saneness;

    public peridotite(mathsort mathsortVar, ebullioscopic.attabal attabalVar, @Nullable Integer num) {
        this.f24446attabal = mathsortVar;
        this.f24448saneness = attabalVar;
        this.f24447dern = num;
    }

    public static peridotite wireman(mathsort mathsortVar, @Nullable Integer num) throws GeneralSecurityException {
        ebullioscopic.attabal attabalVarSaneness;
        if (mathsortVar.marial() == mathsort.wireman.f24435saneness) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            attabalVarSaneness = hobby.trm.f27847attabal;
        } else {
            if (mathsortVar.marial() != mathsort.wireman.f24434attabal) {
                throw new GeneralSecurityException("Unknown Variant: " + mathsortVar.marial());
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            attabalVarSaneness = hobby.trm.saneness(num.intValue());
        }
        return new peridotite(mathsortVar, attabalVarSaneness, num);
    }

    @Override // discernable.impromptu
    public Integer attabal() {
        return this.f24447dern;
    }

    @Override // curiousness.saneness
    public ebullioscopic.attabal dern() {
        return this.f24448saneness;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public mathsort saneness() {
        return this.f24446attabal;
    }
}
