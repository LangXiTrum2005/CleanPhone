package com.google.android.gms.appset;

import android.content.Context;
import androidx.annotation.NonNull;
import v6.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class AppSet {
    private AppSet() {
    }

    @NonNull
    public static AppSetIdClient getClient(@NonNull Context context) {
        return new c(context, 1);
    }
}
