package dibatag;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import java.io.File;

/* JADX INFO: compiled from: FileStorage.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static micrococcus.saneness f25240attabal;

    public static boolean attabal(String str) {
        if (f25240attabal != null && !TextUtils.isEmpty(str)) {
            try {
                if (f25240attabal.marial(str)) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static void beachfront(String str, long j) {
        if (j > 2147483647L) {
            throw new IllegalArgumentException("maxSize exceeds the FileCache size limit!");
        }
        try {
            f25240attabal = micrococcus.saneness.attabal(new File(str), j, Integer.MAX_VALUE);
        } catch (Exception unused) {
        }
    }

    public static void competently(Context context, String str, int i, long j) {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                marial(micrococcus.attabal.attabal(context), str, i, j);
            }
        } catch (Exception unused) {
        }
        try {
            if (context.getCacheDir() != null) {
                marial(context.getCacheDir(), str, i / 2, j / 2);
            }
        } catch (Exception unused2) {
        }
    }

    public static String dern(String str, String str2) {
        micrococcus.saneness sanenessVar = f25240attabal;
        return sanenessVar == null ? str2 : sanenessVar.saneness(str);
    }

    public static boolean impromptu(String str, String str2) {
        if (f25240attabal != null && !TextUtils.isEmpty(str) && str2 != null) {
            try {
                if (f25240attabal.wireman(str, str2)) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static void marial(File file, String str, int i, long j) {
        StatFs statFs = new StatFs(file.getPath());
        long blockSizeLong = ((statFs.getBlockSizeLong() * statFs.getBlockCountLong()) * ((long) i)) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (blockSizeLong >= j) {
            j = blockSizeLong;
        }
        String str2 = file + File.separator + str;
        if (j > 2147483647L) {
            throw new IllegalArgumentException("maxSize exceeds the FileCache size limit!");
        }
        beachfront(str2, j);
    }

    public static String saneness(String str) {
        return dern(str, "");
    }

    public static void wireman(Context context) {
        competently(context, "persistance_cache", 2, 8388608L);
    }
}
