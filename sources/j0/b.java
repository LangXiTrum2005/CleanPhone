package j0;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import androidx.recyclerview.widget.o1;
import com.google.android.gms.internal.auth.o;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f43545a = new o1(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b2.j f43546b = new b2.j(12);

    public static h a(Context context, List list) {
        String str;
        Typeface typefaceE;
        Trace.beginSection(o.z("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                c cVar = (c) list.get(i10);
                if (Build.VERSION.SDK_INT < 31 || (typefaceE = f0.d.e((str = cVar.f43551e))) == null || f0.d.f(typefaceE) == null) {
                    ProviderInfo providerInfoB = b(context.getPackageManager(), cVar, context.getResources());
                    if (providerInfoB == null) {
                        return new h();
                    }
                    arrayList.add(c(context, cVar, providerInfoB.authority));
                } else {
                    arrayList.add(new i[]{new i(str, cVar.f43552f)});
                }
            }
            return new h(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, c cVar, Resources resources) {
        b2.j jVar = f43546b;
        o1 o1Var = f43545a;
        Trace.beginSection(o.z("FontProvider.getProvider"));
        try {
            List listE = cVar.f43550d;
            String str = cVar.f43547a;
            String str2 = cVar.f43548b;
            if (listE == null) {
                listE = e0.b.e(resources, 0);
            }
            a aVar = new a();
            aVar.f43542a = str;
            aVar.f43543b = str2;
            aVar.f43544c = listE;
            ProviderInfo providerInfo = (ProviderInfo) o1Var.g(aVar);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, jVar);
            for (int i10 = 0; i10 < listE.size(); i10++) {
                ArrayList arrayList2 = new ArrayList((Collection) listE.get(i10));
                Collections.sort(arrayList2, jVar);
                if (arrayList.size() == arrayList2.size()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            o1Var.k(aVar, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static i[] c(Context context, c cVar, String str) {
        Trace.beginSection(o.z("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath(X3.i.f27782b).build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(o.z("ContentQueryWrapper.query"));
                try {
                    String[] strArr2 = {cVar.f43549c};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e10) {
                            Log.w("FontsProvider", "Unable to query the content provider", e10);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i10 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new i(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, cVar.f43552f, i10));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    i[] iVarArr = (i[]) arrayList.toArray(new i[0]);
                    Trace.endSection();
                    return iVarArr;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } catch (Throwable th3) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }
}
