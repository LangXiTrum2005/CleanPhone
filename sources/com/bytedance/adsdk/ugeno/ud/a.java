package com.bytedance.adsdk.ugeno.ud;

import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ boolean C(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoTdscdma;
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable g(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* bridge */ /* synthetic */ CellIdentityNr j(Object obj) {
        return (CellIdentityNr) obj;
    }

    public static /* bridge */ /* synthetic */ CellInfoNr l(CellInfo cellInfo) {
        return (CellInfoNr) cellInfo;
    }

    public static /* bridge */ /* synthetic */ CellInfoTdscdma m(CellInfo cellInfo) {
        return (CellInfoTdscdma) cellInfo;
    }

    public static /* bridge */ /* synthetic */ boolean y(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    public static /* bridge */ /* synthetic */ boolean z(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoNr;
    }
}
