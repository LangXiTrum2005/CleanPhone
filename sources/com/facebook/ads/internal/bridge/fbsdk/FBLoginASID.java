package com.facebook.ads.internal.bridge.fbsdk;

import com.facebook.AccessToken;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class FBLoginASID {
    public static String getFBLoginASID() {
        try {
            Date date = AccessToken.m0;
            Object objInvoke = AccessToken.class.getDeclaredMethod("getCurrentAccessToken", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke != null) {
                return (String) AccessToken.class.getDeclaredMethod("getUserId", new Class[0]).invoke(objInvoke, new Object[0]);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
