package androidx.compose.ui.platform;

import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/timberyard;", "", "<init>", "()V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "index", "", "attabal", "(Landroid/view/MotionEvent;I)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class timberyard {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final timberyard f7505attabal = new timberyard();

    public final boolean attabal(MotionEvent event, int index) {
        float rawX = event.getRawX(index);
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return false;
        }
        float rawY = event.getRawY(index);
        return (Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true;
    }
}
