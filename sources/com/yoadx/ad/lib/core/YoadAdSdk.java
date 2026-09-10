package com.yoadx.ad.lib.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yoadx.ad.lib.bean.SdkConfig;
import com.yoadx.ad.lib.bean.SdkState;
import com.yoadx.ad.lib.utils.NetworkAwaitManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.privatdozent;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: YoadAdSdk.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0003J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0003J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\u001bR$\u0010\u0005\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*R\"\u00102\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00103\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u0019R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00103R8\u0010=\u001a&\u0012\f\u0012\n :*\u0004\u0018\u00010909 :*\u0012\u0012\f\u0012\n :*\u0004\u0018\u00010909\u0018\u00010;088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010<R8\u0010>\u001a&\u0012\f\u0012\n :*\u0004\u0018\u00010\r0\r :*\u0012\u0012\f\u0012\n :*\u0004\u0018\u00010\r0\r\u0018\u00010;088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010<¨\u0006?"}, d2 = {"Lcom/yoadx/ad/lib/core/YoadAdSdk;", "", "<init>", "()V", "Landroid/app/Application;", "context", "Lcom/yoadx/ad/lib/bean/SdkConfig;", "config", "Lartsy/wireman;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "wireman", "(Landroid/app/Application;Lcom/yoadx/ad/lib/bean/SdkConfig;Lartsy/wireman;)V", "Lartsy/dern;", "impassible", "(Lartsy/dern;)V", "apical", "taiyuan", "", "admobPubId", "triweekly", "(Ljava/lang/String;)V", "", "adEnabled", "arytenoidectomy", "(Z)V", "competently", "()Z", "Landroid/app/Activity;", "testDeviceId", "Lartsy/beachfront;", "marial", "(Landroid/app/Activity;Ljava/lang/String;Lartsy/beachfront;)V", "kowloon", "Landroid/content/Context;", "saneness", "Landroid/content/Context;", "dern", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Landroid/os/Handler;", "Landroid/os/Handler;", "mainHandler", "Lcom/yoadx/ad/lib/bean/SdkState;", "Lcom/yoadx/ad/lib/bean/SdkState;", "getSdkState", "()Lcom/yoadx/ad/lib/bean/SdkState;", "monoploid", "(Lcom/yoadx/ad/lib/bean/SdkState;)V", "sdkState", "Z", "impromptu", "setDebugMode", "isDebugMode", "beachfront", "", "Lartsy/marial;", "kotlin.jvm.PlatformType", "", "Ljava/util/List;", "initCallbackList", "initCompleteCallbackList", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class YoadAdSdk {

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static boolean isDebugMode;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static Context context;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final YoadAdSdk f23874attabal = new YoadAdSdk();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final Handler mainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static volatile SdkState sdkState = SdkState.IDLE;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public static boolean adEnabled = true;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public static final List<artsy.marial> initCallbackList = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public static final List<artsy.dern> initCompleteCallbackList = Collections.synchronizedList(new ArrayList());

    public static /* synthetic */ void beachfront(YoadAdSdk yoadAdSdk, Activity activity, String str, artsy.beachfront beachfrontVar, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            beachfrontVar = null;
        }
        yoadAdSdk.marial(activity, str, beachfrontVar);
    }

    public static final void cutely() {
        Iterator<artsy.dern> it = initCompleteCallbackList.iterator();
        while (it.hasNext()) {
            it.next().attabal();
            it.remove();
        }
    }

    public static final void formularize() {
        Iterator<artsy.marial> it = initCallbackList.iterator();
        while (it.hasNext()) {
            it.next().saneness();
            it.remove();
        }
    }

    public final void apical() {
        mainHandler.post(new Runnable() { // from class: com.yoadx.ad.lib.core.impromptu
            @Override // java.lang.Runnable
            public final void run() {
                YoadAdSdk.formularize();
            }
        });
    }

    public final void arytenoidectomy(boolean adEnabled2) {
        adEnabled = adEnabled2;
    }

    public final boolean competently() {
        return adEnabled;
    }

    public final Context dern() {
        return context;
    }

    public final void impassible(artsy.dern listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (sdkState == SdkState.INIT_COMPLETE) {
            listener.attabal();
        } else {
            initCompleteCallbackList.add(listener);
        }
    }

    public final boolean impromptu() {
        return isDebugMode;
    }

    public final boolean kowloon() {
        return sdkState != SdkState.IDLE;
    }

    public final void marial(Activity context2, String testDeviceId, artsy.beachfront listener) {
        Intrinsics.checkNotNullParameter(context2, "context");
        capitulant.wireman.f15376attabal.wireman(context2, testDeviceId, listener);
    }

    public final void monoploid(SdkState sdkState2) {
        Intrinsics.checkNotNullParameter(sdkState2, "<set-?>");
        sdkState = sdkState2;
    }

    public final void taiyuan() {
        mainHandler.post(new Runnable() { // from class: com.yoadx.ad.lib.core.competently
            @Override // java.lang.Runnable
            public final void run() {
                YoadAdSdk.cutely();
            }
        });
    }

    public final void triweekly(String admobPubId) {
        Intrinsics.checkNotNullParameter(admobPubId, "admobPubId");
        if (TextUtils.isEmpty(admobPubId)) {
            throw new IllegalStateException("Illegal admob pub id!!!!!");
        }
        rotproof.attabal.f36890attabal.attabal(com.yoadx.ad.lib.utils.saneness.attabal(admobPubId));
    }

    public final void wireman(Application context2, SdkConfig config, artsy.wireman listener) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        isDebugMode = config.getIsDebugMode();
        context = context2.getApplicationContext();
        triweekly(config.getAdmobPubId());
        rotproof.attabal attabalVar = rotproof.attabal.f36890attabal;
        attabalVar.saneness(config.getAuthorizationHmacKey());
        attabalVar.wireman(config.getHeaderXTokenValue());
        attabalVar.dern(config.getEncryptedKeyRaw());
        cutely.wireman(privatdozent.attabal(premeiotic.saneness()), premeiotic.saneness(), null, new YoadAdSdk$init$1(context2, config, listener, null), 2, null);
        NetworkAwaitManager.f23890attabal.dern();
    }
}
