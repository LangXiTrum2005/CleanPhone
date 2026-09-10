package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import sg.bigo.ads.core.adview.c;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T extends sg.bigo.ads.core.adview.c> extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f46974a;

    public a(Context context) {
        super(context);
    }

    public abstract T a();

    public final boolean a(int i2, int i3) {
        return getViewImpl().a(i2, i3);
    }

    public final synchronized T getViewImpl() {
        try {
            if (this.f46974a == null) {
                this.f46974a = (T) a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f46974a;
    }

    @Override // android.view.View
    @Deprecated
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
