package l6;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.e;
import e6.i;
import java.io.File;
import java.io.FileNotFoundException;
import k6.q;
import k6.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f45054k = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f45056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f45057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f45058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f45061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f45062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f45063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile e f45064j;

    public c(Context context, r rVar, r rVar2, Uri uri, int i10, int i11, i iVar, Class cls) {
        this.f45055a = context.getApplicationContext();
        this.f45056b = rVar;
        this.f45057c = rVar2;
        this.f45058d = uri;
        this.f45059e = i10;
        this.f45060f = i11;
        this.f45061g = iVar;
        this.f45062h = cls;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f45062h;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        e eVar = this.f45064j;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f45063i = true;
        e eVar = this.f45064j;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(f fVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        try {
            e eVarE = e();
            if (eVarE == null) {
                dVar.h(new IllegalArgumentException("Failed to build fetcher for: " + this.f45058d));
            } else {
                this.f45064j = eVarE;
                if (this.f45063i) {
                    cancel();
                } else {
                    eVarE.d(fVar, dVar);
                }
            }
        } catch (FileNotFoundException e10) {
            dVar.h(e10);
        }
    }

    public final e e() throws Throwable {
        q qVarB;
        Throwable th2;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f45055a;
        i iVar = this.f45061g;
        int i10 = this.f45060f;
        int i11 = this.f45059e;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f45058d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f45054k, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            qVarB = this.f45056b.b(file, i11, i10, iVar);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        cursor = cursorQuery;
                        if (cursor == null) {
                            throw th2;
                        }
                        cursor.close();
                        throw th2;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th4) {
                th2 = th4;
            }
        } else {
            Uri requireOriginal = this.f45058d;
            boolean zY = android.support.v4.media.session.a.y(requireOriginal);
            r rVar = this.f45057c;
            if (zY && requireOriginal.getPathSegments().contains("picker")) {
                qVarB = rVar.b(requireOriginal, i11, i10, iVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                qVarB = rVar.b(requireOriginal, i11, i10, iVar);
            }
        }
        if (qVarB != null) {
            return qVarB.f44371c;
        }
        return null;
    }
}
