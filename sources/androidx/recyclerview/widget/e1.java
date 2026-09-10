package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4759k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4760m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4761n;

    public final void a(int i10) {
        if ((this.f4752d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f4752d));
    }

    public final int b() {
        return this.f4755g ? this.f4750b - this.f4751c : this.f4753e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
        sb2.append(this.f4749a);
        sb2.append(", mData=null, mItemCount=");
        sb2.append(this.f4753e);
        sb2.append(", mIsMeasuring=");
        sb2.append(this.f4757i);
        sb2.append(", mPreviousLayoutItemCount=");
        sb2.append(this.f4750b);
        sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb2.append(this.f4751c);
        sb2.append(", mStructureChanged=");
        sb2.append(this.f4754f);
        sb2.append(", mInPreLayout=");
        sb2.append(this.f4755g);
        sb2.append(", mRunSimpleAnimations=");
        sb2.append(this.f4758j);
        sb2.append(", mRunPredictiveAnimations=");
        return defpackage.e.t(sb2, this.f4759k, '}');
    }
}
