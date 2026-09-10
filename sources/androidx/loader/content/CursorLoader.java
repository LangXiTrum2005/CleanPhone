package androidx.loader.content;

import android.database.Cursor;
import androidx.core.content.ContentResolverCompat;
import androidx.core.os.CancellationSignal;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class CursorLoader extends AsyncTaskLoader<Cursor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Cursor f5306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CancellationSignal f5307b;

    @Override // androidx.loader.content.Loader
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void deliverResult(Cursor cursor) {
        if (isReset()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f5306a;
        this.f5306a = cursor;
        if (isStarted()) {
            super.deliverResult(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            try {
                CancellationSignal cancellationSignal = this.f5307b;
                if (cancellationSignal != null) {
                    cancellationSignal.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader, androidx.loader.content.Loader
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println((Object) null);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString((Object[]) null));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println((String) null);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString((Object[]) null));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println((String) null);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f5306a);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.mContentChanged);
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final Object loadInBackground() {
        synchronized (this) {
            if (isLoadInBackgroundCanceled()) {
                throw new OperationCanceledException();
            }
            this.f5307b = new CancellationSignal();
        }
        try {
            Cursor cursorA = ContentResolverCompat.a(getContext().getContentResolver(), this.f5307b);
            if (cursorA != null) {
                try {
                    cursorA.getCount();
                    cursorA.registerContentObserver(null);
                } catch (RuntimeException e2) {
                    cursorA.close();
                    throw e2;
                }
            }
            synchronized (this) {
                this.f5307b = null;
            }
            return cursorA;
        } catch (Throwable th) {
            synchronized (this) {
                this.f5307b = null;
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final void onCanceled(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (cursor2 == null || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // androidx.loader.content.Loader
    public final void onReset() {
        super.onReset();
        cancelLoad();
        Cursor cursor = this.f5306a;
        if (cursor != null && !cursor.isClosed()) {
            this.f5306a.close();
        }
        this.f5306a = null;
    }

    @Override // androidx.loader.content.Loader
    public final void onStartLoading() {
        Cursor cursor = this.f5306a;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.f5306a == null) {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.Loader
    public final void onStopLoading() {
        cancelLoad();
    }
}
