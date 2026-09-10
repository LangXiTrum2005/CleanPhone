package com.smartdigimkt.g4;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h implements com.smartdigimkt.e4.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35432a;

    public h(String str) {
        this.f35432a = (String) com.smartdigimkt.p4.a.a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f35432a;
    }
}
