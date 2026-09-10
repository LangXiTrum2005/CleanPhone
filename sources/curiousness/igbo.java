package curiousness;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.proto.KeyData;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: XChaCha20Poly1305KeyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class igbo {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final hobby.kattegat<underbelly, discernable.attabal> f24393attabal = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: curiousness.preterite
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return igbo.saneness((underbelly) impromptuVar);
        }
    }, underbelly.class, discernable.attabal.class);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final discernable.taiyuan<discernable.attabal> f24395saneness = hobby.kowloon.marial(wireman(), discernable.attabal.class, KeyData.KeyMaterialType.SYMMETRIC, invest.mathsort.overspeculate());

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.gintrap.attabal<gusty> f24394dern = new impromptu();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final hobby.apical<gusty> f24396wireman = new hobby.apical() { // from class: curiousness.wostteth
        @Override // hobby.apical
        public final discernable.impromptu attabal(discernable.molybdenite molybdeniteVar, Integer num) {
            return igbo.dern((gusty) molybdeniteVar, num);
        }
    };

    public static void beachfront(boolean z) throws GeneralSecurityException {
        if (!TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        cloop.clubfoot.competently();
        hobby.cord.saneness().dern(f24393attabal);
        hobby.preprohormone.attabal().dern(marial());
        hobby.dovishness.beachfront().saneness(f24396wireman, gusty.class);
        hobby.gintrap.saneness().attabal(f24394dern, gusty.class);
        hobby.formularize.wireman().competently(f24395saneness, z);
    }

    public static underbelly dern(gusty gustyVar, @Nullable Integer num) throws GeneralSecurityException {
        return underbelly.wireman(gustyVar.dern(), ebullioscopic.dern.saneness(32), num);
    }

    public static Map<String, discernable.molybdenite> marial() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", gusty.saneness(gusty.attabal.f24390attabal));
        map.put("XCHACHA20_POLY1305_RAW", gusty.saneness(gusty.attabal.f24391dern));
        return Collections.unmodifiableMap(map);
    }

    public static discernable.attabal saneness(underbelly underbellyVar) throws GeneralSecurityException {
        return cloop.walach.wireman() ? cloop.walach.saneness(underbellyVar) : affiche.rotuma.saneness(underbellyVar);
    }

    public static String wireman() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }
}
