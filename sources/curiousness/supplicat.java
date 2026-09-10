package curiousness;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.proto.KeyData;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: KmsAeadKeyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class supplicat {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final hobby.kattegat<grimness, discernable.attabal> f24479attabal = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: curiousness.sealless
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return supplicat.dern((grimness) impromptuVar);
        }
    }, grimness.class, discernable.attabal.class);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final discernable.taiyuan<discernable.attabal> f24481saneness = hobby.kowloon.marial(wireman(), discernable.attabal.class, KeyData.KeyMaterialType.REMOTE, invest.yemenite.overspeculate());

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.apical<saran> f24480dern = new hobby.apical() { // from class: curiousness.kattegat
        @Override // hobby.apical
        public final discernable.impromptu attabal(discernable.molybdenite molybdeniteVar, Integer num) {
            return supplicat.marial((saran) molybdeniteVar, num);
        }
    };

    public static void beachfront(boolean z) throws GeneralSecurityException {
        if (!TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        walach.competently();
        hobby.cord.saneness().dern(f24479attabal);
        hobby.dovishness.beachfront().saneness(f24480dern, saran.class);
        hobby.formularize.wireman().competently(f24481saneness, z);
    }

    public static discernable.attabal dern(grimness grimnessVar) throws GeneralSecurityException {
        return cloop.polder.saneness(discernable.monoploid.attabal(grimnessVar.saneness().dern()).saneness(grimnessVar.saneness().dern()), grimnessVar.dern());
    }

    public static grimness marial(saran saranVar, @Nullable Integer num) throws GeneralSecurityException {
        return grimness.wireman(saranVar, num);
    }

    public static String wireman() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }
}
