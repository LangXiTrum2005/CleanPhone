package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w6 extends com.google.android.gms.internal.auth.a implements y6 {
    @Override // com.google.android.gms.internal.measurement.y6
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel parcelU1 = u1();
        parcelU1.writeString(str);
        parcelU1.writeLong(j10);
        w1(parcelU1, 23);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelU1 = u1();
        parcelU1.writeString(str);
        parcelU1.writeString(str2);
        m6.b(parcelU1, bundle);
        w1(parcelU1, 9);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void endAdUnitExposure(String str, long j10) {
        Parcel parcelU1 = u1();
        parcelU1.writeString(str);
        parcelU1.writeLong(j10);
        w1(parcelU1, 24);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void generateEventId(a7 a7Var) {
        Parcel parcelU1 = u1();
        m6.c(parcelU1, a7Var);
        w1(parcelU1, 22);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void getAppInstanceId(a7 a7Var) {
        Parcel parcelU1 = u1();
        m6.c(parcelU1, a7Var);
        w1(parcelU1, 20);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void getCachedAppInstanceId(a7 a7Var) {
        Parcel parcelU1 = u1();
        m6.c(parcelU1, a7Var);
        w1(parcelU1, 19);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void getConditionalUserProperties(String str, String str2, a7 a7Var) {
        Parcel parcelU1 = u1();
        parcelU1.writeString(str);
        parcelU1.writeString(str2);
        m6.c(parcelU1, a7Var);
        w1(parcelU1, 10);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void getCurrentScreenClass(a7 a7Var) {
        Parcel parcelU1 = u1();
        m6.c(parcelU1, a7Var);
        w1(parcelU1, 17);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void getCurrentScreenName(a7 a7Var) {
        Parcel parcelU1 = u1();
        m6.c(parcelU1, a7Var);
        w1(parcelU1, 16);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void getGmpAppId(a7 a7Var) {
        Parcel parcelU1 = u1();
        m6.c(parcelU1, a7Var);
        w1(parcelU1, 21);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void getMaxUserProperties(String str, a7 a7Var) {
        Parcel parcelU1 = u1();
        parcelU1.writeString(str);
        m6.c(parcelU1, a7Var);
        w1(parcelU1, 6);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void getSessionId(a7 a7Var) {
        Parcel parcelU1 = u1();
        m6.c(parcelU1, a7Var);
        w1(parcelU1, 46);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void getUserProperties(String str, String str2, boolean z10, a7 a7Var) {
        Parcel parcelU1 = u1();
        parcelU1.writeString(str);
        parcelU1.writeString(str2);
        ClassLoader classLoader = m6.f23729a;
        parcelU1.writeInt(z10 ? 1 : 0);
        m6.c(parcelU1, a7Var);
        w1(parcelU1, 5);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void initialize(s9.a aVar, i7 i7Var, long j10) {
        Parcel parcelU1 = u1();
        m6.c(parcelU1, aVar);
        m6.b(parcelU1, i7Var);
        parcelU1.writeLong(j10);
        w1(parcelU1, 1);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void initializeWithElapsedTime(s9.a aVar, i7 i7Var, long j10, long j11) {
        Parcel parcelU1 = u1();
        m6.c(parcelU1, aVar);
        m6.b(parcelU1, i7Var);
        parcelU1.writeLong(j10);
        parcelU1.writeLong(j11);
        w1(parcelU1, 60);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10, long j11) {
        Parcel parcelU1 = u1();
        parcelU1.writeString(str);
        parcelU1.writeString(str2);
        m6.b(parcelU1, bundle);
        parcelU1.writeInt(z10 ? 1 : 0);
        parcelU1.writeInt(1);
        parcelU1.writeLong(j10);
        parcelU1.writeLong(j11);
        w1(parcelU1, 59);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void logHealthData(int i10, String str, s9.a aVar, s9.a aVar2, s9.a aVar3) {
        Parcel parcelU1 = u1();
        parcelU1.writeInt(5);
        parcelU1.writeString(str);
        m6.c(parcelU1, aVar);
        m6.c(parcelU1, aVar2);
        m6.c(parcelU1, aVar3);
        w1(parcelU1, 33);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void onActivityCreatedByScionActivityInfo(k7 k7Var, Bundle bundle, long j10) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, k7Var);
        m6.b(parcelU1, bundle);
        parcelU1.writeLong(j10);
        w1(parcelU1, 53);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void onActivityDestroyedByScionActivityInfo(k7 k7Var, long j10) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, k7Var);
        parcelU1.writeLong(j10);
        w1(parcelU1, 54);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void onActivityPausedByScionActivityInfo(k7 k7Var, long j10) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, k7Var);
        parcelU1.writeLong(j10);
        w1(parcelU1, 55);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void onActivityResumedByScionActivityInfo(k7 k7Var, long j10) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, k7Var);
        parcelU1.writeLong(j10);
        w1(parcelU1, 56);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void onActivitySaveInstanceStateByScionActivityInfo(k7 k7Var, a7 a7Var, long j10) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, k7Var);
        m6.c(parcelU1, a7Var);
        parcelU1.writeLong(j10);
        w1(parcelU1, 57);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void onActivityStartedByScionActivityInfo(k7 k7Var, long j10) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, k7Var);
        parcelU1.writeLong(j10);
        w1(parcelU1, 51);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void onActivityStoppedByScionActivityInfo(k7 k7Var, long j10) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, k7Var);
        parcelU1.writeLong(j10);
        w1(parcelU1, 52);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void registerOnMeasurementEventListener(e7 e7Var) {
        Parcel parcelU1 = u1();
        m6.c(parcelU1, e7Var);
        w1(parcelU1, 35);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void resetAnalyticsData(long j10) {
        Parcel parcelU1 = u1();
        parcelU1.writeLong(j10);
        w1(parcelU1, 12);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void resetAnalyticsDataWithElapsedTime(long j10, long j11) {
        Parcel parcelU1 = u1();
        parcelU1.writeLong(j10);
        parcelU1.writeLong(j11);
        w1(parcelU1, 61);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void retrieveAndUploadBatches(c7 c7Var) {
        Parcel parcelU1 = u1();
        m6.c(parcelU1, c7Var);
        w1(parcelU1, 58);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, bundle);
        parcelU1.writeLong(j10);
        w1(parcelU1, 8);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void setConsentThirdParty(Bundle bundle, long j10) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, bundle);
        parcelU1.writeLong(j10);
        w1(parcelU1, 45);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void setCurrentScreenByScionActivityInfo(k7 k7Var, String str, String str2, long j10) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, k7Var);
        parcelU1.writeString(str);
        parcelU1.writeString(str2);
        parcelU1.writeLong(j10);
        w1(parcelU1, 50);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel parcelU1 = u1();
        ClassLoader classLoader = m6.f23729a;
        parcelU1.writeInt(z10 ? 1 : 0);
        w1(parcelU1, 39);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, bundle);
        w1(parcelU1, 42);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void setMeasurementEnabled(boolean z10, long j10) {
        Parcel parcelU1 = u1();
        ClassLoader classLoader = m6.f23729a;
        parcelU1.writeInt(z10 ? 1 : 0);
        parcelU1.writeLong(j10);
        w1(parcelU1, 11);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void setSessionTimeoutDuration(long j10) {
        Parcel parcelU1 = u1();
        parcelU1.writeLong(j10);
        w1(parcelU1, 14);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void setSgtmDebugInfo(Intent intent) {
        Parcel parcelU1 = u1();
        m6.b(parcelU1, intent);
        w1(parcelU1, 48);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void setUserId(String str, long j10) {
        Parcel parcelU1 = u1();
        parcelU1.writeString(str);
        parcelU1.writeLong(j10);
        w1(parcelU1, 7);
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final void setUserProperty(String str, String str2, s9.a aVar, boolean z10, long j10) {
        Parcel parcelU1 = u1();
        parcelU1.writeString(str);
        parcelU1.writeString(str2);
        m6.c(parcelU1, aVar);
        parcelU1.writeInt(z10 ? 1 : 0);
        parcelU1.writeLong(j10);
        w1(parcelU1, 4);
    }
}
