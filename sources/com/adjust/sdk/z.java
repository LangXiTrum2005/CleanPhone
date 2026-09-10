package com.adjust.sdk;

import com.adjust.sdk.scheduler.TimerOnce;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustThirdPartySharingResult f7072c;

    public /* synthetic */ z(ArrayList arrayList, AdjustThirdPartySharingResult adjustThirdPartySharingResult, int i10) {
        this.f7070a = i10;
        this.f7071b = arrayList;
        this.f7072c = adjustThirdPartySharingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7070a) {
            case 0:
                ArrayList arrayList = this.f7071b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj;
                    if (adjustTimeoutCallback != null) {
                        TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                        if (timeoutTimer != null) {
                            timeoutTimer.cancel();
                        }
                        OnThirdPartySharingSettingsReadListener onThirdPartySharingSettingsReadListener = adjustTimeoutCallback.getOnThirdPartySharingSettingsReadListener();
                        if (onThirdPartySharingSettingsReadListener != null) {
                            onThirdPartySharingSettingsReadListener.onThirdPartySharingSettingsRead(this.f7072c);
                        }
                        adjustTimeoutCallback.setOnThirdPartySharingSettingsReadListener(null);
                    }
                }
                break;
            default:
                ArrayList arrayList2 = this.f7071b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    AdjustTimeoutCallback adjustTimeoutCallback2 = (AdjustTimeoutCallback) obj2;
                    if (adjustTimeoutCallback2 != null) {
                        TimerOnce timeoutTimer2 = adjustTimeoutCallback2.getTimeoutTimer();
                        if (timeoutTimer2 != null) {
                            timeoutTimer2.cancel();
                        }
                        OnThirdPartySharingSettingsReadListener onThirdPartySharingSettingsReadListener2 = adjustTimeoutCallback2.getOnThirdPartySharingSettingsReadListener();
                        if (onThirdPartySharingSettingsReadListener2 != null) {
                            onThirdPartySharingSettingsReadListener2.onThirdPartySharingSettingsRead(this.f7072c);
                        }
                        adjustTimeoutCallback2.setOnThirdPartySharingSettingsReadListener(null);
                    }
                }
                break;
        }
    }
}
