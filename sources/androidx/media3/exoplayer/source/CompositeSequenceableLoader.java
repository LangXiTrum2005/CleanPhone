package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.LoadingInfo;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CompositeSequenceableLoader implements SequenceableLoader {
    public final ImmutableList X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f6351Y;

    public static final class SequenceableLoaderWithTrackTypes implements SequenceableLoader {
        public final SequenceableLoader X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ImmutableList f6352Y;

        public SequenceableLoaderWithTrackTypes(SequenceableLoader sequenceableLoader, List list) {
            this.X = sequenceableLoader;
            this.f6352Y = ImmutableList.u(list);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final boolean a(LoadingInfo loadingInfo) {
            return this.X.a(loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final long getBufferedPositionUs() {
            return this.X.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final long getNextLoadPositionUs() {
            return this.X.getNextLoadPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final boolean isLoading() {
            return this.X.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final void reevaluateBuffer(long j) {
            this.X.reevaluateBuffer(j);
        }
    }

    public CompositeSequenceableLoader(List list, List list2) {
        ImmutableList.Builder builderS = ImmutableList.s();
        Assertions.b(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            builderS.h(new SequenceableLoaderWithTrackTypes((SequenceableLoader) list.get(i2), (List) list2.get(i2)));
        }
        this.X = builderS.j();
        this.f6351Y = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean a(LoadingInfo loadingInfo) {
        boolean zA;
        boolean z2 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z2;
            }
            int i2 = 0;
            zA = false;
            while (true) {
                ImmutableList immutableList = this.X;
                if (i2 >= immutableList.size()) {
                    break;
                }
                long nextLoadPositionUs2 = ((SequenceableLoaderWithTrackTypes) immutableList.get(i2)).X.getNextLoadPositionUs();
                boolean z3 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= loadingInfo.f5916a;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z3) {
                    zA |= ((SequenceableLoaderWithTrackTypes) immutableList.get(i2)).X.a(loadingInfo);
                }
                i2++;
            }
            z2 |= zA;
        } while (zA);
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        int i2 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            ImmutableList immutableList = this.X;
            if (i2 >= immutableList.size()) {
                break;
            }
            SequenceableLoaderWithTrackTypes sequenceableLoaderWithTrackTypes = (SequenceableLoaderWithTrackTypes) immutableList.get(i2);
            long bufferedPositionUs = sequenceableLoaderWithTrackTypes.getBufferedPositionUs();
            ImmutableList immutableList2 = sequenceableLoaderWithTrackTypes.f6352Y;
            if ((immutableList2.contains(1) || immutableList2.contains(2) || immutableList2.contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, bufferedPositionUs);
            }
            i2++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f6351Y = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.f6351Y;
        return j != -9223372036854775807L ? j : jMin2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        int i2 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            ImmutableList immutableList = this.X;
            if (i2 >= immutableList.size()) {
                break;
            }
            long nextLoadPositionUs = ((SequenceableLoaderWithTrackTypes) immutableList.get(i2)).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
            i2++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        int i2 = 0;
        while (true) {
            ImmutableList immutableList = this.X;
            if (i2 >= immutableList.size()) {
                return false;
            }
            if (((SequenceableLoaderWithTrackTypes) immutableList.get(i2)).isLoading()) {
                return true;
            }
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        int i2 = 0;
        while (true) {
            ImmutableList immutableList = this.X;
            if (i2 >= immutableList.size()) {
                return;
            }
            ((SequenceableLoaderWithTrackTypes) immutableList.get(i2)).reevaluateBuffer(j);
            i2++;
        }
    }
}
