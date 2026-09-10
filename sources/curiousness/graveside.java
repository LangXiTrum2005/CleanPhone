package curiousness;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.proto.KeyData;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesGcmKeyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class graveside {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final hobby.kattegat<monoploid, discernable.attabal> f24381attabal = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: curiousness.polloi
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return affiche.dern.saneness((monoploid) impromptuVar);
        }
    }, monoploid.class, discernable.attabal.class);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final discernable.taiyuan<discernable.attabal> f24384saneness = hobby.kowloon.marial(dern(), discernable.attabal.class, KeyData.KeyMaterialType.SYMMETRIC, invest.formularize.overspeculate());

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.gintrap.attabal<adultoid> f24382dern = new impromptu();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final hobby.apical<adultoid> f24385wireman = new hobby.apical() { // from class: curiousness.molybdenite
        @Override // hobby.apical
        public final discernable.impromptu attabal(discernable.molybdenite molybdeniteVar, Integer num) {
            return graveside.saneness((adultoid) molybdeniteVar, num);
        }
    };

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f24383marial = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public static final void beachfront(adultoid adultoidVar) throws GeneralSecurityException {
        if (adultoidVar.wireman() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }

    public static String dern() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public static void marial(boolean z) throws GeneralSecurityException {
        TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = f24383marial;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        cloop.arytenoidectomy.competently();
        hobby.cord.saneness().dern(f24381attabal);
        hobby.preprohormone.attabal().dern(wireman());
        hobby.gintrap.saneness().attabal(f24382dern, adultoid.class);
        hobby.dovishness.beachfront().saneness(f24385wireman, adultoid.class);
        hobby.formularize.wireman().impromptu(f24384saneness, algorithmFipsCompatibility, z);
    }

    public static monoploid saneness(adultoid adultoidVar, @Nullable Integer num) throws GeneralSecurityException {
        beachfront(adultoidVar);
        return monoploid.wireman().marial(adultoidVar).dern(num).wireman(ebullioscopic.dern.saneness(adultoidVar.wireman())).attabal();
    }

    public static Map<String, discernable.molybdenite> wireman() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", lotta.f24401attabal);
        adultoid.saneness sanenessVarWireman = adultoid.saneness().saneness(12).dern(16).wireman(16);
        adultoid.dern dernVar = adultoid.dern.f24292dern;
        map.put("AES128_GCM_RAW", sanenessVarWireman.marial(dernVar).attabal());
        map.put("AES256_GCM", lotta.f24409saneness);
        map.put("AES256_GCM_RAW", adultoid.saneness().saneness(12).dern(32).wireman(16).marial(dernVar).attabal());
        return Collections.unmodifiableMap(map);
    }
}
