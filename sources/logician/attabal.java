package logician;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.lr.ri.sf;
import com.ironsource.Ua;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static Context f33115attabal = null;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static sf f33116dern = null;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static boolean f33117marial = false;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static String f33118saneness = null;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static int f33119wireman = 1;

    public static int attabal() {
        return f33119wireman;
    }

    public static void beachfront(int i) {
        f33119wireman = i;
    }

    public static void competently(Context context, String str) {
        f33115attabal = context;
        f33118saneness = str;
    }

    public static boolean dern() {
        return f33117marial;
    }

    public static void impromptu(sf sfVar) {
        f33116dern = sfVar;
    }

    public static Context marial() {
        return f33115attabal;
    }

    public static sf saneness() {
        if (f33116dern == null) {
            sf.ri riVar = new sf.ri("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            f33116dern = riVar.ri(Ua.s, timeUnit).lr(Ua.s, timeUnit).ik(Ua.s, timeUnit).ri();
        }
        return f33116dern;
    }

    public static String wireman() {
        if (TextUtils.isEmpty(f33118saneness)) {
            try {
                File file = new File(marial().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                f33118saneness = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return f33118saneness;
    }
}
