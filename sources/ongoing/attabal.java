package ongoing;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: ActivityUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {
    public static boolean attabal(Context context, Intent intent) {
        try {
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
