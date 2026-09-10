package com.google.android.gms.internal.ads;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o02 implements Function {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ o02 f18074b = new o02(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ o02 f18075c = new o02(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18076a;

    public /* synthetic */ o02(int i10) {
        this.f18076a = i10;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f18076a) {
            case 0:
                break;
        }
        return new Integer(Integer.bitCount(((Integer) obj).intValue()));
    }
}
