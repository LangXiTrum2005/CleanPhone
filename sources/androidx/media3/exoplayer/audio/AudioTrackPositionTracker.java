package androidx.media3.exoplayer.audio;

import A.RunnableC0916x;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Handler;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import com.inmobi.commons.core.configs.CrashConfig;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
final class AudioTrackPositionTracker {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f6096A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f6097B;
    public long C;
    public long D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f6098E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f6099F;
    public long G;
    public boolean H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f6100I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SystemClock f6101J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Listener f6102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f6103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f6104c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6105e;
    public AudioTimestampPoller f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6107i;
    public float j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6108l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Method f6109n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6110p;
    public boolean q;
    public long r;
    public long s;
    public long t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f6111u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6112w;
    public int x;
    public long y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f6113z;

    public interface Listener {
    }

    public AudioTrackPositionTracker(Listener listener) {
        this.f6102a = listener;
        try {
            this.f6109n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f6103b = new long[10];
        this.f6101J = Clock.f5626a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0139  */
    /* JADX WARN: Code duplicated, block: B:72:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0140  */
    /* JADX WARN: Code duplicated, block: B:74:0x0147  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0154  */
    /* JADX WARN: Code duplicated, block: B:81:0x016d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:96:0x0223 A[Catch: Exception -> 0x0239, TRY_LEAVE, TryCatch #0 {Exception -> 0x0239, blocks: (B:94:0x01fc, B:96:0x0223), top: B:142:0x01fc }] */
    /* JADX WARN: Instruction removed from duplicated block: B:96:0x0223, please report this as an issue */
    public final long a(boolean z2) {
        float f;
        long jM;
        AudioRendererEventListener.EventDispatcher eventDispatcher;
        Handler handler;
        boolean timestamp;
        long j;
        long j2;
        long j3;
        long jM2;
        Method method;
        long jMax;
        AudioTrack audioTrack = this.f6104c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        Listener listener = this.f6102a;
        long j4 = 1000;
        if (playState == 3) {
            this.f6101J.getClass();
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - this.m >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                long jM3 = Util.M(this.g, b());
                if (jM3 != 0) {
                    int i2 = this.f6112w;
                    f = 1.0f;
                    float f2 = this.j;
                    if (f2 != 1.0f) {
                        jM3 = Math.round(jM3 / ((double) f2));
                    }
                    long[] jArr = this.f6103b;
                    jArr[i2] = jM3 - jNanoTime;
                    this.f6112w = (this.f6112w + 1) % 10;
                    int i3 = this.x;
                    if (i3 < 10) {
                        this.x = i3 + 1;
                    }
                    this.m = jNanoTime;
                    this.f6108l = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.x;
                        if (i4 >= i5) {
                            break;
                        }
                        this.f6108l = (jArr[i4] / ((long) i5)) + this.f6108l;
                        i4++;
                    }
                } else {
                    j4 = 1000;
                    f = 1.0f;
                }
            } else {
                j4 = 1000;
                f = 1.0f;
            }
            if (!this.f6106h) {
                AudioTimestampPoller audioTimestampPoller = this.f;
                audioTimestampPoller.getClass();
                AudioTimestampPoller.AudioTimestampWrapper audioTimestampWrapper = audioTimestampPoller.f6088a;
                if (audioTimestampWrapper == null || jNanoTime - audioTimestampPoller.f6091e < audioTimestampPoller.d) {
                    audioTimestampPoller = audioTimestampPoller;
                } else {
                    audioTimestampPoller.f6091e = jNanoTime;
                    AudioTrack audioTrack2 = audioTimestampWrapper.f6092a;
                    AudioTimestamp audioTimestamp = audioTimestampWrapper.f6093b;
                    timestamp = audioTrack2.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        long j5 = audioTimestamp.framePosition;
                        long j6 = audioTimestampWrapper.d;
                        if (j6 > j5) {
                            if (audioTimestampWrapper.f) {
                                audioTimestampWrapper.g += j6;
                                audioTimestampWrapper.f = false;
                            } else {
                                audioTimestampWrapper.f6094c++;
                            }
                        }
                        audioTimestampWrapper.d = j5;
                        audioTimestampWrapper.f6095e = j5 + audioTimestampWrapper.g + (audioTimestampWrapper.f6094c << 32);
                    }
                    int i6 = audioTimestampPoller.f6089b;
                    if (i6 != 0) {
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    if (i6 != 4) {
                                        throw new IllegalStateException();
                                    }
                                } else if (timestamp) {
                                    audioTimestampPoller.a();
                                }
                            } else if (!timestamp) {
                                audioTimestampPoller.a();
                            }
                        } else if (!timestamp) {
                            audioTimestampPoller.a();
                        } else if (audioTimestampWrapper.f6095e > audioTimestampPoller.f) {
                            audioTimestampPoller.b(2);
                        }
                    } else if (timestamp) {
                        if (audioTimestamp.nanoTime / j4 >= audioTimestampPoller.f6090c) {
                            audioTimestampPoller.f = audioTimestampWrapper.f6095e;
                            audioTimestampPoller.b(1);
                        }
                    } else if (jNanoTime - audioTimestampPoller.f6090c > 500000) {
                        audioTimestampPoller.b(3);
                    }
                    if (timestamp) {
                        if (audioTimestampWrapper != null) {
                            j = audioTimestampWrapper.f6093b.nanoTime / j4;
                        } else {
                            j = -9223372036854775807L;
                        }
                        if (audioTimestampWrapper != null) {
                            j2 = audioTimestampWrapper.f6095e;
                        } else {
                            j2 = -1;
                        }
                        j3 = 5000000;
                        jM2 = Util.M(this.g, b());
                        if (Math.abs(j - jNanoTime) > 5000000) {
                            StringBuilder sbV = android.support.v4.media.a.v(j2, "Spurious audio timestamp (system clock mismatch): ", ", ");
                            sbV.append(j);
                            androidx.datastore.preferences.protobuf.a.A(sbV, ", ", jNanoTime, ", ");
                            sbV.append(jM2);
                            sbV.append(", ");
                            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                            sbV.append(defaultAudioSink.g());
                            sbV.append(", ");
                            sbV.append(defaultAudioSink.h());
                            Log.g("DefaultAudioSink", sbV.toString());
                            audioTimestampPoller.b(4);
                        } else if (Math.abs(Util.M(this.g, j2) - jM2) > 5000000) {
                            StringBuilder sbV2 = android.support.v4.media.a.v(j2, "Spurious audio timestamp (frame position mismatch): ", ", ");
                            sbV2.append(j);
                            androidx.datastore.preferences.protobuf.a.A(sbV2, ", ", jNanoTime, ", ");
                            sbV2.append(jM2);
                            sbV2.append(", ");
                            DefaultAudioSink defaultAudioSink2 = DefaultAudioSink.this;
                            sbV2.append(defaultAudioSink2.g());
                            sbV2.append(", ");
                            sbV2.append(defaultAudioSink2.h());
                            Log.g("DefaultAudioSink", sbV2.toString());
                            audioTimestampPoller.b(4);
                        } else if (audioTimestampPoller.f6089b == 4) {
                            audioTimestampPoller.a();
                        }
                    } else {
                        j3 = 5000000;
                    }
                    if (this.q && (method = this.f6109n) != null && jNanoTime - this.r >= 500000) {
                        try {
                            AudioTrack audioTrack3 = this.f6104c;
                            audioTrack3.getClass();
                            Integer num = (Integer) method.invoke(audioTrack3, new Object[0]);
                            int i7 = Util.f5683a;
                            long jIntValue = (((long) num.intValue()) * j4) - this.f6107i;
                            this.o = jIntValue;
                            jMax = Math.max(jIntValue, 0L);
                            this.o = jMax;
                            if (jMax > j3) {
                                Log.g("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                                this.o = 0L;
                            }
                        } catch (Exception unused) {
                            this.f6109n = null;
                        }
                        this.r = jNanoTime;
                    }
                }
                timestamp = false;
                if (timestamp) {
                    j3 = 5000000;
                } else {
                    if (audioTimestampWrapper != null) {
                        j = audioTimestampWrapper.f6093b.nanoTime / j4;
                    } else {
                        j = -9223372036854775807L;
                    }
                    if (audioTimestampWrapper != null) {
                        j2 = audioTimestampWrapper.f6095e;
                    } else {
                        j2 = -1;
                    }
                    j3 = 5000000;
                    jM2 = Util.M(this.g, b());
                    if (Math.abs(j - jNanoTime) > 5000000) {
                        StringBuilder sbV3 = android.support.v4.media.a.v(j2, "Spurious audio timestamp (system clock mismatch): ", ", ");
                        sbV3.append(j);
                        androidx.datastore.preferences.protobuf.a.A(sbV3, ", ", jNanoTime, ", ");
                        sbV3.append(jM2);
                        sbV3.append(", ");
                        DefaultAudioSink defaultAudioSink3 = DefaultAudioSink.this;
                        sbV3.append(defaultAudioSink3.g());
                        sbV3.append(", ");
                        sbV3.append(defaultAudioSink3.h());
                        Log.g("DefaultAudioSink", sbV3.toString());
                        audioTimestampPoller.b(4);
                    } else if (Math.abs(Util.M(this.g, j2) - jM2) > 5000000) {
                        StringBuilder sbV4 = android.support.v4.media.a.v(j2, "Spurious audio timestamp (frame position mismatch): ", ", ");
                        sbV4.append(j);
                        androidx.datastore.preferences.protobuf.a.A(sbV4, ", ", jNanoTime, ", ");
                        sbV4.append(jM2);
                        sbV4.append(", ");
                        DefaultAudioSink defaultAudioSink4 = DefaultAudioSink.this;
                        sbV4.append(defaultAudioSink4.g());
                        sbV4.append(", ");
                        sbV4.append(defaultAudioSink4.h());
                        Log.g("DefaultAudioSink", sbV4.toString());
                        audioTimestampPoller.b(4);
                    } else if (audioTimestampPoller.f6089b == 4) {
                        audioTimestampPoller.a();
                    }
                }
                if (this.q) {
                    AudioTrack audioTrack4 = this.f6104c;
                    audioTrack4.getClass();
                    Integer num2 = (Integer) method.invoke(audioTrack4, new Object[0]);
                    int i8 = Util.f5683a;
                    long jIntValue2 = (((long) num2.intValue()) * j4) - this.f6107i;
                    this.o = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    this.o = jMax;
                    if (jMax > j3) {
                        Log.g("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                        this.o = 0L;
                    }
                    this.r = jNanoTime;
                }
            }
        } else {
            j4 = 1000;
            f = 1.0f;
        }
        this.f6101J.getClass();
        long jNanoTime2 = System.nanoTime() / j4;
        AudioTimestampPoller audioTimestampPoller2 = this.f;
        audioTimestampPoller2.getClass();
        boolean z3 = audioTimestampPoller2.f6089b == 2;
        if (z3) {
            AudioTimestampPoller.AudioTimestampWrapper audioTimestampWrapper2 = audioTimestampPoller2.f6088a;
            jM = Util.v(jNanoTime2 - (audioTimestampWrapper2 != null ? audioTimestampWrapper2.f6093b.nanoTime / j4 : -9223372036854775807L), this.j) + Util.M(this.g, audioTimestampWrapper2 != null ? audioTimestampWrapper2.f6095e : -1L);
        } else {
            jM = this.x == 0 ? Util.M(this.g, b()) : Util.v(this.f6108l + jNanoTime2, this.j);
            if (!z2) {
                jM = Math.max(0L, jM - this.o);
            }
        }
        if (this.f6098E != z3) {
            this.G = this.D;
            this.f6099F = this.C;
        }
        long j7 = jNanoTime2 - this.G;
        if (j7 < 1000000) {
            long jV = Util.v(j7, this.j) + this.f6099F;
            long j8 = (j7 * j4) / 1000000;
            jM = (((j4 - j8) * jV) + (jM * j8)) / j4;
        }
        if (!this.k) {
            long j9 = this.C;
            if (jM > j9) {
                this.k = true;
                long jT = Util.T(jM - j9);
                float f3 = this.j;
                if (f3 != f) {
                    jT = Math.round(jT / ((double) f3));
                }
                this.f6101J.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - Util.T(jT);
                AudioSink.Listener listener2 = DefaultAudioSink.this.s;
                if (listener2 != null && (handler = (eventDispatcher = MediaCodecAudioRenderer.this.G1).f6080a) != null) {
                    handler.post(new RunnableC0916x(eventDispatcher, jCurrentTimeMillis, 1));
                }
            }
        }
        this.D = jNanoTime2;
        this.C = jM;
        this.f6098E = z3;
        return jM;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    public final long b() {
        long j;
        this.f6101J.getClass();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.y != -9223372036854775807L) {
            AudioTrack audioTrack = this.f6104c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f6096A;
            }
            return Math.min(this.f6097B, this.f6096A + Util.O(Util.v(Util.I(jElapsedRealtime) - this.y, this.j), this.g, 1000000L, RoundingMode.CEILING));
        }
        if (jElapsedRealtime - this.s >= 5) {
            AudioTrack audioTrack2 = this.f6104c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack2.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f6106h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.v = this.t;
                    }
                    playbackHeadPosition += this.v;
                }
                if (Util.f5683a > 29) {
                    j = this.t;
                    if (j > playbackHeadPosition) {
                        if (this.H) {
                            this.f6100I += j;
                            this.H = false;
                        } else {
                            this.f6111u++;
                        }
                    }
                    this.t = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.t <= 0 || playState != 3) {
                    this.f6113z = -9223372036854775807L;
                    j = this.t;
                    if (j > playbackHeadPosition) {
                        if (this.H) {
                            this.f6100I += j;
                            this.H = false;
                        } else {
                            this.f6111u++;
                        }
                    }
                    this.t = playbackHeadPosition;
                } else if (this.f6113z == -9223372036854775807L) {
                    this.f6113z = jElapsedRealtime;
                }
            }
            this.s = jElapsedRealtime;
        }
        return this.t + this.f6100I + (this.f6111u << 32);
    }

    public final boolean c(long j) {
        long jA = a(false);
        int i2 = this.g;
        int i3 = Util.f5683a;
        if (j > Util.O(jA, i2, 1000000L, RoundingMode.CEILING)) {
            return true;
        }
        if (this.f6106h) {
            AudioTrack audioTrack = this.f6104c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && b() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        this.f6108l = 0L;
        this.x = 0;
        this.f6112w = 0;
        this.m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.k = false;
    }
}
