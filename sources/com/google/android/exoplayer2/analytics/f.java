package com.google.android.exoplayer2.analytics;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Track;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.base.Function;
import com.google.common.net.MediaType;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements ListenerSet.Event, ListenerSet.IterationFinishedEvent, DrmSessionManager.DrmSessionReference, ExoMediaDrm.Provider, DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier, ExtractorsFactory, Id3Decoder.FramePredicate, Function, Bundleable.Creator, CacheKeyFactory, ShapeAppearanceModel.CornerSizeUnaryOperator, TextInputLayout.LengthCounter {
    public final /* synthetic */ int X;

    public /* synthetic */ f(int i2) {
        this.X = i2;
    }

    @Override // com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
    public Constructor a() {
        switch (this.X) {
            case 16:
                int[] iArr = DefaultExtractorsFactory.f17529Y;
                if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                int[] iArr2 = DefaultExtractorsFactory.f17529Y;
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(Extractor.class).getConstructor(new Class[0]);
        }
    }

    @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        switch (this.X) {
            case 20:
                Track track = (Track) obj;
                int i2 = Mp4Extractor.f17805w;
                return track;
            default:
                String str = (String) obj;
                if (MediaType.g.n(str) && !str.isEmpty()) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(str.length() + 16);
                sb.append(AbstractJsonLexerKt.STRING);
                for (int i3 = 0; i3 < str.length(); i3++) {
                    char cCharAt = str.charAt(i3);
                    if (cCharAt == '\r' || cCharAt == '\\' || cCharAt == '\"') {
                        sb.append('\\');
                    }
                    sb.append(cCharAt);
                }
                sb.append(AbstractJsonLexerKt.STRING);
                return sb.toString();
        }
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize b(CornerSize cornerSize) {
        int i2 = MaskableFrameLayout.h0;
        return cornerSize instanceof AbsoluteCornerSize ? new ClampedCornerSize(((AbsoluteCornerSize) cornerSize).f19411a) : cornerSize;
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int c(Editable editable) {
        int[][] iArr = TextInputLayout.D1;
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheKeyFactory
    public String d(DataSpec dataSpec) {
        String str = dataSpec.f18746h;
        return str != null ? str : dataSpec.f18742a.toString();
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable e(Bundle bundle) {
        AdPlaybackState.AdGroup[] adGroupArr;
        switch (this.X) {
            case 22:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(AdPlaybackState.i0);
                if (parcelableArrayList == null) {
                    adGroupArr = new AdPlaybackState.AdGroup[0];
                } else {
                    AdPlaybackState.AdGroup[] adGroupArr2 = new AdPlaybackState.AdGroup[parcelableArrayList.size()];
                    for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                        adGroupArr2[i2] = (AdPlaybackState.AdGroup) AdPlaybackState.AdGroup.r0.e((Bundle) parcelableArrayList.get(i2));
                    }
                    adGroupArr = adGroupArr2;
                }
                return new AdPlaybackState(adGroupArr, bundle.getLong(AdPlaybackState.j0, 0L), bundle.getLong(AdPlaybackState.k0, -9223372036854775807L), bundle.getInt(AdPlaybackState.l0, 0));
            case 23:
                long j = bundle.getLong(AdPlaybackState.AdGroup.j0);
                int i3 = bundle.getInt(AdPlaybackState.AdGroup.k0);
                int i4 = bundle.getInt(AdPlaybackState.AdGroup.q0);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(AdPlaybackState.AdGroup.l0);
                int[] intArray = bundle.getIntArray(AdPlaybackState.AdGroup.m0);
                long[] longArray = bundle.getLongArray(AdPlaybackState.AdGroup.n0);
                long j2 = bundle.getLong(AdPlaybackState.AdGroup.o0);
                boolean z2 = bundle.getBoolean(AdPlaybackState.AdGroup.p0);
                int[] iArr = intArray;
                if (iArr == null) {
                    iArr = new int[0];
                }
                Uri[] uriArr = parcelableArrayList2 == null ? new Uri[0] : (Uri[]) parcelableArrayList2.toArray(new Uri[0]);
                if (longArray == null) {
                    longArray = new long[0];
                }
                return new AdPlaybackState.AdGroup(j, i3, i4, iArr, uriArr, longArray, j2, z2);
            case 24:
                Cue.Builder builder = new Cue.Builder();
                CharSequence charSequence = bundle.getCharSequence(Cue.t0);
                if (charSequence != null) {
                    builder.f18454a = charSequence;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Cue.u0);
                if (alignment != null) {
                    builder.f18456c = alignment;
                }
                Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(Cue.v0);
                if (alignment2 != null) {
                    builder.d = alignment2;
                }
                Bitmap bitmap = (Bitmap) bundle.getParcelable(Cue.w0);
                if (bitmap != null) {
                    builder.f18455b = bitmap;
                }
                String str = Cue.x0;
                if (bundle.containsKey(str)) {
                    String str2 = Cue.y0;
                    if (bundle.containsKey(str2)) {
                        float f = bundle.getFloat(str);
                        int i5 = bundle.getInt(str2);
                        builder.f18457e = f;
                        builder.f = i5;
                    }
                }
                String str3 = Cue.z0;
                if (bundle.containsKey(str3)) {
                    builder.g = bundle.getInt(str3);
                }
                String str4 = Cue.A0;
                if (bundle.containsKey(str4)) {
                    builder.f18458h = bundle.getFloat(str4);
                }
                String str5 = Cue.B0;
                if (bundle.containsKey(str5)) {
                    builder.f18459i = bundle.getInt(str5);
                }
                String str6 = Cue.D0;
                if (bundle.containsKey(str6)) {
                    String str7 = Cue.C0;
                    if (bundle.containsKey(str7)) {
                        float f2 = bundle.getFloat(str6);
                        int i6 = bundle.getInt(str7);
                        builder.k = f2;
                        builder.j = i6;
                    }
                }
                String str8 = Cue.E0;
                if (bundle.containsKey(str8)) {
                    builder.f18460l = bundle.getFloat(str8);
                }
                String str9 = Cue.F0;
                if (bundle.containsKey(str9)) {
                    builder.m = bundle.getFloat(str9);
                }
                String str10 = Cue.G0;
                if (bundle.containsKey(str10)) {
                    builder.o = bundle.getInt(str10);
                    builder.f18461n = true;
                }
                if (!bundle.getBoolean(Cue.H0, false)) {
                    builder.f18461n = false;
                }
                String str11 = Cue.I0;
                if (bundle.containsKey(str11)) {
                    builder.f18462p = bundle.getInt(str11);
                }
                String str12 = Cue.J0;
                if (bundle.containsKey(str12)) {
                    builder.q = bundle.getFloat(str12);
                }
                return builder.a();
            default:
                return new ColorInfo(bundle.getInt(ColorInfo.g0, -1), bundle.getInt(ColorInfo.h0, -1), bundle.getInt(ColorInfo.i0, -1), bundle.getByteArray(ColorInfo.j0));
        }
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i2, int i3, int i4, int i5, int i6) {
        switch (this.X) {
            case 19:
                if (i3 != 67 || i4 != 79 || i5 != 77 || (i6 != 77 && i2 != 2)) {
                    if (i3 != 77 || i4 != 76 || i5 != 76) {
                        return false;
                    }
                    if (i6 != 84 && i2 != 2) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    public void f(Object obj, FlagSet flagSet) {
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.X) {
            case 0:
                analyticsListener.getClass();
                break;
            case 1:
                analyticsListener.getClass();
                break;
            case 2:
                analyticsListener.getClass();
                break;
            case 3:
                analyticsListener.getClass();
                break;
            case 4:
                analyticsListener.getClass();
                break;
            case 5:
                analyticsListener.getClass();
                break;
            case 6:
            default:
                analyticsListener.getClass();
                break;
            case 7:
                analyticsListener.getClass();
                break;
            case 8:
                analyticsListener.getClass();
                break;
            case 9:
                analyticsListener.getClass();
                break;
            case 10:
                analyticsListener.getClass();
                break;
            case 11:
                analyticsListener.getClass();
                break;
            case 12:
                analyticsListener.getClass();
                break;
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference
    public void release() {
    }

    public /* synthetic */ f(AnalyticsListener.EventTime eventTime) {
        this.X = 2;
    }
}
