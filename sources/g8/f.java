package g8;

import an.p;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import cc.a2;
import cn.i1;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.auth.o;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import qk.i0;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f41737a = e.f41732a;

    static void a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, jk.b bVar, Cursor cursor) {
        String[] strArr3;
        String strV0;
        String str3;
        if (l8.a.f45241b) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("uri: " + uri);
            sb2.append('\n');
            sb2.append("projection: " + (strArr != null ? k.v0(strArr, ", ", null, null, null, 62) : null));
            sb2.append('\n');
            sb2.append("selection: " + str);
            sb2.append('\n');
            if (strArr2 != null) {
                strArr3 = strArr2;
                strV0 = k.v0(strArr3, ", ", null, null, null, 62);
            } else {
                strArr3 = strArr2;
                strV0 = null;
            }
            sb2.append("selectionArgs: " + strV0);
            sb2.append('\n');
            sb2.append("sortOrder: " + str2);
            sb2.append('\n');
            if (str != null) {
                String strN0 = p.n0(str, "?", "%s");
                Object[] objArr = strArr3 == null ? new Object[0] : strArr3;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                str3 = String.format(strN0, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            } else {
                str3 = null;
            }
            sb2.append("sql: " + str3);
            sb2.append('\n');
            sb2.append("cursor count: " + (cursor != null ? Integer.valueOf(cursor.getCount()) : null));
            sb2.append('\n');
            String string = sb2.toString();
            n.e(string, "toString(...)");
            bVar.invoke(string);
        }
    }

    static double[] t(String str) {
        CharSequence charSequenceSubSequence;
        try {
            char[] cArr = {'/'};
            int i10 = -1;
            int length = str.length() - 1;
            if (length < 0) {
                charSequenceSubSequence = "";
                break;
            }
            while (true) {
                int i11 = length - 1;
                char cCharAt = str.charAt(length);
                int i12 = 0;
                while (true) {
                    if (i12 >= 1) {
                        i12 = -1;
                        break;
                    }
                    if (cCharAt == cArr[i12]) {
                        break;
                    }
                    i12++;
                }
                if (!(i12 >= 0)) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i11 < 0) {
                    charSequenceSubSequence = "";
                    break;
                }
                length = i11;
            }
            String string = charSequenceSubSequence.toString();
            int length2 = string.length();
            int i13 = 0;
            for (int i14 = 0; i14 < length2; i14++) {
                if (string.charAt(i14) == '+' || string.charAt(i14) == '-') {
                    i13++;
                    if (i13 == 2) {
                        i10 = i14;
                        break;
                    }
                }
            }
            if (i10 > 0) {
                String strS0 = an.h.S0(i10, string);
                String strSubstring = string.substring(i10);
                n.e(strSubstring, "substring(...)");
                Double dD0 = an.n.d0(strS0);
                if (dD0 != null) {
                    double dDoubleValue = dD0.doubleValue();
                    Double dD1 = an.n.d0(strSubstring);
                    if (dD1 != null) {
                        return new double[]{dDoubleValue, dD1.doubleValue()};
                    }
                }
            }
            return null;
        } catch (Exception e10) {
            l8.a.b(e10);
            return null;
        }
    }

    byte[] A(Context context, e8.a aVar, boolean z10);

    default e8.a B(Context context, String str, String str2, String str3, String str4, Integer num, Double d10, Double d11, Long l) throws IOException {
        h hVar;
        int iN;
        n.f(context, "context");
        q1.d(str);
        File file = new File(str);
        FileInputStream fileInputStream = new FileInputStream(file);
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str2);
        if (strGuessContentTypeFromName == null && (strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str)) == null) {
            strGuessContentTypeFromName = URLConnection.guessContentTypeFromStream(fileInputStream);
            fileInputStream = new FileInputStream(file);
            if (strGuessContentTypeFromName == null) {
                strGuessContentTypeFromName = "video/*";
            }
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setDataSource(str);
        mediaPlayer.setOnErrorListener(new g());
        double[] dArr = null;
        try {
            mediaPlayer.prepare();
            mediaPlayer.getVideoHeight();
            hVar = new h(Integer.valueOf(mediaPlayer.getVideoWidth()), Integer.valueOf(mediaPlayer.getVideoHeight()), Integer.valueOf(mediaPlayer.getDuration()));
            mediaPlayer.stop();
            mediaPlayer.release();
        } catch (Throwable unused) {
            mediaPlayer.release();
            hVar = new h(null, null, null);
        }
        a1.h hVar2 = new a1.h(fileInputStream);
        e eVar = f41737a;
        if (num != null) {
            iN = num.intValue();
        } else {
            eVar.getClass();
            iN = hVar2.n();
        }
        eVar.getClass();
        if (d10 != null && d11 != null) {
            dArr = new double[]{d10.doubleValue(), d11.doubleValue()};
        }
        FileInputStream fileInputStream2 = new FileInputStream(file);
        long j10 = 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() / j10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_type", (Integer) 3);
        contentValues.put("description", str3);
        contentValues.put("title", str2);
        contentValues.put("_display_name", str2);
        contentValues.put("mime_type", strGuessContentTypeFromName);
        contentValues.put("date_added", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(jCurrentTimeMillis));
        contentValues.put(IronSourceConstants.EVENTS_DURATION, hVar.f41740c);
        contentValues.put("width", hVar.f41738a);
        contentValues.put("height", hVar.f41739b);
        contentValues.put("datetaken", Long.valueOf(l != null ? l.longValue() : jCurrentTimeMillis * j10));
        contentValues.put("orientation", Integer.valueOf(iN));
        if (!an.h.y0(str4)) {
            contentValues.put("relative_path", str4);
        }
        if (dArr != null) {
            contentValues.put("latitude", Double.valueOf(k.n0(dArr)));
            contentValues.put("longitude", Double.valueOf(k.w0(dArr)));
        }
        Uri EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        n.e(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        return G(context, fileInputStream2, EXTERNAL_CONTENT_URI, contentValues);
    }

    e8.a C(Context context, String str, String str2);

    default void D(String msg) {
        n.f(msg, "msg");
        throw new RuntimeException(msg);
    }

    String E(Context context, int i10, long j10);

    String F(Context context, String str);

    default e8.a G(Context context, InputStream inputStream, Uri uri, ContentValues contentValues) throws IOException {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriInsert = contentResolver.insert(uri, contentValues);
        if (uriInsert == null) {
            D("Cannot insert new asset.");
            throw null;
        }
        long id2 = ContentUris.parseId(uriInsert);
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
        try {
            if (outputStreamOpenOutputStream == null) {
                D("Cannot open the output stream for " + uriInsert + ".");
                throw null;
            }
            try {
                no.b.g(inputStream, outputStreamOpenOutputStream);
                inputStream.close();
                outputStreamOpenOutputStream.close();
                contentResolver.notifyChange(uriInsert, null);
                e8.a aVarV = v(context, String.valueOf(id2));
                if (aVarV != null) {
                    return aVarV;
                }
                w(Long.valueOf(id2));
                throw null;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    i0.j(inputStream, th2);
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

    ArrayList b(Context context, String str, int i10, int i11, int i12, a2 a2Var);

    default e8.a c(Context context, byte[] bArr, String str, String str2, String str3, String str4, Integer num, Double d10, Double d11, Long l) throws IOException {
        int iN;
        n.f(context, "context");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        if (strGuessContentTypeFromName == null) {
            strGuessContentTypeFromName = URLConnection.guessContentTypeFromStream(byteArrayInputStream);
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            if (strGuessContentTypeFromName == null) {
                strGuessContentTypeFromName = "image/*";
            }
        }
        a1.h hVar = new a1.h(byteArrayInputStream);
        int iD = hVar.d(0, "ImageWidth");
        int iD2 = hVar.d(0, "ImageLength");
        e eVar = f41737a;
        if (num != null) {
            iN = num.intValue();
        } else {
            eVar.getClass();
            iN = hVar.n();
        }
        eVar.getClass();
        double[] dArr = (d10 == null || d11 == null) ? null : new double[]{d10.doubleValue(), d11.doubleValue()};
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
        long j10 = 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() / j10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_type", (Integer) 1);
        contentValues.put("description", str3);
        contentValues.put("_display_name", str2);
        contentValues.put("mime_type", strGuessContentTypeFromName);
        contentValues.put("title", str2);
        contentValues.put("date_added", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("width", Integer.valueOf(iD));
        contentValues.put("height", Integer.valueOf(iD2));
        contentValues.put("datetaken", Long.valueOf(l != null ? l.longValue() : jCurrentTimeMillis * j10));
        contentValues.put("orientation", Integer.valueOf(iN));
        if (!an.h.y0(str4)) {
            contentValues.put("relative_path", str4);
        }
        if (dArr != null) {
            contentValues.put("latitude", Double.valueOf(k.n0(dArr)));
            contentValues.put("longitude", Double.valueOf(k.w0(dArr)));
        }
        Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        n.e(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        return G(context, byteArrayInputStream2, EXTERNAL_CONTENT_URI, contentValues);
    }

    boolean d(Context context);

    ArrayList e(Context context, int i10, a2 a2Var);

    String[] f();

    String g(Context context, String str);

    default List h(Context context, List ids) throws Exception {
        n.f(context, "context");
        n.f(ids, "ids");
        List list = ids;
        int i10 = 0;
        if (list.size() > 500) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            int i11 = size / UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
            if (size % UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE != 0) {
                i11++;
            }
            while (i10 < i11) {
                arrayList.addAll(h(context, ids.subList(i10 * UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, i10 == i11 + (-1) ? list.size() : ((i10 + 1) * UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE) - 1)));
                i10++;
            }
            return arrayList;
        }
        String strO = defpackage.e.o("_id in (", xj.n.u0(ids, ",", null, null, new bh.a(11), 30), ")");
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        Cursor cursorR = r(contentResolver, k(), new String[]{"_id", "media_type", "_data"}, strO, (String[]) list.toArray(new String[0]), null, false);
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        Cursor cursor = cursorR;
        try {
            Cursor cursor2 = cursor;
            while (cursor2.moveToNext()) {
                map.put(o.m(cursor2, "_id"), o.m(cursor2, "_data"));
            }
            cursor.close();
            Iterator it = ids.iterator();
            while (it.hasNext()) {
                String str = (String) map.get((String) it.next());
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            return arrayList2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursor, th2);
                throw th3;
            }
        }
    }

    default ArrayList i(Context context, a2 a2Var, int i10, int i11, int i12) throws Exception {
        String strJ;
        n.f(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        ArrayList arrayList = new ArrayList();
        if (a2Var == null || (strJ = a2Var.B(i12, arrayList, false)) == null) {
            strJ = j1.f.J(i12);
        }
        String str = strJ;
        String strE = a2Var != null ? a2Var.E() : null;
        n.c(contentResolver);
        Cursor cursorR = r(contentResolver, k(), f(), str, (String[]) arrayList.toArray(new String[0]), strE, false);
        try {
            Cursor cursor = cursorR;
            ArrayList arrayList2 = new ArrayList();
            cursor.moveToPosition(i10 - 1);
            while (cursor.moveToNext()) {
                e8.a aVarY = o.y(cursor, context, false, 12);
                if (aVarY != null) {
                    arrayList2.add(aVarY);
                    if (arrayList2.size() == i11 - i10) {
                        break;
                    }
                }
            }
            cursorR.close();
            return arrayList2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursorR, th2);
                throw th3;
            }
        }
    }

    e8.a j(Context context, String str, String str2);

    Uri k();

    default Uri l(long j10, int i10, boolean z10) {
        Uri uriWithAppendedId;
        if (i10 == 1) {
            uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j10);
        } else if (i10 == 2) {
            uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j10);
        } else {
            if (i10 != 3) {
                D("Unexpected asset type " + i10);
                throw null;
            }
            uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, j10);
        }
        n.c(uriWithAppendedId);
        if (!z10) {
            return uriWithAppendedId;
        }
        Uri requireOriginal = MediaStore.setRequireOriginal(uriWithAppendedId);
        n.e(requireOriginal, "setRequireOriginal(...)");
        return requireOriginal;
    }

    default List m(Context context) throws Exception {
        n.f(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        n.c(contentResolver);
        Cursor cursorR = r(contentResolver, k(), null, null, null, null, false);
        try {
            String[] columnNames = cursorR.getColumnNames();
            n.e(columnNames, "getColumnNames(...)");
            List listC0 = k.C0(columnNames);
            cursorR.close();
            return listC0;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursorR, th2);
                throw th3;
            }
        }
    }

    void n(Context context);

    ArrayList o(Context context, String str, int i10, int i11, int i12, a2 a2Var);

    default String p(int i10, int i11, a2 a2Var) {
        String strE;
        StringBuilder sb2 = new StringBuilder();
        if (a2Var != null && (strE = a2Var.E()) != null) {
            sb2.append(strE);
            sb2.append(" ");
        }
        sb2.append("LIMIT " + i11 + " OFFSET " + i10);
        return sb2.toString();
    }

    default void q(Context context, String str) throws Exception {
        n.f(context, "context");
        if (l8.a.f45241b) {
            String strC0 = an.h.C0("", 40, '-');
            l8.a.d("log error row " + str + " start " + strC0);
            ContentResolver contentResolver = context.getContentResolver();
            n.e(contentResolver, "getContentResolver(...)");
            Cursor cursorR = r(contentResolver, k(), null, "_id = ?", new String[]{str}, null, false);
            try {
                Cursor cursor = cursorR;
                String[] columnNames = cursor.getColumnNames();
                if (cursor.moveToNext()) {
                    n.c(columnNames);
                    int length = columnNames.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        l8.a.d(columnNames[i10] + " : " + cursor.getString(i10));
                    }
                }
                cursorR.close();
                l8.a.d("log error row " + str + " end " + strC0);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    i0.j(cursorR, th2);
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
    default Cursor r(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, boolean z10) throws Exception {
        String[] strArr3;
        String str3;
        String[] strArr4;
        String str4;
        Cursor cursorQuery;
        n.f(uri, "uri");
        l8.a aVar = l8.a.f45240a;
        try {
            if (z10) {
                try {
                    Bundle bundle = new Bundle();
                    str3 = str;
                    try {
                        bundle.putString("android:query-arg-sql-selection", str3);
                        strArr4 = strArr2;
                        try {
                            bundle.putStringArray("android:query-arg-sql-selection-args", strArr4);
                            str4 = str2;
                            bundle.putString("android:query-arg-sql-sort-order", str4);
                            bundle.putInt("android:query-arg-match-trashed", 1);
                            cursorQuery = contentResolver.query(uri, strArr, bundle, null);
                        } catch (IllegalArgumentException e10) {
                            e = e10;
                            f41737a.getClass();
                            if (!e.b(e)) {
                                a(uri, strArr, str, strArr2, str2, new i1(1, aVar, l8.a.class, "error", "error(Ljava/lang/Object;)V", 0, 3), null);
                                l8.a.c("happen query error", e);
                                throw e;
                            }
                            a(uri, strArr, str, strArr2, str2, new i1(1, aVar, l8.a.class, "error", "error(Ljava/lang/Object;)V", 0, 2), null);
                            l8.a.c("MediaStore volume unavailable, returning empty cursor", e);
                            if (strArr == null) {
                                strArr3 = new String[0];
                            } else {
                                strArr3 = strArr;
                            }
                            return new MatrixCursor(strArr3);
                        } catch (Exception e11) {
                            e = e11;
                            a(uri, strArr, str, strArr2, str2, new i1(1, aVar, l8.a.class, "error", "error(Ljava/lang/Object;)V", 0, 4), null);
                            l8.a.c("happen query error", e);
                            throw e;
                        }
                    } catch (IllegalArgumentException e12) {
                        e = e12;
                        f41737a.getClass();
                        if (!e.b(e)) {
                            a(uri, strArr, str, strArr2, str2, new i1(1, aVar, l8.a.class, "error", "error(Ljava/lang/Object;)V", 0, 3), null);
                            l8.a.c("happen query error", e);
                            throw e;
                        }
                        a(uri, strArr, str, strArr2, str2, new i1(1, aVar, l8.a.class, "error", "error(Ljava/lang/Object;)V", 0, 2), null);
                        l8.a.c("MediaStore volume unavailable, returning empty cursor", e);
                        if (strArr == null) {
                            strArr3 = new String[0];
                        } else {
                            strArr3 = strArr;
                        }
                        return new MatrixCursor(strArr3);
                    } catch (Exception e13) {
                        e = e13;
                        a(uri, strArr, str, strArr2, str2, new i1(1, aVar, l8.a.class, "error", "error(Ljava/lang/Object;)V", 0, 4), null);
                        l8.a.c("happen query error", e);
                        throw e;
                    }
                } catch (IllegalArgumentException e14) {
                    e = e14;
                } catch (Exception e15) {
                    e = e15;
                }
            } else {
                str3 = str;
                strArr4 = strArr2;
                str4 = str2;
                cursorQuery = contentResolver.query(uri, strArr, str, strArr2, str2);
            }
            String str5 = str4;
            Cursor cursor = cursorQuery;
            a(uri, strArr, str3, strArr4, str5, new i1(1, aVar, l8.a.class, Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, "info(Ljava/lang/Object;)V", 0, 1), cursor);
            if (cursor != null) {
                return cursor;
            }
            D("Failed to obtain the cursor.");
            throw null;
        } catch (IllegalArgumentException e16) {
            e = e16;
        } catch (Exception e17) {
            e = e17;
        }
        f41737a.getClass();
        if (!e.b(e)) {
            a(uri, strArr, str, strArr2, str2, new i1(1, aVar, l8.a.class, "error", "error(Ljava/lang/Object;)V", 0, 3), null);
            l8.a.c("happen query error", e);
            throw e;
        }
        a(uri, strArr, str, strArr2, str2, new i1(1, aVar, l8.a.class, "error", "error(Ljava/lang/Object;)V", 0, 2), null);
        l8.a.c("MediaStore volume unavailable, returning empty cursor", e);
        if (strArr == null) {
            strArr3 = new String[0];
        } else {
            strArr3 = strArr;
        }
        return new MatrixCursor(strArr3);
    }

    ArrayList s(Context context, int i10, a2 a2Var);

    default void u(Context context, e8.b bVar) throws Exception {
        Cursor cursorR;
        Long lValueOf;
        n.f(context, "context");
        String pathId = bVar.f39165a;
        n.f(context, "context");
        n.f(pathId, "pathId");
        String[] strArr = {"date_modified"};
        if (pathId.equals("isAll")) {
            ContentResolver contentResolver = context.getContentResolver();
            n.e(contentResolver, "getContentResolver(...)");
            cursorR = r(contentResolver, k(), strArr, null, null, "date_modified desc", false);
        } else {
            ContentResolver contentResolver2 = context.getContentResolver();
            n.e(contentResolver2, "getContentResolver(...)");
            cursorR = r(contentResolver2, k(), strArr, "bucket_id = ?", new String[]{pathId}, "date_modified desc", false);
        }
        Cursor cursor = cursorR;
        try {
            Cursor cursor2 = cursor;
            if (cursor2.moveToNext()) {
                lValueOf = Long.valueOf(o.k(cursor2, "date_modified"));
                cursor.close();
            } else {
                cursor.close();
                lValueOf = null;
            }
            if (lValueOf != null) {
                bVar.f39170f = Long.valueOf(lValueOf.longValue());
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursor, th2);
                throw th3;
            }
        }
    }

    e8.a v(Context context, String str);

    default void w(Object obj) {
        D("Failed to find asset " + obj);
        throw null;
    }

    e8.b x(Context context, String str, int i10, a2 a2Var);

    default double[] y(Context context, String str) {
        int i10;
        n.f(context, "context");
        e8.a aVarV = v(context, str);
        if (aVarV != null && (i10 = aVarV.f39157g) != 3) {
            if (i10 == 2) {
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(aVarV.f39152b);
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(23);
                    mediaMetadataRetriever.release();
                    if (strExtractMetadata != null) {
                        return t(strExtractMetadata);
                    }
                } catch (Exception e10) {
                    l8.a.b(e10);
                    return null;
                }
            } else if (i10 == 1) {
                try {
                    a1.h hVarZ = z(context, str);
                    if (hVarZ != null) {
                        return hVarZ.h();
                    }
                } catch (Exception e11) {
                    l8.a.b(e11);
                }
            }
        }
        return null;
    }

    a1.h z(Context context, String str);
}
