package ea;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements p1.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f39931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f39932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f39933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f39934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f39935e;

    public z0(a1 a1Var, String str, long j10) {
        Objects.requireNonNull(a1Var);
        this.f39935e = a1Var;
        k9.c0.e(str);
        this.f39934d = str;
        this.f39932b = j10;
    }

    @Override // p1.l0
    public void a(i1.g0 g0Var) {
        if (this.f39931a) {
            c(getPositionUs());
        }
        this.f39935e = g0Var;
    }

    public void c(long j10) {
        this.f39932b = j10;
        if (this.f39931a) {
            ((l1.u) this.f39934d).getClass();
            this.f39933c = SystemClock.elapsedRealtime();
        }
    }

    public void d() {
        if (this.f39931a) {
            return;
        }
        ((l1.u) this.f39934d).getClass();
        this.f39933c = SystemClock.elapsedRealtime();
        this.f39931a = true;
    }

    public long e() {
        if (!this.f39931a) {
            this.f39931a = true;
            a1 a1Var = (a1) this.f39935e;
            this.f39933c = a1Var.K0().getLong((String) this.f39934d, this.f39932b);
        }
        return this.f39933c;
    }

    public void f(long j10) {
        SharedPreferences.Editor editorEdit = ((a1) this.f39935e).K0().edit();
        editorEdit.putLong((String) this.f39934d, j10);
        editorEdit.apply();
        this.f39933c = j10;
    }

    @Override // p1.l0
    public i1.g0 getPlaybackParameters() {
        return (i1.g0) this.f39935e;
    }

    @Override // p1.l0
    public long getPositionUs() {
        long j10 = this.f39932b;
        if (!this.f39931a) {
            return j10;
        }
        ((l1.u) this.f39934d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f39933c;
        i1.g0 g0Var = (i1.g0) this.f39935e;
        return (g0Var.f42544a == 1.0f ? l1.y.M(jElapsedRealtime) : jElapsedRealtime * ((long) g0Var.f42546c)) + j10;
    }

    public z0(l1.u uVar) {
        this.f39934d = uVar;
        this.f39935e = i1.g0.f42543d;
    }
}
