package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lz0 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ay0 f17163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final md0 f17164b;

    public lz0(md0 md0Var) {
        this.f17164b = md0Var;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        ay0 ay0Var = this.f17163a;
        if (ay0Var != null) {
            ay0Var.f12539d = null;
            lz0 lz0Var = (lz0) ((ArrayDeque) ay0Var.f12538c).poll();
            ay0Var.f12539d = lz0Var;
            if (lz0Var != null) {
                lz0Var.executeOnExecutor((ThreadPoolExecutor) ay0Var.f12537b, new Object[0]);
            }
        }
    }
}
