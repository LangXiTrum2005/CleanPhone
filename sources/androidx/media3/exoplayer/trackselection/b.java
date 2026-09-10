package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {
    public final /* synthetic */ int X;

    public /* synthetic */ b(int i2) {
        this.X = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i2 = 5;
        int i3 = 4;
        ComparisonChain comparisonChain = ComparisonChain.f19806a;
        switch (this.X) {
            case 0:
                return Integer.compare(((DefaultTrackSelector.ImageTrackInfo) ((List) obj).get(0)).g0, ((DefaultTrackSelector.ImageTrackInfo) ((List) obj2).get(0)).g0);
            case 1:
                return ((DefaultTrackSelector.AudioTrackInfo) Collections.max((List) obj)).d((DefaultTrackSelector.AudioTrackInfo) Collections.max((List) obj2));
            case 2:
                List list = (List) obj;
                List list2 = (List) obj2;
                return comparisonChain.c((DefaultTrackSelector.VideoTrackInfo) Collections.max(list, new b(i3)), (DefaultTrackSelector.VideoTrackInfo) Collections.max(list2, new b(i3)), new b(i3)).a(list.size(), list2.size()).c((DefaultTrackSelector.VideoTrackInfo) Collections.max(list, new b(i2)), (DefaultTrackSelector.VideoTrackInfo) Collections.max(list2, new b(i2)), new b(i2)).f();
            case 3:
                return ((DefaultTrackSelector.TextTrackInfo) ((List) obj).get(0)).d((DefaultTrackSelector.TextTrackInfo) ((List) obj2).get(0));
            case 4:
                DefaultTrackSelector.VideoTrackInfo videoTrackInfo = (DefaultTrackSelector.VideoTrackInfo) obj;
                DefaultTrackSelector.VideoTrackInfo videoTrackInfo2 = (DefaultTrackSelector.VideoTrackInfo) obj2;
                ComparisonChain comparisonChainC = comparisonChain.d(videoTrackInfo.i0, videoTrackInfo2.i0).a(videoTrackInfo.n0, videoTrackInfo2.n0).d(videoTrackInfo.o0, videoTrackInfo2.o0).d(videoTrackInfo.j0, videoTrackInfo2.j0).d(videoTrackInfo.f0, videoTrackInfo2.f0).d(videoTrackInfo.h0, videoTrackInfo2.h0).c(Integer.valueOf(videoTrackInfo.m0), Integer.valueOf(videoTrackInfo2.m0), Ordering.d().j());
                boolean z2 = videoTrackInfo2.r0;
                boolean z3 = videoTrackInfo.r0;
                ComparisonChain comparisonChainD = comparisonChainC.d(z3, z2);
                boolean z4 = videoTrackInfo2.s0;
                boolean z5 = videoTrackInfo.s0;
                ComparisonChain comparisonChainD2 = comparisonChainD.d(z5, z4);
                if (z3 && z5) {
                    comparisonChainD2 = comparisonChainD2.a(videoTrackInfo.t0, videoTrackInfo2.t0);
                }
                return comparisonChainD2.f();
            case 5:
                DefaultTrackSelector.VideoTrackInfo videoTrackInfo3 = (DefaultTrackSelector.VideoTrackInfo) obj;
                DefaultTrackSelector.VideoTrackInfo videoTrackInfo4 = (DefaultTrackSelector.VideoTrackInfo) obj2;
                Ordering orderingJ = (videoTrackInfo3.f0 && videoTrackInfo3.i0) ? DefaultTrackSelector.j : DefaultTrackSelector.j.j();
                videoTrackInfo3.g0.getClass();
                return comparisonChain.c(Integer.valueOf(videoTrackInfo3.l0), Integer.valueOf(videoTrackInfo4.l0), orderingJ).c(Integer.valueOf(videoTrackInfo3.k0), Integer.valueOf(videoTrackInfo4.k0), orderingJ).f();
            case 6:
                return ((Format) obj2).f5411i - ((Format) obj).f5411i;
            default:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                Ordering ordering = DefaultTrackSelector.j;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
        }
    }
}
