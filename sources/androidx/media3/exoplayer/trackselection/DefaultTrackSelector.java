package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.audio.i;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.p004ironsource.d9;
import com.p004ironsource.f9;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class DefaultTrackSelector extends MappingTrackSelector implements RendererCapabilities.Listener {
    public static final Ordering j = Ordering.b(new b(7));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6510c;
    public final Context d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AdaptiveTrackSelection.Factory f6511e;
    public final boolean f;
    public Parameters g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SpatializerWrapperV32 f6512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AudioAttributes f6513i;

    public static final class AudioTrackInfo extends TrackInfo<AudioTrackInfo> implements Comparable<AudioTrackInfo> {
        public final int f0;
        public final boolean g0;
        public final String h0;
        public final Parameters i0;
        public final boolean j0;
        public final int k0;
        public final int l0;
        public final int m0;
        public final boolean n0;
        public final boolean o0;
        public final int p0;
        public final int q0;
        public final boolean r0;
        public final int s0;
        public final int t0;
        public final int u0;
        public final int v0;
        public final boolean w0;
        public final boolean x0;

        /* JADX WARN: Multi-variable type inference failed */
        public AudioTrackInfo(int i2, TrackGroup trackGroup, int i3, Parameters parameters, int i4, boolean z2, e eVar, int i5) {
            int i6;
            int iK;
            String[] strArrSplit;
            int iK2;
            boolean z3;
            super(i2, trackGroup, i3);
            this.i0 = parameters;
            int i7 = parameters.x ? 24 : 16;
            int i8 = 0;
            this.n0 = false;
            this.h0 = DefaultTrackSelector.m(this.e0.d);
            this.j0 = RendererCapabilities.g(i4, false);
            int i9 = 0;
            while (true) {
                ImmutableList immutableList = parameters.f5532i;
                i6 = Integer.MAX_VALUE;
                if (i9 >= immutableList.size()) {
                    iK = 0;
                    i9 = Integer.MAX_VALUE;
                    break;
                } else {
                    iK = DefaultTrackSelector.k(this.e0, (String) immutableList.get(i9), false);
                    if (iK > 0) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.l0 = i9;
            this.k0 = iK;
            int i10 = this.e0.f;
            this.m0 = (i10 == 0 || i10 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
            Format format = this.e0;
            int i11 = format.f;
            this.o0 = i11 == 0 || (i11 & 1) != 0;
            this.r0 = (format.f5409e & 1) != 0;
            int i12 = format.f5400A;
            this.s0 = i12;
            this.t0 = format.f5401B;
            int i13 = format.f5411i;
            this.u0 = i13;
            this.g0 = (i13 == -1 || i13 <= parameters.k) && (i12 == -1 || i12 <= parameters.j) && eVar.apply(format);
            Configuration configuration = Resources.getSystem().getConfiguration();
            int i14 = Util.f5683a;
            if (i14 >= 24) {
                strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
            } else {
                Locale locale = configuration.locale;
                strArrSplit = new String[]{i14 >= 21 ? locale.toLanguageTag() : locale.toString()};
            }
            for (int i15 = 0; i15 < strArrSplit.length; i15++) {
                strArrSplit[i15] = Util.J(strArrSplit[i15]);
            }
            int i16 = 0;
            while (true) {
                if (i16 >= strArrSplit.length) {
                    iK2 = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                } else {
                    iK2 = DefaultTrackSelector.k(this.e0, strArrSplit[i16], false);
                    if (iK2 > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.p0 = i16;
            this.q0 = iK2;
            int i17 = 0;
            while (true) {
                ImmutableList immutableList2 = parameters.f5533l;
                if (i17 >= immutableList2.size()) {
                    break;
                }
                String str = this.e0.m;
                if (str != null && str.equals(immutableList2.get(i17))) {
                    i6 = i17;
                    break;
                }
                i17++;
            }
            this.v0 = i6;
            this.w0 = (i4 & 384) == 128;
            this.x0 = (i4 & 64) == 64;
            Parameters parameters2 = this.i0;
            if (RendererCapabilities.g(i4, parameters2.f6519z) && ((z3 = this.g0) || parameters2.f6518w)) {
                parameters2.m.getClass();
                i8 = (!RendererCapabilities.g(i4, false) || !z3 || this.e0.f5411i == -1 || parameters2.q || (!parameters2.f6515A && z2) || (i7 & i4) == 0) ? 1 : 2;
            }
            this.f0 = i8;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final int a() {
            return this.f0;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final boolean b(TrackInfo trackInfo) {
            int i2;
            String str;
            AudioTrackInfo audioTrackInfo = (AudioTrackInfo) trackInfo;
            this.i0.getClass();
            Format format = this.e0;
            int i3 = format.f5400A;
            if (i3 == -1) {
                return false;
            }
            Format format2 = audioTrackInfo.e0;
            if (i3 != format2.f5400A) {
                return false;
            }
            if ((this.n0 || ((str = format.m) != null && TextUtils.equals(str, format2.m))) && (i2 = format.f5401B) != -1 && i2 == format2.f5401B) {
                return this.w0 == audioTrackInfo.w0 && this.x0 == audioTrackInfo.x0;
            }
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final int compareTo(AudioTrackInfo audioTrackInfo) {
            boolean z2 = this.j0;
            boolean z3 = this.g0;
            Ordering orderingJ = (z3 && z2) ? DefaultTrackSelector.j : DefaultTrackSelector.j.j();
            ComparisonChain comparisonChainC = ComparisonChain.f19806a.d(z2, audioTrackInfo.j0).c(Integer.valueOf(this.l0), Integer.valueOf(audioTrackInfo.l0), Ordering.d().j()).a(this.k0, audioTrackInfo.k0).a(this.m0, audioTrackInfo.m0).d(this.r0, audioTrackInfo.r0).d(this.o0, audioTrackInfo.o0).c(Integer.valueOf(this.p0), Integer.valueOf(audioTrackInfo.p0), Ordering.d().j()).a(this.q0, audioTrackInfo.q0).d(z3, audioTrackInfo.g0).c(Integer.valueOf(this.v0), Integer.valueOf(audioTrackInfo.v0), Ordering.d().j());
            this.i0.getClass();
            ComparisonChain comparisonChainC2 = comparisonChainC.d(this.w0, audioTrackInfo.w0).d(this.x0, audioTrackInfo.x0).c(Integer.valueOf(this.s0), Integer.valueOf(audioTrackInfo.s0), orderingJ).c(Integer.valueOf(this.t0), Integer.valueOf(audioTrackInfo.t0), orderingJ);
            if (Util.a(this.h0, audioTrackInfo.h0)) {
                comparisonChainC2 = comparisonChainC2.c(Integer.valueOf(this.u0), Integer.valueOf(audioTrackInfo.u0), orderingJ);
            }
            return comparisonChainC2.f();
        }
    }

    public static final class ImageTrackInfo extends TrackInfo<ImageTrackInfo> implements Comparable<ImageTrackInfo> {
        public final int f0;
        public final int g0;

        public ImageTrackInfo(int i2, TrackGroup trackGroup, int i3, Parameters parameters, int i4) {
            int i5;
            super(i2, trackGroup, i3);
            this.f0 = RendererCapabilities.g(i4, parameters.f6519z) ? 1 : 0;
            Format format = this.e0;
            int i6 = format.s;
            int i7 = -1;
            if (i6 != -1 && (i5 = format.t) != -1) {
                i7 = i6 * i5;
            }
            this.g0 = i7;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final int a() {
            return this.f0;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final /* bridge */ /* synthetic */ boolean b(TrackInfo trackInfo) {
            return false;
        }

        @Override // java.lang.Comparable
        public final int compareTo(ImageTrackInfo imageTrackInfo) {
            return Integer.compare(this.g0, imageTrackInfo.g0);
        }
    }

    public static final class OtherTrackScore implements Comparable<OtherTrackScore> {
        public final boolean X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final boolean f6514Y;

        public OtherTrackScore(Format format, int i2) {
            this.X = (format.f5409e & 1) != 0;
            this.f6514Y = RendererCapabilities.g(i2, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(OtherTrackScore otherTrackScore) {
            OtherTrackScore otherTrackScore2 = otherTrackScore;
            return ComparisonChain.f19806a.d(this.f6514Y, otherTrackScore2.f6514Y).d(this.X, otherTrackScore2.X).f();
        }
    }

    @Deprecated
    public static final class ParametersBuilder extends TrackSelectionParameters.Builder {
        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public final TrackSelectionParameters a() {
            throw null;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public final TrackSelectionParameters.Builder b(int i2) {
            throw null;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public final TrackSelectionParameters.Builder d() {
            throw null;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public final TrackSelectionParameters.Builder e(TrackSelectionOverride trackSelectionOverride) {
            throw null;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public final TrackSelectionParameters.Builder f(int i2) {
            throw null;
        }
    }

    public static final class SelectionOverride {
        static {
            Util.E(0);
            Util.E(1);
            Util.E(2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SelectionOverride.class == obj.getClass()) {
                if (Arrays.equals((int[]) null, (int[]) null)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode((int[]) null) * 31;
        }
    }

    public static class SpatializerWrapperV32 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Spatializer f6525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f6527c;
        public Spatializer$OnSpatializerStateChangedListener d;

        public SpatializerWrapperV32(Spatializer spatializer) {
            this.f6525a = spatializer;
            this.f6526b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public final boolean a(AudioAttributes audioAttributes, Format format) {
            boolean zEquals = "audio/eac3-joc".equals(format.m);
            int i2 = format.f5400A;
            if (zEquals && i2 == 16) {
                i2 = 12;
            }
            int iQ = Util.q(i2);
            if (iQ == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iQ);
            int i3 = format.f5401B;
            if (i3 != -1) {
                channelMask.setSampleRate(i3);
            }
            return this.f6525a.canBeSpatialized(audioAttributes.a().f5376a, channelMask.build());
        }
    }

    public static final class TextTrackInfo extends TrackInfo<TextTrackInfo> implements Comparable<TextTrackInfo> {
        public final int f0;
        public final boolean g0;
        public final boolean h0;
        public final boolean i0;
        public final int j0;
        public final int k0;
        public final int l0;
        public final int m0;
        public final boolean n0;

        /* JADX WARN: Multi-variable type inference failed */
        public TextTrackInfo(int i2, TrackGroup trackGroup, int i3, Parameters parameters, int i4, String str) {
            int iK;
            super(i2, trackGroup, i3);
            int i5 = 0;
            this.g0 = RendererCapabilities.g(i4, false);
            int i6 = this.e0.f5409e & (~parameters.f5535p);
            this.h0 = (i6 & 1) != 0;
            this.i0 = (i6 & 2) != 0;
            ImmutableList immutableList = parameters.f5534n;
            ImmutableList immutableListZ = immutableList.isEmpty() ? ImmutableList.z("") : immutableList;
            int i7 = 0;
            while (true) {
                if (i7 >= immutableListZ.size()) {
                    iK = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                } else {
                    iK = DefaultTrackSelector.k(this.e0, (String) immutableListZ.get(i7), false);
                    if (iK > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.j0 = i7;
            this.k0 = iK;
            int i8 = this.e0.f;
            Ordering ordering = DefaultTrackSelector.j;
            int i9 = parameters.o;
            int iBitCount = (i8 == 0 || i8 != i9) ? Integer.bitCount(i8 & i9) : Integer.MAX_VALUE;
            this.l0 = iBitCount;
            this.n0 = (this.e0.f & 1088) != 0;
            int iK2 = DefaultTrackSelector.k(this.e0, str, DefaultTrackSelector.m(str) == null);
            this.m0 = iK2;
            boolean z2 = iK > 0 || (immutableList.isEmpty() && iBitCount > 0) || this.h0 || (this.i0 && iK2 > 0);
            if (RendererCapabilities.g(i4, parameters.f6519z) && z2) {
                i5 = 1;
            }
            this.f0 = i5;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final int a() {
            return this.f0;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final /* bridge */ /* synthetic */ boolean b(TrackInfo trackInfo) {
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final int compareTo(TextTrackInfo textTrackInfo) {
            ComparisonChain comparisonChainC = ComparisonChain.f19806a.d(this.g0, textTrackInfo.g0).c(Integer.valueOf(this.j0), Integer.valueOf(textTrackInfo.j0), Ordering.d().j());
            int i2 = this.k0;
            ComparisonChain comparisonChainA = comparisonChainC.a(i2, textTrackInfo.k0);
            int i3 = this.l0;
            ComparisonChain comparisonChainA2 = comparisonChainA.a(i3, textTrackInfo.l0).d(this.h0, textTrackInfo.h0).c(Boolean.valueOf(this.i0), Boolean.valueOf(textTrackInfo.i0), i2 == 0 ? Ordering.d() : Ordering.d().j()).a(this.m0, textTrackInfo.m0);
            if (i3 == 0) {
                comparisonChainA2 = comparisonChainA2.e(this.n0, textTrackInfo.n0);
            }
            return comparisonChainA2.f();
        }
    }

    public static abstract class TrackInfo<T extends TrackInfo<T>> {
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final TrackGroup f6529Y;
        public final int Z;
        public final Format e0;

        public interface Factory<T extends TrackInfo<T>> {
            List a(int i2, TrackGroup trackGroup, int[] iArr);
        }

        public TrackInfo(int i2, TrackGroup trackGroup, int i3) {
            this.X = i2;
            this.f6529Y = trackGroup;
            this.Z = i3;
            this.e0 = trackGroup.d[i3];
        }

        public abstract int a();

        public abstract boolean b(TrackInfo trackInfo);
    }

    public static final class VideoTrackInfo extends TrackInfo<VideoTrackInfo> {
        public final boolean f0;
        public final Parameters g0;
        public final boolean h0;
        public final boolean i0;
        public final boolean j0;
        public final int k0;
        public final int l0;
        public final int m0;
        public final int n0;
        public final boolean o0;
        public final boolean p0;
        public final int q0;
        public final boolean r0;
        public final boolean s0;
        public final int t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Code duplicated, block: B:112:0x0137  */
        /* JADX WARN: Code duplicated, block: B:119:0x0148  */
        /* JADX WARN: Code duplicated, block: B:25:0x0045  */
        /* JADX WARN: Code duplicated, block: B:42:0x006b  */
        public VideoTrackInfo(int i2, TrackGroup trackGroup, int i3, Parameters parameters, int i4, int i5, boolean z2) {
            boolean z3;
            boolean z4;
            boolean z5;
            int i6;
            Format format;
            int i7;
            int i8;
            int i9;
            Format format2;
            int i10;
            int i11;
            int i12;
            super(i2, trackGroup, i3);
            int i13 = 4;
            int i14 = 2;
            this.g0 = parameters;
            int i15 = parameters.v ? 24 : 16;
            this.p0 = false;
            if (!z2 || (((i10 = (format2 = this.e0).s) != -1 && i10 > parameters.f5527a) || ((i11 = format2.t) != -1 && i11 > parameters.f5528b))) {
                z3 = false;
            } else {
                float f = format2.f5415u;
                if ((f == -1.0f || f <= parameters.f5529c) && ((i12 = format2.f5411i) == -1 || i12 <= parameters.d)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            this.f0 = z3;
            if (!z2 || (((i7 = (format = this.e0).s) != -1 && i7 < 0) || ((i8 = format.t) != -1 && i8 < 0))) {
                z4 = false;
            } else {
                float f2 = format.f5415u;
                if ((f2 == -1.0f || f2 >= 0) && ((i9 = format.f5411i) == -1 || i9 >= 0)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            this.h0 = z4;
            this.i0 = RendererCapabilities.g(i4, false);
            Format format3 = this.e0;
            float f3 = format3.f5415u;
            this.j0 = f3 != -1.0f && f3 >= 10.0f;
            this.k0 = format3.f5411i;
            int i16 = format3.s;
            this.l0 = (i16 == -1 || (i6 = format3.t) == -1) ? -1 : i16 * i6;
            int i17 = format3.f;
            Ordering ordering = DefaultTrackSelector.j;
            int i18 = Integer.MAX_VALUE;
            this.n0 = (i17 == 0 || i17 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
            int i19 = this.e0.f;
            this.o0 = i19 == 0 || (i19 & 1) != 0;
            int i20 = 0;
            while (true) {
                ImmutableList immutableList = parameters.f5531h;
                if (i20 < immutableList.size()) {
                    String str = this.e0.m;
                    if (str != null && str.equals(immutableList.get(i20))) {
                        i18 = i20;
                        break;
                    }
                    i20++;
                } else {
                    break;
                }
            }
            this.m0 = i18;
            this.r0 = (i4 & 384) == 128;
            this.s0 = (i4 & 64) == 64;
            Format format4 = this.e0;
            String str2 = format4.m;
            if (str2 != null) {
                switch (str2) {
                    case "video/dolby-vision":
                        i13 = 5;
                        break;
                    case "video/av01":
                        break;
                    case "video/hevc":
                        i13 = 3;
                        break;
                    case "video/avc":
                        i13 = 1;
                        break;
                    case "video/x-vnd.on2.vp9":
                        i13 = 2;
                        break;
                    default:
                        i13 = 0;
                        break;
                }
            } else {
                i13 = 0;
            }
            this.t0 = i13;
            if ((format4.f & 16384) != 0) {
                i14 = 0;
            } else {
                Parameters parameters2 = this.g0;
                if (!RendererCapabilities.g(i4, parameters2.f6519z) || (!(z5 = this.f0) && !parameters2.f6517u)) {
                    i14 = 0;
                } else if (!RendererCapabilities.g(i4, false) || !this.h0 || !z5 || format4.f5411i == -1 || parameters2.q || (i15 & i4) == 0) {
                    i14 = 1;
                }
            }
            this.q0 = i14;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final int a() {
            return this.q0;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final boolean b(TrackInfo trackInfo) {
            VideoTrackInfo videoTrackInfo = (VideoTrackInfo) trackInfo;
            if (!this.p0 && !Util.a(this.e0.m, videoTrackInfo.e0.m)) {
                return false;
            }
            this.g0.getClass();
            return this.r0 == videoTrackInfo.r0 && this.s0 == videoTrackInfo.s0;
        }
    }

    public DefaultTrackSelector(Context context) {
        AdaptiveTrackSelection.Factory factory = new AdaptiveTrackSelection.Factory();
        Parameters parameters = Parameters.D;
        Parameters parameters2 = new Parameters(new Parameters.Builder(context));
        this.f6510c = new Object();
        this.d = context.getApplicationContext();
        this.f6511e = factory;
        this.g = parameters2;
        this.f6513i = AudioAttributes.f5374b;
        boolean zH = Util.H(context);
        this.f = zH;
        if (!zH && Util.f5683a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.f6512h = audioManager == null ? null : new SpatializerWrapperV32(audioManager.getSpatializer());
        }
        boolean z2 = this.g.y;
    }

    public static void j(TrackGroupArray trackGroupArray, TrackSelectionParameters trackSelectionParameters, HashMap map) {
        for (int i2 = 0; i2 < trackGroupArray.f6463a; i2++) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) trackSelectionParameters.r.get(trackGroupArray.a(i2));
            if (trackSelectionOverride != null) {
                TrackGroup trackGroup = trackSelectionOverride.f5525a;
                TrackSelectionOverride trackSelectionOverride2 = (TrackSelectionOverride) map.get(Integer.valueOf(trackGroup.f5523c));
                if (trackSelectionOverride2 == null || (trackSelectionOverride2.f5526b.isEmpty() && !trackSelectionOverride.f5526b.isEmpty())) {
                    map.put(Integer.valueOf(trackGroup.f5523c), trackSelectionOverride);
                }
            }
        }
    }

    public static int k(Format format, String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && str.equals(format.d)) {
            return 4;
        }
        String strM = m(str);
        String strM2 = m(format.d);
        if (strM2 == null || strM == null) {
            return (z2 && strM2 == null) ? 1 : 0;
        }
        if (strM2.startsWith(strM) || strM.startsWith(strM2)) {
            return 3;
        }
        int i2 = Util.f5683a;
        return strM2.split(TokenBuilder.TOKEN_DELIMITER, 2)[0].equals(strM.split(TokenBuilder.TOKEN_DELIMITER, 2)[0]) ? 2 : 0;
    }

    public static String m(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair n(int i2, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, TrackInfo.Factory factory, Comparator comparator) {
        RandomAccess randomAccessZ;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < mappedTrackInfo.f6532a; i3++) {
            if (i2 == mappedTrackInfo.f6533b[i3]) {
                TrackGroupArray trackGroupArray = mappedTrackInfo.f6534c[i3];
                for (int i4 = 0; i4 < trackGroupArray.f6463a; i4++) {
                    TrackGroup trackGroupA = trackGroupArray.a(i4);
                    List listA = factory.a(i3, trackGroupA, iArr[i3][i4]);
                    int i5 = trackGroupA.f5521a;
                    boolean[] zArr = new boolean[i5];
                    for (int i6 = 0; i6 < i5; i6++) {
                        TrackInfo trackInfo = (TrackInfo) listA.get(i6);
                        int iA = trackInfo.a();
                        if (!zArr[i6] && iA != 0) {
                            boolean z2 = true;
                            if (iA == 1) {
                                randomAccessZ = ImmutableList.z(trackInfo);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(trackInfo);
                                int i7 = i6 + 1;
                                while (i7 < i5) {
                                    boolean z3 = z2;
                                    TrackInfo trackInfo2 = (TrackInfo) listA.get(i7);
                                    if (trackInfo2.a() == 2 && trackInfo.b(trackInfo2)) {
                                        arrayList2.add(trackInfo2);
                                        zArr[i7] = z3;
                                    }
                                    i7++;
                                    z2 = z3;
                                }
                                randomAccessZ = arrayList2;
                            }
                            arrayList.add(randomAccessZ);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((TrackInfo) list.get(i8)).Z;
        }
        TrackInfo trackInfo3 = (TrackInfo) list.get(0);
        return Pair.create(new ExoTrackSelection.Definition(trackInfo3.f6529Y, iArr2), Integer.valueOf(trackInfo3.X));
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities.Listener
    public final void a(Renderer renderer) {
        synchronized (this.f6510c) {
            this.g.getClass();
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final TrackSelectionParameters b() {
        Parameters parameters;
        synchronized (this.f6510c) {
            parameters = this.g;
        }
        return parameters;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final RendererCapabilities.Listener c() {
        return this;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final void e() {
        SpatializerWrapperV32 spatializerWrapperV32;
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        synchronized (this.f6510c) {
            try {
                if (Util.f5683a >= 32 && (spatializerWrapperV32 = this.f6512h) != null && (spatializer$OnSpatializerStateChangedListener = spatializerWrapperV32.d) != null && spatializerWrapperV32.f6527c != null) {
                    spatializerWrapperV32.f6525a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
                    spatializerWrapperV32.f6527c.removeCallbacksAndMessages(null);
                    spatializerWrapperV32.f6527c = null;
                    spatializerWrapperV32.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.e();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final void g(AudioAttributes audioAttributes) {
        boolean zEquals;
        synchronized (this.f6510c) {
            zEquals = this.f6513i.equals(audioAttributes);
            this.f6513i = audioAttributes;
        }
        if (zEquals) {
            return;
        }
        l();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final void h(TrackSelectionParameters trackSelectionParameters) {
        Parameters parameters;
        if (trackSelectionParameters instanceof Parameters) {
            o((Parameters) trackSelectionParameters);
        }
        synchronized (this.f6510c) {
            parameters = this.g;
        }
        Parameters.Builder builder = new Parameters.Builder(parameters);
        builder.c(trackSelectionParameters);
        o(new Parameters(builder));
    }

    /* JADX WARN: Code duplicated, block: B:199:0x0414  */
    /* JADX WARN: Code duplicated, block: B:95:0x020e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.trackselection.MappingTrackSelector
    public final Pair i(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
        final Parameters parameters;
        Pair pairN;
        TrackGroupArray[] trackGroupArrayArr;
        int[] iArr3;
        int i2;
        final boolean z2;
        final String str;
        TrackGroupArray[] trackGroupArrayArr2;
        int i3;
        BandwidthMeter bandwidthMeter;
        ExoTrackSelection adaptiveTrackSelection;
        int[] iArr4;
        int i4;
        long[][] jArr;
        int i5;
        BandwidthMeter bandwidthMeter2;
        ExoTrackSelection.Definition definition;
        int i6;
        int i7;
        TrackGroupArray trackGroupArray;
        SpatializerWrapperV32 spatializerWrapperV32;
        int[][][] iArr5 = iArr;
        synchronized (this.f6510c) {
            try {
                parameters = this.g;
                if (parameters.y && Util.f5683a >= 32 && (spatializerWrapperV32 = this.f6512h) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    Assertions.f(looperMyLooper);
                    if (spatializerWrapperV32.d == null && spatializerWrapperV32.f6527c == null) {
                        spatializerWrapperV32.d = new Spatializer$OnSpatializerStateChangedListener() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SpatializerWrapperV32.1
                            public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z3) {
                                DefaultTrackSelector defaultTrackSelector = this.f6528a;
                                Ordering ordering = DefaultTrackSelector.j;
                                defaultTrackSelector.l();
                            }

                            public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z3) {
                                DefaultTrackSelector defaultTrackSelector = this.f6528a;
                                Ordering ordering = DefaultTrackSelector.j;
                                defaultTrackSelector.l();
                            }
                        };
                        Handler handler = new Handler(looperMyLooper);
                        spatializerWrapperV32.f6527c = handler;
                        spatializerWrapperV32.f6525a.addOnSpatializerStateChangedListener(new i(handler), spatializerWrapperV32.d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i8 = mappedTrackInfo.f6532a;
        ExoTrackSelection.Definition[] definitionArr = new ExoTrackSelection.Definition[i8];
        parameters.m.getClass();
        final int i9 = 0;
        int i10 = 2;
        Pair pairN2 = n(2, mappedTrackInfo, iArr5, new TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.d
            /* JADX WARN: Code duplicated, block: B:32:0x006b  */
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List a(int i11, TrackGroup trackGroup, int[] iArr6) {
                boolean z3;
                int i12;
                int i13;
                int i14;
                boolean z4;
                int i15;
                int i16;
                int i17;
                TrackGroup trackGroup2 = trackGroup;
                Object obj = iArr2;
                boolean z5 = true;
                switch (i9) {
                    case 0:
                        Ordering ordering = DefaultTrackSelector.j;
                        int i18 = ((int[]) obj)[i11];
                        DefaultTrackSelector.Parameters parameters2 = parameters;
                        int i19 = parameters2.f5530e;
                        if (i19 == Integer.MAX_VALUE || (i14 = parameters2.f) == Integer.MAX_VALUE) {
                            z3 = true;
                            i12 = Integer.MAX_VALUE;
                        } else {
                            int i20 = Integer.MAX_VALUE;
                            int i21 = 0;
                            while (i21 < trackGroup2.f5521a) {
                                Format format = trackGroup2.d[i21];
                                int i22 = format.s;
                                if (i22 <= 0 || (i15 = format.t) <= 0) {
                                    z4 = z5;
                                } else {
                                    if (!parameters2.g) {
                                        i16 = i19;
                                        i17 = i14;
                                    } else if ((i22 > i15 ? z5 : false) != (i19 > i14 ? z5 : false)) {
                                        i17 = i19;
                                        i16 = i14;
                                    } else {
                                        i16 = i19;
                                        i17 = i14;
                                    }
                                    int i23 = i22 * i17;
                                    z4 = z5;
                                    int i24 = i15 * i16;
                                    Point point = i23 >= i24 ? new Point(i16, Util.f(i24, i22)) : new Point(Util.f(i23, i15), i17);
                                    int i25 = format.s;
                                    int i26 = i25 * i15;
                                    if (i25 >= ((int) (point.x * 0.98f)) && i15 >= ((int) (point.y * 0.98f)) && i26 < i20) {
                                        i20 = i26;
                                    }
                                }
                                i21++;
                                z5 = z4;
                            }
                            z3 = z5;
                            i12 = i20;
                        }
                        ImmutableList.Builder builderS = ImmutableList.s();
                        int i27 = 0;
                        while (i27 < trackGroup2.f5521a) {
                            Format format2 = trackGroup2.d[i27];
                            int i28 = format2.s;
                            int i29 = (i28 == -1 || (i13 = format2.t) == -1) ? -1 : i28 * i13;
                            builderS.h(new DefaultTrackSelector.VideoTrackInfo(i11, trackGroup2, i27, parameters2, iArr6[i27], i18, (i12 == Integer.MAX_VALUE || (i29 != -1 && i29 <= i12)) ? z3 : false));
                            i27++;
                            trackGroup2 = trackGroup;
                        }
                        return builderS.j();
                    default:
                        Ordering ordering2 = DefaultTrackSelector.j;
                        ImmutableList.Builder builderS2 = ImmutableList.s();
                        for (int i30 = 0; i30 < trackGroup2.f5521a; i30++) {
                            builderS2.h(new DefaultTrackSelector.TextTrackInfo(i11, trackGroup2, i30, parameters, iArr6[i30], (String) obj));
                        }
                        return builderS2.j();
                }
            }
        }, new b(2));
        TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences = parameters.m;
        int i11 = 4;
        if (pairN2 == null) {
            audioOffloadPreferences.getClass();
            pairN = n(4, mappedTrackInfo, iArr5, new TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.a
                @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
                public final List a(int i12, TrackGroup trackGroup, int[] iArr6) {
                    Ordering ordering = DefaultTrackSelector.j;
                    ImmutableList.Builder builderS = ImmutableList.s();
                    for (int i13 = 0; i13 < trackGroup.f5521a; i13++) {
                        builderS.h(new DefaultTrackSelector.ImageTrackInfo(i12, trackGroup, i13, parameters, iArr6[i13]));
                    }
                    return builderS.j();
                }
            }, new b(0));
        } else {
            pairN = null;
        }
        if (pairN != null) {
            definitionArr[((Integer) pairN.second).intValue()] = (ExoTrackSelection.Definition) pairN.first;
        } else if (pairN2 != null) {
            definitionArr[((Integer) pairN2.second).intValue()] = (ExoTrackSelection.Definition) pairN2.first;
        }
        int i12 = 0;
        while (true) {
            trackGroupArrayArr = mappedTrackInfo.f6534c;
            iArr3 = mappedTrackInfo.f6533b;
            i2 = 1;
            if (i12 >= mappedTrackInfo.f6532a) {
                z2 = false;
                break;
            }
            if (2 == iArr3[i12] && trackGroupArrayArr[i12].f6463a > 0) {
                z2 = true;
                break;
            }
            i12++;
        }
        Pair pairN3 = n(1, mappedTrackInfo, iArr5, new TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.c
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List a(int i13, TrackGroup trackGroup, int[] iArr6) {
                Ordering ordering = DefaultTrackSelector.j;
                DefaultTrackSelector defaultTrackSelector = this.f6544a;
                defaultTrackSelector.getClass();
                e eVar = new e(defaultTrackSelector);
                int i14 = iArr2[i13];
                ImmutableList.Builder builderS = ImmutableList.s();
                for (int i15 = 0; i15 < trackGroup.f5521a; i15++) {
                    builderS.h(new DefaultTrackSelector.AudioTrackInfo(i13, trackGroup, i15, parameters, iArr6[i15], z2, eVar, i14));
                }
                return builderS.j();
            }
        }, new b(1));
        if (pairN3 != null) {
            definitionArr[((Integer) pairN3.second).intValue()] = (ExoTrackSelection.Definition) pairN3.first;
        }
        if (pairN3 == null) {
            str = null;
        } else {
            ExoTrackSelection.Definition definition2 = (ExoTrackSelection.Definition) pairN3.first;
            str = definition2.f6530a.d[definition2.f6531b[0]].d;
        }
        audioOffloadPreferences.getClass();
        final int i13 = 1;
        int i14 = 3;
        Pair pairN4 = n(3, mappedTrackInfo, iArr5, new TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.d
            /* JADX WARN: Code duplicated, block: B:32:0x006b  */
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List a(int i15, TrackGroup trackGroup, int[] iArr6) {
                boolean z3;
                int i16;
                int i17;
                int i18;
                boolean z4;
                int i19;
                int i110;
                int i111;
                TrackGroup trackGroup2 = trackGroup;
                Object obj = str;
                boolean z5 = true;
                switch (i13) {
                    case 0:
                        Ordering ordering = DefaultTrackSelector.j;
                        int i112 = ((int[]) obj)[i15];
                        DefaultTrackSelector.Parameters parameters2 = parameters;
                        int i113 = parameters2.f5530e;
                        if (i113 == Integer.MAX_VALUE || (i18 = parameters2.f) == Integer.MAX_VALUE) {
                            z3 = true;
                            i16 = Integer.MAX_VALUE;
                        } else {
                            int i20 = Integer.MAX_VALUE;
                            int i21 = 0;
                            while (i21 < trackGroup2.f5521a) {
                                Format format = trackGroup2.d[i21];
                                int i22 = format.s;
                                if (i22 <= 0 || (i19 = format.t) <= 0) {
                                    z4 = z5;
                                } else {
                                    if (!parameters2.g) {
                                        i110 = i113;
                                        i111 = i18;
                                    } else if ((i22 > i19 ? z5 : false) != (i113 > i18 ? z5 : false)) {
                                        i111 = i113;
                                        i110 = i18;
                                    } else {
                                        i110 = i113;
                                        i111 = i18;
                                    }
                                    int i23 = i22 * i111;
                                    z4 = z5;
                                    int i24 = i19 * i110;
                                    Point point = i23 >= i24 ? new Point(i110, Util.f(i24, i22)) : new Point(Util.f(i23, i19), i111);
                                    int i25 = format.s;
                                    int i26 = i25 * i19;
                                    if (i25 >= ((int) (point.x * 0.98f)) && i19 >= ((int) (point.y * 0.98f)) && i26 < i20) {
                                        i20 = i26;
                                    }
                                }
                                i21++;
                                z5 = z4;
                            }
                            z3 = z5;
                            i16 = i20;
                        }
                        ImmutableList.Builder builderS = ImmutableList.s();
                        int i27 = 0;
                        while (i27 < trackGroup2.f5521a) {
                            Format format2 = trackGroup2.d[i27];
                            int i28 = format2.s;
                            int i29 = (i28 == -1 || (i17 = format2.t) == -1) ? -1 : i28 * i17;
                            builderS.h(new DefaultTrackSelector.VideoTrackInfo(i15, trackGroup2, i27, parameters2, iArr6[i27], i112, (i16 == Integer.MAX_VALUE || (i29 != -1 && i29 <= i16)) ? z3 : false));
                            i27++;
                            trackGroup2 = trackGroup;
                        }
                        return builderS.j();
                    default:
                        Ordering ordering2 = DefaultTrackSelector.j;
                        ImmutableList.Builder builderS2 = ImmutableList.s();
                        for (int i30 = 0; i30 < trackGroup2.f5521a; i30++) {
                            builderS2.h(new DefaultTrackSelector.TextTrackInfo(i15, trackGroup2, i30, parameters, iArr6[i30], (String) obj));
                        }
                        return builderS2.j();
                }
            }
        }, new b(3));
        if (pairN4 != null) {
            definitionArr[((Integer) pairN4.second).intValue()] = (ExoTrackSelection.Definition) pairN4.first;
        }
        int i15 = 0;
        while (i15 < i8) {
            int i16 = iArr3[i15];
            if (i16 == i10 || i16 == i2 || i16 == i14 || i16 == i11) {
                i6 = i15;
            } else {
                TrackGroupArray trackGroupArray2 = trackGroupArrayArr[i15];
                int[][] iArr6 = iArr5[i15];
                int i17 = 0;
                int i18 = 0;
                TrackGroup trackGroup = null;
                OtherTrackScore otherTrackScore = null;
                while (i17 < trackGroupArray2.f6463a) {
                    TrackGroup trackGroupA = trackGroupArray2.a(i17);
                    int[] iArr7 = iArr6[i17];
                    int i19 = 0;
                    OtherTrackScore otherTrackScore2 = otherTrackScore;
                    while (i19 < trackGroupA.f5521a) {
                        int i20 = i15;
                        if (RendererCapabilities.g(iArr7[i19], parameters.f6519z)) {
                            i7 = i17;
                            OtherTrackScore otherTrackScore3 = new OtherTrackScore(trackGroupA.d[i19], iArr7[i19]);
                            if (otherTrackScore2 != null) {
                                trackGroupArray = trackGroupArray2;
                                if (ComparisonChain.f19806a.d(otherTrackScore3.f6514Y, otherTrackScore2.f6514Y).d(otherTrackScore3.X, otherTrackScore2.X).f() > 0) {
                                }
                            } else {
                                trackGroupArray = trackGroupArray2;
                            }
                            otherTrackScore2 = otherTrackScore3;
                            trackGroup = trackGroupA;
                            i18 = i19;
                        } else {
                            i7 = i17;
                            trackGroupArray = trackGroupArray2;
                        }
                        i19++;
                        i15 = i20;
                        i17 = i7;
                        trackGroupArray2 = trackGroupArray;
                    }
                    i17++;
                    otherTrackScore = otherTrackScore2;
                }
                i6 = i15;
                definitionArr[i6] = trackGroup == null ? null : new ExoTrackSelection.Definition(trackGroup, new int[]{i18});
            }
            i15 = i6 + 1;
            iArr5 = iArr;
            i2 = 1;
            i10 = 2;
            i11 = 4;
            i14 = 3;
        }
        int i21 = mappedTrackInfo.f6532a;
        HashMap map = new HashMap();
        int i22 = 0;
        while (true) {
            trackGroupArrayArr2 = mappedTrackInfo.f6534c;
            if (i22 >= i21) {
                break;
            }
            j(trackGroupArrayArr2[i22], parameters, map);
            i22++;
        }
        j(mappedTrackInfo.f, parameters, map);
        for (int i23 = 0; i23 < i21; i23++) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) map.get(Integer.valueOf(mappedTrackInfo.f6533b[i23]));
            if (trackSelectionOverride != null) {
                ImmutableList immutableList = trackSelectionOverride.f5526b;
                if (immutableList.isEmpty()) {
                    definition = null;
                } else {
                    TrackGroupArray trackGroupArray3 = trackGroupArrayArr2[i23];
                    TrackGroup trackGroup2 = trackSelectionOverride.f5525a;
                    int iIndexOf = trackGroupArray3.f6464b.indexOf(trackGroup2);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        definition = new ExoTrackSelection.Definition(trackGroup2, Ints.f(immutableList));
                    } else {
                        definition = null;
                    }
                }
                definitionArr[i23] = definition;
            }
        }
        int i24 = mappedTrackInfo.f6532a;
        for (int i25 = 0; i25 < i24; i25++) {
            TrackGroupArray trackGroupArray4 = mappedTrackInfo.f6534c[i25];
            Map map2 = (Map) parameters.f6516B.get(i25);
            if (map2 != null && map2.containsKey(trackGroupArray4)) {
                Map map3 = (Map) parameters.f6516B.get(i25);
                if ((map3 != null ? (SelectionOverride) map3.get(trackGroupArray4) : null) != null) {
                    throw null;
                }
                definitionArr[i25] = null;
            }
        }
        for (int i26 = 0; i26 < i8; i26++) {
            int i27 = mappedTrackInfo.f6533b[i26];
            if (parameters.C.get(i26) || parameters.s.contains(Integer.valueOf(i27))) {
                definitionArr[i26] = null;
            }
        }
        AdaptiveTrackSelection.Factory factory = this.f6511e;
        BandwidthMeter bandwidthMeter3 = this.f6538b;
        Assertions.f(bandwidthMeter3);
        factory.getClass();
        ArrayList arrayList = new ArrayList();
        int i28 = 0;
        for (ExoTrackSelection.Definition definition3 : definitionArr) {
            if (definition3 == null || definition3.f6531b.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.Builder builderS = ImmutableList.s();
                builderS.h(new AdaptiveTrackSelection.AdaptationCheckpoint(0L, 0L));
                arrayList.add(builderS);
            }
        }
        int length = definitionArr.length;
        long[][] jArr2 = new long[length][];
        int i29 = 0;
        while (i29 < definitionArr.length) {
            ExoTrackSelection.Definition definition4 = definitionArr[i29];
            if (definition4 == null) {
                jArr2[i29] = new long[i28];
                i5 = i28;
                bandwidthMeter2 = bandwidthMeter3;
            } else {
                i5 = i28;
                int[] iArr8 = definition4.f6531b;
                jArr2[i29] = new long[iArr8.length];
                int i30 = i5;
                while (i30 < iArr8.length) {
                    BandwidthMeter bandwidthMeter4 = bandwidthMeter3;
                    long j2 = definition4.f6530a.d[iArr8[i30]].f5411i;
                    long[] jArr3 = jArr2[i29];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr3[i30] = j2;
                    i30++;
                    bandwidthMeter3 = bandwidthMeter4;
                }
                bandwidthMeter2 = bandwidthMeter3;
                Arrays.sort(jArr2[i29]);
            }
            i29++;
            i28 = i5;
            bandwidthMeter3 = bandwidthMeter2;
        }
        int i31 = i28;
        BandwidthMeter bandwidthMeter5 = bandwidthMeter3;
        int[] iArr9 = new int[length];
        long[] jArr4 = new long[length];
        for (int i32 = i31; i32 < length; i32++) {
            long[] jArr5 = jArr2[i32];
            jArr4[i32] = jArr5.length == 0 ? 0L : jArr5[i31];
        }
        AdaptiveTrackSelection.d(arrayList, jArr4);
        ListMultimap listMultimapC = MultimapBuilder.b().a().c();
        int i33 = i31;
        while (i33 < length) {
            long[] jArr6 = jArr2[i33];
            if (jArr6.length <= 1) {
                iArr4 = iArr9;
                i4 = length;
                jArr = jArr2;
            } else {
                int length2 = jArr6.length;
                double[] dArr = new double[length2];
                int i34 = i31;
                while (true) {
                    long[] jArr7 = jArr2[i33];
                    iArr4 = iArr9;
                    double dLog = 0.0d;
                    if (i34 >= jArr7.length) {
                        break;
                    }
                    int i35 = length;
                    long[][] jArr8 = jArr2;
                    long j3 = jArr7[i34];
                    if (j3 != -1) {
                        dLog = Math.log(j3);
                    }
                    dArr[i34] = dLog;
                    i34++;
                    length = i35;
                    iArr9 = iArr4;
                    jArr2 = jArr8;
                }
                i4 = length;
                jArr = jArr2;
                int i36 = length2 - 1;
                double d = dArr[i36] - dArr[i31];
                int i37 = i31;
                while (i37 < i36) {
                    double d2 = dArr[i37];
                    int i38 = i37 + 1;
                    listMultimapC.put(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i38]) * 0.5d) - dArr[i31]) / d), Integer.valueOf(i33));
                    i37 = i38;
                }
            }
            i33++;
            length = i4;
            iArr9 = iArr4;
            jArr2 = jArr;
        }
        int[] iArr10 = iArr9;
        long[][] jArr9 = jArr2;
        ImmutableList immutableListU = ImmutableList.u(listMultimapC.values());
        for (int i39 = i31; i39 < immutableListU.size(); i39++) {
            int iIntValue = ((Integer) immutableListU.get(i39)).intValue();
            int i40 = iArr10[iIntValue] + 1;
            iArr10[iIntValue] = i40;
            jArr4[iIntValue] = jArr9[iIntValue][i40];
            AdaptiveTrackSelection.d(arrayList, jArr4);
        }
        for (int i41 = i31; i41 < definitionArr.length; i41++) {
            if (arrayList.get(i41) != null) {
                jArr4[i41] = jArr4[i41] * 2;
            }
        }
        AdaptiveTrackSelection.d(arrayList, jArr4);
        ImmutableList.Builder builderS2 = ImmutableList.s();
        for (int i42 = i31; i42 < arrayList.size(); i42++) {
            ImmutableList.Builder builder = (ImmutableList.Builder) arrayList.get(i42);
            builderS2.h(builder == null ? ImmutableList.x() : builder.j());
        }
        ImmutableList immutableListJ = builderS2.j();
        ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
        char c2 = 0;
        int i43 = 0;
        while (i43 < definitionArr.length) {
            ExoTrackSelection.Definition definition5 = definitionArr[i43];
            if (definition5 != null) {
                int[] iArr11 = definition5.f6531b;
                if (iArr11.length == 0) {
                    i8 = i8;
                    i3 = i43;
                    bandwidthMeter = bandwidthMeter5;
                } else {
                    if (iArr11.length == 1) {
                        int i44 = iArr11[c2];
                        i3 = i43;
                        adaptiveTrackSelection = new FixedTrackSelection(definition5.f6530a, new int[]{i44});
                        bandwidthMeter = bandwidthMeter5;
                    } else {
                        i3 = i43;
                        bandwidthMeter = bandwidthMeter5;
                        adaptiveTrackSelection = new AdaptiveTrackSelection(definition5.f6530a, iArr11, bandwidthMeter, 10000, 25000, (ImmutableList) immutableListJ.get(i43));
                    }
                    exoTrackSelectionArr[i3] = adaptiveTrackSelection;
                }
            } else {
                i8 = i8;
                i3 = i43;
                bandwidthMeter = bandwidthMeter5;
            }
            i43 = i3 + 1;
            bandwidthMeter5 = bandwidthMeter;
            i8 = i8;
            c2 = 0;
        }
        int i45 = i8;
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[i45];
        for (int i46 = 0; i46 < i45; i46++) {
            rendererConfigurationArr[i46] = (parameters.C.get(i46) || parameters.s.contains(Integer.valueOf(mappedTrackInfo.f6533b[i46])) || (mappedTrackInfo.f6533b[i46] != -2 && exoTrackSelectionArr[i46] == null)) ? null : RendererConfiguration.f5981c;
        }
        parameters.m.getClass();
        return Pair.create(rendererConfigurationArr, exoTrackSelectionArr);
    }

    public final void l() {
        boolean z2;
        TrackSelector.InvalidationListener invalidationListener;
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.f6510c) {
            try {
                z2 = this.g.y && !this.f && Util.f5683a >= 32 && (spatializerWrapperV32 = this.f6512h) != null && spatializerWrapperV32.f6526b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2 || (invalidationListener = this.f6537a) == null) {
            return;
        }
        invalidationListener.onTrackSelectionsInvalidated();
    }

    public final void o(Parameters parameters) {
        boolean zEquals;
        parameters.getClass();
        synchronized (this.f6510c) {
            zEquals = this.g.equals(parameters);
            this.g = parameters;
        }
        if (zEquals) {
            return;
        }
        if (parameters.y && this.d == null) {
            Log.g("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        TrackSelector.InvalidationListener invalidationListener = this.f6537a;
        if (invalidationListener != null) {
            invalidationListener.onTrackSelectionsInvalidated();
        }
    }

    public static final class Parameters extends TrackSelectionParameters {
        public static final Parameters D = new Parameters(new Builder());

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public final boolean f6515A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public final SparseArray f6516B;
        public final SparseBooleanArray C;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f6517u;
        public final boolean v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f6518w;
        public final boolean x;
        public final boolean y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final boolean f6519z;

        static {
            androidx.datastore.preferences.protobuf.a.s(1000, 1001, 1002, 1003, 1004);
            androidx.datastore.preferences.protobuf.a.s(1005, 1006, 1007, 1008, 1009);
            androidx.datastore.preferences.protobuf.a.s(1010, 1011, TTAdConstant.IMAGE_MODE_1012, f9.f24992i, f9.j);
            Util.E(1015);
            Util.E(f9.f24993l);
            Util.E(1017);
            Util.E(1018);
        }

        public Parameters(Builder builder) {
            super(builder);
            this.f6517u = builder.t;
            this.v = builder.f6522u;
            this.f6518w = builder.v;
            this.x = builder.f6523w;
            this.y = builder.x;
            this.f6519z = builder.y;
            this.f6515A = builder.f6524z;
            this.f6516B = builder.f6520A;
            this.C = builder.f6521B;
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public final TrackSelectionParameters.Builder a() {
            return new Builder(this);
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Parameters.class == obj.getClass()) {
                Parameters parameters = (Parameters) obj;
                if (super.equals(parameters) && this.f6517u == parameters.f6517u && this.v == parameters.v && this.f6518w == parameters.f6518w && this.x == parameters.x && this.y == parameters.y && this.f6519z == parameters.f6519z && this.f6515A == parameters.f6515A) {
                    SparseBooleanArray sparseBooleanArray = this.C;
                    int size = sparseBooleanArray.size();
                    SparseBooleanArray sparseBooleanArray2 = parameters.C;
                    if (sparseBooleanArray2.size() == size) {
                        for (int i2 = 0; i2 < size; i2++) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) >= 0) {
                            }
                        }
                        SparseArray sparseArray = this.f6516B;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = parameters.f6516B;
                        if (sparseArray2.size() == size2) {
                            for (int i3 = 0; i3 < size2; i3++) {
                                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i3));
                                if (iIndexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i3);
                                    Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            TrackGroupArray trackGroupArray = (TrackGroupArray) entry.getKey();
                                            if (!map2.containsKey(trackGroupArray) || !Util.a(entry.getValue(), map2.get(trackGroupArray))) {
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public final int hashCode() {
            return (((((((((((((((super.hashCode() + 31) * 31) + (this.f6517u ? 1 : 0)) * 961) + (this.v ? 1 : 0)) * 961) + (this.f6518w ? 1 : 0)) * 28629151) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31) + (this.f6519z ? 1 : 0)) * 961) + (this.f6515A ? 1 : 0)) * 31;
        }

        public static final class Builder extends TrackSelectionParameters.Builder {

            /* JADX INFO: renamed from: A, reason: collision with root package name */
            public final SparseArray f6520A;

            /* JADX INFO: renamed from: B, reason: collision with root package name */
            public final SparseBooleanArray f6521B;
            public boolean t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public boolean f6522u;
            public boolean v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public boolean f6523w;
            public boolean x;
            public boolean y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public boolean f6524z;

            /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
            /* JADX WARN: Code duplicated, block: B:53:0x00ee  */
            /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
            public Builder(Context context) {
                CaptioningManager captioningManager;
                Point point;
                Point point2;
                int i2 = Util.f5683a;
                if ((i2 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                    this.o = 1088;
                    Locale locale = captioningManager.getLocale();
                    if (locale != null) {
                        this.f5544n = ImmutableList.z(i2 >= 21 ? locale.toLanguageTag() : locale.toString());
                    }
                }
                DisplayManager displayManager = (DisplayManager) context.getSystemService(d9.h.d);
                Display display = displayManager != null ? displayManager.getDisplay(0) : null;
                if (display == null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.getClass();
                    display = windowManager.getDefaultDisplay();
                }
                if (display.getDisplayId() == 0 && Util.H(context)) {
                    String strZ = i2 < 28 ? Util.z("sys.display-size") : Util.z("vendor.display-size");
                    if (!TextUtils.isEmpty(strZ)) {
                        try {
                            String[] strArrSplit = strZ.trim().split("x", -1);
                            if (strArrSplit.length == 2) {
                                int i3 = Integer.parseInt(strArrSplit[0]);
                                int i4 = Integer.parseInt(strArrSplit[1]);
                                if (i3 > 0 && i4 > 0) {
                                    point2 = new Point(i3, i4);
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                        Log.c("Util", "Invalid display size: " + strZ);
                    }
                    if ("Sony".equals(Util.f5685c) && Util.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                        point = new Point(3840, 2160);
                    } else {
                        point = new Point();
                        if (i2 >= 23) {
                            Display.Mode mode = display.getMode();
                            point.x = mode.getPhysicalWidth();
                            point.y = mode.getPhysicalHeight();
                        } else {
                            display.getRealSize(point);
                        }
                    }
                    point2 = point;
                } else {
                    point = new Point();
                    if (i2 >= 23) {
                        Display.Mode mode2 = display.getMode();
                        point.x = mode2.getPhysicalWidth();
                        point.y = mode2.getPhysicalHeight();
                    } else {
                        display.getRealSize(point);
                    }
                    point2 = point;
                }
                g(point2.x, point2.y);
                this.f6520A = new SparseArray();
                this.f6521B = new SparseBooleanArray();
                h();
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters a() {
                return new Parameters(this);
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder b(int i2) {
                super.b(i2);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder d() {
                this.f5545p = -3;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder e(TrackSelectionOverride trackSelectionOverride) {
                super.e(trackSelectionOverride);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder f(int i2) {
                super.f(i2);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder g(int i2, int i3) {
                super.g(i2, i3);
                return this;
            }

            public final void h() {
                this.t = true;
                this.f6522u = true;
                this.v = true;
                this.f6523w = true;
                this.x = true;
                this.y = true;
                this.f6524z = true;
            }

            public Builder(Parameters parameters) {
                c(parameters);
                this.t = parameters.f6517u;
                this.f6522u = parameters.v;
                this.v = parameters.f6518w;
                this.f6523w = parameters.x;
                this.x = parameters.y;
                this.y = parameters.f6519z;
                this.f6524z = parameters.f6515A;
                SparseArray sparseArray = new SparseArray();
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray2 = parameters.f6516B;
                    if (i2 < sparseArray2.size()) {
                        sparseArray.put(sparseArray2.keyAt(i2), new HashMap((Map) sparseArray2.valueAt(i2)));
                        i2++;
                    } else {
                        this.f6520A = sparseArray;
                        this.f6521B = parameters.C.clone();
                        return;
                    }
                }
            }

            public Builder() {
                this.f6520A = new SparseArray();
                this.f6521B = new SparseBooleanArray();
                h();
            }
        }
    }
}
