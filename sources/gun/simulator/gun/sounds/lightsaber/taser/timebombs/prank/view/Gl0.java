package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.util.AndroidRuntimeException;
import android.webkit.WebSettings;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes4.dex */
public final class Gl0 {
    public static final Fl0 Companion = new Fl0(null);
    private static final String TAG = Gl0.class.getSimpleName();
    private final Context context;

    public Gl0(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        this.context = context;
    }

    public final void getUserAgent(Consumer<String> consumer) {
        AbstractC2995aW.q(consumer, "consumer");
        try {
            consumer.accept(WebSettings.getDefaultUserAgent(this.context));
        } catch (Exception e) {
            if (e instanceof AndroidRuntimeException) {
                C4829vJ c4829vJ = C4917wJ.Companion;
                String str = TAG;
                AbstractC2995aW.p(str, "TAG");
                c4829vJ.e(str, "WebView could be missing here");
            }
            consumer.accept(null);
        }
    }
}
