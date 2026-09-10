package walach;

import androidx.core.app.NotificationCompat;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: RotaryInputModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lwalach/saneness;", "Lwalach/attabal;", "Landroidx/compose/ui/attabal$dern;", "Lkotlin/Function1;", "Lwalach/dern;", "", "onEvent", "onPreEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", NotificationCompat.CATEGORY_EVENT, "rotuma", "(Lwalach/dern;)Z", "adultoid", "stratoscope", "Lkotlin/jvm/functions/Function1;", "getOnEvent", "()Lkotlin/jvm/functions/Function1;", "underbelly", "(Lkotlin/jvm/functions/Function1;)V", "trm", "getOnPreEvent", "preterite", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness extends androidx.compose.ui.attabal.dern implements attabal {

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public Function1<? super RotaryScrollEvent, Boolean> onEvent;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public Function1<? super RotaryScrollEvent, Boolean> onPreEvent;

    public saneness(Function1<? super RotaryScrollEvent, Boolean> function1, Function1<? super RotaryScrollEvent, Boolean> function2) {
        this.onEvent = function1;
        this.onPreEvent = function2;
    }

    @Override // walach.attabal
    public boolean adultoid(RotaryScrollEvent event) {
        Function1<? super RotaryScrollEvent, Boolean> function1 = this.onPreEvent;
        if (function1 != null) {
            return function1.invoke(event).booleanValue();
        }
        return false;
    }

    public final void preterite(Function1<? super RotaryScrollEvent, Boolean> function1) {
        this.onPreEvent = function1;
    }

    @Override // walach.attabal
    public boolean rotuma(RotaryScrollEvent event) {
        Function1<? super RotaryScrollEvent, Boolean> function1 = this.onEvent;
        if (function1 != null) {
            return function1.invoke(event).booleanValue();
        }
        return false;
    }

    public final void underbelly(Function1<? super RotaryScrollEvent, Boolean> function1) {
        this.onEvent = function1;
    }
}
