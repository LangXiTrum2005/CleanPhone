package com.smartdigimkt.h4;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements com.smartdigimkt.e4.a.b {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
