package cuirassed;

import androidx.compose.runtime.basify;
import androidx.compose.runtime.tectonization;
import java.util.Set;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: RememberEventDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcuirassed/competently;", "Landroidx/compose/runtime/basify;", "", "wireman", "()V", "beachfront", "marial", "", "kowloon", "Ljava/util/Set;", "abandoning", "Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/runtime/tectonization;", "arytenoidectomy", "Landroidx/compose/runtime/collection/dern;", "attabal", "()Landroidx/compose/runtime/collection/dern;", "pausedRemembers", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class competently implements basify {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<tectonization> pausedRemembers;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Set<basify> abandoning;

    public final androidx.compose.runtime.collection.dern<tectonization> attabal() {
        return this.pausedRemembers;
    }

    @Override // androidx.compose.runtime.basify
    public void wireman() {
        androidx.compose.runtime.collection.dern<tectonization> dernVar = this.pausedRemembers;
        tectonization[] tectonizationVarArr = dernVar.content;
        int size = dernVar.getSize();
        for (int i = 0; i < size; i++) {
            basify wrapped = tectonizationVarArr[i].getWrapped();
            this.abandoning.remove(wrapped);
            wrapped.wireman();
        }
    }

    @Override // androidx.compose.runtime.basify
    public void beachfront() {
    }

    @Override // androidx.compose.runtime.basify
    public void marial() {
    }
}
