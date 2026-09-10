package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public class PlaybackException extends Exception implements Bundleable {
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f17175Y;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    static {
        int i2 = Util.f18979a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public PlaybackException(int i2, long j, Throwable th, String str) {
        super(str, th);
        this.X = i2;
        this.f17175Y = j;
    }
}
