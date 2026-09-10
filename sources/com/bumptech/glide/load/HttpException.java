package com.bumptech.glide.load;

import androidx.datastore.preferences.protobuf.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class HttpException extends IOException {
    private static final long serialVersionUID = 1;

    public HttpException(int i2, IOException iOException, String str) {
        super(a.m(str, ", status code: ", i2), iOException);
    }
}
