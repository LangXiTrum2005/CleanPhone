package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes6.dex */
public abstract class u6 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f41533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f41534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f41535c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f41536e;

    public u6() {
        this.f41535c = Float.MAX_VALUE;
        this.d = -3.4028235E38f;
        this.f41536e = 0L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.f41533a);
        parcel.writeFloat(this.f41534b);
        parcel.writeFloat(this.f41535c);
        parcel.writeFloat(this.d);
    }

    public u6(Parcel parcel) {
        this.f41535c = Float.MAX_VALUE;
        this.d = -3.4028235E38f;
        this.f41536e = 0L;
        this.f41533a = parcel.readFloat();
        this.f41534b = parcel.readFloat();
        this.f41535c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.f41536e = AnimationUtils.currentAnimationTimeMillis();
    }
}
