package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PreviewingVideoGraph;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class CompositingVideoSinkProvider implements VideoSinkProvider, VideoGraph.Listener {
    public static final b o = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VideoSinkImpl f6599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VideoFrameReleaseControl f6600c;
    public final VideoFrameRenderControl d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PreviewingVideoGraph.Factory f6601e;
    public final SystemClock f;
    public final CopyOnWriteArraySet g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Format f6602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public VideoFrameMetadataListener f6603i;
    public HandlerWrapper j;
    public PreviewingVideoGraph k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Pair f6604l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6605n;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f6606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final VideoFrameReleaseControl f6607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public VideoFrameProcessor.Factory f6608c;
        public PreviewingVideoGraph.Factory d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public SystemClock f6609e = Clock.f5626a;
        public boolean f;

        public Builder(Context context, VideoFrameReleaseControl videoFrameReleaseControl) {
            this.f6606a = context.getApplicationContext();
            this.f6607b = videoFrameReleaseControl;
        }
    }

    public final class FrameRendererImpl implements VideoFrameRenderControl.FrameRenderer {
        public FrameRendererImpl() {
        }
    }

    public interface Listener {
        void a();

        void d();

        void onVideoSizeChanged(VideoSize videoSize);
    }

    public static final class ReflectiveDefaultVideoFrameProcessorFactory implements VideoFrameProcessor.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Supplier f6611a = Suppliers.a(new d());
    }

    public static final class ReflectivePreviewingSingleInputVideoGraphFactory implements PreviewingVideoGraph.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VideoFrameProcessor.Factory f6612a;

        public ReflectivePreviewingSingleInputVideoGraphFactory(VideoFrameProcessor.Factory factory) {
            this.f6612a = factory;
        }

        @Override // androidx.media3.common.PreviewingVideoGraph.Factory
        public final PreviewingVideoGraph a(Context context, ColorInfo colorInfo, VideoGraph.Listener listener, a aVar, List list) throws VideoFrameProcessingException {
            try {
                return ((PreviewingVideoGraph.Factory) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class).newInstance(this.f6612a)).a(context, colorInfo, listener, aVar, list);
            } catch (Exception e2) {
                int i2 = VideoFrameProcessingException.X;
                if (e2 instanceof VideoFrameProcessingException) {
                    throw ((VideoFrameProcessingException) e2);
                }
                throw new VideoFrameProcessingException(e2);
            }
        }
    }

    public static final class ScaleAndRotateAccessor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Constructor f6613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f6614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Method f6615c;

        public static void a() throws ClassNotFoundException {
            if (f6613a == null || f6614b == null || f6615c == null) {
                Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                f6613a = cls.getConstructor(new Class[0]);
                f6614b = cls.getMethod("setRotationDegrees", Float.TYPE);
                f6615c = cls.getMethod("build", new Class[0]);
            }
        }
    }

    public final class VideoSinkImpl implements VideoSink, Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f6616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f6618c;
        public Effect d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public VideoFrameProcessor f6619e;
        public Format f;
        public long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f6620h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f6621i;
        public long j;
        public boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f6622l;
        public VideoSink.Listener m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Executor f6623n;

        public VideoSinkImpl(Context context) {
            this.f6616a = context;
            this.f6617b = Util.G(context) ? 1 : 5;
            this.f6618c = new ArrayList();
            this.f6621i = -9223372036854775807L;
            this.j = -9223372036854775807L;
            this.m = VideoSink.Listener.f6668a;
            this.f6623n = CompositingVideoSinkProvider.o;
        }

        @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
        public final void a() {
            this.f6623n.execute(new e(this, this.m, 2));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void b() {
            VideoFrameReleaseControl videoFrameReleaseControl = CompositingVideoSinkProvider.this.f6600c;
            if (videoFrameReleaseControl.d == 0) {
                videoFrameReleaseControl.d = 1;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final Surface c() {
            Assertions.e(isInitialized());
            VideoFrameProcessor videoFrameProcessor = this.f6619e;
            Assertions.f(videoFrameProcessor);
            return videoFrameProcessor.c();
        }

        @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
        public final void d() {
            this.f6623n.execute(new e(this, this.m, 1));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void e(VideoFrameMetadataListener videoFrameMetadataListener) {
            CompositingVideoSinkProvider.this.f6603i = videoFrameMetadataListener;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final long f(long j, boolean z2) {
            Assertions.e(isInitialized());
            int i2 = this.f6617b;
            Assertions.e(i2 != -1);
            long j2 = this.f6622l;
            CompositingVideoSinkProvider compositingVideoSinkProvider = CompositingVideoSinkProvider.this;
            if (j2 != -9223372036854775807L) {
                if (compositingVideoSinkProvider.m == 0) {
                    long j3 = compositingVideoSinkProvider.d.j;
                    if (j3 != -9223372036854775807L && j3 >= j2) {
                        t();
                        this.f6622l = -9223372036854775807L;
                    }
                }
                return -9223372036854775807L;
            }
            VideoFrameProcessor videoFrameProcessor = this.f6619e;
            Assertions.f(videoFrameProcessor);
            if (videoFrameProcessor.e() < i2) {
                VideoFrameProcessor videoFrameProcessor2 = this.f6619e;
                Assertions.f(videoFrameProcessor2);
                if (videoFrameProcessor2.d()) {
                    if (this.f6620h) {
                        compositingVideoSinkProvider.d.f6663e.a(j, Long.valueOf(this.g));
                        this.f6620h = false;
                    }
                    this.j = j;
                    if (z2) {
                        this.f6621i = j;
                    }
                    return j * 1000;
                }
            }
            return -9223372036854775807L;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void g() {
            CompositingVideoSinkProvider.this.f6600c.e();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void h(List list) {
            ArrayList arrayList = this.f6618c;
            if (arrayList.equals(list)) {
                return;
            }
            arrayList.clear();
            arrayList.addAll(list);
            t();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean i() {
            return Util.G(this.f6616a);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean isEnded() {
            if (!isInitialized()) {
                return false;
            }
            long j = this.f6621i;
            if (j == -9223372036854775807L) {
                return false;
            }
            CompositingVideoSinkProvider compositingVideoSinkProvider = CompositingVideoSinkProvider.this;
            if (compositingVideoSinkProvider.m != 0) {
                return false;
            }
            long j2 = compositingVideoSinkProvider.d.j;
            return j2 != -9223372036854775807L && j2 >= j;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean isInitialized() {
            return this.f6619e != null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean isReady() {
            if (!isInitialized()) {
                return false;
            }
            CompositingVideoSinkProvider compositingVideoSinkProvider = CompositingVideoSinkProvider.this;
            return compositingVideoSinkProvider.m == 0 && compositingVideoSinkProvider.d.f6661b.b(true);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void j(Format format) {
            int i2;
            Format format2;
            Assertions.e(isInitialized());
            CompositingVideoSinkProvider.this.f6600c.f(format.f5415u);
            if (Util.f5683a >= 21 || (i2 = format.v) == -1 || i2 == 0) {
                this.d = null;
            } else if (this.d == null || (format2 = this.f) == null || format2.v != i2) {
                float f = i2;
                try {
                    ScaleAndRotateAccessor.a();
                    Object objNewInstance = ScaleAndRotateAccessor.f6613a.newInstance(new Object[0]);
                    ScaleAndRotateAccessor.f6614b.invoke(objNewInstance, Float.valueOf(f));
                    Object objInvoke = ScaleAndRotateAccessor.f6615c.invoke(objNewInstance, new Object[0]);
                    objInvoke.getClass();
                    this.d = (Effect) objInvoke;
                } catch (Exception e2) {
                    throw new IllegalStateException(e2);
                }
            }
            this.f = format;
            if (this.k) {
                Assertions.e(this.j != -9223372036854775807L);
                this.f6622l = this.j;
            } else {
                t();
                this.k = true;
                this.f6622l = -9223372036854775807L;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [androidx.media3.exoplayer.video.a] */
        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void k(Format format) throws VideoSink.VideoSinkException {
            Assertions.e(!isInitialized());
            CompositingVideoSinkProvider compositingVideoSinkProvider = CompositingVideoSinkProvider.this;
            Assertions.e(compositingVideoSinkProvider.f6605n == 0);
            ColorInfo colorInfoA = format.f5417z;
            if (colorInfoA == null || !colorInfoA.d()) {
                colorInfoA = ColorInfo.f5382h;
            }
            if (colorInfoA.f5385c == 7 && Util.f5683a < 34) {
                ColorInfo.Builder builder = new ColorInfo.Builder();
                builder.f5387a = colorInfoA.f5383a;
                builder.f5388b = colorInfoA.f5384b;
                builder.d = colorInfoA.d;
                builder.f5390e = colorInfoA.f5386e;
                builder.f = colorInfoA.f;
                builder.f5389c = 6;
                colorInfoA = builder.a();
            }
            ColorInfo colorInfo = colorInfoA;
            Looper looperMyLooper = Looper.myLooper();
            Assertions.f(looperMyLooper);
            final HandlerWrapper handlerWrapperCreateHandler = compositingVideoSinkProvider.f.createHandler(looperMyLooper, null);
            compositingVideoSinkProvider.j = handlerWrapperCreateHandler;
            try {
                compositingVideoSinkProvider.k = ((ReflectivePreviewingSingleInputVideoGraphFactory) compositingVideoSinkProvider.f6601e).a(compositingVideoSinkProvider.f6598a, colorInfo, compositingVideoSinkProvider, new Executor() { // from class: androidx.media3.exoplayer.video.a
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handlerWrapperCreateHandler.post(runnable);
                    }
                }, ImmutableList.x());
                Pair pair = compositingVideoSinkProvider.f6604l;
                if (pair != null) {
                    Surface surface = (Surface) pair.first;
                    Size size = (Size) pair.second;
                    compositingVideoSinkProvider.a(surface, size.f5672a, size.f5673b);
                }
                compositingVideoSinkProvider.k.d();
                compositingVideoSinkProvider.f6605n = 1;
                this.f6619e = compositingVideoSinkProvider.k.c();
            } catch (VideoFrameProcessingException e2) {
                throw new VideoSink.VideoSinkException(e2, format);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void l(boolean z2) {
            CompositingVideoSinkProvider.this.f6600c.d = z2 ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void m() {
            CompositingVideoSinkProvider.this.f6600c.d();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void n(Surface surface, Size size) {
            CompositingVideoSinkProvider compositingVideoSinkProvider = CompositingVideoSinkProvider.this;
            Pair pair = compositingVideoSinkProvider.f6604l;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((Size) compositingVideoSinkProvider.f6604l.second).equals(size)) {
                return;
            }
            compositingVideoSinkProvider.f6604l = Pair.create(surface, size);
            compositingVideoSinkProvider.a(surface, size.f5672a, size.f5673b);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void o(long j) {
            this.f6620h |= this.g != j;
            this.g = j;
        }

        @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
        public final void onVideoSizeChanged(VideoSize videoSize) {
            this.f6623n.execute(new e(this, this.m, videoSize));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void p() {
            CompositingVideoSinkProvider.this.f6600c.c(0);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void q() {
            CompositingVideoSinkProvider compositingVideoSinkProvider = CompositingVideoSinkProvider.this;
            compositingVideoSinkProvider.getClass();
            Size size = Size.f5671c;
            compositingVideoSinkProvider.a(null, size.f5672a, size.f5673b);
            compositingVideoSinkProvider.f6604l = null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void r(boolean z2) {
            if (isInitialized()) {
                this.f6619e.flush();
            }
            this.k = false;
            this.f6621i = -9223372036854775807L;
            this.j = -9223372036854775807L;
            final CompositingVideoSinkProvider compositingVideoSinkProvider = CompositingVideoSinkProvider.this;
            if (compositingVideoSinkProvider.f6605n == 1) {
                compositingVideoSinkProvider.m++;
                compositingVideoSinkProvider.d.a();
                HandlerWrapper handlerWrapper = compositingVideoSinkProvider.j;
                Assertions.f(handlerWrapper);
                handlerWrapper.post(new Runnable() { // from class: androidx.media3.exoplayer.video.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        CompositingVideoSinkProvider compositingVideoSinkProvider2 = compositingVideoSinkProvider;
                        int i2 = compositingVideoSinkProvider2.m - 1;
                        compositingVideoSinkProvider2.m = i2;
                        if (i2 > 0) {
                            return;
                        }
                        if (i2 < 0) {
                            throw new IllegalStateException(String.valueOf(compositingVideoSinkProvider2.m));
                        }
                        compositingVideoSinkProvider2.d.a();
                    }
                });
            }
            if (z2) {
                VideoFrameReleaseControl videoFrameReleaseControl = compositingVideoSinkProvider.f6600c;
                VideoFrameReleaseHelper videoFrameReleaseHelper = videoFrameReleaseControl.f6642b;
                videoFrameReleaseHelper.m = 0L;
                videoFrameReleaseHelper.f6657p = -1L;
                videoFrameReleaseHelper.f6656n = -1L;
                videoFrameReleaseControl.g = -9223372036854775807L;
                videoFrameReleaseControl.f6644e = -9223372036854775807L;
                videoFrameReleaseControl.c(1);
                videoFrameReleaseControl.f6645h = -9223372036854775807L;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void release() {
            CompositingVideoSinkProvider compositingVideoSinkProvider = CompositingVideoSinkProvider.this;
            if (compositingVideoSinkProvider.f6605n == 2) {
                return;
            }
            HandlerWrapper handlerWrapper = compositingVideoSinkProvider.j;
            if (handlerWrapper != null) {
                handlerWrapper.b();
            }
            PreviewingVideoGraph previewingVideoGraph = compositingVideoSinkProvider.k;
            if (previewingVideoGraph != null) {
                previewingVideoGraph.release();
            }
            compositingVideoSinkProvider.f6604l = null;
            compositingVideoSinkProvider.f6605n = 2;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void render(long j, long j2) throws VideoSink.VideoSinkException {
            try {
                CompositingVideoSinkProvider.this.b(j, j2);
            } catch (ExoPlaybackException e2) {
                Format format = this.f;
                if (format == null) {
                    format = new Format(new Format.Builder());
                }
                throw new VideoSink.VideoSinkException(e2, format);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void s(VideoSink.Listener listener, Executor executor) {
            this.m = listener;
            this.f6623n = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void setPlaybackSpeed(float f) {
            VideoFrameRenderControl videoFrameRenderControl = CompositingVideoSinkProvider.this.d;
            videoFrameRenderControl.getClass();
            Assertions.b(f > 0.0f);
            VideoFrameReleaseControl videoFrameReleaseControl = videoFrameRenderControl.f6661b;
            if (f == videoFrameReleaseControl.j) {
                return;
            }
            videoFrameReleaseControl.j = f;
            VideoFrameReleaseHelper videoFrameReleaseHelper = videoFrameReleaseControl.f6642b;
            videoFrameReleaseHelper.f6654i = f;
            videoFrameReleaseHelper.m = 0L;
            videoFrameReleaseHelper.f6657p = -1L;
            videoFrameReleaseHelper.f6656n = -1L;
            videoFrameReleaseHelper.d(false);
        }

        public final void t() {
            if (this.f == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Effect effect = this.d;
            if (effect != null) {
                arrayList.add(effect);
            }
            arrayList.addAll(this.f6618c);
            Format format = this.f;
            format.getClass();
            VideoFrameProcessor videoFrameProcessor = this.f6619e;
            Assertions.f(videoFrameProcessor);
            ColorInfo colorInfo = format.f5417z;
            if (colorInfo == null || !colorInfo.d()) {
                ColorInfo colorInfo2 = ColorInfo.f5382h;
            }
            int i2 = format.s;
            Assertions.a("width must be positive, but is: " + i2, i2 > 0);
            int i3 = format.t;
            Assertions.a("height must be positive, but is: " + i3, i3 > 0);
            videoFrameProcessor.f();
            this.f6621i = -9223372036854775807L;
        }
    }

    public CompositingVideoSinkProvider(Builder builder) {
        Context context = builder.f6606a;
        this.f6598a = context;
        VideoSinkImpl videoSinkImpl = new VideoSinkImpl(context);
        this.f6599b = videoSinkImpl;
        SystemClock systemClock = builder.f6609e;
        this.f = systemClock;
        VideoFrameReleaseControl videoFrameReleaseControl = builder.f6607b;
        this.f6600c = videoFrameReleaseControl;
        videoFrameReleaseControl.k = systemClock;
        this.d = new VideoFrameRenderControl(new FrameRendererImpl(), videoFrameReleaseControl);
        PreviewingVideoGraph.Factory factory = builder.d;
        Assertions.f(factory);
        this.f6601e = factory;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.g = copyOnWriteArraySet;
        this.f6605n = 0;
        copyOnWriteArraySet.add(videoSinkImpl);
    }

    public final void a(Surface surface, int i2, int i3) {
        PreviewingVideoGraph previewingVideoGraph = this.k;
        if (previewingVideoGraph != null) {
            previewingVideoGraph.b();
            this.f6600c.g(surface);
        }
    }

    public final void b(long j, long j2) {
        if (this.m != 0) {
            return;
        }
        while (true) {
            VideoFrameRenderControl videoFrameRenderControl = this.d;
            LongArrayQueue longArrayQueue = videoFrameRenderControl.f;
            int i2 = longArrayQueue.f5655b;
            if (i2 == 0) {
                return;
            }
            if (i2 == 0) {
                throw new NoSuchElementException();
            }
            long j3 = longArrayQueue.f5656c[longArrayQueue.f5654a];
            Long l2 = (Long) videoFrameRenderControl.f6663e.f(j3);
            VideoFrameReleaseControl videoFrameReleaseControl = videoFrameRenderControl.f6661b;
            if (l2 != null && l2.longValue() != videoFrameRenderControl.f6665i) {
                videoFrameRenderControl.f6665i = l2.longValue();
                videoFrameReleaseControl.c(2);
            }
            int iA = videoFrameRenderControl.f6661b.a(j3, j, j2, videoFrameRenderControl.f6665i, false, videoFrameRenderControl.f6662c);
            FrameRendererImpl frameRendererImpl = videoFrameRenderControl.f6660a;
            CompositingVideoSinkProvider compositingVideoSinkProvider = CompositingVideoSinkProvider.this;
            if (iA == 0 || iA == 1) {
                videoFrameRenderControl.j = j3;
                long jA = longArrayQueue.a();
                VideoSize videoSize = (VideoSize) videoFrameRenderControl.d.f(jA);
                if (videoSize != null && !videoSize.equals(VideoSize.f5552e) && !videoSize.equals(videoFrameRenderControl.f6664h)) {
                    videoFrameRenderControl.f6664h = videoSize;
                    Format.Builder builder = new Format.Builder();
                    builder.r = videoSize.f5553a;
                    builder.s = videoSize.f5554b;
                    builder.f5429l = MimeTypes.l("video/raw");
                    compositingVideoSinkProvider.f6602h = new Format(builder);
                    Iterator it = compositingVideoSinkProvider.g.iterator();
                    while (it.hasNext()) {
                        ((Listener) it.next()).onVideoSizeChanged(videoSize);
                    }
                }
                boolean z2 = videoFrameReleaseControl.d != 3;
                videoFrameReleaseControl.d = 3;
                videoFrameReleaseControl.k.getClass();
                videoFrameReleaseControl.f = Util.I(android.os.SystemClock.elapsedRealtime());
                CompositingVideoSinkProvider compositingVideoSinkProvider2 = CompositingVideoSinkProvider.this;
                if (z2 && compositingVideoSinkProvider2.f6604l != null) {
                    Iterator it2 = compositingVideoSinkProvider2.g.iterator();
                    while (it2.hasNext()) {
                        ((Listener) it2.next()).a();
                    }
                }
                if (compositingVideoSinkProvider2.f6603i != null) {
                    Format format = compositingVideoSinkProvider2.f6602h;
                    Format format2 = format == null ? new Format(new Format.Builder()) : format;
                    VideoFrameMetadataListener videoFrameMetadataListener = compositingVideoSinkProvider2.f6603i;
                    compositingVideoSinkProvider2.f.getClass();
                    videoFrameMetadataListener.f(jA, System.nanoTime(), format2, null);
                }
                PreviewingVideoGraph previewingVideoGraph = compositingVideoSinkProvider2.k;
                Assertions.f(previewingVideoGraph);
                previewingVideoGraph.a();
            } else {
                if (iA != 2 && iA != 3 && iA != 4) {
                    if (iA != 5) {
                        throw new IllegalStateException(String.valueOf(iA));
                    }
                    return;
                }
                videoFrameRenderControl.j = j3;
                longArrayQueue.a();
                Iterator it3 = compositingVideoSinkProvider.g.iterator();
                while (it3.hasNext()) {
                    ((Listener) it3.next()).d();
                }
                PreviewingVideoGraph previewingVideoGraph2 = compositingVideoSinkProvider.k;
                Assertions.f(previewingVideoGraph2);
                previewingVideoGraph2.a();
            }
        }
    }
}
