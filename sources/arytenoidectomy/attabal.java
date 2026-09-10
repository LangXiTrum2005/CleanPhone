package arytenoidectomy;

import android.os.Bundle;

/* JADX INFO: compiled from: Api33Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {
    public static <T> T attabal(Bundle bundle, String str, Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }
}
