package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {
    public int e0;
    public View f0;
    public int g0;

    public View getContent() {
        return this.f0;
    }

    public int getEmptyVisibility() {
        return this.g0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i2) {
        View viewFindViewById;
        if (this.e0 == i2) {
            return;
        }
        View view = this.f0;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f0.getLayoutParams()).a0 = false;
            this.f0 = null;
        }
        this.e0 = i2;
        if (i2 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i2)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i2) {
        this.g0 = i2;
    }
}
