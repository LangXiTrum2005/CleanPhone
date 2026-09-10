package f2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements i2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.r f40383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1.q0 f40384b;

    public k0(i2.r rVar, i1.q0 q0Var) {
        this.f40383a = rVar;
        this.f40384b = q0Var;
    }

    @Override // i2.r
    public final boolean a(int i10, long j10) {
        return this.f40383a.a(i10, j10);
    }

    @Override // i2.r
    public final void b(long j10, long j11, long j12, List list, g2.n[] nVarArr) {
        this.f40383a.b(j10, j11, j12, list, nVarArr);
    }

    @Override // i2.r
    public final boolean c(int i10, long j10) {
        return this.f40383a.c(i10, j10);
    }

    @Override // i2.r
    public final boolean d(long j10, g2.f fVar, List list) {
        return this.f40383a.d(j10, fVar, list);
    }

    @Override // i2.r
    public final void disable() {
        this.f40383a.disable();
    }

    @Override // i2.r
    public final void e() {
        this.f40383a.e();
    }

    @Override // i2.r
    public final void enable() {
        this.f40383a.enable();
    }

    public final boolean equals(Object obj) {
        if (i(obj) && (obj instanceof k0)) {
            return this.f40384b.equals(((k0) obj).f40384b);
        }
        return false;
    }

    @Override // i2.r
    public final int evaluateQueueSize(long j10, List list) {
        return this.f40383a.evaluateQueueSize(j10, list);
    }

    @Override // i2.r
    public final int f(i1.p pVar) {
        return this.f40383a.indexOf(this.f40384b.a(pVar));
    }

    @Override // i2.r
    public final void g(boolean z10) {
        this.f40383a.g(z10);
    }

    @Override // i2.r
    public final i1.p getFormat(int i10) {
        return this.f40384b.f42662d[this.f40383a.getIndexInTrackGroup(i10)];
    }

    @Override // i2.r
    public final int getIndexInTrackGroup(int i10) {
        return this.f40383a.getIndexInTrackGroup(i10);
    }

    @Override // i2.r
    public final i1.p getSelectedFormat() {
        return this.f40384b.f42662d[this.f40383a.getSelectedIndexInTrackGroup()];
    }

    @Override // i2.r
    public final int getSelectedIndex() {
        return this.f40383a.getSelectedIndex();
    }

    @Override // i2.r
    public final int getSelectedIndexInTrackGroup() {
        return this.f40383a.getSelectedIndexInTrackGroup();
    }

    @Override // i2.r
    public final Object getSelectionData() {
        return this.f40383a.getSelectionData();
    }

    @Override // i2.r
    public final int getSelectionReason() {
        return this.f40383a.getSelectionReason();
    }

    @Override // i2.r
    public final i1.q0 getTrackGroup() {
        return this.f40384b;
    }

    @Override // i2.r
    public final void h() {
        this.f40383a.h();
    }

    public final int hashCode() {
        return this.f40384b.hashCode() + (this.f40383a.hashCode() * 31);
    }

    public final boolean i(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            return this.f40383a.equals(((k0) obj).f40383a);
        }
        return false;
    }

    @Override // i2.r
    public final int indexOf(int i10) {
        return this.f40383a.indexOf(i10);
    }

    @Override // i2.r
    public final int length() {
        return this.f40383a.length();
    }

    @Override // i2.r
    public final void onPlaybackSpeed(float f10) {
        this.f40383a.onPlaybackSpeed(f10);
    }
}
