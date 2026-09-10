package ads_mobile_sdk;

import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: loaded from: classes.dex */
public abstract class jp0 {
    public static final Set a = creditor.impromptu(".mp4", ".webm", ".mkv", ".3gp", ".m4v", ".ts", ".flv", ".ogv", ".avi", ".mov", ".qt", ".wmv", ".mp3", ".aac", ".wav", ".flac", ".ogg", ".m4a", ".mid", ".xmf", ".mxmf", ".rtttl", ".rtx", ".ota", ".imy");

    public static final boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String path = uri.getPath();
        if (path == null) {
            return false;
        }
        Set set = a;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (dovishness.cord(path, (String) it.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }
}
