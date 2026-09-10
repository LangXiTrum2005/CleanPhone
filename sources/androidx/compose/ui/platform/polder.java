package androidx.compose.ui.platform;

import android.os.Looper;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "saneness", "()Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class polder {
    public static final boolean saneness() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
