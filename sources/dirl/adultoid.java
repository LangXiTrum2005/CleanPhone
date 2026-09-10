package dirl;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class adultoid extends kowloon implements dovishness {
    public static dovishness apical(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof dovishness ? (dovishness) iInterfaceQueryLocalInterface : new graveside(iBinder);
    }
}
