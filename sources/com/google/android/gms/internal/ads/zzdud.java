package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdud extends FrameLayout {
    private final com.google.android.gms.ads.internal.util.zzat zza;

    public zzdud(Context context, View view, com.google.android.gms.ads.internal.util.zzat zzatVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.zza = zzatVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.zza.zza(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            KeyEvent.Callback childAt = getChildAt(i2);
            if (childAt instanceof zzcir) {
                arrayList.add((zzcir) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((zzcir) arrayList.get(i3)).destroy();
        }
    }
}
