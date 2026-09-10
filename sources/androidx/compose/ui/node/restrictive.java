package androidx.compose.ui.node;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: MutableVectorWithMutationTracking.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/node/restrictive;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/collection/dern;", "vector", "Lkotlin/Function0;", "", "onVectorMutated", "<init>", "(Landroidx/compose/runtime/collection/dern;Lkotlin/jvm/functions/Function0;)V", "saneness", "()V", "", "index", "element", "attabal", "(ILjava/lang/Object;)V", "beachfront", "(I)Ljava/lang/Object;", "dern", "Landroidx/compose/runtime/collection/dern;", "marial", "()Landroidx/compose/runtime/collection/dern;", "Lkotlin/jvm/functions/Function0;", "getOnVectorMutated", "()Lkotlin/jvm/functions/Function0;", "wireman", "()I", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class restrictive<T> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f7031dern = androidx.compose.runtime.collection.dern.f5875polloi;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<T> vector;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Function0<Unit> onVectorMutated;

    public restrictive(androidx.compose.runtime.collection.dern<T> dernVar, Function0<Unit> function0) {
        this.vector = dernVar;
        this.onVectorMutated = function0;
    }

    public final void attabal(int index, T element) {
        this.vector.attabal(index, element);
        this.onVectorMutated.invoke();
    }

    public final T beachfront(int index) {
        T tMolybdenite = this.vector.molybdenite(index);
        this.onVectorMutated.invoke();
        return tMolybdenite;
    }

    public final T dern(int index) {
        return this.vector.apical()[index];
    }

    public final androidx.compose.runtime.collection.dern<T> marial() {
        return this.vector;
    }

    public final void saneness() {
        this.vector.impromptu();
        this.onVectorMutated.invoke();
    }

    public final int wireman() {
        return this.vector.getSize();
    }
}
