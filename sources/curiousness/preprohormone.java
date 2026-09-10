package curiousness;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.proto.KeyData;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesGcmSivKeyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class preprohormone {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final hobby.kattegat<dovishness, discernable.attabal> f24455attabal = hobby.kattegat.saneness(new hobby.kattegat.saneness() { // from class: curiousness.gintrap
        @Override // hobby.kattegat.saneness
        public final Object attabal(discernable.impromptu impromptuVar) {
            return lai.saneness.wireman((dovishness) impromptuVar);
        }
    }, dovishness.class, discernable.attabal.class);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.apical<cord> f24457saneness = new hobby.apical() { // from class: curiousness.rotuma
        @Override // hobby.apical
        public final discernable.impromptu attabal(discernable.molybdenite molybdeniteVar, Integer num) {
            return preprohormone.saneness((cord) molybdeniteVar, num);
        }
    };

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.gintrap.attabal<cord> f24456dern = new impromptu();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final discernable.taiyuan<discernable.attabal> f24458wireman = hobby.kowloon.marial("type.googleapis.com/google.crypto.tink.AesGcmSivKey", discernable.attabal.class, KeyData.KeyMaterialType.SYMMETRIC, invest.triweekly.overspeculate());

    public static Map<String, discernable.molybdenite> dern() throws GeneralSecurityException {
        HashMap map = new HashMap();
        cord.saneness sanenessVarSaneness = cord.saneness().saneness(16);
        cord.dern dernVar = cord.dern.f24351attabal;
        map.put("AES128_GCM_SIV", sanenessVarSaneness.dern(dernVar).attabal());
        cord.saneness sanenessVarSaneness2 = cord.saneness().saneness(16);
        cord.dern dernVar2 = cord.dern.f24352dern;
        map.put("AES128_GCM_SIV_RAW", sanenessVarSaneness2.dern(dernVar2).attabal());
        map.put("AES256_GCM_SIV", cord.saneness().saneness(32).dern(dernVar).attabal());
        map.put("AES256_GCM_SIV_RAW", cord.saneness().saneness(32).dern(dernVar2).attabal());
        return Collections.unmodifiableMap(map);
    }

    public static dovishness saneness(cord cordVar, @Nullable Integer num) throws GeneralSecurityException {
        return dovishness.wireman().marial(cordVar).dern(num).wireman(ebullioscopic.dern.saneness(cordVar.dern())).attabal();
    }

    public static void wireman(boolean z) throws GeneralSecurityException {
        if (!TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        cloop.dovishness.competently();
        hobby.preprohormone.attabal().dern(dern());
        hobby.gintrap.saneness().attabal(f24456dern, cord.class);
        hobby.dovishness.beachfront().saneness(f24457saneness, cord.class);
        hobby.cord.saneness().dern(f24455attabal);
        hobby.formularize.wireman().competently(f24458wireman, z);
    }
}
