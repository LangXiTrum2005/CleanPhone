package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEventPass;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PointerInputModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/dent;", "Landroidx/compose/ui/node/marial;", "Lstarveling/impassible;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lmilliradian/monoploid;", "bounds", "", "dovishness", "(Lstarveling/impassible;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "kattegat", "()V", "", "kowloon", "()Z", "merc", "restrictive", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface dent extends marial {
    void dovishness(starveling.impassible pointerEvent, PointerEventPass pass, long bounds);

    void kattegat();

    default boolean kowloon() {
        return false;
    }

    default boolean merc() {
        return false;
    }

    default void restrictive() {
        kattegat();
    }
}
