package com.applovin.impl.sdk;

import android.content.ContentResolver;
import android.content.pm.ApkChecksum;
import android.media.AudioDescriptor;
import android.provider.Settings;
import com.applovin.impl.j5;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.u3;
import com.applovin.impl.w3;
import com.facebook.appevents.AppEventsManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.ironsource.InterfaceC0343fg;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.mbridge.msdk.config.component.log.LogCpt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements m.d, s.a, u3.b, q7.w, q7.m, InterfaceC0343fg, com.mbridge.msdk.tracker.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9393a;

    public /* synthetic */ b0(int i10) {
        this.f9393a = i10;
    }

    public static /* bridge */ /* synthetic */ ApkChecksum b(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor d(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override // com.applovin.impl.u3.b
    public Object a(Object obj) {
        return w3.a((Long) obj);
    }

    @Override // s.a
    public Object apply(Object obj) {
        return AppLovinNativeAdImpl.lambda$getCustomTabsSettings$1((j5) obj);
    }

    @Override // q7.m
    public void c(boolean z10) {
        switch (this.f9393a) {
            case 4:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$0(z10);
                break;
            case 5:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$3(z10);
                break;
            case 6:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$4(z10);
                break;
            case 7:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$5(z10);
                break;
            case 8:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$6(z10);
                break;
            case 9:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$7(z10);
                break;
            case 10:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$8(z10);
                break;
            case 11:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$9(z10);
                break;
            case 12:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$10(z10);
                break;
            case 13:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$11(z10);
                break;
            case 14:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$12(z10);
                break;
            case 15:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$13(z10);
                break;
            case 16:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$14(z10);
                break;
            case 17:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$15(z10);
                break;
            case 18:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$16(z10);
                break;
            case 19:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$1(z10);
                break;
            case 20:
                AppEventsManager.AnonymousClass1.onSuccess$lambda$2(z10);
                break;
            default:
                ActivityLifecycleTracker.startTracking$lambda$0(z10);
                break;
        }
    }

    @Override // com.applovin.impl.sdk.m.d
    public String a(ContentResolver contentResolver, String str) {
        return Settings.Global.getString(contentResolver, str);
    }

    @Override // com.ironsource.InterfaceC0343fg
    public void a(jk.a aVar) {
        IronSourceThreadManager.a(aVar);
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(com.mbridge.msdk.tracker.e eVar) {
        switch (this.f9393a) {
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return com.mbridge.msdk.config.component.common.metrics.a.a(eVar);
            default:
                return LogCpt.a(eVar);
        }
    }
}
