package com.google.android.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
final class AudioTimestampPoller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioTimestampV19 f17295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17297c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17298e;
    public long f;

    public static final class AudioTimestampV19 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f17299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f17300b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f17301c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f17302e;

        public AudioTimestampV19(AudioTrack audioTrack) {
            this.f17299a = audioTrack;
        }
    }

    public AudioTimestampPoller(AudioTrack audioTrack) {
        if (Util.f18979a >= 19) {
            this.f17295a = new AudioTimestampV19(audioTrack);
            a();
        } else {
            this.f17295a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.f17295a != null) {
            b(0);
        }
    }

    public final void b(int i2) {
        this.f17296b = i2;
        if (i2 == 0) {
            this.f17298e = 0L;
            this.f = -1L;
            this.f17297c = System.nanoTime() / 1000;
            this.d = 10000L;
            return;
        }
        if (i2 == 1) {
            this.d = 10000L;
            return;
        }
        if (i2 == 2 || i2 == 3) {
            this.d = 10000000L;
        } else {
            if (i2 != 4) {
                throw new IllegalStateException();
            }
            this.d = 500000L;
        }
    }
}
