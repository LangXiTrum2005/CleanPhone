package com.facebook.appevents.iap;

import an.h;
import an.o;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import q7.p;
import wj.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJM\u0010\u001b\u001a\u0004\u0018\u00010\u00182\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u001c\u0010\u001a\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00170\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJI\u0010#\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\b\u0010 \u001a\u0004\u0018\u00010\u00192\u0006\u0010!\u001a\u00020\u00152\b\b\u0002\u0010\"\u001a\u00020\u0015¢\u0006\u0004\b#\u0010$RB\u0010'\u001a0\u0012\u0004\u0012\u00020\u0011\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00170\u00170&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(RB\u0010)\u001a0\u0012\u0004\u0012\u00020\u0011\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00170\u00170&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseManager;", "", "<init>", "()V", "Lwj/r;", "enableAutoLogging", "startTracking", "", "version", "setSpecificBillingLibraryVersion", "(Ljava/lang/String;)V", "getSpecificBillingLibraryVersion", "()Ljava/lang/String;", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "getBillingClientVersion", "()Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "", "Lcom/facebook/appevents/iap/InAppPurchase;", "purchases", "", "time", "", "isImplicitlyLogged", "Lwj/f;", "Landroid/os/Bundle;", "Lcom/facebook/appevents/OperationalData;", "purchaseParameters", "performDedupe", "(Ljava/util/List;JZLjava/util/List;)Landroid/os/Bundle;", "newPurchaseParameters", "newPurchaseOperationalData", "oldPurchaseParameters", "oldPurchaseOperationalData", "dedupingWithImplicitlyLoggedHistory", "withTestDedupeKeys", "getDedupeParameter", "(Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;ZZ)Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "timesOfManualPurchases", "Ljava/util/concurrent/ConcurrentHashMap;", "timesOfImplicitPurchases", "specificBillingLibraryVersion", "Ljava/lang/String;", "GOOGLE_BILLINGCLIENT_VERSION", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InAppPurchaseManager {
    private static final String GOOGLE_BILLINGCLIENT_VERSION = "com.google.android.play.billingclient.version";
    private static String specificBillingLibraryVersion;
    public static final InAppPurchaseManager INSTANCE = new InAppPurchaseManager();
    private static final ConcurrentHashMap<InAppPurchase, List<f>> timesOfManualPurchases = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<InAppPurchase, List<f>> timesOfImplicitPurchases = new ConcurrentHashMap<>();
    private static final AtomicBoolean enabled = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InAppPurchaseUtils.BillingClientVersion.values().length];
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V2_V4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V5_V7.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private InAppPurchaseManager() {
    }

    public static final void enableAutoLogging() {
        if (v7.a.b(InAppPurchaseManager.class)) {
            return;
        }
        try {
            if (!AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()) {
                InAppPurchaseLoggerManager.updateLatestPossiblePurchaseTime();
            } else {
                enabled.set(true);
                startTracking();
            }
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseManager.class, th2);
        }
    }

    private final InAppPurchaseUtils.BillingClientVersion getBillingClientVersion() {
        try {
            if (v7.a.b(this)) {
                return null;
            }
            try {
                Context contextB = s.b();
                ApplicationInfo applicationInfo = contextB.getPackageManager().getApplicationInfo(contextB.getPackageName(), 128);
                n.e(applicationInfo, "context.packageManager.g…TA_DATA\n                )");
                String string = applicationInfo.metaData.getString(GOOGLE_BILLINGCLIENT_VERSION);
                if (string == null) {
                    return InAppPurchaseUtils.BillingClientVersion.NONE;
                }
                List listI0 = h.I0(string, new String[]{"."}, 3, 2);
                if (string.length() == 0) {
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                setSpecificBillingLibraryVersion("GPBL.".concat(string));
                Integer numE0 = o.e0((String) listI0.get(0));
                if (numE0 == null) {
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                int iIntValue = numE0.intValue();
                if (iIntValue == 1) {
                    return InAppPurchaseUtils.BillingClientVersion.V1;
                }
                return iIntValue < 5 ? InAppPurchaseUtils.BillingClientVersion.V2_V4 : InAppPurchaseUtils.BillingClientVersion.V5_V7;
            } catch (Exception unused) {
                return InAppPurchaseUtils.BillingClientVersion.V5_V7;
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public static /* synthetic */ String getDedupeParameter$default(InAppPurchaseManager inAppPurchaseManager, Bundle bundle, OperationalData operationalData, Bundle bundle2, OperationalData operationalData2, boolean z10, boolean z11, int i10, Object obj) {
        if (v7.a.b(InAppPurchaseManager.class)) {
            return null;
        }
        try {
            return inAppPurchaseManager.getDedupeParameter(bundle, operationalData, bundle2, operationalData2, z10, (i10 & 32) != 0 ? false : z11);
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseManager.class, th2);
            return null;
        }
    }

    public static final String getSpecificBillingLibraryVersion() {
        if (v7.a.b(InAppPurchaseManager.class)) {
            return null;
        }
        try {
            return specificBillingLibraryVersion;
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseManager.class, th2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final synchronized Bundle performDedupe(List<InAppPurchase> purchases, long time, boolean isImplicitlyLogged, List<f> purchaseParameters) {
        Bundle bundle;
        ?? r10;
        ?? ValueOf;
        ?? dedupeParameter$default;
        boolean z10;
        List<InAppPurchase> purchases2 = purchases;
        List<f> purchaseParameters2 = purchaseParameters;
        synchronized (InAppPurchaseManager.class) {
            Bundle bundle2 = null;
            if (v7.a.b(InAppPurchaseManager.class)) {
                return null;
            }
            try {
                n.f(purchases2, "purchases");
                n.f(purchaseParameters2, "purchaseParameters");
                if (purchaseParameters2.isEmpty()) {
                    return null;
                }
                if (purchases2.size() != purchaseParameters2.size()) {
                    return null;
                }
                ArrayList<f> arrayList = new ArrayList();
                int size = purchases2.size();
                ?? bundle3 = 0;
                int i10 = 0;
                while (i10 < size) {
                    InAppPurchase inAppPurchase = purchases2.get(i10);
                    f fVar = purchaseParameters2.get(i10);
                    Bundle bundle4 = (Bundle) fVar.f53283a;
                    OperationalData operationalData = (OperationalData) fVar.f53284b;
                    bundle = bundle2;
                    try {
                        int i11 = i10;
                        InAppPurchase inAppPurchase2 = new InAppPurchase(inAppPurchase.getEventName(), new BigDecimal(String.valueOf(inAppPurchase.getAmount())).setScale(2, RoundingMode.HALF_UP).doubleValue(), inAppPurchase.getCurrency());
                        List<f> list = isImplicitlyLogged ? timesOfManualPurchases.get(inAppPurchase2) : timesOfImplicitPurchases.get(inAppPurchase2);
                        List<f> list2 = list;
                        if (list2 == null || list2.isEmpty()) {
                            r10 = bundle;
                            ValueOf = r10;
                            dedupeParameter$default = ValueOf;
                            z10 = false;
                        } else {
                            r10 = bundle;
                            ValueOf = r10;
                            dedupeParameter$default = ValueOf;
                            z10 = false;
                            for (f fVar2 : list) {
                                long jLongValue = ((Number) fVar2.f53283a).longValue();
                                f fVar3 = (f) fVar2.f53284b;
                                Bundle bundle5 = (Bundle) fVar3.f53283a;
                                OperationalData operationalData2 = (OperationalData) fVar3.f53284b;
                                if (Math.abs(time - jLongValue) <= InAppPurchaseDedupeConfig.INSTANCE.getDedupeWindow() && (ValueOf == 0 || jLongValue < ValueOf.longValue())) {
                                    InAppPurchaseManager inAppPurchaseManager = INSTANCE;
                                    dedupeParameter$default = getDedupeParameter$default(inAppPurchaseManager, bundle4, operationalData, bundle5, operationalData2, !isImplicitlyLogged, false, 32, null);
                                    String dedupeParameter = inAppPurchaseManager.getDedupeParameter(bundle4, operationalData, bundle5, operationalData2, !isImplicitlyLogged, true);
                                    r10 = r10;
                                    if (dedupeParameter != null) {
                                        r10 = dedupeParameter;
                                    }
                                    if (dedupeParameter$default != 0) {
                                        ValueOf = Long.valueOf(jLongValue);
                                        arrayList.add(new f(inAppPurchase2, Long.valueOf(jLongValue)));
                                        z10 = true;
                                    }
                                }
                            }
                        }
                        if (r10 != 0) {
                            if (bundle3 == 0) {
                                bundle3 = new Bundle();
                            }
                            bundle3.putString(Constants.IAP_TEST_DEDUP_RESULT, "1");
                            bundle3.putString(Constants.IAP_TEST_DEDUP_KEY_USED, r10);
                        }
                        if (z10) {
                            if (bundle3 == 0) {
                                bundle3 = new Bundle();
                            }
                            bundle3.putString(Constants.IAP_NON_DEDUPED_EVENT_TIME, String.valueOf(ValueOf != 0 ? ValueOf.longValue() / ((long) 1000) : 0L));
                            bundle3.putString(Constants.IAP_ACTUAL_DEDUP_RESULT, "1");
                            bundle3.putString(Constants.IAP_ACTUAL_DEDUP_KEY_USED, dedupeParameter$default);
                        }
                        if (isImplicitlyLogged && !z10) {
                            ConcurrentHashMap<InAppPurchase, List<f>> concurrentHashMap = timesOfImplicitPurchases;
                            if (concurrentHashMap.get(inAppPurchase2) == null) {
                                concurrentHashMap.put(inAppPurchase2, new ArrayList());
                            }
                            List<f> list3 = concurrentHashMap.get(inAppPurchase2);
                            if (list3 != null) {
                                list3.add(new f(Long.valueOf(time), new f(bundle4, operationalData)));
                            }
                        } else if (!isImplicitlyLogged && !z10) {
                            ConcurrentHashMap<InAppPurchase, List<f>> concurrentHashMap2 = timesOfManualPurchases;
                            if (concurrentHashMap2.get(inAppPurchase2) == null) {
                                concurrentHashMap2.put(inAppPurchase2, new ArrayList());
                            }
                            List<f> list4 = concurrentHashMap2.get(inAppPurchase2);
                            if (list4 != null) {
                                list4.add(new f(Long.valueOf(time), new f(bundle4, operationalData)));
                            }
                        }
                        i10 = i11 + 1;
                        purchases2 = purchases;
                        purchaseParameters2 = purchaseParameters;
                        bundle2 = bundle;
                        bundle3 = bundle3;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                bundle = bundle2;
                for (f fVar4 : arrayList) {
                    List<f> list5 = isImplicitlyLogged ? timesOfManualPurchases.get(fVar4.f53283a) : timesOfImplicitPurchases.get(fVar4.f53283a);
                    if (list5 != null) {
                        Iterator<f> it = list5.iterator();
                        int i12 = 0;
                        while (it.hasNext()) {
                            int i13 = i12 + 1;
                            if (((Number) it.next().f53283a).longValue() == ((Number) fVar4.f53284b).longValue()) {
                                list5.remove(i12);
                                break;
                            }
                            i12 = i13;
                        }
                        if (isImplicitlyLogged) {
                            if (list5.isEmpty()) {
                                timesOfManualPurchases.remove(fVar4.f53283a);
                            } else {
                                timesOfManualPurchases.put((InAppPurchase) fVar4.f53283a, list5);
                            }
                        } else if (list5.isEmpty()) {
                            timesOfImplicitPurchases.remove(fVar4.f53283a);
                        } else {
                            timesOfImplicitPurchases.put((InAppPurchase) fVar4.f53283a, list5);
                        }
                    }
                }
                return bundle3;
            } catch (Throwable th3) {
                th = th3;
                bundle = bundle2;
            }
            v7.a.a(InAppPurchaseManager.class, th);
            return bundle;
        }
    }

    private static final void setSpecificBillingLibraryVersion(String version) {
        if (v7.a.b(InAppPurchaseManager.class)) {
            return;
        }
        try {
            specificBillingLibraryVersion = version;
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseManager.class, th2);
        }
    }

    public static final void startTracking() {
        if (v7.a.b(InAppPurchaseManager.class)) {
            return;
        }
        try {
            if (enabled.get()) {
                InAppPurchaseUtils.BillingClientVersion billingClientVersion = INSTANCE.getBillingClientVersion();
                int i10 = WhenMappings.$EnumSwitchMapping$0[billingClientVersion.ordinal()];
                if (i10 == 2) {
                    InAppPurchaseActivityLifecycleTracker.startIapLogging(InAppPurchaseUtils.BillingClientVersion.V1);
                    return;
                }
                if (i10 != 3) {
                    if (i10 == 4 && p.b(q7.n.IapLoggingLib5To7)) {
                        InAppPurchaseAutoLogger.startIapLogging(s.b(), billingClientVersion);
                        return;
                    }
                    return;
                }
                if (p.b(q7.n.IapLoggingLib2)) {
                    InAppPurchaseAutoLogger.startIapLogging(s.b(), billingClientVersion);
                } else {
                    InAppPurchaseActivityLifecycleTracker.startIapLogging(InAppPurchaseUtils.BillingClientVersion.V2_V4);
                }
            }
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseManager.class, th2);
        }
    }

    public final String getDedupeParameter(Bundle newPurchaseParameters, OperationalData newPurchaseOperationalData, Bundle oldPurchaseParameters, OperationalData oldPurchaseOperationalData, boolean dedupingWithImplicitlyLoggedHistory, boolean withTestDedupeKeys) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            List<f> testDedupeParameters = withTestDedupeKeys ? InAppPurchaseDedupeConfig.INSTANCE.getTestDedupeParameters(dedupingWithImplicitlyLoggedHistory) : InAppPurchaseDedupeConfig.INSTANCE.getDedupeParameters(dedupingWithImplicitlyLoggedHistory);
            if (testDedupeParameters == null) {
                return null;
            }
            for (f fVar : testDedupeParameters) {
                Object parameter = OperationalData.INSTANCE.getParameter(OperationalDataEnum.IAPParameters, (String) fVar.f53283a, newPurchaseParameters, newPurchaseOperationalData);
                String str = parameter instanceof String ? (String) parameter : null;
                if (str != null && str.length() != 0) {
                    for (String str2 : (List) fVar.f53284b) {
                        Object parameter2 = OperationalData.INSTANCE.getParameter(OperationalDataEnum.IAPParameters, str2, oldPurchaseParameters, oldPurchaseOperationalData);
                        String str3 = parameter2 instanceof String ? (String) parameter2 : null;
                        if (str3 != null && str3.length() != 0 && n.a(str3, str)) {
                            return dedupingWithImplicitlyLoggedHistory ? (String) fVar.f53283a : str2;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }
}
