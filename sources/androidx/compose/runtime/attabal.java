package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Applier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0007H$¢\u0006\u0004\b\f\u0010\nR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R*\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00008\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0005¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/wireman;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "", "beachfront", "impromptu", "()V", "clear", "apical", "attabal", "Ljava/lang/Object;", "cutely", "()Ljava/lang/Object;", "Landroidx/compose/runtime/rajahship;", "saneness", "Ljava/util/ArrayList;", "stack", "value", "dern", "taiyuan", "formularize", "current", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class attabal<T> implements wireman<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final T root;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public T current;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final ArrayList<T> stack = rajahship.dern(null, 1, null);

    public attabal(T t) {
        this.root = t;
        this.current = t;
    }

    public abstract void apical();

    @Override // androidx.compose.runtime.wireman
    public void beachfront(T node) {
        rajahship.cutely(this.stack, taiyuan());
        formularize(node);
    }

    @Override // androidx.compose.runtime.wireman
    public final void clear() {
        rajahship.attabal(this.stack);
        formularize(this.root);
        apical();
    }

    public final T cutely() {
        return this.root;
    }

    public void formularize(T t) {
        this.current = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.wireman
    public void impromptu() {
        formularize(rajahship.taiyuan(this.stack));
    }

    public T taiyuan() {
        return this.current;
    }
}
