package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DelegateFactoryLoader f18325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataSource.Factory f18326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18327c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18328e;
    public final float f;
    public final float g;

    @Deprecated
    public interface AdsLoaderProvider extends AdsLoader.Provider {
    }

    public static final class DelegateFactoryLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DefaultExtractorsFactory f18329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f18330b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashSet f18331c = new HashSet();
        public final HashMap d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public DataSource.Factory f18332e;

        public DelegateFactoryLoader(DefaultExtractorsFactory defaultExtractorsFactory) {
            this.f18329a = defaultExtractorsFactory;
        }
    }

    public static final class UnknownSubtitlesExtractor implements Extractor {
        @Override // com.google.android.exoplayer2.extractor.Extractor
        public final boolean b(ExtractorInput extractorInput) {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) {
            return ((DefaultExtractorInput) extractorInput).g(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public final void d(ExtractorOutput extractorOutput) {
            ProgressiveMediaPeriod progressiveMediaPeriod = (ProgressiveMediaPeriod) extractorOutput;
            progressiveMediaPeriod.track(0, 3);
            progressiveMediaPeriod.g(new SeekMap.Unseekable(-9223372036854775807L));
            progressiveMediaPeriod.endTracks();
            throw null;
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public final void release() {
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public final void seek(long j, long j2) {
        }
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory, DefaultExtractorsFactory defaultExtractorsFactory) {
        this.f18326b = factory;
        DelegateFactoryLoader delegateFactoryLoader = new DelegateFactoryLoader(defaultExtractorsFactory);
        this.f18325a = delegateFactoryLoader;
        if (factory != delegateFactoryLoader.f18332e) {
            delegateFactoryLoader.f18332e = factory;
            delegateFactoryLoader.f18330b.clear();
            delegateFactoryLoader.d.clear();
        }
        this.f18327c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.f18328e = -9223372036854775807L;
        this.f = -3.4028235E38f;
        this.g = -3.4028235E38f;
    }

    public static MediaSource.Factory b(Class cls, DataSource.Factory factory) {
        try {
            return (MediaSource.Factory) cls.getConstructor(DataSource.Factory.class).newInstance(factory);
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public final MediaSource a(MediaItem mediaItem) {
        MediaItem.DrmConfiguration.Builder builder;
        Supplier supplier;
        Supplier supplier2;
        MediaItem mediaItemA = mediaItem;
        final int i2 = 0;
        final int i3 = 3;
        final int i4 = 2;
        final int i5 = 1;
        mediaItemA.f17095Y.getClass();
        MediaItem.PlaybackProperties playbackProperties = mediaItemA.f17095Y;
        String scheme = playbackProperties.f17112a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int iX = Util.x(playbackProperties.f17112a, playbackProperties.f17113b);
        final DelegateFactoryLoader delegateFactoryLoader = this.f18325a;
        HashMap map = delegateFactoryLoader.d;
        MediaSource.Factory factory = (MediaSource.Factory) map.get(Integer.valueOf(iX));
        if (factory == null) {
            HashMap map2 = delegateFactoryLoader.f18330b;
            if (map2.containsKey(Integer.valueOf(iX))) {
                supplier = (Supplier) map2.get(Integer.valueOf(iX));
            } else {
                final DataSource.Factory factory2 = delegateFactoryLoader.f18332e;
                factory2.getClass();
                try {
                    if (iX == 0) {
                        final GenericDeclaration genericDeclarationAsSubclass = Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                        supplier2 = new Supplier() { // from class: com.google.android.exoplayer2.source.c
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                switch (i2) {
                                    case 0:
                                        return DefaultMediaSourceFactory.b((Class) genericDeclarationAsSubclass, factory2);
                                    case 1:
                                        return DefaultMediaSourceFactory.b((Class) genericDeclarationAsSubclass, factory2);
                                    case 2:
                                        return DefaultMediaSourceFactory.b((Class) genericDeclarationAsSubclass, factory2);
                                    default:
                                        return new ProgressiveMediaSource.Factory(factory2, ((DefaultMediaSourceFactory.DelegateFactoryLoader) genericDeclarationAsSubclass).f18329a);
                                }
                            }
                        };
                    } else if (iX == 1) {
                        final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                        supplier2 = new Supplier() { // from class: com.google.android.exoplayer2.source.c
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                switch (i5) {
                                    case 0:
                                        return DefaultMediaSourceFactory.b((Class) genericDeclarationAsSubclass2, factory2);
                                    case 1:
                                        return DefaultMediaSourceFactory.b((Class) genericDeclarationAsSubclass2, factory2);
                                    case 2:
                                        return DefaultMediaSourceFactory.b((Class) genericDeclarationAsSubclass2, factory2);
                                    default:
                                        return new ProgressiveMediaSource.Factory(factory2, ((DefaultMediaSourceFactory.DelegateFactoryLoader) genericDeclarationAsSubclass2).f18329a);
                                }
                            }
                        };
                    } else if (iX == 2) {
                        final GenericDeclaration genericDeclarationAsSubclass3 = Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                        supplier2 = new Supplier() { // from class: com.google.android.exoplayer2.source.c
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                switch (i4) {
                                    case 0:
                                        return DefaultMediaSourceFactory.b((Class) genericDeclarationAsSubclass3, factory2);
                                    case 1:
                                        return DefaultMediaSourceFactory.b((Class) genericDeclarationAsSubclass3, factory2);
                                    case 2:
                                        return DefaultMediaSourceFactory.b((Class) genericDeclarationAsSubclass3, factory2);
                                    default:
                                        return new ProgressiveMediaSource.Factory(factory2, ((DefaultMediaSourceFactory.DelegateFactoryLoader) genericDeclarationAsSubclass3).f18329a);
                                }
                            }
                        };
                    } else if (iX != 3) {
                        if (iX != 4) {
                            supplier2 = null;
                        } else {
                            supplier2 = new Supplier() { // from class: com.google.android.exoplayer2.source.c
                                @Override // com.google.common.base.Supplier
                                public final Object get() {
                                    switch (i3) {
                                        case 0:
                                            return DefaultMediaSourceFactory.b((Class) delegateFactoryLoader, factory2);
                                        case 1:
                                            return DefaultMediaSourceFactory.b((Class) delegateFactoryLoader, factory2);
                                        case 2:
                                            return DefaultMediaSourceFactory.b((Class) delegateFactoryLoader, factory2);
                                        default:
                                            return new ProgressiveMediaSource.Factory(factory2, ((DefaultMediaSourceFactory.DelegateFactoryLoader) delegateFactoryLoader).f18329a);
                                    }
                                }
                            };
                        }
                        supplier = supplier2;
                        map2.put(Integer.valueOf(iX), supplier);
                        if (supplier != null) {
                            delegateFactoryLoader.f18331c.add(Integer.valueOf(iX));
                        }
                    } else {
                        final Class<? extends U> clsAsSubclass = Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                        supplier2 = new Supplier() { // from class: com.google.android.exoplayer2.source.d
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                try {
                                    return (MediaSource.Factory) clsAsSubclass.getConstructor(new Class[0]).newInstance(new Object[0]);
                                } catch (Exception e2) {
                                    throw new IllegalStateException(e2);
                                }
                            }
                        };
                    }
                    supplier = supplier2;
                } catch (ClassNotFoundException unused) {
                    supplier = null;
                }
                map2.put(Integer.valueOf(iX), supplier);
                if (supplier != null) {
                    delegateFactoryLoader.f18331c.add(Integer.valueOf(iX));
                }
            }
            if (supplier == null) {
                factory = null;
            } else {
                factory = (MediaSource.Factory) supplier.get();
                map.put(Integer.valueOf(iX), factory);
            }
        }
        String strH = android.support.v4.media.a.h(iX, "No suitable media source factory found for content type: ");
        if (factory == null) {
            throw new IllegalStateException(String.valueOf(strH));
        }
        MediaItem.LiveConfiguration liveConfiguration = mediaItemA.Z;
        MediaItem.LiveConfiguration.Builder builderA = liveConfiguration.a();
        if (liveConfiguration.X == -9223372036854775807L) {
            builderA.f17108a = this.f18327c;
        }
        if (liveConfiguration.e0 == -3.4028235E38f) {
            builderA.d = this.f;
        }
        if (liveConfiguration.f0 == -3.4028235E38f) {
            builderA.f17111e = this.g;
        }
        if (liveConfiguration.f17107Y == -9223372036854775807L) {
            builderA.f17109b = this.d;
        }
        if (liveConfiguration.Z == -9223372036854775807L) {
            builderA.f17110c = this.f18328e;
        }
        MediaItem.LiveConfiguration liveConfiguration2 = new MediaItem.LiveConfiguration(builderA.f17108a, builderA.f17109b, builderA.f17110c, builderA.d, builderA.f17111e);
        if (!liveConfiguration2.equals(liveConfiguration)) {
            MediaItem.Builder builder2 = new MediaItem.Builder();
            MediaItem.ClippingConfiguration.Builder builder3 = new MediaItem.ClippingConfiguration.Builder();
            MediaItem.ClippingProperties clippingProperties = mediaItemA.f0;
            builder3.f17103a = clippingProperties.X;
            builder3.f17104b = clippingProperties.f17102Y;
            builder3.f17105c = clippingProperties.Z;
            builder3.d = clippingProperties.e0;
            builder3.f17106e = clippingProperties.f0;
            builder2.d = builder3;
            builder2.f17096a = mediaItemA.X;
            builder2.f17101i = mediaItemA.e0;
            builder2.j = liveConfiguration.a();
            builder2.k = mediaItemA.g0;
            if (playbackProperties != null) {
                builder2.g = playbackProperties.f17115e;
                builder2.f17098c = playbackProperties.f17113b;
                builder2.f17097b = playbackProperties.f17112a;
                builder2.f = playbackProperties.d;
                builder2.f17100h = playbackProperties.f;
                MediaItem.DrmConfiguration drmConfiguration = playbackProperties.f17114c;
                if (drmConfiguration != null) {
                    drmConfiguration.getClass();
                    builder = new MediaItem.DrmConfiguration.Builder();
                } else {
                    builder = new MediaItem.DrmConfiguration.Builder();
                }
                builder2.f17099e = builder;
            }
            builder2.j = liveConfiguration2.a();
            mediaItemA = builder2.a();
        }
        MediaSource mediaSourceA = factory.a(mediaItemA);
        ImmutableList immutableList = mediaItemA.f17095Y.f;
        if (!immutableList.isEmpty()) {
            MediaSource[] mediaSourceArr = new MediaSource[immutableList.size() + 1];
            mediaSourceArr[0] = mediaSourceA;
            if (immutableList.size() > 0) {
                DataSource.Factory factory3 = this.f18326b;
                new SingleSampleMediaSource((MediaItem.SubtitleConfiguration) immutableList.get(0), factory3, new SingleSampleMediaSource.Factory(factory3).f18419b);
                throw null;
            }
            mediaSourceA = new MergingMediaSource(mediaSourceArr);
        }
        MediaSource mediaSource = mediaSourceA;
        MediaItem.ClippingProperties clippingProperties2 = mediaItemA.f0;
        long j = clippingProperties2.X;
        long j2 = clippingProperties2.f17102Y;
        return (j == 0 && j2 == Long.MIN_VALUE && !clippingProperties2.e0) ? mediaSource : new ClippingMediaSource(mediaSource, Util.B(j), Util.B(j2), !clippingProperties2.f0, clippingProperties2.Z, clippingProperties2.e0);
    }
}
