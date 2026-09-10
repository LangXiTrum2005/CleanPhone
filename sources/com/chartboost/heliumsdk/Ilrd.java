package com.chartboost.heliumsdk;

import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.H0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/chartboost/heliumsdk/Ilrd;", "", "()V", "handler", "Landroid/os/Handler;", "observers", "", "Lcom/chartboost/heliumsdk/HeliumIlrdObserver;", "onIlrdReceived", "", "heliumPlacement", "", "ilrdJson", "Lorg/json/JSONObject;", "onIlrdReceived$Helium_release", "subscribe", "observer", "unsubscribe", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Ilrd {
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Set<HeliumIlrdObserver> observers = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onIlrdReceived$lambda$3(Ilrd this$0, String heliumPlacement, JSONObject ilrdJson) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(heliumPlacement, "$heliumPlacement");
        Intrinsics.f(ilrdJson, "$ilrdJson");
        Iterator<T> it = this$0.observers.iterator();
        while (it.hasNext()) {
            ((HeliumIlrdObserver) it.next()).onImpression(new HeliumImpressionData(heliumPlacement, ilrdJson));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$0(Ilrd this$0, HeliumIlrdObserver observer) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(observer, "$observer");
        this$0.observers.add(observer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unsubscribe$lambda$1(Ilrd this$0, HeliumIlrdObserver observer) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(observer, "$observer");
        this$0.observers.remove(observer);
    }

    public final void onIlrdReceived$Helium_release(String heliumPlacement, JSONObject ilrdJson) {
        Intrinsics.f(heliumPlacement, "heliumPlacement");
        Intrinsics.f(ilrdJson, "ilrdJson");
        this.handler.post(new H0(this, heliumPlacement, ilrdJson, 6));
    }

    public final void subscribe(HeliumIlrdObserver observer) {
        Intrinsics.f(observer, "observer");
        this.handler.post(new a(this, observer, 0));
    }

    public final void unsubscribe(HeliumIlrdObserver observer) {
        Intrinsics.f(observer, "observer");
        this.handler.post(new a(this, observer, 1));
    }
}
