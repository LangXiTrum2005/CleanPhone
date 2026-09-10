package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookGraphResponseException extends FacebookException {
    public final GraphResponse X;

    public FacebookGraphResponseException(GraphResponse graphResponse, String str) {
        super(str);
        this.X = graphResponse;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        GraphResponse graphResponse = this.X;
        FacebookRequestError facebookRequestError = graphResponse != null ? graphResponse.d : null;
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestError != null) {
            sb.append("httpResponseCode: ");
            sb.append(facebookRequestError.Z);
            sb.append(", facebookErrorCode: ");
            sb.append(facebookRequestError.e0);
            sb.append(", facebookErrorType: ");
            sb.append(facebookRequestError.g0);
            sb.append(", message: ");
            sb.append(facebookRequestError.a());
            sb.append("}");
        }
        String string = sb.toString();
        Intrinsics.e(string, "errorStringBuilder.toString()");
        return string;
    }
}
