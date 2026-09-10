package saneness;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class revolt extends motel implements byname {
    public static byname cutely(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.prewarm.protocol.IPrewarmService");
        return iInterfaceQueryLocalInterface instanceof byname ? (byname) iInterfaceQueryLocalInterface : new provostship(iBinder);
    }
}
