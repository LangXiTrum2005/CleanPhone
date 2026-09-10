package androidx.media3.common;

import android.net.Uri;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MediaItem {
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalConfiguration f5438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LiveConfiguration f5439c;
    public final MediaMetadata d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ClippingProperties f5440e;
    public final RequestMetadata f;

    public static final class AdsConfiguration {

        public static final class Builder {
        }

        static {
            Util.E(0);
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
        public String f5441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Uri f5442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f5443c;
        public String g;
        public MediaMetadata j;
        public ClippingConfiguration.Builder d = new ClippingConfiguration.Builder();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public DrmConfiguration.Builder f5444e = new DrmConfiguration.Builder();
        public List f = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ImmutableList f5445h = ImmutableList.x();
        public LiveConfiguration.Builder k = new LiveConfiguration.Builder();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RequestMetadata f5447l = RequestMetadata.f5462a;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f5446i = -9223372036854775807L;

        public final MediaItem a() {
            LocalConfiguration localConfiguration;
            this.f5444e.getClass();
            Uri uri = this.f5442b;
            if (uri != null) {
                String str = this.f5443c;
                this.f5444e.getClass();
                localConfiguration = new LocalConfiguration(uri, str, null, this.f, this.g, this.f5445h, this.f5446i);
            } else {
                localConfiguration = null;
            }
            String str2 = this.f5441a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            ClippingConfiguration.Builder builder = this.d;
            builder.getClass();
            ClippingProperties clippingProperties = new ClippingProperties(builder);
            LiveConfiguration.Builder builder2 = this.k;
            builder2.getClass();
            LiveConfiguration liveConfiguration = new LiveConfiguration(builder2);
            MediaMetadata mediaMetadata = this.j;
            if (mediaMetadata == null) {
                mediaMetadata = MediaMetadata.y;
            }
            return new MediaItem(str3, clippingProperties, localConfiguration, liveConfiguration, mediaMetadata, this.f5447l);
        }
    }

    public static class ClippingConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5448a;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f5449a = Long.MIN_VALUE;
        }

        static {
            new ClippingConfiguration(new Builder());
            Util.E(0);
            Util.E(1);
            Util.E(2);
            Util.E(3);
            Util.E(4);
            Util.E(5);
            Util.E(6);
        }

        public ClippingConfiguration(Builder builder) {
            builder.getClass();
            int i2 = Util.f5683a;
            this.f5448a = builder.f5449a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClippingConfiguration)) {
                return false;
            }
            ClippingConfiguration clippingConfiguration = (ClippingConfiguration) obj;
            clippingConfiguration.getClass();
            return this.f5448a == clippingConfiguration.f5448a;
        }

        public final int hashCode() {
            long j = this.f5448a;
            return ((((int) 0) * 31) + ((int) (j ^ (j >>> 32)))) * 29791;
        }
    }

    @Deprecated
    public static final class ClippingProperties extends ClippingConfiguration {
        static {
            new ClippingProperties(new ClippingConfiguration.Builder());
        }
    }

    public static final class DrmConfiguration {

        public static final class Builder {
            public Builder() {
                ImmutableList.x();
            }
        }

        static {
            a.s(0, 1, 2, 3, 4);
            Util.E(5);
            Util.E(6);
            Util.E(7);
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

    public static final class LiveConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5452c;
        public final float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f5453e;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f5454a = -9223372036854775807L;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f5455b = -9223372036854775807L;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f5456c = -9223372036854775807L;
            public float d = -3.4028235E38f;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float f5457e = -3.4028235E38f;
        }

        static {
            new LiveConfiguration(new Builder());
            Util.E(0);
            Util.E(1);
            Util.E(2);
            Util.E(3);
            Util.E(4);
        }

        public LiveConfiguration(Builder builder) {
            long j = builder.f5454a;
            long j2 = builder.f5455b;
            long j3 = builder.f5456c;
            float f = builder.d;
            float f2 = builder.f5457e;
            this.f5450a = j;
            this.f5451b = j2;
            this.f5452c = j3;
            this.d = f;
            this.f5453e = f2;
        }

        public final Builder a() {
            Builder builder = new Builder();
            builder.f5454a = this.f5450a;
            builder.f5455b = this.f5451b;
            builder.f5456c = this.f5452c;
            builder.d = this.d;
            builder.f5457e = this.f5453e;
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
            return this.f5450a == liveConfiguration.f5450a && this.f5451b == liveConfiguration.f5451b && this.f5452c == liveConfiguration.f5452c && this.d == liveConfiguration.d && this.f5453e == liveConfiguration.f5453e;
        }

        public final int hashCode() {
            long j = this.f5450a;
            long j2 = this.f5451b;
            int i2 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f5452c;
            int i3 = (i2 + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.d;
            int iFloatToIntBits = (i3 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f5453e;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }
    }

    public static final class LocalConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f5458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DrmConfiguration f5460c;
        public final List d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f5461e;
        public final ImmutableList f;
        public final long g;

        static {
            a.s(0, 1, 2, 3, 4);
            Util.E(5);
            Util.E(6);
            Util.E(7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LocalConfiguration(Uri uri, String str, DrmConfiguration drmConfiguration, List list, String str2, ImmutableList immutableList, long j) {
            this.f5458a = uri;
            this.f5459b = MimeTypes.l(str);
            this.f5460c = drmConfiguration;
            this.d = list;
            this.f5461e = str2;
            this.f = immutableList;
            ImmutableList.Builder builderS = ImmutableList.s();
            for (int i2 = 0; i2 < immutableList.size(); i2++) {
                ((SubtitleConfiguration) immutableList.get(i2)).getClass();
                builderS.h(new Subtitle());
            }
            builderS.j();
            this.g = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalConfiguration)) {
                return false;
            }
            LocalConfiguration localConfiguration = (LocalConfiguration) obj;
            return this.f5458a.equals(localConfiguration.f5458a) && Util.a(this.f5459b, localConfiguration.f5459b) && Util.a(this.f5460c, localConfiguration.f5460c) && this.d.equals(localConfiguration.d) && Util.a(this.f5461e, localConfiguration.f5461e) && this.f.equals(localConfiguration.f) && Long.valueOf(this.g).equals(Long.valueOf(localConfiguration.g));
        }

        public final int hashCode() {
            int iHashCode = this.f5458a.hashCode() * 31;
            String str = this.f5459b;
            int iHashCode2 = iHashCode + (str == null ? 0 : str.hashCode());
            if (this.f5460c != null) {
                throw null;
            }
            int iHashCode3 = (this.d.hashCode() + (iHashCode2 * 29791)) * 31;
            String str2 = this.f5461e;
            return (int) ((((long) ((this.f.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31) + this.g);
        }
    }

    public static final class RequestMetadata {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestMetadata f5462a = new RequestMetadata();

        public static final class Builder {
        }

        static {
            Util.E(0);
            Util.E(1);
            Util.E(2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestMetadata)) {
                return false;
            }
            ((RequestMetadata) obj).getClass();
            int i2 = Util.f5683a;
            return true;
        }

        public final int hashCode() {
            return 0;
        }
    }

    @Deprecated
    public static final class Subtitle extends SubtitleConfiguration {
    }

    public static class SubtitleConfiguration {

        public static final class Builder {
        }

        static {
            a.s(0, 1, 2, 3, 4);
            Util.E(5);
            Util.E(6);
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
        new Builder().a();
        Util.E(0);
        Util.E(1);
        Util.E(2);
        Util.E(3);
        Util.E(4);
        Util.E(5);
    }

    public MediaItem(String str, ClippingProperties clippingProperties, LocalConfiguration localConfiguration, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata, RequestMetadata requestMetadata) {
        this.f5437a = str;
        this.f5438b = localConfiguration;
        this.f5439c = liveConfiguration;
        this.d = mediaMetadata;
        this.f5440e = clippingProperties;
        this.f = requestMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return Util.a(this.f5437a, mediaItem.f5437a) && this.f5440e.equals(mediaItem.f5440e) && Util.a(this.f5438b, mediaItem.f5438b) && this.f5439c.equals(mediaItem.f5439c) && Util.a(this.d, mediaItem.d) && Util.a(this.f, mediaItem.f);
    }

    public final int hashCode() {
        int iHashCode = this.f5437a.hashCode() * 31;
        LocalConfiguration localConfiguration = this.f5438b;
        int iHashCode2 = (this.d.hashCode() + ((this.f5440e.hashCode() + ((this.f5439c.hashCode() + ((iHashCode + (localConfiguration != null ? localConfiguration.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return iHashCode2;
    }
}
