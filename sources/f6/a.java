package f6;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f40668c = {"_data"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f40669d = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f40671b;

    public /* synthetic */ a(ContentResolver contentResolver, int i10) {
        this.f40670a = i10;
        this.f40671b = contentResolver;
    }

    @Override // f6.c
    public final Cursor a(Uri uri) {
        switch (this.f40670a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f40671b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f40668c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f40671b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f40669d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
