package com.applovin.impl.mediation.ads;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.applovin.impl.a3;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u6;
import com.applovin.impl.x2;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    protected final MaxAdFormat adFormat;
    protected MaxAdListener adListener;

    @Nullable
    protected MaxAdReviewListener adReviewListener;
    protected final String adUnitId;

    @Nullable
    protected MaxAdExpirationListener expirationListener;
    protected final p logger;

    @Nullable
    protected MaxAdRequestListener requestListener;

    @Nullable
    protected MaxAdRevenueListener revenueListener;
    protected final l sdk;
    protected final String tag;
    protected final Map<String, Object> localExtraParameters = defpackage.e.w();
    protected final Map<String, Object> extraParameters = defpackage.e.w();

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface InterfaceC0010a extends MaxAdListener, MaxAdRevenueListener, MaxAdRequestListener {
    }

    public a(String str, MaxAdFormat maxAdFormat, String str2, l lVar) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = lVar;
        this.tag = str2;
        this.logger = lVar.Q();
    }

    private void a(String str, String str2, String str3, MaxAdFormat maxAdFormat, String str4, l lVar) {
        lVar.s0().a((k5) new u6(lVar, "reportExtraParameter", new com.applovin.impl.mediation.l(str, str2, maxAdFormat, str3, lVar, str4, 2)), f6.b.OTHER);
    }

    public void destroy() {
        this.localExtraParameters.clear();
        this.adListener = null;
        this.revenueListener = null;
        this.requestListener = null;
        this.expirationListener = null;
        this.adReviewListener = null;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(String str) {
        if (p.a()) {
            this.logger.a(this.tag, str);
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        if (p.a()) {
            this.logger.a(this.tag, "Setting Ad Review creative id listener: " + maxAdReviewListener);
        }
        this.adReviewListener = maxAdReviewListener;
    }

    public void setExpirationListener(@Nullable MaxAdExpirationListener maxAdExpirationListener) {
        if (p.a()) {
            this.logger.a(this.tag, "Setting expiration listener: " + maxAdExpirationListener);
        }
        this.expirationListener = maxAdExpirationListener;
    }

    public void setExtraParameter(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (q7.c(this.sdk) && ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str))) {
            throw new IllegalArgumentException("`setExtraParameter()` is an incorrect method for passing `amazon_ad_response` or `amazon_ad_error`. Please use the following method: `setLocalExtraParameter()`. Also note that this exception occurs in development builds only.");
        }
        if (this.adFormat.isAdViewAd() && "ad_refresh_seconds".equals(str) && StringUtils.isValidString(str2)) {
            int i10 = Integer.parseInt(str2);
            if (i10 > TimeUnit.MINUTES.toSeconds(2L)) {
                p.h(this.tag, "Attempting to set extra parameter \"ad_refresh_seconds\" to over 2 minutes (" + i10 + "s) - this will be ignored");
            }
        }
        a(str, str2, this.adUnitId, this.adFormat, "extraParameter", this.sdk);
        this.extraParameters.put(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        if (p.a()) {
            this.logger.a(this.tag, "Setting listener: " + maxAdListener);
        }
        this.adListener = maxAdListener;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (obj instanceof Activity) {
            if (p.a()) {
                this.logger.b(this.tag, "Ignoring setting local extra parameter to Activity instance - please pass a WeakReference of it instead!");
            }
        } else {
            if ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str)) {
                setExtraParameter("is_amazon_integration", Boolean.toString(true));
            }
            a(str, String.valueOf(obj), this.adUnitId, this.adFormat, "localExtraParameter", this.sdk);
            this.localExtraParameters.put(str, obj);
        }
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        if (p.a()) {
            this.logger.a(this.tag, "Setting request listener: " + maxAdRequestListener);
        }
        this.requestListener = maxAdRequestListener;
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        if (p.a()) {
            this.logger.a(this.tag, "Setting revenue listener: " + maxAdRevenueListener);
        }
        this.revenueListener = maxAdRevenueListener;
    }

    public static void logApiCall(String str, String str2) {
        l lVar = l.E0;
        if (lVar == null) {
            return;
        }
        lVar.Q();
        if (p.a()) {
            l.E0.Q().a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, String str2, MaxAdFormat maxAdFormat, String str3, l lVar, String str4) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", str + ":" + str2);
        CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), mapHashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", str3, mapHashMap);
        lVar.R().a(f2.f7890y0, str4, mapHashMap);
    }

    public void a(a3 a3Var) {
        x2 x2Var = new x2();
        x2Var.a().a("MAX Ad").a(a3Var).a();
        if (p.a()) {
            this.logger.a(this.tag, x2Var.toString());
        }
    }
}
