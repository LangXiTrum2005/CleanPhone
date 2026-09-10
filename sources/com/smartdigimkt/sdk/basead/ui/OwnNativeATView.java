package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.smartdigimkt.a6.c;
import com.smartdigimkt.u5.b;

/* JADX INFO: loaded from: classes6.dex */
public class OwnNativeATView extends FrameLayout implements com.smartdigimkt.u5.a {
    private c e0;
    private a f0;
    b g0;

    public interface a {
        void onPause();

        void onResume();
    }

    public OwnNativeATView(Context context) {
        super(context);
    }

    private boolean a(MotionEvent motionEvent) {
        synchronized (this) {
            try {
                try {
                    b bVar = this.g0;
                    if (bVar != null && bVar.a(motionEvent)) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b() {
        a aVar = this.f0;
        if (aVar != null) {
            aVar.onResume();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            c cVar2 = this.e0;
            if (cVar2 != null) {
                cVar2.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), (int) motionEvent.getX(), (int) motionEvent.getY());
            }
        } else if ((action == 1 || action == 3) && (cVar = this.e0) != null) {
            cVar.b((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.smartdigimkt.v3.a getAdClickRecord(int i2) {
        c cVar = this.e0;
        if (cVar != null) {
            return cVar.a(i2);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z2) {
        super.onVisibilityAggregated(z2);
        if (z2) {
            b();
        } else {
            a();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (Build.VERSION.SDK_INT < 28) {
            if (z2) {
                b();
            } else {
                a();
            }
        }
    }

    public void releaseAllCallback() {
        this.g0 = null;
        this.e0 = null;
        this.f0 = null;
    }

    @Override // com.smartdigimkt.u5.a
    public void setCallback(b bVar) {
        synchronized (this) {
            this.g0 = bVar;
        }
    }

    public void setClickRecordHelper(c cVar) {
        this.e0 = cVar;
    }

    public void setLifeCallback(a aVar) {
        this.f0 = aVar;
    }

    public OwnNativeATView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OwnNativeATView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    private void a() {
        a aVar = this.f0;
        if (aVar != null) {
            aVar.onPause();
        }
    }
}
