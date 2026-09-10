package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.v4.media.a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilter.CursorFilterClient {
    public boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f4574Y;
    public Cursor Z;
    public Context e0;
    public int f0;
    public ChangeObserver g0;
    public DataSetObserver h0;
    public CursorFilter i0;

    public class ChangeObserver extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ResourceCursorAdapter f4575a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeObserver(ResourceCursorAdapter resourceCursorAdapter) {
            super(new Handler());
            this.f4575a = resourceCursorAdapter;
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z2) {
            Cursor cursor;
            ResourceCursorAdapter resourceCursorAdapter = this.f4575a;
            if (!resourceCursorAdapter.f4574Y || (cursor = resourceCursorAdapter.Z) == null || cursor.isClosed()) {
                return;
            }
            resourceCursorAdapter.X = resourceCursorAdapter.Z.requery();
        }
    }

    public class MyDataSetObserver extends DataSetObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ResourceCursorAdapter f4576a;

        public MyDataSetObserver(ResourceCursorAdapter resourceCursorAdapter) {
            this.f4576a = resourceCursorAdapter;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ResourceCursorAdapter resourceCursorAdapter = this.f4576a;
            resourceCursorAdapter.X = true;
            resourceCursorAdapter.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ResourceCursorAdapter resourceCursorAdapter = this.f4576a;
            resourceCursorAdapter.X = false;
            resourceCursorAdapter.notifyDataSetInvalidated();
        }
    }

    public void a(Cursor cursor) {
        Cursor cursorG = g(cursor);
        if (cursorG != null) {
            cursorG.close();
        }
    }

    public String b(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public Cursor c(CharSequence charSequence) {
        return this.Z;
    }

    public abstract void d(View view, Cursor cursor);

    public View e(Context context, Cursor cursor, ViewGroup viewGroup) {
        return f(context, cursor, viewGroup);
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public Cursor g(Cursor cursor) {
        Cursor cursor2 = this.Z;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            ChangeObserver changeObserver = this.g0;
            if (changeObserver != null) {
                cursor2.unregisterContentObserver(changeObserver);
            }
            DataSetObserver dataSetObserver = this.h0;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.Z = cursor;
        if (cursor == null) {
            this.f0 = -1;
            this.X = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        ChangeObserver changeObserver2 = this.g0;
        if (changeObserver2 != null) {
            cursor.registerContentObserver(changeObserver2);
        }
        DataSetObserver dataSetObserver2 = this.h0;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f0 = cursor.getColumnIndexOrThrow("_id");
        this.X = true;
        notifyDataSetChanged();
        return cursor2;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.X || (cursor = this.Z) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.X) {
            return null;
        }
        this.Z.moveToPosition(i2);
        if (view == null) {
            view = e(this.e0, this.Z, viewGroup);
        }
        d(view, this.Z);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.i0 == null) {
            CursorFilter cursorFilter = new CursorFilter();
            cursorFilter.f4577a = this;
            this.i0 = cursorFilter;
        }
        return this.i0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.X || (cursor = this.Z) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.Z;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (this.X && (cursor = this.Z) != null && cursor.moveToPosition(i2)) {
            return this.Z.getLong(this.f0);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.X) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.Z.moveToPosition(i2)) {
            throw new IllegalStateException(a.h(i2, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = f(this.e0, this.Z, viewGroup);
        }
        d(view, this.Z);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
