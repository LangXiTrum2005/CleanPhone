package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import g9.k;
import o.a0;
import o.l;
import o.m;
import o.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, a0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f3848b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f3849a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        k kVarZ = k.z(context, attributeSet, f3848b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) kVarZ.f41771c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(kVarZ.s(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(kVarZ.s(1));
        }
        kVarZ.B();
    }

    @Override // o.a0
    public final void a(m mVar) {
        this.f3849a = mVar;
    }

    @Override // o.l
    public final boolean b(o oVar) {
        return this.f3849a.q(oVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b((o) getAdapter().getItem(i10));
    }
}
