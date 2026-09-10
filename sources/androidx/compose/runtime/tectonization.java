package androidx.compose.runtime;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/tectonization;", "", "Landroidx/compose/runtime/basify;", "wrapped", "Landroidx/compose/runtime/saneness;", "after", "<init>", "(Landroidx/compose/runtime/basify;Landroidx/compose/runtime/saneness;)V", "attabal", "Landroidx/compose/runtime/basify;", "saneness", "()Landroidx/compose/runtime/basify;", "setWrapped", "(Landroidx/compose/runtime/basify;)V", "Landroidx/compose/runtime/saneness;", "()Landroidx/compose/runtime/saneness;", "setAfter", "(Landroidx/compose/runtime/saneness;)V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class tectonization {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public basify wrapped;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public saneness after;

    public tectonization(basify basifyVar, saneness sanenessVar) {
        this.wrapped = basifyVar;
        this.after = sanenessVar;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final saneness getAfter() {
        return this.after;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final basify getWrapped() {
        return this.wrapped;
    }
}
