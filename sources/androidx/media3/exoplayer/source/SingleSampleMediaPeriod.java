package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class SingleSampleMediaPeriod implements MediaPeriod, Loader.Callback<SourceLoadable> {
    public final DataSpec X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final DefaultDataSource.Factory f6451Y;
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
        public boolean f6452Y;

        public SampleStreamImpl() {
        }

        public final void a() {
            if (this.f6452Y) {
                return;
            }
            SingleSampleMediaPeriod singleSampleMediaPeriod = SingleSampleMediaPeriod.this;
            singleSampleMediaPeriod.f0.a(new MediaLoadData(1, MimeTypes.g(singleSampleMediaPeriod.k0.m), singleSampleMediaPeriod.k0, 0, Util.T(0L), -9223372036854775807L));
            this.f6452Y = true;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int e(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
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
                formatHolder.f5911b = singleSampleMediaPeriod.k0;
                this.X = 1;
                return -5;
            }
            if (!z2) {
                return -3;
            }
            singleSampleMediaPeriod.n0.getClass();
            decoderInputBuffer.a(1);
            decoderInputBuffer.g0 = 0L;
            if ((i2 & 4) == 0) {
                decoderInputBuffer.g(singleSampleMediaPeriod.o0);
                decoderInputBuffer.e0.put(singleSampleMediaPeriod.n0, 0, singleSampleMediaPeriod.o0);
            }
            if ((i2 & 1) == 0) {
                this.X = 2;
            }
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            return SingleSampleMediaPeriod.this.m0;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void maybeThrowError() throws IOException {
            SingleSampleMediaPeriod singleSampleMediaPeriod = SingleSampleMediaPeriod.this;
            if (singleSampleMediaPeriod.l0) {
                return;
            }
            singleSampleMediaPeriod.j0.c(Integer.MIN_VALUE);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
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
        public final long f6453a = LoadEventInfo.f6371b.getAndIncrement();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DataSpec f6454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StatsDataSource f6455c;
        public byte[] d;

        public SourceLoadable(DataSource dataSource, DataSpec dataSpec) {
            this.f6454b = dataSpec;
            this.f6455c = new StatsDataSource(dataSource);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public final void cancelLoad() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public final void load() {
            StatsDataSource statsDataSource = this.f6455c;
            statsDataSource.f5783b = 0L;
            try {
                statsDataSource.b(this.f6454b);
                int i2 = 0;
                while (i2 != -1) {
                    int i3 = (int) statsDataSource.f5783b;
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

    public SingleSampleMediaPeriod(DataSpec dataSpec, DefaultDataSource.Factory factory, TransferListener transferListener, Format format, long j, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher, boolean z2) {
        this.X = dataSpec;
        this.f6451Y = factory;
        this.Z = transferListener;
        this.k0 = format;
        this.i0 = j;
        this.e0 = loadErrorHandlingPolicy;
        this.f0 = eventDispatcher;
        this.l0 = z2;
        this.g0 = new TrackGroupArray(new TrackGroup("", format));
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
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean a(LoadingInfo loadingInfo) {
        if (this.m0) {
            return false;
        }
        Loader loader = this.j0;
        if (loader.b() || loader.f6579c != null) {
            return false;
        }
        DataSource dataSourceA = this.f6451Y.a();
        TransferListener transferListener = this.Z;
        if (transferListener != null) {
            ((DefaultDataSource) dataSourceA).a(transferListener);
        }
        DataSpec dataSpec = this.X;
        SourceLoadable sourceLoadable = new SourceLoadable(dataSourceA, dataSpec);
        loader.e(sourceLoadable, this, this.e0.a(1));
        LoadEventInfo loadEventInfo = new LoadEventInfo(sourceLoadable.f6453a, dataSpec);
        this.f0.e(loadEventInfo, new MediaLoadData(1, -1, this.k0, 0, Util.T(0L), Util.T(this.i0)));
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final Loader.LoadErrorAction b(Loader.Loadable loadable, long j, long j2, IOException iOException, int i2) {
        Loader.LoadErrorAction loadErrorAction;
        SourceLoadable sourceLoadable = (SourceLoadable) loadable;
        StatsDataSource statsDataSource = sourceLoadable.f6455c;
        Uri uri = statsDataSource.f5784c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(statsDataSource.d, sourceLoadable.f6453a);
        long j3 = this.i0;
        Util.T(j3);
        LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(iOException, i2);
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.e0;
        long jB = loadErrorHandlingPolicy.b(loadErrorInfo);
        boolean z2 = jB == -9223372036854775807L || i2 >= loadErrorHandlingPolicy.a(1);
        if (this.l0 && z2) {
            Log.h("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.m0 = true;
            loadErrorAction = Loader.d;
        } else {
            loadErrorAction = jB != -9223372036854775807L ? new Loader.LoadErrorAction(0, jB) : Loader.f6576e;
        }
        int i3 = loadErrorAction.f6580a;
        this.f0.d(loadEventInfo, new MediaLoadData(1, -1, this.k0, 0, Util.T(0L), Util.T(j3)), iOException, !(i3 == 0 || i3 == 1));
        return loadErrorAction;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long d(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
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

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void discardBuffer(long j, boolean z2) {
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void f(MediaPeriod.Callback callback, long j) {
        callback.b(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final void g(Loader.Loadable loadable, long j, long j2) {
        SourceLoadable sourceLoadable = (SourceLoadable) loadable;
        this.o0 = (int) sourceLoadable.f6455c.f5783b;
        byte[] bArr = sourceLoadable.d;
        bArr.getClass();
        this.n0 = bArr;
        this.m0 = true;
        StatsDataSource statsDataSource = sourceLoadable.f6455c;
        Uri uri = statsDataSource.f5784c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(statsDataSource.d, sourceLoadable.f6453a);
        this.e0.getClass();
        this.f0.c(loadEventInfo, new MediaLoadData(1, -1, this.k0, 0, Util.T(0L), Util.T(this.i0)));
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        return this.m0 ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        return (this.m0 || this.j0.b()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        return this.g0;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final void h(Loader.Loadable loadable, long j, long j2, boolean z2) {
        SourceLoadable sourceLoadable = (SourceLoadable) loadable;
        StatsDataSource statsDataSource = sourceLoadable.f6455c;
        Uri uri = statsDataSource.f5784c;
        LoadEventInfo loadEventInfo = new LoadEventInfo(statsDataSource.d, sourceLoadable.f6453a);
        this.e0.getClass();
        this.f0.b(loadEventInfo, new MediaLoadData(1, -1, null, 0, Util.T(0L), Util.T(this.i0)));
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        return this.j0.b();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void maybeThrowPrepareError() {
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
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
