package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.k;
import com.mbridge.msdk.nativex.adapter.RollingAdapter;
import com.mbridge.msdk.nativex.listener.RollingPagerListenrt;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class RollingBCView extends k {
    private NativeListener.FilpListener FilpListening;
    private boolean isReport;
    private RollingPagerListenrt listenrt;
    private MBNativeRollView.a mvinterface;

    private RollingBCView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isReport = true;
        this.listenrt = new RollingPagerListenrt();
        setOffscreenPageLimit(1);
        setClipChildren(false);
    }

    @Override // androidx.viewpager.widget.k, android.view.View
    public void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
            int i12 = 0;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i12) {
                    i12 = measuredHeight;
                }
                if (measuredHeight > 10 && this.isReport) {
                    this.listenrt.reportRollBC(0);
                    this.isReport = false;
                }
            }
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void setData(List<Frame> list, Context context, String str, MBNativeRollView.a aVar) {
        if (list == null || list.size() == 0) {
            throw new NegativeArraySizeException("ad date is null or size is 0");
        }
        RollingAdapter rollingAdapter = new RollingAdapter(list);
        if (aVar != null) {
            rollingAdapter.setMvinterface(aVar);
        }
        setAdapter(rollingAdapter);
        this.listenrt.setCampList(list, context, str);
        NativeListener.FilpListener filpListener = this.FilpListening;
        if (filpListener != null) {
            this.listenrt.setFilpListening(filpListener);
        }
        setOnPageChangeListener(this.listenrt);
        if (this.isReport) {
            this.listenrt.reportRollBC(0);
            this.isReport = false;
        }
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        this.FilpListening = filpListener;
    }

    public RollingBCView(Context context) {
        super(context);
        this.isReport = true;
        this.listenrt = new RollingPagerListenrt();
    }
}
