package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: loaded from: classes.dex */
class CursorFilter extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CursorAdapter f4577a;

    public interface CursorFilterClient {
        void a(Cursor cursor);

        String b(Cursor cursor);

        Cursor c(CharSequence charSequence);
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.f4577a.b((Cursor) obj);
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorC = this.f4577a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorC != null) {
            filterResults.count = cursorC.getCount();
            filterResults.values = cursorC;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        CursorAdapter cursorAdapter = this.f4577a;
        Cursor cursor = cursorAdapter.Z;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        cursorAdapter.a((Cursor) obj);
    }
}
