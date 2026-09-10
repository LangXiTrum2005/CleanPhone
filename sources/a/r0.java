package A;

import android.app.Activity;
import android.media.AudioTrack;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import com.applovin.impl.c3;
import com.applovin.impl.e1;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.n2;
import com.applovin.sdk.AppLovinAd;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.s3;
import com.inmobi.media.C3107l2;
import com.inmobi.media.C3187q2;
import com.inmobi.media.C3202r2;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3193Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ r0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.X = i2;
        this.Z = obj;
        this.e0 = obj2;
        this.f3193Y = obj3;
        this.f0 = obj4;
        this.g0 = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3187q2.a((C3187q2) this.Z, (C3107l2) this.e0, (Handler) this.f3193Y, (C3202r2) this.f0, (WebView) this.g0);
                return;
            case 1:
                AudioTrack audioTrack = (AudioTrack) this.Z;
                AudioSink.Listener listener = (AudioSink.Listener) this.e0;
                Handler handler = (Handler) this.f3193Y;
                AudioSink.AudioTrackConfig audioTrackConfig = (AudioSink.AudioTrackConfig) this.f0;
                ConditionVariable conditionVariable = (ConditionVariable) this.g0;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (listener != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new I0(13, listener, audioTrackConfig));
                    }
                    conditionVariable.d();
                    synchronized (DefaultAudioSink.m0) {
                        try {
                            int i2 = DefaultAudioSink.o0 - 1;
                            DefaultAudioSink.o0 = i2;
                            if (i2 == 0) {
                                DefaultAudioSink.n0.shutdown();
                                DefaultAudioSink.n0 = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    if (listener != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new I0(13, listener, audioTrackConfig));
                    }
                    conditionVariable.d();
                    synchronized (DefaultAudioSink.m0) {
                        try {
                            int i3 = DefaultAudioSink.o0 - 1;
                            DefaultAudioSink.o0 = i3;
                            if (i3 == 0) {
                                DefaultAudioSink.n0.shutdown();
                                DefaultAudioSink.n0 = null;
                            }
                            throw th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            case 2:
                ((e1) this.Z).a((View) this.e0, (FrameLayout) this.f3193Y, (ViewTreeObserver) this.f0, (X) this.g0);
                return;
            case 3:
                ((MediationServiceImpl) this.Z).a((c3) this.e0, (com.applovin.impl.mediation.h) this.f3193Y, (Activity) this.f0, (com.applovin.impl.mediation.ads.a.InterfaceC0034a) this.g0);
                return;
            case 4:
                ((n2) this.Z).a((Lifecycle) this.e0, (AppLovinAd) this.f3193Y, (ViewGroup) this.f0, (Activity) this.g0);
                return;
            case 5:
                VungleWebClient.m3264shouldOverrideUrlLoading$lambda16$lambda15$lambda14((WebViewAPI.MraidDelegate) this.Z, (String) this.e0, (JsonObject) this.f3193Y, (VungleWebClient) this.f0, (WebView) this.g0);
                return;
            default:
                s3.a((s3) this.Z, (String) this.e0, (String) this.f3193Y, (StartCallback) this.f0, (ChartboostError) this.g0);
                return;
        }
    }
}
