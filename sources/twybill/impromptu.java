package twybill;

import android.net.Uri;

/* JADX INFO: compiled from: ContentMetadata.java */
/* JADX INFO: loaded from: classes.dex */
public interface impromptu {
    static Uri attabal(impromptu impromptuVar) {
        String str = impromptuVar.get("exo_redir", (String) null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    static long saneness(impromptu impromptuVar) {
        return impromptuVar.get("exo_len", -1L);
    }

    long get(String str, long j);

    String get(String str, String str2);
}
