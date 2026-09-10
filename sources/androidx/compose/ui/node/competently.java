package androidx.compose.ui.node;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: DelegatingNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u0003R \u0010\u0014\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/node/competently;", "Landroidx/compose/ui/attabal$dern;", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "", "sensatory", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "dent", "treadless", "itchy", "permissivist", "milliradian", "", "stratoscope", "I", "preterite", "()I", "getSelfKindSet$ui_release$annotations", "selfKindSet", "trm", "Landroidx/compose/ui/attabal$dern;", "underbelly", "()Landroidx/compose/ui/attabal$dern;", "setDelegate$ui_release", "(Landroidx/compose/ui/attabal$dern;)V", "delegate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class competently extends androidx.compose.ui.attabal.dern {

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final int selfKindSet = privatdozent.competently(this);

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.attabal.dern delegate;

    @Override // androidx.compose.ui.attabal.dern
    public void dent() {
        super.dent();
        for (androidx.compose.ui.attabal.dern delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.sensatory(getCoordinator());
            if (!delegate.getIsAttached()) {
                delegate.dent();
            }
        }
    }

    @Override // androidx.compose.ui.attabal.dern
    public void itchy() {
        super.itchy();
        for (androidx.compose.ui.attabal.dern delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.itchy();
        }
    }

    @Override // androidx.compose.ui.attabal.dern
    public void milliradian() {
        super.milliradian();
        for (androidx.compose.ui.attabal.dern delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.milliradian();
        }
    }

    @Override // androidx.compose.ui.attabal.dern
    public void permissivist() {
        for (androidx.compose.ui.attabal.dern delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.permissivist();
        }
        super.permissivist();
    }

    /* JADX INFO: renamed from: preterite, reason: from getter */
    public final int getSelfKindSet() {
        return this.selfKindSet;
    }

    @Override // androidx.compose.ui.attabal.dern
    public void sensatory(NodeCoordinator coordinator) {
        super.sensatory(coordinator);
        for (androidx.compose.ui.attabal.dern delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.sensatory(coordinator);
        }
    }

    @Override // androidx.compose.ui.attabal.dern
    public void treadless() {
        for (androidx.compose.ui.attabal.dern delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.treadless();
        }
        super.treadless();
    }

    /* JADX INFO: renamed from: underbelly, reason: from getter */
    public final androidx.compose.ui.attabal.dern getDelegate() {
        return this.delegate;
    }
}
