package androidx.compose.ui.platform;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: WeakCache.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0004R \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/attendance;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "<init>", "()V", "element", "", "dern", "(Ljava/lang/Object;)V", "saneness", "()Ljava/lang/Object;", "attabal", "Landroidx/compose/runtime/collection/dern;", "Ljava/lang/ref/Reference;", "Landroidx/compose/runtime/collection/dern;", "values", "Ljava/lang/ref/ReferenceQueue;", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attendance<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<Reference<T>> values = new androidx.compose.runtime.collection.dern<>(new Reference[16], 0);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();

    public final void attabal() {
        Reference<? extends T> referencePoll;
        do {
            referencePoll = this.referenceQueue.poll();
            if (referencePoll != null) {
                this.values.monoploid(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final void dern(T element) {
        attabal();
        this.values.saneness(new WeakReference(element, this.referenceQueue));
    }

    public final T saneness() {
        attabal();
        while (this.values.kowloon()) {
            androidx.compose.runtime.collection.dern<Reference<T>> dernVar = this.values;
            T t = dernVar.molybdenite(dernVar.getSize() - 1).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }
}
