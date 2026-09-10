package eh;

import an.p;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.util.Size;
import cn.d0;
import com.google.android.gms.internal.play_billing.q1;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.n;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements sg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f40087a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f40088b = new LinkedHashMap();

    public static int a(BitmapFactory.Options options) {
        Integer numValueOf = Integer.valueOf(options.outHeight);
        Integer numValueOf2 = Integer.valueOf(options.outWidth);
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        int i10 = 1;
        if (iIntValue <= 1024 && iIntValue2 <= 1024) {
            return 1;
        }
        int i11 = iIntValue / 2;
        int i12 = iIntValue2 / 2;
        while (i11 / i10 >= 1024 && i12 / i10 >= 1024) {
            i10 *= 2;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0156 A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:5:0x003b, B:6:0x003e, B:8:0x0044, B:10:0x0063, B:14:0x0070, B:18:0x00c0, B:20:0x00db, B:25:0x00f8, B:27:0x010b, B:29:0x0111, B:31:0x0117, B:33:0x011d, B:49:0x0156, B:52:0x015d, B:54:0x0177, B:56:0x017f, B:63:0x01c6, B:64:0x01cc, B:66:0x01d2, B:69:0x01e3, B:71:0x01e9, B:51:0x015a, B:37:0x0128, B:39:0x013b, B:41:0x0141, B:43:0x0147, B:45:0x014d), top: B:82:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:51:0x015a A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:5:0x003b, B:6:0x003e, B:8:0x0044, B:10:0x0063, B:14:0x0070, B:18:0x00c0, B:20:0x00db, B:25:0x00f8, B:27:0x010b, B:29:0x0111, B:31:0x0117, B:33:0x011d, B:49:0x0156, B:52:0x015d, B:54:0x0177, B:56:0x017f, B:63:0x01c6, B:64:0x01cc, B:66:0x01d2, B:69:0x01e3, B:71:0x01e9, B:51:0x015a, B:37:0x0128, B:39:0x013b, B:41:0x0141, B:43:0x0147, B:45:0x014d), top: B:82:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0177 A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:5:0x003b, B:6:0x003e, B:8:0x0044, B:10:0x0063, B:14:0x0070, B:18:0x00c0, B:20:0x00db, B:25:0x00f8, B:27:0x010b, B:29:0x0111, B:31:0x0117, B:33:0x011d, B:49:0x0156, B:52:0x015d, B:54:0x0177, B:56:0x017f, B:63:0x01c6, B:64:0x01cc, B:66:0x01d2, B:69:0x01e3, B:71:0x01e9, B:51:0x015a, B:37:0x0128, B:39:0x013b, B:41:0x0141, B:43:0x0147, B:45:0x014d), top: B:82:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:55:0x017c  */
    /* JADX WARN: Code duplicated, block: B:58:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c1 A[PHI: r18
  0x01c1: PHI (r18v3 java.lang.String) = (r18v2 java.lang.String), (r18v4 java.lang.String) binds: [B:58:0x01bb, B:60:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d2 A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:5:0x003b, B:6:0x003e, B:8:0x0044, B:10:0x0063, B:14:0x0070, B:18:0x00c0, B:20:0x00db, B:25:0x00f8, B:27:0x010b, B:29:0x0111, B:31:0x0117, B:33:0x011d, B:49:0x0156, B:52:0x015d, B:54:0x0177, B:56:0x017f, B:63:0x01c6, B:64:0x01cc, B:66:0x01d2, B:69:0x01e3, B:71:0x01e9, B:51:0x015a, B:37:0x0128, B:39:0x013b, B:41:0x0141, B:43:0x0147, B:45:0x014d), top: B:82:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01e9 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #1 {all -> 0x006a, blocks: (B:5:0x003b, B:6:0x003e, B:8:0x0044, B:10:0x0063, B:14:0x0070, B:18:0x00c0, B:20:0x00db, B:25:0x00f8, B:27:0x010b, B:29:0x0111, B:31:0x0117, B:33:0x011d, B:49:0x0156, B:52:0x015d, B:54:0x0177, B:56:0x017f, B:63:0x01c6, B:64:0x01cc, B:66:0x01d2, B:69:0x01e3, B:71:0x01e9, B:51:0x015a, B:37:0x0128, B:39:0x013b, B:41:0x0141, B:43:0x0147, B:45:0x014d), top: B:82:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[LOOP:1: B:64:0x01cc->B:96:?, LOOP_END, SYNTHETIC] */
    public final ArrayList b(boolean z10) {
        ah.d dVar;
        long j10;
        String str;
        ah.a aVar;
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = super.h().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_display_name", "bucket_display_name", "_size", "width", "height", "date_added", "datetaken", "date_modified", "is_favorite", "generation_added", "generation_modified", "relative_path"}, "_size > 0", null, "date_added DESC");
        if (cursorQuery == null) {
            return arrayList;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            while (cursor2.moveToNext()) {
                String string = cursor2.getString(cursor2.getColumnIndexOrThrow("_id"));
                String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("_display_name"));
                int columnIndex = cursor2.getColumnIndex("bucket_display_name");
                Object obj = null;
                String string3 = columnIndex != -1 ? cursor2.getString(columnIndex) : null;
                long j11 = cursor2.getLong(cursor2.getColumnIndexOrThrow("_size"));
                int i10 = cursor2.getInt(cursor2.getColumnIndexOrThrow("width"));
                int i11 = cursor2.getInt(cursor2.getColumnIndexOrThrow("height"));
                long j12 = cursor2.getLong(cursor2.getColumnIndexOrThrow("date_added"));
                long j13 = cursor2.getLong(cursor2.getColumnIndexOrThrow("datetaken"));
                long j14 = cursor2.getLong(cursor2.getColumnIndexOrThrow("date_modified"));
                boolean z11 = cursor2.getInt(cursor2.getColumnIndexOrThrow("is_favorite")) == 1;
                cursor2.getInt(cursor2.getColumnIndexOrThrow("generation_added"));
                cursor2.getInt(cursor2.getColumnIndexOrThrow("generation_modified"));
                int columnIndex2 = cursor2.getColumnIndex("relative_path");
                String string4 = columnIndex2 != -1 ? cursor2.getString(columnIndex2) : null;
                Cursor cursor3 = cursor2;
                boolean z12 = z11;
                if (z10) {
                    n.c(string2);
                    String lowerCase = string2.toLowerCase(Locale.ROOT);
                    n.e(lowerCase, "toLowerCase(...)");
                    if (an.h.q0(lowerCase, "screenshot", false) || an.h.q0(lowerCase, "screen_shot", false) || an.h.q0(lowerCase, "screen-shot", false) || p.p0(lowerCase, "screenshot_", false) || p.p0(lowerCase, "screen_", false)) {
                        if (z10) {
                            dVar = ah.d.SCREENSHOT;
                        } else {
                            dVar = ah.d.IMAGE;
                        }
                        ah.d dVar2 = dVar;
                        n.c(string);
                        Size size = new Size(i10, i11);
                        Long lValueOf = Long.valueOf(j11);
                        if (j13 == 0) {
                            j10 = ((long) 1000) * j12;
                        } else {
                            j10 = j13;
                        }
                        arrayList.add(new dh.b(string, dVar2, z12, false, size, lValueOf, new Date(j10), new Date(j14 * ((long) 1000)), false, i10 + "x" + i11 + "_" + j11, null, null));
                        if (z10) {
                            if (string3 != null) {
                                str = string3;
                            } else if (string4 == null) {
                                string3 = "";
                                str = string3;
                            } else {
                                str = string4;
                            }
                            for (Object obj2 : ah.a.f3580c) {
                                if (an.h.q0(str, ((ah.a) obj2).f3581a, true)) {
                                    obj = obj2;
                                    break;
                                }
                            }
                            aVar = (ah.a) obj;
                            if (aVar != null) {
                                f40088b.put(string, aVar);
                            }
                        }
                    }
                } else {
                    n.c(string2);
                    String lowerCase2 = string2.toLowerCase(Locale.ROOT);
                    n.e(lowerCase2, "toLowerCase(...)");
                    if (!an.h.q0(lowerCase2, "screenshot", false) && !an.h.q0(lowerCase2, "screen_shot", false) && !an.h.q0(lowerCase2, "screen-shot", false) && !p.p0(lowerCase2, "screenshot_", false) && !p.p0(lowerCase2, "screen_", false)) {
                        if (z10) {
                            dVar = ah.d.SCREENSHOT;
                        } else {
                            dVar = ah.d.IMAGE;
                        }
                        ah.d dVar3 = dVar;
                        n.c(string);
                        Size size2 = new Size(i10, i11);
                        Long lValueOf2 = Long.valueOf(j11);
                        if (j13 == 0) {
                            j10 = ((long) 1000) * j12;
                        } else {
                            j10 = j13;
                        }
                        arrayList.add(new dh.b(string, dVar3, z12, false, size2, lValueOf2, new Date(j10), new Date(j14 * ((long) 1000)), false, i10 + "x" + i11 + "_" + j11, null, null));
                        if (z10) {
                            if (string3 != null) {
                                str = string3;
                            } else if (string4 == null) {
                                string3 = "";
                                str = string3;
                            } else {
                                str = string4;
                            }
                            while (r4.hasNext()) {
                                if (an.h.q0(str, ((ah.a) obj2).f3581a, true)) {
                                    obj = obj2;
                                    break;
                                }
                            }
                            aVar = (ah.a) obj;
                            if (aVar != null) {
                                f40088b.put(string, aVar);
                            }
                        }
                    }
                }
                cursor2 = cursor3;
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursor, th2);
                throw th3;
            }
        }
    }

    public final ArrayList c(boolean z10) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = super.h().getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_display_name", "_size", "width", "height", "date_added", "datetaken", "date_modified", "is_favorite", "generation_added", "generation_modified"}, "_size > 0", null, "date_added DESC");
        if (cursorQuery == null) {
            return arrayList;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            while (cursor2.moveToNext()) {
                String string = cursor2.getString(cursor2.getColumnIndexOrThrow("_id"));
                String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("_display_name"));
                long j10 = cursor2.getLong(cursor2.getColumnIndexOrThrow("_size"));
                int i10 = cursor2.getInt(cursor2.getColumnIndexOrThrow("width"));
                int i11 = cursor2.getInt(cursor2.getColumnIndexOrThrow("height"));
                long j11 = cursor2.getLong(cursor2.getColumnIndexOrThrow("date_added"));
                long j12 = cursor2.getLong(cursor2.getColumnIndexOrThrow("datetaken"));
                long j13 = cursor2.getLong(cursor2.getColumnIndexOrThrow("date_modified"));
                boolean z11 = true;
                if (cursor2.getInt(cursor2.getColumnIndexOrThrow("is_favorite")) != 1) {
                    z11 = false;
                }
                cursor2.getInt(cursor2.getColumnIndexOrThrow("generation_added"));
                cursor2.getInt(cursor2.getColumnIndexOrThrow("generation_modified"));
                ah.d.f3598b.getClass();
                if (go.c.f42027a) {
                    if (z10) {
                        n.c(string2);
                        if (!q1.v(string2)) {
                        }
                    } else {
                        n.c(string2);
                        if (!q1.v(string2)) {
                        }
                    }
                }
                ah.d dVar = z10 ? ah.d.SCREEN_RECORDING : ah.d.VIDEO;
                n.c(string);
                Size size = new Size(i10, i11);
                Long lValueOf = Long.valueOf(j10);
                Cursor cursor3 = cursor2;
                arrayList.add(new dh.b(string, dVar, z11, false, size, lValueOf, new Date(j12 == 0 ? ((long) 1000) * j11 : j12), new Date(j13 * ((long) 1000)), false, i10 + "x" + i11 + "_" + j10, null, null));
                cursor2 = cursor3;
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursor, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b A[Catch: Exception -> 0x0025, TryCatch #2 {Exception -> 0x0025, blocks: (B:3:0x000b, B:11:0x001c, B:12:0x0024, B:15:0x0028, B:17:0x002d, B:19:0x0046, B:27:0x005e, B:31:0x0064, B:32:0x0067, B:16:0x002b, B:29:0x0062, B:20:0x0048, B:22:0x0051), top: B:44:0x000b, inners: #0, #1 }] */
    public final String d(dh.b asset) {
        Uri uri;
        n.f(asset, "asset");
        String str = asset.f38876a;
        try {
            int iOrdinal = asset.f38877b.ordinal();
            if (iOrdinal == 0) {
                uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if (iOrdinal != 3) {
                        throw new aa.b((byte) 0, 20);
                    }
                }
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            }
            Cursor cursorQuery = super.h().getContentResolver().query(Uri.withAppendedPath(uri, str), new String[]{"_data"}, null, null, null);
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
            String message = l1.d.g("Failed to get file path for asset ", str, ": ", e10.getMessage());
            String tag = (2 & 2) != 0 ? "ProjectLogger" : null;
            n.f(message, "message");
            n.f(tag, "tag");
            Log.i(tag, message);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(List list, ck.c cVar) throws Throwable {
        j jVar;
        Iterator it;
        int i10;
        ch.c cVar2;
        Map map;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i11 = jVar.l;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.l = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object obj = jVar.f40085j;
        int i12 = jVar.l;
        ch.e eVar = ch.e.f6424c;
        if (i12 == 0) {
            t9.e.z(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ConcurrentHashMap concurrentHashMap = ch.f.f6431a;
            ch.c cVarA = ch.f.a(eVar);
            it = list.iterator();
            i10 = 0;
            cVar2 = cVarA;
            map = linkedHashMap;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = jVar.f40084i;
            it = jVar.f40083h;
            cVar2 = jVar.f40082g;
            map = jVar.f40081f;
            t9.e.z(obj);
        }
        while (it.hasNext()) {
            androidx.lifecycle.p pVar = new androidx.lifecycle.p(map, (ah.d) it.next(), null, 5);
            jVar.f40081f = map;
            jVar.f40082g = cVar2;
            jVar.f40083h = it;
            jVar.f40084i = i10;
            jVar.l = 1;
            Object objJ = d0.J(cVar2.f6421b.f42424a, pVar, jVar);
            bk.a aVar = bk.a.f5708a;
            if (objJ == aVar) {
                return aVar;
            }
        }
        ConcurrentHashMap concurrentHashMap2 = ch.f.f6431a;
        ch.f.b(eVar);
        return map;
    }

    public final Bitmap f(dh.b bVar) {
        Bitmap bitmapLoadThumbnail;
        Bitmap bitmapDecodeStream;
        String str = bVar.f38876a;
        Bitmap bitmapDecodeFile = null;
        try {
            bitmapLoadThumbnail = super.h().getContentResolver().loadThumbnail(ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Long.parseLong(str)), new Size(1024, 1024), null);
        } catch (Exception e10) {
            String message = "Thumbnail load failed for asset " + str + ": " + e10.getMessage();
            n.f(message, "message");
            Log.i("ProjectLogger", message);
            bitmapLoadThumbnail = null;
        }
        if (bitmapLoadThumbnail != null) {
            return bitmapLoadThumbnail;
        }
        try {
            Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Long.parseLong(str));
            n.e(uriWithAppendedId, "withAppendedId(...)");
            InputStream inputStreamOpenInputStream = super.h().getContentResolver().openInputStream(uriWithAppendedId);
            if (inputStreamOpenInputStream != null) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    InputStream inputStreamOpenInputStream2 = super.h().getContentResolver().openInputStream(uriWithAppendedId);
                    if (inputStreamOpenInputStream2 != null) {
                        try {
                            options.inSampleSize = a(options);
                            options.inJustDecodeBounds = false;
                            bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                            inputStreamOpenInputStream2.close();
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                i0.j(inputStreamOpenInputStream2, th2);
                                throw th3;
                            }
                        }
                    } else {
                        bitmapDecodeStream = null;
                    }
                    inputStreamOpenInputStream.close();
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        i0.j(inputStreamOpenInputStream, th4);
                        throw th5;
                    }
                }
            } else {
                bitmapDecodeStream = null;
            }
        } catch (Exception e11) {
            String message2 = "ContentResolver load failed for asset " + str + ": " + e11.getMessage();
            n.f(message2, "message");
            Log.i("ProjectLogger", message2);
        }
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        try {
            String strD = d(bVar);
            if (strD != null && new File(strD).exists()) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(strD, options2);
                options2.inSampleSize = a(options2);
                options2.inJustDecodeBounds = false;
                bitmapDecodeFile = BitmapFactory.decodeFile(strD, options2);
            }
        } catch (Exception e12) {
            String message3 = "File path load failed for asset " + str + ": " + e12.getMessage();
            n.f(message3, "message");
            Log.e("ProjectLogger", message3, e12);
        }
        return bitmapDecodeFile;
    }

    public final Uri g(String srcPath) {
        n.f(srcPath, "srcPath");
        File file = new File(srcPath);
        if (file.exists()) {
            ContentResolver contentResolver = super.h().getContentResolver();
            String name = file.getName();
            n.e(name, "getName(...)");
            String strConcat = an.h.R0(name, ".", name).concat(".mp4");
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", strConcat);
            contentValues.put("mime_type", MimeTypes.VIDEO_MP4);
            contentValues.put("relative_path", Environment.DIRECTORY_MOVIES);
            contentValues.put("is_pending", (Integer) 1);
            Uri uriInsert = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert != null) {
                try {
                    OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                no.b.g(fileInputStream, outputStreamOpenOutputStream);
                                fileInputStream.close();
                                outputStreamOpenOutputStream.close();
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    i0.j(fileInputStream, th2);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                i0.j(outputStreamOpenOutputStream, th4);
                                throw th5;
                            }
                        }
                    }
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("is_pending", (Integer) 0);
                    contentResolver.update(uriInsert, contentValues2, null, null);
                    return uriInsert;
                } catch (Exception e10) {
                    try {
                        contentResolver.delete(uriInsert, null, null);
                    } catch (Exception unused) {
                    }
                    Log.e("ProjectLogger", "Error copying to public Videos", e10);
                    return null;
                }
            }
        }
        return null;
    }
}
