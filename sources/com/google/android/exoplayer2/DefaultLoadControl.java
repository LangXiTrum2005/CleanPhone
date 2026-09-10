package com.google.android.exoplayer2;

import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultLoadControl implements LoadControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultAllocator f17009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17011c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17012e;
    public final int f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17014i;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DefaultAllocator f17015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17017c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17018e;
        public boolean f;
    }

    public DefaultLoadControl(DefaultAllocator defaultAllocator, int i2, int i3, int i4, int i5) {
        c(i4, 0, "bufferForPlaybackMs", "0");
        c(i5, 0, "bufferForPlaybackAfterRebufferMs", "0");
        c(i2, i4, "minBufferMs", "bufferForPlaybackMs");
        c(i2, i5, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        c(i3, i2, "maxBufferMs", "minBufferMs");
        c(0, 0, "backBufferDurationMs", "0");
        this.f17009a = defaultAllocator;
        this.f17010b = Util.B(i2);
        this.f17011c = Util.B(i3);
        this.d = Util.B(i4);
        this.f17012e = Util.B(i5);
        this.f = -1;
        this.f17013h = 13107200;
        this.g = Util.B(0);
    }

    public static void c(int i2, int i3, String str, String str2) {
        Assertions.a(str + " cannot be less than " + str2, i2 >= i3);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public final boolean a(long j, float f, boolean z2, long j2) {
        int i2;
        int i3 = Util.f18979a;
        if (f != 1.0f) {
            j = Math.round(j / ((double) f));
        }
        long jMin = z2 ? this.f17012e : this.d;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        if (jMin <= 0 || j >= jMin) {
            return true;
        }
        DefaultAllocator defaultAllocator = this.f17009a;
        synchronized (defaultAllocator) {
            i2 = defaultAllocator.f18757e * defaultAllocator.f18755b;
        }
        return i2 >= this.f17013h;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.exoplayer2.LoadControl
    public final void b(Renderer[] rendererArr, ExoTrackSelection[] exoTrackSelectionArr) {
        int iMax = this.f;
        if (iMax == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 13107200;
                if (i2 < rendererArr.length) {
                    if (exoTrackSelectionArr[i2] != null) {
                        switch (rendererArr[i2].getTrackType()) {
                            case -2:
                                i4 = 0;
                                i3 += i4;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i4 = 144310272;
                                i3 += i4;
                                break;
                            case 1:
                                i3 += i4;
                                break;
                            case 2:
                                i4 = 131072000;
                                i3 += i4;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i4 = 131072;
                                i3 += i4;
                                break;
                        }
                    }
                    i2++;
                } else {
                    iMax = Math.max(13107200, i3);
                }
            }
        }
        this.f17013h = iMax;
        this.f17009a.c(iMax);
    }

    public final void d(boolean z2) {
        int i2 = this.f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        this.f17013h = i2;
        this.f17014i = false;
        if (z2) {
            DefaultAllocator defaultAllocator = this.f17009a;
            synchronized (defaultAllocator) {
                if (defaultAllocator.f18754a) {
                    defaultAllocator.c(0);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public final DefaultAllocator getAllocator() {
        return this.f17009a;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public final long getBackBufferDurationUs() {
        return this.g;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public final void onPrepared() {
        d(false);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public final void onReleased() {
        d(true);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public final void onStopped() {
        d(true);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public final boolean retainBackBufferFromKeyframe() {
        return false;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public final boolean shouldContinueLoading(long j, float f) {
        int i2;
        DefaultAllocator defaultAllocator = this.f17009a;
        synchronized (defaultAllocator) {
            i2 = defaultAllocator.f18757e * defaultAllocator.f18755b;
        }
        boolean z2 = i2 >= this.f17013h;
        long j2 = this.f17011c;
        long jMin = this.f17010b;
        if (f > 1.0f) {
            jMin = Math.min(Util.r(jMin, f), j2);
        }
        if (j < Math.max(jMin, 500000L)) {
            this.f17014i = !z2;
            if (z2 && j < 500000) {
                Log.g("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= j2 || z2) {
            this.f17014i = false;
        }
        return this.f17014i;
    }
}
