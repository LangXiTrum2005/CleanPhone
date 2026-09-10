package i2;

import i1.q0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface r {
    boolean a(int i10, long j10);

    void b(long j10, long j11, long j12, List list, g2.n[] nVarArr);

    boolean c(int i10, long j10);

    default boolean d(long j10, g2.f fVar, List list) {
        return false;
    }

    void disable();

    void enable();

    int evaluateQueueSize(long j10, List list);

    int f(i1.p pVar);

    void g(boolean z10);

    i1.p getFormat(int i10);

    int getIndexInTrackGroup(int i10);

    i1.p getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    q0 getTrackGroup();

    int indexOf(int i10);

    int length();

    void onPlaybackSpeed(float f10);

    default void e() {
    }

    default void h() {
    }
}
