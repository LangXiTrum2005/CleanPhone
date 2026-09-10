package saneness;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class midian {
    public static boolean attabal(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return p002kotlin.text.dovishness.stratoscope("gmsg", uri.getScheme(), true) && p002kotlin.text.dovishness.stratoscope("mobileads.google.com", uri.getHost(), true);
    }

    public static boolean saneness(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return p002kotlin.text.dovishness.stratoscope(uri.getScheme(), "http", true) || p002kotlin.text.dovishness.stratoscope(uri.getScheme(), HttpRequest.DEFAULT_SCHEME, true);
    }
}
