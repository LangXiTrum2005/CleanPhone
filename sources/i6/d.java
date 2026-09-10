package i6;

import an.h;
import an.p;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;
import k6.r;
import k6.s;
import k6.x;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements s, k6.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f42896a;

    public /* synthetic */ d(Context context, boolean z10) {
        this.f42896a = context;
    }

    public static String d(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Throwable th2;
        String[] strArr2 = {"_data"};
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            n.c(uri);
            Cursor cursorQuery = contentResolver.query(uri, strArr2, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        cursorQuery.close();
                        return string;
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
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    @Override // k6.s
    public r M(x xVar) {
        return new k6.b(this.f42896a, this);
    }

    @Override // k6.f
    public Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // k6.f
    public Object b(Resources.Theme theme, Resources resources, int i10) {
        return resources.openRawResourceFd(i10);
    }

    public String c(Uri uri, String str) {
        File file;
        Context context = this.f42896a;
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name", "_size"}, null, null, null);
        n.c(cursorQuery);
        int columnIndex = cursorQuery.getColumnIndex("_display_name");
        cursorQuery.getColumnIndex("_size");
        cursorQuery.moveToFirst();
        String string = cursorQuery.getString(columnIndex);
        if (str.equals("")) {
            file = new File(context.getFilesDir() + '/' + string);
        } else {
            File file2 = new File(context.getFilesDir() + '/' + str);
            if (!file2.exists()) {
                file2.mkdir();
            }
            file = new File(context.getFilesDir() + '/' + str + '/' + string);
        }
        File file3 = file;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            byte[] bArr = new byte[1024];
            while (true) {
                n.c(inputStreamOpenInputStream);
                int i10 = inputStreamOpenInputStream.read(bArr);
                if (i10 == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
            inputStreamOpenInputStream.close();
            fileOutputStream.close();
        } catch (Exception e10) {
            String message = e10.getMessage();
            n.c(message);
            Log.e("Exception", message);
        }
        String path = file3.getPath();
        n.e(path, "getPath(...)");
        return path;
    }

    @Override // k6.f
    public void e(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    public String f(Uri uri) {
        Context context = this.f42896a;
        Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
        n.c(cursorQuery);
        int columnIndex = cursorQuery.getColumnIndex("_display_name");
        cursorQuery.getColumnIndex("_size");
        cursorQuery.moveToFirst();
        File file = new File(context.getCacheDir(), cursorQuery.getString(columnIndex));
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            n.c(inputStreamOpenInputStream);
            byte[] bArr = new byte[Math.min(inputStreamOpenInputStream.available(), ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)];
            while (true) {
                int i10 = inputStreamOpenInputStream.read(bArr);
                if (i10 == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
            Log.e("File Size", "Size " + file.length());
            inputStreamOpenInputStream.close();
            fileOutputStream.close();
            Log.e("File Path", "Path " + file.getPath());
            Log.e("File Size", "Size " + file.length());
        } catch (Exception e10) {
            String message = e10.getMessage();
            n.c(message);
            Log.e("Exception", message);
        }
        String path = file.getPath();
        n.e(path, "getPath(...)");
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0089  */
    /* JADX WARN: Code duplicated, block: B:17:0x0099  */
    /* JADX WARN: Code duplicated, block: B:9:0x0068  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x0068, please report this as an issue */
    public String g(Uri uri) throws Throwable {
        Throwable th2;
        Uri uri2;
        String str;
        String str2;
        String strH;
        Context context = this.f42896a;
        Cursor cursor = null;
        Uri uri3 = null;
        if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri);
            n.c(documentId);
            String[] strArr = (String[]) h.I0(documentId, new String[]{":"}, 0, 6).toArray(new String[0]);
            String str3 = strArr[0];
            String str4 = "/" + strArr[1];
            if ("primary".equalsIgnoreCase(str3)) {
                str = Environment.getExternalStorageDirectory() + str4;
                if (!new File(str).exists()) {
                    str = System.getenv("SECONDARY_STORAGE") + str4;
                    if (!new File(str).exists()) {
                        str2 = System.getenv("EXTERNAL_STORAGE");
                        if (str2 != null || (strH = wi.d.h(str2, str4)) == null) {
                            str = "";
                        } else {
                            str = strH;
                        }
                        new File(str).exists();
                    }
                }
            } else {
                str = System.getenv("SECONDARY_STORAGE") + str4;
                if (!new File(str).exists()) {
                    str2 = System.getenv("EXTERNAL_STORAGE");
                    if (str2 != null) {
                        str = "";
                    } else {
                        str = "";
                    }
                    new File(str).exists();
                }
            }
            if (str != "") {
                return str;
            }
        } else {
            if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                try {
                    uri2 = uri;
                    Cursor cursorQuery = context.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String str5 = Environment.getExternalStorageDirectory() + "/Download/" + cursorQuery.getString(0);
                                if (!TextUtils.isEmpty(str5)) {
                                    cursorQuery.close();
                                    return str5;
                                }
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
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    String documentId2 = DocumentsContract.getDocumentId(uri2);
                    n.e(documentId2, "getDocumentId(...)");
                    if (!TextUtils.isEmpty(documentId2)) {
                        if (p.p0(documentId2, "raw:", false)) {
                            Pattern patternCompile = Pattern.compile("raw:");
                            n.e(patternCompile, "compile(...)");
                            String strReplaceFirst = patternCompile.matcher(documentId2).replaceFirst("");
                            n.e(strReplaceFirst, "replaceFirst(...)");
                            return strReplaceFirst;
                        }
                        try {
                            Uri uri4 = Uri.parse(new String[]{"content://downloads/public_downloads", "content://downloads/my_downloads"}[0]);
                            Long lValueOf = Long.valueOf(documentId2);
                            n.e(lValueOf, "valueOf(...)");
                            Uri uriWithAppendedId = ContentUris.withAppendedId(uri4, lValueOf.longValue());
                            n.e(uriWithAppendedId, "withAppendedId(...)");
                            return d(context, uriWithAppendedId, null, null);
                        } catch (NumberFormatException unused) {
                            String path = uri2.getPath();
                            n.c(path);
                            Pattern patternCompile2 = Pattern.compile("^/document/raw:");
                            n.e(patternCompile2, "compile(...)");
                            String strReplaceFirst2 = patternCompile2.matcher(path).replaceFirst("");
                            n.e(strReplaceFirst2, "replaceFirst(...)");
                            Pattern patternCompile3 = Pattern.compile("^raw:");
                            n.e(patternCompile3, "compile(...)");
                            String strReplaceFirst3 = patternCompile3.matcher(strReplaceFirst2).replaceFirst("");
                            n.e(strReplaceFirst3, "replaceFirst(...)");
                            return strReplaceFirst3;
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } else {
                uri2 = uri;
            }
            if ("com.android.providers.media.documents".equals(uri2.getAuthority())) {
                String documentId3 = DocumentsContract.getDocumentId(uri2);
                n.c(documentId3);
                String[] strArr2 = (String[]) h.I0(documentId3, new String[]{":"}, 0, 6).toArray(new String[0]);
                String str6 = strArr2[0];
                if ("image".equals(str6)) {
                    uri3 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str6)) {
                    uri3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str6)) {
                    uri3 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return d(context, uri3, "_id=?", new String[]{strArr2[1]});
            }
            if ("com.google.android.apps.docs.storage".equals(uri2.getAuthority()) || "com.google.android.apps.docs.storage.legacy".equals(uri2.getAuthority())) {
                return f(uri2);
            }
            if ("com.whatsapp.provider.media".equals(uri2.getAuthority())) {
                return c(uri2, "whatsapp");
            }
            if ("content".equalsIgnoreCase(uri2.getScheme())) {
                if ("com.google.android.apps.photos.content".equals(uri2.getAuthority())) {
                    return uri2.getLastPathSegment();
                }
                return ("com.google.android.apps.docs.storage".equals(uri2.getAuthority()) || "com.google.android.apps.docs.storage.legacy".equals(uri2.getAuthority())) ? f(uri2) : c(uri2, "userfiles");
            }
            if (X3.i.f27782b.equalsIgnoreCase(uri2.getScheme())) {
                return uri2.getPath();
            }
        }
        return null;
    }

    public d(Context context) {
        this.f42896a = context.getApplicationContext();
    }
}
