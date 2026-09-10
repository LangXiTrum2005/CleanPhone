package androidx.webkit;

import android.support.v4.media.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class WebMessageCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8564b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public WebMessageCompat(String str, WebMessagePortCompat[] webMessagePortCompatArr) {
        this.f8563a = str;
        this.f8564b = 0;
    }

    public final String a() {
        String str;
        int i2 = this.f8564b;
        if (i2 == 0) {
            return this.f8563a;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        if (i2 != 0) {
            str = i2 != 1 ? "Unknown" : "ArrayBuffer";
        } else {
            str = "String";
        }
        throw new IllegalStateException(a.s(sb, str, " expected, but got ", "String"));
    }

    public WebMessageCompat(byte[] bArr, WebMessagePortCompat[] webMessagePortCompatArr) {
        Objects.requireNonNull(bArr);
        this.f8563a = null;
        this.f8564b = 1;
    }
}
