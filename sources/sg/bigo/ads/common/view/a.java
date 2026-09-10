package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f47665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractRunnableC0853a f47666c;

    /* JADX INFO: renamed from: sg.bigo.ads.common.view.a$a, reason: collision with other inner class name */
    public static abstract class AbstractRunnableC0853a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f47668b;

        private AbstractRunnableC0853a() {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public void run() {
            if (this.f47668b) {
                return;
            }
            a();
        }

        public /* synthetic */ AbstractRunnableC0853a(byte b2) {
            this();
        }
    }

    public a(Context context) {
        this(context, null);
    }

    private synchronized void a(boolean z2) {
        try {
            AbstractRunnableC0853a abstractRunnableC0853a = this.f47666c;
            if (abstractRunnableC0853a != null) {
                abstractRunnableC0853a.f47668b = true;
                this.f47666c = null;
            }
            if (z2) {
                AbstractRunnableC0853a abstractRunnableC0853a2 = new AbstractRunnableC0853a() { // from class: sg.bigo.ads.common.view.a.1
                    @Override // sg.bigo.ads.common.view.a.AbstractRunnableC0853a
                    public final void a() {
                        if (a.this.f47665b && a.this.b() && u.c(a.this) && sg.bigo.ads.common.ab.a.a(a.this, new Rect())) {
                            a.this.a();
                        }
                        a aVar = a.this;
                        aVar.postDelayed(this, aVar.f47664a);
                    }
                };
                this.f47666c = abstractRunnableC0853a2;
                postDelayed(abstractRunnableC0853a2, this.f47664a);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void a();

    public abstract boolean b();

    public final void c() {
        if (this.f47665b) {
            return;
        }
        this.f47665b = true;
        a(true);
    }

    public final void d() {
        this.f47665b = false;
        a(false);
    }

    public int getFlipInterval() {
        return this.f47664a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    public void setFlipInterval(int i2) {
        this.f47664a = i2;
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f47664a = 3000;
        this.f47665b = false;
    }
}
