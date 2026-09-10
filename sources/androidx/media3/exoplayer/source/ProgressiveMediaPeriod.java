package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ForwardingSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ProgressiveMediaPeriod implements MediaPeriod, ExtractorOutput, Loader.Callback<ExtractingLoadable>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {
    public static final Map P0;
    public static final Format Q0;
    public TrackState A0;
    public SeekMap B0;
    public long C0;
    public boolean D0;
    public boolean F0;
    public boolean G0;
    public int H0;
    public boolean I0;
    public long J0;
    public boolean L0;
    public int M0;
    public boolean N0;
    public boolean O0;
    public final Uri X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final DataSource f6397Y;
    public final DrmSessionManager Z;
    public final DefaultLoadErrorHandlingPolicy e0;
    public final MediaSourceEventListener.EventDispatcher f0;
    public final DrmSessionEventListener.EventDispatcher g0;
    public final ProgressiveMediaSource h0;
    public final Allocator i0;
    public final String j0;
    public final long k0;
    public final long l0;
    public final ProgressiveMediaExtractor n0;
    public MediaPeriod.Callback s0;
    public IcyHeaders t0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public final Loader m0 = new Loader("ProgressiveMediaPeriod");
    public final ConditionVariable o0 = new ConditionVariable(0);
    public final h p0 = new h(this, 1);
    public final h q0 = new h(this, 2);
    public final Handler r0 = Util.m(null);
    public TrackId[] v0 = new TrackId[0];
    public SampleQueue[] u0 = new SampleQueue[0];
    public long K0 = -9223372036854775807L;
    public int E0 = 1;

    public final class ExtractingLoadable implements Loader.Loadable, IcyDataSource.Listener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f6400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StatsDataSource f6401c;
        public final ProgressiveMediaExtractor d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ExtractorOutput f6402e;
        public final ConditionVariable f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f6403h;
        public long j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public TrackOutput f6405l;
        public boolean m;
        public final PositionHolder g = new PositionHolder();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f6404i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6399a = LoadEventInfo.f6371b.getAndIncrement();
        public DataSpec k = a(0);

        public ExtractingLoadable(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable conditionVariable) {
            this.f6400b = uri;
            this.f6401c = new StatsDataSource(dataSource);
            this.d = progressiveMediaExtractor;
            this.f6402e = extractorOutput;
            this.f = conditionVariable;
        }

        public final DataSpec a(long j) {
            DataSpec.Builder builder = new DataSpec.Builder();
            builder.f5741a = this.f6400b;
            builder.f5744e = j;
            builder.g = ProgressiveMediaPeriod.this.j0;
            builder.f5745h = 6;
            builder.d = ProgressiveMediaPeriod.P0;
            return builder.a();
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public final void cancelLoad() {
            this.f6403h = true;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public final void load() {
            DataSource icyDataSource;
            int i2;
            int iC = 0;
            while (iC == 0 && !this.f6403h) {
                try {
                    long j = this.g.f6793a;
                    DataSpec dataSpecA = a(j);
                    this.k = dataSpecA;
                    long jB = this.f6401c.b(dataSpecA);
                    if (this.f6403h) {
                        if (iC != 1 && this.d.b() != -1) {
                            this.g.f6793a = this.d.b();
                        }
                        DataSourceUtil.a(this.f6401c);
                        return;
                    }
                    if (jB != -1) {
                        jB += j;
                        ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
                        progressiveMediaPeriod.r0.post(new h(progressiveMediaPeriod, 0));
                    }
                    long j2 = jB;
                    ProgressiveMediaPeriod.this.t0 = IcyHeaders.a(this.f6401c.f5782a.getResponseHeaders());
                    StatsDataSource statsDataSource = this.f6401c;
                    IcyHeaders icyHeaders = ProgressiveMediaPeriod.this.t0;
                    if (icyHeaders == null || (i2 = icyHeaders.g0) == -1) {
                        icyDataSource = statsDataSource;
                    } else {
                        icyDataSource = new IcyDataSource(statsDataSource, i2, this);
                        ProgressiveMediaPeriod progressiveMediaPeriod2 = ProgressiveMediaPeriod.this;
                        progressiveMediaPeriod2.getClass();
                        TrackOutput trackOutputP = progressiveMediaPeriod2.p(new TrackId(0, true));
                        this.f6405l = trackOutputP;
                        trackOutputP.b(ProgressiveMediaPeriod.Q0);
                    }
                    this.d.d(icyDataSource, this.f6400b, this.f6401c.f5782a.getResponseHeaders(), j, j2, this.f6402e);
                    if (ProgressiveMediaPeriod.this.t0 != null) {
                        this.d.a();
                    }
                    if (this.f6404i) {
                        this.d.seek(j, this.j);
                        this.f6404i = false;
                    }
                    while (iC == 0 && !this.f6403h) {
                        try {
                            this.f.a();
                            iC = this.d.c(this.g);
                            long jB2 = this.d.b();
                            if (jB2 > ProgressiveMediaPeriod.this.k0 + j) {
                                this.f.c();
                                ProgressiveMediaPeriod progressiveMediaPeriod3 = ProgressiveMediaPeriod.this;
                                progressiveMediaPeriod3.r0.post(progressiveMediaPeriod3.q0);
                                j = jB2;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iC == 1) {
                        iC = 0;
                    } else if (this.d.b() != -1) {
                        this.g.f6793a = this.d.b();
                    }
                    DataSourceUtil.a(this.f6401c);
                } catch (Throwable th) {
                    if (iC != 1 && this.d.b() != -1) {
                        this.g.f6793a = this.d.b();
                    }
                    DataSourceUtil.a(this.f6401c);
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

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int e(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            int i3;
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            if (progressiveMediaPeriod.r()) {
                return -3;
            }
            int i4 = this.X;
            progressiveMediaPeriod.n(i4);
            SampleQueue sampleQueue = progressiveMediaPeriod.u0[i4];
            boolean z2 = progressiveMediaPeriod.N0;
            sampleQueue.getClass();
            boolean z3 = (i2 & 2) != 0;
            SampleQueue.SampleExtrasHolder sampleExtrasHolder = sampleQueue.f6426b;
            synchronized (sampleQueue) {
                try {
                    decoderInputBuffer.f0 = false;
                    int i5 = sampleQueue.s;
                    if (i5 != sampleQueue.f6433p) {
                        Format format = ((SampleQueue.SharedSampleMetadata) sampleQueue.f6427c.a(sampleQueue.q + i5)).f6440a;
                        if (!z3 && format == sampleQueue.g) {
                            int iK = sampleQueue.k(sampleQueue.s);
                            if (sampleQueue.n(iK)) {
                                decoderInputBuffer.X = sampleQueue.m[iK];
                                if (sampleQueue.s == sampleQueue.f6433p - 1 && (z2 || sampleQueue.f6435w)) {
                                    decoderInputBuffer.a(536870912);
                                }
                                decoderInputBuffer.g0 = sampleQueue.f6432n[iK];
                                sampleExtrasHolder.f6437a = sampleQueue.f6431l[iK];
                                sampleExtrasHolder.f6438b = sampleQueue.k[iK];
                                sampleExtrasHolder.f6439c = sampleQueue.o[iK];
                                i3 = -4;
                            } else {
                                decoderInputBuffer.f0 = true;
                                i3 = -3;
                            }
                        }
                        sampleQueue.o(format, formatHolder);
                        i3 = -5;
                    } else {
                        if (!z2 && !sampleQueue.f6435w) {
                            Format format2 = sampleQueue.f6424B;
                            if (format2 == null || (!z3 && format2 == sampleQueue.g)) {
                                i3 = -3;
                            }
                            sampleQueue.o(format2, formatHolder);
                            i3 = -5;
                        }
                        decoderInputBuffer.X = 4;
                        decoderInputBuffer.g0 = Long.MIN_VALUE;
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
                        SampleDataQueue sampleDataQueue = sampleQueue.f6425a;
                        SampleDataQueue.e(sampleDataQueue.f6419e, decoderInputBuffer, sampleQueue.f6426b, sampleDataQueue.f6418c);
                    } else {
                        SampleDataQueue sampleDataQueue2 = sampleQueue.f6425a;
                        sampleDataQueue2.f6419e = SampleDataQueue.e(sampleDataQueue2.f6419e, decoderInputBuffer, sampleQueue.f6426b, sampleDataQueue2.f6418c);
                    }
                }
                if (!z4) {
                    sampleQueue.s++;
                }
            }
            if (i3 == -3) {
                progressiveMediaPeriod.o(i4);
            }
            return i3;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            return !progressiveMediaPeriod.r() && progressiveMediaPeriod.u0[this.X].m(progressiveMediaPeriod.N0);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void maybeThrowError() throws IOException {
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            SampleQueue sampleQueue = progressiveMediaPeriod.u0[this.X];
            DrmSession drmSession = sampleQueue.f6429h;
            if (drmSession == null || drmSession.getState() != 1) {
                progressiveMediaPeriod.m0.c(progressiveMediaPeriod.e0.a(progressiveMediaPeriod.E0));
            } else {
                DrmSession.DrmSessionException error = sampleQueue.f6429h.getError();
                error.getClass();
                throw error;
            }
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int skipData(long j) {
            int i2;
            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
            boolean z2 = false;
            if (progressiveMediaPeriod.r()) {
                return 0;
            }
            int i3 = this.X;
            progressiveMediaPeriod.n(i3);
            SampleQueue sampleQueue = progressiveMediaPeriod.u0[i3];
            boolean z3 = progressiveMediaPeriod.N0;
            synchronized (sampleQueue) {
                int iK = sampleQueue.k(sampleQueue.s);
                int i4 = sampleQueue.s;
                int i5 = sampleQueue.f6433p;
                if (i4 != i5 && j >= sampleQueue.f6432n[iK]) {
                    if (j <= sampleQueue.v || !z3) {
                        i2 = sampleQueue.i(iK, i5 - i4, j, true);
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
                        if (sampleQueue.s + i2 <= sampleQueue.f6433p) {
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
                progressiveMediaPeriod.o(i3);
            }
            return i2;
        }
    }

    public static final class TrackId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6409b;

        public TrackId(int i2, boolean z2) {
            this.f6408a = i2;
            this.f6409b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || TrackId.class != obj.getClass()) {
                return false;
            }
            TrackId trackId = (TrackId) obj;
            return this.f6408a == trackId.f6408a && this.f6409b == trackId.f6409b;
        }

        public final int hashCode() {
            return (this.f6408a * 31) + (this.f6409b ? 1 : 0);
        }
    }

    public static final class TrackState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackGroupArray f6410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f6411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f6412c;
        public final boolean[] d;

        public TrackState(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f6410a = trackGroupArray;
            this.f6411b = zArr;
            int i2 = trackGroupArray.f6463a;
            this.f6412c = new boolean[i2];
            this.d = new boolean[i2];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        P0 = Collections.unmodifiableMap(map);
        Format.Builder builder = new Format.Builder();
        builder.f5423a = "icy";
        builder.f5429l = MimeTypes.l("application/x-icy");
        Q0 = new Format(builder);
    }

    public ProgressiveMediaPeriod(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, DefaultLoadErrorHandlingPolicy defaultLoadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, ProgressiveMediaSource progressiveMediaSource, Allocator allocator, String str, int i2, long j) {
        this.X = uri;
        this.f6397Y = dataSource;
        this.Z = drmSessionManager;
        this.g0 = eventDispatcher;
        this.e0 = defaultLoadErrorHandlingPolicy;
        this.f0 = eventDispatcher2;
        this.h0 = progressiveMediaSource;
        this.i0 = allocator;
        this.j0 = str;
        this.k0 = i2;
        this.n0 = progressiveMediaExtractor;
        this.l0 = j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean a(LoadingInfo loadingInfo) {
        if (this.N0) {
            return false;
        }
        Loader loader = this.m0;
        if (loader.f6579c != null || this.L0) {
            return false;
        }
        if (this.x0 && this.H0 == 0) {
            return false;
        }
        boolean zD = this.o0.d();
        if (loader.b()) {
            return zD;
        }
        q();
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final Loader.LoadErrorAction b(Loader.Loadable loadable, long j, long j2, IOException iOException, int i2) {
        Loader.LoadErrorAction loadErrorAction;
        SeekMap seekMap;
        ExtractingLoadable extractingLoadable = (ExtractingLoadable) loadable;
        StatsDataSource statsDataSource = extractingLoadable.f6401c;
        Uri uri = statsDataSource.f5784c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(statsDataSource.d, extractingLoadable.f6399a);
        Util.T(extractingLoadable.j);
        Util.T(this.C0);
        long jB = this.e0.b(new LoadErrorHandlingPolicy.LoadErrorInfo(iOException, i2));
        if (jB == -9223372036854775807L) {
            loadErrorAction = Loader.f6576e;
        } else {
            int iJ = j();
            int i3 = iJ > this.M0 ? 1 : 0;
            if (this.I0 || !((seekMap = this.B0) == null || seekMap.getDurationUs() == -9223372036854775807L)) {
                this.M0 = iJ;
            } else if (!this.x0 || r()) {
                this.G0 = this.x0;
                this.J0 = 0L;
                this.M0 = 0;
                for (SampleQueue sampleQueue : this.u0) {
                    sampleQueue.p(false);
                }
                extractingLoadable.g.f6793a = 0L;
                extractingLoadable.j = 0L;
                extractingLoadable.f6404i = true;
                extractingLoadable.m = false;
            } else {
                this.L0 = true;
                loadErrorAction = Loader.d;
            }
            loadErrorAction = new Loader.LoadErrorAction(i3, jB);
        }
        int i4 = loadErrorAction.f6580a;
        this.f0.d(loadEventInfo, new MediaLoadData(1, -1, null, 0, Util.T(extractingLoadable.j), Util.T(this.C0)), iOException, !(i4 == 0 || i4 == 1));
        return loadErrorAction;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[RETURN] */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        i();
        if (!this.B0.isSeekable()) {
            return 0L;
        }
        SeekMap.SeekPoints seekPoints = this.B0.getSeekPoints(j);
        long j2 = seekPoints.f6794a.f6799a;
        long j3 = seekPoints.f6795b.f6799a;
        long j4 = seekParameters.f5985a;
        long j5 = seekParameters.f5986b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        int i2 = Util.f5683a;
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

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long d(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        ExoTrackSelection exoTrackSelection;
        i();
        TrackState trackState = this.A0;
        TrackGroupArray trackGroupArray = trackState.f6410a;
        boolean[] zArr3 = trackState.f6412c;
        int i2 = this.H0;
        int i3 = 0;
        for (int i4 = 0; i4 < exoTrackSelectionArr.length; i4++) {
            SampleStream sampleStream = sampleStreamArr[i4];
            if (sampleStream != null && (exoTrackSelectionArr[i4] == null || !zArr[i4])) {
                int i5 = ((SampleStreamImpl) sampleStream).X;
                Assertions.e(zArr3[i5]);
                this.H0--;
                zArr3[i5] = false;
                sampleStreamArr[i4] = null;
            }
        }
        boolean z2 = !this.F0 ? j == 0 || this.z0 : i2 != 0;
        for (int i6 = 0; i6 < exoTrackSelectionArr.length; i6++) {
            if (sampleStreamArr[i6] == null && (exoTrackSelection = exoTrackSelectionArr[i6]) != null) {
                Assertions.e(exoTrackSelection.length() == 1);
                Assertions.e(exoTrackSelection.getIndexInTrackGroup(0) == 0);
                int iIndexOf = trackGroupArray.f6464b.indexOf(exoTrackSelection.getTrackGroup());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                Assertions.e(!zArr3[iIndexOf]);
                this.H0++;
                zArr3[iIndexOf] = true;
                sampleStreamArr[i6] = new SampleStreamImpl(iIndexOf);
                zArr2[i6] = true;
                if (!z2) {
                    SampleQueue sampleQueue = this.u0[iIndexOf];
                    z2 = (sampleQueue.q + sampleQueue.s == 0 || sampleQueue.q(j, true)) ? false : true;
                }
            }
        }
        if (this.H0 == 0) {
            this.L0 = false;
            this.G0 = false;
            Loader loader = this.m0;
            if (loader.b()) {
                SampleQueue[] sampleQueueArr = this.u0;
                int length = sampleQueueArr.length;
                while (i3 < length) {
                    sampleQueueArr[i3].h();
                    i3++;
                }
                loader.a();
            } else {
                this.N0 = false;
                for (SampleQueue sampleQueue2 : this.u0) {
                    sampleQueue2.p(false);
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
        this.F0 = true;
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void discardBuffer(long j, boolean z2) {
        long jG;
        int i2;
        if (this.z0) {
            return;
        }
        i();
        if (l()) {
            return;
        }
        boolean[] zArr = this.A0.f6412c;
        int length = this.u0.length;
        for (int i3 = 0; i3 < length; i3++) {
            SampleQueue sampleQueue = this.u0[i3];
            boolean z3 = zArr[i3];
            SampleDataQueue sampleDataQueue = sampleQueue.f6425a;
            synchronized (sampleQueue) {
                try {
                    int i4 = sampleQueue.f6433p;
                    jG = -1;
                    if (i4 != 0) {
                        long[] jArr = sampleQueue.f6432n;
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

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void e(final SeekMap seekMap) {
        this.r0.post(new Runnable() { // from class: androidx.media3.exoplayer.source.i
            @Override // java.lang.Runnable
            public final void run() {
                ProgressiveMediaPeriod progressiveMediaPeriod = this.X;
                IcyHeaders icyHeaders = progressiveMediaPeriod.t0;
                SeekMap seekMap2 = seekMap;
                progressiveMediaPeriod.B0 = icyHeaders == null ? seekMap2 : new SeekMap.Unseekable(-9223372036854775807L);
                progressiveMediaPeriod.C0 = seekMap2.getDurationUs();
                boolean z2 = !progressiveMediaPeriod.I0 && seekMap2.getDurationUs() == -9223372036854775807L;
                progressiveMediaPeriod.D0 = z2;
                progressiveMediaPeriod.E0 = z2 ? 7 : 1;
                if (progressiveMediaPeriod.x0) {
                    progressiveMediaPeriod.h0.b0(progressiveMediaPeriod.C0, seekMap2.isSeekable(), progressiveMediaPeriod.D0);
                } else {
                    progressiveMediaPeriod.m();
                }
            }
        });
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void endTracks() {
        this.w0 = true;
        this.r0.post(this.p0);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void f(MediaPeriod.Callback callback, long j) {
        this.s0 = callback;
        this.o0.d();
        q();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final void g(Loader.Loadable loadable, long j, long j2) {
        SeekMap seekMap;
        ExtractingLoadable extractingLoadable = (ExtractingLoadable) loadable;
        if (this.C0 == -9223372036854775807L && (seekMap = this.B0) != null) {
            boolean zIsSeekable = seekMap.isSeekable();
            long jK = k(true);
            long j3 = jK == Long.MIN_VALUE ? 0L : jK + 10000;
            this.C0 = j3;
            this.h0.b0(j3, zIsSeekable, this.D0);
        }
        StatsDataSource statsDataSource = extractingLoadable.f6401c;
        Uri uri = statsDataSource.f5784c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(statsDataSource.d, extractingLoadable.f6399a);
        this.e0.getClass();
        this.f0.c(loadEventInfo, new MediaLoadData(1, -1, null, 0, Util.T(extractingLoadable.j), Util.T(this.C0)));
        this.N0 = true;
        MediaPeriod.Callback callback = this.s0;
        callback.getClass();
        callback.e(this);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        long jK;
        boolean z2;
        long j;
        i();
        if (this.N0 || this.H0 == 0) {
            return Long.MIN_VALUE;
        }
        if (l()) {
            return this.K0;
        }
        if (this.y0) {
            int length = this.u0.length;
            jK = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                TrackState trackState = this.A0;
                if (trackState.f6411b[i2] && trackState.f6412c[i2]) {
                    SampleQueue sampleQueue = this.u0[i2];
                    synchronized (sampleQueue) {
                        z2 = sampleQueue.f6435w;
                    }
                    if (z2) {
                        continue;
                    } else {
                        SampleQueue sampleQueue2 = this.u0[i2];
                        synchronized (sampleQueue2) {
                            j = sampleQueue2.v;
                        }
                        jK = Math.min(jK, j);
                    }
                }
            }
        } else {
            jK = Long.MAX_VALUE;
        }
        if (jK == Long.MAX_VALUE) {
            jK = k(false);
        }
        return jK == Long.MIN_VALUE ? this.J0 : jK;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        i();
        return this.A0.f6410a;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final void h(Loader.Loadable loadable, long j, long j2, boolean z2) {
        ExtractingLoadable extractingLoadable = (ExtractingLoadable) loadable;
        StatsDataSource statsDataSource = extractingLoadable.f6401c;
        Uri uri = statsDataSource.f5784c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(statsDataSource.d, extractingLoadable.f6399a);
        this.e0.getClass();
        this.f0.b(loadEventInfo, new MediaLoadData(1, -1, null, 0, Util.T(extractingLoadable.j), Util.T(this.C0)));
        if (z2) {
            return;
        }
        for (SampleQueue sampleQueue : this.u0) {
            sampleQueue.p(false);
        }
        if (this.H0 > 0) {
            MediaPeriod.Callback callback = this.s0;
            callback.getClass();
            callback.e(this);
        }
    }

    public final void i() {
        Assertions.e(this.x0);
        this.A0.getClass();
        this.B0.getClass();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        boolean z2;
        if (!this.m0.b()) {
            return false;
        }
        ConditionVariable conditionVariable = this.o0;
        synchronized (conditionVariable) {
            z2 = conditionVariable.f5633b;
        }
        return z2;
    }

    public final int j() {
        int i2 = 0;
        for (SampleQueue sampleQueue : this.u0) {
            i2 += sampleQueue.q + sampleQueue.f6433p;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public final long k(boolean z2) {
        SampleQueue sampleQueue;
        long jMax = Long.MIN_VALUE;
        for (int i2 = 0; i2 < this.u0.length; i2++) {
            if (z2) {
                sampleQueue = this.u0[i2];
                synchronized (sampleQueue) {
                    jMax = Math.max(jMax, sampleQueue.v);
                }
            } else {
                TrackState trackState = this.A0;
                trackState.getClass();
                if (trackState.f6412c[i2]) {
                    sampleQueue = this.u0[i2];
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

    public final boolean l() {
        return this.K0 != -9223372036854775807L;
    }

    public final void m() {
        long j;
        int i2;
        if (this.O0 || this.x0 || !this.w0 || this.B0 == null) {
            return;
        }
        for (SampleQueue sampleQueue : this.u0) {
            if (sampleQueue.l() == null) {
                return;
            }
        }
        this.o0.c();
        int length = this.u0.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        int i3 = 0;
        while (true) {
            j = this.l0;
            if (i3 >= length) {
                break;
            }
            Format formatL = this.u0[i3].l();
            formatL.getClass();
            String str = formatL.m;
            boolean zH = MimeTypes.h(str);
            boolean z2 = zH || MimeTypes.k(str);
            zArr[i3] = z2;
            this.y0 = z2 | this.y0;
            this.z0 = j != -9223372036854775807L && length == 1 && MimeTypes.i(str);
            IcyHeaders icyHeaders = this.t0;
            if (icyHeaders != null) {
                if (zH || this.v0[i3].f6409b) {
                    Metadata metadata = formatL.k;
                    Metadata metadata2 = metadata == null ? new Metadata(icyHeaders) : metadata.a(icyHeaders);
                    Format.Builder builderA = formatL.a();
                    builderA.j = metadata2;
                    formatL = new Format(builderA);
                }
                if (zH && formatL.g == -1 && formatL.f5410h == -1 && (i2 = icyHeaders.X) != -1) {
                    Format.Builder builderA2 = formatL.a();
                    builderA2.g = i2;
                    formatL = new Format(builderA2);
                }
            }
            int iC = this.Z.c(formatL);
            Format.Builder builderA3 = formatL.a();
            builderA3.f5422I = iC;
            trackGroupArr[i3] = new TrackGroup(Integer.toString(i3), new Format(builderA3));
            i3++;
        }
        this.A0 = new TrackState(new TrackGroupArray(trackGroupArr), zArr);
        if (this.z0 && this.C0 == -9223372036854775807L) {
            this.C0 = j;
            this.B0 = new ForwardingSeekMap(this.B0) { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.1
                @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
                public final long getDurationUs() {
                    return ProgressiveMediaPeriod.this.C0;
                }
            };
        }
        this.h0.b0(this.C0, this.B0.isSeekable(), this.D0);
        this.x0 = true;
        MediaPeriod.Callback callback = this.s0;
        callback.getClass();
        callback.b(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void maybeThrowPrepareError() throws IOException {
        this.m0.c(this.e0.a(this.E0));
        if (this.N0 && !this.x0) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    public final void n(int i2) {
        i();
        TrackState trackState = this.A0;
        boolean[] zArr = trackState.d;
        if (zArr[i2]) {
            return;
        }
        Format format = trackState.f6410a.a(i2).d[0];
        this.f0.a(new MediaLoadData(1, MimeTypes.g(format.m), format, 0, Util.T(this.J0), -9223372036854775807L));
        zArr[i2] = true;
    }

    public final void o(int i2) {
        i();
        boolean[] zArr = this.A0.f6411b;
        if (this.L0 && zArr[i2] && !this.u0[i2].m(false)) {
            this.K0 = 0L;
            this.L0 = false;
            this.G0 = true;
            this.J0 = 0L;
            this.M0 = 0;
            for (SampleQueue sampleQueue : this.u0) {
                sampleQueue.p(false);
            }
            MediaPeriod.Callback callback = this.s0;
            callback.getClass();
            callback.e(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public final void onLoaderReleased() {
        for (SampleQueue sampleQueue : this.u0) {
            sampleQueue.p(true);
            DrmSession drmSession = sampleQueue.f6429h;
            if (drmSession != null) {
                drmSession.g(sampleQueue.f6428e);
                sampleQueue.f6429h = null;
                sampleQueue.g = null;
            }
        }
        this.n0.release();
    }

    public final TrackOutput p(TrackId trackId) {
        int length = this.u0.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (trackId.equals(this.v0[i2])) {
                return this.u0[i2];
            }
        }
        if (this.w0) {
            Log.g("ProgressiveMediaPeriod", "Extractor added new track (id=" + trackId.f6408a + ") after finishing tracks.");
            return new DiscardingTrackOutput();
        }
        DrmSessionManager drmSessionManager = this.Z;
        drmSessionManager.getClass();
        SampleQueue sampleQueue = new SampleQueue(this.i0, drmSessionManager, this.g0);
        sampleQueue.f = this;
        int i3 = length + 1;
        TrackId[] trackIdArr = (TrackId[]) Arrays.copyOf(this.v0, i3);
        trackIdArr[length] = trackId;
        int i4 = Util.f5683a;
        this.v0 = trackIdArr;
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.u0, i3);
        sampleQueueArr[length] = sampleQueue;
        this.u0 = sampleQueueArr;
        return sampleQueue;
    }

    public final void q() {
        ExtractingLoadable extractingLoadable = new ExtractingLoadable(this.X, this.f6397Y, this.n0, this, this.o0);
        if (this.x0) {
            Assertions.e(l());
            long j = this.C0;
            if (j != -9223372036854775807L && this.K0 > j) {
                this.N0 = true;
                this.K0 = -9223372036854775807L;
                return;
            }
            SeekMap seekMap = this.B0;
            seekMap.getClass();
            long j2 = seekMap.getSeekPoints(this.K0).f6794a.f6800b;
            long j3 = this.K0;
            extractingLoadable.g.f6793a = j2;
            extractingLoadable.j = j3;
            extractingLoadable.f6404i = true;
            extractingLoadable.m = false;
            for (SampleQueue sampleQueue : this.u0) {
                sampleQueue.t = this.K0;
            }
            this.K0 = -9223372036854775807L;
        }
        this.M0 = j();
        this.m0.e(extractingLoadable, this, this.e0.a(this.E0));
        this.f0.e(new LoadEventInfo(extractingLoadable.f6399a, extractingLoadable.k), new MediaLoadData(1, -1, null, 0, Util.T(extractingLoadable.j), Util.T(this.C0)));
    }

    public final boolean r() {
        return this.G0 || l();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long readDiscontinuity() {
        if (!this.G0) {
            return -9223372036854775807L;
        }
        if (!this.N0 && j() <= this.M0) {
            return -9223372036854775807L;
        }
        this.G0 = false;
        return this.J0;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0080  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0093 A[LOOP:1: B:56:0x0091->B:57:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac A[LOOP:2: B:61:0x00aa->B:62:0x00ac, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x008e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x00a1, please report this as an issue */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long seekToUs(long j) {
        int i2;
        boolean zQ;
        i();
        boolean[] zArr = this.A0.f6411b;
        if (!this.B0.isSeekable()) {
            j = 0;
        }
        this.G0 = false;
        this.J0 = j;
        if (l()) {
            this.K0 = j;
            return j;
        }
        if (this.E0 == 7 || !(this.N0 || this.m0.b())) {
            this.L0 = false;
            this.K0 = j;
            this.N0 = false;
            if (this.m0.b()) {
                for (SampleQueue sampleQueue : this.u0) {
                    sampleQueue.h();
                }
                this.m0.a();
                return j;
            }
            this.m0.f6579c = null;
            for (SampleQueue sampleQueue2 : this.u0) {
                sampleQueue2.p(false);
            }
        } else {
            int length = this.u0.length;
            int i3 = 0;
            while (true) {
                zQ = true;
                if (i3 >= length) {
                    break;
                }
                SampleQueue sampleQueue3 = this.u0[i3];
                if (this.z0) {
                    int i4 = sampleQueue3.q;
                    synchronized (sampleQueue3) {
                        synchronized (sampleQueue3) {
                            sampleQueue3.s = 0;
                            SampleDataQueue sampleDataQueue = sampleQueue3.f6425a;
                            sampleDataQueue.f6419e = sampleDataQueue.d;
                        }
                    }
                    int i5 = sampleQueue3.q;
                    if (i4 < i5 || i4 > sampleQueue3.f6433p + i5) {
                        zQ = false;
                    } else {
                        sampleQueue3.t = Long.MIN_VALUE;
                        sampleQueue3.s = i4 - i5;
                    }
                } else {
                    zQ = sampleQueue3.q(j, false);
                }
                if (!zQ && (zArr[i3] || !this.y0)) {
                    zQ = false;
                    break;
                }
                i3++;
            }
            if (!zQ) {
                this.L0 = false;
                this.K0 = j;
                this.N0 = false;
                if (this.m0.b()) {
                    while (i < r2) {
                        sampleQueue.h();
                    }
                    this.m0.a();
                    return j;
                }
                this.m0.f6579c = null;
                while (i2 < r2) {
                    sampleQueue2.p(false);
                }
            }
        }
        return j;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final TrackOutput track(int i2, int i3) {
        return p(new TrackId(i2, false));
    }
}
