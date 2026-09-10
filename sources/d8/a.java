package d8;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import cc.a2;
import com.google.android.gms.internal.play_billing.q1;
import d5.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.n;
import qk.i0;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ExecutorService f38757d = Executors.newFixedThreadPool(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f38760c;

    public a(Context context) {
        n.f(context, "context");
        this.f38758a = context;
        this.f38760c = new ArrayList();
    }

    public final void a(l8.b bVar, a2 a2Var, int i10, String str) {
        String strJ;
        g8.f fVarB = b();
        fVarB.getClass();
        Context context = this.f38758a;
        n.f(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        ArrayList arrayList = new ArrayList();
        if (a2Var == null || (strJ = a2Var.B(i10, arrayList, false)) == null) {
            strJ = j1.f.J(i10);
        }
        StringBuilder sbI = u.i(strJ);
        if (!str.equals("isAll")) {
            if (an.h.T0(sbI).length() > 0) {
                sbI.append(" AND ");
            }
            sbI.append("bucket_id = ?");
            arrayList.add(str);
        }
        String string = sbI.toString();
        n.e(string, "toString(...)");
        String strE = a2Var != null ? a2Var.E() : null;
        n.c(contentResolver);
        Cursor cursorR = fVarB.r(contentResolver, fVarB.k(), new String[]{"_id"}, string, (String[]) arrayList.toArray(new String[0]), strE, false);
        try {
            int count = cursorR.getCount();
            cursorR.close();
            bVar.b(Integer.valueOf(count));
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(cursorR, th2);
                throw th3;
            }
        }
    }

    public final g8.f b() {
        return !this.f38759b ? g8.b.f41724b : g8.d.f41729b;
    }

    public final String c(String str) {
        return b().F(this.f38758a, str);
    }

    public final Uri d(String id2) {
        n.f(id2, "id");
        g8.f fVarB = b();
        g8.e eVar = g8.f.f41737a;
        e8.a aVarV = fVarB.v(this.f38758a, id2);
        if (aVarV != null) {
            return aVarV.a();
        }
        throw new RuntimeException("Failed to find asset ".concat(id2));
    }

    public final void e(l8.b bVar) {
        bVar.b(Boolean.valueOf(b().d(this.f38758a)));
    }

    public final e8.a f(String str, String str2, String str3, String str4, Integer num, Double d10, Double d11, Long l) throws IOException {
        int iN;
        g8.f fVarB = b();
        fVarB.getClass();
        g8.e eVar = g8.f.f41737a;
        Context context = this.f38758a;
        n.f(context, "context");
        q1.d(str);
        File file = new File(str);
        FileInputStream fileInputStream = new FileInputStream(file);
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str2);
        if (strGuessContentTypeFromName == null && (strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str)) == null) {
            strGuessContentTypeFromName = URLConnection.guessContentTypeFromStream(fileInputStream);
            fileInputStream = new FileInputStream(file);
            if (strGuessContentTypeFromName == null) {
                strGuessContentTypeFromName = "image/*";
            }
        }
        a1.h hVar = new a1.h(fileInputStream);
        int iD = hVar.d(0, "ImageWidth");
        int iD2 = hVar.d(0, "ImageLength");
        if (num != null) {
            iN = num.intValue();
        } else {
            eVar.getClass();
            iN = hVar.n();
        }
        eVar.getClass();
        double[] dArr = (d10 == null || d11 == null) ? null : new double[]{d10.doubleValue(), d11.doubleValue()};
        FileInputStream fileInputStream2 = new FileInputStream(file);
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
        return fVarB.G(context, fileInputStream2, EXTERNAL_CONTENT_URI, contentValues);
    }
}
