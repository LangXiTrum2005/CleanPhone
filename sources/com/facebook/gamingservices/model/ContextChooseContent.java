package com.facebook.gamingservices.model;

import android.os.Parcel;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

/* JADX INFO: loaded from: classes3.dex */
public class ContextChooseContent implements ShareModel {

    public static class Builder implements ShareModelBuilder<ContextChooseContent, Builder> {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(null);
        throw null;
    }
}
