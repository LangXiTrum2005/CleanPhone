package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class ResourceCursorAdapter extends CursorAdapter {
    public final int j0;
    public final int k0;
    public final LayoutInflater l0;

    public ResourceCursorAdapter(Context context, int i2) {
        this.f4574Y = true;
        this.Z = null;
        this.X = false;
        this.e0 = context;
        this.f0 = -1;
        this.g0 = new CursorAdapter.ChangeObserver(this);
        this.h0 = new CursorAdapter.MyDataSetObserver(this);
        this.k0 = i2;
        this.j0 = i2;
        this.l0 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final View e(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.l0.inflate(this.k0, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.l0.inflate(this.j0, viewGroup, false);
    }
}
