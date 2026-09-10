package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class FontProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4362a = new a(0);

    public interface ContentQueryWrapper {
    }

    public static class ContentQueryWrapperApi16Impl implements ContentQueryWrapper {
    }

    public static class ContentQueryWrapperApi24Impl implements ContentQueryWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f4363a;

        public ContentQueryWrapperApi24Impl(Context context, Uri uri) {
            this.f4363a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }
    }

    public static FontsContractCompat.FontFamilyResult a(Context context, FontRequest fontRequest) throws PackageManager.NameNotFoundException {
        Cursor cursorQuery;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = fontRequest.f4364a;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(android.support.v4.media.a.C("No package found for authority: ", str));
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = fontRequest.f4365b;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException(android.support.v4.media.a.o("Found content provider ", str, ", but package was not ", str3));
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        a aVar = f4362a;
        Collections.sort(arrayList, aVar);
        List listB = fontRequest.d;
        if (listB == null) {
            listB = FontResourcesParserCompat.b(resources, 0);
        }
        int i2 = 0;
        loop1: while (true) {
            cursorQuery = null;
            if (i2 >= listB.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listB.get(i2));
            Collections.sort(arrayList2, aVar);
            if (arrayList.size() == arrayList2.size()) {
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        break loop1;
                    }
                    if (!Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                        break;
                    }
                    i3++;
                }
            }
            i2++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new FontsContractCompat.FontFamilyResult(1, null);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str4).appendPath(d9.h.f24719b).build();
        ContentProviderClient contentProviderClient = new ContentQueryWrapperApi24Impl(context, uriBuild).f4363a;
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            String[] strArr2 = {fontRequest.f4366c};
            if (contentProviderClient != null) {
                try {
                    cursorQuery = contentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                } catch (RemoteException e2) {
                    Log.w("FontsProvider", "Unable to query the content provider", e2);
                }
            }
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                while (cursorQuery.moveToNext()) {
                    arrayList3.add(new FontsContractCompat.FontInfo(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0));
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
            return new FontsContractCompat.FontFamilyResult(0, (FontsContractCompat.FontInfo[]) arrayList3.toArray(new FontsContractCompat.FontInfo[0]));
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
            throw th;
        }
    }
}
