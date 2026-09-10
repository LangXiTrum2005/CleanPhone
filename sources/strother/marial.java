package strother;

import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: CuesWithTiming.java */
/* JADX INFO: loaded from: classes.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ImmutableList<libya.attabal> f38194attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f38195dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f38196saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f38197wireman;

    public marial(List<libya.attabal> list, long j, long j2) {
        this.f38194attabal = ImmutableList.copyOf((Collection) list);
        this.f38196saneness = j;
        this.f38195dern = j2;
        long j3 = C.TIME_UNSET;
        if (j != C.TIME_UNSET && j2 != C.TIME_UNSET) {
            j3 = j + j2;
        }
        this.f38197wireman = j3;
    }
}
