package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class ProgressiveMediaPeriod implements MediaPeriod, ExtractorOutput, Loader.Callback<ExtractingLoadable>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {
    public static final Map N0;
    public static final Format O0;
    public boolean B0;
    public boolean D0;
    public boolean E0;
    public int F0;
    public boolean G0;
    public long H0;
    public boolean J0;
    public int K0;
    public boolean L0;
    public boolean M0;
    public final Uri X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final DataSource f18361Y;
    public final DrmSessionManager Z;
    public final DefaultLoadErrorHandlingPolicy e0;
    public final MediaSourceEventListener.EventDispatcher f0;
    public final DrmSessionEventListener.EventDispatcher g0;
    public final ProgressiveMediaSource h0;
    public final Allocator i0;
    public final String j0;
    public final long k0;
    public final ProgressiveMediaExtractor m0;
    public MediaPeriod.Callback r0;
    public IcyHeaders s0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public TrackState y0;
    public SeekMap z0;
    public final Loader l0 = new Loader("ProgressiveMediaPeriod");
    public final ConditionVariable n0 = new ConditionVariable(0);
    public final f o0 = new f(this, 0);
    public final f p0 = new f(this, 1);
    public final Handler q0 = Util.l(null);
    public TrackId[] u0 = new TrackId[0];
    public SampleQueue[] t0 = new SampleQueue[0];
    public long I0 = -9223372036854775807L;
    public long A0 = -9223372036854775807L;
    public int C0 = 1;

    public final class ExtractingLoadable implements Loader.Loadable, IcyDataSource.Listener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f18363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StatsDataSource f18364c;
        public final ProgressiveMediaExtractor d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ExtractorOutput f18365e;
        public final ConditionVariable f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f18366h;
        public long j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public SampleQueue f18368l;
        public boolean m;
        public final PositionHolder g = new PositionHolder();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f18367i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18362a = LoadEventInfo.f18338b.getAndIncrement();
        public DataSpec k = a(0);

        public ExtractingLoadable(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable conditionVariable) {
            this.f18363b = uri;
            this.f18364c = new StatsDataSource(dataSource);
            this.d = progressiveMediaExtractor;
            this.f18365e = extractorOutput;
            this.f = conditionVariable;
        }

        public final DataSpec a(long j) {
            DataSpec.Builder builder = new DataSpec.Builder();
            builder.f18748a = this.f18363b;
            builder.f = j;
            builder.f18752h = ProgressiveMediaPeriod.this.j0;
            builder.f18753i = 6;
            builder.f18751e = ProgressiveMediaPeriod.N0;
            return builder.a();
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public final void cancelLoad() {
            this.f18366h = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public final void load() {
            DataSource icyDataSource;
            int i2;
            int iC = 0;
            while (iC == 0 && !this.f18366h) {
                try {
                    long j = this.g.f17554a;
                    DataSpec dataSpecA = a(j);
                    this.k = dataSpecA;
                    long jA = this.f18364c.a(dataSpecA);
                    if (jA != -1) {
                        jA += j;
                        ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
                        progressiveMediaPeriod.q0.post(new f(progressiveMediaPeriod, 2));
                    }
                    long j2 = jA;
                    ProgressiveMediaPeriod.this.s0 = IcyHeaders.a(this.f18364c.f18816a.getResponseHeaders());
                    StatsDataSource statsDataSource = this.f18364c;
                    IcyHeaders icyHeaders = ProgressiveMediaPeriod.this.s0;
                    if (icyHeaders == null || (i2 = icyHeaders.g0) == -1) {
                        icyDataSource = statsDataSource;
                    } else {
                        icyDataSource = new IcyDataSource(statsDataSource, i2, this);
                        ProgressiveMediaPeriod progressiveMediaPeriod2 = ProgressiveMediaPeriod.this;
                        progressiveMediaPeriod2.getClass();
                        SampleQueue sampleQueueO = progressiveMediaPeriod2.o(new TrackId(0, true));
                        this.f18368l = sampleQueueO;
                        sampleQueueO.c(ProgressiveMediaPeriod.O0);
                    }
                    this.d.d(icyDataSource, this.f18363b, this.f18364c.f18816a.getResponseHeaders(), j, j2, this.f18365e);
                    if (ProgressiveMediaPeriod.this.s0 != null) {
                        this.d.a();
                    }
                    if (this.f18367i) {
                        this.d.seek(j, this.j);
                        this.f18367i = false;
                    }
                    while (iC == 0 && !this.f18366h) {
                        try {
                            this.f.a();
                            iC = this.d.c(this.g);
                            long jB = this.d.b();
                            if (jB > ProgressiveMediaPeriod.this.k0 + j) {
                                this.f.c();
                                ProgressiveMediaPeriod progressiveMediaPeriod3 = ProgressiveMediaPeriod.this;
                                progressiveMediaPeriod3.q0.post(progressiveMediaPeriod3.p0);
                                j = jB;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iC == 1) {
                        iC = 0;
                    } else if (this.d.b() != -1) {
                        this.g.f17554a = this.d.b();
                    }
                    DataSourceUtil.a(this.f18364c);
                } catch (Throwable th) {
                    if (iC != 1 && this.d.b() != -1) {
                        this.g.f17554a = this.d.b();
                    }
                    DataSourceUtil.a(this.f18364c);
                    throw th;
                }
            }
        }
    }

    public interface Listener {
    }

    public final class SampleStreamImpl implements SampleStream {
        public final int X;

        public SampleStreamImpl(int i2) {
            this.X = i2;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int g(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            int i3;
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            if (progressiveMediaPeriod.q()) {
                return -3;
            }
            int i4 = this.X;
            progressiveMediaPeriod.m(i4);
            SampleQueue sampleQueue = progressiveMediaPeriod.t0[i4];
            boolean z2 = progressiveMediaPeriod.L0;
            sampleQueue.getClass();
            boolean z3 = (i2 & 2) != 0;
            SampleQueue.SampleExtrasHolder sampleExtrasHolder = sampleQueue.f18390b;
            synchronized (sampleQueue) {
                try {
                    decoderInputBuffer.e0 = false;
                    int i5 = sampleQueue.s;
                    if (i5 != sampleQueue.f18397p) {
                        Format format = ((SampleQueue.SharedSampleMetadata) sampleQueue.f18391c.a(sampleQueue.q + i5)).f18404a;
                        if (!z3 && format == sampleQueue.g) {
                            int iJ = sampleQueue.j(sampleQueue.s);
                            if (sampleQueue.l(iJ)) {
                                decoderInputBuffer.X = sampleQueue.m[iJ];
                                if (sampleQueue.s == sampleQueue.f18397p - 1 && (z2 || sampleQueue.f18399w)) {
                                    decoderInputBuffer.a(536870912);
                                }
                                long j = sampleQueue.f18396n[iJ];
                                decoderInputBuffer.f0 = j;
                                if (j < sampleQueue.t) {
                                    decoderInputBuffer.a(Integer.MIN_VALUE);
                                }
                                sampleExtrasHolder.f18401a = sampleQueue.f18395l[iJ];
                                sampleExtrasHolder.f18402b = sampleQueue.k[iJ];
                                sampleExtrasHolder.f18403c = sampleQueue.o[iJ];
                                i3 = -4;
                            } else {
                                decoderInputBuffer.e0 = true;
                                i3 = -3;
                            }
                        }
                        sampleQueue.m(format, formatHolder);
                        i3 = -5;
                    } else {
                        if (!z2 && !sampleQueue.f18399w) {
                            Format format2 = sampleQueue.f18388B;
                            if (format2 == null || (!z3 && format2 == sampleQueue.g)) {
                                i3 = -3;
                            }
                            sampleQueue.m(format2, formatHolder);
                            i3 = -5;
                        }
                        decoderInputBuffer.X = 4;
                        i3 = -4;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i3 == -4 && !decoderInputBuffer.b(4)) {
                boolean z4 = (i2 & 1) != 0;
                if ((i2 & 4) == 0) {
                    if (z4) {
                        SampleDataQueue sampleDataQueue = sampleQueue.f18389a;
                        SampleDataQueue.e(sampleDataQueue.f18383e, decoderInputBuffer, sampleQueue.f18390b, sampleDataQueue.f18382c);
                    } else {
                        SampleDataQueue sampleDataQueue2 = sampleQueue.f18389a;
                        sampleDataQueue2.f18383e = SampleDataQueue.e(sampleDataQueue2.f18383e, decoderInputBuffer, sampleQueue.f18390b, sampleDataQueue2.f18382c);
                    }
                }
                if (!z4) {
                    sampleQueue.s++;
                }
            }
            if (i3 == -3) {
                progressiveMediaPeriod.n(i4);
            }
            return i3;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final boolean isReady() {
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            return !progressiveMediaPeriod.q() && progressiveMediaPeriod.t0[this.X].k(progressiveMediaPeriod.L0);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final void maybeThrowError() throws IOException {
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            SampleQueue sampleQueue = progressiveMediaPeriod.t0[this.X];
            DrmSession drmSession = sampleQueue.f18393h;
            if (drmSession == null || drmSession.getState() != 1) {
                progressiveMediaPeriod.l0.c(progressiveMediaPeriod.e0.a(progressiveMediaPeriod.C0));
            } else {
                DrmSession.DrmSessionException error = sampleQueue.f18393h.getError();
                error.getClass();
                throw error;
            }
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int skipData(long j) {
            int i2;
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            boolean z2 = false;
            if (progressiveMediaPeriod.q()) {
                return 0;
            }
            int i3 = this.X;
            progressiveMediaPeriod.m(i3);
            SampleQueue sampleQueue = progressiveMediaPeriod.t0[i3];
            boolean z3 = progressiveMediaPeriod.L0;
            synchronized (sampleQueue) {
                int iJ = sampleQueue.j(sampleQueue.s);
                int i4 = sampleQueue.s;
                int i5 = sampleQueue.f18397p;
                if (i4 != i5 && j >= sampleQueue.f18396n[iJ]) {
                    if (j <= sampleQueue.v || !z3) {
                        i2 = sampleQueue.i(iJ, i5 - i4, j, true);
                        if (i2 == -1) {
                        }
                    } else {
                        i2 = i5 - i4;
                    }
                }
                i2 = 0;
            }
            synchronized (sampleQueue) {
                if (i2 >= 0) {
                    try {
                        if (sampleQueue.s + i2 <= sampleQueue.f18397p) {
                            z2 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Assertions.b(z2);
                sampleQueue.s += i2;
            }
            if (i2 == 0) {
                progressiveMediaPeriod.n(i3);
            }
            return i2;
        }
    }

    public static final class TrackId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18372b;

        public TrackId(int i2, boolean z2) {
            this.f18371a = i2;
            this.f18372b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || TrackId.class != obj.getClass()) {
                return false;
            }
            TrackId trackId = (TrackId) obj;
            return this.f18371a == trackId.f18371a && this.f18372b == trackId.f18372b;
        }

        public final int hashCode() {
            return (this.f18371a * 31) + (this.f18372b ? 1 : 0);
        }
    }

    public static final class TrackState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackGroupArray f18373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f18374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f18375c;
        public final boolean[] d;

        public TrackState(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f18373a = trackGroupArray;
            this.f18374b = zArr;
            int i2 = trackGroupArray.X;
            this.f18375c = new boolean[i2];
            this.d = new boolean[i2];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        N0 = Collections.unmodifiableMap(map);
        Format.Builder builder = new Format.Builder();
        builder.f17081a = "icy";
        builder.k = "application/x-icy";
        O0 = new Format(builder);
    }

    public ProgressiveMediaPeriod(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, DefaultLoadErrorHandlingPolicy defaultLoadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, ProgressiveMediaSource progressiveMediaSource, Allocator allocator, String str, int i2) {
        this.X = uri;
        this.f18361Y = dataSource;
        this.Z = drmSessionManager;
        this.g0 = eventDispatcher;
        this.e0 = defaultLoadErrorHandlingPolicy;
        this.f0 = eventDispatcher2;
        this.h0 = progressiveMediaSource;
        this.i0 = allocator;
        this.j0 = str;
        this.k0 = i2;
        this.m0 = progressiveMediaExtractor;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public final void a(Loader.Loadable loadable, long j, long j2, boolean z2) {
        ExtractingLoadable extractingLoadable = (ExtractingLoadable) loadable;
        StatsDataSource statsDataSource = extractingLoadable.f18364c;
        Uri uri = statsDataSource.f18818c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(statsDataSource.d, extractingLoadable.f18362a);
        this.e0.getClass();
        long j3 = extractingLoadable.j;
        long j4 = this.A0;
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f0;
        eventDispatcher.c(loadEventInfo, new MediaLoadData(1, -1, null, 0, eventDispatcher.a(j3), eventDispatcher.a(j4)));
        if (z2) {
            return;
        }
        for (SampleQueue sampleQueue : this.t0) {
            sampleQueue.n(false);
        }
        if (this.F0 > 0) {
            MediaPeriod.Callback callback = this.r0;
            callback.getClass();
            callback.a(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public final void b(Loader.Loadable loadable, long j, long j2) {
        SeekMap seekMap;
        ExtractingLoadable extractingLoadable = (ExtractingLoadable) loadable;
        if (this.A0 == -9223372036854775807L && (seekMap = this.z0) != null) {
            boolean zIsSeekable = seekMap.isSeekable();
            long j3 = j(true);
            long j4 = j3 == Long.MIN_VALUE ? 0L : j3 + 10000;
            this.A0 = j4;
            this.h0.X(j4, zIsSeekable, this.B0);
        }
        StatsDataSource statsDataSource = extractingLoadable.f18364c;
        Uri uri = statsDataSource.f18818c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(statsDataSource.d, extractingLoadable.f18362a);
        this.e0.getClass();
        long j5 = extractingLoadable.j;
        long j6 = this.A0;
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f0;
        eventDispatcher.d(loadEventInfo, new MediaLoadData(1, -1, null, 0, eventDispatcher.a(j5), eventDispatcher.a(j6)));
        this.L0 = true;
        MediaPeriod.Callback callback = this.r0;
        callback.getClass();
        callback.a(this);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[RETURN] */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        h();
        if (!this.z0.isSeekable()) {
            return 0L;
        }
        SeekMap.SeekPoints seekPoints = this.z0.getSeekPoints(j);
        long j2 = seekPoints.f17555a.f17560a;
        long j3 = seekPoints.f17556b.f17560a;
        long j4 = seekParameters.f17199a;
        long j5 = seekParameters.f17200b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        int i2 = Util.f18979a;
        long j6 = j - j4;
        if (((j4 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j5;
        if (((j5 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z2 = false;
        boolean z3 = j6 <= j2 && j2 <= j7;
        if (j6 <= j3 && j3 <= j7) {
            z2 = true;
        }
        if (z3 && z2) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        }
        if (!z3) {
            if (z2) {
                return j3;
            }
            return j6;
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final boolean continueLoading(long j) {
        if (this.L0) {
            return false;
        }
        Loader loader = this.l0;
        if (loader.f18798c != null || this.J0) {
            return false;
        }
        if (this.w0 && this.F0 == 0) {
            return false;
        }
        boolean zD = this.n0.d();
        if (loader.b()) {
            return zD;
        }
        p();
        return true;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final void d(MediaPeriod.Callback callback, long j) {
        this.r0 = callback;
        this.n0.d();
        p();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final void discardBuffer(long j, boolean z2) {
        long jG;
        int i2;
        h();
        if (k()) {
            return;
        }
        boolean[] zArr = this.y0.f18375c;
        int length = this.t0.length;
        for (int i3 = 0; i3 < length; i3++) {
            SampleQueue sampleQueue = this.t0[i3];
            boolean z3 = zArr[i3];
            SampleDataQueue sampleDataQueue = sampleQueue.f18389a;
            synchronized (sampleQueue) {
                try {
                    int i4 = sampleQueue.f18397p;
                    jG = -1;
                    if (i4 != 0) {
                        long[] jArr = sampleQueue.f18396n;
                        int i5 = sampleQueue.r;
                        if (j >= jArr[i5]) {
                            if (z3 && (i2 = sampleQueue.s) != i4) {
                                i4 = i2 + 1;
                            }
                            int i6 = sampleQueue.i(i5, i4, j, z2);
                            if (i6 != -1) {
                                jG = sampleQueue.g(i6);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            sampleDataQueue.a(jG);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long e(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        ExoTrackSelection exoTrackSelection;
        h();
        TrackState trackState = this.y0;
        TrackGroupArray trackGroupArray = trackState.f18373a;
        boolean[] zArr3 = trackState.f18375c;
        int i2 = this.F0;
        int i3 = 0;
        for (int i4 = 0; i4 < exoTrackSelectionArr.length; i4++) {
            SampleStream sampleStream = sampleStreamArr[i4];
            if (sampleStream != null && (exoTrackSelectionArr[i4] == null || !zArr[i4])) {
                int i5 = ((SampleStreamImpl) sampleStream).X;
                Assertions.d(zArr3[i5]);
                this.F0--;
                zArr3[i5] = false;
                sampleStreamArr[i4] = null;
            }
        }
        boolean z2 = !this.D0 ? j == 0 : i2 != 0;
        for (int i6 = 0; i6 < exoTrackSelectionArr.length; i6++) {
            if (sampleStreamArr[i6] == null && (exoTrackSelection = exoTrackSelectionArr[i6]) != null) {
                Assertions.d(exoTrackSelection.length() == 1);
                Assertions.d(exoTrackSelection.getIndexInTrackGroup(0) == 0);
                int iIndexOf = trackGroupArray.f18424Y.indexOf(exoTrackSelection.getTrackGroup());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                Assertions.d(!zArr3[iIndexOf]);
                this.F0++;
                zArr3[iIndexOf] = true;
                sampleStreamArr[i6] = new SampleStreamImpl(iIndexOf);
                zArr2[i6] = true;
                if (!z2) {
                    SampleQueue sampleQueue = this.t0[iIndexOf];
                    z2 = (sampleQueue.o(j, true) || sampleQueue.q + sampleQueue.s == 0) ? false : true;
                }
            }
        }
        if (this.F0 == 0) {
            this.J0 = false;
            this.E0 = false;
            Loader loader = this.l0;
            if (loader.b()) {
                SampleQueue[] sampleQueueArr = this.t0;
                int length = sampleQueueArr.length;
                while (i3 < length) {
                    sampleQueueArr[i3].h();
                    i3++;
                }
                loader.a();
            } else {
                for (SampleQueue sampleQueue2 : this.t0) {
                    sampleQueue2.n(false);
                }
            }
        } else if (z2) {
            j = seekToUs(j);
            while (i3 < sampleStreamArr.length) {
                if (sampleStreamArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.D0 = true;
        return j;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public final void endTracks() {
        this.v0 = true;
        this.q0.post(this.o0);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public final Loader.LoadErrorAction f(Loader.Loadable loadable, long j, long j2, IOException iOException, int i2) {
        Loader.LoadErrorAction loadErrorAction;
        SeekMap seekMap;
        ExtractingLoadable extractingLoadable = (ExtractingLoadable) loadable;
        StatsDataSource statsDataSource = extractingLoadable.f18364c;
        Uri uri = statsDataSource.f18818c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(statsDataSource.d, extractingLoadable.f18362a);
        Util.J(extractingLoadable.j);
        Util.J(this.A0);
        long jB = this.e0.b(new LoadErrorHandlingPolicy.LoadErrorInfo(iOException, i2));
        if (jB == -9223372036854775807L) {
            loadErrorAction = Loader.f18795e;
        } else {
            int i3 = i();
            int i4 = i3 > this.K0 ? 1 : 0;
            if (this.G0 || !((seekMap = this.z0) == null || seekMap.getDurationUs() == -9223372036854775807L)) {
                this.K0 = i3;
            } else if (!this.w0 || q()) {
                this.E0 = this.w0;
                this.H0 = 0L;
                this.K0 = 0;
                for (SampleQueue sampleQueue : this.t0) {
                    sampleQueue.n(false);
                }
                extractingLoadable.g.f17554a = 0L;
                extractingLoadable.j = 0L;
                extractingLoadable.f18367i = true;
                extractingLoadable.m = false;
            } else {
                this.J0 = true;
                loadErrorAction = Loader.d;
            }
            loadErrorAction = new Loader.LoadErrorAction(i4, jB);
        }
        int i5 = loadErrorAction.f18799a;
        boolean z2 = i5 == 0 || i5 == 1;
        long j3 = extractingLoadable.j;
        long j4 = this.A0;
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f0;
        eventDispatcher.e(loadEventInfo, new MediaLoadData(1, -1, null, 0, eventDispatcher.a(j3), eventDispatcher.a(j4)), iOException, !z2);
        return loadErrorAction;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public final void g(final SeekMap seekMap) {
        this.q0.post(new Runnable() { // from class: com.google.android.exoplayer2.source.g
            @Override // java.lang.Runnable
            public final void run() {
                ProgressiveMediaPeriod progressiveMediaPeriod = this.X;
                IcyHeaders icyHeaders = progressiveMediaPeriod.s0;
                SeekMap seekMap2 = seekMap;
                progressiveMediaPeriod.z0 = icyHeaders == null ? seekMap2 : new SeekMap.Unseekable(-9223372036854775807L);
                progressiveMediaPeriod.A0 = seekMap2.getDurationUs();
                boolean z2 = !progressiveMediaPeriod.G0 && seekMap2.getDurationUs() == -9223372036854775807L;
                progressiveMediaPeriod.B0 = z2;
                progressiveMediaPeriod.C0 = z2 ? 7 : 1;
                progressiveMediaPeriod.h0.X(progressiveMediaPeriod.A0, seekMap2.isSeekable(), progressiveMediaPeriod.B0);
                if (progressiveMediaPeriod.w0) {
                    return;
                }
                progressiveMediaPeriod.l();
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        long j;
        boolean z2;
        long j2;
        h();
        if (this.L0 || this.F0 == 0) {
            return Long.MIN_VALUE;
        }
        if (k()) {
            return this.I0;
        }
        if (this.x0) {
            int length = this.t0.length;
            j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                TrackState trackState = this.y0;
                if (trackState.f18374b[i2] && trackState.f18375c[i2]) {
                    SampleQueue sampleQueue = this.t0[i2];
                    synchronized (sampleQueue) {
                        z2 = sampleQueue.f18399w;
                    }
                    if (z2) {
                        continue;
                    } else {
                        SampleQueue sampleQueue2 = this.t0[i2];
                        synchronized (sampleQueue2) {
                            j2 = sampleQueue2.v;
                        }
                        j = Math.min(j, j2);
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = j(false);
        }
        return j == Long.MIN_VALUE ? this.H0 : j;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        h();
        return this.y0.f18373a;
    }

    public final void h() {
        Assertions.d(this.w0);
        this.y0.getClass();
        this.z0.getClass();
    }

    public final int i() {
        int i2 = 0;
        for (SampleQueue sampleQueue : this.t0) {
            i2 += sampleQueue.q + sampleQueue.f18397p;
        }
        return i2;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final boolean isLoading() {
        boolean z2;
        if (!this.l0.b()) {
            return false;
        }
        ConditionVariable conditionVariable = this.n0;
        synchronized (conditionVariable) {
            z2 = conditionVariable.f18899b;
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public final long j(boolean z2) {
        SampleQueue sampleQueue;
        long jMax = Long.MIN_VALUE;
        for (int i2 = 0; i2 < this.t0.length; i2++) {
            if (z2) {
                sampleQueue = this.t0[i2];
                synchronized (sampleQueue) {
                    jMax = Math.max(jMax, sampleQueue.v);
                }
            } else {
                TrackState trackState = this.y0;
                trackState.getClass();
                if (trackState.f18375c[i2]) {
                    sampleQueue = this.t0[i2];
                    synchronized (sampleQueue) {
                    }
                    jMax = Math.max(jMax, sampleQueue.v);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    public final boolean k() {
        return this.I0 != -9223372036854775807L;
    }

    public final void l() {
        Format format;
        int i2;
        if (this.M0 || this.w0 || !this.v0 || this.z0 == null) {
            return;
        }
        SampleQueue[] sampleQueueArr = this.t0;
        int length = sampleQueueArr.length;
        int i3 = 0;
        while (true) {
            Format format2 = null;
            if (i3 >= length) {
                this.n0.c();
                int length2 = this.t0.length;
                TrackGroup[] trackGroupArr = new TrackGroup[length2];
                boolean[] zArr = new boolean[length2];
                for (int i4 = 0; i4 < length2; i4++) {
                    SampleQueue sampleQueue = this.t0[i4];
                    synchronized (sampleQueue) {
                        format = sampleQueue.y ? null : sampleQueue.f18388B;
                    }
                    format.getClass();
                    String str = format.m0;
                    boolean zG = MimeTypes.g(str);
                    boolean z2 = zG || "video".equals(MimeTypes.e(str));
                    zArr[i4] = z2;
                    this.x0 = z2 | this.x0;
                    IcyHeaders icyHeaders = this.s0;
                    if (icyHeaders != null) {
                        if (zG || this.u0[i4].f18372b) {
                            Metadata metadata = format.k0;
                            Metadata metadata2 = metadata == null ? new Metadata(icyHeaders) : metadata.a(icyHeaders);
                            Format.Builder builderA = format.a();
                            builderA.f17086i = metadata2;
                            format = new Format(builderA);
                        }
                        if (zG && format.g0 == -1 && format.h0 == -1 && (i2 = icyHeaders.X) != -1) {
                            Format.Builder builderA2 = format.a();
                            builderA2.f = i2;
                            format = new Format(builderA2);
                        }
                    }
                    int iA = this.Z.a(format);
                    Format.Builder builderA3 = format.a();
                    builderA3.f17080F = iA;
                    trackGroupArr[i4] = new TrackGroup(Integer.toString(i4), new Format(builderA3));
                }
                this.y0 = new TrackState(new TrackGroupArray(trackGroupArr), zArr);
                this.w0 = true;
                MediaPeriod.Callback callback = this.r0;
                callback.getClass();
                callback.f(this);
                return;
            }
            SampleQueue sampleQueue2 = sampleQueueArr[i3];
            synchronized (sampleQueue2) {
                if (!sampleQueue2.y) {
                    format2 = sampleQueue2.f18388B;
                }
            }
            if (format2 == null) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void m(int i2) {
        h();
        TrackState trackState = this.y0;
        boolean[] zArr = trackState.d;
        if (zArr[i2]) {
            return;
        }
        Format format = trackState.f18373a.a(i2).e0[0];
        int iF = MimeTypes.f(format.m0);
        long j = this.H0;
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f0;
        eventDispatcher.b(new MediaLoadData(1, iF, format, 0, eventDispatcher.a(j), -9223372036854775807L));
        zArr[i2] = true;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final void maybeThrowPrepareError() throws IOException {
        this.l0.c(this.e0.a(this.C0));
        if (this.L0 && !this.w0) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    public final void n(int i2) {
        h();
        boolean[] zArr = this.y0.f18374b;
        if (this.J0 && zArr[i2] && !this.t0[i2].k(false)) {
            this.I0 = 0L;
            this.J0 = false;
            this.E0 = true;
            this.H0 = 0L;
            this.K0 = 0;
            for (SampleQueue sampleQueue : this.t0) {
                sampleQueue.n(false);
            }
            MediaPeriod.Callback callback = this.r0;
            callback.getClass();
            callback.a(this);
        }
    }

    public final SampleQueue o(TrackId trackId) {
        int length = this.t0.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (trackId.equals(this.u0[i2])) {
                return this.t0[i2];
            }
        }
        DrmSessionManager drmSessionManager = this.Z;
        drmSessionManager.getClass();
        SampleQueue sampleQueue = new SampleQueue(this.i0, drmSessionManager, this.g0);
        sampleQueue.f = this;
        int i3 = length + 1;
        TrackId[] trackIdArr = (TrackId[]) Arrays.copyOf(this.u0, i3);
        trackIdArr[length] = trackId;
        this.u0 = trackIdArr;
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.t0, i3);
        sampleQueueArr[length] = sampleQueue;
        this.t0 = sampleQueueArr;
        return sampleQueue;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    public final void onLoaderReleased() {
        for (SampleQueue sampleQueue : this.t0) {
            sampleQueue.n(true);
            DrmSession drmSession = sampleQueue.f18393h;
            if (drmSession != null) {
                drmSession.f(sampleQueue.f18392e);
                sampleQueue.f18393h = null;
                sampleQueue.g = null;
            }
        }
        this.m0.release();
    }

    public final void p() {
        ExtractingLoadable extractingLoadable = new ExtractingLoadable(this.X, this.f18361Y, this.m0, this, this.n0);
        if (this.w0) {
            Assertions.d(k());
            long j = this.A0;
            if (j != -9223372036854775807L && this.I0 > j) {
                this.L0 = true;
                this.I0 = -9223372036854775807L;
                return;
            }
            SeekMap seekMap = this.z0;
            seekMap.getClass();
            long j2 = seekMap.getSeekPoints(this.I0).f17555a.f17561b;
            long j3 = this.I0;
            extractingLoadable.g.f17554a = j2;
            extractingLoadable.j = j3;
            extractingLoadable.f18367i = true;
            extractingLoadable.m = false;
            for (SampleQueue sampleQueue : this.t0) {
                sampleQueue.t = this.I0;
            }
            this.I0 = -9223372036854775807L;
        }
        this.K0 = i();
        this.l0.e(extractingLoadable, this, this.e0.a(this.C0));
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.f18362a, extractingLoadable.k);
        long j4 = extractingLoadable.j;
        long j5 = this.A0;
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f0;
        eventDispatcher.f(loadEventInfo, new MediaLoadData(1, -1, null, 0, eventDispatcher.a(j4), eventDispatcher.a(j5)));
    }

    public final boolean q() {
        return this.E0 || k();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long readDiscontinuity() {
        if (!this.E0) {
            return -9223372036854775807L;
        }
        if (!this.L0 && i() <= this.K0) {
            return -9223372036854775807L;
        }
        this.E0 = false;
        return this.H0;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[LOOP:1: B:25:0x0052->B:26:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069 A[LOOP:2: B:30:0x0067->B:31:0x0069, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x004f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0060, please report this as an issue */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long seekToUs(long j) {
        Loader loader;
        int i2;
        h();
        boolean[] zArr = this.y0.f18374b;
        if (!this.z0.isSeekable()) {
            j = 0;
        }
        this.E0 = false;
        this.H0 = j;
        if (k()) {
            this.I0 = j;
            return j;
        }
        if (this.C0 == 7) {
            this.J0 = false;
            this.I0 = j;
            this.L0 = false;
            loader = this.l0;
            if (loader.b()) {
                loader.f18798c = null;
                for (SampleQueue sampleQueue : this.t0) {
                    sampleQueue.n(false);
                }
                break;
                break;
            }
            for (SampleQueue sampleQueue2 : this.t0) {
                sampleQueue2.h();
            }
            loader.a();
            return j;
        }
        int length = this.t0.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (!this.t0[i3].o(j, false) && (zArr[i3] || !this.x0)) {
                this.J0 = false;
                this.I0 = j;
                this.L0 = false;
                loader = this.l0;
                if (loader.b()) {
                    loader.f18798c = null;
                    while (i2 < r2) {
                        sampleQueue.n(false);
                    }
                    break;
                }
                while (i < r3) {
                    sampleQueue2.h();
                }
                loader.a();
                return j;
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public final TrackOutput track(int i2, int i3) {
        return o(new TrackId(i2, false));
    }
}
