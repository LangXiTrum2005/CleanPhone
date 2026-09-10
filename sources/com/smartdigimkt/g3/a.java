package com.smartdigimkt.g3;

import android.view.View;
import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements View.OnClickListener {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f35402Y = 2000;
    private long X = 0;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.X > 2000) {
            this.X = timeInMillis;
            a(view);
        }
    }
}
