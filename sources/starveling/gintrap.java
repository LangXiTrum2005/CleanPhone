package starveling;

import android.view.MotionEvent;
import java.util.List;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PointerInputEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lstarveling/gintrap;", "", "", "uptime", "", "Lstarveling/rotuma;", "pointers", "Landroid/view/MotionEvent;", "motionEvent", "<init>", "(JLjava/util/List;Landroid/view/MotionEvent;)V", "attabal", "J", "getUptime", "()J", "saneness", "Ljava/util/List;", "()Ljava/util/List;", "dern", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class gintrap {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final long uptime;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final MotionEvent motionEvent;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final List<PointerInputEventData> pointers;

    public gintrap(long j, List<PointerInputEventData> list, MotionEvent motionEvent) {
        this.uptime = j;
        this.pointers = list;
        this.motionEvent = motionEvent;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    public final List<PointerInputEventData> saneness() {
        return this.pointers;
    }
}
