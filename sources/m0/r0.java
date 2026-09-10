package m0;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static g b(View view, g gVar) {
        ContentInfo contentInfoB = gVar.f45699a.b();
        Objects.requireNonNull(contentInfoB);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoB);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoB ? gVar : new g(new c(contentInfoPerformReceiveContent));
    }
}
