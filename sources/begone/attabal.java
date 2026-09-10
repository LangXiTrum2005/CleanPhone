package begone;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: InsetDialogOnTouchListener.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal implements View.OnTouchListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final int f15046arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Dialog f15047kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final int f15048monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final int f15049polloi;

    public attabal(Dialog dialog, Rect rect) {
        this.f15047kowloon = dialog;
        this.f15046arytenoidectomy = rect.left;
        this.f15048monoploid = rect.top;
        this.f15049polloi = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f15046arytenoidectomy + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f15048monoploid + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f15049polloi;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f15047kowloon.onTouchEvent(motionEventObtain);
    }
}
