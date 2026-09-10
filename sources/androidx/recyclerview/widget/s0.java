package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class s0 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h1 f4925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f4926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4928d;

    public s0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4926b = new Rect();
        this.f4927c = true;
        this.f4928d = false;
    }

    public s0(int i10, int i11) {
        super(i10, i11);
        this.f4926b = new Rect();
        this.f4927c = true;
        this.f4928d = false;
    }

    public s0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4926b = new Rect();
        this.f4927c = true;
        this.f4928d = false;
    }

    public s0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4926b = new Rect();
        this.f4927c = true;
        this.f4928d = false;
    }

    public s0(s0 s0Var) {
        super((ViewGroup.LayoutParams) s0Var);
        this.f4926b = new Rect();
        this.f4927c = true;
        this.f4928d = false;
    }
}
