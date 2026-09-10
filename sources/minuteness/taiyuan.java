package minuteness;

import android.text.TextUtils;
import androidx.p000activity.ComponentActivity;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PermissionRegister.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/activity/ComponentActivity;", "Lminuteness/competently;", "", "", "attabal", "(Landroidx/activity/ComponentActivity;)Lminuteness/competently;", "tools_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class taiyuan {
    public static final competently<String, Boolean> attabal(ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        String stringExtra = componentActivity.getIntent().getStringExtra("KEY_UNIQUE_ACTIVITY");
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        return impromptu.INSTANCE.attabal().get(stringExtra);
    }
}
