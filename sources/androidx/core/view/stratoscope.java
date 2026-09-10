package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: compiled from: MotionEventCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class stratoscope {
    public static boolean attabal(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
