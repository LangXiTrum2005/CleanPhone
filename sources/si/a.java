package si;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.plugin.platform.f;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FlutterMutatorsStack f50247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f50248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f50250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mi.a f50251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f50252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f50253g;

    public a(Activity activity, float f10, mi.a aVar) {
        super(activity, null);
        this.f50248b = f10;
        this.f50251e = aVar;
        this.f50252f = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f50247a.getFinalMatrix());
        float f10 = this.f50248b;
        matrix.preScale(1.0f / f10, 1.0f / f10);
        matrix.postTranslate(-this.f50249c, -this.f50250d);
        return matrix;
    }

    public final void a() {
        f fVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (fVar = this.f50253g) == null) {
            return;
        }
        this.f50253g = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(fVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f50247a.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f50249c, -this.f50250d);
            canvas.clipPath(path);
        }
        int finalOpacity = (int) (this.f50247a.getFinalOpacity() * 255.0f);
        Paint paint = this.f50252f;
        if (paint.getAlpha() != finalOpacity) {
            paint.setAlpha((int) (this.f50247a.getFinalOpacity() * 255.0f));
            setLayerType(2, paint);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        mi.a aVar = this.f50251e;
        if (aVar == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate(getLeft(), getTop());
        aVar.c(motionEvent, matrix);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(@NonNull View.OnFocusChangeListener onFocusChangeListener) {
        a();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f50253g == null) {
            f fVar = new f(onFocusChangeListener, this);
            this.f50253g = fVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(fVar);
        }
    }
}
