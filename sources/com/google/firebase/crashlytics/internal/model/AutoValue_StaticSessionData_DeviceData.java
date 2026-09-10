package com.google.firebase.crashlytics.internal.model;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_StaticSessionData_DeviceData extends StaticSessionData.DeviceData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20710c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20711e;
    public final int f;

    public AutoValue_StaticSessionData_DeviceData(int i2, int i3, long j, long j2, boolean z2, int i4) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f20708a = i2;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f20709b = i3;
        this.f20710c = j;
        this.d = j2;
        this.f20711e = z2;
        this.f = i4;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final int a() {
        return this.f20708a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final int b() {
        return this.f20709b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final long d() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final boolean e() {
        return this.f20711e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.DeviceData)) {
            return false;
        }
        StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
        return this.f20708a == deviceData.a() && Build.MODEL.equals(deviceData.g()) && this.f20709b == deviceData.b() && this.f20710c == deviceData.j() && this.d == deviceData.d() && this.f20711e == deviceData.e() && this.f == deviceData.i() && Build.MANUFACTURER.equals(deviceData.f()) && Build.PRODUCT.equals(deviceData.h());
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final String f() {
        return Build.MANUFACTURER;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final String g() {
        return Build.MODEL;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final String h() {
        return Build.PRODUCT;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f20708a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f20709b) * 1000003;
        long j = this.f20710c;
        int i2 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.d;
        return Build.PRODUCT.hashCode() ^ ((((((((i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f20711e ? 1231 : 1237)) * 1000003) ^ this.f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003);
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final int i() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final long j() {
        return this.f20710c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f20708a);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.f20709b);
        sb.append(", totalRam=");
        sb.append(this.f20710c);
        sb.append(", diskSpace=");
        sb.append(this.d);
        sb.append(", isEmulator=");
        sb.append(this.f20711e);
        sb.append(", state=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return android.support.v4.media.a.r(sb, Build.PRODUCT, "}");
    }
}
