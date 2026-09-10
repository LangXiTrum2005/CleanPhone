package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.NativeProtocol;

/* JADX INFO: loaded from: classes3.dex */
class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<FacebookLiteLoginMethodHandler> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: com.facebook.login.FacebookLiteLoginMethodHandler$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<FacebookLiteLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        public final FacebookLiteLoginMethodHandler createFromParcel(Parcel parcel) {
            return new FacebookLiteLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FacebookLiteLoginMethodHandler[] newArray(int i2) {
            return new FacebookLiteLoginMethodHandler[i2];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String j() {
        return "fb_lite_login";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int r(LoginClient.Request request) {
        String strG = LoginClient.g();
        Intent intentD = NativeProtocol.d(this.f16503Y.Z.getActivity(), request.e0, request.f16476Y, strG, request.a(), request.Z, g(request.f0), request.i0, request.k0, request.l0, request.n0, request.o0);
        a("e2e", strG);
        return u(CallbackManagerImpl.RequestCodeOffset.Login.d(), intentD) ? 1 : 0;
    }
}
