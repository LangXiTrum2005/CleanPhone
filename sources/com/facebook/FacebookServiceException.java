package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/FacebookServiceException;", "Lcom/facebook/FacebookException;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookServiceException extends FacebookException {
    private static final long serialVersionUID = 1;
    public final FacebookRequestError X;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/FacebookServiceException$Companion;", "", "", "serialVersionUID", "J", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(FacebookRequestError requestError, String str) {
        super(str);
        Intrinsics.f(requestError, "requestError");
        this.X = requestError;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        FacebookRequestError facebookRequestError = this.X;
        sb.append(facebookRequestError.Z);
        sb.append(", facebookErrorCode: ");
        sb.append(facebookRequestError.e0);
        sb.append(", facebookErrorType: ");
        sb.append(facebookRequestError.g0);
        sb.append(", message: ");
        sb.append(facebookRequestError.a());
        sb.append("}");
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }
}
