package privatdozent;

import android.view.KeyEvent;
import com.ironsource.X3;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: KeyEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\f\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b*\n\u0010\u000e\"\u00020\r2\u00020\r¨\u0006\u000f"}, d2 = {"Lprivatdozent/saneness;", "Lprivatdozent/attabal;", "attabal", "(Landroid/view/KeyEvent;)J", X3.i.W, "Lprivatdozent/dern;", "saneness", "(Landroid/view/KeyEvent;)I", "type", "", "dern", "(Landroid/view/KeyEvent;)Z", "isShiftPressed", "Landroid/view/KeyEvent;", "NativeKeyEvent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class wireman {
    public static final long attabal(KeyEvent keyEvent) {
        return competently.attabal(keyEvent.getKeyCode());
    }

    public static final boolean dern(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }

    public static final int saneness(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? dern.INSTANCE.dern() : dern.INSTANCE.saneness();
        }
        return dern.INSTANCE.attabal();
    }
}
