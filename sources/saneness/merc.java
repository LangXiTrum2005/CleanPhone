package saneness;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes.dex */
public abstract class merc extends BaseGmsClient {
    public merc(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(context, looper, 116, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }
}
