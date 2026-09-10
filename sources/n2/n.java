package n2;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface n {
    k[] createExtractors();

    default k[] d(Uri uri, Map map) {
        return createExtractors();
    }
}
