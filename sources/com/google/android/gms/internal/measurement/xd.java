package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xd implements com.google.android.gms.common.api.internal.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f24145c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile oa.s1 f24146d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24148b;

    public /* synthetic */ xd(String str, int i10) {
        this.f24147a = i10;
        this.f24148b = str;
    }

    @Override // com.google.android.gms.common.api.internal.k
    public void accept(Object obj, Object obj2) {
        int i10 = this.f24147a;
        String str = this.f24148b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        db dbVar = (db) obj;
        switch (i10) {
            case 1:
                int i11 = bb.l;
                za zaVar = new za(taskCompletionSource);
                cb cbVar = (cb) dbVar.getService();
                Parcel parcelU1 = cbVar.u1();
                m6.c(parcelU1, zaVar);
                parcelU1.writeString(str);
                parcelU1.writeString("");
                parcelU1.writeString(null);
                cbVar.w1(parcelU1, 11);
                break;
            default:
                int i12 = bb.l;
                za zaVar2 = new za(taskCompletionSource);
                cb cbVar2 = (cb) dbVar.getService();
                Parcel parcelU2 = cbVar2.u1();
                m6.c(parcelU2, zaVar2);
                parcelU2.writeString(str);
                cbVar2.w1(parcelU2, 5);
                break;
        }
    }

    public xd(Context context, yd ydVar) {
        this.f24147a = 0;
        this.f24148b = ydVar.v() ? nb.b(context, ydVar.u()) : ydVar.u();
    }
}
