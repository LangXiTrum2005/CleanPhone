package y8;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f54334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r8.i f54335b;

    public /* synthetic */ e(long j10, r8.i iVar) {
        this.f54334a = j10;
        this.f54335b = iVar;
    }

    @Override // y8.f
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f54334a));
        r8.i iVar = this.f54335b;
        String str = iVar.f49489a;
        o8.d dVar = iVar.f49491c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(b9.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f49489a);
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(b9.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
