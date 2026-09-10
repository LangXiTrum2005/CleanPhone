package com.google.firebase.abt;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseABTesting {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f20169b = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface OriginService {
    }

    public FirebaseABTesting(Provider provider) {
        this.f20168a = provider;
    }

    public static boolean a(ArrayList arrayList, AbtExperimentInfo abtExperimentInfo) {
        String str = abtExperimentInfo.f20164a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo2 = (AbtExperimentInfo) it.next();
            if (abtExperimentInfo2.f20164a.equals(str) && abtExperimentInfo2.f20165b.equals(abtExperimentInfo.f20165b)) {
                return true;
            }
        }
        return false;
    }

    public final void b(ArrayList arrayList) throws AbtException {
        Provider provider = this.f20168a;
        if (provider.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList<AbtExperimentInfo> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                if (arrayList2.isEmpty()) {
                    if (provider.get() == null) {
                        throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    Iterator it2 = ((AnalyticsConnector) provider.get()).b().iterator();
                    while (it2.hasNext()) {
                        ((AnalyticsConnector) provider.get()).d(((AnalyticsConnector.ConditionalUserProperty) it2.next()).f20176b);
                    }
                    return;
                }
                if (provider.get() == null) {
                    throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
                ArrayList<AnalyticsConnector.ConditionalUserProperty> arrayListB = ((AnalyticsConnector) provider.get()).b();
                ArrayList<AbtExperimentInfo> arrayList3 = new ArrayList();
                for (AnalyticsConnector.ConditionalUserProperty conditionalUserProperty : arrayListB) {
                    String[] strArr = AbtExperimentInfo.g;
                    String str2 = conditionalUserProperty.d;
                    arrayList3.add(new AbtExperimentInfo(conditionalUserProperty.f20176b, String.valueOf(conditionalUserProperty.f20177c), str2 != null ? str2 : str, new Date(conditionalUserProperty.m), conditionalUserProperty.f20178e, conditionalUserProperty.j));
                    str = str;
                }
                ArrayList arrayList4 = new ArrayList();
                for (AbtExperimentInfo abtExperimentInfo : arrayList3) {
                    if (!a(arrayList2, abtExperimentInfo)) {
                        arrayList4.add(abtExperimentInfo.a());
                    }
                }
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    ((AnalyticsConnector) provider.get()).d(((AnalyticsConnector.ConditionalUserProperty) it3.next()).f20176b);
                }
                ArrayList<AbtExperimentInfo> arrayList5 = new ArrayList();
                for (AbtExperimentInfo abtExperimentInfo2 : arrayList2) {
                    if (!a(arrayList3, abtExperimentInfo2)) {
                        arrayList5.add(abtExperimentInfo2);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(((AnalyticsConnector) provider.get()).b());
                if (this.f20169b == null) {
                    this.f20169b = Integer.valueOf(((AnalyticsConnector) provider.get()).f());
                }
                int iIntValue = this.f20169b.intValue();
                for (AbtExperimentInfo abtExperimentInfo3 : arrayList5) {
                    while (arrayDeque.size() >= iIntValue) {
                        ((AnalyticsConnector) provider.get()).d(((AnalyticsConnector.ConditionalUserProperty) arrayDeque.pollFirst()).f20176b);
                    }
                    AnalyticsConnector.ConditionalUserProperty conditionalUserPropertyA = abtExperimentInfo3.a();
                    ((AnalyticsConnector) provider.get()).a(conditionalUserPropertyA);
                    arrayDeque.offer(conditionalUserPropertyA);
                }
                return;
            }
            Map map = (Map) it.next();
            String[] strArr2 = AbtExperimentInfo.g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = AbtExperimentInfo.g;
            for (int i2 = 0; i2 < 5; i2++) {
                String str3 = strArr3[i2];
                if (!map.containsKey(str3)) {
                    arrayList6.add(str3);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                arrayList2.add(new AbtExperimentInfo((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", AbtExperimentInfo.f20163h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e2) {
                throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e2);
            } catch (ParseException e3) {
                throw new AbtException("Could not process experiment: parsing experiment start time failed.", e3);
            }
        }
    }
}
