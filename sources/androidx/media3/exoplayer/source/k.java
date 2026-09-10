package androidx.media3.exoplayer.source;

import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.Extractor;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Consumer, Function {
    public final /* synthetic */ int X;

    public /* synthetic */ k(int i2) {
        this.X = i2;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((SampleQueue.SharedSampleMetadata) obj).f6441b.release();
    }

    @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        switch (this.X) {
            case 1:
                return ((Extractor) obj).b().getClass().getSimpleName();
            case 2:
                return ImmutableList.u(Lists.c(((MediaPeriod) obj).getTrackGroups().f6464b, new k(3)));
            default:
                TrackGroupArray trackGroupArray = TrackGroupArray.d;
                return Integer.valueOf(((TrackGroup) obj).f5523c);
        }
    }
}
