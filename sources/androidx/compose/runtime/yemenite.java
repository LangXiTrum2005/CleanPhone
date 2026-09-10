package androidx.compose.runtime;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/yemenite;", "", "Loilcan/formularize;", "observer", "", "root", "Landroidx/compose/runtime/graveside;", "parent", "<init>", "(Loilcan/formularize;ZLandroidx/compose/runtime/graveside;)V", "attabal", "()Loilcan/formularize;", "Z", "getRoot", "()Z", "setRoot", "(Z)V", "saneness", "Landroidx/compose/runtime/graveside;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class yemenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public boolean root;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final graveside parent;

    public yemenite(oilcan.formularize formularizeVar, boolean z, graveside gravesideVar) {
        this.root = z;
        this.parent = gravesideVar;
    }

    public final oilcan.formularize attabal() {
        if (this.root) {
            return null;
        }
        this.parent.apical();
        Intrinsics.wireman(null, null);
        return null;
    }

    public /* synthetic */ yemenite(oilcan.formularize formularizeVar, boolean z, graveside gravesideVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : formularizeVar, (i & 2) != 0 ? false : z, gravesideVar);
    }
}
