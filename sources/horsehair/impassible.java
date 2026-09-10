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

/* JADX INFO: compiled from: HmacKeyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final kattegat<taiyuan, competently> f27937attabal = kattegat.saneness(new kattegat.saneness() { // from class: horsehair.cutely
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return new ascolichen.taiyuan((taiyuan) impromptuVar);
        }
    }, taiyuan.class, competently.class);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final kattegat<taiyuan, discernable.polloi> f27941saneness = kattegat.saneness(new kattegat.saneness() { // from class: horsehair.apical
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return affiche.arytenoidectomy.wireman((taiyuan) impromptuVar);
        }
    }, taiyuan.class, discernable.polloi.class);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final discernable.taiyuan<discernable.polloi> f27939dern = hobby.kowloon.marial("type.googleapis.com/google.crypto.tink.HmacKey", discernable.polloi.class, KeyData.KeyMaterialType.SYMMETRIC, invest.preprohormone.permissivist());

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final hobby.gintrap.attabal<triweekly> f27942wireman = new curiousness.impromptu();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final hobby.apical<triweekly> f27940marial = new hobby.apical() { // from class: horsehair.formularize
        @Override // hobby.apical
        public final discernable.impromptu attabal(discernable.molybdenite molybdeniteVar, Integer num) {
            return impassible.attabal((triweekly) molybdeniteVar, num);
        }
    };

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f27938beachfront = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public static taiyuan attabal(triweekly triweeklyVar, @Nullable Integer num) throws GeneralSecurityException {
        return taiyuan.wireman().marial(triweeklyVar).wireman(ebullioscopic.dern.saneness(triweeklyVar.marial())).dern(num).attabal();
    }

    public static void dern(boolean z) throws GeneralSecurityException {
        TinkFipsUtil.AlgorithmFipsCompatibility algorithmFipsCompatibility = f27938beachfront;
        if (!algorithmFipsCompatibility.isCompatible()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        ascolichen.triweekly.impromptu();
        cord.saneness().dern(f27937attabal);
        cord.saneness().dern(f27941saneness);
        hobby.preprohormone.attabal().dern(saneness());
        hobby.dovishness.beachfront().saneness(f27940marial, triweekly.class);
        hobby.gintrap.saneness().attabal(f27942wireman, triweekly.class);
        hobby.formularize.wireman().impromptu(f27939dern, algorithmFipsCompatibility, z);
    }

    public static Map<String, discernable.molybdenite> saneness() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", preprohormone.f27962attabal);
        triweekly.saneness sanenessVarWireman = triweekly.saneness().dern(32).wireman(16);
        triweekly.wireman wiremanVar = triweekly.wireman.f27990wireman;
        triweekly.saneness sanenessVarMarial = sanenessVarWireman.marial(wiremanVar);
        triweekly.dern dernVar = triweekly.dern.f27979dern;
        map.put("HMAC_SHA256_128BITTAG_RAW", sanenessVarMarial.saneness(dernVar).attabal());
        triweekly.saneness sanenessVarWireman2 = triweekly.saneness().dern(32).wireman(32);
        triweekly.wireman wiremanVar2 = triweekly.wireman.f27987attabal;
        map.put("HMAC_SHA256_256BITTAG", sanenessVarWireman2.marial(wiremanVar2).saneness(dernVar).attabal());
        map.put("HMAC_SHA256_256BITTAG_RAW", triweekly.saneness().dern(32).wireman(32).marial(wiremanVar).saneness(dernVar).attabal());
        triweekly.saneness sanenessVarMarial2 = triweekly.saneness().dern(64).wireman(16).marial(wiremanVar2);
        triweekly.dern dernVar2 = triweekly.dern.f27980marial;
        map.put("HMAC_SHA512_128BITTAG", sanenessVarMarial2.saneness(dernVar2).attabal());
        map.put("HMAC_SHA512_128BITTAG_RAW", triweekly.saneness().dern(64).wireman(16).marial(wiremanVar).saneness(dernVar2).attabal());
        map.put("HMAC_SHA512_256BITTAG", triweekly.saneness().dern(64).wireman(32).marial(wiremanVar2).saneness(dernVar2).attabal());
        map.put("HMAC_SHA512_256BITTAG_RAW", triweekly.saneness().dern(64).wireman(32).marial(wiremanVar).saneness(dernVar2).attabal());
        map.put("HMAC_SHA512_512BITTAG", preprohormone.f27966wireman);
        map.put("HMAC_SHA512_512BITTAG_RAW", triweekly.saneness().dern(64).wireman(64).marial(wiremanVar).saneness(dernVar2).attabal());
        return Collections.unmodifiableMap(map);
    }
}
