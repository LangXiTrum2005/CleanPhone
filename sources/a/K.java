package A;

import android.content.Context;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import com.applovin.impl.l4;
import com.inmobi.media.AbstractC2936ab;
import com.inmobi.media.C3236t4;
import com.inmobi.media.V8;
import com.vungle.ads.internal.ui.VungleWebClient;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class K implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ boolean f3144Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ K(int i2, Object obj, boolean z2) {
        this.X = i2;
        this.Z = obj;
        this.f3144Y = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f3144Y;
        Object obj = this.Z;
        switch (this.X) {
            case 0:
                V8.a((V8) obj, z2);
                break;
            case 1:
                AbstractC2936ab.a((Context) obj, z2);
                break;
            case 2:
                C3236t4.a((C3236t4) obj, null, z2);
                break;
            case 3:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) obj;
                eventDispatcher.getClass();
                int i2 = Util.f5683a;
                eventDispatcher.f6081b.onSkipSilenceEnabledChanged(z2);
                break;
            case 4:
                ((l4) obj).a(z2);
                break;
            case 5:
                com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher eventDispatcher2 = (com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher) obj;
                eventDispatcher2.getClass();
                int i3 = com.google.android.exoplayer2.util.Util.f18979a;
                eventDispatcher2.f17292b.onSkipSilenceEnabledChanged(z2);
                break;
            case 6:
                ((com.startapp.sdk.adsbase.c) obj).b(z2);
                break;
            default:
                VungleWebClient.m3259notifyPropertiesChange$lambda25(z2, (VungleWebClient) obj);
                break;
        }
    }

    public /* synthetic */ K(boolean z2, VungleWebClient vungleWebClient) {
        this.X = 7;
        this.f3144Y = z2;
        this.Z = vungleWebClient;
    }
}
