package androidx.compose.ui;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Landroidx/compose/ui/CombinedModifier;", "Landroidx/compose/ui/attabal;", "outer", "inner", "<init>", "(Landroidx/compose/ui/attabal;Landroidx/compose/ui/attabal;)V", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/attabal$saneness;", "operation", "wireman", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "marial", "(Lkotlin/jvm/functions/Function1;)Z", "", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "saneness", "Landroidx/compose/ui/attabal;", "molybdenite", "()Landroidx/compose/ui/attabal;", "dern", "polloi", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CombinedModifier implements attabal {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final attabal inner;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final attabal outer;

    public CombinedModifier(attabal attabalVar, attabal attabalVar2) {
        this.outer = attabalVar;
        this.inner = attabalVar2;
    }

    public boolean equals(Object other) {
        if (!(other instanceof CombinedModifier)) {
            return false;
        }
        CombinedModifier combinedModifier = (CombinedModifier) other;
        return Intrinsics.wireman(this.outer, combinedModifier.outer) && Intrinsics.wireman(this.inner, combinedModifier.inner);
    }

    public int hashCode() {
        return this.outer.hashCode() + (this.inner.hashCode() * 31);
    }

    @Override // androidx.compose.ui.attabal
    public boolean marial(Function1<? super attabal.saneness, Boolean> predicate) {
        return this.outer.marial(predicate) && this.inner.marial(predicate);
    }

    /* JADX INFO: renamed from: molybdenite, reason: from getter */
    public final attabal getOuter() {
        return this.outer;
    }

    /* JADX INFO: renamed from: polloi, reason: from getter */
    public final attabal getInner() {
        return this.inner;
    }

    public String toString() {
        return '[' + ((String) wireman("", new Function2<String, attabal.saneness, String>() { // from class: androidx.compose.ui.CombinedModifier.toString.1
            @Override // p002kotlin.jvm.functions.Function2
            public final String invoke(String str, attabal.saneness sanenessVar) {
                if (str.length() == 0) {
                    return sanenessVar.toString();
                }
                return str + ", " + sanenessVar;
            }
        })) + ']';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.attabal
    public <R> R wireman(R initial, Function2<? super R, ? super attabal.saneness, ? extends R> operation) {
        return (R) this.inner.wireman(this.outer.wireman(initial, operation), operation);
    }
}
