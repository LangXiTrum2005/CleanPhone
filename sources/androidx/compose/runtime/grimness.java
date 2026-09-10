package androidx.compose.runtime;

import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/grimness;", "Landroidx/compose/runtime/basify;", "Lkotlin/Function1;", "Landroidx/compose/runtime/privatdozent;", "Landroidx/compose/runtime/saran;", "effect", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "wireman", "()V", "beachfront", "marial", "kowloon", "Lkotlin/jvm/functions/Function1;", "arytenoidectomy", "Landroidx/compose/runtime/saran;", "onDispose", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class grimness implements basify {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public saran onDispose;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Function1<privatdozent, saran> effect;

    /* JADX WARN: Multi-variable type inference failed */
    public grimness(Function1<? super privatdozent, ? extends saran> function1) {
        this.effect = function1;
    }

    @Override // androidx.compose.runtime.basify
    public void beachfront() {
        saran saranVar = this.onDispose;
        if (saranVar != null) {
            saranVar.attabal();
        }
        this.onDispose = null;
    }

    @Override // androidx.compose.runtime.basify
    public void wireman() {
        this.onDispose = this.effect.invoke(hydrovane.f5989attabal);
    }

    @Override // androidx.compose.runtime.basify
    public void marial() {
    }
}
