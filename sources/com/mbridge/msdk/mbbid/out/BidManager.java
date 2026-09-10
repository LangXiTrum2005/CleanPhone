package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.authoritycontroller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.middle.b;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class BidManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f34598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BidListennning f34599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34600c;

    public BidManager(String str, String str2) {
        this(str, str2, "0");
    }

    private void a(String str) {
        BidListennning bidListennning = this.f34599b;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    public static String getBuyerUid(Context context) {
        if (com.mbridge.msdk.util.b.a()) {
            try {
                c.c(true);
            } catch (Throwable th2) {
                q0.b("BidManager", th2.getMessage());
            }
        }
        return com.mbridge.msdk.mbbid.common.b.a(context, "");
    }

    public void bid() {
        b bVar = this.f34598a;
        if (bVar != null) {
            bVar.a(this.f34600c);
        } else {
            a("you need init the class :BidManager");
        }
    }

    public void setBidListener(BidListennning bidListennning) {
        this.f34599b = bidListennning;
        b bVar = this.f34598a;
        if (bVar != null) {
            bVar.a(bidListennning);
        }
    }

    public void setRewardPlus(boolean z10) {
        this.f34600c = z10;
    }

    public BidManager(String str, String str2, String str3) {
        this.f34600c = false;
        this.f34598a = new b(str, str2, str3);
    }

    public <T extends CommonBidRequestParams> BidManager(T t10) {
        this(t10 == null ? "" : t10.getmPlacementId(), t10 == null ? "" : t10.getmUnitId(), t10 != null ? t10.getmFloorPrice() : "");
        if (t10 instanceof BannerBidRequestParams) {
            BannerBidRequestParams bannerBidRequestParams = (BannerBidRequestParams) t10;
            this.f34598a.a(bannerBidRequestParams.getHeight());
            this.f34598a.b(bannerBidRequestParams.getWidth());
            this.f34598a.a(296);
            if (t10 instanceof SplashBidRequestParams) {
                SplashBidRequestParams splashBidRequestParams = (SplashBidRequestParams) t10;
                this.f34598a.b(splashBidRequestParams.a());
                this.f34598a.b(splashBidRequestParams.getOrientation());
                this.f34598a.a(297);
                return;
            }
            return;
        }
        if (t10 instanceof AdvancedNativeBidRequestParams) {
            AdvancedNativeBidRequestParams advancedNativeBidRequestParams = (AdvancedNativeBidRequestParams) t10;
            this.f34598a.a(advancedNativeBidRequestParams.getHeight());
            this.f34598a.b(advancedNativeBidRequestParams.getWidth());
            this.f34598a.a(298);
        }
    }

    public static String getBuyerUid(Context context, String str) {
        if (com.mbridge.msdk.util.b.a()) {
            try {
                c.c(true);
            } catch (Throwable th2) {
                q0.b("BidManager", th2.getMessage());
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return com.mbridge.msdk.mbbid.common.b.a(context, str);
    }

    public static String getBuyerUid(Context context, Map<String, String> map) {
        if (com.mbridge.msdk.util.b.a()) {
            try {
                c.c(true);
            } catch (Throwable th2) {
                q0.b("BidManager", th2.getMessage());
            }
        }
        return com.mbridge.msdk.mbbid.common.b.a(context, map);
    }
}
