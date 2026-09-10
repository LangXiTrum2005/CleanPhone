package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class FormError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24534b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i10, @RecentlyNonNull String str) {
        this.f24533a = i10;
        this.f24534b = str;
    }

    public int getErrorCode() {
        return this.f24533a;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.f24534b;
    }
}
