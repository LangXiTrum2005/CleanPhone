package androidx.appcompat.view;

import android.view.View;
import android.view.animation.BaseInterpolator;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ViewPropertyAnimatorCompatSet {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseInterpolator f3452c;
    public ViewPropertyAnimatorListenerAdapter d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3453e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3451b = -1;
    public final ViewPropertyAnimatorListenerAdapter f = new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.view.ViewPropertyAnimatorCompatSet.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3454a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3455b = 0;

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void b() {
            if (this.f3454a) {
                return;
            }
            this.f3454a = true;
            ViewPropertyAnimatorListenerAdapter viewPropertyAnimatorListenerAdapter = ViewPropertyAnimatorCompatSet.this.d;
            if (viewPropertyAnimatorListenerAdapter != null) {
                viewPropertyAnimatorListenerAdapter.b();
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void c() {
            int i2 = this.f3455b + 1;
            this.f3455b = i2;
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = ViewPropertyAnimatorCompatSet.this;
            if (i2 == viewPropertyAnimatorCompatSet.f3450a.size()) {
                ViewPropertyAnimatorListenerAdapter viewPropertyAnimatorListenerAdapter = viewPropertyAnimatorCompatSet.d;
                if (viewPropertyAnimatorListenerAdapter != null) {
                    viewPropertyAnimatorListenerAdapter.c();
                }
                this.f3455b = 0;
                this.f3454a = false;
                viewPropertyAnimatorCompatSet.f3453e = false;
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3450a = new ArrayList();

    public final void a() {
        if (this.f3453e) {
            Iterator it = this.f3450a.iterator();
            while (it.hasNext()) {
                ((ViewPropertyAnimatorCompat) it.next()).b();
            }
            this.f3453e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f3453e) {
            return;
        }
        for (ViewPropertyAnimatorCompat viewPropertyAnimatorCompat : this.f3450a) {
            long j = this.f3451b;
            if (j >= 0) {
                viewPropertyAnimatorCompat.c(j);
            }
            BaseInterpolator baseInterpolator = this.f3452c;
            if (baseInterpolator != null && (view = (View) viewPropertyAnimatorCompat.f4485a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.d != null) {
                viewPropertyAnimatorCompat.d(this.f);
            }
            View view2 = (View) viewPropertyAnimatorCompat.f4485a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f3453e = true;
    }
}
