package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/ironsource/ps;", "", "", "a", "", "b", "errorCode", "errorMessage", "toString", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "I", "c", "()I", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ps {
    public static final int d = 2070;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f26516e = 2080;
    public static final int f = 2090;
    public static final int g = 2100;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f26517h = 2110;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int errorCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String errorMessage;

    public ps(int i2, String errorMessage) {
        Intrinsics.f(errorMessage, "errorMessage");
        this.errorCode = i2;
        this.errorMessage = errorMessage;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final int c() {
        return this.errorCode;
    }

    public final String d() {
        return this.errorMessage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ps)) {
            return false;
        }
        ps psVar = (ps) other;
        return this.errorCode == psVar.errorCode && Intrinsics.a(this.errorMessage, psVar.errorMessage);
    }

    public int hashCode() {
        return this.errorMessage.hashCode() + (Integer.hashCode(this.errorCode) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SdkError(errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorMessage=");
        return a.p(sb, this.errorMessage, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ps(IronSourceError error) {
        Intrinsics.f(error, "error");
        int errorCode = error.getErrorCode();
        String errorMessage = error.getErrorMessage();
        Intrinsics.e(errorMessage, "error.errorMessage");
        this(errorCode, errorMessage);
    }

    public final ps a(int errorCode, String errorMessage) {
        Intrinsics.f(errorMessage, "errorMessage");
        return new ps(errorCode, errorMessage);
    }

    public static /* synthetic */ ps a(ps psVar, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = psVar.errorCode;
        }
        if ((i3 & 2) != 0) {
            str = psVar.errorMessage;
        }
        return psVar.a(i2, str);
    }
}
