package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
public class CustomTouchImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdCountDownButton.a f45731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f45732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f45733c;
    private boolean d;

    public CustomTouchImageView(Context context) {
        super(context);
        this.f45732b = new Rect();
        this.f45733c = 1.0f;
        this.d = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d && motionEvent.getAction() == 0) {
            if (this.f45733c == 1.0f) {
                AdCountDownButton.a aVar = this.f45731a;
                if (aVar != null) {
                    aVar.a();
                }
                return true;
            }
            float x = (int) motionEvent.getX();
            float y = (int) motionEvent.getY();
            float f = this.f45733c;
            float width = getWidth();
            float f2 = width * f;
            float height = getHeight();
            float f3 = f * height;
            float f4 = (width - f2) / 2.0f;
            float f5 = (height - f3) / 2.0f;
            float f6 = f2 + f4;
            float f7 = f3 + f5;
            if (x >= f4 && x <= f6 && y >= f5 && y <= f7) {
                AdCountDownButton.a aVar2 = this.f45731a;
                if (aVar2 != null) {
                    aVar2.a();
                }
                return true;
            }
            getGlobalVisibleRect(this.f45732b);
            AdCountDownButton.a aVar3 = this.f45731a;
            if (aVar3 != null) {
                aVar3.a(this.f45732b);
            }
        }
        return false;
    }

    @Override // android.view.View
    public void setClickable(boolean z2) {
        super.setClickable(z2);
        this.d = z2;
    }

    public void setCloseListener(AdCountDownButton.a aVar) {
        this.f45731a = aVar;
    }

    public void setRegionScale(float f) {
        this.f45733c = f;
    }

    public CustomTouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45732b = new Rect();
        this.f45733c = 1.0f;
        this.d = true;
    }

    public CustomTouchImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f45732b = new Rect();
        this.f45733c = 1.0f;
        this.d = true;
    }
}
