package zc;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.nf;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference f54891c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nf f54892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f54893b;

    public x(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f54893b = scheduledThreadPoolExecutor;
    }

    public final synchronized w a() {
        String str;
        w wVar;
        nf nfVar = this.f54892a;
        synchronized (((ArrayDeque) nfVar.f23785e)) {
            str = (String) ((ArrayDeque) nfVar.f23785e).peek();
        }
        Pattern pattern = w.f54887d;
        wVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                wVar = new w(strArrSplit[0], strArrSplit[1]);
            }
        }
        return wVar;
    }
}
