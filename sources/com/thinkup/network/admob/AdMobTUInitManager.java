package com.thinkup.network.admob;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.p004ironsource.x4;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.api.TUSDKGlobalSetting;
import com.thinkup.core.common.n.mo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class AdMobTUInitManager extends TUInitMediation {
    private static final String m0 = "AdMobTUInitManager";
    private static volatile AdMobTUInitManager mm;
    long m;
    private boolean mn;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f42488n;
    private boolean n0;
    Context o;
    long o0;
    String om;
    long oo;
    private int no = 0;
    private Map<String, Object> nm = new ConcurrentHashMap();
    volatile int on = 0;
    private boolean mo = false;

    private AdMobTUInitManager() {
    }

    public static AdMobTUInitManager getInstance() {
        if (mm == null) {
            synchronized (AdMobTUInitManager.class) {
                try {
                    if (mm == null) {
                        mm = new AdMobTUInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mm;
    }

    private Bundle m(Context context, Map<String, Object> map, Map<String, Object> map2, AdFormat adFormat, boolean z2) {
        AdSize adSizeO;
        Context context2;
        Context context3;
        Bundle bundle = new Bundle();
        try {
            if (map.containsKey("gdpr_consent")) {
                if (((Boolean) map.get("gdpr_consent")).booleanValue()) {
                    bundle.putString("npa", "0");
                } else {
                    bundle.putString("npa", "1");
                }
            }
        } catch (Throwable unused) {
        }
        try {
            if (this.mn) {
                bundle.putString("rdp", "1");
                if (this.on != 1 && (context3 = this.o) != null) {
                    PreferenceManager.getDefaultSharedPreferences(context3).edit().putInt("gad_rdp", 1).apply();
                    this.on = 1;
                }
            } else if (this.on == 1 && (context2 = this.o) != null) {
                PreferenceManager.getDefaultSharedPreferences(context2).edit().remove("gad_rdp").apply();
                this.on = 0;
            }
        } catch (Throwable unused2) {
        }
        if (z2) {
            bundle.putString("query_info_type", "requester_type_2");
            if (adFormat == AdFormat.BANNER && (adSizeO = AdmobTUConst.o(context, map2, map)) != null) {
                bundle.putInt("adaptive_banner_w", adSizeO.getWidth());
                bundle.putInt("adaptive_banner_h", adSizeO.getHeight());
            }
        }
        int intFromMap = TUInitMediation.getIntFromMap(map, "admob_clbn_sw", 1);
        if (adFormat == AdFormat.BANNER) {
            if (intFromMap == 2) {
                bundle.putString("collapsible", "bottom");
            } else if (intFromMap == 3) {
                bundle.putString("collapsible", "top");
            }
        }
        if (map.containsKey("admob_hybrid_status")) {
            bundle.putBoolean("is_hybrid_setup", TUInitMediation.getBooleanFromMap(map, "admob_hybrid_status", false));
        }
        String stringFromMap = TUInitMediation.getStringFromMap(map, "mediation_request_id", "");
        if (!TextUtils.isEmpty(stringFromMap)) {
            bundle.putString("placement_req_id", stringFromMap);
        }
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005e A[Catch: all -> 0x000c, TryCatch #2 {all -> 0x000c, blocks: (B:4:0x0002, B:7:0x0008, B:10:0x000f, B:21:0x003d, B:23:0x0045, B:29:0x0053, B:30:0x0056, B:32:0x005e, B:33:0x00cb, B:34:0x00cd, B:24:0x004a), top: B:50:0x0002, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #1 {all -> 0x00d4, blocks: (B:3:0x0001, B:36:0x00d0, B:39:0x00d6, B:40:0x00d7, B:4:0x0002, B:7:0x0008, B:10:0x000f, B:21:0x003d, B:23:0x0045, B:29:0x0053, B:30:0x0056, B:32:0x005e, B:33:0x00cb, B:34:0x00cd, B:24:0x004a), top: B:49:0x0001, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    private void o(MediationInitCallback mediationInitCallback, Map<String, Object> map, Context context) {
        boolean zBooleanValue;
        try {
            synchronized (this) {
                try {
                    if (this.mo) {
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                        return;
                    }
                    try {
                        Object obj = map.get("mediation_switch");
                        if (obj != null && !((Boolean) obj).booleanValue()) {
                            if (TUSDK.isNetworkLogDebug()) {
                                Log.i(m0, "disableMediationAdapterInitialization");
                            }
                            MobileAds.disableMediationAdapterInitialization(context);
                        }
                    } catch (Throwable unused) {
                    }
                    try {
                        this.on = PreferenceManager.getDefaultSharedPreferences(context).getInt("gad_rdp", 0);
                    } catch (Throwable unused2) {
                    }
                    MobileAds.initialize(context);
                    Boolean bool = TUSDKGlobalSetting.isGlobalMute;
                    if (bool == null) {
                        int i2 = this.no;
                        if (i2 != 0) {
                            zBooleanValue = i2 == 1;
                        }
                        if (this.f42488n == 0) {
                            this.f42488n = System.currentTimeMillis();
                            HashMap map2 = new HashMap();
                            map2.put("init_st", Long.valueOf(this.m));
                            map2.put("init_et", Long.valueOf(this.f42488n));
                            map2.put("token_st", Long.valueOf(this.o0));
                            map2.put("token_et", Long.valueOf(this.oo));
                            map2.put("admob_init_mode", Integer.valueOf(TUInitMediation.getIntFromMap(map, "admob_init_mode", 1)));
                            map2.put("ad_format", TUInitMediation.getStringFromMap(map, "ad_format", x4.DISABLED_AUCTION_FALLBACK_ID));
                            map2.put("admob_init_adsource_id", TUInitMediation.getStringFromMap(map, "admob_adsource_id", ""));
                            map2.put("admob_token_adsource_id", this.om);
                            sendNetworkEvent(2, 10001, map2);
                        }
                        this.mo = true;
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                    }
                    zBooleanValue = bool.booleanValue();
                    MobileAds.setAppMuted(zBooleanValue);
                    if (this.f42488n == 0) {
                        this.f42488n = System.currentTimeMillis();
                        HashMap map3 = new HashMap();
                        map3.put("init_st", Long.valueOf(this.m));
                        map3.put("init_et", Long.valueOf(this.f42488n));
                        map3.put("token_st", Long.valueOf(this.o0));
                        map3.put("token_et", Long.valueOf(this.oo));
                        map3.put("admob_init_mode", Integer.valueOf(TUInitMediation.getIntFromMap(map, "admob_init_mode", 1)));
                        map3.put("ad_format", TUInitMediation.getStringFromMap(map, "ad_format", x4.DISABLED_AUCTION_FALLBACK_ID));
                        map3.put("admob_init_adsource_id", TUInitMediation.getStringFromMap(map, "admob_adsource_id", ""));
                        map3.put("admob_token_adsource_id", this.om);
                        sendNetworkEvent(2, 10001, map3);
                    }
                    this.mo = true;
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onSuccess();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            this.mo = false;
            if (mediationInitCallback != null) {
                mediationInitCallback.onFail(th2.getMessage());
            }
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.36";
    }

    public Method getAppOpenLoadMethod() {
        if (!isLowestFor2400()) {
            return null;
        }
        try {
            return AppOpenAd.class.getDeclaredMethod("load", Context.class, String.class, AdRequest.class, Integer.TYPE, AppOpenAd.AppOpenAdLoadCallback.class);
        } catch (Throwable th) {
            Log.e(m0, "startLoadSplashAd() >>> network version: +" + getNetworkVersion() + ", reflect method error: " + th.getMessage());
            return null;
        }
    }

    public String getGoogleAdManagerName() {
        return "Google Ad Manager";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public List getMetaValutStatus() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.google.android.gms.ads.APPLICATION_ID");
        return arrayList;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkName() {
        return "Admob";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkSDKClass() {
        return "com.google.android.gms.ads.MobileAdsInitProvider";
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public String getNetworkVersion() {
        return AdmobTUConst.getNetworkVersion();
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public Map<String, Boolean> getPluginClassStatus() {
        HashMap map = new HashMap();
        Boolean bool = Boolean.FALSE;
        map.put("play-services-ads-*.aar", bool);
        map.put("play-services-ads-base-*.aar", bool);
        map.put("play-services-ads-lite-*.aar", bool);
        map.put("play-services-ads-identifier-*.aar", bool);
        map.put("play-services-basement-*.aar", bool);
        map.put("play-services-measurement-sdk-api-*.aar", bool);
        map.put("play-services-tasks-*.aar", bool);
        try {
            map.put("play-services-tasks-*.aar", Boolean.TRUE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            map.put("play-services-ads-*.aar", Boolean.TRUE);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            map.put("play-services-ads-base-*.aar", Boolean.TRUE);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            map.put("play-services-ads-lite-*.aar", Boolean.TRUE);
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        try {
            map.put("play-services-ads-identifier-*.aar", Boolean.TRUE);
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        try {
            map.put("play-services-basement-*.aar", Boolean.TRUE);
        } catch (Throwable th6) {
            th6.printStackTrace();
        }
        try {
            map.put("play-services-measurement-sdk-api-*.aar", Boolean.TRUE);
        } catch (Throwable th7) {
            th7.printStackTrace();
        }
        return map;
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public void initSDK(Context context, final Map<String, Object> map, final MediationInitCallback mediationInitCallback) {
        if (this.m == 0) {
            this.m = System.currentTimeMillis();
        }
        if (this.mo) {
            if (mediationInitCallback != null) {
                mediationInitCallback.onSuccess();
                return;
            }
            return;
        }
        this.mn = TUInitMediation.getBooleanFromMap(map, "app_ccpa_switch");
        try {
            this.n0 = TUInitMediation.getBooleanFromMap(map, "app_coppa_switch");
            RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
            if (requestConfiguration == null) {
                requestConfiguration = new RequestConfiguration.Builder().build();
            }
            if (this.n0) {
                MobileAds.setRequestConfiguration(requestConfiguration.toBuilder().setTagForChildDirectedTreatment(1).build());
            }
        } catch (Throwable unused) {
        }
        this.o = context.getApplicationContext();
        runOnThreadPool(new Runnable() { // from class: com.thinkup.network.admob.AdMobTUInitManager.1
            @Override // java.lang.Runnable
            public final void run() {
                AdMobTUInitManager adMobTUInitManager = AdMobTUInitManager.this;
                AdMobTUInitManager.o(adMobTUInitManager, mediationInitCallback, map, adMobTUInitManager.o);
            }
        });
    }

    public boolean isLowestFor2400() {
        try {
            return Integer.parseInt(getNetworkVersion().replace(mo.ono, "")) < 2400;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setAdmobAppMuted(boolean z2) {
        if (this.mo) {
            MobileAds.setAppMuted(z2);
        } else {
            this.no = z2 ? 1 : 2;
        }
    }

    @Override // com.thinkup.core.api.TUInitMediation
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return false;
    }

    public final void o(String str, Object obj) {
        this.nm.put(str, new WeakReference(obj));
    }

    public final void o(String str) {
        this.nm.remove(str);
    }

    public static void o(Map<String, Object> map, AdValue adValue) {
        if (adValue == null || map == null) {
            return;
        }
        map.put("value_micros", Long.valueOf(adValue.getValueMicros()));
        map.put("currency_code", adValue.getCurrencyCode());
        map.put("precision_type", Integer.valueOf(adValue.getPrecisionType()));
    }

    private static List<String> m(Map<String, Object> map) {
        if (!map.containsKey(AdmobTUConst.CONTENT_URLS)) {
            return null;
        }
        try {
            Object obj = map.get(AdmobTUConst.CONTENT_URLS);
            if (!(obj instanceof List)) {
                return null;
            }
            Iterator it = ((List) obj).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            return arrayList;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private static void o(Map<String, Object> map, Map<String, Object> map2, AdRequest.Builder builder) {
        try {
            List<String> listM = m(map2);
            if (listM == null || listM.size() == 0) {
                listM = o(map);
            }
            if (listM != null && listM.size() > 0) {
                if (TUSDK.isNetworkLogDebug()) {
                    listM.size();
                    for (int i2 = 0; i2 < listM.size(); i2++) {
                        listM.get(i2);
                    }
                }
                if (listM.size() == 1) {
                    builder.setContentUrl(listM.get(0));
                } else {
                    builder.setNeighboringContentUrls(listM);
                }
            }
            Object obj = map2.get(AdmobTUConst.CONTENT_KEYWORDS);
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return;
                }
                for (Object obj2 : list) {
                    if (TUSDK.isNetworkLogDebug()) {
                        Objects.toString(obj2);
                    }
                    if (obj2 instanceof String) {
                        builder.addKeyword((String) obj2);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static List<String> o(Map<String, Object> map) {
        if (!map.containsKey("web_content_urls")) {
            return null;
        }
        try {
            Object obj = map.get("web_content_urls");
            if (!(obj instanceof JSONArray)) {
                return null;
            }
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
            return arrayList;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public final AdRequest.Builder o(Context context, Map<String, Object> map, Map<String, Object> map2, AdFormat adFormat, boolean z2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        o(map, map2, builder);
        try {
            String stringFromMap = TUInitMediation.getStringFromMap(map, mo.oon.o0m, "");
            if (!TextUtils.isEmpty(stringFromMap)) {
                builder.setRequestAgent(stringFromMap);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        builder.addNetworkExtrasBundle(AdMobAdapter.class, m(context, map, map2, adFormat, z2));
        return builder;
    }

    public final AdManagerAdRequest.Builder o(Context context, Map<String, Object> map, Map<String, Object> map2, AdFormat adFormat) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, m(context, map, map2, adFormat, false));
        return builder;
    }

    public final void o(final Context context, final Map<String, Object> map, final Map<String, Object> map2, final AdFormat adFormat, final TUBidRequestInfoListener tUBidRequestInfoListener) {
        if (this.o0 == 0) {
            this.o0 = System.currentTimeMillis();
            this.om = TUInitMediation.getStringFromMap(map, "admob_adsource_id", "");
        }
        runOnThreadPool(new Runnable() { // from class: com.thinkup.network.admob.AdMobTUInitManager.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    QueryInfo.generate(context, adFormat, AdMobTUInitManager.this.o(context, map, map2, adFormat, true).build(), new QueryInfoGenerationCallback() { // from class: com.thinkup.network.admob.AdMobTUInitManager.2.1
                        @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
                        public final void onFailure(String str) {
                            TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                            if (tUBidRequestInfoListener2 != null) {
                                tUBidRequestInfoListener2.onFailed(str);
                            }
                        }

                        @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
                        public final void onSuccess(QueryInfo queryInfo) {
                            String query = queryInfo != null ? queryInfo.getQuery() : "";
                            if (TextUtils.isEmpty(query)) {
                                TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                                if (tUBidRequestInfoListener2 != null) {
                                    tUBidRequestInfoListener2.onFailed("Admob QueryInfo is empty.");
                                    return;
                                }
                                return;
                            }
                            AdMobTUInitManager adMobTUInitManager = AdMobTUInitManager.this;
                            if (adMobTUInitManager.oo == 0) {
                                adMobTUInitManager.oo = System.currentTimeMillis();
                            }
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            AdmobBidRequestInfo admobBidRequestInfo = new AdmobBidRequestInfo(context, query, map, map2, adFormat);
                            TUBidRequestInfoListener tUBidRequestInfoListener3 = tUBidRequestInfoListener;
                            if (tUBidRequestInfoListener3 != null) {
                                tUBidRequestInfoListener3.onSuccess(admobBidRequestInfo);
                            }
                            if (TUInitMediation.getIntFromMap(map, "admob_init_mode", 1) == 2) {
                                AdMobTUInitManager adMobTUInitManager2 = AdMobTUInitManager.getInstance();
                                AnonymousClass2 anonymousClass3 = AnonymousClass2.this;
                                adMobTUInitManager2.initSDK(context, map, null);
                            }
                        }
                    });
                } catch (Throwable th) {
                    TUBidRequestInfoListener tUBidRequestInfoListener2 = tUBidRequestInfoListener;
                    if (tUBidRequestInfoListener2 != null) {
                        tUBidRequestInfoListener2.onFailed("Admob QueryInfo.generate() error: " + th.getMessage());
                    }
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005e A[Catch: all -> 0x000c, TryCatch #2 {all -> 0x000c, blocks: (B:4:0x0002, B:7:0x0008, B:10:0x000f, B:21:0x003d, B:23:0x0045, B:29:0x0053, B:30:0x0056, B:32:0x005e, B:33:0x00cb, B:34:0x00cd, B:24:0x004a), top: B:50:0x0002, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #1 {all -> 0x00d4, blocks: (B:3:0x0001, B:36:0x00d0, B:39:0x00d6, B:40:0x00d7, B:4:0x0002, B:7:0x0008, B:10:0x000f, B:21:0x003d, B:23:0x0045, B:29:0x0053, B:30:0x0056, B:32:0x005e, B:33:0x00cb, B:34:0x00cd, B:24:0x004a), top: B:49:0x0001, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ void o(AdMobTUInitManager adMobTUInitManager, MediationInitCallback mediationInitCallback, Map map, Context context) {
        boolean zBooleanValue;
        try {
            synchronized (adMobTUInitManager) {
                try {
                    if (adMobTUInitManager.mo) {
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                        return;
                    }
                    try {
                        Object obj = map.get("mediation_switch");
                        if (obj != null && !((Boolean) obj).booleanValue()) {
                            if (TUSDK.isNetworkLogDebug()) {
                                Log.i(m0, "disableMediationAdapterInitialization");
                            }
                            MobileAds.disableMediationAdapterInitialization(context);
                        }
                    } catch (Throwable unused) {
                    }
                    try {
                        adMobTUInitManager.on = PreferenceManager.getDefaultSharedPreferences(context).getInt("gad_rdp", 0);
                    } catch (Throwable unused2) {
                    }
                    MobileAds.initialize(context);
                    Boolean bool = TUSDKGlobalSetting.isGlobalMute;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        int i2 = adMobTUInitManager.no;
                        if (i2 != 0) {
                            zBooleanValue = i2 == 1;
                        }
                        if (adMobTUInitManager.f42488n == 0) {
                            adMobTUInitManager.f42488n = System.currentTimeMillis();
                            HashMap map2 = new HashMap();
                            map2.put("init_st", Long.valueOf(adMobTUInitManager.m));
                            map2.put("init_et", Long.valueOf(adMobTUInitManager.f42488n));
                            map2.put("token_st", Long.valueOf(adMobTUInitManager.o0));
                            map2.put("token_et", Long.valueOf(adMobTUInitManager.oo));
                            map2.put("admob_init_mode", Integer.valueOf(TUInitMediation.getIntFromMap(map, "admob_init_mode", 1)));
                            map2.put("ad_format", TUInitMediation.getStringFromMap(map, "ad_format", x4.DISABLED_AUCTION_FALLBACK_ID));
                            map2.put("admob_init_adsource_id", TUInitMediation.getStringFromMap(map, "admob_adsource_id", ""));
                            map2.put("admob_token_adsource_id", adMobTUInitManager.om);
                            adMobTUInitManager.sendNetworkEvent(2, 10001, map2);
                        }
                        adMobTUInitManager.mo = true;
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                    }
                    MobileAds.setAppMuted(zBooleanValue);
                    if (adMobTUInitManager.f42488n == 0) {
                        adMobTUInitManager.f42488n = System.currentTimeMillis();
                        HashMap map3 = new HashMap();
                        map3.put("init_st", Long.valueOf(adMobTUInitManager.m));
                        map3.put("init_et", Long.valueOf(adMobTUInitManager.f42488n));
                        map3.put("token_st", Long.valueOf(adMobTUInitManager.o0));
                        map3.put("token_et", Long.valueOf(adMobTUInitManager.oo));
                        map3.put("admob_init_mode", Integer.valueOf(TUInitMediation.getIntFromMap(map, "admob_init_mode", 1)));
                        map3.put("ad_format", TUInitMediation.getStringFromMap(map, "ad_format", x4.DISABLED_AUCTION_FALLBACK_ID));
                        map3.put("admob_init_adsource_id", TUInitMediation.getStringFromMap(map, "admob_adsource_id", ""));
                        map3.put("admob_token_adsource_id", adMobTUInitManager.om);
                        adMobTUInitManager.sendNetworkEvent(2, 10001, map3);
                    }
                    adMobTUInitManager.mo = true;
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onSuccess();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            adMobTUInitManager.mo = false;
            if (mediationInitCallback != null) {
                mediationInitCallback.onFail(th2.getMessage());
            }
        }
    }
}
