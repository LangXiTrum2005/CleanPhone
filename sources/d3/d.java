package d3;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f38670c;

    public d(List list, long j10, long j11) {
        this.f38668a = j10;
        this.f38669b = j11;
        this.f38670c = Collections.unmodifiableList(list);
    }

    @Override // d3.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f38668a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return defpackage.e.r(sb2, this.f38669b, " }");
    }
}
