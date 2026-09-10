package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.ads.dm0;
import java.io.InputStream;
import java.util.HashMap;
import n6.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f10525c = new h(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10527b;

    public i() {
        this.f10526a = 0;
        this.f10527b = new HashMap();
    }

    @Override // com.bumptech.glide.load.data.g
    public Object a() {
        switch (this.f10526a) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f10527b).rewind();
            case 2:
                return this.f10527b;
            default:
                v vVar = (v) this.f10527b;
                vVar.reset();
                return vVar;
        }
    }

    @Override // com.bumptech.glide.load.data.g
    public void b() {
        switch (this.f10526a) {
            case 1:
            case 2:
                break;
            default:
                ((v) this.f10527b).d();
                break;
        }
    }

    public ParcelFileDescriptor e() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f10527b).rewind();
    }

    public i(InputStream inputStream, dm0 dm0Var) {
        this.f10526a = 3;
        v vVar = new v(inputStream, dm0Var);
        this.f10527b = vVar;
        vVar.mark(5242880);
    }

    public i(ParcelFileDescriptor parcelFileDescriptor) {
        this.f10526a = 1;
        this.f10527b = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public i(Object obj) {
        this.f10526a = 2;
        this.f10527b = obj;
    }

    private final void c() {
    }

    private final void d() {
    }
}
