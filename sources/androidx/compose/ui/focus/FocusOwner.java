package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.core.app.NotificationCompat;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import walach.RotaryScrollEvent;

/* JADX INFO: compiled from: FocusOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH&ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H&ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000bH&¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020+H&¢\u0006\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/focus/impromptu;", "Landroidx/compose/ui/focus/saneness;", "focusDirection", "Lsupplicat/taiyuan;", "previouslyFocusedRect", "", "impassible", "(Landroidx/compose/ui/focus/saneness;Lsupplicat/taiyuan;)Z", "focusedRect", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "impromptu", "(ILsupplicat/taiyuan;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "", "triweekly", "()V", "force", "refreshFocusEvents", "clearOwnerFocus", "taiyuan", "(ZZZI)Z", "formularize", "()Lsupplicat/taiyuan;", "Lprivatdozent/saneness;", "keyEvent", "Lkotlin/Function0;", "onFocusedItem", "competently", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "wireman", "(Landroid/view/KeyEvent;)Z", "Lwalach/dern;", NotificationCompat.CATEGORY_EVENT, "arytenoidectomy", "(Lwalach/dern;)Z", "node", "marial", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/wireman;", "attabal", "(Landroidx/compose/ui/focus/wireman;)V", "Landroidx/compose/ui/focus/impassible;", "apical", "(Landroidx/compose/ui/focus/impassible;)V", "Landroidx/compose/ui/attabal;", "beachfront", "()Landroidx/compose/ui/attabal;", "modifier", "Landroidx/compose/ui/focus/adultoid;", "saneness", "()Landroidx/compose/ui/focus/adultoid;", "focusTransactionManager", "Landroidx/compose/ui/focus/molybdenite;", "cutely", "()Landroidx/compose/ui/focus/molybdenite;", "rootState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface FocusOwner extends impromptu {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean dern(FocusOwner focusOwner, KeyEvent keyEvent, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i & 2) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p002kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        return focusOwner.competently(keyEvent, function0);
    }

    void apical(impassible node);

    boolean arytenoidectomy(RotaryScrollEvent event);

    void attabal(wireman node);

    androidx.compose.ui.attabal beachfront();

    boolean competently(KeyEvent keyEvent, Function0<Boolean> onFocusedItem);

    molybdenite cutely();

    supplicat.taiyuan formularize();

    boolean impassible(saneness focusDirection, supplicat.taiyuan previouslyFocusedRect);

    Boolean impromptu(int focusDirection, supplicat.taiyuan focusedRect, Function1<? super FocusTargetNode, Boolean> onFound);

    void marial(FocusTargetNode node);

    adultoid saneness();

    boolean taiyuan(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection);

    void triweekly();

    boolean wireman(KeyEvent keyEvent);
}
