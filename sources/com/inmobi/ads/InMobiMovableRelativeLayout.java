package com.inmobi.ads;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.media.E5;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/inmobi/ads/InMobiMovableRelativeLayout;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/ViewGroup;", "parentView", "", "setParentView", "(Landroid/view/ViewGroup;)V", "", "isMovable", "setIsMovable", "(Z)V", "resetPosition", "()V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Companion", "com/inmobi/media/E5", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InMobiMovableRelativeLayout extends RelativeLayout {
    public static final E5 Companion = new E5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f22638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup.LayoutParams f22639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22640c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22641e;

    public InMobiMovableRelativeLayout(Context context) {
        super(context);
        this.f22638a = new WeakReference(null);
        this.f22640c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    private final void setParentView(ViewGroup parentView) {
        this.f22638a = new WeakReference(parentView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        Intrinsics.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        setParentView((ViewGroup) parent);
        if (this.f22639b == null) {
            this.f22639b = getLayoutParams();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setParentView(null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        ViewGroup viewGroup;
        Intrinsics.f(ev, "ev");
        if (this.f22640c) {
            float rawX = ev.getRawX();
            float rawY = ev.getRawY();
            int action = ev.getAction();
            if (action == 0) {
                this.d = rawX;
                this.f22641e = rawY;
            } else if (action == 2 && (viewGroup = (ViewGroup) this.f22638a.get()) != null) {
                float f = rawX - this.d;
                float f2 = rawY - this.f22641e;
                int left = (int) (getLeft() + f);
                int top2 = (int) (getTop() + f2);
                int paddingLeft = viewGroup.getPaddingLeft();
                int paddingTop = viewGroup.getPaddingTop();
                int width = viewGroup.getWidth() - viewGroup.getPaddingRight();
                int height = viewGroup.getHeight() - viewGroup.getPaddingBottom();
                int iMax = Math.max(paddingLeft, Math.min(left, width - getWidth()));
                int iMax2 = Math.max(paddingTop, Math.min(top2, height - getHeight()));
                layout(iMax, iMax2, getWidth() + iMax, getHeight() + iMax2);
                this.d = rawX;
                this.f22641e = rawY;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    public final void resetPosition() {
        setLayoutParams(this.f22639b);
    }

    public final void setIsMovable(boolean isMovable) {
        this.f22640c = isMovable;
    }

    public InMobiMovableRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22638a = new WeakReference(null);
        this.f22640c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    public InMobiMovableRelativeLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f22638a = new WeakReference(null);
        this.f22640c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }
}
