package androidx.compose.ui.text.input;

import android.view.KeyEvent;
import androidx.core.app.NotificationCompat;
import java.util.List;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: InputEventCallback2.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/monoploid;", "", "", "Landroidx/compose/ui/text/input/impassible;", "editCommands", "", "marial", "(Ljava/util/List;)V", "Landroidx/compose/ui/text/input/kowloon;", "imeAction", "wireman", "(I)V", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "attabal", "(Landroid/view/KeyEvent;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "dern", "(ZZZZZZ)V", "Landroidx/compose/ui/text/input/preprohormone;", "inputConnection", "saneness", "(Landroidx/compose/ui/text/input/preprohormone;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@patroclinal.wireman
public interface monoploid {
    void attabal(KeyEvent event);

    void dern(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds);

    void marial(List<? extends impassible> editCommands);

    void saneness(preprohormone inputConnection);

    void wireman(int imeAction);
}
