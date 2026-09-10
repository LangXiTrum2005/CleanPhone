package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.adjust.sdk.h0;
import ea.a0;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import m4.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // m4.b
    public final Object create(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: f4.e
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new h0(applicationContext, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new a0(14);
    }

    @Override // m4.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
