package androidx.media3.common;

import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionParameters {
    public static final TrackSelectionParameters t = new TrackSelectionParameters(new Builder());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5529c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5530e;
    public final int f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImmutableList f5531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImmutableList f5532i;
    public final int j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImmutableList f5533l;
    public final AudioOffloadPreferences m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImmutableList f5534n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5535p;
    public final boolean q;
    public final ImmutableMap r;
    public final ImmutableSet s;

    public static final class AudioOffloadPreferences {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AudioOffloadPreferences f5536a = new AudioOffloadPreferences();

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface AudioOffloadMode {
        }

        public static final class Builder {
        }

        static {
            Util.E(1);
            Util.E(2);
            Util.E(3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AudioOffloadPreferences.class != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return 29791;
        }
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5537a = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5538b = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5539c = Integer.MAX_VALUE;
        public int d = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5540e = Integer.MAX_VALUE;
        public int f = Integer.MAX_VALUE;
        public boolean g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ImmutableList f5541h = ImmutableList.x();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ImmutableList f5542i = ImmutableList.x();
        public int j = Integer.MAX_VALUE;
        public int k = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ImmutableList f5543l = ImmutableList.x();
        public AudioOffloadPreferences m = AudioOffloadPreferences.f5536a;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImmutableList f5544n = ImmutableList.x();
        public int o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f5545p = 0;
        public boolean q = false;
        public HashMap r = new HashMap();
        public HashSet s = new HashSet();

        public TrackSelectionParameters a() {
            return new TrackSelectionParameters(this);
        }

        public Builder b(int i2) {
            Iterator it = this.r.values().iterator();
            while (it.hasNext()) {
                if (((TrackSelectionOverride) it.next()).f5525a.f5523c == i2) {
                    it.remove();
                }
            }
            return this;
        }

        public final void c(TrackSelectionParameters trackSelectionParameters) {
            this.f5537a = trackSelectionParameters.f5527a;
            this.f5538b = trackSelectionParameters.f5528b;
            this.f5539c = trackSelectionParameters.f5529c;
            this.d = trackSelectionParameters.d;
            this.f5540e = trackSelectionParameters.f5530e;
            this.f = trackSelectionParameters.f;
            this.g = trackSelectionParameters.g;
            this.f5541h = trackSelectionParameters.f5531h;
            this.f5542i = trackSelectionParameters.f5532i;
            this.j = trackSelectionParameters.j;
            this.k = trackSelectionParameters.k;
            this.f5543l = trackSelectionParameters.f5533l;
            this.m = trackSelectionParameters.m;
            this.f5544n = trackSelectionParameters.f5534n;
            this.o = trackSelectionParameters.o;
            this.f5545p = trackSelectionParameters.f5535p;
            this.q = trackSelectionParameters.q;
            this.s = new HashSet(trackSelectionParameters.s);
            this.r = new HashMap(trackSelectionParameters.r);
        }

        public Builder d() {
            this.f5545p = -3;
            return this;
        }

        public Builder e(TrackSelectionOverride trackSelectionOverride) {
            TrackGroup trackGroup = trackSelectionOverride.f5525a;
            b(trackGroup.f5523c);
            this.r.put(trackGroup, trackSelectionOverride);
            return this;
        }

        public Builder f(int i2) {
            this.s.remove(Integer.valueOf(i2));
            return this;
        }

        public Builder g(int i2, int i3) {
            this.f5540e = i2;
            this.f = i3;
            this.g = true;
            return this;
        }
    }

    static {
        a.s(1, 2, 3, 4, 5);
        a.s(6, 7, 8, 9, 10);
        a.s(11, 12, 13, 14, 15);
        a.s(16, 17, 18, 19, 20);
        a.s(21, 22, 23, 24, 25);
        a.s(26, 27, 28, 29, 30);
        Util.E(31);
    }

    public TrackSelectionParameters(Builder builder) {
        this.f5527a = builder.f5537a;
        this.f5528b = builder.f5538b;
        this.f5529c = builder.f5539c;
        this.d = builder.d;
        this.f5530e = builder.f5540e;
        this.f = builder.f;
        this.g = builder.g;
        this.f5531h = builder.f5541h;
        this.f5532i = builder.f5542i;
        this.j = builder.j;
        this.k = builder.k;
        this.f5533l = builder.f5543l;
        this.m = builder.m;
        this.f5534n = builder.f5544n;
        this.o = builder.o;
        this.f5535p = builder.f5545p;
        this.q = builder.q;
        this.r = ImmutableMap.e(builder.r);
        this.s = ImmutableSet.u(builder.s);
    }

    public Builder a() {
        Builder builder = new Builder();
        builder.c(this);
        return builder;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        return this.f5527a == trackSelectionParameters.f5527a && this.f5528b == trackSelectionParameters.f5528b && this.f5529c == trackSelectionParameters.f5529c && this.d == trackSelectionParameters.d && this.g == trackSelectionParameters.g && this.f5530e == trackSelectionParameters.f5530e && this.f == trackSelectionParameters.f && this.f5531h.equals(trackSelectionParameters.f5531h) && this.f5532i.equals(trackSelectionParameters.f5532i) && this.j == trackSelectionParameters.j && this.k == trackSelectionParameters.k && this.f5533l.equals(trackSelectionParameters.f5533l) && this.m.equals(trackSelectionParameters.m) && this.f5534n.equals(trackSelectionParameters.f5534n) && this.o == trackSelectionParameters.o && this.f5535p == trackSelectionParameters.f5535p && this.q == trackSelectionParameters.q && this.r.equals(trackSelectionParameters.r) && this.s.equals(trackSelectionParameters.s);
    }

    public int hashCode() {
        int iHashCode = (this.f5533l.hashCode() + ((((((this.f5532i.hashCode() + ((this.f5531h.hashCode() + ((((((((((((((this.f5527a + 31) * 31) + this.f5528b) * 31) + this.f5529c) * 31) + this.d) * 28629151) + (this.g ? 1 : 0)) * 31) + this.f5530e) * 31) + this.f) * 31)) * 961)) * 961) + this.j) * 31) + this.k) * 31)) * 31;
        this.m.getClass();
        return this.s.hashCode() + ((this.r.hashCode() + ((((((((this.f5534n.hashCode() + ((iHashCode + 29791) * 31)) * 31) + this.o) * 31) + this.f5535p) * 923521) + (this.q ? 1 : 0)) * 31)) * 31);
    }
}
