package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements ListenerSet.Event, Function, Bundleable.Creator {
    public final /* synthetic */ int X;

    public /* synthetic */ d(int i2) {
        this.X = i2;
    }

    @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return new DefaultAnalyticsCollector((Clock) obj);
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable e(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        boolean z2 = true;
        int i2 = 0;
        switch (this.X) {
            case 3:
                Format format = Format.J0;
                Format.Builder builder = new Format.Builder();
                if (bundle != null) {
                    ClassLoader classLoader = BundleableUtil.class.getClassLoader();
                    int i3 = Util.f18979a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(Format.K0);
                Format format2 = Format.J0;
                String str = format2.X;
                if (string == null) {
                    string = str;
                }
                builder.f17081a = string;
                String string2 = bundle.getString(Format.L0);
                if (string2 == null) {
                    string2 = format2.f17076Y;
                }
                builder.f17082b = string2;
                String string3 = bundle.getString(Format.M0);
                if (string3 == null) {
                    string3 = format2.Z;
                }
                builder.f17083c = string3;
                builder.d = bundle.getInt(Format.N0, format2.e0);
                builder.f17084e = bundle.getInt(Format.O0, format2.f0);
                builder.f = bundle.getInt(Format.P0, format2.g0);
                builder.g = bundle.getInt(Format.Q0, format2.h0);
                String string4 = bundle.getString(Format.R0);
                if (string4 == null) {
                    string4 = format2.j0;
                }
                builder.f17085h = string4;
                Metadata metadata = (Metadata) bundle.getParcelable(Format.S0);
                if (metadata == null) {
                    metadata = format2.k0;
                }
                builder.f17086i = metadata;
                String string5 = bundle.getString(Format.T0);
                if (string5 == null) {
                    string5 = format2.l0;
                }
                builder.j = string5;
                String string6 = bundle.getString(Format.U0);
                if (string6 == null) {
                    string6 = format2.m0;
                }
                builder.k = string6;
                builder.f17087l = bundle.getInt(Format.V0, format2.n0);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(Format.W0 + "_" + Integer.toString(i2, 36));
                    if (byteArray == null) {
                        builder.m = arrayList;
                        builder.f17088n = (DrmInitData) bundle.getParcelable(Format.X0);
                        builder.o = bundle.getLong(Format.Y0, format2.q0);
                        builder.f17089p = bundle.getInt(Format.Z0, format2.r0);
                        builder.q = bundle.getInt(Format.a1, format2.s0);
                        builder.r = bundle.getFloat(Format.b1, format2.t0);
                        builder.s = bundle.getInt(Format.c1, format2.u0);
                        builder.t = bundle.getFloat(Format.d1, format2.v0);
                        builder.f17090u = bundle.getByteArray(Format.e1);
                        builder.v = bundle.getInt(Format.f1, format2.x0);
                        Bundle bundle4 = bundle.getBundle(Format.g1);
                        if (bundle4 != null) {
                            builder.f17091w = (ColorInfo) ColorInfo.k0.e(bundle4);
                        }
                        builder.x = bundle.getInt(Format.h1, format2.z0);
                        builder.y = bundle.getInt(Format.i1, format2.A0);
                        builder.f17092z = bundle.getInt(Format.j1, format2.B0);
                        builder.f17077A = bundle.getInt(Format.k1, format2.C0);
                        builder.f17078B = bundle.getInt(Format.l1, format2.D0);
                        builder.C = bundle.getInt(Format.m1, format2.E0);
                        builder.D = bundle.getInt(Format.o1, format2.F0);
                        builder.f17079E = bundle.getInt(Format.p1, format2.G0);
                        builder.f17080F = bundle.getInt(Format.n1, format2.H0);
                        return new Format(builder);
                    }
                    arrayList.add(byteArray);
                    i2++;
                }
                break;
            case 4:
                String str2 = HeartRating.f0;
                Assertions.b(bundle.getInt(Rating.X, -1) == 0);
                return bundle.getBoolean(HeartRating.f0, false) ? new HeartRating(bundle.getBoolean(HeartRating.g0, false)) : new HeartRating();
            case 5:
                String string7 = bundle.getString(MediaItem.i0, "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(MediaItem.j0);
                MediaItem.LiveConfiguration liveConfiguration = bundle5 == null ? MediaItem.LiveConfiguration.g0 : (MediaItem.LiveConfiguration) MediaItem.LiveConfiguration.m0.e(bundle5);
                Bundle bundle6 = bundle.getBundle(MediaItem.k0);
                MediaMetadata mediaMetadata = bundle6 == null ? MediaMetadata.J0 : (MediaMetadata) MediaMetadata.r1.e(bundle6);
                Bundle bundle7 = bundle.getBundle(MediaItem.l0);
                MediaItem.ClippingProperties clippingProperties = bundle7 == null ? MediaItem.ClippingProperties.n0 : (MediaItem.ClippingProperties) MediaItem.ClippingConfiguration.m0.e(bundle7);
                Bundle bundle8 = bundle.getBundle(MediaItem.m0);
                return new MediaItem(string7, clippingProperties, null, liveConfiguration, mediaMetadata, bundle8 == null ? MediaItem.RequestMetadata.Z : (MediaItem.RequestMetadata) MediaItem.RequestMetadata.h0.e(bundle8));
            case 6:
                MediaItem.ClippingConfiguration.Builder builder2 = new MediaItem.ClippingConfiguration.Builder();
                MediaItem.ClippingProperties clippingProperties2 = MediaItem.ClippingConfiguration.g0;
                long j = bundle.getLong(MediaItem.ClippingConfiguration.h0, clippingProperties2.X);
                Assertions.b(j >= 0);
                builder2.f17103a = j;
                long j2 = bundle.getLong(MediaItem.ClippingConfiguration.i0, clippingProperties2.f17102Y);
                if (j2 != Long.MIN_VALUE && j2 < 0) {
                    z2 = false;
                }
                Assertions.b(z2);
                builder2.f17104b = j2;
                builder2.f17105c = bundle.getBoolean(MediaItem.ClippingConfiguration.j0, clippingProperties2.Z);
                builder2.d = bundle.getBoolean(MediaItem.ClippingConfiguration.k0, clippingProperties2.e0);
                builder2.f17106e = bundle.getBoolean(MediaItem.ClippingConfiguration.l0, clippingProperties2.f0);
                return new MediaItem.ClippingProperties(builder2);
            case 7:
                MediaItem.LiveConfiguration liveConfiguration2 = MediaItem.LiveConfiguration.g0;
                return new MediaItem.LiveConfiguration(bundle.getLong(MediaItem.LiveConfiguration.h0, liveConfiguration2.X), bundle.getLong(MediaItem.LiveConfiguration.i0, liveConfiguration2.f17107Y), bundle.getLong(MediaItem.LiveConfiguration.j0, liveConfiguration2.Z), bundle.getFloat(MediaItem.LiveConfiguration.k0, liveConfiguration2.e0), bundle.getFloat(MediaItem.LiveConfiguration.l0, liveConfiguration2.f0));
            case 8:
                MediaItem.RequestMetadata.Builder builder3 = new MediaItem.RequestMetadata.Builder();
                builder3.f17117a = (Uri) bundle.getParcelable(MediaItem.RequestMetadata.e0);
                builder3.f17118b = bundle.getString(MediaItem.RequestMetadata.f0);
                builder3.f17119c = bundle.getBundle(MediaItem.RequestMetadata.g0);
                return new MediaItem.RequestMetadata(builder3);
            case 9:
                MediaMetadata.Builder builder4 = new MediaMetadata.Builder();
                builder4.f17125a = bundle.getCharSequence(MediaMetadata.K0);
                builder4.f17126b = bundle.getCharSequence(MediaMetadata.L0);
                builder4.f17127c = bundle.getCharSequence(MediaMetadata.M0);
                builder4.d = bundle.getCharSequence(MediaMetadata.N0);
                builder4.f17128e = bundle.getCharSequence(MediaMetadata.O0);
                builder4.f = bundle.getCharSequence(MediaMetadata.P0);
                builder4.g = bundle.getCharSequence(MediaMetadata.Q0);
                byte[] byteArray2 = bundle.getByteArray(MediaMetadata.T0);
                String str3 = MediaMetadata.m1;
                Integer numValueOf = bundle.containsKey(str3) ? Integer.valueOf(bundle.getInt(str3)) : null;
                builder4.j = byteArray2 != null ? (byte[]) byteArray2.clone() : null;
                builder4.k = numValueOf;
                builder4.f17131l = (Uri) bundle.getParcelable(MediaMetadata.U0);
                builder4.x = bundle.getCharSequence(MediaMetadata.f1);
                builder4.y = bundle.getCharSequence(MediaMetadata.g1);
                builder4.f17136z = bundle.getCharSequence(MediaMetadata.h1);
                builder4.C = bundle.getCharSequence(MediaMetadata.k1);
                builder4.D = bundle.getCharSequence(MediaMetadata.l1);
                builder4.f17123E = bundle.getCharSequence(MediaMetadata.n1);
                builder4.G = bundle.getBundle(MediaMetadata.q1);
                String str4 = MediaMetadata.R0;
                if (bundle.containsKey(str4) && (bundle3 = bundle.getBundle(str4)) != null) {
                    builder4.f17129h = (Rating) Rating.f17195Y.e(bundle3);
                }
                String str5 = MediaMetadata.S0;
                if (bundle.containsKey(str5) && (bundle2 = bundle.getBundle(str5)) != null) {
                    builder4.f17130i = (Rating) Rating.f17195Y.e(bundle2);
                }
                String str6 = MediaMetadata.V0;
                if (bundle.containsKey(str6)) {
                    builder4.m = Integer.valueOf(bundle.getInt(str6));
                }
                String str7 = MediaMetadata.W0;
                if (bundle.containsKey(str7)) {
                    builder4.f17132n = Integer.valueOf(bundle.getInt(str7));
                }
                String str8 = MediaMetadata.X0;
                if (bundle.containsKey(str8)) {
                    builder4.o = Integer.valueOf(bundle.getInt(str8));
                }
                String str9 = MediaMetadata.p1;
                if (bundle.containsKey(str9)) {
                    builder4.f17133p = Boolean.valueOf(bundle.getBoolean(str9));
                }
                String str10 = MediaMetadata.Y0;
                if (bundle.containsKey(str10)) {
                    builder4.q = Boolean.valueOf(bundle.getBoolean(str10));
                }
                String str11 = MediaMetadata.Z0;
                if (bundle.containsKey(str11)) {
                    builder4.r = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = MediaMetadata.a1;
                if (bundle.containsKey(str12)) {
                    builder4.s = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = MediaMetadata.b1;
                if (bundle.containsKey(str13)) {
                    builder4.t = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = MediaMetadata.c1;
                if (bundle.containsKey(str14)) {
                    builder4.f17134u = Integer.valueOf(bundle.getInt(str14));
                }
                String str15 = MediaMetadata.d1;
                if (bundle.containsKey(str15)) {
                    builder4.v = Integer.valueOf(bundle.getInt(str15));
                }
                String str16 = MediaMetadata.e1;
                if (bundle.containsKey(str16)) {
                    builder4.f17135w = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = MediaMetadata.i1;
                if (bundle.containsKey(str17)) {
                    builder4.f17121A = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = MediaMetadata.j1;
                if (bundle.containsKey(str18)) {
                    builder4.f17122B = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = MediaMetadata.o1;
                if (bundle.containsKey(str19)) {
                    builder4.f17124F = Integer.valueOf(bundle.getInt(str19));
                }
                return new MediaMetadata(builder4);
            case 10:
                String str20 = PercentageRating.e0;
                Assertions.b(bundle.getInt(Rating.X, -1) == 1);
                float f = bundle.getFloat(PercentageRating.e0, -1.0f);
                return f == -1.0f ? new PercentageRating() : new PercentageRating(f);
            case 11:
                int i4 = bundle.getInt(Rating.X, -1);
                if (i4 == 0) {
                    return (Rating) HeartRating.h0.e(bundle);
                }
                if (i4 == 1) {
                    return (Rating) PercentageRating.f0.e(bundle);
                }
                if (i4 == 2) {
                    return (Rating) StarRating.h0.e(bundle);
                }
                if (i4 == 3) {
                    return (Rating) ThumbRating.h0.e(bundle);
                }
                throw new IllegalArgumentException(android.support.v4.media.a.h(i4, "Unknown RatingType: "));
            case 12:
                String str21 = StarRating.f0;
                Assertions.b(bundle.getInt(Rating.X, -1) == 2);
                int i5 = bundle.getInt(StarRating.f0, 5);
                float f2 = bundle.getFloat(StarRating.g0, -1.0f);
                return f2 == -1.0f ? new StarRating(i5) : new StarRating(i5, f2);
            case 13:
                String str22 = ThumbRating.f0;
                Assertions.b(bundle.getInt(Rating.X, -1) == 3);
                return bundle.getBoolean(ThumbRating.f0, false) ? new ThumbRating(bundle.getBoolean(ThumbRating.g0, false)) : new ThumbRating();
            case 14:
                int i6 = bundle.getInt(Timeline.Period.i0, 0);
                long j3 = bundle.getLong(Timeline.Period.j0, -9223372036854775807L);
                long j4 = bundle.getLong(Timeline.Period.k0, 0L);
                boolean z3 = bundle.getBoolean(Timeline.Period.l0, false);
                Bundle bundle9 = bundle.getBundle(Timeline.Period.m0);
                AdPlaybackState adPlaybackState = bundle9 != null ? (AdPlaybackState) AdPlaybackState.m0.e(bundle9) : AdPlaybackState.g0;
                Timeline.Period period = new Timeline.Period();
                period.g(null, null, i6, j3, j4, adPlaybackState, z3);
                return period;
            case 15:
                Bundle bundle10 = bundle.getBundle(Timeline.Window.u0);
                MediaItem mediaItem = bundle10 != null ? (MediaItem) MediaItem.n0.e(bundle10) : MediaItem.h0;
                long j5 = bundle.getLong(Timeline.Window.v0, -9223372036854775807L);
                long j6 = bundle.getLong(Timeline.Window.w0, -9223372036854775807L);
                long j7 = bundle.getLong(Timeline.Window.x0, -9223372036854775807L);
                boolean z4 = bundle.getBoolean(Timeline.Window.y0, false);
                boolean z5 = bundle.getBoolean(Timeline.Window.z0, false);
                Bundle bundle11 = bundle.getBundle(Timeline.Window.A0);
                MediaItem.LiveConfiguration liveConfiguration3 = bundle11 != null ? (MediaItem.LiveConfiguration) MediaItem.LiveConfiguration.m0.e(bundle11) : null;
                boolean z6 = bundle.getBoolean(Timeline.Window.B0, false);
                long j8 = bundle.getLong(Timeline.Window.C0, 0L);
                long j9 = bundle.getLong(Timeline.Window.D0, -9223372036854775807L);
                int i7 = bundle.getInt(Timeline.Window.E0, 0);
                int i8 = bundle.getInt(Timeline.Window.F0, 0);
                long j10 = bundle.getLong(Timeline.Window.G0, 0L);
                Timeline.Window window = new Timeline.Window();
                window.b(Timeline.Window.s0, mediaItem, j5, j6, j7, z4, z5, liveConfiguration3, j8, j9, i7, i8, j10);
                window.l0 = z6;
                return window;
            default:
                String str23 = Tracks.Group.g0;
                com.google.android.exoplayer2.source.i iVar = TrackGroup.i0;
                Bundle bundle12 = bundle.getBundle(Tracks.Group.g0);
                bundle12.getClass();
                TrackGroup trackGroup = (TrackGroup) iVar.e(bundle12);
                int[] intArray = bundle.getIntArray(Tracks.Group.h0);
                int i9 = trackGroup.X;
                return new Tracks.Group(trackGroup, bundle.getBoolean(Tracks.Group.j0, false), (int[]) MoreObjects.a(intArray, new int[i9]), (boolean[]) MoreObjects.a(bundle.getBooleanArray(Tracks.Group.i0), new boolean[i9]));
        }
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        Player.Listener listener = (Player.Listener) obj;
        switch (this.X) {
            case 0:
                int i2 = ExoPlayerImpl.f17032d0;
                listener.onPlayerError(new ExoPlaybackException(2, new ExoTimeoutException("Player release timed out."), 1003));
                break;
            default:
                listener.onRenderedFirstFrame();
                break;
        }
    }
}
