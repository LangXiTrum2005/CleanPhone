package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
final class AudioTimestampPoller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioTimestampWrapper f6088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6090c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6091e;
    public long f;

    public static final class AudioTimestampWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f6092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f6093b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f6094c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f6095e;
        public boolean f;
        public long g;

        public AudioTimestampWrapper(AudioTrack audioTrack) {
            this.f6092a = audioTrack;
        }
    }

    public AudioTimestampPoller(AudioTrack audioTrack) {
        this.f6088a = new AudioTimestampWrapper(audioTrack);
        a();
    }

    public final void a() {
        if (this.f6088a != null) {
            b(0);
        }
    }

    public final void b(int i2) {
        this.f6089b = i2;
        if (i2 == 0) {
            this.f6091e = 0L;
            this.f = -1L;
            this.f6090c = System.nanoTime() / 1000;
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
