package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/FacebookDialogException;", "Lcom/facebook/FacebookException;", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookDialogException extends FacebookException {
    public static final long serialVersionUID = 1;
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f15911Y;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/FacebookDialogException$Companion;", "", "", "serialVersionUID", "J", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    public FacebookDialogException(String str, int i2, String str2) {
        super(str);
        this.X = i2;
        this.f15911Y = str2;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.X + ", message: " + getMessage() + ", url: " + this.f15911Y + "}";
        Intrinsics.e(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
