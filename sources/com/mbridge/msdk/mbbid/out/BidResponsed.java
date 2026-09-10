package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.click.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.system.NoProGuard;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class BidResponsed implements NoProGuard {
    public static final String KEY_BID_ID = "bid";
    public static final String KEY_CUR = "cur";
    public static final String KEY_LN = "ln";
    public static final String KEY_PRICE = "price";
    public static final String KEY_TOKEN = "token";
    public static final String KEY_WN = "wn";
    private String bidId;
    private String bidToken;
    private String cur;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    protected String f34601ln;
    private String price;

    /* JADX INFO: renamed from: wn, reason: collision with root package name */
    protected String f34602wn;

    public String getBidId() {
        return this.bidId;
    }

    public String getBidToken() {
        return this.bidToken;
    }

    public String getCur() {
        return this.cur;
    }

    public String getLn() {
        return this.f34601ln;
    }

    public String getPrice() {
        return this.price;
    }

    public String getWn() {
        return this.f34602wn;
    }

    public void sendLossNotice(Context context, BidLossCode bidLossCode) {
        if (TextUtils.isEmpty(this.f34601ln) || context == null || bidLossCode == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(this.f34601ln);
        if (this.f34601ln.contains("?")) {
            sb2.append(X3.j.f27832c);
        } else {
            sb2.append("?");
        }
        sb2.append("reason=");
        sb2.append(bidLossCode.getCurrentCode());
        a.a(context, (CampaignEx) null, "", sb2.toString(), false, false);
    }

    public void sendWinNotice(Context context) {
        if (TextUtils.isEmpty(this.f34602wn) || context == null) {
            return;
        }
        a.a(context, (CampaignEx) null, "", this.f34602wn, false, false);
    }

    public void setBidId(String str) {
        this.bidId = str;
    }

    public void setBidToken(String str) {
        this.bidToken = str;
    }

    public void setCur(String str) {
        this.cur = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }
}
