package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.ironsource.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class CallableC3701q3 implements Callable<C3768u3> {
    private final int a;
    private final String b;
    private final AdData c;
    private final InterfaceC3734s3 d;
    private final InterfaceC3717r3 e;
    private final NetworkSettings f;

    /* JADX INFO: renamed from: com.ironsource.q3$a */
    public class a implements BiddingDataCallback {
        final /* synthetic */ C3507f5 a;
        final /* synthetic */ BlockingQueue b;

        public a(C3507f5 c3507f5, BlockingQueue blockingQueue) {
            this.a = c3507f5;
            this.b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(String str) {
            this.b.add(new C3768u3(CallableC3701q3.this.d(), CallableC3701q3.this.c(), null, C3507f5.a(this.a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(Map<String, Object> map) {
            this.b.add(new C3768u3(CallableC3701q3.this.d(), CallableC3701q3.this.c(), map, C3507f5.a(this.a), null));
        }
    }

    public CallableC3701q3(int i, String str, AdData adData, InterfaceC3734s3 interfaceC3734s3, InterfaceC3717r3 interfaceC3717r3, NetworkSettings networkSettings) {
        this.a = i;
        this.b = str;
        this.c = adData;
        this.d = interfaceC3734s3;
        this.e = interfaceC3717r3;
        this.f = networkSettings;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3768u3 call() throws Exception {
        C3507f5 c3507f5 = new C3507f5();
        IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.c, ContextProvider.getInstance().getActiveContext(), new a(c3507f5, arrayBlockingQueue));
        } catch (Exception e) {
            C3631m4.d().a(e);
            String str = "Exception while calling collectBiddingData - " + e.getMessage();
            IronLog.INTERNAL.error(str);
            InterfaceC3717r3 interfaceC3717r3 = this.e;
            if (interfaceC3717r3 != null) {
                interfaceC3717r3.a(str);
            }
        } catch (NoClassDefFoundError e2) {
            C3631m4.d().a(e2);
            String str2 = "Error while calling collectBiddingData - " + e2.getMessage();
            IronLog.INTERNAL.error(str2);
            InterfaceC3717r3 interfaceC3717r4 = this.e;
            if (interfaceC3717r4 != null) {
                interfaceC3717r4.a(str2);
            }
        }
        InterfaceC3717r3 interfaceC3717r5 = this.e;
        if (interfaceC3717r5 != null) {
            interfaceC3717r5.a(this.f);
        }
        return (C3768u3) arrayBlockingQueue.take();
    }

    public InterfaceC3734s3 b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }
}
