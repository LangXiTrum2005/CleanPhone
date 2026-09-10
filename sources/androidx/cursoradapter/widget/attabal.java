package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: compiled from: CursorFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal extends Filter {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public InterfaceC0066attabal f9514attabal;

    /* JADX INFO: renamed from: androidx.cursoradapter.widget.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CursorFilter.java */
    public interface InterfaceC0066attabal {
        void changeCursor(Cursor cursor);

        CharSequence convertToString(Cursor cursor);

        Cursor getCursor();

        Cursor runQueryOnBackgroundThread(CharSequence charSequence);
    }

    public attabal(InterfaceC0066attabal interfaceC0066attabal) {
        this.f9514attabal = interfaceC0066attabal;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f9514attabal.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorRunQueryOnBackgroundThread = this.f9514attabal.runQueryOnBackgroundThread(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorRunQueryOnBackgroundThread != null) {
            filterResults.count = cursorRunQueryOnBackgroundThread.getCount();
            filterResults.values = cursorRunQueryOnBackgroundThread;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursor = this.f9514attabal.getCursor();
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        this.f9514attabal.changeCursor((Cursor) obj);
    }
}
