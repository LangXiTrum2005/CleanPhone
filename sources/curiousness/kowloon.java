package curiousness;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.proto.KeyData;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesEaxKeyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final hobby.kattegat<formularize, discernable.attabal> f24397attabal = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: curiousness.impassible
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return affiche.saneness.saneness((formularize) impromptuVar);
        }
    }, formularize.class, discernable.attabal.class);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final discernable.taiyuan<discernable.attabal> f24399saneness = hobby.kowloon.marial(dern(), discernable.attabal.class, KeyData.KeyMaterialType.SYMMETRIC, invest.taiyuan.dent());

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.apical<arytenoidectomy> f24398dern = new hobby.apical() { // from class: curiousness.triweekly
        @Override // hobby.apical
        public final discernable.impromptu attabal(discernable.molybdenite molybdeniteVar, Integer num) {
            return kowloon.saneness((arytenoidectomy) molybdeniteVar, num);
        }
    };

    public static final void beachfront(arytenoidectomy arytenoidectomyVar) throws GeneralSecurityException {
        if (arytenoidectomyVar.wireman() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }

    public static String dern() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public static void marial(boolean z) throws GeneralSecurityException {
        if (!TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        cloop.cutely.impromptu();
        hobby.cord.saneness().dern(f24397attabal);
        hobby.preprohormone.attabal().dern(wireman());
        hobby.dovishness.beachfront().saneness(f24398dern, arytenoidectomy.class);
        hobby.formularize.wireman().competently(f24399saneness, z);
    }

    public static formularize saneness(arytenoidectomy arytenoidectomyVar, @Nullable Integer num) throws GeneralSecurityException {
        beachfront(arytenoidectomyVar);
        return formularize.wireman().marial(arytenoidectomyVar).dern(num).wireman(ebullioscopic.dern.saneness(arytenoidectomyVar.wireman())).attabal();
    }

    public static Map<String, discernable.molybdenite> wireman() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", lotta.f24405dern);
        arytenoidectomy.saneness sanenessVarWireman = arytenoidectomy.saneness().saneness(16).dern(16).wireman(16);
        arytenoidectomy.dern dernVar = arytenoidectomy.dern.f24323dern;
        map.put("AES128_EAX_RAW", sanenessVarWireman.marial(dernVar).attabal());
        map.put("AES256_EAX", lotta.f24411wireman);
        map.put("AES256_EAX_RAW", arytenoidectomy.saneness().saneness(16).dern(32).wireman(16).marial(dernVar).attabal());
        return Collections.unmodifiableMap(map);
    }
}
