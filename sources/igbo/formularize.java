package igbo;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: compiled from: LocaleManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class formularize {

    /* JADX INFO: compiled from: LocaleManagerCompat.java */
    public static class attabal {
        public static LocaleList attabal(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }

    public static claque.taiyuan attabal(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return claque.taiyuan.saneness(marial.saneness(context));
        }
        Object objSaneness = saneness(context);
        return objSaneness != null ? claque.taiyuan.taiyuan(attabal.attabal(objSaneness)) : claque.taiyuan.wireman();
    }

    public static Object saneness(Context context) {
        return context.getSystemService("locale");
    }
}
