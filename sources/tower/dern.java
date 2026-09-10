package tower;

import android.content.Context;
import android.os.Bundle;
import babyless.beachfront;
import com.appsflyer.AFInAppEventParameterName;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.yoadx.ad.lib.bean.AdLtvReportInfo;
import com.yoadx.ad.lib.core.YoadAdSdk;
import complexometry.taiyuan;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: AdUacReport.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"Ltower/dern;", "", "<init>", "()V", "Lcomplexometry/taiyuan;", "adValue", "Lcom/yoadx/ad/lib/bean/AdLtvReportInfo;", "adInfo", "", "wireman", "(Lcomplexometry/taiyuan;Lcom/yoadx/ad/lib/bean/AdLtvReportInfo;)V", "marial", "dern", "", X3.i.W, "attabal", "(Ljava/lang/String;)Ljava/lang/String;", "saneness", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "reportAdValuePoints", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f38901attabal = new dern();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final ArrayList<Float> reportAdValuePoints = adultoid.competently(Float.valueOf(0.01f), Float.valueOf(0.02f), Float.valueOf(0.03f), Float.valueOf(0.04f), Float.valueOf(0.05f), Float.valueOf(0.07f), Float.valueOf(0.1f));

    public final String attabal(String key) {
        return "sp_ad_app_ad_total_value" + key;
    }

    public final void dern(taiyuan adValue, AdLtvReportInfo adInfo) {
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Context contextDern = YoadAdSdk.f23874attabal.dern();
        if (contextDern == null) {
            return;
        }
        double d = 1000000.0d;
        double valueMicros = adValue.getValueMicros() / 1000000.0d;
        Iterator<T> it = reportAdValuePoints.iterator();
        while (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            String strPolder = dovishness.polder(String.valueOf(fFloatValue), ".", "", false, 4, null);
            dern dernVar = f38901attabal;
            long jImpromptu = beachfront.impromptu(dernVar.attabal(strPolder), 0L);
            double d2 = d;
            double d3 = (jImpromptu / d2) + valueMicros;
            if (d3 >= fFloatValue) {
                Bundle bundle = new Bundle();
                bundle.putDouble("value", d3);
                bundle.putString("currency", "USD");
                marial.f38903attabal.saneness(contextDern, dernVar.saneness(strPolder), bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putString(AFInAppEventParameterName.CURRENCY, Currency.getInstance(Locale.US).getCurrencyCode());
                bundle2.putDouble(AFInAppEventParameterName.REVENUE, d3);
                wireman.f38905attabal.competently(contextDern, dernVar.saneness(strPolder), bundle2);
                beachfront.attabal(dernVar.attabal(strPolder), 0L, null);
            } else {
                beachfront.attabal(dernVar.attabal(strPolder), Long.valueOf(jImpromptu + adValue.getValueMicros()), null);
            }
            d = d2;
        }
    }

    public final void marial(taiyuan adValue, AdLtvReportInfo adInfo) {
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Context contextDern = YoadAdSdk.f23874attabal.dern();
        if (contextDern == null) {
            return;
        }
        patriotism.attabal attabalVar = patriotism.attabal.f35069attabal;
        int iBeachfront = attabalVar.beachfront();
        long jSaneness = attabalVar.saneness() + adValue.getValueMicros();
        long jDern = attabalVar.dern() + adValue.getValueMicros();
        attabalVar.taiyuan(jDern);
        if (iBeachfront % 5 != 0) {
            attabalVar.impromptu(jSaneness);
            return;
        }
        double d = jSaneness / 1000000.0d;
        Bundle bundle = new Bundle();
        bundle.putDouble("value", d);
        bundle.putString("currency", "USD");
        bundle.putDouble("total_value", jDern / 1000000.0d);
        bundle.putString("ad_country", com.yolo.networklibrary.common.util.dern.taiyuan(contextDern));
        bundle.putString(AFInAppEventParameterName.CURRENCY, Currency.getInstance(Locale.US).getCurrencyCode());
        bundle.putDouble(AFInAppEventParameterName.REVENUE, d);
        marial.f38903attabal.saneness(contextDern, "uac_interstitial_value", bundle);
        wireman.f38905attabal.competently(contextDern, "uac_interstitial_value", bundle);
        attabalVar.impromptu(0L);
    }

    public final String saneness(String key) {
        return "ac_advalue_" + key;
    }

    public final void wireman(taiyuan adValue, AdLtvReportInfo adInfo) {
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Context contextDern = YoadAdSdk.f23874attabal.dern();
        if (contextDern == null) {
            return;
        }
        patriotism.attabal attabalVar = patriotism.attabal.f35069attabal;
        long jAttabal = attabalVar.attabal() + adValue.getValueMicros();
        long jWireman = attabalVar.wireman() + adValue.getValueMicros();
        attabalVar.cutely(jWireman);
        long j = jAttabal / ((long) DefaultOggSeeker.MATCH_BYTE_RANGE);
        if (j < 1) {
            attabalVar.competently(jAttabal);
            return;
        }
        int iMarial = attabalVar.marial();
        Bundle bundle = new Bundle();
        double d = j * 0.1d;
        bundle.putDouble("value", d);
        bundle.putInt("cnt", iMarial);
        bundle.putString("currency", "USD");
        bundle.putDouble("total_value", jWireman / 1000000.0d);
        bundle.putString("ad_country", com.yolo.networklibrary.common.util.dern.taiyuan(contextDern));
        bundle.putString(AFInAppEventParameterName.CURRENCY, Currency.getInstance(Locale.US).getCurrencyCode());
        bundle.putDouble(AFInAppEventParameterName.REVENUE, d);
        marial.f38903attabal.saneness(contextDern, "uac_advalue", bundle);
        wireman.f38905attabal.competently(contextDern, "uac_advalue", bundle);
        attabalVar.competently(jAttabal - (j * 100000));
    }
}
