package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC2712Qu implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3632a;

    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ClickableSpan[] clickableSpanArr;
        AbstractC2995aW.q(view, com.umeng.analytics.pro.bc.aK);
        AbstractC2995aW.q(motionEvent, NotificationCompat.CATEGORY_EVENT);
        int action = motionEvent.getAction();
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (text instanceof Spanned) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int totalPaddingLeft = x - textView.getTotalPaddingLeft();
                int totalPaddingTop = y - textView.getTotalPaddingTop();
                int scrollX = textView.getScrollX() + totalPaddingLeft;
                int scrollY = textView.getScrollY() + totalPaddingTop;
                Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            if (action == 0) {
                this.f3632a = System.currentTimeMillis();
                if (clickableSpanArr != null) {
                    return (clickableSpanArr.length == 0) ^ true;
                }
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.f3632a;
            if (j != -1 && jCurrentTimeMillis - j >= ViewConfiguration.getLongPressTimeout()) {
                this.f3632a = -1L;
                return view.performLongClick();
            }
            if (action == 1) {
                if (clickableSpanArr == null) {
                    view.performClick();
                } else {
                    if (!(clickableSpanArr.length == 0)) {
                        clickableSpanArr[0].onClick(view);
                    } else {
                        view.performClick();
                    }
                }
            }
        }
        return false;
    }
}
