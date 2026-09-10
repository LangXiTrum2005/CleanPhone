package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes7.dex */
public class HeightScrollView extends ScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f47570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f47571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f47572c;
    private int d;

    public interface a {
        void a(int i2);
    }

    public HeightScrollView(Context context) {
        super(context);
        this.f47571b = true;
        this.d = 0;
    }

    @Override // android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        View view = this.f47572c;
        if (view != null) {
            this.d = view.getHeight() - i3;
        }
        a aVar = this.f47570a;
        if (aVar != null) {
            aVar.a(i3);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f47571b) {
            return false;
        }
        if (this.f47572c == null || y >= this.d) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBlankView(View view) {
        this.f47572c = view;
    }

    public void setOnScrollListener(a aVar) {
        this.f47570a = aVar;
    }

    public void setScrollEnable(boolean z2) {
        this.f47571b = z2;
    }

    public HeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47571b = true;
        this.d = 0;
    }

    public HeightScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f47571b = true;
        this.d = 0;
    }
}
