package com.thinkup.network.facebook;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.biddingkit.auction.Auction;
import com.facebook.biddingkit.auction.AuctionListener;
import com.facebook.biddingkit.facebook.bidder.FacebookBidder;
import com.facebook.biddingkit.gen.Bid;
import com.facebook.biddingkit.gen.FacebookAdBidFormat;
import com.facebook.biddingkit.gen.IronSourceAdFormat;
import com.facebook.biddingkit.ironsource.IronSourceBidder;
import com.facebook.biddingkit.waterfall.Waterfall;
import com.facebook.biddingkit.waterfall.WaterfallEntry;
import com.thinkup.core.api.MediationBidManager;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0om;
import com.thinkup.core.common.oom.mo;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.n.om;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class FacebookBidkitAuction {
    int m;
    Auction.Builder m0;
    String mm;
    MediationBidManager.BidListener mn;
    Map<String, o0mm> mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    List<o0mm> f42542n;
    Handler n0;
    private final String nm = getClass().getSimpleName();
    Runnable no = new Runnable() { // from class: com.thinkup.network.facebook.FacebookBidkitAuction.1
        @Override // java.lang.Runnable
        public final void run() {
            com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.network.facebook.FacebookBidkitAuction.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    FacebookBidkitAuction.o(FacebookBidkitAuction.this);
                }
            });
        }
    };
    Context o;
    List<o0mm> o0;
    Auction om;
    o0om on;
    ConcurrentHashMap<String, WaterfallEntry> oo;

    public class m implements Waterfall {
        SortedSet<WaterfallEntry> o = new TreeSet();

        public m() {
        }

        public final Waterfall createWaterfallCopy() {
            m mVar = FacebookBidkitAuction.this.new m();
            Iterator<WaterfallEntry> it = this.o.iterator();
            while (it.hasNext()) {
                mVar.insert(it.next());
            }
            return mVar;
        }

        public final Iterable<WaterfallEntry> entries() {
            return this.o;
        }

        public final WaterfallEntry getFirst() {
            return this.o.first();
        }

        public final void insert(WaterfallEntry waterfallEntry) {
            this.o.add(waterfallEntry);
        }

        public final int size() {
            return this.o.size();
        }

        public final void insert(Bid bid) {
            this.o.add(FacebookBidkitAuction.this.new o(bid, bid.getPrice(), bid.getBidderName()));
        }
    }

    public class o implements WaterfallEntry, Comparable<o> {
        private Bid m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private double f42544n;
        private String o0;

        public o(Bid bid, double d, String str) {
            this.m = bid;
            this.f42544n = d;
            this.o0 = str;
        }

        public Bid getBid() {
            return this.m;
        }

        public double getCPMCents() {
            return this.f42544n;
        }

        public String getEntryName() {
            return this.o0;
        }

        @Override // java.lang.Comparable
        public int compareTo(o oVar) {
            return oVar.getCPMCents() > getCPMCents() ? 1 : -1;
        }
    }

    public FacebookBidkitAuction(o0om o0omVar) {
        this.o = o0omVar.m;
        this.m = o0omVar.om;
        this.f42542n = o0omVar.mm;
        mo moVar = o0omVar.omo;
        List<o0mm> listO = moVar != null ? moVar.o() : null;
        this.o0 = listO;
        if (listO == null) {
            this.o0 = new ArrayList();
        }
        this.on = o0omVar;
        this.m0 = new Auction.Builder();
        this.mo = new HashMap();
        this.n0 = new Handler(Looper.getMainLooper());
    }

    public void startBidding(final String str, final MediationBidManager.BidListener bidListener) {
        this.mm = str;
        this.mn = bidListener;
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(8);
        for (o0mm o0mmVar : this.f42542n) {
            concurrentHashMap.put(o0mmVar.m0o(), o0mmVar);
            new om(this.on).o(o0mmVar, new om.o() { // from class: com.thinkup.network.facebook.FacebookBidkitAuction.2
                private void o(o0mm o0mmVar2, Map<String, o0mm> map) {
                    FacebookBidkitAuction facebookBidkitAuction;
                    Handler handler;
                    map.remove(o0mmVar2.m0o());
                    if (map.size() != 0 || (handler = (facebookBidkitAuction = FacebookBidkitAuction.this).n0) == null) {
                        return;
                    }
                    handler.removeCallbacks(facebookBidkitAuction.no);
                }

                @Override // com.thinkup.core.n.om.o
                public final void onBidTokenObtainFail(String str2, o0mm o0mmVar2) {
                    o(o0mmVar2, concurrentHashMap);
                    o0mmVar2.m0(str2);
                    if (concurrentHashMap.size() == 0) {
                        FacebookBidkitAuction.this.o(str, bidListener);
                    }
                }

                @Override // com.thinkup.core.n.om.o
                public final void onBidTokenObtainStart(o0mm o0mmVar2, TUBaseAdAdapter tUBaseAdAdapter) {
                    MediationBidManager.BidListener bidListener2 = bidListener;
                    if (bidListener2 != null) {
                        bidListener2.onBidStart(o0mmVar2, tUBaseAdAdapter);
                    }
                }

                @Override // com.thinkup.core.n.om.o
                public final void onBidTokenObtainSuccess(o0mm o0mmVar2, JSONObject jSONObject) {
                    o(o0mmVar2, concurrentHashMap);
                    FacebookBidkitAuction.o(FacebookBidkitAuction.this, o0mmVar2, jSONObject);
                    if (concurrentHashMap.size() == 0) {
                        FacebookBidkitAuction.this.o(str, bidListener);
                    }
                }
            });
        }
        long jNm = this.on.nm.nm();
        Handler handler = this.n0;
        if (handler != null) {
            Runnable runnable = this.no;
            if (jNm <= 0) {
                jNm = 500;
            }
            handler.postDelayed(runnable, jNm);
        }
    }

    private void o() {
        o(this.mm, this.mn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str, final MediationBidManager.BidListener bidListener) {
        if (this.mo.size() == 0) {
            if (bidListener != null) {
                bidListener.onBidSuccess(new ArrayList(1));
                return;
            }
            return;
        }
        m mVar = new m();
        for (o0mm o0mmVar : this.o0) {
            mVar.insert(new o(null, 100.0d * o0mmVar.o0nm(), o0mmVar.m0o()));
        }
        Auction auctionBuild = this.m0.build();
        this.om = auctionBuild;
        auctionBuild.startRemoteAuction(str, mVar, new AuctionListener() { // from class: com.thinkup.network.facebook.FacebookBidkitAuction.3
            public final void onAuctionCompleted(Waterfall waterfall) {
                FacebookBidkitAuction facebookBidkitAuction = FacebookBidkitAuction.this;
                facebookBidkitAuction.o(facebookBidkitAuction.mo, waterfall, bidListener);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void o(o0mm o0mmVar, JSONObject jSONObject) {
        boolean zOmm;
        byte b2;
        byte b3;
        FacebookAdBidFormat facebookAdBidFormat;
        try {
            zOmm = o0n.m().omm();
        } catch (Throwable unused) {
            zOmm = false;
        }
        IronSourceAdFormat ironSourceAdFormat = null;
        try {
            if (o0mmVar.nm() == 1) {
                String strOptString = jSONObject.optString("app_id");
                String strOptString2 = jSONObject.optString("unit_id");
                String strOptString3 = jSONObject.optString("buyeruid");
                String strValueOf = String.valueOf(this.m);
                switch (strValueOf.hashCode()) {
                    case 48:
                        if (!strValueOf.equals("0")) {
                            b3 = -1;
                        } else {
                            b3 = 1;
                        }
                        break;
                    case 49:
                        if (!strValueOf.equals("1")) {
                            b3 = -1;
                        } else {
                            b3 = 3;
                        }
                        break;
                    case 50:
                        if (!strValueOf.equals("2")) {
                            b3 = -1;
                        } else {
                            b3 = 0;
                        }
                        break;
                    case AD_REWARD_USER_VALUE:
                        if (!strValueOf.equals("3")) {
                            b3 = -1;
                        } else {
                            b3 = 2;
                        }
                        break;
                    default:
                        b3 = -1;
                        break;
                }
                if (b3 == 0) {
                    String strOptString4 = jSONObject.optString("ad_height");
                    FacebookAdBidFormat facebookAdBidFormat2 = "50".equals(strOptString4) ? FacebookAdBidFormat.BANNER_HEIGHT_50 : null;
                    if ("90".equals(strOptString4)) {
                        facebookAdBidFormat2 = FacebookAdBidFormat.BANNER_HEIGHT_90;
                    }
                    facebookAdBidFormat = "250".equals(strOptString4) ? FacebookAdBidFormat.BANNER_HEIGHT_250 : facebookAdBidFormat2;
                    if (facebookAdBidFormat == null) {
                        facebookAdBidFormat = FacebookAdBidFormat.BANNER_HEIGHT_50;
                    }
                } else if (b3 != 1) {
                    if (b3 != 2) {
                        facebookAdBidFormat = b3 != 3 ? null : FacebookAdBidFormat.REWARDED_VIDEO;
                    } else {
                        facebookAdBidFormat = FacebookAdBidFormat.INTERSTITIAL;
                    }
                } else if ("1".equals(o00.o(o0mmVar.o0n(), "unit_type"))) {
                    facebookAdBidFormat = FacebookAdBidFormat.NATIVE_BANNER;
                } else {
                    facebookAdBidFormat = FacebookAdBidFormat.NATIVE;
                }
                this.m0.addBidder(new FacebookBidder.Builder(strOptString, strOptString2, facebookAdBidFormat, strOptString3).setTestMode(zOmm).build());
                this.mo.put(strOptString2, o0mmVar);
            }
        } catch (Throwable unused2) {
        }
        try {
            if (o0mmVar.nm() == 11) {
                String strOptString5 = jSONObject.optString("app_key");
                String strOptString6 = jSONObject.optString("instance_id");
                String strOptString7 = jSONObject.optString("buyeruid");
                String strValueOf2 = String.valueOf(this.m);
                int iHashCode = strValueOf2.hashCode();
                if (iHashCode != 49) {
                    if (iHashCode == 51 && strValueOf2.equals("3")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                } else if (strValueOf2.equals("1")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    ironSourceAdFormat = IronSourceAdFormat.INTERSTITIAL;
                } else if (b2 == 1) {
                    ironSourceAdFormat = IronSourceAdFormat.REWARDED_VIDEO;
                }
                this.m0.addBidder(new IronSourceBidder.Builder(strOptString5, strOptString6, ironSourceAdFormat, strOptString7).setTestMode(zOmm).build());
                this.mo.put(strOptString6, o0mmVar);
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(Map<String, o0mm> map, Waterfall waterfall, MediationBidManager.BidListener bidListener) {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.oo == null) {
                this.oo = new ConcurrentHashMap<>();
            }
            for (WaterfallEntry waterfallEntry : waterfall.entries()) {
                String entryName = waterfallEntry.getEntryName();
                Bid bid = waterfallEntry.getBid();
                if (bid != null) {
                    if ("FACEBOOK_BIDDER".equals(entryName)) {
                        o0mm o0mmVar = map.get(bid.getPlacementId());
                        o0mmVar.on(bid.getPayload());
                        o0mmVar.m(bid.getPrice() / 100.0d);
                        o0mmVar.oo(bid.getPrice() / 100.0d);
                        arrayList.add(o0mmVar);
                        this.oo.put(o0mmVar.m0o(), waterfallEntry);
                    }
                    if ("IRONSOURCE_BIDDER".equals(entryName)) {
                        o0mm o0mmVar2 = map.get(bid.getPlacementId());
                        o0mmVar2.on(bid.getPayload());
                        o0mmVar2.m(bid.getPrice() / 100.0d);
                        o0mmVar2.oo(bid.getPrice() / 100.0d);
                        arrayList.add(o0mmVar2);
                        this.oo.put(o0mmVar2.m0o(), waterfallEntry);
                    }
                } else {
                    this.oo.put(waterfallEntry.getEntryName(), waterfallEntry);
                }
            }
            if (bidListener != null) {
                bidListener.onBidSuccess(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o(o0mm o0mmVar) {
        WaterfallEntry waterfallEntry;
        try {
            ConcurrentHashMap<String, WaterfallEntry> concurrentHashMap = this.oo;
            if (concurrentHashMap != null && (waterfallEntry = concurrentHashMap.get(o0mmVar.m0o())) != null && this.om != null) {
                if (TUSDK.isNetworkLogDebug()) {
                    Log.i(this.nm, "notifyWinnerDisplay:" + waterfallEntry.getEntryName());
                }
                this.om.notifyDisplayWinner(waterfallEntry);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void o(FacebookBidkitAuction facebookBidkitAuction) {
        facebookBidkitAuction.o(facebookBidkitAuction.mm, facebookBidkitAuction.mn);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static /* synthetic */ void o(FacebookBidkitAuction facebookBidkitAuction, o0mm o0mmVar, JSONObject jSONObject) {
        boolean zOmm;
        byte b2;
        byte b3;
        FacebookAdBidFormat facebookAdBidFormat;
        try {
            zOmm = o0n.m().omm();
        } catch (Throwable unused) {
            zOmm = false;
        }
        IronSourceAdFormat ironSourceAdFormat = null;
        try {
            if (o0mmVar.nm() == 1) {
                String strOptString = jSONObject.optString("app_id");
                String strOptString2 = jSONObject.optString("unit_id");
                String strOptString3 = jSONObject.optString("buyeruid");
                String strValueOf = String.valueOf(facebookBidkitAuction.m);
                switch (strValueOf.hashCode()) {
                    case 48:
                        if (!strValueOf.equals("0")) {
                            b3 = -1;
                        } else {
                            b3 = 1;
                        }
                        break;
                    case 49:
                        if (!strValueOf.equals("1")) {
                            b3 = -1;
                        } else {
                            b3 = 3;
                        }
                        break;
                    case 50:
                        if (!strValueOf.equals("2")) {
                            b3 = -1;
                        } else {
                            b3 = 0;
                        }
                        break;
                    case AD_REWARD_USER_VALUE:
                        if (!strValueOf.equals("3")) {
                            b3 = -1;
                        } else {
                            b3 = 2;
                        }
                        break;
                    default:
                        b3 = -1;
                        break;
                }
                if (b3 == 0) {
                    String strOptString4 = jSONObject.optString("ad_height");
                    FacebookAdBidFormat facebookAdBidFormat2 = "50".equals(strOptString4) ? FacebookAdBidFormat.BANNER_HEIGHT_50 : null;
                    if ("90".equals(strOptString4)) {
                        facebookAdBidFormat2 = FacebookAdBidFormat.BANNER_HEIGHT_90;
                    }
                    facebookAdBidFormat = "250".equals(strOptString4) ? FacebookAdBidFormat.BANNER_HEIGHT_250 : facebookAdBidFormat2;
                    if (facebookAdBidFormat == null) {
                        facebookAdBidFormat = FacebookAdBidFormat.BANNER_HEIGHT_50;
                    }
                } else if (b3 != 1) {
                    if (b3 != 2) {
                        facebookAdBidFormat = b3 != 3 ? null : FacebookAdBidFormat.REWARDED_VIDEO;
                    } else {
                        facebookAdBidFormat = FacebookAdBidFormat.INTERSTITIAL;
                    }
                } else if ("1".equals(o00.o(o0mmVar.o0n(), "unit_type"))) {
                    facebookAdBidFormat = FacebookAdBidFormat.NATIVE_BANNER;
                } else {
                    facebookAdBidFormat = FacebookAdBidFormat.NATIVE;
                }
                facebookBidkitAuction.m0.addBidder(new FacebookBidder.Builder(strOptString, strOptString2, facebookAdBidFormat, strOptString3).setTestMode(zOmm).build());
                facebookBidkitAuction.mo.put(strOptString2, o0mmVar);
            }
        } catch (Throwable unused2) {
        }
        try {
            if (o0mmVar.nm() == 11) {
                String strOptString5 = jSONObject.optString("app_key");
                String strOptString6 = jSONObject.optString("instance_id");
                String strOptString7 = jSONObject.optString("buyeruid");
                String strValueOf2 = String.valueOf(facebookBidkitAuction.m);
                int iHashCode = strValueOf2.hashCode();
                if (iHashCode != 49) {
                    if (iHashCode == 51 && strValueOf2.equals("3")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                } else if (strValueOf2.equals("1")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    ironSourceAdFormat = IronSourceAdFormat.INTERSTITIAL;
                } else if (b2 == 1) {
                    ironSourceAdFormat = IronSourceAdFormat.REWARDED_VIDEO;
                }
                facebookBidkitAuction.m0.addBidder(new IronSourceBidder.Builder(strOptString5, strOptString6, ironSourceAdFormat, strOptString7).setTestMode(zOmm).build());
                facebookBidkitAuction.mo.put(strOptString6, o0mmVar);
            }
        } catch (Throwable unused3) {
        }
    }
}
