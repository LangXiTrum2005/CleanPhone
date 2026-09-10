package com.startapp.sdk.components;

import android.content.Context;
import com.startapp.sdk.internal.k7;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40750b;

    public /* synthetic */ d(Context context, int i2) {
        this.f40749a = i2;
        this.f40750b = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        switch (this.f40749a) {
            case 0:
                return a.b(this.f40750b);
            default:
                return a.d(this.f40750b);
        }
    }
}
