package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/facebook/AuthenticationToken$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationToken;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AuthenticationToken$Companion$CREATOR$1 implements Parcelable.Creator<AuthenticationToken> {
    @Override // android.os.Parcelable.Creator
    public final AuthenticationToken createFromParcel(Parcel source) {
        Intrinsics.f(source, "source");
        return new AuthenticationToken(source);
    }

    @Override // android.os.Parcelable.Creator
    public final AuthenticationToken[] newArray(int i2) {
        return new AuthenticationToken[i2];
    }
}
