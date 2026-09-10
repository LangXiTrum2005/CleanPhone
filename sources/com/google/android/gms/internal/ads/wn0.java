package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wn0 implements nm0 {
    @Override // com.google.android.gms.internal.ads.nm0
    public final ListenableFuture a(ju0 ju0Var, du0 du0Var) {
        JSONObject jSONObject = du0Var.f13713v;
        String strOptString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        ou0 ou0Var = (ou0) ju0Var.f16195a.f20839b;
        nu0 nu0Var = new nu0();
        nu0Var.f17970o.f38703b = ou0Var.f18374p.f38703b;
        zzm zzmVar = ou0Var.f18363d;
        nu0Var.f17957a = zzmVar;
        nu0Var.f17958b = ou0Var.f18365f;
        nu0Var.f17979x = ou0Var.f18382x;
        String str = ou0Var.f18366g;
        nu0Var.f17959c = str;
        nu0Var.f17960d = ou0Var.f18360a;
        nu0Var.f17962f = ou0Var.f18367h;
        nu0Var.f17963g = ou0Var.f18368i;
        nu0Var.f17964h = ou0Var.f18369j;
        nu0Var.f17965i = ou0Var.f18370k;
        AdManagerAdViewOptions adManagerAdViewOptions = ou0Var.f18371m;
        nu0Var.f17966j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            nu0Var.f17961e = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        PublisherAdViewOptions publisherAdViewOptions = ou0Var.f18372n;
        nu0Var.f17967k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            nu0Var.f17961e = publisherAdViewOptions.zza();
            nu0Var.l = publisherAdViewOptions.zzb();
        }
        nu0Var.f17971p = ou0Var.f18375q;
        nu0Var.f17972q = ou0Var.f18376r;
        nu0Var.f17973r = ou0Var.f18362c;
        nu0Var.f17974s = ou0Var.f18377s;
        nu0Var.f17975t = ou0Var.f18378t;
        nu0Var.f17976u.set(ou0Var.f18379u.get());
        nu0Var.f17978w = ou0Var.f18381w;
        nu0Var.f17959c = strOptString;
        nu0Var.f17977v = true;
        Bundle bundle = zzmVar.zzm;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundle4.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundle4.putString("_ad", strOptString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = du0Var.D;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, strOptString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        nu0Var.f17957a = new zzm(zzmVar.zza, zzmVar.zzb, bundle4, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, bundle2, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz, zzmVar.zzA, zzmVar.zzB);
        nu0Var.f17978w = du0Var.H0;
        ou0 ou0VarA = nu0Var.a();
        Bundle bundle5 = new Bundle();
        fu0 fu0Var = (fu0) ju0Var.f16196b.f20920d;
        Bundle bundle6 = new Bundle();
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(fu0Var.f14545a));
        bundle6.putInt("refresh_interval", fu0Var.f14547c);
        bundle6.putString("gws_query_id", fu0Var.f14546b);
        bundle5.putBundle("parent_common_config", bundle6);
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        bundle7.putString("allocation_id", du0Var.f13715w);
        bundle7.putString("ad_source_name", du0Var.F);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(du0Var.f13679c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(du0Var.f13681d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(du0Var.f13703p));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(du0Var.f13697m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(du0Var.f13687g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(du0Var.f13688h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(du0Var.f13690i));
        bundle7.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, du0Var.f13692j);
        bundle7.putString("valid_from_timestamp", du0Var.f13694k);
        bundle7.putBoolean("is_closable_area_disabled", du0Var.P);
        bundle7.putString("recursive_server_response_data", du0Var.f13702o0);
        bundle7.putBoolean("is_analytics_logging_enabled", du0Var.W);
        dy dyVar = du0Var.l;
        if (dyVar != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", dyVar.f13755b);
            bundle8.putString("rb_type", dyVar.f13754a);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(ou0VarA, bundle5, du0Var, ju0Var);
    }

    @Override // com.google.android.gms.internal.ads.nm0
    public final boolean b(ju0 ju0Var, du0 du0Var) {
        return !TextUtils.isEmpty(du0Var.f13713v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    public abstract uv0 c(ou0 ou0Var, Bundle bundle, du0 du0Var, ju0 ju0Var);
}
