package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f4968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4969k;

    public final void a(View view) {
        int layoutPosition;
        int size = this.f4968j.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((h1) this.f4968j.get(i11)).itemView;
            s0 s0Var = (s0) view3.getLayoutParams();
            if (view3 != view && !s0Var.f4925a.isRemoved() && (layoutPosition = (s0Var.f4925a.getLayoutPosition() - this.f4962d) * this.f4963e) >= 0 && layoutPosition < i10) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i10 = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f4962d = -1;
        } else {
            this.f4962d = ((s0) view2.getLayoutParams()).f4925a.getLayoutPosition();
        }
    }

    public final View b(y0 y0Var) {
        List list = this.f4968j;
        if (list == null) {
            View view = y0Var.j(this.f4962d, Long.MAX_VALUE).itemView;
            this.f4962d += this.f4963e;
            return view;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = ((h1) this.f4968j.get(i10)).itemView;
            s0 s0Var = (s0) view2.getLayoutParams();
            if (!s0Var.f4925a.isRemoved() && this.f4962d == s0Var.f4925a.getLayoutPosition()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
