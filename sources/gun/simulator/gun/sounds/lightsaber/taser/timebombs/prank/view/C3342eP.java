package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3342eP implements InterfaceC3299dt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3299dt f4318a;
    public final C3974ld0 b;

    public C3342eP(InterfaceC3299dt interfaceC3299dt, C3974ld0 c3974ld0) {
        this.f4318a = interfaceC3299dt;
        this.b = c3974ld0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final boolean a(int i, long j) {
        return this.f4318a.a(i, j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final boolean b(long j, AbstractC2567Le abstractC2567Le, List list) {
        return this.f4318a.b(j, abstractC2567Le, list);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final boolean blacklist(int i, long j) {
        return this.f4318a.blacklist(i, j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final void c(long j, long j2, long j3, List list, InterfaceC3954lN[] interfaceC3954lNArr) {
        this.f4318a.c(j, j2, j3, list, interfaceC3954lNArr);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int d(C4619sw c4619sw) {
        return this.f4318a.d(c4619sw);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final void disable() {
        this.f4318a.disable();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final void e() {
        this.f4318a.e();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final void enable() {
        this.f4318a.enable();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3342eP)) {
            return false;
        }
        C3342eP c3342eP = (C3342eP) obj;
        return this.f4318a.equals(c3342eP.f4318a) && this.b.equals(c3342eP.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int evaluateQueueSize(long j, List list) {
        return this.f4318a.evaluateQueueSize(j, list);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final void f(boolean z) {
        this.f4318a.f(z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final void g() {
        this.f4318a.g();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final C4619sw getFormat(int i) {
        return this.f4318a.getFormat(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int getIndexInTrackGroup(int i) {
        return this.f4318a.getIndexInTrackGroup(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final C4619sw getSelectedFormat() {
        return this.f4318a.getSelectedFormat();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int getSelectedIndex() {
        return this.f4318a.getSelectedIndex();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int getSelectedIndexInTrackGroup() {
        return this.f4318a.getSelectedIndexInTrackGroup();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final Object getSelectionData() {
        return this.f4318a.getSelectionData();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int getSelectionReason() {
        return this.f4318a.getSelectionReason();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final C3974ld0 getTrackGroup() {
        return this.b;
    }

    public final int hashCode() {
        return this.f4318a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int indexOf(int i) {
        return this.f4318a.indexOf(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int length() {
        return this.f4318a.length();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final void onPlaybackSpeed(float f) {
        this.f4318a.onPlaybackSpeed(f);
    }
}
