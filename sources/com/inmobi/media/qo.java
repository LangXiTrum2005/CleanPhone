package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qo {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final String a(C3336x adComponent, double d) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        LinkedHashMap linkedHashMap = a;
        Integer numValueOf = Integer.valueOf(System.identityHashCode(adComponent));
        Object atomicBoolean = linkedHashMap.get(numValueOf);
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
            linkedHashMap.put(numValueOf, atomicBoolean);
        }
        if (!((AtomicBoolean) atomicBoolean).compareAndSet(false, true)) {
            C3097n9 c3097n9 = adComponent.a.c;
            if (c3097n9 == null) {
                return "win/loss notification already triggered";
            }
            c3097n9.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            ArrayList arrayListA = AbstractC3391z4.a(adComponent.b, "win_beacon");
            if (arrayListA.isEmpty()) {
                C3097n9 c3097n10 = adComponent.a.c;
                if (c3097n10 == null) {
                    return "no win/loss notification url";
                }
                c3097n10.b("NativeWinLossBeacon", "Win beacon URLs not found or empty");
                return "no win/loss notification url";
            }
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                String url = H3.a((String) it.next(), seminary.impassible(formularize.attabal("${AUCTION_MIN_TO_WIN}", String.valueOf(d)), formularize.attabal("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d))));
                C3315w3 c3315w3 = C3315w3.a;
                C3097n9 c3097n11 = adComponent.a.c;
                Intrinsics.checkNotNullParameter(url, "url");
                C3315w3.a(url, true, c3097n11);
            }
            if (d > 0.0d) {
                return null;
            }
            C3097n9 c3097n12 = adComponent.a.c;
            if (c3097n12 == null) {
                return "notification triggering with invalid params";
            }
            c3097n12.b("NativeWinLossBeacon", "Win notification triggered with invalid minBidToWin: " + d);
            return "notification triggering with invalid params";
        } catch (Exception e) {
            C3097n9 c3097n13 = adComponent.a.c;
            if (c3097n13 == null) {
                return "win notification failed internally";
            }
            c3097n13.a("NativeWinLossBeacon", "Exception in notifyWin", e);
            return "win notification failed internally";
        }
    }

    public static final String a(C3336x adComponent, int i, double d) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        LinkedHashMap linkedHashMap = a;
        Integer numValueOf = Integer.valueOf(System.identityHashCode(adComponent));
        Object atomicBoolean = linkedHashMap.get(numValueOf);
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
            linkedHashMap.put(numValueOf, atomicBoolean);
        }
        if (((AtomicBoolean) atomicBoolean).compareAndSet(false, true)) {
            try {
                ArrayList arrayListA = AbstractC3391z4.a(adComponent.b, "loss_beacon");
                if (arrayListA.isEmpty()) {
                    C3097n9 c3097n9 = adComponent.a.c;
                    if (c3097n9 != null) {
                        c3097n9.b("NativeWinLossBeacon", "Loss beacon URLs not found or empty");
                        return "no win/loss notification url";
                    }
                    return "no win/loss notification url";
                }
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    String url = H3.a((String) it.next(), seminary.impassible(formularize.attabal(com.ironsource.mediationsdk.d.l, String.valueOf(i)), formularize.attabal(com.ironsource.mediationsdk.d.n, String.valueOf(d))));
                    C3315w3 c3315w3 = C3315w3.a;
                    C3097n9 c3097n10 = adComponent.a.c;
                    Intrinsics.checkNotNullParameter(url, "url");
                    C3315w3.a(url, true, c3097n10);
                }
                if (i > 0 && d > 0.0d) {
                    return null;
                }
                C3097n9 c3097n11 = adComponent.a.c;
                if (c3097n11 != null) {
                    c3097n11.b("NativeWinLossBeacon", "Loss notification triggered with invalid params - lossReason: " + i + ", auctionPrice: " + d);
                    return "notification triggering with invalid params";
                }
                return "notification triggering with invalid params";
            } catch (Exception e) {
                C3097n9 c3097n12 = adComponent.a.c;
                if (c3097n12 != null) {
                    c3097n12.a("NativeWinLossBeacon", "Exception in notifyLoss", e);
                    return "loss notification failed internally";
                }
                return "loss notification failed internally";
            }
        }
        C3097n9 c3097n13 = adComponent.a.c;
        if (c3097n13 != null) {
            c3097n13.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        return "win/loss notification already triggered";
    }
}
