package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.f2;
import com.applovin.impl.g6;
import com.applovin.impl.h2;
import com.applovin.impl.p2;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u;
import com.applovin.impl.y1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f7460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f7461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f7462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f7463d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Messenger f7464e;

    /* JADX INFO: renamed from: com.applovin.impl.adview.activity.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0002a implements AppLovinAdLoadListener {
        public C0002a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.f7462c.get();
            if (appLovinFullscreenActivity != null) {
                p unused = a.this.f7461b;
                if (p.a()) {
                    a.this.f7461b.a("AppLovinFullscreenActivity", "Presenting ad...");
                }
                b bVar = new b(a.this, null);
                y1.a((com.applovin.impl.sdk.ad.b) appLovinAd, bVar, bVar, bVar, null, a.this.f7460a, appLovinFullscreenActivity, new C0003a(appLovinFullscreenActivity, appLovinAd, bVar));
                return;
            }
            p unused2 = a.this.f7461b;
            if (p.a()) {
                a.this.f7461b.b("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            a.this.a("failed_to_receive_ad");
        }

        /* JADX INFO: renamed from: com.applovin.impl.adview.activity.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class C0003a implements y1.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppLovinFullscreenActivity f7466a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppLovinAd f7467b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f7468c;

            public C0003a(AppLovinFullscreenActivity appLovinFullscreenActivity, AppLovinAd appLovinAd, b bVar) {
                this.f7466a = appLovinFullscreenActivity;
                this.f7467b = appLovinAd;
                this.f7468c = bVar;
            }

            @Override // com.applovin.impl.y1.g
            public void a(y1 y1Var) {
                this.f7466a.setPresenter(y1Var);
                y1Var.w();
            }

            @Override // com.applovin.impl.y1.g
            public void a(String str, Throwable th2) {
                p2.a((com.applovin.impl.sdk.ad.b) this.f7467b, this.f7468c, str, th2, this.f7466a);
                Map mapA = h2.a((AppLovinAdImpl) this.f7467b);
                CollectionUtils.putStringIfValid("source", "processAdResponse", mapA);
                CollectionUtils.putStringIfValid("error_message", str, mapA);
                CollectionUtils.putStringIfValid("top_main_method", th2.toString(), mapA);
                a.this.f7460a.g().d(f2.G, mapA);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private b() {
        }

        private void a(FullscreenAdService.c cVar) {
            a(null, cVar);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d10);
            bundle.putBoolean("fully_watched", z10);
            a(bundle, FullscreenAdService.c.AD_VIDEO_ENDED);
        }

        public /* synthetic */ b(a aVar, C0002a c0002a) {
            this();
        }

        private void a(Bundle bundle, FullscreenAdService.c cVar) {
            Message messageObtain = Message.obtain((Handler) null, cVar.b());
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            try {
                a.this.f7464e.send(messageObtain);
            } catch (RemoteException e10) {
                p unused = a.this.f7461b;
                if (p.a()) {
                    a.this.f7461b.a("AppLovinFullscreenActivity", "Failed to forward callback (" + cVar.b() + ")", e10);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f7471a;

        public /* synthetic */ c(a aVar, C0002a c0002a) {
            this(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            if (message.what != FullscreenAdService.c.AD.b() || (aVar = (a) this.f7471a.get()) == null) {
                super.handleMessage(message);
            } else {
                aVar.b(message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            }
        }

        private c(a aVar) {
            this.f7471a = new WeakReference(aVar);
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, l lVar) {
        this.f7460a = lVar;
        this.f7461b = lVar.Q();
        this.f7462c = new WeakReference(appLovinFullscreenActivity);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f7463d.compareAndSet(false, true)) {
            if (p.a()) {
                this.f7461b.a("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f7464e = new Messenger(iBinder);
            Message messageObtain = Message.obtain((Handler) null, FullscreenAdService.c.AD.b());
            messageObtain.replyTo = new Messenger(new c(this, null));
            try {
                if (p.a()) {
                    this.f7461b.a("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f7464e.send(messageObtain);
            } catch (RemoteException e10) {
                if (p.a()) {
                    this.f7461b.a("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e10);
                }
                a("failed_to_send_ad_request");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f7463d.compareAndSet(true, false) && p.a()) {
            this.f7461b.a("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.f7462c.get();
        if (appLovinFullscreenActivity != null) {
            if (p.a()) {
                this.f7461b.a("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss(str);
        } else if (p.a()) {
            this.f7461b.b("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = JsonUtils.getString(jSONObject, "zone_id", "");
            if (TextUtils.isEmpty(string)) {
                throw new IllegalStateException("No zone identifier found in ad response: " + jSONObject);
            }
            this.f7460a.s0().a(new g6(jSONObject, u.a(string), SystemClock.elapsedRealtime(), true, new C0002a(), this.f7460a));
        } catch (JSONException e10) {
            if (p.a()) {
                this.f7461b.a("AppLovinFullscreenActivity", "Unable to process ad: " + str, e10);
            }
            a("failed_to_process_ad");
        }
    }
}
