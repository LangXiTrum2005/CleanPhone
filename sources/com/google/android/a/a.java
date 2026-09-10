package com.google.android.a;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public class a implements IInterface {
    public final IBinder X;

    public a(IBinder iBinder) {
        this.X = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.X;
    }
}
