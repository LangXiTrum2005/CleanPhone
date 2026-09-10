package curiousness;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.proto.KeyData;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: ChaCha20Poly1305KeyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class oilcan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final hobby.kattegat<cuirassed, discernable.attabal> f24443attabal = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: curiousness.stratoscope
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return oilcan.saneness((cuirassed) impromptuVar);
        }
    }, cuirassed.class, discernable.attabal.class);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.apical<yemenite> f24445saneness = new hobby.apical() { // from class: curiousness.trm
        @Override // hobby.apical
        public final discernable.impromptu attabal(discernable.molybdenite molybdeniteVar, Integer num) {
            return oilcan.dern((yemenite) molybdeniteVar, num);
        }
    };

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final discernable.taiyuan<discernable.attabal> f24444dern = hobby.kowloon.marial(wireman(), discernable.attabal.class, KeyData.KeyMaterialType.SYMMETRIC, invest.arytenoidectomy.overspeculate());

    public static void beachfront(boolean z) throws GeneralSecurityException {
        if (!TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        cloop.stratoscope.competently();
        hobby.cord.saneness().dern(f24443attabal);
        hobby.dovishness.beachfront().saneness(f24445saneness, yemenite.class);
        hobby.preprohormone.attabal().dern(marial());
        hobby.formularize.wireman().competently(f24444dern, z);
    }

    public static cuirassed dern(yemenite yemeniteVar, @Nullable Integer num) throws GeneralSecurityException {
        return cuirassed.wireman(yemeniteVar.dern(), ebullioscopic.dern.saneness(32), num);
    }

    public static Map<String, discernable.molybdenite> marial() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", yemenite.saneness(yemenite.attabal.f24493attabal));
        map.put("CHACHA20_POLY1305_RAW", yemenite.saneness(yemenite.attabal.f24494dern));
        return Collections.unmodifiableMap(map);
    }

    public static discernable.attabal saneness(cuirassed cuirassedVar) throws GeneralSecurityException {
        return cloop.gintrap.marial() ? cloop.gintrap.saneness(cuirassedVar) : affiche.beachfront.saneness(cuirassedVar);
    }

    public static String wireman() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }
}
