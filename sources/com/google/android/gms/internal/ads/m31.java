package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface m31 {
    ListenableFuture a(Context context);

    ListenableFuture b(Context context, View view, Activity activity);

    ListenableFuture c(Context context, String str, View view);

    void d(InputEvent inputEvent);

    String zza();

    ListenableFuture zzb();

    int zzg();
}
