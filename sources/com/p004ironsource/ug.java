package com.p004ironsource;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/ug;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "a", "(Ljava/lang/Object;)V", "", "instanceId", "(Ljava/lang/String;Ljava/lang/Object;)V", "(Ljava/lang/String;)Ljava/lang/Object;", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface ug<T> {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\nR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/ug$a;", "Lcom/ironsource/ug;", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyInterstitialListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "a", "", "instanceId", "b", "Lcom/ironsource/tg;", "Lcom/ironsource/tg;", "defaultListener", "", "Ljava/util/Map;", "listenerWrappers", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements ug<ISDemandOnlyInterstitialListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private tg defaultListener = new tg();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, tg> listenerWrappers = new HashMap();

        @Override // com.p004ironsource.ug
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(String instanceId) {
            Intrinsics.f(instanceId, "instanceId");
            tg tgVar = this.listenerWrappers.get(instanceId);
            return tgVar != null ? tgVar : this.defaultListener;
        }

        @Override // com.p004ironsource.ug
        public void a(ISDemandOnlyInterstitialListener listener) {
            Intrinsics.f(listener, "listener");
            this.defaultListener.a(listener);
            Iterator<String> it = this.listenerWrappers.keySet().iterator();
            while (it.hasNext()) {
                tg tgVar = this.listenerWrappers.get(it.next());
                if (tgVar != null) {
                    tgVar.a(listener);
                }
            }
        }

        @Override // com.p004ironsource.ug
        public void a(String instanceId, ISDemandOnlyInterstitialListener listener) {
            Intrinsics.f(instanceId, "instanceId");
            Intrinsics.f(listener, "listener");
            if (!this.listenerWrappers.containsKey(instanceId)) {
                this.listenerWrappers.put(instanceId, new tg(listener));
                return;
            }
            tg tgVar = this.listenerWrappers.get(instanceId);
            if (tgVar != null) {
                tgVar.a(listener);
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\nR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/ug$b;", "Lcom/ironsource/ug;", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyRewardedVideoListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "a", "", "instanceId", "b", "Lcom/ironsource/wg;", "Lcom/ironsource/wg;", "defaultListener", "", "Ljava/util/Map;", "listenerWrappers", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements ug<ISDemandOnlyRewardedVideoListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private wg defaultListener = new wg();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, wg> listenerWrappers = new HashMap();

        @Override // com.p004ironsource.ug
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(String instanceId) {
            Intrinsics.f(instanceId, "instanceId");
            wg wgVar = this.listenerWrappers.get(instanceId);
            return wgVar != null ? wgVar : this.defaultListener;
        }

        @Override // com.p004ironsource.ug
        public void a(ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.f(listener, "listener");
            this.defaultListener.a(listener);
            Iterator<String> it = this.listenerWrappers.keySet().iterator();
            while (it.hasNext()) {
                wg wgVar = this.listenerWrappers.get(it.next());
                if (wgVar != null) {
                    wgVar.a(listener);
                }
            }
        }

        @Override // com.p004ironsource.ug
        public void a(String instanceId, ISDemandOnlyRewardedVideoListener listener) {
            Intrinsics.f(instanceId, "instanceId");
            Intrinsics.f(listener, "listener");
            if (!this.listenerWrappers.containsKey(instanceId)) {
                this.listenerWrappers.put(instanceId, new wg(listener));
                return;
            }
            wg wgVar = this.listenerWrappers.get(instanceId);
            if (wgVar != null) {
                wgVar.a(listener);
            }
        }
    }

    T a(String instanceId);

    void a(T listener);

    void a(String instanceId, T listener);
}
