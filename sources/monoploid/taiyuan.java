package monoploid;

import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;

/* JADX INFO: compiled from: TrustedWebActivityCallbackRemote.java */
/* JADX INFO: loaded from: classes.dex */
public class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ITrustedWebActivityCallback f33574attabal;

    public taiyuan(ITrustedWebActivityCallback iTrustedWebActivityCallback) {
        this.f33574attabal = iTrustedWebActivityCallback;
    }

    public static taiyuan attabal(IBinder iBinder) {
        ITrustedWebActivityCallback iTrustedWebActivityCallbackAsInterface = iBinder == null ? null : ITrustedWebActivityCallback.Stub.asInterface(iBinder);
        if (iTrustedWebActivityCallbackAsInterface == null) {
            return null;
        }
        return new taiyuan(iTrustedWebActivityCallbackAsInterface);
    }
}
