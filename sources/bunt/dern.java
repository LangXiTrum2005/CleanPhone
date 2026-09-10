package bunt;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: YoloHttpUtilConstants.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lbunt/dern;", "", "<init>", "()V", "", PglCryptUtils.KEY_MESSAGE, "", "saneness", "(Ljava/lang/String;)Z", "attabal", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f15186attabal = new dern();

    public final boolean attabal(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new Regex("--> END (GET|POST|HEAD|DELETE|PUT|PATCH|MOVE|REPORT|PROPPATCH)").containsMatchIn(message) || StringsKt.overspeculate(message, "<-- END HTTP", false, 2, null);
    }

    public final boolean saneness(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new Regex("--> (GET|POST|HEAD|DELETE|PUT|PATCH|MOVE|REPORT|PROPPATCH)").containsMatchIn(message) || new Regex("<-- [0-9]+").containsMatchIn(message);
    }
}
