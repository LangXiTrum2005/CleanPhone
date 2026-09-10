package com.facebook;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/AccessTokenSource;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public enum AccessTokenSource {
    /* JADX INFO: Fake field, exist only in values array */
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    /* JADX INFO: Fake field, exist only in values array */
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    /* JADX INFO: Fake field, exist only in values array */
    TEST_USER(true),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);

    public final boolean X;

    @Metadata(k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AccessTokenSource.values().length];
            iArr[9] = 1;
            iArr[10] = 2;
            iArr[11] = 3;
        }
    }

    AccessTokenSource(boolean z2) {
        this.X = z2;
    }
}
