package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3414a2;
import com.ironsource.C3700q2;
import com.ironsource.X3;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ActivityManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 42\u00020\u0001:\u0003567B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0010J!\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010 J\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010\u001eJ\u0017\u0010&\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010 R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\r018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00068"}, d2 = {"Lcom/vungle/ads/internal/util/attabal;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/content/Context;", "context", "", X3.a.f, "(Landroid/content/Context;)V", "deInit", "", "isAppInForeground", "()Z", "Lcom/vungle/ads/internal/util/attabal$saneness;", "callback", "addListener", "(Lcom/vungle/ads/internal/util/attabal$saneness;)V", "Landroid/content/Intent;", "deepLinkOverrideIntent", "defaultIntent", "Lcom/vungle/ads/internal/ui/saneness;", "adOpenCallback", "startActivitySafely", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;Lcom/vungle/ads/internal/ui/saneness;)Z", "removeListener", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityStopped", "onActivityResumed", "onActivityPaused", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "foregroundActivityCount", "I", "Z", "Lcom/vungle/ads/internal/util/attabal$dern;", "targetActivityInfo", "Lcom/vungle/ads/internal/util/attabal$dern;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "callbacks", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Companion", "attabal", "saneness", "dern", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class attabal implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = "ActivityManager";
    private volatile int foregroundActivityCount;
    private volatile boolean isAppInForeground;
    private volatile TargetActivityInfo targetActivityInfo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final attabal instance = new attabal();
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final CopyOnWriteArraySet<saneness> callbacks = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: com.vungle.ads.internal.util.attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: ActivityManager.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0010R \u0010\u001b\u001a\u00020\u001a8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/vungle/ads/internal/util/attabal$attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "deepLinkOverrideIntent", "defaultIntent", "Lcom/vungle/ads/internal/ui/saneness;", "adOpenCallback", "", "startWhenForeground", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;Lcom/vungle/ads/internal/ui/saneness;)Z", "", X3.a.f, "(Landroid/content/Context;)V", "isForeground", "()Z", "Lcom/vungle/ads/internal/util/attabal$saneness;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addLifecycleListener", "(Lcom/vungle/ads/internal/util/attabal$saneness;)V", "removeLifecycleListener", "deInit$vungle_ads_release", "deInit", "Lcom/vungle/ads/internal/util/attabal;", C3700q2.p, "Lcom/vungle/ads/internal/util/attabal;", "getInstance$vungle_ads_release", "()Lcom/vungle/ads/internal/util/attabal;", "getInstance$vungle_ads_release$annotations", "", "TAG", "Ljava/lang/String;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addLifecycleListener(saneness listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            getInstance$vungle_ads_release().addListener(listener);
        }

        public final void deInit$vungle_ads_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            getInstance$vungle_ads_release().deInit(context);
        }

        public final attabal getInstance$vungle_ads_release() {
            return attabal.instance;
        }

        public final void init(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            getInstance$vungle_ads_release().init(context);
        }

        public final boolean isForeground() {
            return getInstance$vungle_ads_release().isAppInForeground();
        }

        public final void removeLifecycleListener(saneness listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            getInstance$vungle_ads_release().removeListener(listener);
        }

        public final boolean startWhenForeground(Context context, Intent deepLinkOverrideIntent, Intent defaultIntent, com.vungle.ads.internal.ui.saneness adOpenCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (isForeground()) {
                return getInstance$vungle_ads_release().startActivitySafely(context, deepLinkOverrideIntent, defaultIntent, adOpenCallback);
            }
            getInstance$vungle_ads_release().targetActivityInfo = new TargetActivityInfo(new WeakReference(context), deepLinkOverrideIntent, defaultIntent, adOpenCallback);
            return false;
        }

        private Companion() {
        }

        public static /* synthetic */ void getInstance$vungle_ads_release$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.util.attabal$dern, reason: from toString */
    /* JADX INFO: compiled from: ActivityManager.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JD\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0012¨\u0006&"}, d2 = {"Lcom/vungle/ads/internal/util/attabal$dern;", "", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "deepLinkOverrideIntent", "defaultIntent", "Lcom/vungle/ads/internal/ui/saneness;", "adOpenCallback", "<init>", "(Ljava/lang/ref/WeakReference;Landroid/content/Intent;Landroid/content/Intent;Lcom/vungle/ads/internal/ui/saneness;)V", "component1", "()Ljava/lang/ref/WeakReference;", "component2", "()Landroid/content/Intent;", "component3", "component4", "()Lcom/vungle/ads/internal/ui/saneness;", "copy", "(Ljava/lang/ref/WeakReference;Landroid/content/Intent;Landroid/content/Intent;Lcom/vungle/ads/internal/ui/saneness;)Lcom/vungle/ads/internal/util/attabal$dern;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/ref/WeakReference;", "getContext", "Landroid/content/Intent;", "getDeepLinkOverrideIntent", "getDefaultIntent", "Lcom/vungle/ads/internal/ui/saneness;", "getAdOpenCallback", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class TargetActivityInfo {
        private final com.vungle.ads.internal.ui.saneness adOpenCallback;
        private final WeakReference<Context> context;
        private final Intent deepLinkOverrideIntent;
        private final Intent defaultIntent;

        public TargetActivityInfo(WeakReference<Context> context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.saneness sanenessVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            this.deepLinkOverrideIntent = intent;
            this.defaultIntent = intent2;
            this.adOpenCallback = sanenessVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TargetActivityInfo copy$default(TargetActivityInfo targetActivityInfo, WeakReference weakReference, Intent intent, Intent intent2, com.vungle.ads.internal.ui.saneness sanenessVar, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = targetActivityInfo.context;
            }
            if ((i & 2) != 0) {
                intent = targetActivityInfo.deepLinkOverrideIntent;
            }
            if ((i & 4) != 0) {
                intent2 = targetActivityInfo.defaultIntent;
            }
            if ((i & 8) != 0) {
                sanenessVar = targetActivityInfo.adOpenCallback;
            }
            return targetActivityInfo.copy(weakReference, intent, intent2, sanenessVar);
        }

        public final WeakReference<Context> component1() {
            return this.context;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Intent getDeepLinkOverrideIntent() {
            return this.deepLinkOverrideIntent;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Intent getDefaultIntent() {
            return this.defaultIntent;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final com.vungle.ads.internal.ui.saneness getAdOpenCallback() {
            return this.adOpenCallback;
        }

        public final TargetActivityInfo copy(WeakReference<Context> context, Intent deepLinkOverrideIntent, Intent defaultIntent, com.vungle.ads.internal.ui.saneness adOpenCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new TargetActivityInfo(context, deepLinkOverrideIntent, defaultIntent, adOpenCallback);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TargetActivityInfo)) {
                return false;
            }
            TargetActivityInfo targetActivityInfo = (TargetActivityInfo) other;
            return Intrinsics.wireman(this.context, targetActivityInfo.context) && Intrinsics.wireman(this.deepLinkOverrideIntent, targetActivityInfo.deepLinkOverrideIntent) && Intrinsics.wireman(this.defaultIntent, targetActivityInfo.defaultIntent) && Intrinsics.wireman(this.adOpenCallback, targetActivityInfo.adOpenCallback);
        }

        public final com.vungle.ads.internal.ui.saneness getAdOpenCallback() {
            return this.adOpenCallback;
        }

        public final WeakReference<Context> getContext() {
            return this.context;
        }

        public final Intent getDeepLinkOverrideIntent() {
            return this.deepLinkOverrideIntent;
        }

        public final Intent getDefaultIntent() {
            return this.defaultIntent;
        }

        public int hashCode() {
            int iHashCode = this.context.hashCode() * 31;
            Intent intent = this.deepLinkOverrideIntent;
            int iHashCode2 = (iHashCode + (intent == null ? 0 : intent.hashCode())) * 31;
            Intent intent2 = this.defaultIntent;
            int iHashCode3 = (iHashCode2 + (intent2 == null ? 0 : intent2.hashCode())) * 31;
            com.vungle.ads.internal.ui.saneness sanenessVar = this.adOpenCallback;
            return iHashCode3 + (sanenessVar != null ? sanenessVar.hashCode() : 0);
        }

        public String toString() {
            return "TargetActivityInfo(context=" + this.context + ", deepLinkOverrideIntent=" + this.deepLinkOverrideIntent + ", defaultIntent=" + this.defaultIntent + ", adOpenCallback=" + this.adOpenCallback + ')';
        }
    }

    private attabal() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addListener(saneness callback) {
        this.callbacks.add(callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deInit(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.competently(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        this.isInitialized.set(false);
        this.targetActivityInfo = null;
        this.foregroundActivityCount = 0;
        this.isAppInForeground = false;
        this.callbacks.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(Context context) {
        Object objM3351constructorimpl;
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.competently(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            objM3351constructorimpl = Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            arytenoidectomy.INSTANCE.e(TAG, "Error initializing ActivityManager", thM3354exceptionOrNullimpl);
            this.isInitialized.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAppInForeground() {
        return !this.isInitialized.get() || this.isAppInForeground;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean startActivitySafely(Context context, Intent deepLinkOverrideIntent, Intent defaultIntent, com.vungle.ads.internal.ui.saneness adOpenCallback) {
        try {
            if (deepLinkOverrideIntent == null) {
                if (defaultIntent != null) {
                    context.startActivity(defaultIntent);
                }
                return false;
            }
            context.startActivity(deepLinkOverrideIntent);
            if (adOpenCallback != null) {
                adOpenCallback.onDeeplinkClick(true);
            }
            return true;
        } catch (Exception e) {
            arytenoidectomy.INSTANCE.e(TAG, "Failed to start activity: " + e);
            if (deepLinkOverrideIntent != null && adOpenCallback != null) {
                try {
                    adOpenCallback.onDeeplinkClick(false);
                    if (deepLinkOverrideIntent != null) {
                        context.startActivity(defaultIntent);
                        return true;
                    }
                } catch (Exception unused) {
                }
            } else if (deepLinkOverrideIntent != null && defaultIntent != null) {
                context.startActivity(defaultIntent);
                return true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((saneness) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((saneness) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.foregroundActivityCount++;
        if (this.isAppInForeground || this.foregroundActivityCount != 1) {
            return;
        }
        this.isAppInForeground = true;
        TargetActivityInfo targetActivityInfo = this.targetActivityInfo;
        if (targetActivityInfo != null) {
            Context it = targetActivityInfo.getContext().get();
            if (it != null) {
                Companion companion = INSTANCE;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                companion.startWhenForeground(it, targetActivityInfo.getDeepLinkOverrideIntent(), targetActivityInfo.getDefaultIntent(), targetActivityInfo.getAdOpenCallback());
            }
            this.targetActivityInfo = null;
        }
        Iterator<T> it2 = this.callbacks.iterator();
        while (it2.hasNext()) {
            ((saneness) it2.next()).onForeground();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.foregroundActivityCount--;
        if (this.isAppInForeground && this.foregroundActivityCount == 0) {
            this.isAppInForeground = false;
            Iterator<T> it = this.callbacks.iterator();
            while (it.hasNext()) {
                ((saneness) it.next()).onBackground();
            }
        }
    }

    public final void removeListener(saneness callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.remove(callback);
    }

    /* JADX INFO: compiled from: ActivityManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/vungle/ads/internal/util/attabal$saneness;", "", "<init>", "()V", "", "onForeground", "onBackground", "Landroid/app/Activity;", "activity", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class saneness {
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public void onBackground() {
        }

        public void onForeground() {
        }
    }
}
