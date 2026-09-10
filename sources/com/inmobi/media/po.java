package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: loaded from: classes3.dex */
public final class po implements ro {
    public final com.inmobi.media.ads.network.common.model.Ad a;
    public final C3097n9 b;
    public final AtomicBoolean c;

    public po(com.inmobi.media.ads.network.common.model.Ad ad, C3097n9 c3097n9) {
        Intrinsics.checkNotNullParameter("l1", "tag");
        this.a = ad;
        this.b = c3097n9;
        this.c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.ro
    public final String a(double d) {
        if (!this.c.compareAndSet(false, true)) {
            C3097n9 c3097n9 = this.b;
            if (c3097n9 == null) {
                return "win/loss notification already triggered";
            }
            c3097n9.b("l1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            com.inmobi.media.ads.network.common.model.Ad ad = this.a;
            List listA = ad != null ? AbstractC3380yi.a(ad, "win_beacon") : null;
            if (listA != null && !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    String url = H3.a((String) it.next(), seminary.impassible(formularize.attabal("${AUCTION_MIN_TO_WIN}", String.valueOf(d)), formularize.attabal("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d))));
                    C3315w3 c3315w3 = C3315w3.a;
                    C3097n9 c3097n10 = this.b;
                    Intrinsics.checkNotNullParameter(url, "url");
                    C3315w3.a(url, true, c3097n10);
                }
                if (d > 0.0d) {
                    return null;
                }
                C3097n9 c3097n11 = this.b;
                if (c3097n11 == null) {
                    return "notification triggering with invalid params";
                }
                c3097n11.b("l1", "Win notification triggered with invalid minBidToWin: " + d);
                return "notification triggering with invalid params";
            }
            C3097n9 c3097n12 = this.b;
            if (c3097n12 == null) {
                return "no win/loss notification url";
            }
            c3097n12.b("l1", "Win beacon URLs not found or empty");
            return "no win/loss notification url";
        } catch (Exception e) {
            C3097n9 c3097n13 = this.b;
            if (c3097n13 == null) {
                return "win notification failed internally";
            }
            c3097n13.a("l1", "Exception in notifyWin", e);
            return "win notification failed internally";
        }
    }

    @Override // com.inmobi.media.ro
    public final String a(int i, double d) {
        if (this.c.compareAndSet(false, true)) {
            try {
                com.inmobi.media.ads.network.common.model.Ad ad = this.a;
                List listA = ad != null ? AbstractC3380yi.a(ad, "loss_beacon") : null;
                if (listA != null && !listA.isEmpty()) {
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        String url = H3.a((String) it.next(), seminary.impassible(formularize.attabal(com.ironsource.mediationsdk.d.l, String.valueOf(i)), formularize.attabal(com.ironsource.mediationsdk.d.n, String.valueOf(d))));
                        C3315w3 c3315w3 = C3315w3.a;
                        C3097n9 c3097n9 = this.b;
                        Intrinsics.checkNotNullParameter(url, "url");
                        C3315w3.a(url, true, c3097n9);
                    }
                    if (i > 0 && d > 0.0d) {
                        return null;
                    }
                    C3097n9 c3097n10 = this.b;
                    if (c3097n10 != null) {
                        c3097n10.b("l1", "Loss notification triggered with invalid params - lossReason: " + i + ", auctionPrice: " + d);
                        return "notification triggering with invalid params";
                    }
                    return "notification triggering with invalid params";
                }
                C3097n9 c3097n11 = this.b;
                if (c3097n11 != null) {
                    c3097n11.b("l1", "Loss beacon URLs not found or empty");
                    return "no win/loss notification url";
                }
                return "no win/loss notification url";
            } catch (Exception e) {
                C3097n9 c3097n12 = this.b;
                if (c3097n12 != null) {
                    c3097n12.a("l1", "Exception in notifyLoss", e);
                    return "loss notification failed internally";
                }
                return "loss notification failed internally";
            }
        }
        C3097n9 c3097n13 = this.b;
        if (c3097n13 != null) {
            c3097n13.b("l1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        return "win/loss notification already triggered";
    }
}
