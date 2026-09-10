package com.google.android.exoplayer2.trackselection;

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
import androidx.media3.exoplayer.audio.i;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
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
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTrackSelector extends MappingTrackSelector {
    public static final Ordering j = Ordering.b(new b(6));
    public static final Ordering k = Ordering.b(new b(7));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18668c;
    public final Context d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AdaptiveTrackSelection.Factory f18669e;
    public final boolean f;
    public final Parameters g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SpatializerWrapperV32 f18670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AudioAttributes f18671i;

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
        public final int o0;
        public final int p0;
        public final boolean q0;
        public final int r0;
        public final int s0;
        public final int t0;
        public final int u0;
        public final boolean v0;
        public final boolean w0;

        /* JADX WARN: Multi-variable type inference failed */
        public AudioTrackInfo(int i2, TrackGroup trackGroup, int i3, Parameters parameters, int i4, boolean z2, d dVar) {
            int i5;
            int iG;
            String[] strArrSplit;
            int iG2;
            boolean z3;
            super(i2, trackGroup, i3);
            this.i0 = parameters;
            this.h0 = DefaultTrackSelector.j(this.e0.Z);
            int i6 = 0;
            this.j0 = DefaultTrackSelector.h(i4, false);
            int i7 = 0;
            while (true) {
                i5 = Integer.MAX_VALUE;
                if (i7 >= parameters.o0.size()) {
                    iG = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                } else {
                    iG = DefaultTrackSelector.g(this.e0, (String) parameters.o0.get(i7), false);
                    if (iG > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.l0 = i7;
            this.k0 = iG;
            int i8 = this.e0.f0;
            int i9 = parameters.p0;
            this.m0 = (i8 == 0 || i8 != i9) ? Integer.bitCount(i8 & i9) : Integer.MAX_VALUE;
            Format format = this.e0;
            int i10 = format.f0;
            this.n0 = i10 == 0 || (i10 & 1) != 0;
            this.q0 = (format.e0 & 1) != 0;
            int i11 = format.z0;
            this.r0 = i11;
            this.s0 = format.A0;
            int i12 = format.i0;
            this.t0 = i12;
            this.g0 = (i12 == -1 || i12 <= parameters.r0) && (i11 == -1 || i11 <= parameters.q0) && dVar.apply(format);
            Configuration configuration = Resources.getSystem().getConfiguration();
            int i13 = Util.f18979a;
            if (i13 >= 24) {
                strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
            } else {
                Locale locale = configuration.locale;
                strArrSplit = new String[]{i13 >= 21 ? locale.toLanguageTag() : locale.toString()};
            }
            for (int i14 = 0; i14 < strArrSplit.length; i14++) {
                strArrSplit[i14] = Util.C(strArrSplit[i14]);
            }
            int i15 = 0;
            while (true) {
                if (i15 >= strArrSplit.length) {
                    iG2 = 0;
                    i15 = Integer.MAX_VALUE;
                    break;
                } else {
                    iG2 = DefaultTrackSelector.g(this.e0, strArrSplit[i15], false);
                    if (iG2 > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.o0 = i15;
            this.p0 = iG2;
            int i16 = 0;
            while (true) {
                ImmutableList immutableList = parameters.s0;
                if (i16 >= immutableList.size()) {
                    break;
                }
                String str = this.e0.m0;
                if (str != null && str.equals(immutableList.get(i16))) {
                    i5 = i16;
                    break;
                }
                i16++;
            }
            this.u0 = i5;
            this.v0 = (i4 & 384) == 128;
            this.w0 = (i4 & 64) == 64;
            Parameters parameters2 = this.i0;
            if (DefaultTrackSelector.h(i4, parameters2.L0) && ((z3 = this.g0) || parameters2.F0)) {
                i6 = (!DefaultTrackSelector.h(i4, false) || !z3 || this.e0.i0 == -1 || parameters2.y0 || parameters2.x0 || (!parameters2.N0 && z2)) ? 1 : 2;
            }
            this.f0 = i6;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public final int a() {
            return this.f0;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public final boolean b(TrackInfo trackInfo) {
            int i2;
            String str;
            int i3;
            AudioTrackInfo audioTrackInfo = (AudioTrackInfo) trackInfo;
            Parameters parameters = this.i0;
            boolean z2 = parameters.I0;
            Format format = audioTrackInfo.e0;
            Format format2 = this.e0;
            if (!z2 && ((i3 = format2.z0) == -1 || i3 != format.z0)) {
                return false;
            }
            if (!parameters.G0 && ((str = format2.m0) == null || !TextUtils.equals(str, format.m0))) {
                return false;
            }
            if (!parameters.H0 && ((i2 = format2.A0) == -1 || i2 != format.A0)) {
                return false;
            }
            if (parameters.J0) {
                return true;
            }
            return this.v0 == audioTrackInfo.v0 && this.w0 == audioTrackInfo.w0;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final int compareTo(AudioTrackInfo audioTrackInfo) {
            boolean z2 = this.j0;
            boolean z3 = this.g0;
            Ordering orderingJ = (z3 && z2) ? DefaultTrackSelector.j : DefaultTrackSelector.j.j();
            ComparisonChain comparisonChainC = ComparisonChain.f19806a.d(z2, audioTrackInfo.j0).c(Integer.valueOf(this.l0), Integer.valueOf(audioTrackInfo.l0), Ordering.d().j()).a(this.k0, audioTrackInfo.k0).a(this.m0, audioTrackInfo.m0).d(this.q0, audioTrackInfo.q0).d(this.n0, audioTrackInfo.n0).c(Integer.valueOf(this.o0), Integer.valueOf(audioTrackInfo.o0), Ordering.d().j()).a(this.p0, audioTrackInfo.p0).d(z3, audioTrackInfo.g0).c(Integer.valueOf(this.u0), Integer.valueOf(audioTrackInfo.u0), Ordering.d().j());
            int i2 = this.t0;
            Integer numValueOf = Integer.valueOf(i2);
            int i3 = audioTrackInfo.t0;
            ComparisonChain comparisonChainC2 = comparisonChainC.c(numValueOf, Integer.valueOf(i3), this.i0.x0 ? DefaultTrackSelector.j.j() : DefaultTrackSelector.k).d(this.v0, audioTrackInfo.v0).d(this.w0, audioTrackInfo.w0).c(Integer.valueOf(this.r0), Integer.valueOf(audioTrackInfo.r0), orderingJ).c(Integer.valueOf(this.s0), Integer.valueOf(audioTrackInfo.s0), orderingJ);
            Integer numValueOf2 = Integer.valueOf(i2);
            Integer numValueOf3 = Integer.valueOf(i3);
            if (!Util.a(this.h0, audioTrackInfo.h0)) {
                orderingJ = DefaultTrackSelector.k;
            }
            return comparisonChainC2.c(numValueOf2, numValueOf3, orderingJ).f();
        }
    }

    public static final class OtherTrackScore implements Comparable<OtherTrackScore> {
        public final boolean X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final boolean f18672Y;

        public OtherTrackScore(Format format, int i2) {
            this.X = (format.e0 & 1) != 0;
            this.f18672Y = DefaultTrackSelector.h(i2, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(OtherTrackScore otherTrackScore) {
            OtherTrackScore otherTrackScore2 = otherTrackScore;
            return ComparisonChain.f19806a.d(this.f18672Y, otherTrackScore2.f18672Y).d(this.X, otherTrackScore2.X).f();
        }
    }

    @Deprecated
    public static final class ParametersBuilder extends TrackSelectionParameters.Builder {
    }

    public static final class SelectionOverride implements Bundleable {
        public static final String e0;
        public static final String f0;
        public static final String g0;
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int[] f18680Y;
        public final int Z;

        static {
            int i2 = Util.f18979a;
            e0 = Integer.toString(0, 36);
            f0 = Integer.toString(1, 36);
            g0 = Integer.toString(2, 36);
        }

        public SelectionOverride(int i2, int i3, int[] iArr) {
            this.X = i2;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f18680Y = iArrCopyOf;
            this.Z = i3;
            Arrays.sort(iArrCopyOf);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SelectionOverride.class == obj.getClass()) {
                SelectionOverride selectionOverride = (SelectionOverride) obj;
                if (this.X == selectionOverride.X && Arrays.equals(this.f18680Y, selectionOverride.f18680Y) && this.Z == selectionOverride.Z) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f18680Y) + (this.X * 31)) * 31) + this.Z;
        }
    }

    public static class SpatializerWrapperV32 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Spatializer f18681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f18683c;
        public Spatializer$OnSpatializerStateChangedListener d;

        public SpatializerWrapperV32(Spatializer spatializer) {
            this.f18681a = spatializer;
            this.f18682b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public final boolean a(Format format, AudioAttributes audioAttributes) {
            boolean zEquals = "audio/eac3-joc".equals(format.m0);
            int i2 = format.z0;
            if (zEquals && i2 == 16) {
                i2 = 12;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(Util.n(i2));
            int i3 = format.A0;
            if (i3 != -1) {
                channelMask.setSampleRate(i3);
            }
            return this.f18681a.canBeSpatialized(audioAttributes.a().f17280a, channelMask.build());
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
            int iG;
            super(i2, trackGroup, i3);
            int i5 = 0;
            this.g0 = DefaultTrackSelector.h(i4, false);
            int i6 = this.e0.e0 & (~parameters.v0);
            this.h0 = (i6 & 1) != 0;
            this.i0 = (i6 & 2) != 0;
            ImmutableList immutableList = parameters.t0;
            ImmutableList immutableListZ = immutableList.isEmpty() ? ImmutableList.z("") : immutableList;
            int i7 = 0;
            while (true) {
                if (i7 >= immutableListZ.size()) {
                    iG = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                } else {
                    iG = DefaultTrackSelector.g(this.e0, (String) immutableListZ.get(i7), parameters.w0);
                    if (iG > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.j0 = i7;
            this.k0 = iG;
            int i8 = this.e0.f0;
            int i9 = parameters.u0;
            int iBitCount = (i8 == 0 || i8 != i9) ? Integer.bitCount(i8 & i9) : Integer.MAX_VALUE;
            this.l0 = iBitCount;
            this.n0 = (this.e0.f0 & 1088) != 0;
            int iG2 = DefaultTrackSelector.g(this.e0, str, DefaultTrackSelector.j(str) == null);
            this.m0 = iG2;
            boolean z2 = iG > 0 || (immutableList.isEmpty() && iBitCount > 0) || this.h0 || (this.i0 && iG2 > 0);
            if (DefaultTrackSelector.h(i4, parameters.L0) && z2) {
                i5 = 1;
            }
            this.f0 = i5;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public final int a() {
            return this.f0;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
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
        public final TrackGroup f18685Y;
        public final int Z;
        public final Format e0;

        public interface Factory<T extends TrackInfo<T>> {
            List a(int i2, TrackGroup trackGroup, int[] iArr);
        }

        public TrackInfo(int i2, TrackGroup trackGroup, int i3) {
            this.X = i2;
            this.f18685Y = trackGroup;
            this.Z = i3;
            this.e0 = trackGroup.e0[i3];
        }

        public abstract int a();

        public abstract boolean b(TrackInfo trackInfo);
    }

    public static final class VideoTrackInfo extends TrackInfo<VideoTrackInfo> {
        public final boolean f0;
        public final Parameters g0;
        public final boolean h0;
        public final boolean i0;
        public final int j0;
        public final int k0;
        public final int l0;
        public final int m0;
        public final boolean n0;
        public final boolean o0;
        public final int p0;
        public final boolean q0;
        public final boolean r0;
        public final int s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Code duplicated, block: B:115:0x013a  */
        /* JADX WARN: Code duplicated, block: B:122:0x014b  */
        /* JADX WARN: Code duplicated, block: B:31:0x0050  */
        /* JADX WARN: Code duplicated, block: B:51:0x007e  */
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
            int i15 = parameters.D0 ? 24 : 16;
            this.o0 = parameters.C0 && (i5 & i15) != 0;
            if (!z2 || (((i10 = (format2 = this.e0).r0) != -1 && i10 > parameters.X) || ((i11 = format2.s0) != -1 && i11 > parameters.f18694Y))) {
                z3 = false;
            } else {
                float f = format2.t0;
                if ((f == -1.0f || f <= parameters.Z) && ((i12 = format2.i0) == -1 || i12 <= parameters.e0)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            this.f0 = z3;
            if (!z2 || (((i7 = (format = this.e0).r0) != -1 && i7 < parameters.f0) || ((i8 = format.s0) != -1 && i8 < parameters.g0))) {
                z4 = false;
            } else {
                float f2 = format.t0;
                if ((f2 == -1.0f || f2 >= parameters.h0) && ((i9 = format.i0) == -1 || i9 >= parameters.i0)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            this.h0 = z4;
            this.i0 = DefaultTrackSelector.h(i4, false);
            Format format3 = this.e0;
            this.j0 = format3.i0;
            int i16 = format3.r0;
            this.k0 = (i16 == -1 || (i6 = format3.s0) == -1) ? -1 : i16 * i6;
            int i17 = format3.f0;
            int i18 = Integer.MAX_VALUE;
            int i19 = parameters.n0;
            this.m0 = (i17 == 0 || i17 != i19) ? Integer.bitCount(i17 & i19) : Integer.MAX_VALUE;
            int i20 = this.e0.f0;
            this.n0 = i20 == 0 || (i20 & 1) != 0;
            int i21 = 0;
            while (true) {
                ImmutableList immutableList = parameters.m0;
                if (i21 < immutableList.size()) {
                    String str = this.e0.m0;
                    if (str != null && str.equals(immutableList.get(i21))) {
                        i18 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.l0 = i18;
            this.q0 = (i4 & 384) == 128;
            this.r0 = (i4 & 64) == 64;
            Format format4 = this.e0;
            String str2 = format4.m0;
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
            this.s0 = i13;
            if ((format4.f0 & 16384) != 0) {
                i14 = 0;
            } else {
                Parameters parameters2 = this.g0;
                if (!DefaultTrackSelector.h(i4, parameters2.L0) || (!(z5 = this.f0) && !parameters2.B0)) {
                    i14 = 0;
                } else if (!DefaultTrackSelector.h(i4, false) || !this.h0 || !z5 || format4.i0 == -1 || parameters2.y0 || parameters2.x0 || (i15 & i4) == 0) {
                    i14 = 1;
                }
            }
            this.p0 = i14;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public final int a() {
            return this.p0;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public final boolean b(TrackInfo trackInfo) {
            VideoTrackInfo videoTrackInfo = (VideoTrackInfo) trackInfo;
            if (!this.o0 && !Util.a(this.e0.m0, videoTrackInfo.e0.m0)) {
                return false;
            }
            if (this.g0.E0) {
                return true;
            }
            return this.q0 == videoTrackInfo.q0 && this.r0 == videoTrackInfo.r0;
        }
    }

    public DefaultTrackSelector(Context context) {
        AdaptiveTrackSelection.Factory factory = new AdaptiveTrackSelection.Factory();
        Parameters parameters = Parameters.Q0;
        Parameters parameters2 = new Parameters(new Parameters.Builder(context));
        this.f18668c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.f18669e = factory;
        this.g = parameters2;
        this.f18671i = AudioAttributes.h0;
        boolean z2 = context != null && Util.A(context);
        this.f = z2;
        if (!z2 && context != null && Util.f18979a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.f18670h = audioManager != null ? new SpatializerWrapperV32(audioManager.getSpatializer()) : null;
        }
        if (parameters2.K0 && context == null) {
            Log.g("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void f(TrackGroupArray trackGroupArray, TrackSelectionParameters trackSelectionParameters, HashMap map) {
        for (int i2 = 0; i2 < trackGroupArray.X; i2++) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) trackSelectionParameters.z0.get(trackGroupArray.a(i2));
            if (trackSelectionOverride != null) {
                TrackGroup trackGroup = trackSelectionOverride.X;
                TrackSelectionOverride trackSelectionOverride2 = (TrackSelectionOverride) map.get(Integer.valueOf(trackGroup.Z));
                if (trackSelectionOverride2 == null || (trackSelectionOverride2.f18693Y.isEmpty() && !trackSelectionOverride.f18693Y.isEmpty())) {
                    map.put(Integer.valueOf(trackGroup.Z), trackSelectionOverride);
                }
            }
        }
    }

    public static int g(Format format, String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && str.equals(format.Z)) {
            return 4;
        }
        String strJ = j(str);
        String strJ2 = j(format.Z);
        if (strJ2 == null || strJ == null) {
            return (z2 && strJ2 == null) ? 1 : 0;
        }
        if (strJ2.startsWith(strJ) || strJ.startsWith(strJ2)) {
            return 3;
        }
        int i2 = Util.f18979a;
        return strJ2.split(TokenBuilder.TOKEN_DELIMITER, 2)[0].equals(strJ.split(TokenBuilder.TOKEN_DELIMITER, 2)[0]) ? 2 : 0;
    }

    public static boolean h(int i2, boolean z2) {
        int i3 = i2 & 7;
        if (i3 != 4) {
            return z2 && i3 == 3;
        }
        return true;
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair k(int i2, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, TrackInfo.Factory factory, Comparator comparator) {
        RandomAccess randomAccessZ;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < mappedTrackInfo.f18688a; i3++) {
            if (i2 == mappedTrackInfo.f18689b[i3]) {
                TrackGroupArray trackGroupArray = mappedTrackInfo.f18690c[i3];
                for (int i4 = 0; i4 < trackGroupArray.X; i4++) {
                    TrackGroup trackGroupA = trackGroupArray.a(i4);
                    List listA = factory.a(i3, trackGroupA, iArr[i3][i4]);
                    int i5 = trackGroupA.X;
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
        return Pair.create(new ExoTrackSelection.Definition(0, trackInfo3.f18685Y, iArr2), Integer.valueOf(trackInfo3.X));
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public final void b() {
        SpatializerWrapperV32 spatializerWrapperV32;
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        synchronized (this.f18668c) {
            try {
                if (Util.f18979a >= 32 && (spatializerWrapperV32 = this.f18670h) != null && (spatializer$OnSpatializerStateChangedListener = spatializerWrapperV32.d) != null && spatializerWrapperV32.f18683c != null) {
                    spatializerWrapperV32.f18681a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
                    spatializerWrapperV32.f18683c.removeCallbacksAndMessages(null);
                    spatializerWrapperV32.f18683c = null;
                    spatializerWrapperV32.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.b();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public final void d(AudioAttributes audioAttributes) {
        boolean zEquals;
        synchronized (this.f18668c) {
            zEquals = this.f18671i.equals(audioAttributes);
            this.f18671i = audioAttributes;
        }
        if (zEquals) {
            return;
        }
        i();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0223  */
    /* JADX WARN: Code duplicated, block: B:228:0x046d  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.trackselection.MappingTrackSelector
    public final Pair e(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
        final Parameters parameters;
        int i2;
        TrackGroupArray[] trackGroupArrayArr;
        int[] iArr3;
        int i3;
        final boolean z2;
        final String str;
        TrackGroupArray[] trackGroupArrayArr2;
        int i4;
        boolean z3;
        int i5;
        BandwidthMeter bandwidthMeter;
        int[] iArr4;
        int i6;
        ExoTrackSelection.Definition definition;
        ExoTrackSelection.Definition definition2;
        int i7;
        TrackGroup trackGroup;
        int i8;
        SpatializerWrapperV32 spatializerWrapperV32;
        int[][][] iArr5 = iArr;
        synchronized (this.f18668c) {
            try {
                parameters = this.g;
                i2 = 32;
                if (parameters.K0 && Util.f18979a >= 32 && (spatializerWrapperV32 = this.f18670h) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    Assertions.e(looperMyLooper);
                    if (spatializerWrapperV32.d == null && spatializerWrapperV32.f18683c == null) {
                        spatializerWrapperV32.d = new Spatializer$OnSpatializerStateChangedListener() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32.1
                            public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z4) {
                                DefaultTrackSelector defaultTrackSelector = this.f18684a;
                                Ordering ordering = DefaultTrackSelector.j;
                                defaultTrackSelector.i();
                            }

                            public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z4) {
                                DefaultTrackSelector defaultTrackSelector = this.f18684a;
                                Ordering ordering = DefaultTrackSelector.j;
                                defaultTrackSelector.i();
                            }
                        };
                        Handler handler = new Handler(looperMyLooper);
                        spatializerWrapperV32.f18683c = handler;
                        spatializerWrapperV32.f18681a.addOnSpatializerStateChangedListener(new i(handler), spatializerWrapperV32.d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i9 = mappedTrackInfo.f18688a;
        ExoTrackSelection.Definition[] definitionArr = new ExoTrackSelection.Definition[i9];
        final int i10 = 0;
        int i11 = 2;
        Pair pairK = k(2, mappedTrackInfo, iArr5, new TrackInfo.Factory() { // from class: com.google.android.exoplayer2.trackselection.a
            /* JADX WARN: Code duplicated, block: B:32:0x006b  */
            @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List a(int i12, TrackGroup trackGroup2, int[] iArr6) {
                boolean z4;
                int i13;
                int i14;
                int i15;
                boolean z5;
                int i16;
                int i17;
                int i18;
                TrackGroup trackGroup3 = trackGroup2;
                Object obj = iArr2;
                boolean z6 = true;
                switch (i10) {
                    case 0:
                        Ordering ordering = DefaultTrackSelector.j;
                        int i19 = ((int[]) obj)[i12];
                        DefaultTrackSelector.Parameters parameters2 = parameters;
                        int i20 = parameters2.j0;
                        if (i20 == Integer.MAX_VALUE || (i15 = parameters2.k0) == Integer.MAX_VALUE) {
                            z4 = true;
                            i13 = Integer.MAX_VALUE;
                        } else {
                            int i21 = Integer.MAX_VALUE;
                            int i22 = 0;
                            while (i22 < trackGroup3.X) {
                                Format format = trackGroup3.e0[i22];
                                int i23 = format.r0;
                                if (i23 <= 0 || (i16 = format.s0) <= 0) {
                                    z5 = z6;
                                } else {
                                    if (!parameters2.l0) {
                                        i17 = i20;
                                        i18 = i15;
                                    } else if ((i23 > i16 ? z6 : false) != (i20 > i15 ? z6 : false)) {
                                        i18 = i20;
                                        i17 = i15;
                                    } else {
                                        i17 = i20;
                                        i18 = i15;
                                    }
                                    int i24 = i23 * i18;
                                    z5 = z6;
                                    int i25 = i16 * i17;
                                    Point point = i24 >= i25 ? new Point(i17, Util.g(i25, i23)) : new Point(Util.g(i24, i16), i18);
                                    int i26 = format.r0;
                                    int i27 = i26 * i16;
                                    if (i26 >= ((int) (point.x * 0.98f)) && i16 >= ((int) (point.y * 0.98f)) && i27 < i21) {
                                        i21 = i27;
                                    }
                                }
                                i22++;
                                z6 = z5;
                            }
                            z4 = z6;
                            i13 = i21;
                        }
                        ImmutableList.Builder builderS = ImmutableList.s();
                        int i28 = 0;
                        while (i28 < trackGroup3.X) {
                            Format format2 = trackGroup3.e0[i28];
                            int i29 = format2.r0;
                            int i30 = (i29 == -1 || (i14 = format2.s0) == -1) ? -1 : i29 * i14;
                            builderS.h(new DefaultTrackSelector.VideoTrackInfo(i12, trackGroup3, i28, parameters2, iArr6[i28], i19, (i13 == Integer.MAX_VALUE || (i30 != -1 && i30 <= i13)) ? z4 : false));
                            i28++;
                            trackGroup3 = trackGroup2;
                        }
                        return builderS.j();
                    default:
                        Ordering ordering2 = DefaultTrackSelector.j;
                        ImmutableList.Builder builderS2 = ImmutableList.s();
                        for (int i31 = 0; i31 < trackGroup3.X; i31++) {
                            builderS2.h(new DefaultTrackSelector.TextTrackInfo(i12, trackGroup3, i31, parameters, iArr6[i31], (String) obj));
                        }
                        return builderS2.j();
                }
            }
        }, new b(0));
        if (pairK != null) {
            definitionArr[((Integer) pairK.second).intValue()] = (ExoTrackSelection.Definition) pairK.first;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            trackGroupArrayArr = mappedTrackInfo.f18690c;
            iArr3 = mappedTrackInfo.f18689b;
            i3 = 1;
            if (i13 >= mappedTrackInfo.f18688a) {
                z2 = false;
                break;
            }
            if (2 == iArr3[i13] && trackGroupArrayArr[i13].X > 0) {
                z2 = true;
                break;
            }
            i13++;
        }
        Pair pairK2 = k(1, mappedTrackInfo, iArr5, new TrackInfo.Factory() { // from class: com.google.android.exoplayer2.trackselection.c
            @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List a(int i14, TrackGroup trackGroup2, int[] iArr6) {
                Ordering ordering = DefaultTrackSelector.j;
                DefaultTrackSelector defaultTrackSelector = this.f18716a;
                defaultTrackSelector.getClass();
                d dVar = new d(defaultTrackSelector);
                ImmutableList.Builder builderS = ImmutableList.s();
                for (int i15 = 0; i15 < trackGroup2.X; i15++) {
                    builderS.h(new DefaultTrackSelector.AudioTrackInfo(i14, trackGroup2, i15, parameters, iArr6[i15], z2, dVar));
                }
                return builderS.j();
            }
        }, new b(1));
        if (pairK2 != null) {
            definitionArr[((Integer) pairK2.second).intValue()] = (ExoTrackSelection.Definition) pairK2.first;
        }
        if (pairK2 == null) {
            str = null;
        } else {
            ExoTrackSelection.Definition definition3 = (ExoTrackSelection.Definition) pairK2.first;
            str = definition3.f18686a.e0[definition3.f18687b[0]].Z;
        }
        final int i14 = 1;
        int i15 = 3;
        Pair pairK3 = k(3, mappedTrackInfo, iArr5, new TrackInfo.Factory() { // from class: com.google.android.exoplayer2.trackselection.a
            /* JADX WARN: Code duplicated, block: B:32:0x006b  */
            @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List a(int i16, TrackGroup trackGroup2, int[] iArr6) {
                boolean z4;
                int i17;
                int i18;
                int i19;
                boolean z5;
                int i110;
                int i111;
                int i112;
                TrackGroup trackGroup3 = trackGroup2;
                Object obj = str;
                boolean z6 = true;
                switch (i14) {
                    case 0:
                        Ordering ordering = DefaultTrackSelector.j;
                        int i113 = ((int[]) obj)[i16];
                        DefaultTrackSelector.Parameters parameters2 = parameters;
                        int i20 = parameters2.j0;
                        if (i20 == Integer.MAX_VALUE || (i19 = parameters2.k0) == Integer.MAX_VALUE) {
                            z4 = true;
                            i17 = Integer.MAX_VALUE;
                        } else {
                            int i21 = Integer.MAX_VALUE;
                            int i22 = 0;
                            while (i22 < trackGroup3.X) {
                                Format format = trackGroup3.e0[i22];
                                int i23 = format.r0;
                                if (i23 <= 0 || (i110 = format.s0) <= 0) {
                                    z5 = z6;
                                } else {
                                    if (!parameters2.l0) {
                                        i111 = i20;
                                        i112 = i19;
                                    } else if ((i23 > i110 ? z6 : false) != (i20 > i19 ? z6 : false)) {
                                        i112 = i20;
                                        i111 = i19;
                                    } else {
                                        i111 = i20;
                                        i112 = i19;
                                    }
                                    int i24 = i23 * i112;
                                    z5 = z6;
                                    int i25 = i110 * i111;
                                    Point point = i24 >= i25 ? new Point(i111, Util.g(i25, i23)) : new Point(Util.g(i24, i110), i112);
                                    int i26 = format.r0;
                                    int i27 = i26 * i110;
                                    if (i26 >= ((int) (point.x * 0.98f)) && i110 >= ((int) (point.y * 0.98f)) && i27 < i21) {
                                        i21 = i27;
                                    }
                                }
                                i22++;
                                z6 = z5;
                            }
                            z4 = z6;
                            i17 = i21;
                        }
                        ImmutableList.Builder builderS = ImmutableList.s();
                        int i28 = 0;
                        while (i28 < trackGroup3.X) {
                            Format format2 = trackGroup3.e0[i28];
                            int i29 = format2.r0;
                            int i30 = (i29 == -1 || (i18 = format2.s0) == -1) ? -1 : i29 * i18;
                            builderS.h(new DefaultTrackSelector.VideoTrackInfo(i16, trackGroup3, i28, parameters2, iArr6[i28], i113, (i17 == Integer.MAX_VALUE || (i30 != -1 && i30 <= i17)) ? z4 : false));
                            i28++;
                            trackGroup3 = trackGroup2;
                        }
                        return builderS.j();
                    default:
                        Ordering ordering2 = DefaultTrackSelector.j;
                        ImmutableList.Builder builderS2 = ImmutableList.s();
                        for (int i31 = 0; i31 < trackGroup3.X; i31++) {
                            builderS2.h(new DefaultTrackSelector.TextTrackInfo(i16, trackGroup3, i31, parameters, iArr6[i31], (String) obj));
                        }
                        return builderS2.j();
                }
            }
        }, new b(2));
        if (pairK3 != null) {
            definitionArr[((Integer) pairK3.second).intValue()] = (ExoTrackSelection.Definition) pairK3.first;
        }
        int i16 = 0;
        while (i16 < i9) {
            int i17 = iArr3[i16];
            if (i17 == i11 || i17 == i3 || i17 == i15) {
                i7 = i16;
            } else {
                TrackGroupArray trackGroupArray = trackGroupArrayArr[i16];
                int[][] iArr6 = iArr5[i16];
                int i18 = i12;
                int i19 = i18;
                TrackGroup trackGroup2 = null;
                OtherTrackScore otherTrackScore = null;
                while (i18 < trackGroupArray.X) {
                    TrackGroup trackGroupA = trackGroupArray.a(i18);
                    int[] iArr7 = iArr6[i18];
                    int i20 = i12;
                    OtherTrackScore otherTrackScore2 = otherTrackScore;
                    while (i20 < trackGroupA.X) {
                        if (h(iArr7[i20], parameters.L0)) {
                            trackGroup = trackGroupA;
                            OtherTrackScore otherTrackScore3 = new OtherTrackScore(trackGroupA.e0[i20], iArr7[i20]);
                            if (otherTrackScore2 != null) {
                                i8 = i16;
                                if (ComparisonChain.f19806a.d(otherTrackScore3.f18672Y, otherTrackScore2.f18672Y).d(otherTrackScore3.X, otherTrackScore2.X).f() > 0) {
                                }
                            } else {
                                i8 = i16;
                            }
                            otherTrackScore2 = otherTrackScore3;
                            i19 = i20;
                            trackGroup2 = trackGroup;
                        } else {
                            trackGroup = trackGroupA;
                            i8 = i16;
                        }
                        i20++;
                        trackGroupA = trackGroup;
                        i16 = i8;
                    }
                    i18++;
                    otherTrackScore = otherTrackScore2;
                    i12 = 0;
                }
                i7 = i16;
                definitionArr[i7] = trackGroup2 == null ? null : new ExoTrackSelection.Definition(0, trackGroup2, new int[]{i19});
            }
            i16 = i7 + 1;
            iArr5 = iArr;
            i2 = i2;
            i12 = 0;
            i11 = 2;
            i3 = 1;
            i15 = 3;
        }
        int i21 = i2;
        int i22 = mappedTrackInfo.f18688a;
        HashMap map = new HashMap();
        int i23 = 0;
        while (true) {
            trackGroupArrayArr2 = mappedTrackInfo.f18690c;
            if (i23 >= i22) {
                break;
            }
            f(trackGroupArrayArr2[i23], parameters, map);
            i23++;
        }
        f(mappedTrackInfo.f, parameters, map);
        for (int i24 = 0; i24 < i22; i24++) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) map.get(Integer.valueOf(mappedTrackInfo.f18689b[i24]));
            if (trackSelectionOverride != null) {
                ImmutableList immutableList = trackSelectionOverride.f18693Y;
                if (immutableList.isEmpty()) {
                    definition2 = null;
                } else {
                    TrackGroupArray trackGroupArray2 = trackGroupArrayArr2[i24];
                    TrackGroup trackGroup3 = trackSelectionOverride.X;
                    int iIndexOf = trackGroupArray2.f18424Y.indexOf(trackGroup3);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        definition2 = new ExoTrackSelection.Definition(0, trackGroup3, Ints.f(immutableList));
                    } else {
                        definition2 = null;
                    }
                }
                definitionArr[i24] = definition2;
            }
        }
        int i25 = mappedTrackInfo.f18688a;
        for (int i26 = 0; i26 < i25; i26++) {
            TrackGroupArray trackGroupArray3 = mappedTrackInfo.f18690c[i26];
            Map map2 = (Map) parameters.O0.get(i26);
            if (map2 != null && map2.containsKey(trackGroupArray3)) {
                Map map3 = (Map) parameters.O0.get(i26);
                SelectionOverride selectionOverride = map3 != null ? (SelectionOverride) map3.get(trackGroupArray3) : null;
                if (selectionOverride != null) {
                    int[] iArr8 = selectionOverride.f18680Y;
                    if (iArr8.length != 0) {
                        definition = new ExoTrackSelection.Definition(selectionOverride.Z, trackGroupArray3.a(selectionOverride.X), iArr8);
                    } else {
                        definition = null;
                    }
                } else {
                    definition = null;
                }
                definitionArr[i26] = definition;
            }
        }
        for (int i27 = 0; i27 < i9; i27++) {
            int i28 = mappedTrackInfo.f18689b[i27];
            if (parameters.P0.get(i27) || parameters.A0.contains(Integer.valueOf(i28))) {
                definitionArr[i27] = null;
            }
        }
        AdaptiveTrackSelection.Factory factory = this.f18669e;
        BandwidthMeter bandwidthMeter2 = this.f18708b;
        Assertions.e(bandwidthMeter2);
        factory.getClass();
        ArrayList arrayList = new ArrayList();
        int i29 = 0;
        for (ExoTrackSelection.Definition definition4 : definitionArr) {
            if (definition4 == null || definition4.f18687b.length <= 1) {
                arrayList.add(null);
            } else {
                ImmutableList.Builder builderS = ImmutableList.s();
                builderS.h(new AdaptiveTrackSelection.AdaptationCheckpoint(0L, 0L));
                arrayList.add(builderS);
            }
        }
        int length = definitionArr.length;
        long[][] jArr = new long[length][];
        int i30 = 0;
        while (i30 < definitionArr.length) {
            ExoTrackSelection.Definition definition5 = definitionArr[i30];
            if (definition5 == null) {
                jArr[i30] = new long[i29];
                i6 = i29;
            } else {
                i6 = i29;
                int[] iArr9 = definition5.f18687b;
                jArr[i30] = new long[iArr9.length];
                int i31 = i6;
                while (i31 < iArr9.length) {
                    ExoTrackSelection.Definition definition6 = definition5;
                    long j2 = definition5.f18686a.e0[iArr9[i31]].i0;
                    long[] jArr2 = jArr[i30];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i31] = j2;
                    i31++;
                    definition5 = definition6;
                }
                Arrays.sort(jArr[i30]);
            }
            i30++;
            i29 = i6;
        }
        int i32 = i29;
        int[] iArr10 = new int[length];
        long[] jArr3 = new long[length];
        for (int i33 = i32; i33 < length; i33++) {
            long[] jArr4 = jArr[i33];
            jArr3[i33] = jArr4.length == 0 ? 0L : jArr4[i32];
        }
        AdaptiveTrackSelection.d(arrayList, jArr3);
        ListMultimap listMultimapC = MultimapBuilder.b().a().c();
        int i34 = i32;
        while (i34 < length) {
            long[] jArr5 = jArr[i34];
            if (jArr5.length <= 1) {
                bandwidthMeter = bandwidthMeter2;
                iArr4 = iArr10;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i35 = i32;
                while (true) {
                    long[] jArr6 = jArr[i34];
                    bandwidthMeter = bandwidthMeter2;
                    double dLog = 0.0d;
                    if (i35 >= jArr6.length) {
                        break;
                    }
                    int[] iArr11 = iArr10;
                    long j3 = jArr6[i35];
                    if (j3 != -1) {
                        dLog = Math.log(j3);
                    }
                    dArr[i35] = dLog;
                    i35++;
                    iArr10 = iArr11;
                    bandwidthMeter2 = bandwidthMeter;
                }
                iArr4 = iArr10;
                int i36 = length2 - 1;
                double d = dArr[i36] - dArr[i32];
                int i37 = i32;
                while (i37 < i36) {
                    double d2 = dArr[i37];
                    int i38 = i37 + 1;
                    listMultimapC.put(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i38]) * 0.5d) - dArr[i32]) / d), Integer.valueOf(i34));
                    i37 = i38;
                }
            }
            i34++;
            iArr10 = iArr4;
            bandwidthMeter2 = bandwidthMeter;
        }
        BandwidthMeter bandwidthMeter3 = bandwidthMeter2;
        int[] iArr12 = iArr10;
        ImmutableList immutableListU = ImmutableList.u(listMultimapC.values());
        for (int i39 = i32; i39 < immutableListU.size(); i39++) {
            int iIntValue = ((Integer) immutableListU.get(i39)).intValue();
            int i40 = iArr12[iIntValue] + 1;
            iArr12[iIntValue] = i40;
            jArr3[iIntValue] = jArr[iIntValue][i40];
            AdaptiveTrackSelection.d(arrayList, jArr3);
        }
        for (int i41 = i32; i41 < definitionArr.length; i41++) {
            if (arrayList.get(i41) != null) {
                jArr3[i41] = jArr3[i41] * 2;
            }
        }
        AdaptiveTrackSelection.d(arrayList, jArr3);
        ImmutableList.Builder builderS2 = ImmutableList.s();
        for (int i42 = i32; i42 < arrayList.size(); i42++) {
            ImmutableList.Builder builder = (ImmutableList.Builder) arrayList.get(i42);
            builderS2.h(builder == null ? ImmutableList.x() : builder.j());
        }
        ImmutableList immutableListJ = builderS2.j();
        ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
        for (int i43 = 0; i43 < definitionArr.length; i43++) {
            ExoTrackSelection.Definition definition7 = definitionArr[i43];
            if (definition7 != null) {
                int[] iArr13 = definition7.f18687b;
                if (iArr13.length != 0) {
                    exoTrackSelectionArr[i43] = iArr13.length == 1 ? new FixedTrackSelection(definition7.f18686a, new int[]{iArr13[0]}) : new AdaptiveTrackSelection(definition7.f18686a, iArr13, bandwidthMeter3, 10000, 25000, (ImmutableList) immutableListJ.get(i43));
                }
            }
        }
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[i9];
        for (int i44 = 0; i44 < i9; i44++) {
            rendererConfigurationArr[i44] = (parameters.P0.get(i44) || parameters.A0.contains(Integer.valueOf(mappedTrackInfo.f18689b[i44])) || (mappedTrackInfo.f18689b[i44] != -2 && exoTrackSelectionArr[i44] == null)) ? null : RendererConfiguration.f17196b;
        }
        if (parameters.M0) {
            int i45 = -1;
            int i46 = -1;
            int i47 = 0;
            while (true) {
                if (i47 >= mappedTrackInfo.f18688a) {
                    i4 = -1;
                    z3 = true;
                    break;
                }
                int i48 = mappedTrackInfo.f18689b[i47];
                ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i47];
                if (i48 != 1 && i48 != 2) {
                    i5 = i21;
                    break;
                    break;
                }
                if (exoTrackSelection != null) {
                    int[][] iArr14 = iArr[i47];
                    int iIndexOf2 = mappedTrackInfo.f18690c[i47].f18424Y.indexOf(exoTrackSelection.getTrackGroup());
                    if (iIndexOf2 < 0) {
                        iIndexOf2 = -1;
                    }
                    int i49 = 0;
                    while (true) {
                        if (i49 >= exoTrackSelection.length()) {
                            i5 = i21;
                            if (i48 != 1) {
                                i4 = -1;
                                if (i45 == -1) {
                                    i45 = i47;
                                    break;
                                }
                                z3 = false;
                                break;
                            }
                            i4 = -1;
                            if (i46 == -1) {
                                i46 = i47;
                                break;
                            }
                            z3 = false;
                            break;
                        }
                        i5 = i21;
                        if ((iArr14[iIndexOf2][exoTrackSelection.getIndexInTrackGroup(i49)] & 32) == i5) {
                            i49++;
                            i21 = i5;
                        }
                    }
                } else {
                    i5 = i21;
                }
                break;
                i47++;
                i21 = i5;
            }
            if (z3 & ((i46 == i4 || i45 == i4) ? false : true)) {
                RendererConfiguration rendererConfiguration = new RendererConfiguration(true);
                rendererConfigurationArr[i46] = rendererConfiguration;
                rendererConfigurationArr[i45] = rendererConfiguration;
            }
        }
        return Pair.create(rendererConfigurationArr, exoTrackSelectionArr);
    }

    public final void i() {
        boolean z2;
        TrackSelector.InvalidationListener invalidationListener;
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.f18668c) {
            try {
                z2 = this.g.K0 && !this.f && Util.f18979a >= 32 && (spatializerWrapperV32 = this.f18670h) != null && spatializerWrapperV32.f18682b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2 || (invalidationListener = this.f18707a) == null) {
            return;
        }
        invalidationListener.onTrackSelectionsInvalidated();
    }

    public static final class Parameters extends TrackSelectionParameters implements Bundleable {
        public static final Parameters Q0 = new Parameters(new Builder());
        public final boolean B0;
        public final boolean C0;
        public final boolean D0;
        public final boolean E0;
        public final boolean F0;
        public final boolean G0;
        public final boolean H0;
        public final boolean I0;
        public final boolean J0;
        public final boolean K0;
        public final boolean L0;
        public final boolean M0;
        public final boolean N0;
        public final SparseArray O0;
        public final SparseBooleanArray P0;

        static {
            int i2 = Util.f18979a;
            Integer.toString(1000, 36);
            Integer.toString(1001, 36);
            Integer.toString(1002, 36);
            Integer.toString(1003, 36);
            Integer.toString(1004, 36);
            Integer.toString(1005, 36);
            Integer.toString(1006, 36);
            Integer.toString(1007, 36);
            Integer.toString(1008, 36);
            Integer.toString(1009, 36);
            Integer.toString(1010, 36);
            Integer.toString(1011, 36);
            Integer.toString(TTAdConstant.IMAGE_MODE_1012, 36);
            Integer.toString(f9.f24992i, 36);
            Integer.toString(f9.j, 36);
            Integer.toString(1015, 36);
            Integer.toString(f9.f24993l, 36);
        }

        public Parameters(Builder builder) {
            super(builder);
            this.B0 = builder.f18673A;
            this.C0 = builder.f18674B;
            this.D0 = builder.C;
            this.E0 = builder.D;
            this.F0 = builder.f18675E;
            this.G0 = builder.f18676F;
            this.H0 = builder.G;
            this.I0 = builder.H;
            this.J0 = builder.f18677I;
            this.K0 = builder.f18678J;
            this.L0 = builder.K;
            this.M0 = builder.L;
            this.N0 = builder.M;
            this.O0 = builder.f18679N;
            this.P0 = builder.O;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Parameters.class == obj.getClass()) {
                Parameters parameters = (Parameters) obj;
                if (super.equals(parameters) && this.B0 == parameters.B0 && this.C0 == parameters.C0 && this.D0 == parameters.D0 && this.E0 == parameters.E0 && this.F0 == parameters.F0 && this.G0 == parameters.G0 && this.H0 == parameters.H0 && this.I0 == parameters.I0 && this.J0 == parameters.J0 && this.K0 == parameters.K0 && this.L0 == parameters.L0 && this.M0 == parameters.M0 && this.N0 == parameters.N0) {
                    SparseBooleanArray sparseBooleanArray = this.P0;
                    int size = sparseBooleanArray.size();
                    SparseBooleanArray sparseBooleanArray2 = parameters.P0;
                    if (sparseBooleanArray2.size() == size) {
                        for (int i2 = 0; i2 < size; i2++) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) >= 0) {
                            }
                        }
                        SparseArray sparseArray = this.O0;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = parameters.O0;
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

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public final int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.B0 ? 1 : 0)) * 31) + (this.C0 ? 1 : 0)) * 31) + (this.D0 ? 1 : 0)) * 31) + (this.E0 ? 1 : 0)) * 31) + (this.F0 ? 1 : 0)) * 31) + (this.G0 ? 1 : 0)) * 31) + (this.H0 ? 1 : 0)) * 31) + (this.I0 ? 1 : 0)) * 31) + (this.J0 ? 1 : 0)) * 31) + (this.K0 ? 1 : 0)) * 31) + (this.L0 ? 1 : 0)) * 31) + (this.M0 ? 1 : 0)) * 31) + (this.N0 ? 1 : 0);
        }

        public static final class Builder extends TrackSelectionParameters.Builder {

            /* JADX INFO: renamed from: A, reason: collision with root package name */
            public boolean f18673A;

            /* JADX INFO: renamed from: B, reason: collision with root package name */
            public boolean f18674B;
            public boolean C;
            public boolean D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            public boolean f18675E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            public boolean f18676F;
            public boolean G;
            public boolean H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            public boolean f18677I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            public boolean f18678J;
            public boolean K;
            public boolean L;
            public boolean M;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            public final SparseArray f18679N;
            public final SparseBooleanArray O;

            /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
            /* JADX WARN: Code duplicated, block: B:56:0x00f6  */
            /* JADX WARN: Code duplicated, block: B:57:0x0107 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:58:0x0109  */
            /* JADX WARN: Code duplicated, block: B:59:0x010d  */
            public Builder(Context context) {
                Point point;
                Point point2;
                DisplayManager displayManager;
                CaptioningManager captioningManager;
                int i2 = Util.f18979a;
                if (i2 >= 19 && ((i2 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
                    this.t = 1088;
                    Locale locale = captioningManager.getLocale();
                    if (locale != null) {
                        this.s = ImmutableList.z(i2 >= 21 ? locale.toLanguageTag() : locale.toString());
                    }
                }
                Display display = (i2 < 17 || (displayManager = (DisplayManager) context.getSystemService(d9.h.d)) == null) ? null : displayManager.getDisplay(0);
                if (display == null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.getClass();
                    display = windowManager.getDefaultDisplay();
                }
                if (display.getDisplayId() == 0 && Util.A(context)) {
                    String strV = i2 < 28 ? Util.v("sys.display-size") : Util.v("vendor.display-size");
                    if (!TextUtils.isEmpty(strV)) {
                        try {
                            String[] strArrSplit = strV.trim().split("x", -1);
                            if (strArrSplit.length == 2) {
                                int i3 = Integer.parseInt(strArrSplit[0]);
                                int i4 = Integer.parseInt(strArrSplit[1]);
                                if (i3 > 0 && i4 > 0) {
                                    point2 = new Point(i3, i4);
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                        Log.c("Util", "Invalid display size: " + strV);
                    }
                    if ("Sony".equals(Util.f18981c) && Util.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                        point = new Point(3840, 2160);
                    } else {
                        point = new Point();
                        if (i2 >= 23) {
                            Display.Mode mode = display.getMode();
                            point.x = mode.getPhysicalWidth();
                            point.y = mode.getPhysicalHeight();
                        } else if (i2 >= 17) {
                            display.getRealSize(point);
                        } else {
                            display.getSize(point);
                        }
                    }
                    point2 = point;
                } else {
                    point = new Point();
                    if (i2 >= 23) {
                        Display.Mode mode2 = display.getMode();
                        point.x = mode2.getPhysicalWidth();
                        point.y = mode2.getPhysicalHeight();
                    } else if (i2 >= 17) {
                        display.getRealSize(point);
                    } else {
                        display.getSize(point);
                    }
                    point2 = point;
                }
                a(point2.x, point2.y);
                this.f18679N = new SparseArray();
                this.O = new SparseBooleanArray();
                b();
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder a(int i2, int i3) {
                super.a(i2, i3);
                return this;
            }

            public final void b() {
                this.f18673A = true;
                this.f18674B = false;
                this.C = true;
                this.D = false;
                this.f18675E = true;
                this.f18676F = false;
                this.G = false;
                this.H = false;
                this.f18677I = false;
                this.f18678J = true;
                this.K = true;
                this.L = false;
                this.M = true;
            }

            public Builder(Parameters parameters) {
                this.f18695a = parameters.X;
                this.f18696b = parameters.f18694Y;
                this.f18697c = parameters.Z;
                this.d = parameters.e0;
                this.f18698e = parameters.f0;
                this.f = parameters.g0;
                this.g = parameters.h0;
                this.f18699h = parameters.i0;
                this.f18700i = parameters.j0;
                this.j = parameters.k0;
                this.k = parameters.l0;
                this.f18701l = parameters.m0;
                this.m = parameters.n0;
                this.f18702n = parameters.o0;
                this.o = parameters.p0;
                this.f18703p = parameters.q0;
                this.q = parameters.r0;
                this.r = parameters.s0;
                this.s = parameters.t0;
                this.t = parameters.u0;
                this.f18704u = parameters.v0;
                this.v = parameters.w0;
                this.f18705w = parameters.x0;
                this.x = parameters.y0;
                this.f18706z = new HashSet(parameters.A0);
                this.y = new HashMap(parameters.z0);
                this.f18673A = parameters.B0;
                this.f18674B = parameters.C0;
                this.C = parameters.D0;
                this.D = parameters.E0;
                this.f18675E = parameters.F0;
                this.f18676F = parameters.G0;
                this.G = parameters.H0;
                this.H = parameters.I0;
                this.f18677I = parameters.J0;
                this.f18678J = parameters.K0;
                this.K = parameters.L0;
                this.L = parameters.M0;
                this.M = parameters.N0;
                SparseArray sparseArray = new SparseArray();
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray2 = parameters.O0;
                    if (i2 < sparseArray2.size()) {
                        sparseArray.put(sparseArray2.keyAt(i2), new HashMap((Map) sparseArray2.valueAt(i2)));
                        i2++;
                    } else {
                        this.f18679N = sparseArray;
                        this.O = parameters.P0.clone();
                        return;
                    }
                }
            }

            public Builder() {
                this.f18679N = new SparseArray();
                this.O = new SparseBooleanArray();
                b();
            }
        }
    }
}
