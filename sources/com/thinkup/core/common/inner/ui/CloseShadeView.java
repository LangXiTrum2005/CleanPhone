package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class CloseShadeView extends View {
    private boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View.OnClickListener f41843n;
    private final String o;
    private View.OnTouchListener o0;

    public CloseShadeView(Context context) {
        this(context, null);
    }

    private void o() {
        setClickable(true);
    }

    public boolean isTouch() {
        return this.m;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        Objects.toString(onClickListener);
        this.f41843n = onClickListener;
        super.setOnClickListener(new View.OnClickListener() { // from class: com.thinkup.core.common.inner.ui.CloseShadeView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloseShadeView.this.m = true;
                if (CloseShadeView.this.f41843n != null) {
                    CloseShadeView.this.f41843n.onClick(view);
                }
            }
        });
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        Objects.toString(onTouchListener);
        this.o0 = onTouchListener;
        super.setOnTouchListener(new View.OnTouchListener() { // from class: com.thinkup.core.common.inner.ui.CloseShadeView.2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                CloseShadeView.o(CloseShadeView.this, motionEvent);
                if (CloseShadeView.this.o0 != null) {
                    return CloseShadeView.this.o0.onTouch(view, motionEvent);
                }
                return false;
            }
        });
    }

    public CloseShadeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void m() {
        this.m = true;
    }

    private void o(MotionEvent motionEvent) {
        this.m = true;
        motionEvent.getAction();
    }

    public CloseShadeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.o = "CloseShadeView";
        this.m = false;
        setClickable(true);
    }

    public static /* synthetic */ void o(CloseShadeView closeShadeView, MotionEvent motionEvent) {
        closeShadeView.m = true;
        motionEvent.getAction();
    }
}
