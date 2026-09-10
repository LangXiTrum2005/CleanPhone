package collectively;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class marial extends saneness implements beachfront {
    public static beachfront apical(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return iInterfaceQueryLocalInterface instanceof beachfront ? (beachfront) iInterfaceQueryLocalInterface : new wireman(iBinder);
    }
}
