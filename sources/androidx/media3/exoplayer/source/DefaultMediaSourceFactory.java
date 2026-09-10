package androidx.media3.exoplayer.source;

import android.content.Context;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleExtractor;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f6353l = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DelegateFactoryLoader f6354c;
    public final DefaultDataSource.Factory d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DefaultSubtitleParserFactory f6355e;
    public final long f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f6357i;
    public final float j;
    public boolean k;

    @Deprecated
    public interface AdsLoaderProvider extends AdsLoader.Provider {
    }

    public static final class DelegateFactoryLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DefaultExtractorsFactory f6358a;
        public DefaultDataSource.Factory d;
        public DefaultSubtitleParserFactory f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f6359b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap f6360c = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f6361e = true;

        public DelegateFactoryLoader(DefaultExtractorsFactory defaultExtractorsFactory, DefaultSubtitleParserFactory defaultSubtitleParserFactory) {
            this.f6358a = defaultExtractorsFactory;
            this.f = defaultSubtitleParserFactory;
        }

        public final Supplier a(int i2) {
            Supplier supplier;
            final int i3 = 3;
            final int i4 = 2;
            final int i5 = 1;
            HashMap map = this.f6359b;
            Supplier supplier2 = (Supplier) map.get(Integer.valueOf(i2));
            if (supplier2 != null) {
                return supplier2;
            }
            final DefaultDataSource.Factory factory = this.d;
            factory.getClass();
            if (i2 == 0) {
                final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                final int i6 = 0;
                supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.d
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        switch (i6) {
                            case 0:
                                return DefaultMediaSourceFactory.d((Class) genericDeclarationAsSubclass, factory);
                            case 1:
                                return DefaultMediaSourceFactory.d((Class) genericDeclarationAsSubclass, factory);
                            case 2:
                                return DefaultMediaSourceFactory.d((Class) genericDeclarationAsSubclass, factory);
                            default:
                                DefaultMediaSourceFactory.DelegateFactoryLoader delegateFactoryLoader = (DefaultMediaSourceFactory.DelegateFactoryLoader) genericDeclarationAsSubclass;
                                delegateFactoryLoader.getClass();
                                return new ProgressiveMediaSource.Factory(factory, delegateFactoryLoader.f6358a);
                        }
                    }
                };
            } else if (i2 == 1) {
                final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.d
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        switch (i5) {
                            case 0:
                                return DefaultMediaSourceFactory.d((Class) genericDeclarationAsSubclass2, factory);
                            case 1:
                                return DefaultMediaSourceFactory.d((Class) genericDeclarationAsSubclass2, factory);
                            case 2:
                                return DefaultMediaSourceFactory.d((Class) genericDeclarationAsSubclass2, factory);
                            default:
                                DefaultMediaSourceFactory.DelegateFactoryLoader delegateFactoryLoader = (DefaultMediaSourceFactory.DelegateFactoryLoader) genericDeclarationAsSubclass2;
                                delegateFactoryLoader.getClass();
                                return new ProgressiveMediaSource.Factory(factory, delegateFactoryLoader.f6358a);
                        }
                    }
                };
            } else if (i2 == 2) {
                final GenericDeclaration genericDeclarationAsSubclass3 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.d
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        switch (i4) {
                            case 0:
                                return DefaultMediaSourceFactory.d((Class) genericDeclarationAsSubclass3, factory);
                            case 1:
                                return DefaultMediaSourceFactory.d((Class) genericDeclarationAsSubclass3, factory);
                            case 2:
                                return DefaultMediaSourceFactory.d((Class) genericDeclarationAsSubclass3, factory);
                            default:
                                DefaultMediaSourceFactory.DelegateFactoryLoader delegateFactoryLoader = (DefaultMediaSourceFactory.DelegateFactoryLoader) genericDeclarationAsSubclass3;
                                delegateFactoryLoader.getClass();
                                return new ProgressiveMediaSource.Factory(factory, delegateFactoryLoader.f6358a);
                        }
                    }
                };
            } else if (i2 == 3) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.e
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        Class cls = clsAsSubclass;
                        int i7 = DefaultMediaSourceFactory.f6353l;
                        try {
                            return (MediaSource.Factory) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                        } catch (Exception e2) {
                            throw new IllegalStateException(e2);
                        }
                    }
                };
            } else {
                if (i2 != 4) {
                    throw new IllegalArgumentException(android.support.v4.media.a.h(i2, "Unrecognized contentType: "));
                }
                supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.d
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        switch (i3) {
                            case 0:
                                return DefaultMediaSourceFactory.d((Class) this, factory);
                            case 1:
                                return DefaultMediaSourceFactory.d((Class) this, factory);
                            case 2:
                                return DefaultMediaSourceFactory.d((Class) this, factory);
                            default:
                                DefaultMediaSourceFactory.DelegateFactoryLoader delegateFactoryLoader = (DefaultMediaSourceFactory.DelegateFactoryLoader) this;
                                delegateFactoryLoader.getClass();
                                return new ProgressiveMediaSource.Factory(factory, delegateFactoryLoader.f6358a);
                        }
                    }
                };
            }
            map.put(Integer.valueOf(i2), supplier);
            return supplier;
        }
    }

    public static final class UnknownSubtitlesExtractor implements Extractor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Format f6362a;

        public UnknownSubtitlesExtractor(Format format) {
            this.f6362a = format;
        }

        @Override // androidx.media3.extractor.Extractor
        public final boolean c(ExtractorInput extractorInput) {
            return true;
        }

        @Override // androidx.media3.extractor.Extractor
        public final void d(ExtractorOutput extractorOutput) {
            TrackOutput trackOutputTrack = extractorOutput.track(0, 3);
            extractorOutput.e(new SeekMap.Unseekable(-9223372036854775807L));
            extractorOutput.endTracks();
            Format format = this.f6362a;
            Format.Builder builderA = format.a();
            builderA.f5429l = MimeTypes.l("text/x-unknown");
            builderA.f5428i = format.m;
            trackOutputTrack.b(new Format(builderA));
        }

        @Override // androidx.media3.extractor.Extractor
        public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
            return ((DefaultExtractorInput) extractorInput).g(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // androidx.media3.extractor.Extractor
        public final void release() {
        }

        @Override // androidx.media3.extractor.Extractor
        public final void seek(long j, long j2) {
        }
    }

    public DefaultMediaSourceFactory(Context context, DefaultExtractorsFactory defaultExtractorsFactory) {
        DefaultDataSource.Factory factory = new DefaultDataSource.Factory(context);
        this.d = factory;
        DefaultSubtitleParserFactory defaultSubtitleParserFactory = new DefaultSubtitleParserFactory();
        this.f6355e = defaultSubtitleParserFactory;
        DelegateFactoryLoader delegateFactoryLoader = new DelegateFactoryLoader(defaultExtractorsFactory, defaultSubtitleParserFactory);
        this.f6354c = delegateFactoryLoader;
        if (factory != delegateFactoryLoader.d) {
            delegateFactoryLoader.d = factory;
            delegateFactoryLoader.f6359b.clear();
            delegateFactoryLoader.f6360c.clear();
        }
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.f6356h = -9223372036854775807L;
        this.f6357i = -3.4028235E38f;
        this.j = -3.4028235E38f;
        this.k = true;
    }

    public static MediaSource.Factory d(Class cls, DefaultDataSource.Factory factory) {
        try {
            return (MediaSource.Factory) cls.getConstructor(DataSource.Factory.class).newInstance(factory);
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public final MediaSource a(MediaItem mediaItem) {
        MediaItem.DrmConfiguration.Builder builder;
        mediaItem.f5438b.getClass();
        String scheme = mediaItem.f5438b.f5458a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(mediaItem.f5438b.f5459b, "application/x-image-uri")) {
            long j = mediaItem.f5438b.g;
            int i2 = Util.f5683a;
            throw null;
        }
        MediaItem.LocalConfiguration localConfiguration = mediaItem.f5438b;
        int iC = Util.C(localConfiguration.f5458a, localConfiguration.f5459b);
        if (mediaItem.f5438b.g != -9223372036854775807L) {
            DefaultExtractorsFactory defaultExtractorsFactory = this.f6354c.f6358a;
            synchronized (defaultExtractorsFactory) {
                defaultExtractorsFactory.e0 = 1;
            }
        }
        try {
            DelegateFactoryLoader delegateFactoryLoader = this.f6354c;
            HashMap map = delegateFactoryLoader.f6360c;
            MediaSource.Factory factory = (MediaSource.Factory) map.get(Integer.valueOf(iC));
            if (factory == null) {
                factory = (MediaSource.Factory) delegateFactoryLoader.a(iC).get();
                factory.c(delegateFactoryLoader.f);
                factory.b(delegateFactoryLoader.f6361e);
                map.put(Integer.valueOf(iC), factory);
            }
            MediaItem.LiveConfiguration.Builder builderA = mediaItem.f5439c.a();
            MediaItem.LiveConfiguration liveConfiguration = mediaItem.f5439c;
            if (liveConfiguration.f5450a == -9223372036854775807L) {
                builderA.f5454a = this.f;
            }
            if (liveConfiguration.d == -3.4028235E38f) {
                builderA.d = this.f6357i;
            }
            if (liveConfiguration.f5453e == -3.4028235E38f) {
                builderA.f5457e = this.j;
            }
            if (liveConfiguration.f5451b == -9223372036854775807L) {
                builderA.f5455b = this.g;
            }
            if (liveConfiguration.f5452c == -9223372036854775807L) {
                builderA.f5456c = this.f6356h;
            }
            MediaItem.LiveConfiguration liveConfiguration2 = new MediaItem.LiveConfiguration(builderA);
            if (!liveConfiguration2.equals(mediaItem.f5439c)) {
                mediaItem.getClass();
                MediaItem.Builder builder2 = new MediaItem.Builder();
                MediaItem.ClippingProperties clippingProperties = mediaItem.f5440e;
                MediaItem.ClippingConfiguration.Builder builder3 = new MediaItem.ClippingConfiguration.Builder();
                builder3.f5449a = clippingProperties.f5448a;
                builder2.d = builder3;
                builder2.f5441a = mediaItem.f5437a;
                builder2.j = mediaItem.d;
                builder2.k = mediaItem.f5439c.a();
                builder2.f5447l = mediaItem.f;
                MediaItem.LocalConfiguration localConfiguration2 = mediaItem.f5438b;
                if (localConfiguration2 != null) {
                    builder2.g = localConfiguration2.f5461e;
                    builder2.f5443c = localConfiguration2.f5459b;
                    builder2.f5442b = localConfiguration2.f5458a;
                    builder2.f = localConfiguration2.d;
                    builder2.f5445h = localConfiguration2.f;
                    MediaItem.DrmConfiguration drmConfiguration = localConfiguration2.f5460c;
                    if (drmConfiguration != null) {
                        drmConfiguration.getClass();
                        builder = new MediaItem.DrmConfiguration.Builder();
                    } else {
                        builder = new MediaItem.DrmConfiguration.Builder();
                    }
                    builder2.f5444e = builder;
                    builder2.f5446i = localConfiguration2.g;
                }
                builder2.k = liveConfiguration2.a();
                mediaItem = builder2.a();
            }
            MediaSource mediaSourceA = factory.a(mediaItem);
            ImmutableList immutableList = mediaItem.f5438b.f;
            if (!immutableList.isEmpty()) {
                MediaSource[] mediaSourceArr = new MediaSource[immutableList.size() + 1];
                mediaSourceArr[0] = mediaSourceA;
                if (immutableList.size() > 0) {
                    if (!this.k) {
                        DefaultDataSource.Factory factory2 = this.d;
                        new SingleSampleMediaSource((MediaItem.SubtitleConfiguration) immutableList.get(0), factory2, new SingleSampleMediaSource.Factory(factory2).f6456a);
                        throw null;
                    }
                    Format.Builder builder4 = new Format.Builder();
                    ((MediaItem.SubtitleConfiguration) immutableList.get(0)).getClass();
                    ArrayList arrayList = MimeTypes.f5488a;
                    builder4.f5429l = null;
                    ((MediaItem.SubtitleConfiguration) immutableList.get(0)).getClass();
                    builder4.d = null;
                    ((MediaItem.SubtitleConfiguration) immutableList.get(0)).getClass();
                    builder4.f5426e = 0;
                    ((MediaItem.SubtitleConfiguration) immutableList.get(0)).getClass();
                    builder4.f = 0;
                    ((MediaItem.SubtitleConfiguration) immutableList.get(0)).getClass();
                    builder4.f5424b = null;
                    ((MediaItem.SubtitleConfiguration) immutableList.get(0)).getClass();
                    builder4.f5423a = null;
                    final Format format = new Format(builder4);
                    new ProgressiveMediaSource.Factory(this.d, new ExtractorsFactory() { // from class: androidx.media3.exoplayer.source.c
                        @Override // androidx.media3.extractor.ExtractorsFactory
                        public final Extractor[] createExtractors() {
                            DefaultMediaSourceFactory defaultMediaSourceFactory = this.X;
                            DefaultSubtitleParserFactory defaultSubtitleParserFactory = defaultMediaSourceFactory.f6355e;
                            Format format2 = format;
                            return new Extractor[]{defaultSubtitleParserFactory.a(format2) ? new SubtitleExtractor(defaultMediaSourceFactory.f6355e.c(format2), format2) : new DefaultMediaSourceFactory.UnknownSubtitlesExtractor(format2)};
                        }
                    });
                    ((MediaItem.SubtitleConfiguration) immutableList.get(0)).getClass();
                    throw null;
                }
                mediaSourceA = new MergingMediaSource(mediaSourceArr);
            }
            long j2 = mediaItem.f5440e.f5448a;
            if (j2 != Long.MIN_VALUE) {
                mediaSourceA = new ClippingMediaSource(mediaSourceA, j2, true);
            }
            mediaItem.f5438b.getClass();
            mediaItem.f5438b.getClass();
            return mediaSourceA;
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public final void b(boolean z2) {
        this.k = z2;
        DelegateFactoryLoader delegateFactoryLoader = this.f6354c;
        delegateFactoryLoader.f6361e = z2;
        DefaultExtractorsFactory defaultExtractorsFactory = delegateFactoryLoader.f6358a;
        synchronized (defaultExtractorsFactory) {
            defaultExtractorsFactory.f6743Y = z2;
        }
        Iterator it = delegateFactoryLoader.f6360c.values().iterator();
        while (it.hasNext()) {
            ((MediaSource.Factory) it.next()).b(z2);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public final void c(DefaultSubtitleParserFactory defaultSubtitleParserFactory) {
        this.f6355e = defaultSubtitleParserFactory;
        DelegateFactoryLoader delegateFactoryLoader = this.f6354c;
        delegateFactoryLoader.f = defaultSubtitleParserFactory;
        DefaultExtractorsFactory defaultExtractorsFactory = delegateFactoryLoader.f6358a;
        synchronized (defaultExtractorsFactory) {
            defaultExtractorsFactory.Z = defaultSubtitleParserFactory;
        }
        Iterator it = delegateFactoryLoader.f6360c.values().iterator();
        while (it.hasNext()) {
            ((MediaSource.Factory) it.next()).c(defaultSubtitleParserFactory);
        }
    }
}
