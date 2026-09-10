package starveling;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\b\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\b\u0012\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0007\u0010\n\"\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"Lstarveling/saneness;", "", "", "positionChange", "downChange", "<init>", "(ZZ)V", "attabal", "Z", "saneness", "()Z", "setPositionChange", "(Z)V", "getPositionChange$annotations", "()V", "setDownChange", "getDownChange$annotations", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@patroclinal.wireman
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public boolean positionChange;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public boolean downChange;

    public saneness(boolean z, boolean z2) {
        this.positionChange = z;
        this.downChange = z2;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final boolean getDownChange() {
        return this.downChange;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final boolean getPositionChange() {
        return this.positionChange;
    }
}
