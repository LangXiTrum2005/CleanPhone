package curiousness;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.proto.KeyData;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesCtrHmacAeadKeyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final hobby.kattegat<beachfront, discernable.attabal> f24360attabal = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: curiousness.competently
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return affiche.taiyuan.saneness((beachfront) impromptuVar);
        }
    }, beachfront.class, discernable.attabal.class);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final discernable.taiyuan<discernable.attabal> f24363saneness = hobby.kowloon.marial(saneness(), discernable.attabal.class, KeyData.KeyMaterialType.SYMMETRIC, invest.wireman.dent());

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.gintrap.attabal<apical> f24361dern = new impromptu();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final hobby.apical<apical> f24364wireman = new hobby.apical() { // from class: curiousness.taiyuan
        @Override // hobby.apical
        public final discernable.impromptu attabal(discernable.molybdenite molybdeniteVar, Integer num) {
            return cutely.attabal((apical) molybdeniteVar, num);
        }
    };

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f24362marial = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public static beachfront attabal(apical apicalVar, @Nullable Integer num) throws GeneralSecurityException {
        marial(apicalVar);
        return beachfront.wireman().beachfront(apicalVar).marial(num).dern(ebullioscopic.dern.saneness(apicalVar.dern())).wireman(ebullioscopic.dern.saneness(apicalVar.marial())).attabal();
    }

    public static Map<String, discernable.molybdenite> dern() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", lotta.f24408marial);
        apical.saneness sanenessVarMarial = apical.saneness().saneness(16).wireman(32).beachfront(16).marial(16);
        apical.dern dernVar = apical.dern.f24305dern;
        apical.saneness sanenessVarDern = sanenessVarMarial.dern(dernVar);
        apical.wireman wiremanVar = apical.wireman.f24316dern;
        map.put("AES128_CTR_HMAC_SHA256_RAW", sanenessVarDern.competently(wiremanVar).attabal());
        map.put("AES256_CTR_HMAC_SHA256", lotta.f24402beachfront);
        map.put("AES256_CTR_HMAC_SHA256_RAW", apical.saneness().saneness(32).wireman(32).beachfront(32).marial(16).dern(dernVar).competently(wiremanVar).attabal());
        return Collections.unmodifiableMap(map);
    }

    public static void marial(apical apicalVar) throws GeneralSecurityException {
        if (apicalVar.dern() != 16 && apicalVar.dern() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
    }

    public static String saneness() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public static void wireman(boolean z) throws GeneralSecurityException {
        TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = f24362marial;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        cloop.marial.impromptu();
        hobby.cord.saneness().dern(f24360attabal);
        hobby.preprohormone.attabal().dern(dern());
        hobby.gintrap.saneness().attabal(f24361dern, apical.class);
        hobby.dovishness.beachfront().saneness(f24364wireman, apical.class);
        hobby.formularize.wireman().impromptu(f24363saneness, algorithmFipsCompatibility, z);
    }
}
