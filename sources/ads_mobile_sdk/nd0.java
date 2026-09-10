package ads_mobile_sdk;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.view.View;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nd0 {
    public final PowerManager a;
    public final KeyguardManager b;

    public nd0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = (PowerManager) context.getSystemService(PowerManager.class);
        this.b = (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public final boolean a(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.a.isInteractive() && view.getVisibility() == 0 && view.isShown() && view.getLocalVisibleRect(new Rect()) && view.getGlobalVisibleRect(new Rect())) {
            return z || !this.b.isKeyguardLocked();
        }
        return false;
    }
}
