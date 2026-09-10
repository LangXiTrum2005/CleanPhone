package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaItem implements Bundleable {
    public static final MediaItem h0 = new Builder().a();
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final d n0;
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final PlaybackProperties f17095Y;
    public final LiveConfiguration Z;
    public final MediaMetadata e0;
    public final ClippingProperties f0;
    public final RequestMetadata g0;

    public static final class AdsConfiguration {

        public static final class Builder {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdsConfiguration)) {
                return false;
            }
            ((AdsConfiguration) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f17096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Uri f17097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f17098c;
        public String g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public MediaMetadata f17101i;
        public LiveConfiguration.Builder j;
        public RequestMetadata k;
        public ClippingConfiguration.Builder d = new ClippingConfiguration.Builder();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public DrmConfiguration.Builder f17099e = new DrmConfiguration.Builder();
        public List f = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ImmutableList f17100h = ImmutableList.x();

        public Builder() {
            LiveConfiguration.Builder builder = new LiveConfiguration.Builder();
            builder.f17108a = -9223372036854775807L;
            builder.f17109b = -9223372036854775807L;
            builder.f17110c = -9223372036854775807L;
            builder.d = -3.4028235E38f;
            builder.f17111e = -3.4028235E38f;
            this.j = builder;
            this.k = RequestMetadata.Z;
        }

        public final MediaItem a() {
            PlaybackProperties playbackProperties;
            this.f17099e.getClass();
            Uri uri = this.f17097b;
            if (uri != null) {
                String str = this.f17098c;
                this.f17099e.getClass();
                playbackProperties = new PlaybackProperties(uri, str, null, this.f, this.g, this.f17100h);
            } else {
                playbackProperties = null;
            }
            String str2 = this.f17096a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            ClippingConfiguration.Builder builder = this.d;
            builder.getClass();
            ClippingProperties clippingProperties = new ClippingProperties(builder);
            LiveConfiguration.Builder builder2 = this.j;
            builder2.getClass();
            LiveConfiguration liveConfiguration = new LiveConfiguration(builder2.f17108a, builder2.f17109b, builder2.f17110c, builder2.d, builder2.f17111e);
            MediaMetadata mediaMetadata = this.f17101i;
            if (mediaMetadata == null) {
                mediaMetadata = MediaMetadata.J0;
            }
            return new MediaItem(str3, clippingProperties, playbackProperties, liveConfiguration, mediaMetadata, this.k);
        }
    }

    public static class ClippingConfiguration implements Bundleable {
        public static final ClippingProperties g0 = new ClippingProperties(new Builder());
        public static final String h0;
        public static final String i0;
        public static final String j0;
        public static final String k0;
        public static final String l0;
        public static final d m0;
        public final long X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final long f17102Y;
        public final boolean Z;
        public final boolean e0;
        public final boolean f0;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f17103a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f17104b = Long.MIN_VALUE;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f17105c;
            public boolean d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f17106e;
        }

        static {
            int i2 = Util.f18979a;
            h0 = Integer.toString(0, 36);
            i0 = Integer.toString(1, 36);
            j0 = Integer.toString(2, 36);
            k0 = Integer.toString(3, 36);
            l0 = Integer.toString(4, 36);
            m0 = new d(6);
        }

        public ClippingConfiguration(Builder builder) {
            this.X = builder.f17103a;
            this.f17102Y = builder.f17104b;
            this.Z = builder.f17105c;
            this.e0 = builder.d;
            this.f0 = builder.f17106e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClippingConfiguration)) {
                return false;
            }
            ClippingConfiguration clippingConfiguration = (ClippingConfiguration) obj;
            return this.X == clippingConfiguration.X && this.f17102Y == clippingConfiguration.f17102Y && this.Z == clippingConfiguration.Z && this.e0 == clippingConfiguration.e0 && this.f0 == clippingConfiguration.f0;
        }

        public final int hashCode() {
            long j = this.X;
            int i2 = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f17102Y;
            return ((((((i2 + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.Z ? 1 : 0)) * 31) + (this.e0 ? 1 : 0)) * 31) + (this.f0 ? 1 : 0);
        }
    }

    @Deprecated
    public static final class ClippingProperties extends ClippingConfiguration {
        public static final ClippingProperties n0 = new ClippingProperties(new ClippingConfiguration.Builder());
    }

    public static final class DrmConfiguration {

        public static final class Builder {
            public Builder() {
                ImmutableList.x();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrmConfiguration)) {
                return false;
            }
            ((DrmConfiguration) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public static final class LiveConfiguration implements Bundleable {
        public static final LiveConfiguration g0 = new LiveConfiguration(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
        public static final String h0;
        public static final String i0;
        public static final String j0;
        public static final String k0;
        public static final String l0;
        public static final d m0;
        public final long X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final long f17107Y;
        public final long Z;
        public final float e0;
        public final float f0;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f17108a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f17109b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f17110c;
            public float d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float f17111e;
        }

        static {
            int i2 = Util.f18979a;
            h0 = Integer.toString(0, 36);
            i0 = Integer.toString(1, 36);
            j0 = Integer.toString(2, 36);
            k0 = Integer.toString(3, 36);
            l0 = Integer.toString(4, 36);
            m0 = new d(7);
        }

        public LiveConfiguration(long j, long j2, long j3, float f, float f2) {
            this.X = j;
            this.f17107Y = j2;
            this.Z = j3;
            this.e0 = f;
            this.f0 = f2;
        }

        public final Builder a() {
            Builder builder = new Builder();
            builder.f17108a = this.X;
            builder.f17109b = this.f17107Y;
            builder.f17110c = this.Z;
            builder.d = this.e0;
            builder.f17111e = this.f0;
            return builder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveConfiguration)) {
                return false;
            }
            LiveConfiguration liveConfiguration = (LiveConfiguration) obj;
            return this.X == liveConfiguration.X && this.f17107Y == liveConfiguration.f17107Y && this.Z == liveConfiguration.Z && this.e0 == liveConfiguration.e0 && this.f0 == liveConfiguration.f0;
        }

        public final int hashCode() {
            long j = this.X;
            long j2 = this.f17107Y;
            int i2 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.Z;
            int i3 = (i2 + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.e0;
            int iFloatToIntBits = (i3 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f0;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }
    }

    public static class LocalConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f17112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f17113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DrmConfiguration f17114c;
        public final List d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f17115e;
        public final ImmutableList f;

        /* JADX WARN: Multi-variable type inference failed */
        public LocalConfiguration(Uri uri, String str, DrmConfiguration drmConfiguration, List list, String str2, ImmutableList immutableList) {
            this.f17112a = uri;
            this.f17113b = str;
            this.f17114c = drmConfiguration;
            this.d = list;
            this.f17115e = str2;
            this.f = immutableList;
            ImmutableList.Builder builderS = ImmutableList.s();
            for (int i2 = 0; i2 < immutableList.size(); i2++) {
                ((SubtitleConfiguration) immutableList.get(i2)).getClass();
                builderS.h(new Subtitle());
            }
            builderS.j();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalConfiguration)) {
                return false;
            }
            LocalConfiguration localConfiguration = (LocalConfiguration) obj;
            return this.f17112a.equals(localConfiguration.f17112a) && Util.a(this.f17113b, localConfiguration.f17113b) && Util.a(this.f17114c, localConfiguration.f17114c) && this.d.equals(localConfiguration.d) && Util.a(this.f17115e, localConfiguration.f17115e) && this.f.equals(localConfiguration.f);
        }

        public final int hashCode() {
            int iHashCode = this.f17112a.hashCode() * 31;
            String str = this.f17113b;
            int iHashCode2 = iHashCode + (str == null ? 0 : str.hashCode());
            if (this.f17114c != null) {
                throw null;
            }
            int iHashCode3 = (this.d.hashCode() + (iHashCode2 * 29791)) * 31;
            String str2 = this.f17115e;
            return (this.f.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        }
    }

    @Deprecated
    public static final class PlaybackProperties extends LocalConfiguration {
    }

    public static final class RequestMetadata implements Bundleable {
        public static final RequestMetadata Z = new RequestMetadata(new Builder());
        public static final String e0;
        public static final String f0;
        public static final String g0;
        public static final d h0;
        public final Uri X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final String f17116Y;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Uri f17117a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f17118b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Bundle f17119c;
        }

        static {
            int i2 = Util.f18979a;
            e0 = Integer.toString(0, 36);
            f0 = Integer.toString(1, 36);
            g0 = Integer.toString(2, 36);
            h0 = new d(8);
        }

        public RequestMetadata(Builder builder) {
            this.X = builder.f17117a;
            this.f17116Y = builder.f17118b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestMetadata)) {
                return false;
            }
            RequestMetadata requestMetadata = (RequestMetadata) obj;
            return Util.a(this.X, requestMetadata.X) && Util.a(this.f17116Y, requestMetadata.f17116Y);
        }

        public final int hashCode() {
            Uri uri = this.X;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f17116Y;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }
    }

    @Deprecated
    public static final class Subtitle extends SubtitleConfiguration {
    }

    public static class SubtitleConfiguration {

        public static final class Builder {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubtitleConfiguration)) {
                return false;
            }
            ((SubtitleConfiguration) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    static {
        int i2 = Util.f18979a;
        i0 = Integer.toString(0, 36);
        j0 = Integer.toString(1, 36);
        k0 = Integer.toString(2, 36);
        l0 = Integer.toString(3, 36);
        m0 = Integer.toString(4, 36);
        n0 = new d(5);
    }

    public MediaItem(String str, ClippingProperties clippingProperties, PlaybackProperties playbackProperties, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata, RequestMetadata requestMetadata) {
        this.X = str;
        this.f17095Y = playbackProperties;
        this.Z = liveConfiguration;
        this.e0 = mediaMetadata;
        this.f0 = clippingProperties;
        this.g0 = requestMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return Util.a(this.X, mediaItem.X) && this.f0.equals(mediaItem.f0) && Util.a(this.f17095Y, mediaItem.f17095Y) && Util.a(this.Z, mediaItem.Z) && Util.a(this.e0, mediaItem.e0) && Util.a(this.g0, mediaItem.g0);
    }

    public final int hashCode() {
        int iHashCode = this.X.hashCode() * 31;
        PlaybackProperties playbackProperties = this.f17095Y;
        return this.g0.hashCode() + ((this.e0.hashCode() + ((this.f0.hashCode() + ((this.Z.hashCode() + ((iHashCode + (playbackProperties != null ? playbackProperties.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
