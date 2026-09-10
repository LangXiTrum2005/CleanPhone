package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n02 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f17607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f17608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17609d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n02(Object obj, Handler handler, ContentResolver contentResolver, Uri uri, int i10) {
        super(handler);
        this.f17606a = i10;
        this.f17609d = obj;
        this.f17607b = contentResolver;
        this.f17608c = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        switch (this.f17606a) {
            case 0:
                ((zw) this.f17609d).l();
                break;
            default:
                ln0 ln0Var = (ln0) this.f17609d;
                ln0Var.e(r1.b.c((Context) ln0Var.f17071b, (i1.e) ln0Var.f17079j, (AudioDeviceInfo) ln0Var.f17078i));
                break;
        }
    }
}
