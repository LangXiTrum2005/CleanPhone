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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: RsaSsaPssSignKeyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class permissivist {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final hobby.kattegat<mathsort, discernable.adultoid> f14659attabal = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: astronautic.overspeculate
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return affiche.graveside.saneness((mathsort) impromptuVar);
        }
    }, mathsort.class, discernable.adultoid.class);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.kattegat<splinterproof, discernable.dovishness> f14663saneness = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: astronautic.clubfoot
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return affiche.adultoid.saneness((splinterproof) impromptuVar);
        }
    }, splinterproof.class, discernable.dovishness.class);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final discernable.graveside<discernable.adultoid> f14661dern = hobby.kowloon.beachfront(dern(), discernable.adultoid.class, invest.creditor.sayid());

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final discernable.taiyuan<discernable.dovishness> f14664wireman = hobby.kowloon.marial(cultivated.attabal(), discernable.dovishness.class, KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, invest.starveling.timberyard());

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final hobby.apical<peridotite> f14662marial = new hobby.apical() { // from class: astronautic.dent
        @Override // hobby.apical
        public final discernable.impromptu attabal(discernable.molybdenite molybdeniteVar, Integer num) {
            return permissivist.saneness((peridotite) molybdeniteVar, num);
        }
    };

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f14660beachfront = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public static String dern() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    public static void marial(boolean z) throws GeneralSecurityException {
        TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = f14660beachfront;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        extensively.merc.arytenoidectomy();
        hobby.preprohormone.attabal().dern(wireman());
        hobby.cord.saneness().dern(f14659attabal);
        hobby.cord.saneness().dern(f14663saneness);
        hobby.dovishness.beachfront().saneness(f14662marial, peridotite.class);
        hobby.formularize.wireman().impromptu(f14661dern, algorithmFipsCompatibility, z);
        hobby.formularize.wireman().impromptu(f14664wireman, algorithmFipsCompatibility, false);
    }

    public static mathsort saneness(peridotite peridotiteVar, @Nullable Integer num) throws GeneralSecurityException {
        KeyPairGenerator keyPairGeneratorAttabal = affiche.cutely.f3857competently.attabal("RSA");
        keyPairGeneratorAttabal.initialize(new RSAKeyGenParameterSpec(peridotiteVar.wireman(), new BigInteger(1, peridotiteVar.marial().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGeneratorAttabal.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        return mathsort.marial().beachfront(splinterproof.wireman().marial(peridotiteVar).wireman(rSAPublicKey.getModulus()).dern(num).attabal()).wireman(ebullioscopic.saneness.attabal(rSAPrivateCrtKey.getPrimeP(), discernable.beachfront.attabal()), ebullioscopic.saneness.attabal(rSAPrivateCrtKey.getPrimeQ(), discernable.beachfront.attabal())).marial(ebullioscopic.saneness.attabal(rSAPrivateCrtKey.getPrivateExponent(), discernable.beachfront.attabal())).dern(ebullioscopic.saneness.attabal(rSAPrivateCrtKey.getPrimeExponentP(), discernable.beachfront.attabal()), ebullioscopic.saneness.attabal(rSAPrivateCrtKey.getPrimeExponentQ(), discernable.beachfront.attabal())).saneness(ebullioscopic.saneness.attabal(rSAPrivateCrtKey.getCrtCoefficient(), discernable.beachfront.attabal())).attabal();
    }

    public static Map<String, discernable.molybdenite> wireman() throws GeneralSecurityException {
        HashMap map = new HashMap();
        peridotite.saneness sanenessVarSaneness = peridotite.saneness();
        peridotite.dern dernVar = peridotite.dern.f14644attabal;
        peridotite.saneness sanenessVarDern = sanenessVarSaneness.beachfront(dernVar).saneness(dernVar).marial(32).dern(3072);
        BigInteger bigInteger = peridotite.f14637competently;
        peridotite.saneness sanenessVarWireman = sanenessVarDern.wireman(bigInteger);
        peridotite.wireman wiremanVar = peridotite.wireman.f14655attabal;
        map.put("RSA_SSA_PSS_3072_SHA256_F4", sanenessVarWireman.competently(wiremanVar).attabal());
        peridotite.saneness sanenessVarWireman2 = peridotite.saneness().beachfront(dernVar).saneness(dernVar).marial(32).dern(3072).wireman(bigInteger);
        peridotite.wireman wiremanVar2 = peridotite.wireman.f14658wireman;
        map.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", sanenessVarWireman2.competently(wiremanVar2).attabal());
        map.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", kattegat.f14605impassible);
        peridotite.saneness sanenessVarSaneness2 = peridotite.saneness();
        peridotite.dern dernVar2 = peridotite.dern.f14645dern;
        map.put("RSA_SSA_PSS_4096_SHA512_F4", sanenessVarSaneness2.beachfront(dernVar2).saneness(dernVar2).marial(64).dern(4096).wireman(bigInteger).competently(wiremanVar).attabal());
        map.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", peridotite.saneness().beachfront(dernVar2).saneness(dernVar2).marial(64).dern(4096).wireman(bigInteger).competently(wiremanVar2).attabal());
        map.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", kattegat.f14611triweekly);
        return Collections.unmodifiableMap(map);
    }
}
