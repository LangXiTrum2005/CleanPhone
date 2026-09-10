package claque;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: compiled from: UserManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class triweekly {

    /* JADX INFO: compiled from: UserManagerCompat.java */
    public static class attabal {
        public static boolean attabal(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean attabal(Context context) {
        return attabal.attabal(context);
    }
}
