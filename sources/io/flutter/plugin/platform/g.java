package io.flutter.plugin.platform;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.view.TextureRegistry$SurfaceProducer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mi.a f43321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f43322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f43323g;

    public g(Activity activity) {
        super(activity);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        l lVar = this.f43322f;
        if (lVar == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = ((TextureRegistry$SurfaceProducer) lVar.f43335b).getSurface();
        if (!surface.isValid()) {
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        if (canvasLockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(canvasLockHardwareCanvas);
        } finally {
            this.f43322f.i();
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f43323g;
    }

    public int getRenderTargetHeight() {
        l lVar = this.f43322f;
        if (lVar != null) {
            return ((TextureRegistry$SurfaceProducer) lVar.f43335b).getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        l lVar = this.f43322f;
        if (lVar != null) {
            return ((TextureRegistry$SurfaceProducer) lVar.f43335b).getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f43321e == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i10 = this.f43319c;
            this.f43317a = i10;
            int i11 = this.f43320d;
            this.f43318b = i11;
            matrix.postTranslate(i10, i11);
        } else if (action != 2) {
            matrix.postTranslate(this.f43319c, this.f43320d);
        } else {
            matrix.postTranslate(this.f43317a, this.f43318b);
            this.f43317a = this.f43319c;
            this.f43318b = this.f43320d;
        }
        this.f43321e.c(motionEvent, matrix);
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

    public void setLayoutParams(@NonNull FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f43319c = layoutParams.leftMargin;
        this.f43320d = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(@NonNull View.OnFocusChangeListener onFocusChangeListener) {
        f fVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (fVar = this.f43323g) != null) {
            this.f43323g = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(fVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f43323g == null) {
            f fVar2 = new f(this, onFocusChangeListener);
            this.f43323g = fVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(fVar2);
        }
    }

    public void setTouchProcessor(@Nullable mi.a aVar) {
        this.f43321e = aVar;
    }
}
