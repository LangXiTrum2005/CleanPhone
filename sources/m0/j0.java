package m0;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f45720d;

    public j0() {
        if (un.a.f52273b == null) {
            un.a.f52273b = new un.a(11);
        }
    }

    public int a(int i10) {
        if (i10 < this.f45719c) {
            return ((ByteBuffer) this.f45720d).getShort(this.f45718b + i10);
        }
        return 0;
    }

    public void b() {
        if (((yj.f) this.f45720d).f54429h != this.f45719c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object e(View view);

    public abstract void f(View view, Object obj);

    public void g() {
        while (true) {
            int i10 = this.f45717a;
            yj.f fVar = (yj.f) this.f45720d;
            if (i10 >= fVar.f54427f || fVar.f54424c[i10] >= 0) {
                return;
            } else {
                this.f45717a = i10 + 1;
            }
        }
    }

    public void h(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f45718b) {
            f(view, obj);
            return;
        }
        b bVar = null;
        if (Build.VERSION.SDK_INT >= this.f45718b) {
            tag = e(view);
        } else {
            tag = view.getTag(this.f45717a);
            if (!((Class) this.f45720d).isInstance(tag)) {
                tag = null;
            }
        }
        if (i(tag, obj)) {
            WeakHashMap weakHashMap = s0.f45746a;
            View.AccessibilityDelegate accessibilityDelegateA = p0.a(view);
            if (accessibilityDelegateA != null) {
                bVar = accessibilityDelegateA instanceof a ? ((a) accessibilityDelegateA).f45677a : new b(accessibilityDelegateA);
            }
            if (bVar == null) {
                bVar = new b();
            }
            s0.f(view, bVar);
            view.setTag(this.f45717a, obj);
            int i10 = this.f45719c;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                boolean z10 = o0.a(view) != null && view.isShown() && view.getWindowVisibility() == 0;
                if (view.getAccessibilityLiveRegion() != 0 || z10) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(z10 ? 32 : com.ironsource.mediationsdk.metadata.a.f29616n);
                    accessibilityEventObtain.setContentChangeTypes(i10);
                    if (z10) {
                        accessibilityEventObtain.getText().add(o0.a(view));
                        if (view.getImportantForAccessibility() == 0) {
                            view.setImportantForAccessibility(1);
                        }
                    }
                    view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                    return;
                }
                if (i10 != 32) {
                    if (view.getParent() != null) {
                        try {
                            view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                            return;
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                            return;
                        }
                    }
                    return;
                }
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(o0.a(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
            }
        }
    }

    public boolean hasNext() {
        return this.f45717a < ((yj.f) this.f45720d).f54427f;
    }

    public abstract boolean i(Object obj, Object obj2);

    public void remove() {
        yj.f fVar = (yj.f) this.f45720d;
        b();
        if (this.f45718b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        fVar.h();
        fVar.v(this.f45718b);
        this.f45718b = -1;
        this.f45719c = fVar.f54429h;
    }
}
