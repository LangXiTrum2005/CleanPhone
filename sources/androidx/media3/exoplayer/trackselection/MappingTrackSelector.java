package androidx.media3.exoplayer.trackselection;

import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class MappingTrackSelector extends TrackSelector {

    public static final class MappedTrackInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f6533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TrackGroupArray[] f6534c;
        public final int[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[][][] f6535e;
        public final TrackGroupArray f;

        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RendererSupport {
        }

        public MappedTrackInfo(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.f6533b = iArr;
            this.f6534c = trackGroupArrayArr;
            this.f6535e = iArr3;
            this.d = iArr2;
            this.f = trackGroupArray;
            this.f6532a = iArr.length;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final TrackSelectorResult f(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
        int[][][] iArr;
        int i2;
        boolean z2;
        boolean z3;
        Format[] formatArr;
        int i3;
        int[] iArr2;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        boolean z4 = true;
        int[] iArr3 = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr4 = new int[rendererCapabilitiesArr.length + 1][][];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = trackGroupArray2.f6463a;
            trackGroupArr[i4] = new TrackGroup[i5];
            iArr4[i4] = new int[i5][];
        }
        int length2 = rendererCapabilitiesArr.length;
        int[] iArr5 = new int[length2];
        for (int i6 = 0; i6 < length2; i6++) {
            iArr5[i6] = rendererCapabilitiesArr[i6].supportsMixedMimeTypeAdaptation();
        }
        int i7 = 0;
        while (i7 < trackGroupArray2.f6463a) {
            TrackGroup trackGroupA = trackGroupArray2.a(i7);
            boolean z5 = trackGroupA.f5523c == 5 ? z4 : false;
            int length3 = rendererCapabilitiesArr.length;
            boolean z6 = z4;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int length4 = rendererCapabilitiesArr.length;
                z3 = z4;
                formatArr = trackGroupA.d;
                i3 = trackGroupA.f5521a;
                if (i8 >= length4) {
                    break;
                }
                RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i8];
                int[] iArr6 = iArr3;
                int i10 = 0;
                int iMax = 0;
                while (i10 < i3) {
                    int i11 = i10;
                    iMax = Math.max(iMax, rendererCapabilities.a(formatArr[i11]) & 7);
                    i10 = i11 + 1;
                }
                boolean z7 = iArr6[i8] == 0 ? z3 : false;
                if (iMax > i9 || (iMax == i9 && z5 && !z6 && z7)) {
                    z6 = z7;
                    i9 = iMax;
                    length3 = i8;
                }
                i8++;
                z4 = z3;
                iArr3 = iArr6;
            }
            int[] iArr7 = iArr3;
            if (length3 == rendererCapabilitiesArr.length) {
                iArr2 = new int[i3];
            } else {
                RendererCapabilities rendererCapabilities2 = rendererCapabilitiesArr[length3];
                int[] iArr8 = new int[i3];
                for (int i12 = 0; i12 < i3; i12++) {
                    iArr8[i12] = rendererCapabilities2.a(formatArr[i12]);
                }
                iArr2 = iArr8;
            }
            int i13 = iArr7[length3];
            trackGroupArr[length3][i13] = trackGroupA;
            iArr4[length3][i13] = iArr2;
            iArr7[length3] = i13 + 1;
            i7++;
            trackGroupArray2 = trackGroupArray;
            z4 = z3;
            iArr3 = iArr7;
        }
        int[] iArr9 = iArr3;
        boolean z8 = z4;
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilitiesArr.length];
        String[] strArr = new String[rendererCapabilitiesArr.length];
        int[] iArr10 = new int[rendererCapabilitiesArr.length];
        for (int i14 = 0; i14 < rendererCapabilitiesArr.length; i14++) {
            int i15 = iArr9[i14];
            trackGroupArrayArr[i14] = new TrackGroupArray((TrackGroup[]) Util.K(trackGroupArr[i14], i15));
            iArr4[i14] = (int[][]) Util.K(iArr4[i14], i15);
            strArr[i14] = rendererCapabilitiesArr[i14].getName();
            iArr10[i14] = rendererCapabilitiesArr[i14].getTrackType();
        }
        MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(iArr10, trackGroupArrayArr, iArr5, iArr4, new TrackGroupArray((TrackGroup[]) Util.K(trackGroupArr[rendererCapabilitiesArr.length], iArr9[rendererCapabilitiesArr.length])));
        Pair pairI = i(mappedTrackInfo, iArr4, iArr5, mediaPeriodId, timeline);
        TrackSelection[] trackSelectionArr = (TrackSelection[]) pairI.second;
        List[] listArr = new List[trackSelectionArr.length];
        for (int i16 = 0; i16 < trackSelectionArr.length; i16++) {
            TrackSelection trackSelection = trackSelectionArr[i16];
            listArr[i16] = trackSelection != null ? ImmutableList.z(trackSelection) : ImmutableList.x();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i17 = 0;
        while (i17 < mappedTrackInfo.f6532a) {
            TrackGroupArray[] trackGroupArrayArr2 = mappedTrackInfo.f6534c;
            TrackGroupArray trackGroupArray3 = trackGroupArrayArr2[i17];
            List list = listArr[i17];
            int i18 = 0;
            while (i18 < trackGroupArray3.f6463a) {
                TrackGroup trackGroupA2 = trackGroupArray3.a(i18);
                int i19 = trackGroupArrayArr2[i17].a(i18).f5521a;
                int[] iArr11 = new int[i19];
                int i20 = 0;
                int i21 = 0;
                while (true) {
                    iArr = mappedTrackInfo.f6535e;
                    if (i20 >= i19) {
                        break;
                    }
                    if ((iArr[i17][i18][i20] & 7) == 4) {
                        iArr11[i21] = i20;
                        i21++;
                    }
                    i20++;
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr11, i21);
                int iMin = 16;
                String str = null;
                List[] listArr2 = listArr;
                int i22 = 0;
                boolean z9 = false;
                int i23 = 0;
                while (i22 < iArrCopyOf.length) {
                    String str2 = trackGroupArrayArr2[i17].a(i18).d[iArrCopyOf[i22]].m;
                    int i24 = i23 + 1;
                    if (i23 == 0) {
                        str = str2;
                    } else {
                        z9 |= !Util.a(str, str2);
                    }
                    iMin = Math.min(iMin, iArr[i17][i18][i22] & 24);
                    i22++;
                    i23 = i24;
                }
                if (z9) {
                    iMin = Math.min(iMin, mappedTrackInfo.d[i17]);
                }
                boolean z10 = iMin != 0 ? z8 : false;
                int i25 = trackGroupA2.f5521a;
                int[] iArr12 = new int[i25];
                boolean[] zArr = new boolean[i25];
                int i26 = 0;
                while (i26 < trackGroupA2.f5521a) {
                    iArr12[i26] = iArr[i17][i18][i26] & 7;
                    int i27 = 0;
                    while (true) {
                        if (i27 >= list.size()) {
                            i2 = i17;
                            z2 = false;
                            break;
                        }
                        TrackSelection trackSelection2 = (TrackSelection) list.get(i27);
                        i2 = i17;
                        if (trackSelection2.getTrackGroup().equals(trackGroupA2) && trackSelection2.indexOf(i26) != -1) {
                            z2 = z8;
                            break;
                        }
                        i27++;
                        i17 = i2;
                    }
                    zArr[i26] = z2;
                    i26++;
                    i17 = i2;
                }
                builder.h(new Tracks.Group(trackGroupA2, z10, iArr12, zArr));
                i18++;
                i17 = i17;
                listArr = listArr2;
            }
            i17++;
        }
        int i28 = 0;
        while (true) {
            TrackGroupArray trackGroupArray4 = mappedTrackInfo.f;
            if (i28 >= trackGroupArray4.f6463a) {
                return new TrackSelectorResult((RendererConfiguration[]) pairI.first, (ExoTrackSelection[]) pairI.second, new Tracks(builder.j()), mappedTrackInfo);
            }
            TrackGroup trackGroupA3 = trackGroupArray4.a(i28);
            int[] iArr13 = new int[trackGroupA3.f5521a];
            Arrays.fill(iArr13, 0);
            builder.h(new Tracks.Group(trackGroupA3, false, iArr13, new boolean[trackGroupA3.f5521a]));
            i28++;
        }
    }

    public abstract Pair i(MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final void d(MappedTrackInfo mappedTrackInfo) {
    }
}
