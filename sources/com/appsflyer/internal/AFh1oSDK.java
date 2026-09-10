package com.appsflyer.internal;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.migration.internal.MigrationDataProvider;
import com.ironsource.D1;
import com.ironsource.Ua;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFh1oSDK implements AFh1pSDK {
    private final AFc1oSDK AFAdRevenueData;
    private boolean component3;
    private boolean component4;
    private Long getCurrencyIso4217Code;
    private final AFj1sSDK getMediationNetwork;
    private JSONObject getMonetizationNetwork;
    private Long getRevenue;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFe1pSDK.values().length];
            try {
                iArr[AFe1pSDK.LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1pSDK.ATTR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AFAdRevenueData = iArr;
        }
    }

    public AFh1oSDK(AFc1oSDK aFc1oSDK, AFj1sSDK aFj1sSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFj1sSDK, "");
        this.AFAdRevenueData = aFc1oSDK;
        this.getMediationNetwork = aFj1sSDK;
    }

    private final void AFAdRevenueData(String str, AFh1mSDK aFh1mSDK, JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put(str, jSONObject);
        HashMap map2 = new HashMap();
        map2.put("branch", map);
        HashMap map3 = new HashMap();
        map3.put(D1.e, map2);
        aFh1mSDK.AFAdRevenueData(map3);
        Map<String, Object> map4 = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        AFe1pSDK aFe1pSDKAFAdRevenueData = aFh1mSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(aFe1pSDKAFAdRevenueData, "");
        getMonetizationNetwork(map4, aFe1pSDKAFAdRevenueData);
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        JSONObject attributionData = MigrationDataProvider.getAttributionData();
        if (attributionData != null) {
            AFAdRevenueData("attr", aFh1mSDK, attributionData);
            this.component3 = true;
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        JSONObject jSONObject = this.getMonetizationNetwork;
        if (jSONObject != null) {
            Intrinsics.beachfront(jSONObject);
            AFAdRevenueData("attr", aFh1mSDK, jSONObject);
        } else {
            JSONObject mediationNetwork = getMediationNetwork();
            if (mediationNetwork != null) {
                AFAdRevenueData("attr", aFh1mSDK, mediationNetwork);
            }
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getMonetizationNetwork(AFf1rSDK aFf1rSDK, Function0<Unit> function0) {
        JSONObject mediationNetwork;
        Intrinsics.checkNotNullParameter(aFf1rSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.AFAdRevenueData.getMediationNetwork.getRevenue("appsFlyerCount", 0) == 1 && aFf1rSDK.getRevenue == AFe1pSDK.CONVERSION && this.getMediationNetwork.getMediationNetwork() && !getRevenue() && (mediationNetwork = getMediationNetwork()) != null) {
            this.getMonetizationNetwork = mediationNetwork;
            function0.invoke();
        }
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final boolean getRevenue() {
        return this.component3;
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void u_(Intent intent, AFa1mSDK aFa1mSDK) throws Throwable {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        if (MigrationDataProvider.waitForDeepLinkingData(0L) != null) {
            this.component4 = true;
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        try {
            Object[] objArr = {data, aFa1mSDK};
            Map map = AFa1hSDK.d;
            Object declaredConstructor = map.get(862139947);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1hSDK.getRevenue((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (62049 - ExpandableListView.getPackedPositionGroup(0L)), 37 - (ViewConfiguration.getTouchSlop() >> 8))).getDeclaredConstructor(Uri.class, AFa1mSDK.class);
                map.put(862139947, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
            Object method = map.get(-180621578);
            if (method == null) {
                method = ((Class) AFa1hSDK.getRevenue((-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (62050 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36)).getMethod("getMediationNetwork", null);
                map.put(-180621578, method);
            }
            Object objInvoke = ((Method) method).invoke(objNewInstance, null);
            Object method2 = map.get(614194017);
            if (method2 == null) {
                method2 = ((Class) AFa1hSDK.getRevenue(Color.blue(0) + 37, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 52 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod("AFAdRevenueData", null);
                map.put(614194017, method2);
            }
            this.component4 = !((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final JSONObject getMediationNetwork() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectWaitForAttributionData = MigrationDataProvider.waitForAttributionData(Ua.C);
        if (jSONObjectWaitForAttributionData != null) {
            this.getCurrencyIso4217Code = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        }
        return jSONObjectWaitForAttributionData;
    }

    private final void getMonetizationNetwork(Map<String, Object> map, AFe1pSDK aFe1pSDK) {
        Long l;
        int i = AFa1uSDK.AFAdRevenueData[aFe1pSDK.ordinal()];
        if (i != 1) {
            l = i != 2 ? null : this.getCurrencyIso4217Code;
        } else {
            l = this.getRevenue;
        }
        if (l != null) {
            long jLongValue = l.longValue();
            Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork(map);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            mediationNetwork.put("migration", p002kotlin.collections.polder.beachfront(patroclinal.formularize.attabal("delay", Long.valueOf(jLongValue))));
        }
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void AFAdRevenueData() {
        this.component4 = false;
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final boolean getMonetizationNetwork() {
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectWaitForDeepLinkingData = MigrationDataProvider.waitForDeepLinkingData(Ua.C);
        if (jSONObjectWaitForDeepLinkingData != null) {
            this.getRevenue = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            AFAdRevenueData("dl", aFh1mSDK, jSONObjectWaitForDeepLinkingData);
        }
        MigrationDataProvider.clear();
    }
}
