package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class VersionInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10668c;

    public VersionInfo(int i10, int i11, int i12) {
        this.f10666a = i10;
        this.f10667b = i11;
        this.f10668c = i12;
    }

    public int getMajorVersion() {
        return this.f10666a;
    }

    public int getMicroVersion() {
        return this.f10668c;
    }

    public int getMinorVersion() {
        return this.f10667b;
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        return this.f10666a + "." + this.f10667b + "." + this.f10668c;
    }
}
