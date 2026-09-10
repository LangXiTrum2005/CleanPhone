package privatdozent;

import android.view.KeyEvent;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KeyEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0015"}, d2 = {"Lprivatdozent/saneness;", "", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "nativeKeyEvent", "saneness", "(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;", "", "marial", "(Landroid/view/KeyEvent;)Ljava/lang/String;", "", "wireman", "(Landroid/view/KeyEvent;)I", C3414a2.d, "", "dern", "(Landroid/view/KeyEvent;Ljava/lang/Object;)Z", "attabal", "Landroid/view/KeyEvent;", "getNativeKeyEvent", "()Landroid/view/KeyEvent;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final KeyEvent nativeKeyEvent;

    public /* synthetic */ saneness(KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }

    public static final /* synthetic */ saneness attabal(KeyEvent keyEvent) {
        return new saneness(keyEvent);
    }

    public static boolean dern(KeyEvent keyEvent, Object obj) {
        return (obj instanceof saneness) && Intrinsics.wireman(keyEvent, ((saneness) obj).getNativeKeyEvent());
    }

    public static String marial(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public static int wireman(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final /* synthetic */ KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    public boolean equals(Object obj) {
        return dern(this.nativeKeyEvent, obj);
    }

    public int hashCode() {
        return wireman(this.nativeKeyEvent);
    }

    public String toString() {
        return marial(this.nativeKeyEvent);
    }

    public static KeyEvent saneness(KeyEvent keyEvent) {
        return keyEvent;
    }
}
