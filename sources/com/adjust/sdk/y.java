package com.adjust.sdk;

import com.adjust.sdk.scheduler.TimerOnce;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustAttribution f7066c;

    public /* synthetic */ y(ArrayList arrayList, AdjustAttribution adjustAttribution, int i10) {
        this.f7064a = i10;
        this.f7065b = arrayList;
        this.f7066c = adjustAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7064a) {
            case 0:
                ArrayList arrayList = this.f7065b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    OnAttributionReadListener onAttributionReadListener = (OnAttributionReadListener) obj;
                    if (onAttributionReadListener != null) {
                        onAttributionReadListener.onAttributionRead(this.f7066c);
                    }
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f7065b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj2;
                    if (adjustTimeoutCallback != null) {
                        TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                        if (timeoutTimer != null) {
                            timeoutTimer.cancel();
                        }
                        OnAttributionReadListener onAttributionReadListener2 = adjustTimeoutCallback.getOnAttributionReadListener();
                        if (onAttributionReadListener2 != null) {
                            onAttributionReadListener2.onAttributionRead(this.f7066c);
                        }
                        adjustTimeoutCallback.setOnAttributionReadListener(null);
                    }
                }
                break;
            case 2:
                ArrayList arrayList3 = this.f7065b;
                int size3 = arrayList3.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj3 = arrayList3.get(i12);
                    i12++;
                    OnAttributionReadListener onAttributionReadListener3 = (OnAttributionReadListener) obj3;
                    if (onAttributionReadListener3 != null) {
                        onAttributionReadListener3.onAttributionRead(this.f7066c);
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f7065b;
                int size4 = arrayList4.size();
                int i13 = 0;
                while (i13 < size4) {
                    Object obj4 = arrayList4.get(i13);
                    i13++;
                    AdjustTimeoutCallback adjustTimeoutCallback2 = (AdjustTimeoutCallback) obj4;
                    if (adjustTimeoutCallback2 != null) {
                        TimerOnce timeoutTimer2 = adjustTimeoutCallback2.getTimeoutTimer();
                        if (timeoutTimer2 != null) {
                            timeoutTimer2.cancel();
                        }
                        OnAttributionReadListener onAttributionReadListener4 = adjustTimeoutCallback2.getOnAttributionReadListener();
                        if (onAttributionReadListener4 != null) {
                            onAttributionReadListener4.onAttributionRead(this.f7066c);
                        }
                        adjustTimeoutCallback2.setOnAttributionReadListener(null);
                    }
                }
                break;
        }
    }
}
