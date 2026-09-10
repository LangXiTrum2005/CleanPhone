package com.p004ironsource;

import com.applovin.impl.Z;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public class y7 implements Callable<c8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdData f27767c;
    private final a8 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z7 f27768e;
    private final NetworkSettings f;

    public class a implements BiddingDataCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ib f27769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BlockingQueue f27770b;

        public a(ib ibVar, BlockingQueue blockingQueue) {
            this.f27769a = ibVar;
            this.f27770b = blockingQueue;
        }

        @Override // com.p004ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(String str) {
            this.f27770b.add(new c8(y7.this.d(), y7.this.c(), null, ib.a(this.f27769a), str));
        }

        @Override // com.p004ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(Map<String, Object> map) {
            this.f27770b.add(new c8(y7.this.d(), y7.this.c(), map, ib.a(this.f27769a), null));
        }
    }

    public y7(int i2, String str, AdData adData, a8 a8Var, z7 z7Var, NetworkSettings networkSettings) {
        this.f27765a = i2;
        this.f27766b = str;
        this.f27767c = adData;
        this.d = a8Var;
        this.f27768e = z7Var;
        this.f = networkSettings;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006e A[PHI: r0 r2
  0x006e: PHI (r0v4 java.lang.String) = (r0v3 java.lang.String), (r0v6 java.lang.String) binds: [B:10:0x0058, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]
  0x006e: PHI (r2v8 com.ironsource.z7) = (r2v7 com.ironsource.z7), (r2v12 com.ironsource.z7) binds: [B:10:0x0058, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c8 call() throws Exception {
        String strM;
        z7 z7Var;
        ib ibVar = new ib();
        IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.f27767c, new a(ibVar, arrayBlockingQueue));
        } catch (Exception e2) {
            strM = Z.m(e2, com.google.firebase.crashlytics.internal.model.a.o(e2, "Exception while calling collectBiddingData - "));
            IronLog.INTERNAL.error(strM);
            z7Var = this.f27768e;
            if (z7Var != null) {
                z7Var.a(strM);
            }
        } catch (NoClassDefFoundError e3) {
            q9.d().a(e3);
            strM = "Error while calling collectBiddingData - " + e3.getMessage();
            IronLog.INTERNAL.error(strM);
            z7Var = this.f27768e;
            if (z7Var != null) {
                z7Var.a(strM);
            }
        }
        z7 z7Var2 = this.f27768e;
        if (z7Var2 != null) {
            z7Var2.a(this.f);
        }
        return (c8) arrayBlockingQueue.take();
    }

    public a8 b() {
        return this.d;
    }

    public String c() {
        return this.f27766b;
    }

    public int d() {
        return this.f27765a;
    }
}
