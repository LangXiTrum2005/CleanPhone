package starveling;

import android.view.MotionEvent;
import java.util.List;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PointerEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0017\u001a\u00020\u00138\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001d\u0010\u001b\u001a\u00020\u00188\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\fR0\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n8\u0006@@X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010!\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Lstarveling/impassible;", "", "", "Lstarveling/adultoid;", "changes", "Lstarveling/marial;", "internalPointerEvent", "<init>", "(Ljava/util/List;Lstarveling/marial;)V", "(Ljava/util/List;)V", "Lstarveling/kowloon;", "attabal", "()I", "Ljava/util/List;", "saneness", "()Ljava/util/List;", "Lstarveling/marial;", "getInternalPointerEvent$ui_release", "()Lstarveling/marial;", "Lstarveling/formularize;", "dern", "I", "getButtons-ry648PA", "buttons", "Lstarveling/trm;", "wireman", "getKeyboardModifiers-k7X9c1A", "keyboardModifiers", "<set-?>", "marial", "(I)V", "type", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final List<PointerInputChange> changes;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final int buttons;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public int type;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final marial internalPointerEvent;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final int keyboardModifiers;

    public impassible(List<PointerInputChange> list, marial marialVar) {
        this.changes = list;
        this.internalPointerEvent = marialVar;
        MotionEvent motionEventDern = dern();
        this.buttons = formularize.attabal(motionEventDern != null ? motionEventDern.getButtonState() : 0);
        MotionEvent motionEventDern2 = dern();
        this.keyboardModifiers = trm.saneness(motionEventDern2 != null ? motionEventDern2.getMetaState() : 0);
        this.type = attabal();
    }

    public final int attabal() {
        MotionEvent motionEventDern = dern();
        if (motionEventDern == null) {
            List<PointerInputChange> list = this.changes;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                PointerInputChange adultoidVar = list.get(i);
                if (triweekly.saneness(adultoidVar)) {
                    return kowloon.INSTANCE.marial();
                }
                if (triweekly.attabal(adultoidVar)) {
                    return kowloon.INSTANCE.wireman();
                }
            }
            return kowloon.INSTANCE.dern();
        }
        int actionMasked = motionEventDern.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return kowloon.INSTANCE.beachfront();
                        case 9:
                            return kowloon.INSTANCE.attabal();
                        case 10:
                            return kowloon.INSTANCE.saneness();
                        default:
                            return kowloon.INSTANCE.competently();
                    }
                }
                return kowloon.INSTANCE.dern();
            }
            return kowloon.INSTANCE.marial();
        }
        return kowloon.INSTANCE.wireman();
    }

    public final MotionEvent dern() {
        marial marialVar = this.internalPointerEvent;
        if (marialVar != null) {
            return marialVar.dern();
        }
        return null;
    }

    public final void marial(int i) {
        this.type = i;
    }

    public final List<PointerInputChange> saneness() {
        return this.changes;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public impassible(List<PointerInputChange> list) {
        this(list, null);
    }
}
