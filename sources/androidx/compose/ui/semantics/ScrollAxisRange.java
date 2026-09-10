package androidx.compose.ui.semantics;

import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.taiyuan, reason: from toString */
/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/semantics/taiyuan;", "", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function0;", "", "value", "Lkotlin/jvm/functions/Function0;", "dern", "()Lkotlin/jvm/functions/Function0;", "attabal", "maxValue", "", "saneness", "Z", "()Z", "reverseScrolling", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScrollAxisRange {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function0<Float> maxValue;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean reverseScrolling;
    private final Function0<Float> value;

    public final Function0<Float> attabal() {
        return this.maxValue;
    }

    public final Function0<Float> dern() {
        return this.value;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + this.value.invoke().floatValue() + ", maxValue=" + this.maxValue.invoke().floatValue() + ", reverseScrolling=" + this.reverseScrolling + ')';
    }
}
