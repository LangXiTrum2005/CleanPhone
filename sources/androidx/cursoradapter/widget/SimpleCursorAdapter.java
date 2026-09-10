package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class SimpleCursorAdapter extends ResourceCursorAdapter {

    public interface CursorToStringConverter {
    }

    public interface ViewBinder {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final String b(Cursor cursor) {
        return cursor.getString(0);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final void d(View view, Cursor cursor) {
        throw null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final Cursor g(Cursor cursor) {
        if (cursor == null) {
            return super.g(cursor);
        }
        throw null;
    }
}
