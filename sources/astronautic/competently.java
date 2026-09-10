package astronautic;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.subtle.EllipticCurves;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: EcdsaSignKeyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final hobby.kattegat<saneness, discernable.adultoid> f14563attabal = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: astronautic.wireman
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return com.google.crypto.tink.subtle.attabal.saneness((saneness) impromptuVar);
        }
    }, saneness.class, discernable.adultoid.class);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.kattegat<dern, discernable.dovishness> f14567saneness = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: astronautic.marial
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return com.google.crypto.tink.subtle.saneness.saneness((dern) impromptuVar);
        }
    }, dern.class, discernable.dovishness.class);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final discernable.graveside<discernable.adultoid> f14565dern = hobby.kowloon.beachfront(dern(), discernable.adultoid.class, invest.graveside.dent());

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final discernable.taiyuan<discernable.dovishness> f14568wireman = hobby.kowloon.marial(impromptu.attabal(), discernable.dovishness.class, KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, invest.adultoid.premeiotic());

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final hobby.apical<attabal> f14566marial = new hobby.apical() { // from class: astronautic.beachfront
        @Override // hobby.apical
        public final discernable.impromptu attabal(discernable.molybdenite molybdeniteVar, Integer num) {
            return competently.saneness((attabal) molybdeniteVar, num);
        }
    };

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f14564beachfront = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public static String dern() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    public static void marial(boolean z) throws GeneralSecurityException {
        TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = f14564beachfront;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        extensively.competently.impassible();
        hobby.preprohormone.attabal().dern(wireman());
        hobby.cord.saneness().dern(f14563attabal);
        hobby.cord.saneness().dern(f14567saneness);
        hobby.dovishness.beachfront().saneness(f14566marial, attabal.class);
        hobby.formularize.wireman().impromptu(f14565dern, algorithmFipsCompatibility, z);
        hobby.formularize.wireman().impromptu(f14568wireman, algorithmFipsCompatibility, false);
    }

    public static saneness saneness(attabal attabalVar, @Nullable Integer num) throws GeneralSecurityException {
        KeyPair keyPairMarial = EllipticCurves.marial(attabalVar.dern().attabal());
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairMarial.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairMarial.getPrivate();
        return saneness.marial().dern(dern.wireman().wireman(attabalVar).dern(num).marial(eCPublicKey.getW()).attabal()).saneness(ebullioscopic.saneness.attabal(eCPrivateKey.getS(), discernable.beachfront.attabal())).attabal();
    }

    public static Map<String, discernable.molybdenite> wireman() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("ECDSA_P256", kattegat.f14599attabal);
        map.put("ECDSA_P256_IEEE_P1363", kattegat.f14612wireman);
        map.put("ECDSA_P256_RAW", attabal.saneness().dern(attabal.wireman.f14560attabal).saneness(attabal.dern.f14551saneness).wireman(attabal.marial.f14554attabal).marial(attabal.beachfront.f14549wireman).attabal());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", kattegat.f14600beachfront);
        map.put("ECDSA_P384", kattegat.f14609saneness);
        map.put("ECDSA_P384_IEEE_P1363", kattegat.f14608marial);
        attabal.saneness sanenessVarDern = attabal.saneness().dern(attabal.wireman.f14561dern);
        attabal.dern dernVar = attabal.dern.f14550dern;
        attabal.saneness sanenessVarSaneness = sanenessVarDern.saneness(dernVar);
        attabal.marial marialVar = attabal.marial.f14555saneness;
        attabal.saneness sanenessVarWireman = sanenessVarSaneness.wireman(marialVar);
        attabal.beachfront beachfrontVar = attabal.beachfront.f14546attabal;
        map.put("ECDSA_P384_SHA512", sanenessVarWireman.marial(beachfrontVar).attabal());
        map.put("ECDSA_P384_SHA384", attabal.saneness().dern(attabal.wireman.f14562saneness).saneness(dernVar).wireman(marialVar).marial(beachfrontVar).attabal());
        map.put("ECDSA_P521", kattegat.f14603dern);
        map.put("ECDSA_P521_IEEE_P1363", kattegat.f14601competently);
        return Collections.unmodifiableMap(map);
    }
}
