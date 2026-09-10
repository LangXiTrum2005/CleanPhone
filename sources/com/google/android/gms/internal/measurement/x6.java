package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x6 extends l6 implements y6 {
    public static y6 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof y6 ? (y6) iInterfaceQueryLocalInterface : new w6(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 1);
    }

    @Override // com.google.android.gms.internal.measurement.l6
    public final boolean q(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10;
        a7 z6Var = null;
        c7 b7Var = null;
        a7 z6Var2 = null;
        a7 z6Var3 = null;
        a7 z6Var4 = null;
        a7 z6Var5 = null;
        e7 d7Var = null;
        e7 d7Var2 = null;
        e7 d7Var3 = null;
        a7 z6Var6 = null;
        a7 z6Var7 = null;
        a7 z6Var8 = null;
        a7 z6Var9 = null;
        a7 z6Var10 = null;
        a7 z6Var11 = null;
        h7 f7Var = null;
        a7 z6Var12 = null;
        a7 z6Var13 = null;
        a7 z6Var14 = null;
        a7 z6Var15 = null;
        a7 z6Var16 = null;
        switch (i10) {
            case 1:
                s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
                i7 i7Var = (i7) m6.a(parcel, i7.CREATOR);
                long j10 = parcel.readLong();
                m6.d(parcel);
                initialize(aVarX1, i7Var, j10);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) m6.a(parcel, Bundle.CREATOR);
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                long j11 = parcel.readLong();
                m6.d(parcel);
                logEvent(string, string2, bundle, z11, z12, j11);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) m6.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var = iInterfaceQueryLocalInterface instanceof a7 ? (a7) iInterfaceQueryLocalInterface : new z6(strongBinder);
                }
                a7 a7Var = z6Var;
                long j12 = parcel.readLong();
                m6.d(parcel);
                logEventAndBundle(string3, string4, bundle2, a7Var, j12);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                s9.a aVarX2 = s9.b.x1(parcel.readStrongBinder());
                ClassLoader classLoader = m6.f23729a;
                z10 = parcel.readInt() != 0;
                long j13 = parcel.readLong();
                m6.d(parcel);
                setUserProperty(string5, string6, aVarX2, z10, j13);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = m6.f23729a;
                z10 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var16 = iInterfaceQueryLocalInterface2 instanceof a7 ? (a7) iInterfaceQueryLocalInterface2 : new z6(strongBinder2);
                }
                m6.d(parcel);
                getUserProperties(string7, string8, z10, z6Var16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var15 = iInterfaceQueryLocalInterface3 instanceof a7 ? (a7) iInterfaceQueryLocalInterface3 : new z6(strongBinder3);
                }
                m6.d(parcel);
                getMaxUserProperties(string9, z6Var15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j14 = parcel.readLong();
                m6.d(parcel);
                setUserId(string10, j14);
                break;
            case 8:
                Bundle bundle3 = (Bundle) m6.a(parcel, Bundle.CREATOR);
                long j15 = parcel.readLong();
                m6.d(parcel);
                setConditionalUserProperty(bundle3, j15);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) m6.a(parcel, Bundle.CREATOR);
                m6.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var14 = iInterfaceQueryLocalInterface4 instanceof a7 ? (a7) iInterfaceQueryLocalInterface4 : new z6(strongBinder4);
                }
                m6.d(parcel);
                getConditionalUserProperties(string13, string14, z6Var14);
                break;
            case 11:
                ClassLoader classLoader3 = m6.f23729a;
                z10 = parcel.readInt() != 0;
                long j16 = parcel.readLong();
                m6.d(parcel);
                setMeasurementEnabled(z10, j16);
                break;
            case 12:
                long j17 = parcel.readLong();
                m6.d(parcel);
                resetAnalyticsData(j17);
                break;
            case 13:
                long j18 = parcel.readLong();
                m6.d(parcel);
                setMinimumSessionDuration(j18);
                break;
            case 14:
                long j19 = parcel.readLong();
                m6.d(parcel);
                setSessionTimeoutDuration(j19);
                break;
            case 15:
                s9.a aVarX3 = s9.b.x1(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j20 = parcel.readLong();
                m6.d(parcel);
                setCurrentScreen(aVarX3, string15, string16, j20);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var13 = iInterfaceQueryLocalInterface5 instanceof a7 ? (a7) iInterfaceQueryLocalInterface5 : new z6(strongBinder5);
                }
                m6.d(parcel);
                getCurrentScreenName(z6Var13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var12 = iInterfaceQueryLocalInterface6 instanceof a7 ? (a7) iInterfaceQueryLocalInterface6 : new z6(strongBinder6);
                }
                m6.d(parcel);
                getCurrentScreenClass(z6Var12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    f7Var = iInterfaceQueryLocalInterface7 instanceof h7 ? (h7) iInterfaceQueryLocalInterface7 : new f7(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 1);
                }
                m6.d(parcel);
                setInstanceIdProvider(f7Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var11 = iInterfaceQueryLocalInterface8 instanceof a7 ? (a7) iInterfaceQueryLocalInterface8 : new z6(strongBinder8);
                }
                m6.d(parcel);
                getCachedAppInstanceId(z6Var11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var10 = iInterfaceQueryLocalInterface9 instanceof a7 ? (a7) iInterfaceQueryLocalInterface9 : new z6(strongBinder9);
                }
                m6.d(parcel);
                getAppInstanceId(z6Var10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var9 = iInterfaceQueryLocalInterface10 instanceof a7 ? (a7) iInterfaceQueryLocalInterface10 : new z6(strongBinder10);
                }
                m6.d(parcel);
                getGmpAppId(z6Var9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var8 = iInterfaceQueryLocalInterface11 instanceof a7 ? (a7) iInterfaceQueryLocalInterface11 : new z6(strongBinder11);
                }
                m6.d(parcel);
                generateEventId(z6Var8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j21 = parcel.readLong();
                m6.d(parcel);
                beginAdUnitExposure(string17, j21);
                break;
            case 24:
                String string18 = parcel.readString();
                long j22 = parcel.readLong();
                m6.d(parcel);
                endAdUnitExposure(string18, j22);
                break;
            case 25:
                s9.a aVarX4 = s9.b.x1(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                m6.d(parcel);
                onActivityStarted(aVarX4, j23);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                s9.a aVarX5 = s9.b.x1(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                m6.d(parcel);
                onActivityStopped(aVarX5, j24);
                break;
            case 27:
                s9.a aVarX6 = s9.b.x1(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) m6.a(parcel, Bundle.CREATOR);
                long j25 = parcel.readLong();
                m6.d(parcel);
                onActivityCreated(aVarX6, bundle5, j25);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                s9.a aVarX7 = s9.b.x1(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                m6.d(parcel);
                onActivityDestroyed(aVarX7, j26);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                s9.a aVarX8 = s9.b.x1(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                m6.d(parcel);
                onActivityPaused(aVarX8, j27);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                s9.a aVarX9 = s9.b.x1(parcel.readStrongBinder());
                long j28 = parcel.readLong();
                m6.d(parcel);
                onActivityResumed(aVarX9, j28);
                break;
            case 31:
                s9.a aVarX10 = s9.b.x1(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var7 = iInterfaceQueryLocalInterface12 instanceof a7 ? (a7) iInterfaceQueryLocalInterface12 : new z6(strongBinder12);
                }
                long j29 = parcel.readLong();
                m6.d(parcel);
                onActivitySaveInstanceState(aVarX10, z6Var7, j29);
                break;
            case 32:
                Bundle bundle6 = (Bundle) m6.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var6 = iInterfaceQueryLocalInterface13 instanceof a7 ? (a7) iInterfaceQueryLocalInterface13 : new z6(strongBinder13);
                }
                long j30 = parcel.readLong();
                m6.d(parcel);
                performAction(bundle6, z6Var6, j30);
                break;
            case 33:
                int i11 = parcel.readInt();
                String string19 = parcel.readString();
                s9.a aVarX11 = s9.b.x1(parcel.readStrongBinder());
                s9.a aVarX12 = s9.b.x1(parcel.readStrongBinder());
                s9.a aVarX13 = s9.b.x1(parcel.readStrongBinder());
                m6.d(parcel);
                logHealthData(i11, string19, aVarX11, aVarX12, aVarX13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    d7Var3 = iInterfaceQueryLocalInterface14 instanceof e7 ? (e7) iInterfaceQueryLocalInterface14 : new d7(strongBinder14);
                }
                m6.d(parcel);
                setEventInterceptor(d7Var3);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    d7Var2 = iInterfaceQueryLocalInterface15 instanceof e7 ? (e7) iInterfaceQueryLocalInterface15 : new d7(strongBinder15);
                }
                m6.d(parcel);
                registerOnMeasurementEventListener(d7Var2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    d7Var = iInterfaceQueryLocalInterface16 instanceof e7 ? (e7) iInterfaceQueryLocalInterface16 : new d7(strongBinder16);
                }
                m6.d(parcel);
                unregisterOnMeasurementEventListener(d7Var);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(m6.f23729a);
                m6.d(parcel);
                initForTests(hashMap);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var5 = iInterfaceQueryLocalInterface17 instanceof a7 ? (a7) iInterfaceQueryLocalInterface17 : new z6(strongBinder17);
                }
                int i12 = parcel.readInt();
                m6.d(parcel);
                getTestFlag(z6Var5, i12);
                break;
            case 39:
                ClassLoader classLoader4 = m6.f23729a;
                z10 = parcel.readInt() != 0;
                m6.d(parcel);
                setDataCollectionEnabled(z10);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var4 = iInterfaceQueryLocalInterface18 instanceof a7 ? (a7) iInterfaceQueryLocalInterface18 : new z6(strongBinder18);
                }
                m6.d(parcel);
                isDataCollectionEnabled(z6Var4);
                break;
            case 41:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) m6.a(parcel, Bundle.CREATOR);
                m6.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                long j31 = parcel.readLong();
                m6.d(parcel);
                clearMeasurementEnabled(j31);
                break;
            case 44:
                Bundle bundle8 = (Bundle) m6.a(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                m6.d(parcel);
                setConsent(bundle8, j32);
                break;
            case 45:
                Bundle bundle9 = (Bundle) m6.a(parcel, Bundle.CREATOR);
                long j33 = parcel.readLong();
                m6.d(parcel);
                setConsentThirdParty(bundle9, j33);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var3 = iInterfaceQueryLocalInterface19 instanceof a7 ? (a7) iInterfaceQueryLocalInterface19 : new z6(strongBinder19);
                }
                m6.d(parcel);
                getSessionId(z6Var3);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                Intent intent = (Intent) m6.a(parcel, Intent.CREATOR);
                m6.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                k7 k7Var = (k7) m6.a(parcel, k7.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j34 = parcel.readLong();
                m6.d(parcel);
                setCurrentScreenByScionActivityInfo(k7Var, string20, string21, j34);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                k7 k7Var2 = (k7) m6.a(parcel, k7.CREATOR);
                long j35 = parcel.readLong();
                m6.d(parcel);
                onActivityStartedByScionActivityInfo(k7Var2, j35);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                k7 k7Var3 = (k7) m6.a(parcel, k7.CREATOR);
                long j36 = parcel.readLong();
                m6.d(parcel);
                onActivityStoppedByScionActivityInfo(k7Var3, j36);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                k7 k7Var4 = (k7) m6.a(parcel, k7.CREATOR);
                Bundle bundle10 = (Bundle) m6.a(parcel, Bundle.CREATOR);
                long j37 = parcel.readLong();
                m6.d(parcel);
                onActivityCreatedByScionActivityInfo(k7Var4, bundle10, j37);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                k7 k7Var5 = (k7) m6.a(parcel, k7.CREATOR);
                long j38 = parcel.readLong();
                m6.d(parcel);
                onActivityDestroyedByScionActivityInfo(k7Var5, j38);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                k7 k7Var6 = (k7) m6.a(parcel, k7.CREATOR);
                long j39 = parcel.readLong();
                m6.d(parcel);
                onActivityPausedByScionActivityInfo(k7Var6, j39);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                k7 k7Var7 = (k7) m6.a(parcel, k7.CREATOR);
                long j40 = parcel.readLong();
                m6.d(parcel);
                onActivityResumedByScionActivityInfo(k7Var7, j40);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                k7 k7Var8 = (k7) m6.a(parcel, k7.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    z6Var2 = iInterfaceQueryLocalInterface20 instanceof a7 ? (a7) iInterfaceQueryLocalInterface20 : new z6(strongBinder20);
                }
                long j41 = parcel.readLong();
                m6.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(k7Var8, z6Var2, j41);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    b7Var = iInterfaceQueryLocalInterface21 instanceof c7 ? (c7) iInterfaceQueryLocalInterface21 : new b7(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 1);
                }
                m6.d(parcel);
                retrieveAndUploadBatches(b7Var);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                Bundle bundle11 = (Bundle) m6.a(parcel, Bundle.CREATOR);
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                long j42 = parcel.readLong();
                long j43 = parcel.readLong();
                m6.d(parcel);
                logEventWithElapsedTime(string22, string23, bundle11, z13, z14, j42, j43);
                break;
            case 60:
                s9.a aVarX14 = s9.b.x1(parcel.readStrongBinder());
                i7 i7Var2 = (i7) m6.a(parcel, i7.CREATOR);
                long j44 = parcel.readLong();
                long j45 = parcel.readLong();
                m6.d(parcel);
                initializeWithElapsedTime(aVarX14, i7Var2, j44, j45);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                long j46 = parcel.readLong();
                long j47 = parcel.readLong();
                m6.d(parcel);
                resetAnalyticsDataWithElapsedTime(j46, j47);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
