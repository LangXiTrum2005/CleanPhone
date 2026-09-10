package starveling;

import androidx.compose.ui.node.LayoutNode;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Lstarveling/preprohormone;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Lstarveling/gintrap;", "pointerEvent", "Lstarveling/yemenite;", "positionCalculator", "", "isInBounds", "Lstarveling/sealless;", "saneness", "(Lstarveling/gintrap;Lstarveling/yemenite;Z)I", "", "dern", "()V", "attabal", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "Lstarveling/wireman;", "Lstarveling/wireman;", "hitPathTracker", "Lstarveling/dovishness;", "Lstarveling/dovishness;", "pointerInputChangeEventProducer", "Landroidx/compose/ui/node/triweekly;", "wireman", "Landroidx/compose/ui/node/triweekly;", "hitResult", "marial", "Z", "isProcessing", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class preprohormone {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final LayoutNode root;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public boolean isProcessing;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final wireman hitPathTracker;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final dovishness pointerInputChangeEventProducer = new dovishness();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.node.triweekly hitResult = new androidx.compose.ui.node.triweekly();

    public preprohormone(LayoutNode layoutNode) {
        this.root = layoutNode;
        this.hitPathTracker = new wireman(layoutNode.marial());
    }

    public final void attabal() {
        this.hitPathTracker.saneness();
    }

    public final void dern() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.attabal();
        this.hitPathTracker.wireman();
    }

    public final int saneness(gintrap pointerEvent, yemenite positionCalculator, boolean isInBounds) {
        int i;
        boolean z;
        if (this.isProcessing) {
            return cord.attabal(false, false);
        }
        boolean z2 = true;
        try {
            this.isProcessing = true;
            marial marialVarSaneness = this.pointerInputChangeEventProducer.saneness(pointerEvent, positionCalculator);
            int iImpassible = marialVarSaneness.saneness().impassible();
            while (true) {
                if (i >= iImpassible) {
                    z = true;
                    break;
                }
                PointerInputChange pointerInputChangeTriweekly = marialVarSaneness.saneness().triweekly(i);
                i = (pointerInputChangeTriweekly.getPressed() || pointerInputChangeTriweekly.getPreviousPressed()) ? 0 : i + 1;
                z = false;
                break;
            }
            int iImpassible2 = marialVarSaneness.saneness().impassible();
            for (int i2 = 0; i2 < iImpassible2; i2++) {
                PointerInputChange pointerInputChangeTriweekly2 = marialVarSaneness.saneness().triweekly(i2);
                if (z || triweekly.attabal(pointerInputChangeTriweekly2)) {
                    LayoutNode.nosophobia(this.root, pointerInputChangeTriweekly2.getPosition(), this.hitResult, oilcan.impromptu(pointerInputChangeTriweekly2.getType(), oilcan.INSTANCE.wireman()), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.attabal(pointerInputChangeTriweekly2.getId(), this.hitResult, triweekly.attabal(pointerInputChangeTriweekly2));
                        this.hitResult.clear();
                    }
                }
            }
            this.hitPathTracker.marial();
            boolean zDern = this.hitPathTracker.dern(marialVarSaneness, isInBounds);
            if (marialVarSaneness.getSuppressMovementConsumption()) {
                z2 = false;
                break;
            }
            int iImpassible3 = marialVarSaneness.saneness().impassible();
            int i3 = 0;
            while (true) {
                if (i3 >= iImpassible3) {
                    z2 = false;
                    break;
                }
                PointerInputChange pointerInputChangeTriweekly3 = marialVarSaneness.saneness().triweekly(i3);
                if (triweekly.marial(pointerInputChangeTriweekly3) && pointerInputChangeTriweekly3.apical()) {
                    break;
                }
                i3++;
            }
            return cord.attabal(zDern, z2);
        } finally {
            this.isProcessing = false;
        }
    }
}
