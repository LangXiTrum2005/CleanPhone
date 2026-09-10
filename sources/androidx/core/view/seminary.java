package androidx.core.view;

import android.content.Context;
import android.view.PointerIcon;

/* JADX INFO: compiled from: PointerIconCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class seminary {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final PointerIcon f9416attabal;

    /* JADX INFO: compiled from: PointerIconCompat.java */
    public static class attabal {
        public static PointerIcon attabal(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }
    }

    public seminary(PointerIcon pointerIcon) {
        this.f9416attabal = pointerIcon;
    }

    public static seminary saneness(Context context, int i) {
        return new seminary(attabal.attabal(context, i));
    }

    public Object attabal() {
        return this.f9416attabal;
    }
}
