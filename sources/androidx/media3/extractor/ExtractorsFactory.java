package androidx.media3.extractor;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface ExtractorsFactory {
    default Extractor[] b(Uri uri, Map map) {
        return createExtractors();
    }

    Extractor[] createExtractors();
}
