package com.p004ironsource;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\u001c\u0010\u001c\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/ironsource/bd;", "Lcom/ironsource/np;", "Lcom/ironsource/cd;", "loadListener", "", "a", "Lcom/ironsource/dd;", "showListener", "onInterstitialInitSuccess", "", "description", "onInterstitialInitFailed", "Lcom/ironsource/zj;", d9.h.p0, "onInterstitialLoadSuccess", "onInterstitialLoadFailed", "onInterstitialOpen", "demandSourceId", "", "amount", "onInterstitialAdRewarded", "onInterstitialClose", "onInterstitialShowSuccess", "onInterstitialShowFailed", "onInterstitialClick", d9.h.j0, "Lorg/json/JSONObject;", d9.h.l0, "onInterstitialEventNotificationReceived", "Lcom/ironsource/cd;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class bd implements np {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private cd loadListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private WeakReference<dd> showListener = new WeakReference<>(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/ironsource/bd$a;", "", "", "b", "Ljava/lang/String;", "AD_VISIBLE_EVENT_NAME", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24425a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final String AD_VISIBLE_EVENT_NAME = "impressions";

        private a() {
        }
    }

    public final void a(cd loadListener) {
        Intrinsics.f(loadListener, "loadListener");
        this.loadListener = loadListener;
    }

    @Override // com.p004ironsource.np
    public void onInterstitialAdRewarded(String demandSourceId, int amount) {
        dd ddVar = this.showListener.get();
        if (ddVar != null) {
            ddVar.onAdInstanceDidReward(demandSourceId, amount);
        }
    }

    @Override // com.p004ironsource.np
    public void onInterstitialClick() {
        dd ddVar = this.showListener.get();
        if (ddVar != null) {
            ddVar.onAdInstanceDidClick();
        }
    }

    @Override // com.p004ironsource.np
    public void onInterstitialClose() {
        dd ddVar = this.showListener.get();
        if (ddVar != null) {
            ddVar.onAdInstanceDidDismiss();
        }
    }

    @Override // com.p004ironsource.np
    public void onInterstitialEventNotificationReceived(String eventName, JSONObject extData) {
        dd ddVar;
        if (!Intrinsics.a(eventName, "impressions") || (ddVar = this.showListener.get()) == null) {
            return;
        }
        ddVar.onAdInstanceDidBecomeVisible();
    }

    @Override // com.p004ironsource.np
    public void onInterstitialInitFailed(String description) {
    }

    @Override // com.p004ironsource.np
    public void onInterstitialInitSuccess() {
    }

    @Override // com.p004ironsource.np
    public void onInterstitialLoadFailed(String description) {
        Intrinsics.f(description, "description");
        cd cdVar = this.loadListener;
        if (cdVar != null) {
            cdVar.a(description);
        }
    }

    @Override // com.p004ironsource.np
    public void onInterstitialLoadSuccess(zj adInstance) {
        Intrinsics.f(adInstance, "adInstance");
        cd cdVar = this.loadListener;
        if (cdVar != null) {
            cdVar.a(adInstance);
        }
    }

    @Override // com.p004ironsource.np
    public void onInterstitialOpen() {
        dd ddVar = this.showListener.get();
        if (ddVar != null) {
            ddVar.onAdInstanceDidShow();
        }
    }

    @Override // com.p004ironsource.np
    public void onInterstitialShowFailed(String description) {
        dd ddVar = this.showListener.get();
        if (ddVar != null) {
            ddVar.a(description);
        }
    }

    @Override // com.p004ironsource.np
    public void onInterstitialShowSuccess() {
    }

    public final void a(dd showListener) {
        Intrinsics.f(showListener, "showListener");
        this.showListener = new WeakReference<>(showListener);
    }
}
