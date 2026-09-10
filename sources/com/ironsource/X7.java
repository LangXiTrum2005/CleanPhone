package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface X7<T> {
    T a(String str);

    void a(T t10);

    void a(String str, T t10);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements X7<ISDemandOnlyInterstitialListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private W7 f27886a = new W7();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, W7> f27887b = new HashMap();

        @Override // com.ironsource.X7
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(String instanceId) {
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            W7 w10 = this.f27887b.get(instanceId);
            return w10 != null ? w10 : this.f27886a;
        }

        @Override // com.ironsource.X7
        public void a(ISDemandOnlyInterstitialListener listener) {
            kotlin.jvm.internal.n.f(listener, "listener");
            this.f27886a.a(listener);
            Iterator<String> it = this.f27887b.keySet().iterator();
            while (it.hasNext()) {
                W7 w10 = this.f27887b.get(it.next());
                if (w10 != null) {
                    w10.a(listener);
                }
            }
        }

        @Override // com.ironsource.X7
        public void a(String instanceId, ISDemandOnlyInterstitialListener listener) {
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            kotlin.jvm.internal.n.f(listener, "listener");
            if (this.f27887b.containsKey(instanceId)) {
                W7 w10 = this.f27887b.get(instanceId);
                if (w10 != null) {
                    w10.a(listener);
                    return;
                }
                return;
            }
            this.f27887b.put(instanceId, new W7(listener));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements X7<ISDemandOnlyRewardedVideoListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Z7 f27888a = new Z7();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, Z7> f27889b = new HashMap();

        @Override // com.ironsource.X7
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(String instanceId) {
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            Z7 z10 = this.f27889b.get(instanceId);
            return z10 != null ? z10 : this.f27888a;
        }

        @Override // com.ironsource.X7
        public void a(ISDemandOnlyRewardedVideoListener listener) {
            kotlin.jvm.internal.n.f(listener, "listener");
            this.f27888a.a(listener);
            Iterator<String> it = this.f27889b.keySet().iterator();
            while (it.hasNext()) {
                Z7 z10 = this.f27889b.get(it.next());
                if (z10 != null) {
                    z10.a(listener);
                }
            }
        }

        @Override // com.ironsource.X7
        public void a(String instanceId, ISDemandOnlyRewardedVideoListener listener) {
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            kotlin.jvm.internal.n.f(listener, "listener");
            if (this.f27889b.containsKey(instanceId)) {
                Z7 z10 = this.f27889b.get(instanceId);
                if (z10 != null) {
                    z10.a(listener);
                    return;
                }
                return;
            }
            this.f27889b.put(instanceId, new Z7(listener));
        }
    }
}
