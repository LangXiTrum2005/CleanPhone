package androidx.compose.ui.input.key;

import androidx.compose.ui.node.kattegat;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import privatdozent.beachfront;
import privatdozent.saneness;

/* JADX INFO: compiled from: KeyInputModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Landroidx/compose/ui/node/kattegat;", "Lprivatdozent/beachfront;", "Lkotlin/Function1;", "Lprivatdozent/saneness;", "", "onKeyEvent", "onPreKeyEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "graveside", "()Lprivatdozent/beachfront;", "node", "", "adultoid", "(Lprivatdozent/beachfront;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "saneness", "Lkotlin/jvm/functions/Function1;", "getOnKeyEvent", "()Lkotlin/jvm/functions/Function1;", "dern", "getOnPreKeyEvent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class KeyInputElement extends kattegat<beachfront> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    public final Function1<saneness, Boolean> onPreKeyEvent;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final Function1<saneness, Boolean> onKeyEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(Function1<? super saneness, Boolean> function1, Function1<? super saneness, Boolean> function2) {
        this.onKeyEvent = function1;
        this.onPreKeyEvent = function2;
    }

    @Override // androidx.compose.ui.node.kattegat
    /* JADX INFO: renamed from: adultoid, reason: merged with bridge method [inline-methods] */
    public void molybdenite(beachfront node) {
        node.underbelly(this.onKeyEvent);
        node.preterite(this.onPreKeyEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) other;
        return Intrinsics.wireman(this.onKeyEvent, keyInputElement.onKeyEvent) && Intrinsics.wireman(this.onPreKeyEvent, keyInputElement.onPreKeyEvent);
    }

    @Override // androidx.compose.ui.node.kattegat
    /* JADX INFO: renamed from: graveside, reason: merged with bridge method [inline-methods] */
    public beachfront polloi() {
        return new beachfront(this.onKeyEvent, this.onPreKeyEvent);
    }

    public int hashCode() {
        Function1<saneness, Boolean> function1 = this.onKeyEvent;
        int iHashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1<saneness, Boolean> function2 = this.onPreKeyEvent;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }

    public String toString() {
        return "KeyInputElement(onKeyEvent=" + this.onKeyEvent + ", onPreKeyEvent=" + this.onPreKeyEvent + ')';
    }
}
