package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.LGPD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fe f13994a;

    public g8(fe feVar) {
        this.f13994a = feVar;
    }

    public List a(qf.b bVar) {
        HashMap mapA = this.f13994a.a();
        List<DataUseConsent> listA = a(mapA);
        ArrayList arrayList = new ArrayList();
        HashSet hashSetB = b(bVar);
        if (hashSetB != null) {
            for (DataUseConsent dataUseConsent : listA) {
                if (a(hashSetB, dataUseConsent)) {
                    arrayList.add(dataUseConsent);
                }
            }
        } else {
            if (mapA.containsKey(CCPA.CCPA_STANDARD)) {
                arrayList.add((DataUseConsent) mapA.get(CCPA.CCPA_STANDARD));
            }
            if (mapA.containsKey("coppa")) {
                arrayList.add((DataUseConsent) mapA.get("coppa"));
            }
            if (mapA.containsKey(LGPD.LGPD_STANDARD)) {
                arrayList.add((DataUseConsent) mapA.get(LGPD.LGPD_STANDARD));
            }
        }
        return arrayList;
    }

    public final HashSet b(qf.b bVar) {
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public final boolean a(HashSet hashSet, DataUseConsent dataUseConsent) {
        if (hashSet.contains(dataUseConsent.getPrivacyStandardName())) {
            return true;
        }
        za.b("DataUseConsent " + dataUseConsent.getPrivacyStandardName() + " is not whitelisted.", null);
        return false;
    }

    public final List a(HashMap map) {
        HashMap map2 = new HashMap(map);
        map2.remove("gdpr");
        return new ArrayList(map2.values());
    }
}
