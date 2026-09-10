package g8;

import an.p;
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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.n;
import qk.i0;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f41724b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f41725c = new ReentrantLock();

    @Override // g8.f
    public final byte[] A(Context context, e8.a aVar, boolean z10) throws IOException {
        n.f(context, "context");
        long j10 = aVar.f39151a;
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(super.l(j10, aVar.f39157g, z10));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (inputStreamOpenInputStream != null) {
                try {
                    byteArrayOutputStream.write(no.b.E(inputStreamOpenInputStream));
                    inputStreamOpenInputStream.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        i0.j(inputStreamOpenInputStream, th2);
                        throw th3;
                    }
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            n.c(byteArray);
            l8.a.d("The asset " + j10 + " origin byte length : " + byteArray.length);
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                i0.j(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    @Override // g8.f
    public final e8.a C(Context context, String str, String str2) throws Exception {
        n.f(context, "context");
        wj.f fVarH = H(context, str);
        if (fVarH == null) {
            super.D("Cannot get gallery id of ".concat(str));
            throw null;
        }
        if (str2.equals((String) fVarH.f53283a)) {
            super.D("No move required, because the target gallery is the same as the current one.");
            throw null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        String strF = F(context, str2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("relative_path", strF);
        f.f41737a.getClass();
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
        Cursor cursorR = r(contentResolver, e.a(), new String[]{"bucket_id", "relative_path"}, "bucket_id = ?", new String[]{str}, null, false);
        Cursor cursor = cursorR;
        try {
            if (!cursorR.moveToNext()) {
                cursor.close();
                return null;
            }
            String string = cursorR.getString(1);
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
    }

    public final wj.f H(Context context, String str) throws IOException {
        n.f(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        n.c(contentResolver);
        f.f41737a.getClass();
        Cursor cursorR = r(contentResolver, e.a(), new String[]{"bucket_id", "relative_path"}, "_id = ?", new String[]{str}, null, false);
        Cursor cursor = cursorR;
        try {
            if (!cursorR.moveToNext()) {
                cursor.close();
                return null;
            }
            wj.f fVar = new wj.f(cursorR.getString(0), new File(cursorR.getString(1)).getParent());
            cursor.close();
            return fVar;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursor, th2);
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
        String strI = wi.d.i(z10 ? "bucket_id IS NOT NULL" : "bucket_id = ?", " ", strN);
        int i13 = i11 - i10;
        String strE = a2Var != null ? a2Var.E() : null;
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        f.f41737a.getClass();
        Cursor cursorR = r(contentResolver, e.a(), f(), strI, (String[]) arrayList2.toArray(new String[0]), strE, false);
        try {
            Cursor cursor = cursorR;
            a aVar = new a(context, arrayList, 0);
            cursor.moveToPosition(i10 - 1);
            for (int i14 = 0; i14 < i13; i14++) {
                if (cursor.moveToNext()) {
                    aVar.invoke(cursor);
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
        int i10;
        ArrayList arrayList;
        e eVar = f.f41737a;
        b bVar = f41724b;
        n.f(context, "context");
        ReentrantLock reentrantLock = f41725c;
        if (reentrantLock.isLocked()) {
            Log.i("PhotoManagerPlugin", "The removeAllExistsAssets is running.");
            return false;
        }
        reentrantLock.lock();
        try {
            Log.i("PhotoManagerPlugin", "The removeAllExistsAssets is starting.");
            ArrayList arrayList2 = new ArrayList();
            ContentResolver contentResolver = context.getContentResolver();
            n.c(contentResolver);
            eVar.getClass();
            Uri uriA = e.a();
            String[] strArr = {"_id", "media_type", "_data"};
            int i11 = 1;
            Integer[] numArr = {2, 3, 1};
            ArrayList arrayList3 = new ArrayList(3);
            int i12 = 0;
            for (int i13 = 3; i12 < i13; i13 = 3) {
                arrayList3.add(String.valueOf(numArr[i12].intValue()));
                i12++;
            }
            int i14 = 3;
            Cursor cursorR = bVar.r(contentResolver, uriA, strArr, "media_type in ( ?,?,? )", (String[]) arrayList3.toArray(new String[0]), null, false);
            try {
                Cursor cursor = cursorR;
                int i15 = 0;
                while (cursor.moveToNext()) {
                    String strM = o.m(cursor, "_id");
                    int iJ = o.j(cursor, "media_type");
                    String strN = o.n(cursor, "_data");
                    if (iJ == i11) {
                        i10 = 1;
                    } else if (iJ == 2) {
                        i10 = i14;
                    } else if (iJ != i14) {
                        i10 = 0;
                    } else {
                        i10 = 2;
                    }
                    try {
                        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(super.l(Long.parseLong(strM), i10, false));
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                        arrayList = arrayList2;
                    } catch (Exception unused) {
                        arrayList = arrayList2;
                        arrayList.add(strM);
                        Log.i("PhotoManagerPlugin", "The " + strM + ", " + strN + " media was not exists. ");
                    }
                    i15++;
                    if (i15 % 300 == 0) {
                        Log.i("PhotoManagerPlugin", "Current checked count == " + i15);
                    }
                    arrayList2 = arrayList;
                    i11 = 1;
                    i14 = 3;
                }
                ArrayList arrayList4 = arrayList2;
                Log.i("PhotoManagerPlugin", "The removeAllExistsAssets was stopped, will be delete ids = " + arrayList4);
                cursorR.close();
                String strU0 = xj.n.u0(arrayList4, ",", null, null, new bh.a(9), 30);
                int iDelete = contentResolver.delete(e.a(), "_id in ( " + strU0 + " )", (String[]) arrayList4.toArray(new String[0]));
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
        ArrayList arrayList2 = new ArrayList();
        if (a2Var == null || (strN = a2Var.B(i10, arrayList2, true)) == null) {
            strN = defpackage.e.n(" AND ", j1.f.J(i10));
        }
        String strN2 = defpackage.e.n("bucket_id IS NOT NULL ", strN);
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        f.f41737a.getClass();
        Cursor cursorR = r(contentResolver, e.a(), e.f41736e, strN2, (String[]) arrayList2.toArray(new String[0]), a2Var != null ? a2Var.E() : null, false);
        try {
            arrayList.add(new e8.b("isAll", cursorR.getCount(), "Recent", i10, 32, true));
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
        return (String[]) xj.n.j0(xj.n.C0(xj.n.C0(xj.n.B0(e.f41734c, e.f41733b), e.f41735d), new String[]{"relative_path"})).toArray(new String[0]);
    }

    @Override // g8.f
    public final String g(Context context, String str) throws Exception {
        n.f(context, "context");
        e8.a aVarV = v(context, str);
        if (aVarV != null) {
            return aVarV.f39152b;
        }
        super.w(str);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d4 A[LOOP:0: B:32:0x00ce->B:34:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:39:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0124 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0125  */
    /* JADX WARN: Code duplicated, block: B:50:0x0129  */
    /* JADX WARN: Code duplicated, block: B:64:0x014d  */
    /* JADX WARN: Code duplicated, block: B:66:0x015f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0172  */
    /* JADX WARN: Code duplicated, block: B:83:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0129, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x014d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x015f, please report this as an issue */
    @Override // g8.f
    public final e8.a j(Context context, String str, String str2) throws Exception {
        int i10;
        Uri EXTERNAL_CONTENT_URI;
        Uri uriA;
        ContentValues contentValues;
        Iterator it;
        Uri uriInsert;
        OutputStream outputStreamOpenOutputStream;
        Uri uriL;
        InputStream inputStreamOpenInputStream;
        String lastPathSegment;
        e8.a aVarV;
        n.f(context, "context");
        wj.f fVarH = H(context, str);
        if (fVarH == null) {
            super.D("Cannot get gallery id of ".concat(str));
            throw null;
        }
        if (str2.equals((String) fVarH.f53283a)) {
            super.D("No copy required, because the target gallery is the same as the current one.");
            throw null;
        }
        e8.a aVarV2 = v(context, str);
        if (aVarV2 == null) {
            super.w(str);
            throw null;
        }
        int i11 = aVarV2.f39157g;
        ArrayList arrayListM = xj.o.M("_display_name", "title", "date_added", "date_modified", "datetaken", IronSourceConstants.EVENTS_DURATION, "width", "height", "orientation");
        if (i11 == 1) {
            i10 = 1;
        } else if (i11 != 2) {
            i10 = i11 != 3 ? 0 : 2;
        } else {
            i10 = 3;
        }
        if (i10 == 3) {
            arrayListM.add("description");
        }
        ContentResolver contentResolver = context.getContentResolver();
        n.c(contentResolver);
        f.f41737a.getClass();
        int i12 = i10;
        Cursor cursorR = r(contentResolver, e.a(), (String[]) k.y0(arrayListM.toArray(new String[0]), new String[]{"relative_path"}), "_id = ?", new String[]{str}, null, false);
        if (!cursorR.moveToNext()) {
            super.D("Cannot find asset.");
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
                String strF = F(context, str2);
                contentValues = new ContentValues();
                it = arrayListM.iterator();
                n.e(it, "iterator(...)");
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    contentValues.put(str3, o.m(cursorR, str3));
                }
                contentValues.put("media_type", Integer.valueOf(i12));
                contentValues.put("relative_path", strF);
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
                uriL = super.l(aVarV2.f39151a, i11, true);
                inputStreamOpenInputStream = contentResolver.openInputStream(uriL);
                try {
                    if (inputStreamOpenInputStream != null) {
                        super.D("Cannot open input stream for " + uriL);
                        throw null;
                    }
                    try {
                        no.b.g(inputStreamOpenInputStream, outputStreamOpenOutputStream);
                        outputStreamOpenOutputStream.close();
                        inputStreamOpenInputStream.close();
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
                        i0.j(inputStreamOpenInputStream, th4);
                        throw th5;
                    }
                }
            }
            EXTERNAL_CONTENT_URI = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            n.e(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        }
        uriA = EXTERNAL_CONTENT_URI;
        String strF2 = F(context, str2);
        contentValues = new ContentValues();
        it = arrayListM.iterator();
        n.e(it, "iterator(...)");
        while (it.hasNext()) {
            String str4 = (String) it.next();
            contentValues.put(str4, o.m(cursorR, str4));
        }
        contentValues.put("media_type", Integer.valueOf(i12));
        contentValues.put("relative_path", strF2);
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
        uriL = super.l(aVarV2.f39151a, i11, true);
        inputStreamOpenInputStream = contentResolver.openInputStream(uriL);
        if (inputStreamOpenInputStream != null) {
            super.D("Cannot open input stream for " + uriL);
            throw null;
        }
        no.b.g(inputStreamOpenInputStream, outputStreamOpenOutputStream);
        outputStreamOpenOutputStream.close();
        inputStreamOpenInputStream.close();
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
        File[] fileArrListFiles;
        n.f(context, "context");
        File cacheDir = context.getCacheDir();
        if (cacheDir == null || (fileArrListFiles = cacheDir.listFiles()) == null) {
            return;
        }
        for (File file : k.m0(fileArrListFiles)) {
            String name = file.getName();
            n.e(name, "getName(...)");
            if (p.p0(name, "pm_", false)) {
                file.delete();
            }
        }
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
        String strI = wi.d.i(z10 ? "bucket_id IS NOT NULL" : "bucket_id = ?", " ", strN);
        int i13 = i10 * i11;
        String strE = a2Var != null ? a2Var.E() : null;
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        f.f41737a.getClass();
        Cursor cursorR = r(contentResolver, e.a(), f(), strI, (String[]) arrayList2.toArray(new String[0]), strE, false);
        try {
            Cursor cursor = cursorR;
            a aVar = new a(context, arrayList, 1);
            cursor.moveToPosition(i13 - 1);
            for (int i14 = 0; i14 < i11; i14++) {
                if (cursor.moveToNext()) {
                    aVar.invoke(cursor);
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
    public final ArrayList s(Context context, int i10, a2 a2Var) throws Exception {
        String strN;
        n.f(context, "context");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = i10;
        if (a2Var == null || (strN = a2Var.B(i11, arrayList2, true)) == null) {
            strN = defpackage.e.n(" AND ", j1.f.J(i11));
        }
        String strN2 = defpackage.e.n("bucket_id IS NOT NULL ", strN);
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        f.f41737a.getClass();
        Cursor cursorR = r(contentResolver, e.a(), e.f41736e, strN2, (String[]) arrayList2.toArray(new String[0]), a2Var != null ? a2Var.E() : null, false);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Cursor cursor = cursorR;
        try {
            Cursor cursor2 = cursor;
            l8.a.e(cursor2);
            while (cursor2.moveToNext()) {
                String strM = o.m(cursor2, "bucket_id");
                if (map.containsKey(strM)) {
                    Object obj = map2.get(strM);
                    n.c(obj);
                    map2.put(strM, Integer.valueOf(((Number) obj).intValue() + 1));
                } else {
                    map.put(strM, o.m(cursor2, "bucket_display_name"));
                    map2.put(strM, 1);
                }
            }
            cursor.close();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Object obj2 = map2.get(str);
                n.c(obj2);
                e8.b bVar = new e8.b(str, ((Number) obj2).intValue(), str2, i11, 32, false);
                if (a2Var != null && a2Var.q()) {
                    super.u(context, bVar);
                }
                arrayList.add(bVar);
                i11 = i10;
            }
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

    @Override // g8.f
    public final e8.a v(Context context, String id2) throws Exception {
        n.f(context, "context");
        n.f(id2, "id");
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        f.f41737a.getClass();
        Cursor cursorR = super.r(contentResolver, e.a(), f(), "_id = ?", new String[]{id2}, null, true);
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
        n.f(context, "context");
        String str3 = "";
        boolean zEquals = str.equals("");
        ArrayList arrayList = new ArrayList();
        if (a2Var == null || (strN = a2Var.B(i10, arrayList, true)) == null) {
            strN = defpackage.e.n(" AND ", j1.f.J(i10));
        }
        if (zEquals) {
            str2 = "";
        } else {
            arrayList.add(str);
            str2 = "AND bucket_id = ?";
        }
        String strI = wi.d.i(defpackage.e.n("bucket_id IS NOT NULL ", strN), " ", str2);
        ContentResolver contentResolver = context.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        f.f41737a.getClass();
        Cursor cursorR = r(contentResolver, e.a(), e.f41736e, strI, (String[]) arrayList.toArray(new String[0]), null, false);
        try {
            Cursor cursor = cursorR;
            if (!cursor.moveToNext()) {
                cursorR.close();
                return null;
            }
            String string = cursor.getString(1);
            if (string != null) {
                str3 = string;
            }
            int count = cursor.getCount();
            cursorR.close();
            return new e8.b(str, count, str3, i10, 32, zEquals);
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
    public final a1.h z(Context context, String str) {
        n.f(context, "context");
        try {
            e8.a aVarV = v(context, str);
            if (aVarV != null) {
                Uri requireOriginal = MediaStore.setRequireOriginal(super.l(aVarV.f39151a, aVarV.f39157g, false));
                n.e(requireOriginal, "setRequireOriginal(...)");
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(requireOriginal);
                if (inputStreamOpenInputStream != null) {
                    return new a1.h(inputStreamOpenInputStream);
                }
            }
            return null;
        } catch (Exception e10) {
            l8.a.b(e10);
            return null;
        }
    }
}
