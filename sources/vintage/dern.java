package vintage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NumberExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "attabal", "(J)Ljava/lang/String;", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class dern {
    public static final String attabal(long j) {
        String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date(j));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
