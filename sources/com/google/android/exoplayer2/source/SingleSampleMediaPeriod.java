package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class SingleSampleMediaPeriod implements MediaPeriod, Loader.Callback<SourceLoadable> {
    public final DataSpec X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final DataSource.Factory f18413Y;
    public final TransferListener Z;
    public final LoadErrorHandlingPolicy e0;
    public final MediaSourceEventListener.EventDispatcher f0;
    public final TrackGroupArray g0;
    public final long i0;
    public final Format k0;
    public final boolean l0;
    public boolean m0;
    public byte[] n0;
    public int o0;
    public final ArrayList h0 = new ArrayList();
    public final Loader j0 = new Loader("SingleSampleMediaPeriod");

    public final class SampleStreamImpl implements SampleStream {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f18414Y;

        public SampleStreamImpl() {
        }

        public final void a() {
            if (this.f18414Y) {
                return;
            }
            SingleSampleMediaPeriod singleSampleMediaPeriod = SingleSampleMediaPeriod.this;
            MediaSourceEventListener.EventDispatcher eventDispatcher = singleSampleMediaPeriod.f0;
            eventDispatcher.b(new MediaLoadData(1, MimeTypes.f(singleSampleMediaPeriod.k0.m0), singleSampleMediaPeriod.k0, 0, eventDispatcher.a(0L), -9223372036854775807L));
            this.f18414Y = true;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int g(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            a();
            SingleSampleMediaPeriod singleSampleMediaPeriod = SingleSampleMediaPeriod.this;
            boolean z2 = singleSampleMediaPeriod.m0;
            if (z2 && singleSampleMediaPeriod.n0 == null) {
                this.X = 2;
            }
            int i3 = this.X;
            if (i3 == 2) {
                decoderInputBuffer.a(4);
                return -4;
            }
            if ((i2 & 2) != 0 || i3 == 0) {
                formatHolder.f17094b = singleSampleMediaPeriod.k0;
                this.X = 1;
                return -5;
            }
            if (!z2) {
                return -3;
            }
            singleSampleMediaPeriod.n0.getClass();
            decoderInputBuffer.a(1);
            decoderInputBuffer.f0 = 0L;
            if ((i2 & 4) == 0) {
                decoderInputBuffer.g(singleSampleMediaPeriod.o0);
                decoderInputBuffer.Z.put(singleSampleMediaPeriod.n0, 0, singleSampleMediaPeriod.o0);
            }
            if ((i2 & 1) == 0) {
                this.X = 2;
            }
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final boolean isReady() {
            return SingleSampleMediaPeriod.this.m0;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final void maybeThrowError() throws IOException {
            SingleSampleMediaPeriod singleSampleMediaPeriod = SingleSampleMediaPeriod.this;
            if (singleSampleMediaPeriod.l0) {
                return;
            }
            singleSampleMediaPeriod.j0.c(Integer.MIN_VALUE);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int skipData(long j) {
            a();
            if (j <= 0 || this.X == 2) {
                return 0;
            }
            this.X = 2;
            return 1;
        }
    }

    public static final class SourceLoadable implements Loader.Loadable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18415a = LoadEventInfo.f18338b.getAndIncrement();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DataSpec f18416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StatsDataSource f18417c;
        public byte[] d;

        public SourceLoadable(DataSource dataSource, DataSpec dataSpec) {
            this.f18416b = dataSpec;
            this.f18417c = new StatsDataSource(dataSource);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public final void cancelLoad() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public final void load() {
            StatsDataSource statsDataSource = this.f18417c;
            statsDataSource.f18817b = 0L;
            try {
                statsDataSource.a(this.f18416b);
                int i2 = 0;
                while (i2 != -1) {
                    int i3 = (int) statsDataSource.f18817b;
                    byte[] bArr = this.d;
                    if (bArr == null) {
                        this.d = new byte[1024];
                    } else if (i3 == bArr.length) {
                        this.d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    byte[] bArr2 = this.d;
                    i2 = statsDataSource.read(bArr2, i3, bArr2.length - i3);
                }
            } finally {
                DataSourceUtil.a(statsDataSource);
            }
        }
    }

    public SingleSampleMediaPeriod(DataSpec dataSpec, DataSource.Factory factory, TransferListener transferListener, Format format, long j, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher, boolean z2) {
        this.X = dataSpec;
        this.f18413Y = factory;
        this.Z = transferListener;
        this.k0 = format;
        this.i0 = j;
        this.e0 = loadErrorHandlingPolicy;
        this.f0 = eventDispatcher;
        this.l0 = z2;
        this.g0 = new TrackGroupArray(new TrackGroup("", format));
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public final void a(Loader.Loadable loadable, long j, long j2, boolean z2) {
        SourceLoadable sourceLoadable = (SourceLoadable) loadable;
        StatsDataSource statsDataSource = sourceLoadable.f18417c;
        Uri uri = statsDataSource.f18818c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(statsDataSource.d, sourceLoadable.f18415a);
        this.e0.getClass();
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f0;
        eventDispatcher.c(loadEventInfo, new MediaLoadData(1, -1, null, 0, eventDispatcher.a(0L), eventDispatcher.a(this.i0)));
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public final void b(Loader.Loadable loadable, long j, long j2) {
        SourceLoadable sourceLoadable = (SourceLoadable) loadable;
        this.o0 = (int) sourceLoadable.f18417c.f18817b;
        byte[] bArr = sourceLoadable.d;
        bArr.getClass();
        this.n0 = bArr;
        this.m0 = true;
        StatsDataSource statsDataSource = sourceLoadable.f18417c;
        Uri uri = statsDataSource.f18818c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(statsDataSource.d, sourceLoadable.f18415a);
        this.e0.getClass();
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f0;
        eventDispatcher.d(loadEventInfo, new MediaLoadData(1, -1, this.k0, 0, eventDispatcher.a(0L), eventDispatcher.a(this.i0)));
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        return j;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final boolean continueLoading(long j) {
        if (this.m0) {
            return false;
        }
        Loader loader = this.j0;
        if (loader.b() || loader.f18798c != null) {
            return false;
        }
        DataSource dataSourceCreateDataSource = this.f18413Y.createDataSource();
        TransferListener transferListener = this.Z;
        if (transferListener != null) {
            dataSourceCreateDataSource.b(transferListener);
        }
        DataSpec dataSpec = this.X;
        SourceLoadable sourceLoadable = new SourceLoadable(dataSourceCreateDataSource, dataSpec);
        loader.e(sourceLoadable, this, this.e0.a(1));
        LoadEventInfo loadEventInfo = new LoadEventInfo(sourceLoadable.f18415a, dataSpec);
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f0;
        eventDispatcher.f(loadEventInfo, new MediaLoadData(1, -1, this.k0, 0, eventDispatcher.a(0L), eventDispatcher.a(this.i0)));
        return true;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final void d(MediaPeriod.Callback callback, long j) {
        callback.f(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final void discardBuffer(long j, boolean z2) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long e(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
            SampleStream sampleStream = sampleStreamArr[i2];
            ArrayList arrayList = this.h0;
            if (sampleStream != null && (exoTrackSelectionArr[i2] == null || !zArr[i2])) {
                arrayList.remove(sampleStream);
                sampleStreamArr[i2] = null;
            }
            if (sampleStreamArr[i2] == null && exoTrackSelectionArr[i2] != null) {
                SampleStreamImpl sampleStreamImpl = new SampleStreamImpl();
                arrayList.add(sampleStreamImpl);
                sampleStreamArr[i2] = sampleStreamImpl;
                zArr2[i2] = true;
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public final Loader.LoadErrorAction f(Loader.Loadable loadable, long j, long j2, IOException iOException, int i2) {
        Loader.LoadErrorAction loadErrorAction;
        SourceLoadable sourceLoadable = (SourceLoadable) loadable;
        StatsDataSource statsDataSource = sourceLoadable.f18417c;
        Uri uri = statsDataSource.f18818c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(statsDataSource.d, sourceLoadable.f18415a);
        long j3 = this.i0;
        Util.J(j3);
        LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(iOException, i2);
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.e0;
        long jB = loadErrorHandlingPolicy.b(loadErrorInfo);
        boolean z2 = jB == -9223372036854775807L || i2 >= loadErrorHandlingPolicy.a(1);
        if (this.l0 && z2) {
            Log.h("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.m0 = true;
            loadErrorAction = Loader.d;
        } else {
            loadErrorAction = jB != -9223372036854775807L ? new Loader.LoadErrorAction(0, jB) : Loader.f18795e;
        }
        int i3 = loadErrorAction.f18799a;
        boolean z3 = i3 == 0 || i3 == 1;
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f0;
        eventDispatcher.e(loadEventInfo, new MediaLoadData(1, -1, this.k0, 0, eventDispatcher.a(0L), eventDispatcher.a(j3)), iOException, !z3);
        return loadErrorAction;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        return this.m0 ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        return (this.m0 || this.j0.b()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        return this.g0;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final boolean isLoading() {
        return this.j0.b();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final void maybeThrowPrepareError() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long seekToUs(long j) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h0;
            if (i2 >= arrayList.size()) {
                return j;
            }
            SampleStreamImpl sampleStreamImpl = (SampleStreamImpl) arrayList.get(i2);
            if (sampleStreamImpl.X == 2) {
                sampleStreamImpl.X = 1;
            }
            i2++;
        }
    }
}
