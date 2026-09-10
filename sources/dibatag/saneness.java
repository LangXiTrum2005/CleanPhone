package dibatag;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: SharedPreferencesStorage.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Map<String, SharedPreferences> f25241attabal = new ConcurrentHashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Map<String, SharedPreferences.Editor> f25242saneness = new ConcurrentHashMap();

    public static boolean attabal(Context context, String str) {
        boolean zCommit;
        try {
            SharedPreferences.Editor editorWireman = wireman(context, str);
            if (editorWireman == null) {
                return false;
            }
            synchronized (editorWireman) {
                try {
                    zCommit = editorWireman.remove(str).commit();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zCommit;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    public static <T> boolean beachfront(Context context, String str, T t) {
        boolean zCommit;
        try {
            SharedPreferences.Editor editorWireman = wireman(context, str);
            if (editorWireman == null) {
                return false;
            }
            synchronized (editorWireman) {
                try {
                    zCommit = editorWireman.putString(str, String.valueOf(t)).commit();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zCommit;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    public static String dern(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length <= 0) {
            return "sp_base_storage_common";
        }
        return "base_storage_" + strArrSplit[1];
    }

    public static SharedPreferences marial(Context context, String str) {
        String strDern;
        if (context == null || (strDern = dern(str)) == null) {
            return null;
        }
        Map<String, SharedPreferences> map = f25241attabal;
        SharedPreferences sharedPreferences = map.get(strDern);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(strDern, 0);
        map.put(strDern, sharedPreferences2);
        return sharedPreferences2;
    }

    public static <T> T saneness(Context context, String str) {
        try {
            SharedPreferences sharedPreferencesMarial = marial(context, str);
            if (sharedPreferencesMarial != null) {
                return (T) sharedPreferencesMarial.getString(str, null);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    public static SharedPreferences.Editor wireman(Context context, String str) {
        String strDern;
        SharedPreferences sharedPreferencesMarial;
        if (context == null || (strDern = dern(str)) == null) {
            return null;
        }
        Map<String, SharedPreferences.Editor> map = f25242saneness;
        SharedPreferences.Editor editor = map.get(strDern);
        if (editor != null || (sharedPreferencesMarial = marial(context, str)) == null) {
            return editor;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesMarial.edit();
        map.put(strDern, editorEdit);
        return editorEdit;
    }
}
