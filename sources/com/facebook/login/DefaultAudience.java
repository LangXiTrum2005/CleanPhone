package com.facebook.login;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/DefaultAudience;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public enum DefaultAudience {
    /* JADX INFO: Fake field, exist only in values array */
    NONE(null),
    /* JADX INFO: Fake field, exist only in values array */
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    /* JADX INFO: Fake field, exist only in values array */
    EVERYONE("everyone");

    public final String X;

    DefaultAudience(String str) {
        this.X = str;
    }
}
