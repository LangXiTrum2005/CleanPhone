package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.a.c;
import sg.bigo.ads.common.view.a.d;

/* JADX INFO: loaded from: classes7.dex */
public class RealtimeBlurLinearLayout extends LinearLayout implements c<RealtimeBlurLinearLayout> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<RealtimeBlurLinearLayout> f47605a;

    public RealtimeBlurLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public Drawable getBackground() {
        Drawable background = super.getBackground();
        return background instanceof sg.bigo.ads.common.view.a.a ? ((sg.bigo.ads.common.view.a.a) background).f47310a : background;
    }

    public sg.bigo.ads.common.view.a.b getBlurStyle() {
        return this.f47605a.d.f47669b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d<RealtimeBlurLinearLayout> dVar = this.f47605a;
        View viewA = u.a(dVar.f47677c, dVar.f47676b);
        dVar.f = viewA;
        if (viewA == null) {
            dVar.g = false;
            return;
        }
        viewA.getViewTreeObserver().addOnPreDrawListener(dVar.f47679h);
        dVar.a();
        boolean z2 = dVar.f.getRootView() != dVar.f47676b.getRootView();
        dVar.g = z2;
        if (z2) {
            dVar.f.postInvalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d<RealtimeBlurLinearLayout> dVar = this.f47605a;
        View view = dVar.f;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(dVar.f47679h);
        }
        dVar.b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        d<RealtimeBlurLinearLayout> dVar = this.f47605a;
        sg.bigo.ads.common.view.a.a aVar = dVar.d;
        if (drawable != aVar) {
            aVar.a(drawable);
            dVar.b();
        }
        super.setBackground(dVar.d);
    }

    @Override // sg.bigo.ads.common.view.a.c
    public void setBlurStyle(sg.bigo.ads.common.view.a.b bVar) {
        this.f47605a.setBlurStyle(bVar);
    }

    public RealtimeBlurLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RealtimeBlurLinearLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d<RealtimeBlurLinearLayout> dVar = new d<>(this);
        this.f47605a = dVar;
        setBackground(dVar.d);
    }
}
