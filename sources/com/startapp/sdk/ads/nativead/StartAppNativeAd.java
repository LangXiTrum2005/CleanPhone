package com.startapp.sdk.ads.nativead;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.b2;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.qd;
import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class StartAppNativeAd extends Ad {
    private boolean belowMinCpm;
    private List<NativeAdDetails> listNativeAds;
    private final AtomicBoolean loading;
    private NativeAdPreferences preferences;

    public enum CampaignAction {
        LAUNCH_APP,
        OPEN_MARKET
    }

    public StartAppNativeAd(Context context) {
        this(context, com.startapp.sdk.components.a.a(context).K, com.startapp.sdk.components.a.a(context).j, com.startapp.sdk.components.a.a(context).M, com.startapp.sdk.components.a.a(context).f40730N, com.startapp.sdk.components.a.a(context).f40735b, com.startapp.sdk.components.a.a(context).f40741n, com.startapp.sdk.components.a.a(context).f40724A, com.startapp.sdk.components.a.a(context).f40744w, com.startapp.sdk.components.a.a(context).f40736c);
    }

    private List<AdDetails> getAdDetailsList() {
        ArrayList arrayList = new ArrayList();
        Iterator<NativeAdDetails> it = this.listNativeAds.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getAdDetails());
        }
        return arrayList;
    }

    private AdDetails getFirstAdDetails() {
        NativeAdDetails nativeAdDetails;
        if (this.listNativeAds.size() <= 0 || (nativeAdDetails = this.listNativeAds.get(0)) == null) {
            return null;
        }
        return nativeAdDetails.getAdDetails();
    }

    private NativeAdPreferences getPreferences() {
        NativeAdPreferences nativeAdPreferences = this.preferences;
        if (nativeAdPreferences != null) {
            return nativeAdPreferences;
        }
        NativeAdPreferences nativeAdPreferences2 = new NativeAdPreferences();
        this.preferences = nativeAdPreferences2;
        return nativeAdPreferences2;
    }

    public static String getPrivacyImageUrl() {
        return AdInformationMetaData.c().d();
    }

    public static String getPrivacyURL() {
        if (AdInformationMetaData.c().b() == null) {
            return "";
        }
        String strB = AdInformationMetaData.c().b();
        if (strB.contains("http://") || strB.contains("https://")) {
            return AdInformationMetaData.c().b();
        }
        return "https://" + AdInformationMetaData.c().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onReceiveAd(AdEventListener adEventListener) {
        setErrorMessage(null);
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.f);
        ((z6) ((y6) this.eventTracer.a())).b(this, ii.f41105b);
        a0.b(this.context, adEventListener, this, false);
        this.loading.set(false);
    }

    private NativeAdPreferences prepareAdPreferences() {
        String name;
        NativeAdPreferences preferences = getPreferences();
        if (preferences.getPlacementId() == null) {
            Context baseContext = this.context;
            String packageName = baseContext.getPackageName();
            String name2 = getClass().getName();
            while (baseContext instanceof ContextWrapper) {
                if (baseContext instanceof Activity) {
                    name = baseContext.getClass().getName();
                    preferences.setPlacementId(h0.a(packageName, name2, name, (String) null));
                } else {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
            }
            name = null;
            preferences.setPlacementId(h0.a(packageName, name2, name, (String) null));
        }
        return preferences;
    }

    private void reset() {
        this.belowMinCpm = false;
        this.listNativeAds = Collections.EMPTY_LIST;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public b2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public String getAdId() {
        AdDetails firstAdDetails = getFirstAdDetails();
        if (firstAdDetails != null) {
            return firstAdDetails.a();
        }
        return null;
    }

    public String getBidToken() {
        AdDetails firstAdDetails = getFirstAdDetails();
        if (firstAdDetails != null) {
            return firstAdDetails.e();
        }
        return null;
    }

    public ArrayList<NativeAdDetails> getNativeAds() {
        return getNativeAds(null);
    }

    public int getNumberOfAds() {
        return this.listNativeAds.size();
    }

    public void initNativeAdList(qd qdVar, NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        int size;
        this.belowMinCpm = qdVar.isBelowMinCPM();
        List list = qdVar.f41005a;
        if (list == null || (size = list.size()) <= 0) {
            onReceiveAd(adEventListener);
            return;
        }
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new NativeAdDetails((AdDetails) list.get(i2)));
        }
        this.listNativeAds = Collections.unmodifiableList(arrayList);
        if (!nativeAdPreferences.isAutoBitmapDownload()) {
            onReceiveAd(adEventListener);
            return;
        }
        i iVar = new i(this, size, adEventListener);
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.x);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((NativeAdDetails) it.next()).loadImages(this.context, iVar);
        }
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public boolean isBelowMinCPM() {
        return this.belowMinCpm;
    }

    @Deprecated
    public boolean loadAd() {
        return loadAd((AdEventListener) null);
    }

    public void setPreferences(NativeAdPreferences nativeAdPreferences) {
        this.preferences = nativeAdPreferences != null ? new NativeAdPreferences(nativeAdPreferences) : null;
    }

    public ArrayList<NativeAdDetails> getNativeAds(String str) {
        ArrayList<NativeAdDetails> arrayList = new ArrayList<>();
        AdRulesResult adRulesResultA = AdaptMetaData.b().a().a(AdPreferences.Placement.INAPP_NATIVE, str);
        if (adRulesResultA.b()) {
            for (NativeAdDetails nativeAdDetails : this.listNativeAds) {
                nativeAdDetails.setAdTag(str);
                arrayList.add(nativeAdDetails);
            }
            t.d.a(new s(AdPreferences.Placement.INAPP_NATIVE, str));
            return arrayList;
        }
        List<AdDetails> adDetailsList = getAdDetailsList();
        ArrayList arrayList2 = new ArrayList();
        if (adDetailsList != null) {
            Iterator<AdDetails> it = adDetailsList.iterator();
            while (it.hasNext()) {
                arrayList2.addAll(Arrays.asList(it.next().t()));
            }
        }
        h0.a((String[]) arrayList2.toArray(new String[0]), str, 0, adRulesResultA.a());
        return arrayList;
    }

    public boolean loadAd(AdEventListener adEventListener) {
        return loadAd(adEventListener, (String) null);
    }

    public boolean loadAd(AdEventListener adEventListener, String str) {
        if (!this.loading.compareAndSet(false, true)) {
            setErrorMessage("Ad is currently being loaded");
            return false;
        }
        reset();
        NativeAdPreferences nativeAdPreferencesPrepareAdPreferences = prepareAdPreferences();
        qd qdVar = new qd(this.context, this.eventTracer, this.consentManager, this.adCacheManager, this.videoAdCacheManager, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.motionProcessor, this.webViewCacheLoader, nativeAdPreferencesPrepareAdPreferences);
        ((z6) ((y6) this.eventTracer.a())).a((Object) this, ii.f41105b);
        ((z6) ((y6) this.eventTracer.a())).a(this, qdVar);
        qdVar.load(nativeAdPreferencesPrepareAdPreferences, new j(this, qdVar, nativeAdPreferencesPrepareAdPreferences, adEventListener), str);
        return true;
    }

    @Deprecated
    public boolean loadAd(NativeAdPreferences nativeAdPreferences) {
        setPreferences(nativeAdPreferences);
        return loadAd((AdEventListener) null);
    }

    @Deprecated
    public boolean loadAd(NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        setPreferences(nativeAdPreferences);
        return loadAd(adEventListener);
    }

    public boolean loadAd(NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener, String str) {
        setPreferences(nativeAdPreferences);
        return loadAd(adEventListener, str);
    }

    public StartAppNativeAd(Context context, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9) {
        super(context, AdPreferences.Placement.INAPP_NATIVE, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9);
        this.listNativeAds = Collections.EMPTY_LIST;
        this.loading = new AtomicBoolean();
    }
}
