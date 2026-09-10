package com.yoadx.ad.lib.cloud;

import android.content.Context;
import com.blankj.utilcode.util.impromptu;
import com.yoadx.ad.lib.bean.AdCloudResponse;
import com.yoadx.ad.lib.bean.AdGroupConfig;
import com.yoadx.ad.lib.core.YoadAdSdk;
import com.yoadx.ad.lib.utils.attabal;
import com.yolo.networklibrary.common.util.dern;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.premeiotic;
import p002kotlin.Metadata;
import p002kotlin.Unit;

/* JADX INFO: compiled from: AdConfigCloudManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\rR$\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/yoadx/ad/lib/cloud/AdConfigCloudManager;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "wireman", "(Landroid/content/Context;Lwretchedly/dern;)Ljava/lang/Object;", "", "adConfigFile", "Lcom/yoadx/ad/lib/bean/AdGroupConfig;", "saneness", "(Landroid/content/Context;Ljava/lang/String;)Lcom/yoadx/ad/lib/bean/AdGroupConfig;", "Lcom/yoadx/ad/lib/bean/AdGroupConfig;", "dern", "()Lcom/yoadx/ad/lib/bean/AdGroupConfig;", "marial", "(Lcom/yoadx/ad/lib/bean/AdGroupConfig;)V", "mAdConfigResponse", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdConfigCloudManager {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final AdConfigCloudManager f23864attabal = new AdConfigCloudManager();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static AdGroupConfig mAdConfigResponse;

    public final AdGroupConfig dern() {
        return mAdConfigResponse;
    }

    public final void marial(AdGroupConfig adGroupConfig) {
        mAdConfigResponse = adGroupConfig;
    }

    public final AdGroupConfig saneness(Context context, String adConfigFile) {
        List<AdCloudResponse.SpecialAdConfig> specialAdConfigList;
        Object next;
        String strAttabal = YoadAdSdk.f23874attabal.impromptu() ? "{\"default_ad_config\":{\"ad_max_cache_count\":4,\"ad_native_max_cache_count\":1,\"ad_show_min_delay_time\":10,\"admob_cache_available_time\":3600000,\"common_appopen_ad_cloud\":[{\"platform_cache_type\":100001,\"id\":500001,\"loadDelaySec\":0,\"name\":\"appopen_h\",\"showDelayMin\":0,\"unit\":\"ca-app-pub-3940256099942544/9257395921\",\"weight\":1},{\"platform_cache_type\":100001,\"id\":500001,\"loadDelaySec\":0,\"name\":\"appopen_m\",\"showDelayMin\":0,\"unit\":\"ca-app-pub-3940256099942544/9257395921\",\"weight\":3}],\"common_interstitial_ad_cloud\":[{\"platform_cache_type\":100001,\"id\":100001,\"loadDelaySec\":0,\"name\":\"inter_m\",\"showDelayMin\":0,\"unit\":\"ca-app-pub-3940256099942544/1033173712\",\"weight\":4},{\"platform_cache_type\":100001,\"id\":100001,\"loadDelaySec\":0,\"name\":\"inter_h\",\"showDelayMin\":0,\"unit\":\"ca-app-pub-3940256099942544/1033173712\",\"weight\":2},{\"platform_cache_type\":100001,\"id\":100001,\"loadDelaySec\":0,\"name\":\"inter_l\",\"showDelayMin\":0,\"unit\":\"ca-app-pub-3940256099942544/1033173712\",\"weight\":6}],\"extra_interstitial_ad_cloud\":[],\"show_fb_loading_time\":1500,\"extra_reward_ad_cloud\":[],\"reward_max_cache_count\":4,\"common_reward_ad_cloud\":[{\"platform_cache_type\":100001,\"id\":300001,\"loadDelaySec\":0,\"name\":\"reward_h\",\"showDelayMin\":0,\"unit\":\"ca-app-pub-3940256099942544/5224354917\",\"weight\":1},{\"platform_cache_type\":100001,\"id\":300001,\"loadDelaySec\":0,\"name\":\"reward_m\",\"showDelayMin\":0,\"unit\":\"ca-app-pub-3940256099942544/5224354917\",\"weight\":2},{\"platform_cache_type\":100001,\"id\":300001,\"loadDelaySec\":0,\"name\":\"reward_l\",\"showDelayMin\":0,\"unit\":\"ca-app-pub-3940256099942544/5224354917\",\"weight\":3}],\"common_native_ad_cloud\":[{\"name\":\"native_l\",\"unit\":\"ca-app-pub-3940256099942544/2247696110\",\"maxColdNoFillSec\":30,\"minColdNoFillSec\":10,\"weight\":3},{\"name\":\"native_h\",\"unit\":\"ca-app-pub-3940256099942544/2247696110\",\"maxColdNoFillSec\":90,\"minColdNoFillSec\":30,\"weight\":1},{\"name\":\"native_m\",\"unit\":\"ca-app-pub-3940256099942544/2247696110\",\"maxColdNoFillSec\":60,\"minColdNoFillSec\":20,\"weight\":2}]}}" : attabal.f23897attabal.attabal(context, adConfigFile);
        AdGroupConfig adConfig = null;
        if (strAttabal.length() > 0) {
            AdCloudResponse adCloudResponse = (AdCloudResponse) impromptu.wireman(strAttabal, AdCloudResponse.class);
            String strTaiyuan = dern.taiyuan(context);
            dern.taiyuan(context);
            List<AdCloudResponse.SpecialAdConfig> specialAdConfigList2 = adCloudResponse.getSpecialAdConfigList();
            if (specialAdConfigList2 != null && !specialAdConfigList2.isEmpty() && (specialAdConfigList = adCloudResponse.getSpecialAdConfigList()) != null) {
                Iterator<T> it = specialAdConfigList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    List<String> country = ((AdCloudResponse.SpecialAdConfig) next).getCountry();
                    if (country != null && country.contains(strTaiyuan)) {
                        break;
                    }
                }
                AdCloudResponse.SpecialAdConfig specialAdConfig = (AdCloudResponse.SpecialAdConfig) next;
                if (specialAdConfig != null) {
                    adConfig = specialAdConfig.getAdConfig();
                }
            }
            if (adConfig == null) {
                return adCloudResponse.getDefaultAdConfig();
            }
        }
        return adConfig;
    }

    public final Object wireman(Context context, wretchedly.dern<? super Unit> dernVar) {
        Object objCompetently = kotlinx.coroutines.impromptu.competently(premeiotic.saneness(), new AdConfigCloudManager$init$2(context, null), dernVar);
        return objCompetently == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCompetently : Unit.f29295attabal;
    }
}
