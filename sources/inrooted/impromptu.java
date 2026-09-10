package inrooted;

import android.os.Bundle;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SavedStateRegistryController.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\tj\u0002`\nH\u0007¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Linrooted/impromptu;", "", "Lwittig/saneness;", "impl", "<init>", "(Lwittig/saneness;)V", "", "dern", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "wireman", "(Landroid/os/Bundle;)V", "outBundle", "marial", "attabal", "Lwittig/saneness;", "Linrooted/beachfront;", "saneness", "Linrooted/beachfront;", "()Linrooted/beachfront;", "savedStateRegistry", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class impromptu {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final wittig.saneness impl;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final beachfront savedStateRegistry;

    /* JADX INFO: renamed from: inrooted.impromptu$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SavedStateRegistryController.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Linrooted/impromptu$attabal;", "", "<init>", "()V", "Linrooted/taiyuan;", "owner", "Linrooted/impromptu;", "saneness", "(Linrooted/taiyuan;)Linrooted/impromptu;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Unit dern(taiyuan taiyuanVar) {
            taiyuanVar.getLifecycle().attabal(new saneness(taiyuanVar));
            return Unit.f29295attabal;
        }

        public final impromptu saneness(final taiyuan owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new impromptu(new wittig.saneness(owner, new Function0() { // from class: inrooted.competently
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return impromptu.Companion.dern(owner);
                }
            }), null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ impromptu(wittig.saneness sanenessVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(sanenessVar);
    }

    public static final impromptu attabal(taiyuan taiyuanVar) {
        return INSTANCE.saneness(taiyuanVar);
    }

    public final void dern() {
        this.impl.beachfront();
    }

    public final void marial(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.impl.taiyuan(outBundle);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final beachfront getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    public final void wireman(Bundle savedState) {
        this.impl.impromptu(savedState);
    }

    public impromptu(wittig.saneness sanenessVar) {
        this.impl = sanenessVar;
        this.savedStateRegistry = new beachfront(sanenessVar);
    }
}
