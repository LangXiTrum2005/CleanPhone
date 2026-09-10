package astronautic;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.proto.KeyData;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: RsaSsaPkcs1SignKeyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hydrovane {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final hobby.kattegat<grimness, discernable.adultoid> f14592attabal = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: astronautic.privatdozent
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return affiche.polloi.saneness((grimness) impromptuVar);
        }
    }, grimness.class, discernable.adultoid.class);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.kattegat<saran, discernable.dovishness> f14596saneness = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: astronautic.creditor
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return affiche.molybdenite.saneness((saran) impromptuVar);
        }
    }, saran.class, discernable.dovishness.class);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final discernable.graveside<discernable.adultoid> f14594dern = hobby.kowloon.beachfront(dern(), discernable.adultoid.class, invest.seminary.sayid());

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final discernable.taiyuan<discernable.dovishness> f14597wireman = hobby.kowloon.marial(walach.attabal(), discernable.dovishness.class, KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, invest.grimness.premeiotic());

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final hobby.apical<seminary> f14595marial = new hobby.apical() { // from class: astronautic.starveling
        @Override // hobby.apical
        public final discernable.impromptu attabal(discernable.molybdenite molybdeniteVar, Integer num) {
            return hydrovane.saneness((seminary) molybdeniteVar, num);
        }
    };

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f14593beachfront = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public static String dern() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    public static void marial(boolean z) throws GeneralSecurityException {
        TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = f14593beachfront;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        extensively.cuirassed.arytenoidectomy();
        hobby.preprohormone.attabal().dern(wireman());
        hobby.cord.saneness().dern(f14592attabal);
        hobby.cord.saneness().dern(f14596saneness);
        hobby.dovishness.beachfront().saneness(f14595marial, seminary.class);
        hobby.formularize.wireman().impromptu(f14594dern, algorithmFipsCompatibility, z);
        hobby.formularize.wireman().impromptu(f14597wireman, algorithmFipsCompatibility, false);
    }

    public static grimness saneness(seminary seminaryVar, @Nullable Integer num) throws GeneralSecurityException {
        KeyPairGenerator keyPairGeneratorAttabal = affiche.cutely.f3857competently.attabal("RSA");
        keyPairGeneratorAttabal.initialize(new RSAKeyGenParameterSpec(seminaryVar.wireman(), new BigInteger(1, seminaryVar.marial().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGeneratorAttabal.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        return grimness.marial().beachfront(saran.wireman().marial(seminaryVar).wireman(rSAPublicKey.getModulus()).dern(num).attabal()).wireman(ebullioscopic.saneness.attabal(rSAPrivateCrtKey.getPrimeP(), discernable.beachfront.attabal()), ebullioscopic.saneness.attabal(rSAPrivateCrtKey.getPrimeQ(), discernable.beachfront.attabal())).marial(ebullioscopic.saneness.attabal(rSAPrivateCrtKey.getPrivateExponent(), discernable.beachfront.attabal())).dern(ebullioscopic.saneness.attabal(rSAPrivateCrtKey.getPrimeExponentP(), discernable.beachfront.attabal()), ebullioscopic.saneness.attabal(rSAPrivateCrtKey.getPrimeExponentQ(), discernable.beachfront.attabal())).saneness(ebullioscopic.saneness.attabal(rSAPrivateCrtKey.getCrtCoefficient(), discernable.beachfront.attabal())).attabal();
    }

    public static Map<String, discernable.molybdenite> wireman() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4", kattegat.f14602cutely);
        seminary.saneness sanenessVarDern = seminary.saneness().saneness(seminary.dern.f14704attabal).dern(3072);
        BigInteger bigInteger = seminary.f14699marial;
        seminary.saneness sanenessVarWireman = sanenessVarDern.wireman(bigInteger);
        seminary.wireman wiremanVar = seminary.wireman.f14716wireman;
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", sanenessVarWireman.marial(wiremanVar).attabal());
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", kattegat.f14598apical);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4", kattegat.f14604formularize);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", seminary.saneness().saneness(seminary.dern.f14705dern).dern(4096).wireman(bigInteger).marial(wiremanVar).attabal());
        return map;
    }
}
