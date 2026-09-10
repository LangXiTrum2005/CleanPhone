package androidx.compose.ui.node;

import com.unity3d.services.UnityAdsConstants;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: LayoutNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/peridotite;", "saneness", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/peridotite;", "Lmilliradian/wireman;", "attabal", "Lmilliradian/wireman;", "DefaultDensity", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class cuirassed {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final milliradian.wireman f7005attabal = milliradian.beachfront.saneness(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, null);

    public static final peridotite saneness(LayoutNode layoutNode) {
        peridotite owner = layoutNode.getOwner();
        if (owner != null) {
            return owner;
        }
        peridotite.attabal.dern("LayoutNode should be attached to an owner");
        throw new KotlinNothingValueException();
    }
}
