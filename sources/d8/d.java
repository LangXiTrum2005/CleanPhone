package d8;

import an.o;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.ads.ln0;
import java.io.IOException;
import kotlin.jvm.internal.n;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ln0 f38770b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ln0 ln0Var, int i10, Handler handler) {
        super(handler);
        this.f38770b = ln0Var;
        this.f38769a = i10;
        n.e(Uri.parse("content://media"), "parse(...)");
    }

    public final wj.f a(long j10) throws IOException {
        Cursor cursorB = b((Uri) this.f38770b.f17075f, new String[]{"bucket_id", "bucket_display_name"}, new String[]{String.valueOf(j10)});
        if (cursorB != null) {
            Cursor cursor = cursorB;
            try {
                if (cursorB.moveToNext()) {
                    long j11 = cursorB.getLong(cursorB.getColumnIndex("bucket_id"));
                    wj.f fVar = new wj.f(Long.valueOf(j11), cursorB.getString(cursorB.getColumnIndex("bucket_display_name")));
                    cursor.close();
                    return fVar;
                }
                cursor.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    i0.j(cursor, th2);
                    throw th3;
                }
            }
        }
        return new wj.f(null, null);
    }

    public final Cursor b(Uri uri, String[] strArr, String[] strArr2) {
        try {
            ContentResolver contentResolver = ((Context) this.f38770b.f17071b).getContentResolver();
            n.e(contentResolver, "getContentResolver(...)");
            return contentResolver.query(uri, strArr, "_id = ?", strArr2, null);
        } catch (IllegalArgumentException e10) {
            g8.f.f41737a.getClass();
            if (!g8.e.b(e10)) {
                throw e10;
            }
            l8.a.c("MediaStore observer query hit missing volume, dropping event", e10);
            return null;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) throws IOException {
        if (uri == null) {
            return;
        }
        String lastPathSegment = uri.getLastPathSegment();
        Long lF0 = lastPathSegment != null ? o.f0(lastPathSegment) : null;
        ln0 ln0Var = this.f38770b;
        if (lF0 == null) {
            ln0Var.f(uri, "delete", null, null, this.f38769a);
            return;
        }
        Cursor cursorB = b((Uri) ln0Var.f17075f, new String[]{"date_added", "date_modified", "media_type"}, new String[]{lF0.toString()});
        if (cursorB != null) {
            Cursor cursor = cursorB;
            try {
                if (!cursorB.moveToNext()) {
                    ln0Var.f(uri, "delete", lF0, null, this.f38769a);
                    cursor.close();
                    return;
                }
                String str = (System.currentTimeMillis() / ((long) 1000)) - cursorB.getLong(cursorB.getColumnIndex("date_added")) < 30 ? "insert" : "update";
                int i10 = cursorB.getInt(cursorB.getColumnIndex("media_type"));
                wj.f fVarA = a(lF0.longValue());
                Long l = (Long) fVarA.f53283a;
                String str2 = (String) fVarA.f53284b;
                if (l != null && str2 != null) {
                    ln0Var.f(uri, str, lF0, l, i10);
                    cursor.close();
                    return;
                }
                cursor.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    i0.j(cursor, th2);
                    throw th3;
                }
            }
        }
    }
}
