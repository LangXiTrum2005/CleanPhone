package com.facebook.internal.instrument;

import com.facebook.FacebookSdk;
import com.facebook.UserSettingsManager;
import com.facebook.internal.FeatureManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/instrument/ExceptionAnalyzer;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ExceptionAnalyzer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f16411a;

    public static final void a(Throwable th) {
        HashMap map;
        FeatureManager.Feature feature;
        if (f16411a) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.e(stackTrace, "e.stackTrace");
            for (StackTraceElement it : stackTrace) {
                Intrinsics.e(it, "it");
                String className = it.getClassName();
                Intrinsics.e(className, "it.className");
                synchronized (FeatureManager.f16285b) {
                    map = FeatureManager.f16284a;
                    if (map.isEmpty()) {
                        map.put(FeatureManager.Feature.AAM, new String[]{"com.facebook.appevents.aam."});
                        map.put(FeatureManager.Feature.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                        map.put(FeatureManager.Feature.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                        map.put(FeatureManager.Feature.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                        map.put(FeatureManager.Feature.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                        map.put(FeatureManager.Feature.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                        map.put(FeatureManager.Feature.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                        map.put(FeatureManager.Feature.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                        map.put(FeatureManager.Feature.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                        map.put(FeatureManager.Feature.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                        map.put(FeatureManager.Feature.IapLogging, new String[]{"com.facebook.appevents.iap."});
                        map.put(FeatureManager.Feature.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                    }
                }
                Iterator it2 = map.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        feature = FeatureManager.Feature.Unknown;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    feature = (FeatureManager.Feature) entry.getKey();
                    for (String str : (String[]) entry.getValue()) {
                        if (StringsKt.M(className, str, false)) {
                            break;
                        }
                    }
                }
                if (feature != FeatureManager.Feature.Unknown) {
                    Intrinsics.f(feature, "feature");
                    FacebookSdk.b().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString("FBSDKFeature" + feature, "12.1.0").apply();
                    hashSet.add(feature.toString());
                }
            }
            HashSet hashSet2 = FacebookSdk.f15915a;
            if (!UserSettingsManager.c() || hashSet.isEmpty()) {
                return;
            }
            JSONArray jSONArray = new JSONArray((Collection) hashSet);
            InstrumentData instrumentData = new InstrumentData();
            instrumentData.f16414b = InstrumentData.Type.f16417Y;
            Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
            instrumentData.g = lValueOf;
            instrumentData.f16415c = jSONArray;
            StringBuffer stringBuffer = new StringBuffer("analysis_log_");
            stringBuffer.append(String.valueOf(lValueOf));
            stringBuffer.append(".json");
            String string = stringBuffer.toString();
            Intrinsics.e(string, "StringBuffer()\n         …)\n            .toString()");
            instrumentData.f16413a = string;
            instrumentData.b();
        }
    }
}
