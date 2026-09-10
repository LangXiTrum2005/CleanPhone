package vintage;

import android.content.Context;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContextExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "", "permission", "", "attabal", "(Landroid/content/Context;Ljava/lang/String;)Z", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class attabal {
    public static final boolean attabal(Context context, String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return context != null && picketboat.saneness.checkSelfPermission(context, permission) == 0;
    }
}
