package curiousness;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.proto.KeyData;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: KmsEnvelopeAeadKeyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class seminary {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final discernable.taiyuan<discernable.attabal> f24472attabal = hobby.kowloon.marial(wireman(), discernable.attabal.class, KeyData.KeyMaterialType.SYMMETRIC, invest.kattegat.overspeculate());

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.apical<mathsort> f24474saneness = new hobby.apical() { // from class: curiousness.merc
        @Override // hobby.apical
        public final discernable.impromptu attabal(discernable.molybdenite molybdeniteVar, Integer num) {
            return seminary.marial((mathsort) molybdeniteVar, num);
        }
    };

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.kattegat<peridotite, discernable.attabal> f24473dern = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: curiousness.polder
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return seminary.dern((peridotite) impromptuVar);
        }
    }, peridotite.class, discernable.attabal.class);

    public static void beachfront(boolean z) throws GeneralSecurityException {
        if (!TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        permissivist.impromptu();
        hobby.dovishness.beachfront().saneness(f24474saneness, mathsort.class);
        hobby.cord.saneness().dern(f24473dern);
        hobby.formularize.wireman().competently(f24472attabal, z);
    }

    public static discernable.attabal dern(peridotite peridotiteVar) throws GeneralSecurityException {
        String strWireman = peridotiteVar.saneness().wireman();
        return cloop.polder.saneness(restrictive.saneness(peridotiteVar.saneness().dern(), discernable.monoploid.attabal(strWireman).saneness(strWireman)), peridotiteVar.dern());
    }

    public static peridotite marial(mathsort mathsortVar, @Nullable Integer num) throws GeneralSecurityException {
        return peridotite.wireman(mathsortVar, num);
    }

    public static String wireman() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }
}
