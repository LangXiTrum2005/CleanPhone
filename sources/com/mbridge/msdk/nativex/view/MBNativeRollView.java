package com.mbridge.msdk.nativex.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBNativeRollView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RollingBCView f35025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f35026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NativeListener.FilpListener f35027c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
    }

    @SuppressLint({"NewApi"})
    public MBNativeRollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f35025a.dispatchTouchEvent(motionEvent);
    }

    public void setData(List<Frame> list, Context context, String str, a aVar) {
        this.f35025a.setData(list, context, str, aVar);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        if (filpListener != null) {
            this.f35027c = filpListener;
            this.f35025a.setFilpListening(filpListener);
        }
    }

    public void setFrameWidth(int i10) {
        this.f35025a.setLayoutParams(new LinearLayout.LayoutParams(i10, -2));
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35026b = context;
        RollingBCView rollingBCView = new RollingBCView(context);
        this.f35025a = rollingBCView;
        addView(rollingBCView);
        this.f35025a.setLayoutParams(new LinearLayout.LayoutParams((int) (((double) v0.j(context)) * 0.9d), -2));
        setClipChildren(false);
    }

    public MBNativeRollView(Context context) {
        this(context, null);
    }
}
