package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes4.dex */
public class zza implements IInterface {
    public final IBinder X;

    public zza(IBinder iBinder) {
        this.X = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.X;
    }
}
