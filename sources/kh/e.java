package kh;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import ch.f;
import cn.d0;
import cn.n0;
import eh.k;
import fh.z;
import hn.o;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.n;
import qk.i0;
import xi.g;
import xi.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements h, sg.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static g f44648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f44649c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f44647a = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ug.a f44650d = new ug.a("1006", "Compression was cancelled", "");

    public static final String a() {
        File file = new File(super.h().getCacheDir(), "video_compress");
        if (!file.exists()) {
            file.mkdirs();
        }
        String absolutePath = new File(file, defpackage.e.j(System.currentTimeMillis(), "compressed_", ".mp4")).getAbsolutePath();
        n.e(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    public static final String b(String str) {
        ContentResolver contentResolver = super.h().getContentResolver();
        Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, Long.parseLong(str));
        n.e(uriWithAppendedId, "withAppendedId(...)");
        try {
            Cursor cursorQuery = contentResolver.query(uriWithAppendedId, null, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                String string = cursor2.moveToFirst() ? cursor2.getString(cursor2.getColumnIndexOrThrow("_data")) : null;
                cursor.close();
                return string;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    i0.j(cursor, th2);
                    throw th3;
                }
            }
        } catch (Exception e10) {
            String message = "Error getting file path: " + e10;
            n.f(message, "message");
            Log.e("VideoCompressService", message);
            return null;
        }
    }

    public static final int c(Uri uri) {
        String message;
        StringBuilder sb2;
        String message2;
        e eVar = f44647a;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        int i10 = 1000000;
        try {
            mediaMetadataRetriever.setDataSource(super.h(), uri);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(20);
            i10 = strExtractMetadata != null ? Integer.parseInt(strExtractMetadata) : 1000000;
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                message = e10.getMessage();
                sb2 = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                sb2.append(message);
                message2 = sb2.toString();
            }
        } catch (Exception e11) {
            String message3 = "Error getting original bitrate: " + e11;
            n.f(message3, "message");
            Log.e("VideoCompressService", message3);
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e12) {
                message = e12.getMessage();
                sb2 = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                sb2.append(message);
                message2 = sb2.toString();
            }
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e13) {
                message2 = "Error releasing MediaMetadataRetriever: " + e13.getMessage();
                n.f(message2, "message");
                Log.e("VideoCompressService", message2);
            }
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(float f10, String str, ck.c cVar) throws Throwable {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f44633h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f44633h = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objJ = aVar.f44631f;
        int i11 = aVar.f44633h;
        ch.e eVar = ch.e.f6427f;
        if (i11 == 0) {
            t9.e.z(objJ);
            ConcurrentHashMap concurrentHashMap = f.f6431a;
            ch.c cVarA = f.a(eVar);
            b bVar = new b(str, f10, null);
            aVar.f44633h = 1;
            objJ = d0.J(cVarA.f6421b.f42424a, bVar, aVar);
            bk.a aVar2 = bk.a.f5708a;
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(objJ);
        }
        String str2 = (String) objJ;
        ConcurrentHashMap concurrentHashMap2 = f.f6431a;
        f.b(eVar);
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(List list, List list2, ck.c cVar) throws Throwable {
        c cVar2;
        int i10;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i11 = cVar2.f44641j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f44641j = i11 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.f44639h;
        int i12 = cVar2.f44641j;
        try {
            if (i12 == 0) {
                t9.e.z(obj);
                if (!list.isEmpty()) {
                    z zVar = z.f40950a;
                    cVar2.f44637f = list2;
                    cVar2.f44638g = 1;
                    cVar2.f44641j = 1;
                    b4.b bVar = new b4.b(list, (ak.f) null, 4);
                    jn.e eVar = n0.f6748a;
                    Object objJ = d0.J(o.f42451a, bVar, cVar2);
                    bk.a aVar = bk.a.f5708a;
                    if (objJ == aVar) {
                        return aVar;
                    }
                }
                i10 = 1;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = cVar2.f44638g;
                list2 = cVar2.f44637f;
                t9.e.z(obj);
            }
            if (!list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (k.f40087a.g((String) it.next()) == null) {
                        i10 = 0;
                    }
                }
            }
        } catch (Exception e10) {
            Log.e("ProjectLogger", "Error making asset changes", e10);
            i10 = 0;
        }
        return Boolean.valueOf(i10 != 0);
    }

    @Override // xi.h
    public final void g(g gVar) {
        f44648b = gVar;
        Log.i("VideoCompressService", "Video compress event channel listener attached");
    }

    @Override // xi.h
    public final void onCancel() {
        f44648b = null;
        Log.i("VideoCompressService", "Video compress event channel listener cancelled");
    }
}
