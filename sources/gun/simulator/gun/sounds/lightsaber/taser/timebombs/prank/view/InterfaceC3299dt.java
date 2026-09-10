package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3299dt {
    boolean a(int i, long j);

    boolean b(long j, AbstractC2567Le abstractC2567Le, List list);

    boolean blacklist(int i, long j);

    void c(long j, long j2, long j3, List list, InterfaceC3954lN[] interfaceC3954lNArr);

    int d(C4619sw c4619sw);

    void disable();

    void e();

    void enable();

    int evaluateQueueSize(long j, List list);

    void f(boolean z);

    void g();

    C4619sw getFormat(int i);

    int getIndexInTrackGroup(int i);

    C4619sw getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    C3974ld0 getTrackGroup();

    int indexOf(int i);

    int length();

    void onPlaybackSpeed(float f);
}
