package A;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class I {
    public static /* synthetic */ MediaSession d(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }

    public static /* synthetic */ WindowInsets.Builder g() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder h(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }
}
