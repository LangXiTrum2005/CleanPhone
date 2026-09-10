package saneness;

import android.widget.LinearLayout;
import androidx.p000activity.ComponentActivity;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class aesthesia implements sunback {
    @Override // saneness.sunback
    public final void a(ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LinearLayout linearLayout = new LinearLayout(activity);
        activity.setContentView(linearLayout);
        a(activity, linearLayout);
    }

    public abstract void a(ComponentActivity componentActivity, LinearLayout linearLayout);
}
