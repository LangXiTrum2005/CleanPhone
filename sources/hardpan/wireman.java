package hardpan;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import androidx.collection.preprohormone;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: FontProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final preprohormone<dern, ProviderInfo> f27530attabal = new preprohormone<>(2);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Comparator<byte[]> f27531saneness = new Comparator() { // from class: hardpan.dern
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return wireman.attabal((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: compiled from: FontProvider.java */
    public interface attabal {
        static attabal attabal(Context context, Uri uri) {
            return new saneness(context, uri);
        }

        void close();

        Cursor saneness(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);
    }

    /* JADX INFO: compiled from: FontProvider.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f27532attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public List<List<byte[]>> f27533dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f27534saneness;

        public dern(String str, String str2, List<List<byte[]>> list) {
            this.f27532attabal = str;
            this.f27534saneness = str2;
            this.f27533dern = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dern)) {
                return false;
            }
            dern dernVar = (dern) obj;
            return Objects.equals(this.f27532attabal, dernVar.f27532attabal) && Objects.equals(this.f27534saneness, dernVar.f27534saneness) && Objects.equals(this.f27533dern, dernVar.f27533dern);
        }

        public int hashCode() {
            return Objects.hash(this.f27532attabal, this.f27534saneness, this.f27533dern);
        }
    }

    /* JADX INFO: compiled from: FontProvider.java */
    public static class saneness implements attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ContentProviderClient f27535attabal;

        public saneness(Context context, Uri uri) {
            this.f27535attabal = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // hardpan.wireman.attabal
        public void close() {
            ContentProviderClient contentProviderClient = this.f27535attabal;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }

        @Override // hardpan.wireman.attabal
        public Cursor saneness(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f27535attabal;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }
    }

    public static /* synthetic */ int attabal(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public static ProviderInfo beachfront(PackageManager packageManager, marial marialVar, Resources resources) throws PackageManager.NameNotFoundException {
        ferrovanadium.attabal.attabal("FontProvider.getProvider");
        try {
            List<List<byte[]>> listWireman = wireman(marialVar, resources);
            dern dernVar = new dern(marialVar.marial(), marialVar.beachfront(), listWireman);
            ProviderInfo providerInfo = f27530attabal.get(dernVar);
            if (providerInfo != null) {
                ferrovanadium.attabal.saneness();
                return providerInfo;
            }
            String strMarial = marialVar.marial();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strMarial, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strMarial);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(marialVar.beachfront())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strMarial + ", but package was not " + marialVar.beachfront());
            }
            List<byte[]> listSaneness = saneness(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listSaneness, f27531saneness);
            for (int i = 0; i < listWireman.size(); i++) {
                ArrayList arrayList = new ArrayList(listWireman.get(i));
                Collections.sort(arrayList, f27531saneness);
                if (dern(listSaneness, arrayList)) {
                    f27530attabal.put(dernVar, providerInfoResolveContentProvider);
                    ferrovanadium.attabal.saneness();
                    return providerInfoResolveContentProvider;
                }
            }
            ferrovanadium.attabal.saneness();
            return null;
        } catch (Throwable th) {
            ferrovanadium.attabal.saneness();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [hardpan.wireman$attabal] */
    /* JADX WARN: Type inference failed for: r16v7 */
    public static competently.saneness[] competently(Context context, marial marialVar, String str, CancellationSignal cancellationSignal) {
        ?? r16;
        attabal attabalVar;
        boolean z;
        ferrovanadium.attabal.attabal("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath(X3.i.b).build();
            attabal attabalVarAttabal = attabal.attabal(context, uriBuild);
            Cursor cursorSaneness = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                ferrovanadium.attabal.attabal("ContentQueryWrapper.query");
                try {
                    try {
                        cursorSaneness = attabalVarAttabal.saneness(uriBuild, strArr, "query = ?", new String[]{marialVar.competently()}, null, cancellationSignal);
                        ferrovanadium.attabal.saneness();
                        if (cursorSaneness == null || cursorSaneness.getCount() <= 0) {
                            attabalVar = attabalVarAttabal;
                        } else {
                            int columnIndex = cursorSaneness.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorSaneness.getColumnIndex("_id");
                            int columnIndex3 = cursorSaneness.getColumnIndex("file_id");
                            int columnIndex4 = cursorSaneness.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorSaneness.getColumnIndex("font_weight");
                            int columnIndex6 = cursorSaneness.getColumnIndex("font_italic");
                            while (cursorSaneness.moveToNext()) {
                                int i = columnIndex != -1 ? cursorSaneness.getInt(columnIndex) : 0;
                                int i2 = columnIndex4 != -1 ? cursorSaneness.getInt(columnIndex4) : 0;
                                Uri uriWithAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorSaneness.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorSaneness.getLong(columnIndex3));
                                int i3 = columnIndex5 != -1 ? cursorSaneness.getInt(columnIndex5) : 400;
                                if (columnIndex6 != -1) {
                                    z = true;
                                    if (cursorSaneness.getInt(columnIndex6) != 1) {
                                        z = false;
                                    }
                                } else {
                                    z = false;
                                }
                                arrayList2.add(competently.saneness.attabal(uriWithAppendedId, i2, i3, z, i));
                                attabalVarAttabal = attabalVarAttabal;
                            }
                            attabalVar = attabalVarAttabal;
                            arrayList = arrayList2;
                        }
                        if (cursorSaneness != null) {
                            cursorSaneness.close();
                        }
                        attabalVar.close();
                        return (competently.saneness[]) arrayList.toArray(new competently.saneness[0]);
                    } finally {
                        ferrovanadium.attabal.saneness();
                    }
                } catch (Throwable th) {
                    th = th;
                    r16 = context;
                    if (cursorSaneness != null) {
                        cursorSaneness.close();
                    }
                    r16.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r16 = attabalVarAttabal;
            }
        } catch (Throwable th3) {
            ferrovanadium.attabal.saneness();
            throw th3;
        }
    }

    public static boolean dern(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static competently.attabal marial(Context context, List<marial> list, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ferrovanadium.attabal.attabal("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                marial marialVar = list.get(i);
                ProviderInfo providerInfoBeachfront = beachfront(context.getPackageManager(), marialVar, context.getResources());
                if (providerInfoBeachfront == null) {
                    return competently.attabal.saneness(1, null);
                }
                arrayList.add(competently(context, marialVar, providerInfoBeachfront.authority, cancellationSignal));
            }
            return competently.attabal.attabal(0, arrayList);
        } finally {
            ferrovanadium.attabal.saneness();
        }
    }

    public static List<byte[]> saneness(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static List<List<byte[]>> wireman(marial marialVar, Resources resources) {
        return marialVar.saneness() != null ? marialVar.saneness() : lightstruck.marial.dern(resources, marialVar.dern());
    }
}
