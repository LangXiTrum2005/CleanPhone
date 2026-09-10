package saneness;

import com.google.common.io.BaseEncoding;

/* JADX INFO: loaded from: classes.dex */
public abstract class fatness {
    public static BaseEncoding attabal(boolean z) {
        return z ? BaseEncoding.dern().triweekly() : BaseEncoding.saneness();
    }

    public static byte[] saneness(String str, boolean z) {
        byte[] bArrWireman = attabal(z).wireman(str);
        if (bArrWireman.length != 0 || str.length() <= 0) {
            return bArrWireman;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
