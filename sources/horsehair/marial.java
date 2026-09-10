package horsehair;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.proto.KeyData;
import hobby.cord;
import hobby.kattegat;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesCmacKeyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final hobby.apical<beachfront> f27950attabal = new hobby.apical() { // from class: horsehair.saneness
        @Override // hobby.apical
        public final discernable.impromptu attabal(discernable.molybdenite molybdeniteVar, Integer num) {
            return marial.wireman((beachfront) molybdeniteVar, num);
        }
    };

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final kattegat<attabal, competently> f27952saneness = kattegat.saneness(new kattegat.saneness() { // from class: horsehair.dern
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return marial.marial((attabal) impromptuVar);
        }
    }, attabal.class, competently.class);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final kattegat<attabal, discernable.polloi> f27951dern = kattegat.saneness(new kattegat.saneness() { // from class: horsehair.wireman
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return marial.beachfront((attabal) impromptuVar);
        }
    }, attabal.class, discernable.polloi.class);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final discernable.taiyuan<discernable.polloi> f27953wireman = hobby.kowloon.marial("type.googleapis.com/google.crypto.tink.AesCmacKey", discernable.polloi.class, KeyData.KeyMaterialType.SYMMETRIC, invest.attabal.dent());

    public static discernable.polloi beachfront(attabal attabalVar) throws GeneralSecurityException {
        taiyuan(attabalVar.saneness());
        return affiche.arytenoidectomy.dern(attabalVar);
    }

    public static Map<String, discernable.molybdenite> competently() throws GeneralSecurityException {
        HashMap map = new HashMap();
        beachfront beachfrontVar = preprohormone.f27964marial;
        map.put("AES_CMAC", beachfrontVar);
        map.put("AES256_CMAC", beachfrontVar);
        map.put("AES256_CMAC_RAW", beachfront.saneness().saneness(32).dern(16).wireman(beachfront.dern.f27933wireman).attabal());
        return Collections.unmodifiableMap(map);
    }

    public static void impromptu(boolean z) throws GeneralSecurityException {
        if (!TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        ascolichen.marial.impromptu();
        hobby.dovishness.beachfront().saneness(f27950attabal, beachfront.class);
        cord.saneness().dern(f27952saneness);
        cord.saneness().dern(f27951dern);
        hobby.preprohormone.attabal().dern(competently());
        hobby.formularize.wireman().competently(f27953wireman, z);
    }

    public static competently marial(attabal attabalVar) throws GeneralSecurityException {
        taiyuan(attabalVar.saneness());
        return ascolichen.impromptu.attabal(attabalVar);
    }

    public static void taiyuan(beachfront beachfrontVar) throws GeneralSecurityException {
        if (beachfrontVar.wireman() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public static attabal wireman(beachfront beachfrontVar, @Nullable Integer num) throws GeneralSecurityException {
        taiyuan(beachfrontVar);
        return attabal.wireman().marial(beachfrontVar).dern(ebullioscopic.dern.saneness(beachfrontVar.wireman())).wireman(num).attabal();
    }
}
