package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookSdk;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: com.facebook.login.KatanaProxyLoginMethodHandler$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<KatanaProxyLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        public final KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final KatanaProxyLoginMethodHandler[] newArray(int i2) {
            return new KatanaProxyLoginMethodHandler[i2];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final String j() {
        return "katana_proxy_auth";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int r(LoginClient.Request request) {
        ArrayList arrayList;
        boolean z2 = FacebookSdk.f15922n && CustomTabUtils.a() != null && request.X.f0;
        String e2e = LoginClient.g();
        this.f16503Y.Z.getActivity();
        String applicationId = request.e0;
        Set permissions = request.f16476Y;
        boolean zA = request.a();
        DefaultAudience defaultAudience = request.Z;
        String clientState = g(request.f0);
        String authType = request.i0;
        String str = request.k0;
        boolean z3 = request.l0;
        boolean z4 = request.n0;
        boolean z5 = request.o0;
        String str2 = request.p0;
        ArrayList arrayList2 = NativeProtocol.f16360a;
        if (CrashShieldHandler.b(NativeProtocol.class)) {
            arrayList = null;
        } else {
            try {
                Intrinsics.f(applicationId, "applicationId");
                Intrinsics.f(permissions, "permissions");
                Intrinsics.f(e2e, "e2e");
                Intrinsics.f(defaultAudience, "defaultAudience");
                Intrinsics.f(clientState, "clientState");
                Intrinsics.f(authType, "authType");
                ArrayList arrayList3 = NativeProtocol.f16360a;
                arrayList = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    boolean z6 = z4;
                    boolean z7 = z3;
                    boolean z8 = z5;
                    String str3 = str;
                    Intent intentF = NativeProtocol.f16363e.f((NativeProtocol.NativeAppInfo) it.next(), applicationId, permissions, e2e, zA, defaultAudience, clientState, authType, z2, str3, z7, LoginTargetApp.FACEBOOK, z6, z8, str2);
                    if (intentF != null) {
                        arrayList.add(intentF);
                    }
                    str = str3;
                    z3 = z7;
                    z4 = z6;
                    z5 = z8;
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(NativeProtocol.class, th);
                arrayList = null;
            }
        }
        a("e2e", e2e);
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (u(CallbackManagerImpl.RequestCodeOffset.Login.d(), (Intent) arrayList.get(i2))) {
                    return i2 + 1;
                }
            }
        }
        return 0;
    }
}
