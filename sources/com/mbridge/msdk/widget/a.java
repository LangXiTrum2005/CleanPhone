package com.mbridge.msdk.widget;

import android.view.View;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f38357a = 0;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.f38357a > 2000) {
            this.f38357a = timeInMillis;
            a(view);
        }
    }
}
