package g8;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import cc.a2;
import com.google.android.gms.internal.auth.o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.n;
import qk.i0;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f41729b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f41730c = {"longitude", "latitude"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f41731d = new ReentrantLock();

    @Override // g8.f
    public final byte[] A(Context context, e8.a aVar, boolean z10) throws IOException {
        n.f(context, "context");
        File file = new File(aVar.f39152b);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArrCopyOf = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int i13 = fileInputStream.read(bArrCopyOf, i12, i11);
                if (i13 < 0) {
                    break;
                }
                i11 -= i13;
                i12 += i13;
            }
            if (i11 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i12);
                n.e(bArrCopyOf, "copyOf(...)");
            } else {
                int i14 = fileInputStream.read();
                if (i14 != -1) {
                    hk.a aVar2 = new hk.a(8193);
                    aVar2.write(i14);
                    no.b.g(fileInputStream, aVar2);
                    int size = aVar2.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrH = aVar2.h();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    n.e(bArrCopyOf, "copyOf(...)");
                    k.g0(bArrH, i10, 0, bArrCopyOf, aVar2.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(fileInputStream, th2);
                throw th3;
            }
        }
    }

    @Override // g8.f
    public final e8.a C(Context context, String str, String str2) throws IOException {
        n.f(context, "context");
        wj.f fVarI = I(context, str);
        if (fVarI == null) {
            super.D("Cannot get gallery id of ".concat(str));
            throw null;
        }
        String str3 = (String) fVarI.f53283a;
        c cVarH = H(context, str2);
        if (cVarH == null) {
            super.D("Cannot get target gallery info");
            throw null;
        }
        if (str2.equals(str3)) {
            super.D("No move required, because the target gallery is the same as the current one.");
            throw null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        n.c(contentResolver);
        f.f41737a.getClass();
        Cursor cursorR = r(contentResolver, e.a(), new String[]{"_data"}, "_id = ?", new String[]{str}, null, false);
        if (!cursorR.moveToNext()) {
            super.D(defpackage.e.o("Cannot find ", str, " path"));
            throw null;
        }
        String string = cursorR.getString(0);
        cursorR.close();
        String strI = wi.d.i(cVarH.f41726a, "/", new File(string).getName());
        new File(string).renameTo(new File(strI));
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", strI);
        contentValues.put("bucket_id", str2);
        contentValues.put("bucket_display_name", cVarH.f41728c);
        if (contentResolver.update(e.a(), contentValues, "_id = ?", new String[]{str}) <= 0) {
            super.D(defpackage.e.o("Cannot update ", str, " relativePath"));
            throw null;
        }
        e8.a aVarV = v(context, str);
        if (aVarV != null) {
            return aVarV;
        }
        super.w(str);
        throw null;
    }

    @Override // g8.f
    public final void D(String str) {
        super.D(str);
        throw null;
    }

    @Override // g8.f
    public final String E(Context context, int i10, long j10) {
        n.f(context, "context");
        String string = l(j10, i10, false).toString();
        n.e(string, "toString(...)");
        return string;
    }

    @Override // g8.f
    public final String F(Context context, String str) throws IOException {
        n.f(context, "context");
        if (str.equals("isAll")) {
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        f.f41737a.getClass();
        Cursor cursorR = r(contentResolver, e.a(), new String[]{"_data"}, "bucket_id = ?", new String[]{str}, null, false);
        try {
            Cursor cursor = cursorR;
            if (!cursor.moveToNext()) {
                cursorR.close();
                return null;
            }
            String strN = o.n(cursor, "_data");
            String parent = strN != null ? new File(strN).getParent() : null;
            cursorR.close();
            return parent;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursorR, th2);
                throw th3;
            }
        }
    }

    public final c H(Context context, String str) throws IOException {
        String absolutePath;
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        f.f41737a.getClass();
        Cursor cursorR = r(contentResolver, e.a(), new String[]{"bucket_id", "bucket_display_name", "_data"}, "bucket_id = ?", new String[]{str}, null, false);
        try {
            Cursor cursor = cursorR;
            if (!cursor.moveToNext()) {
                cursorR.close();
                return null;
            }
            String strN = o.n(cursor, "_data");
            if (strN == null) {
                cursorR.close();
                return null;
            }
            String strN2 = o.n(cursor, "bucket_display_name");
            if (strN2 == null) {
                cursorR.close();
                return null;
            }
            File parentFile = new File(strN).getParentFile();
            if (parentFile != null && (absolutePath = parentFile.getAbsolutePath()) != null) {
                c cVar = new c(absolutePath, str, strN2);
                cursorR.close();
                return cVar;
            }
            cursorR.close();
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursorR, th2);
                throw th3;
            }
        }
    }

    public final wj.f I(Context context, String str) throws IOException {
        n.f(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        f.f41737a.getClass();
        Cursor cursorR = r(contentResolver, e.a(), new String[]{"bucket_id", "_data"}, "_id = ?", new String[]{str}, null, false);
        try {
            Cursor cursor = cursorR;
            if (!cursor.moveToNext()) {
                cursorR.close();
                return null;
            }
            wj.f fVar = new wj.f(cursor.getString(0), new File(cursor.getString(1)).getParent());
            cursorR.close();
            return fVar;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursorR, th2);
                throw th3;
            }
        }
    }

    @Override // g8.f
    public final ArrayList b(Context context, String str, int i10, int i11, int i12, a2 a2Var) throws IOException {
        String strN;
        n.f(context, "context");
        boolean z10 = str.length() == 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!z10) {
            arrayList2.add(str);
        }
        if (a2Var == null || (strN = a2Var.B(i12, arrayList2, true)) == null) {
            strN = defpackage.e.n(" AND ", j1.f.J(i12));
        }
        String[] strArrF = f();
        String strI = wi.d.i(z10 ? "bucket_id IS NOT NULL" : "bucket_id = ?", " ", strN);
        String strP = super.p(i10, i11 - i10, a2Var);
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        f.f41737a.getClass();
        Cursor cursorR = r(contentResolver, e.a(), strArrF, strI, (String[]) arrayList2.toArray(new String[0]), strP, false);
        try {
            Cursor cursor = cursorR;
            while (cursor.moveToNext()) {
                e8.a aVarY = o.y(cursor, context, false, 10);
                if (aVarY != null) {
                    arrayList.add(aVarY);
                }
            }
            cursorR.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursorR, th2);
                throw th3;
            }
        }
    }

    @Override // g8.f
    public final boolean d(Context context) {
        e eVar = f.f41737a;
        n.f(context, "context");
        ReentrantLock reentrantLock = f41731d;
        if (reentrantLock.isLocked()) {
            return false;
        }
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            ContentResolver contentResolver = context.getContentResolver();
            d dVar = f41729b;
            n.c(contentResolver);
            eVar.getClass();
            Cursor cursorR = dVar.r(contentResolver, e.a(), new String[]{"_id", "_data"}, null, null, null, false);
            try {
                Cursor cursor = cursorR;
                while (cursor.moveToNext()) {
                    String strM = o.m(cursor, "_id");
                    String strM2 = o.m(cursor, "_data");
                    if (!new File(strM2).exists()) {
                        arrayList.add(strM);
                        Log.i("PhotoManagerPlugin", "The " + strM2 + " was not exists. ");
                    }
                }
                Log.i("PhotoManagerPlugin", "will be delete ids = " + arrayList);
                cursorR.close();
                String strU0 = xj.n.u0(arrayList, ",", null, null, new bh.a(10), 30);
                int iDelete = contentResolver.delete(e.a(), "_id in ( " + strU0 + " )", (String[]) arrayList.toArray(new String[0]));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Delete rows: ");
                sb2.append(iDelete);
                Log.i("PhotoManagerPlugin", sb2.toString());
                reentrantLock.unlock();
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    i0.j(cursorR, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            reentrantLock.unlock();
            throw th4;
        }
    }

    @Override // g8.f
    public final ArrayList e(Context context, int i10, a2 a2Var) throws IOException {
        String strN;
        n.f(context, "context");
        ArrayList arrayList = new ArrayList();
        f.f41737a.getClass();
        String[] strArr = (String[]) k.y0(e.f41736e, new String[]{"count(1)"});
        ArrayList arrayList2 = new ArrayList();
        if (a2Var == null || (strN = a2Var.B(i10, arrayList2, true)) == null) {
            strN = defpackage.e.n(" AND ", j1.f.J(i10));
        }
        String strN2 = defpackage.e.n("bucket_id IS NOT NULL ", strN);
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        Cursor cursorR = r(contentResolver, e.a(), strArr, strN2, (String[]) arrayList2.toArray(new String[0]), null, false);
        try {
            Cursor cursor = cursorR;
            if (cursor.moveToNext()) {
                arrayList.add(new e8.b("isAll", cursor.getInt(k.t0("count(1)", strArr)), "Recent", i10, 32, true));
            }
            cursorR.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursorR, th2);
                throw th3;
            }
        }
    }

    @Override // g8.f
    public final String[] f() {
        f.f41737a.getClass();
        return (String[]) xj.n.j0(xj.n.C0(xj.n.C0(xj.n.B0(e.f41734c, e.f41733b), e.f41735d), f41730c)).toArray(new String[0]);
    }

    @Override // g8.f
    public final String g(Context context, String str) throws IOException {
        n.f(context, "context");
        e8.a aVarV = v(context, str);
        if (aVarV != null) {
            return aVarV.f39152b;
        }
        super.w(str);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00df A[LOOP:0: B:33:0x00d9->B:35:0x00df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0101  */
    /* JADX WARN: Code duplicated, block: B:40:0x010b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0129  */
    /* JADX WARN: Code duplicated, block: B:47:0x012f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0130  */
    /* JADX WARN: Code duplicated, block: B:50:0x0134  */
    /* JADX WARN: Code duplicated, block: B:64:0x0158  */
    /* JADX WARN: Code duplicated, block: B:66:0x016b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0171  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0134, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0158, please report this as an issue */
    @Override // g8.f
    public final e8.a j(Context context, String str, String str2) throws IOException {
        int i10;
        Uri EXTERNAL_CONTENT_URI;
        Uri uriA;
        c cVarH;
        ContentValues contentValues;
        Iterator it;
        Uri uriInsert;
        OutputStream outputStreamOpenOutputStream;
        FileInputStream fileInputStream;
        String lastPathSegment;
        e8.a aVarV;
        n.f(context, "context");
        wj.f fVarI = I(context, str);
        if (fVarI == null) {
            super.D("Cannot get gallery id of ".concat(str));
            throw null;
        }
        if (str2.equals((String) fVarI.f53283a)) {
            super.D("No copy required, because the target gallery is the same as the current one.");
            throw null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        e8.a aVarV2 = v(context, str);
        if (aVarV2 == null) {
            super.D("Failed to find the asset ".concat(str));
            throw null;
        }
        ArrayList arrayListM = xj.o.M("_display_name", "title", "date_added", "date_modified", IronSourceConstants.EVENTS_DURATION, "longitude", "latitude", "width", "height");
        int i11 = aVarV2.f39157g;
        if (i11 == 1) {
            i10 = 1;
        } else if (i11 != 2) {
            i10 = i11 != 3 ? 0 : 2;
        } else {
            i10 = 3;
        }
        if (i10 != 2) {
            arrayListM.add("description");
        }
        n.c(contentResolver);
        f.f41737a.getClass();
        int i12 = i10;
        Cursor cursorR = r(contentResolver, e.a(), (String[]) k.y0(arrayListM.toArray(new String[0]), new String[]{"_data"}), "_id = ?", new String[]{str}, null, false);
        if (!cursorR.moveToNext()) {
            super.w(str);
            throw null;
        }
        if (i12 == 1) {
            EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            n.e(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    uriA = e.a();
                } else {
                    EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    n.e(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                }
                cVarH = H(context, str2);
                if (cVarH != null) {
                    super.D("Cannot find gallery info");
                    throw null;
                }
                String strI = wi.d.i(cVarH.f41726a, "/", aVarV2.f39158h);
                contentValues = new ContentValues();
                it = arrayListM.iterator();
                n.e(it, "iterator(...)");
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    contentValues.put(str3, o.m(cursorR, str3));
                }
                contentValues.put("media_type", Integer.valueOf(i12));
                contentValues.put("_data", strI);
                uriInsert = contentResolver.insert(uriA, contentValues);
                if (uriInsert != null) {
                    super.D("Cannot insert new asset.");
                    throw null;
                }
                outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream != null) {
                    super.D("Cannot open output stream for " + uriInsert + ".");
                    throw null;
                }
                fileInputStream = new FileInputStream(new File(aVarV2.f39152b));
                try {
                    try {
                        no.b.g(fileInputStream, outputStreamOpenOutputStream);
                        outputStreamOpenOutputStream.close();
                        fileInputStream.close();
                        cursorR.close();
                        lastPathSegment = uriInsert.getLastPathSegment();
                        if (lastPathSegment != null) {
                            aVarV = v(context, lastPathSegment);
                            if (aVarV != null) {
                                return aVarV;
                            }
                            super.w(str);
                            throw null;
                        }
                        super.D("Cannot open output stream for " + uriInsert + ".");
                        throw null;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            i0.j(outputStreamOpenOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        i0.j(fileInputStream, th4);
                        throw th5;
                    }
                }
            }
            EXTERNAL_CONTENT_URI = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            n.e(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        }
        uriA = EXTERNAL_CONTENT_URI;
        cVarH = H(context, str2);
        if (cVarH != null) {
            super.D("Cannot find gallery info");
            throw null;
        }
        String strI2 = wi.d.i(cVarH.f41726a, "/", aVarV2.f39158h);
        contentValues = new ContentValues();
        it = arrayListM.iterator();
        n.e(it, "iterator(...)");
        while (it.hasNext()) {
            String str4 = (String) it.next();
            contentValues.put(str4, o.m(cursorR, str4));
        }
        contentValues.put("media_type", Integer.valueOf(i12));
        contentValues.put("_data", strI2);
        uriInsert = contentResolver.insert(uriA, contentValues);
        if (uriInsert != null) {
            super.D("Cannot insert new asset.");
            throw null;
        }
        outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
        if (outputStreamOpenOutputStream != null) {
            super.D("Cannot open output stream for " + uriInsert + ".");
            throw null;
        }
        fileInputStream = new FileInputStream(new File(aVarV2.f39152b));
        no.b.g(fileInputStream, outputStreamOpenOutputStream);
        outputStreamOpenOutputStream.close();
        fileInputStream.close();
        cursorR.close();
        lastPathSegment = uriInsert.getLastPathSegment();
        if (lastPathSegment != null) {
            aVarV = v(context, lastPathSegment);
            if (aVarV != null) {
                return aVarV;
            }
            super.w(str);
            throw null;
        }
        super.D("Cannot open output stream for " + uriInsert + ".");
        throw null;
    }

    @Override // g8.f
    public final Uri k() {
        f.f41737a.getClass();
        return e.a();
    }

    @Override // g8.f
    public final Uri l(long j10, int i10, boolean z10) {
        return super.l(j10, i10, false);
    }

    @Override // g8.f
    public final void n(Context context) {
        n.f(context, "context");
    }

    @Override // g8.f
    public final ArrayList o(Context context, String str, int i10, int i11, int i12, a2 a2Var) throws IOException {
        String strN;
        n.f(context, "context");
        boolean z10 = str.length() == 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!z10) {
            arrayList2.add(str);
        }
        if (a2Var == null || (strN = a2Var.B(i12, arrayList2, true)) == null) {
            strN = defpackage.e.n(" AND ", j1.f.J(i12));
        }
        String[] strArrF = f();
        String strI = wi.d.i(z10 ? "bucket_id IS NOT NULL" : "bucket_id = ?", " ", strN);
        String strP = super.p(i10 * i11, i11, a2Var);
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        f.f41737a.getClass();
        Cursor cursorR = r(contentResolver, e.a(), strArrF, strI, (String[]) arrayList2.toArray(new String[0]), strP, false);
        try {
            Cursor cursor = cursorR;
            while (cursor.moveToNext()) {
                e8.a aVarY = o.y(cursor, context, false, 10);
                if (aVarY != null) {
                    arrayList.add(aVarY);
                }
            }
            cursorR.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursorR, th2);
                throw th3;
            }
        }
    }

    @Override // g8.f
    public final Cursor r(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, boolean z10) {
        return super.r(contentResolver, uri, strArr, str, strArr2, str2, false);
    }

    @Override // g8.f
    public final ArrayList s(Context context, int i10, a2 a2Var) throws IOException {
        String strN;
        n.f(context, "context");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (a2Var == null || (strN = a2Var.B(i10, arrayList2, true)) == null) {
            strN = defpackage.e.n(" AND ", j1.f.J(i10));
        }
        String strH = wi.d.h(defpackage.e.n("bucket_id IS NOT NULL ", strN), ") GROUP BY (bucket_id");
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        f.f41737a.getClass();
        Cursor cursorR = r(contentResolver, e.a(), (String[]) k.y0(e.f41736e, new String[]{"count(1)"}), strH, (String[]) arrayList2.toArray(new String[0]), null, false);
        try {
            Cursor cursor = cursorR;
            while (cursor.moveToNext()) {
                String string = cursor.getString(0);
                String string2 = cursor.getString(1);
                if (string2 == null) {
                    string2 = "";
                }
                String str = string2;
                int i11 = cursor.getInt(2);
                n.c(string);
                e8.b bVar = new e8.b(string, i11, str, 0, 48, false);
                if (a2Var != null && a2Var.q()) {
                    super.u(context, bVar);
                }
                arrayList.add(bVar);
            }
            cursorR.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursorR, th2);
                throw th3;
            }
        }
    }

    @Override // g8.f
    public final e8.a v(Context context, String id2) throws IOException {
        n.f(context, "context");
        n.f(id2, "id");
        f.f41737a.getClass();
        ArrayList arrayList = e.f41733b;
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        Cursor cursorR = r(contentResolver, e.a(), (String[]) xj.n.j0(xj.n.C0(xj.n.C0(xj.n.B0(e.f41734c, arrayList), f41730c), e.f41735d)).toArray(new String[0]), "_id = ?", new String[]{id2}, null, false);
        try {
            Cursor cursor = cursorR;
            e8.a aVarY = cursor.moveToNext() ? o.y(cursor, context, true, 12) : null;
            cursorR.close();
            return aVarY;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursorR, th2);
                throw th3;
            }
        }
    }

    @Override // g8.f
    public final void w(Object obj) {
        super.w(obj);
        throw null;
    }

    @Override // g8.f
    public final e8.b x(Context context, String str, int i10, a2 a2Var) throws IOException {
        String strN;
        String str2;
        e8.b bVar;
        n.f(context, "context");
        ArrayList arrayList = new ArrayList();
        if (a2Var == null || (strN = a2Var.B(i10, arrayList, true)) == null) {
            strN = defpackage.e.n(" AND ", j1.f.J(i10));
        }
        if (str.equals("")) {
            str2 = "";
        } else {
            arrayList.add(str);
            str2 = "AND bucket_id = ?";
        }
        String strI = q4.a.i(defpackage.e.n("bucket_id IS NOT NULL ", strN), " ", str2, ") GROUP BY (bucket_id");
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        f.f41737a.getClass();
        Cursor cursorR = r(contentResolver, e.a(), (String[]) k.y0(e.f41736e, new String[]{"count(1)"}), strI, (String[]) arrayList.toArray(new String[0]), null, false);
        try {
            Cursor cursor = cursorR;
            if (cursor.moveToNext()) {
                String string = cursor.getString(0);
                String string2 = cursor.getString(1);
                String str3 = string2 == null ? "" : string2;
                int i11 = cursor.getInt(2);
                n.c(string);
                bVar = new e8.b(string, i11, str3, 0, 48, false);
            } else {
                bVar = null;
            }
            cursorR.close();
            return bVar;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursorR, th2);
                throw th3;
            }
        }
    }

    @Override // g8.f
    public final a1.h z(Context context, String str) throws IOException {
        n.f(context, "context");
        e8.a aVarV = v(context, str);
        if (aVarV == null) {
            return null;
        }
        String str2 = aVarV.f39152b;
        if (new File(str2).exists()) {
            return new a1.h(str2);
        }
        return null;
    }
}
