package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Player;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.image.ImageOutput;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;

/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends Player {

    @Deprecated
    public interface AudioComponent {
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f5853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SystemClock f5854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f5855c;
        public final c d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f5856e;
        public final c f;
        public final Looper g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f5857h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AudioAttributes f5858i;
        public final int j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final SeekParameters f5859l;
        public final long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final long f5860n;
        public final long o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final DefaultLivePlaybackSpeedControl f5861p;
        public final long q;
        public final long r;
        public final boolean s;
        public boolean t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final String f5862u;

        public Builder(Context context) {
            c cVar = new c(context, 0);
            c cVar2 = new c(context, 1);
            c cVar3 = new c(context, 2);
            c cVar4 = new c(context, 3);
            this.f5853a = context;
            this.f5855c = cVar;
            this.d = cVar2;
            this.f5856e = cVar3;
            this.f = cVar4;
            int i2 = Util.f5683a;
            Looper looperMyLooper = Looper.myLooper();
            this.g = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
            this.f5858i = AudioAttributes.f5374b;
            this.j = 1;
            this.k = true;
            this.f5859l = SeekParameters.f5984c;
            this.m = 5000L;
            this.f5860n = MBInterstitialActivity.WEB_LOAD_TIME;
            this.o = com.smartdigimkt.u2.m.D0;
            this.f5861p = new DefaultLivePlaybackSpeedControl(Util.I(20L), Util.I(500L), 0.999f);
            this.f5854b = Clock.f5626a;
            this.q = 500L;
            this.r = 2000L;
            this.s = true;
            this.f5862u = "";
            this.f5857h = -1000;
        }

        public final ExoPlayer a() {
            Assertions.e(!this.t);
            this.t = true;
            return new ExoPlayerImpl(this);
        }
    }

    @Deprecated
    public interface DeviceComponent {
    }

    public static class PreloadConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PreloadConfiguration f5863a = new PreloadConfiguration();
    }

    @Deprecated
    public interface TextComponent {
    }

    @Deprecated
    public interface VideoComponent {
    }

    @Override // androidx.media3.common.Player
    ExoPlaybackException a();

    void release();

    void setImageOutput(ImageOutput imageOutput);

    public interface AudioOffloadListener {
        default void s() {
        }
    }
}
