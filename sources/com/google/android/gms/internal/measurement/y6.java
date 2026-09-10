package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface y6 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(a7 a7Var);

    void getAppInstanceId(a7 a7Var);

    void getCachedAppInstanceId(a7 a7Var);

    void getConditionalUserProperties(String str, String str2, a7 a7Var);

    void getCurrentScreenClass(a7 a7Var);

    void getCurrentScreenName(a7 a7Var);

    void getGmpAppId(a7 a7Var);

    void getMaxUserProperties(String str, a7 a7Var);

    void getSessionId(a7 a7Var);

    void getTestFlag(a7 a7Var, int i10);

    void getUserProperties(String str, String str2, boolean z10, a7 a7Var);

    void initForTests(Map map);

    void initialize(s9.a aVar, i7 i7Var, long j10);

    void initializeWithElapsedTime(s9.a aVar, i7 i7Var, long j10, long j11);

    void isDataCollectionEnabled(a7 a7Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, a7 a7Var, long j10);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10, long j11);

    void logHealthData(int i10, String str, s9.a aVar, s9.a aVar2, s9.a aVar3);

    void onActivityCreated(s9.a aVar, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(k7 k7Var, Bundle bundle, long j10);

    void onActivityDestroyed(s9.a aVar, long j10);

    void onActivityDestroyedByScionActivityInfo(k7 k7Var, long j10);

    void onActivityPaused(s9.a aVar, long j10);

    void onActivityPausedByScionActivityInfo(k7 k7Var, long j10);

    void onActivityResumed(s9.a aVar, long j10);

    void onActivityResumedByScionActivityInfo(k7 k7Var, long j10);

    void onActivitySaveInstanceState(s9.a aVar, a7 a7Var, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(k7 k7Var, a7 a7Var, long j10);

    void onActivityStarted(s9.a aVar, long j10);

    void onActivityStartedByScionActivityInfo(k7 k7Var, long j10);

    void onActivityStopped(s9.a aVar, long j10);

    void onActivityStoppedByScionActivityInfo(k7 k7Var, long j10);

    void performAction(Bundle bundle, a7 a7Var, long j10);

    void registerOnMeasurementEventListener(e7 e7Var);

    void resetAnalyticsData(long j10);

    void resetAnalyticsDataWithElapsedTime(long j10, long j11);

    void retrieveAndUploadBatches(c7 c7Var);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(s9.a aVar, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(k7 k7Var, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(e7 e7Var);

    void setInstanceIdProvider(h7 h7Var);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, s9.a aVar, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(e7 e7Var);
}
