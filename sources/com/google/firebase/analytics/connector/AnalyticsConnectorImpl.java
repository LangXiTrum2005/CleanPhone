package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzlt;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.analytics.connector.internal.zzg;
import com.google.firebase.events.Subscriber;
import com.google.firebase.internal.DataCollectionConfigStorage;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class AnalyticsConnectorImpl implements AnalyticsConnector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile AnalyticsConnectorImpl f20183c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f20184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f20185b;

    /* JADX INFO: renamed from: com.google.firebase.analytics.connector.AnalyticsConnectorImpl$1, reason: invalid class name */
    class AnonymousClass1 implements AnalyticsConnector.AnalyticsConnectorHandle {
    }

    public AnalyticsConnectorImpl(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f20184a = appMeasurementSdk;
        this.f20185b = new ConcurrentHashMap();
    }

    public static AnalyticsConnector h(FirebaseApp firebaseApp, Context context, Subscriber subscriber) {
        boolean z2;
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(subscriber);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f20183c == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                if (f20183c == null) {
                    Bundle bundle = new Bundle(1);
                    firebaseApp.a();
                    if ("[DEFAULT]".equals(firebaseApp.f20146b)) {
                        subscriber.a(zzb.X, zza.f20195a);
                        firebaseApp.a();
                        DataCollectionConfigStorage dataCollectionConfigStorage = (DataCollectionConfigStorage) firebaseApp.g.get();
                        synchronized (dataCollectionConfigStorage) {
                            z2 = dataCollectionConfigStorage.f20900c;
                        }
                        bundle.putBoolean("dataCollectionDefaultEnabled", z2);
                    }
                    f20183c = new AnalyticsConnectorImpl(zzfb.zza(context, bundle).zzb());
                }
            }
        }
        return f20183c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final void a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        ImmutableSet immutableSet = zzc.f20186a;
        String str = conditionalUserProperty.f20175a;
        if (str == null || str.isEmpty()) {
            return;
        }
        Object obj = conditionalUserProperty.f20177c;
        if ((obj == null || zzlt.zzb(obj) != null) && !zzc.f20188c.contains(str)) {
            String str2 = conditionalUserProperty.f20176b;
            if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
                if (!str.equals(AppMeasurement.FCM_ORIGIN) && !str.equals("frc")) {
                    return;
                }
            } else if ("_ln".equals(str2)) {
                if (!str.equals(AppMeasurement.FCM_ORIGIN) && !str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    return;
                }
            } else {
                if (zzc.f20189e.contains(str2)) {
                    return;
                }
                ImmutableList immutableList = zzc.f;
                int size = immutableList.size();
                int i2 = 0;
                while (i2 < size) {
                    boolean zMatches = str2.matches((String) immutableList.get(i2));
                    i2++;
                    if (zMatches) {
                        return;
                    }
                }
            }
            String str3 = conditionalUserProperty.k;
            if (str3 != null) {
                if (!zzc.a(conditionalUserProperty.f20181l, str3)) {
                    return;
                }
                if (!zzc.b(conditionalUserProperty.f20181l, str, conditionalUserProperty.k)) {
                    return;
                }
            }
            String str4 = conditionalUserProperty.f20179h;
            if (str4 != null) {
                if (!zzc.a(conditionalUserProperty.f20180i, str4)) {
                    return;
                }
                if (!zzc.b(conditionalUserProperty.f20180i, str, conditionalUserProperty.f20179h)) {
                    return;
                }
            }
            String str5 = conditionalUserProperty.f;
            if (str5 != null) {
                if (!zzc.a(conditionalUserProperty.g, str5)) {
                    return;
                }
                if (!zzc.b(conditionalUserProperty.g, str, conditionalUserProperty.f)) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            String str6 = conditionalUserProperty.f20175a;
            if (str6 != null) {
                bundle.putString("origin", str6);
            }
            String str7 = conditionalUserProperty.f20176b;
            if (str7 != null) {
                bundle.putString("name", str7);
            }
            Object obj2 = conditionalUserProperty.f20177c;
            if (obj2 != null) {
                zzjh.zza(bundle, obj2);
            }
            String str8 = conditionalUserProperty.d;
            if (str8 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str8);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, conditionalUserProperty.f20178e);
            String str9 = conditionalUserProperty.f;
            if (str9 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str9);
            }
            Bundle bundle2 = conditionalUserProperty.g;
            if (bundle2 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
            }
            String str10 = conditionalUserProperty.f20179h;
            if (str10 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str10);
            }
            Bundle bundle3 = conditionalUserProperty.f20180i;
            if (bundle3 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, conditionalUserProperty.j);
            String str11 = conditionalUserProperty.k;
            if (str11 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str11);
            }
            Bundle bundle4 = conditionalUserProperty.f20181l;
            if (bundle4 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, conditionalUserProperty.m);
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, conditionalUserProperty.f20182n);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, conditionalUserProperty.o);
            this.f20184a.setConditionalUserProperty(bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f20184a.getConditionalUserProperties("frc", "")) {
            ImmutableSet immutableSet = zzc.f20186a;
            Preconditions.checkNotNull(bundle);
            AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
            conditionalUserProperty.f20175a = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "origin", String.class, null));
            conditionalUserProperty.f20176b = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "name", String.class, null));
            conditionalUserProperty.f20177c = zzjh.zzb(bundle, "value", Object.class, null);
            conditionalUserProperty.d = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            conditionalUserProperty.f20178e = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            conditionalUserProperty.f = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            conditionalUserProperty.g = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            conditionalUserProperty.f20179h = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            conditionalUserProperty.f20180i = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            conditionalUserProperty.j = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            conditionalUserProperty.k = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            conditionalUserProperty.f20181l = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            conditionalUserProperty.f20182n = ((Boolean) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.m = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            conditionalUserProperty.o = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final void c(String str, String str2, Bundle bundle) {
        if (!zzc.f20188c.contains(str) && zzc.a(bundle, str2) && zzc.b(bundle, str, str2)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f20184a.logEvent(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final void d(String str) {
        this.f20184a.clearConditionalUserProperty(str, null, null);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final Map e(boolean z2) {
        return this.f20184a.getUserProperties(null, null, z2);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final int f() {
        return this.f20184a.getMaxUserProperties("frc");
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public final AnalyticsConnector.AnalyticsConnectorHandle g(String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        com.google.firebase.analytics.connector.internal.zza zzgVar;
        Preconditions.checkNotNull(analyticsConnectorListener);
        if (!zzc.f20188c.contains(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f20185b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = AppMeasurement.FIAM_ORIGIN.equals(str);
                AppMeasurementSdk appMeasurementSdk = this.f20184a;
                if (zEquals) {
                    zzgVar = new zze(appMeasurementSdk, analyticsConnectorListener);
                } else {
                    zzgVar = "clx".equals(str) ? new zzg(appMeasurementSdk, analyticsConnectorListener) : null;
                }
                if (zzgVar != null) {
                    concurrentHashMap.put(str, zzgVar);
                    return new AnonymousClass1();
                }
            }
        }
        return null;
    }
}
