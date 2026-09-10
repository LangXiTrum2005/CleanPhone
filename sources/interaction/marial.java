package interaction;

import java.io.File;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: FilePathComponents.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"", "", "attabal", "(Ljava/lang/String;)I", "Ljava/io/File;", "", "saneness", "(Ljava/io/File;)Z", "isRooted", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/io/FilesKt")
public class marial {
    public static final int attabal(String str) {
        int iNosophobia;
        char c = File.separatorChar;
        int iNosophobia2 = StringsKt.nosophobia(str, c, 0, false, 4, null);
        if (iNosophobia2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (iNosophobia = StringsKt.nosophobia(str, c, 2, false, 4, null)) < 0) {
                return 1;
            }
            int iNosophobia3 = StringsKt.nosophobia(str, c, iNosophobia + 1, false, 4, null);
            return iNosophobia3 >= 0 ? iNosophobia3 + 1 : str.length();
        }
        if (iNosophobia2 > 0 && str.charAt(iNosophobia2 - 1) == ':') {
            return iNosophobia2 + 1;
        }
        if (iNosophobia2 == -1 && StringsKt.permissivist(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final boolean saneness(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return attabal(path) > 0;
    }
}
