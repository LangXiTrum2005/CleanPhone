package androidx.compose.ui.node;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import restrictive.picketboat;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0019\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0016\u0010\u001b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0016\u0010\u001d\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u001c\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/node/polloi;", "", "<init>", "()V", C3414a2.d, "", "attabal", "(Landroidx/compose/ui/node/polloi;)V", "Lrestrictive/treadless;", "scope", "saneness", "(Lrestrictive/treadless;)V", "", "dern", "(Landroidx/compose/ui/node/polloi;)Z", "", "F", "scaleX", "scaleY", "translationX", "wireman", "translationY", "marial", "rotationX", "beachfront", "rotationY", "competently", "rotationZ", "impromptu", "cameraDistance", "Lrestrictive/picketboat;", "taiyuan", "J", "transformOrigin", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class polloi {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public float rotationY;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public float rotationZ;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public float translationX;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public float rotationX;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public float translationY;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public float scaleX = 1.0f;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public float scaleY = 1.0f;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public float cameraDistance = 8.0f;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public long transformOrigin = picketboat.INSTANCE.attabal();

    public final void attabal(polloi other) {
        this.scaleX = other.scaleX;
        this.scaleY = other.scaleY;
        this.translationX = other.translationX;
        this.translationY = other.translationY;
        this.rotationX = other.rotationX;
        this.rotationY = other.rotationY;
        this.rotationZ = other.rotationZ;
        this.cameraDistance = other.cameraDistance;
        this.transformOrigin = other.transformOrigin;
    }

    public final boolean dern(polloi other) {
        return this.scaleX == other.scaleX && this.scaleY == other.scaleY && this.translationX == other.translationX && this.translationY == other.translationY && this.rotationX == other.rotationX && this.rotationY == other.rotationY && this.rotationZ == other.rotationZ && this.cameraDistance == other.cameraDistance && picketboat.dern(this.transformOrigin, other.transformOrigin);
    }

    public final void saneness(restrictive.treadless scope) {
        this.scaleX = scope.monoploid();
        this.scaleY = scope.cord();
        this.translationX = scope.gintrap();
        this.translationY = scope.dovishness();
        this.rotationX = scope.rotuma();
        this.rotationY = scope.competently();
        this.rotationZ = scope.taiyuan();
        this.cameraDistance = scope.apical();
        this.transformOrigin = scope.kowloon();
    }
}
