package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4948f;

    public void a() {
        this.f4947e = this.f4944b ? ((c0) this.f4948f).g() : ((c0) this.f4948f).k();
    }

    public void b(View view, int i10) {
        if (this.f4944b) {
            int iB = ((c0) this.f4948f).b(view);
            c0 c0Var = (c0) this.f4948f;
            this.f4947e = (Integer.MIN_VALUE == c0Var.f4730a ? 0 : c0Var.l() - c0Var.f4730a) + iB;
        } else {
            this.f4947e = ((c0) this.f4948f).e(view);
        }
        this.f4945c = i10;
    }

    public void c(View view, int i10) {
        c0 c0Var = (c0) this.f4948f;
        int iL = Integer.MIN_VALUE == c0Var.f4730a ? 0 : c0Var.l() - c0Var.f4730a;
        if (iL >= 0) {
            b(view, i10);
            return;
        }
        this.f4945c = i10;
        if (!this.f4944b) {
            int iE = ((c0) this.f4948f).e(view);
            int iK = iE - ((c0) this.f4948f).k();
            this.f4947e = iE;
            if (iK > 0) {
                int iG = (((c0) this.f4948f).g() - Math.min(0, (((c0) this.f4948f).g() - iL) - ((c0) this.f4948f).b(view))) - (((c0) this.f4948f).c(view) + iE);
                if (iG < 0) {
                    this.f4947e -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (((c0) this.f4948f).g() - iL) - ((c0) this.f4948f).b(view);
        this.f4947e = ((c0) this.f4948f).g() - iG2;
        if (iG2 > 0) {
            int iC = this.f4947e - ((c0) this.f4948f).c(view);
            int iK2 = ((c0) this.f4948f).k();
            int iMin = iC - (Math.min(((c0) this.f4948f).e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.f4947e = Math.min(iG2, -iMin) + this.f4947e;
            }
        }
    }

    public void d(int i10) {
        this.f4944b |= i10 > 0;
        this.f4945c += i10;
    }

    public void e() {
        this.f4945c = -1;
        this.f4947e = Integer.MIN_VALUE;
        this.f4944b = false;
        this.f4946d = false;
    }

    public void f(int i10) {
        this.f4944b = 1 == ((this.f4944b ? 1 : 0) | i10);
        this.f4945c += i10;
    }

    public String toString() {
        switch (this.f4943a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
                sb2.append(this.f4945c);
                sb2.append(", mCoordinate=");
                sb2.append(this.f4947e);
                sb2.append(", mLayoutFromEnd=");
                sb2.append(this.f4944b);
                sb2.append(", mValid=");
                return defpackage.e.t(sb2, this.f4946d, '}');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ w(Object obj, int i10) {
        this.f4943a = i10;
        this.f4948f = obj;
    }
}
