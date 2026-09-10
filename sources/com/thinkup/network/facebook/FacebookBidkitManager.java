package com.thinkup.network.facebook;

import com.facebook.biddingkit.bridge.BiddingKit;
import com.p004ironsource.a4;
import com.thinkup.core.api.MediationBidManager;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0om;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class FacebookBidkitManager extends MediationBidManager {
    private static volatile FacebookBidkitManager o0;
    ConcurrentHashMap<String, FacebookBidkitAuction> m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ConcurrentHashMap<String, FacebookBidkitAuction> f42545n = new ConcurrentHashMap<>();
    boolean o;

    /* JADX INFO: renamed from: com.thinkup.network.facebook.FacebookBidkitManager$2, reason: invalid class name */
    public class AnonymousClass2 implements MediationBidManager.BidListener {
        final /* synthetic */ FacebookBidkitAuction m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ o0om f42547n;
        final /* synthetic */ MediationBidManager.BidListener o;

        public AnonymousClass2(MediationBidManager.BidListener bidListener, FacebookBidkitAuction facebookBidkitAuction, o0om o0omVar) {
            this.o = bidListener;
            this.m = facebookBidkitAuction;
            this.f42547n = o0omVar;
        }

        @Override // com.thinkup.core.api.MediationBidManager.BidListener
        public final void onBidFail(String str) {
        }

        @Override // com.thinkup.core.api.MediationBidManager.BidListener
        public final void onBidStart(o0mm o0mmVar, TUBaseAdAdapter tUBaseAdAdapter) {
            MediationBidManager.BidListener bidListener = this.o;
            if (bidListener != null) {
                bidListener.onBidStart(o0mmVar, tUBaseAdAdapter);
            }
        }

        @Override // com.thinkup.core.api.MediationBidManager.BidListener
        public final void onBidSuccess(List<o0mm> list) {
            FacebookBidkitManager.this.f42545n.remove(this.m);
            FacebookBidkitManager.this.m.put(this.f42547n.oo, this.m);
            MediationBidManager.BidListener bidListener = this.o;
            if (bidListener != null) {
                bidListener.onBidSuccess(list);
            }
        }
    }

    private FacebookBidkitManager() {
    }

    public static FacebookBidkitManager getInstance() {
        if (o0 == null) {
            synchronized (FacebookBidkitManager.class) {
                try {
                    if (o0 == null) {
                        o0 = new FacebookBidkitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o0;
    }

    private void o(o0om o0omVar, MediationBidManager.BidListener bidListener) {
        try {
            if (!this.o) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("timeout_ms", o0omVar.on);
                    jSONObject.put(a4.f, jSONObject2);
                } catch (Throwable unused) {
                }
                BiddingKit.init(o0omVar.m.getApplicationContext(), jSONObject.toString());
                this.o = true;
            }
            FacebookBidkitAuction facebookBidkitAuction = new FacebookBidkitAuction(o0omVar);
            this.f42545n.put(facebookBidkitAuction.toString(), facebookBidkitAuction);
            facebookBidkitAuction.startBidding(this.mRequestUrl, new AnonymousClass2(bidListener, facebookBidkitAuction, o0omVar));
        } catch (Throwable th) {
            if (bidListener != null) {
                bidListener.onBidFail(th.getMessage());
            }
        }
    }

    @Override // com.thinkup.core.api.MediationBidManager
    public void notifyWinnerDisplay(String str, o0mm o0mmVar) {
        try {
            FacebookBidkitAuction facebookBidkitAuction = this.m.get(str);
            if (facebookBidkitAuction != null) {
                facebookBidkitAuction.o(o0mmVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.thinkup.core.api.MediationBidManager
    public void startBid(final o0om o0omVar, final MediationBidManager.BidListener bidListener) {
        new Thread(new Runnable() { // from class: com.thinkup.network.facebook.FacebookBidkitManager.1
            @Override // java.lang.Runnable
            public final void run() {
                FacebookBidkitManager.o(FacebookBidkitManager.this, o0omVar, bidListener);
            }
        }).start();
    }

    public static /* synthetic */ void o(FacebookBidkitManager facebookBidkitManager, o0om o0omVar, MediationBidManager.BidListener bidListener) {
        try {
            if (!facebookBidkitManager.o) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("timeout_ms", o0omVar.on);
                    jSONObject.put(a4.f, jSONObject2);
                } catch (Throwable unused) {
                }
                BiddingKit.init(o0omVar.m.getApplicationContext(), jSONObject.toString());
                facebookBidkitManager.o = true;
            }
            FacebookBidkitAuction facebookBidkitAuction = new FacebookBidkitAuction(o0omVar);
            facebookBidkitManager.f42545n.put(facebookBidkitAuction.toString(), facebookBidkitAuction);
            facebookBidkitAuction.startBidding(facebookBidkitManager.mRequestUrl, facebookBidkitManager.new AnonymousClass2(bidListener, facebookBidkitAuction, o0omVar));
        } catch (Throwable th) {
            if (bidListener != null) {
                bidListener.onBidFail(th.getMessage());
            }
        }
    }
}
