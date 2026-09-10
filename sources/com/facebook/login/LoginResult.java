package com.facebook.login;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/LoginResult;", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LoginResult {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResult)) {
            return false;
        }
        ((LoginResult) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "LoginResult(accessToken=" + ((Object) null) + ", authenticationToken=" + ((Object) null) + ", recentlyGrantedPermissions=" + ((Object) null) + ", recentlyDeniedPermissions=" + ((Object) null) + ")";
    }
}
