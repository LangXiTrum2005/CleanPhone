package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1835Yb extends LinearLayout {
    public static int A00 = (int) (XX.A02 * 56.0f);
    public static int A01 = (int) (XX.A02 * 56.0f);

    public abstract void A09();

    public abstract void A0A();

    public abstract void A0B();

    public abstract void A0C(float f, int i2);

    public abstract void A0D(C1558Na c1558Na, boolean z2);

    public abstract boolean A0E();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract InterfaceC1834Ya getToolbarListener();

    public abstract void setAdReportingVisible(boolean z2);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr);

    public abstract void setFullscreen(boolean z2);

    public abstract void setPageDetails(C1570Nm c1570Nm, String str, int i2, C1576Ns c1576Ns);

    public abstract void setPageDetailsVisible(boolean z2);

    public abstract void setProgress(float f);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(YM ym);

    public abstract void setProgressImmediate(float f);

    public abstract void setProgressSpinnerInvisible(boolean z2);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i2);

    public abstract void setToolbarListener(InterfaceC1834Ya interfaceC1834Ya);

    public AbstractC1835Yb(Context context) {
        super(context);
    }

    public void A08() {
    }

    public Rect getRequestedMargins() {
        return null;
    }
}
