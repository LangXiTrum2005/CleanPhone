package polder;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import restrictive.coffeecake;

/* JADX INFO: compiled from: ChildLayerDependenciesTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lpolder/attabal;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "", "taiyuan", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)Z", "attabal", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "dependency", "saneness", "oldDependency", "Landroidx/collection/saran;", "dern", "Landroidx/collection/saran;", "dependenciesSet", "wireman", "oldDependenciesSet", "marial", "Z", "trackingInProgress", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public GraphicsLayer dependency;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.saran<GraphicsLayer> dependenciesSet;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public boolean trackingInProgress;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public GraphicsLayer oldDependency;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.saran<GraphicsLayer> oldDependenciesSet;

    public final boolean taiyuan(GraphicsLayer graphicsLayer) {
        if (!this.trackingInProgress) {
            coffeecake.attabal("Only add dependencies during a tracking");
        }
        androidx.collection.saran<GraphicsLayer> saranVar = this.dependenciesSet;
        if (saranVar != null) {
            Intrinsics.beachfront(saranVar);
            saranVar.impromptu(graphicsLayer);
        } else if (this.dependency != null) {
            androidx.collection.saran<GraphicsLayer> saranVarAttabal = androidx.collection.mathsort.attabal();
            GraphicsLayer graphicsLayer2 = this.dependency;
            Intrinsics.beachfront(graphicsLayer2);
            saranVarAttabal.impromptu(graphicsLayer2);
            saranVarAttabal.impromptu(graphicsLayer);
            this.dependenciesSet = saranVarAttabal;
            this.dependency = null;
        } else {
            this.dependency = graphicsLayer;
        }
        androidx.collection.saran<GraphicsLayer> saranVar2 = this.oldDependenciesSet;
        if (saranVar2 != null) {
            Intrinsics.beachfront(saranVar2);
            return !saranVar2.preprohormone(graphicsLayer);
        }
        if (this.oldDependency != graphicsLayer) {
            return true;
        }
        this.oldDependency = null;
        return false;
    }
}
