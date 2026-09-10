package androidx.lifecycle.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableCreationExtras extends CreationExtras {
    public MutableCreationExtras() {
        this(CreationExtras.Empty.f5295b);
    }

    public MutableCreationExtras(CreationExtras initialExtras) {
        Intrinsics.f(initialExtras, "initialExtras");
        this.f5294a.putAll(initialExtras.f5294a);
    }
}
