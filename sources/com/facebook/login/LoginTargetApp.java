package com.facebook.login;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/login/LoginTargetApp;", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public enum LoginTargetApp {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");

    public final String X;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/LoginTargetApp$Companion;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    LoginTargetApp(String str) {
        this.X = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.X;
    }
}
