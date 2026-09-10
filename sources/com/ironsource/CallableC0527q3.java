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
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class CallableC0527q3 implements Callable<C0598u3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdData f30076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0562s3 f30077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0544r3 f30078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final NetworkSettings f30079f;

    /* JADX INFO: renamed from: com.ironsource.q3$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements BiddingDataCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0350g5 f30080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BlockingQueue f30081b;

        public a(C0350g5 c0350g5, BlockingQueue blockingQueue) {
            this.f30080a = c0350g5;
            this.f30081b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(String str) {
            this.f30081b.add(new C0598u3(CallableC0527q3.this.d(), CallableC0527q3.this.c(), null, C0350g5.a(this.f30080a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(Map<String, Object> map) {
            this.f30081b.add(new C0598u3(CallableC0527q3.this.d(), CallableC0527q3.this.c(), map, C0350g5.a(this.f30080a), null));
        }
    }

    public CallableC0527q3(int i10, String str, AdData adData, InterfaceC0562s3 interfaceC0562s3, InterfaceC0544r3 interfaceC0544r3, NetworkSettings networkSettings) {
        this.f30074a = i10;
        this.f30075b = str;
        this.f30076c = adData;
        this.f30077d = interfaceC0562s3;
        this.f30078e = interfaceC0544r3;
        this.f30079f = networkSettings;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0598u3 call() throws Exception {
        C0350g5 c0350g5 = new C0350g5();
        IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.f30076c, ContextProvider.getInstance().getActiveContext(), new a(c0350g5, arrayBlockingQueue));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            String str = "Exception while calling collectBiddingData - " + e10.getMessage();
            IronLog.INTERNAL.error(str);
            InterfaceC0544r3 interfaceC0544r3 = this.f30078e;
            if (interfaceC0544r3 != null) {
                interfaceC0544r3.a(str);
            }
        } catch (NoClassDefFoundError e11) {
            C0474n4.d().a(e11);
            String str2 = "Error while calling collectBiddingData - " + e11.getMessage();
            IronLog.INTERNAL.error(str2);
            InterfaceC0544r3 interfaceC0544r4 = this.f30078e;
            if (interfaceC0544r4 != null) {
                interfaceC0544r4.a(str2);
            }
        }
        InterfaceC0544r3 interfaceC0544r5 = this.f30078e;
        if (interfaceC0544r5 != null) {
            interfaceC0544r5.a(this.f30079f);
        }
        return (C0598u3) arrayBlockingQueue.take();
    }

    public InterfaceC0562s3 b() {
        return this.f30077d;
    }

    public String c() {
        return this.f30075b;
    }

    public int d() {
        return this.f30074a;
    }
}
