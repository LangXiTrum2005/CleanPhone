package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: OneShotPreDrawListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class polder implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public ViewTreeObserver f9383arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    private final View f9384kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    private final Runnable f9385monoploid;

    public polder(View view, Runnable runnable) {
        this.f9384kowloon = view;
        this.f9383arytenoidectomy = view.getViewTreeObserver();
        this.f9385monoploid = runnable;
    }

    public static polder attabal(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        polder polderVar = new polder(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(polderVar);
        view.addOnAttachStateChangeListener(polderVar);
        return polderVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        saneness();
        this.f9385monoploid.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f9383arytenoidectomy = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        saneness();
    }

    public void saneness() {
        if (this.f9383arytenoidectomy.isAlive()) {
            this.f9383arytenoidectomy.removeOnPreDrawListener(this);
        } else {
            this.f9384kowloon.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f9384kowloon.removeOnAttachStateChangeListener(this);
    }
}
