package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.SystemClock;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public interface ExoPlayer extends Player {

    @Deprecated
    public interface AudioComponent {
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f17023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SystemClock f17024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f17025c;
        public Supplier d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f17026e;
        public Supplier f;
        public final b g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Looper f17027h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AudioAttributes f17028i;
        public final int j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final SeekParameters f17029l;
        public final DefaultLivePlaybackSpeedControl m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final long f17030n;
        public final long o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f17031p;
        public boolean q;

        public Builder(Context context) {
            b bVar = new b(context, 0);
            b bVar2 = new b(context, 1);
            b bVar3 = new b(context, 2);
            C2923c c2923c = new C2923c();
            b bVar4 = new b(context, 3);
            context.getClass();
            this.f17023a = context;
            this.f17025c = bVar;
            this.d = bVar2;
            this.f17026e = bVar3;
            this.f = c2923c;
            this.g = bVar4;
            int i2 = Util.f18979a;
            Looper looperMyLooper = Looper.myLooper();
            this.f17027h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
            this.f17028i = AudioAttributes.h0;
            this.j = 1;
            this.k = true;
            this.f17029l = SeekParameters.f17198c;
            this.m = new DefaultLivePlaybackSpeedControl(Util.B(20L), Util.B(500L), 0.999f);
            this.f17024b = Clock.f18892a;
            this.f17030n = 500L;
            this.o = 2000L;
            this.f17031p = true;
        }

        public final ExoPlayer a() {
            Assertions.d(!this.q);
            this.q = true;
            return new ExoPlayerImpl(this);
        }
    }

    @Deprecated
    public interface DeviceComponent {
    }

    @Deprecated
    public interface TextComponent {
    }

    @Deprecated
    public interface VideoComponent {
    }

    @Override // com.google.android.exoplayer2.Player
    ExoPlaybackException a();

    Format c();

    public interface AudioOffloadListener {
        default void m() {
        }
    }
}
