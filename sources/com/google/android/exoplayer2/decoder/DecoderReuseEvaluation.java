package com.google.android.exoplayer2.decoder;

import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public final class DecoderReuseEvaluation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f17436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Format f17437c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17438e;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderDiscardReasons {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderReuseResult {
    }

    public DecoderReuseEvaluation(String str, Format format, Format format2, int i2, int i3) {
        Assertions.b(i2 == 0 || i3 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f17435a = str;
        format.getClass();
        this.f17436b = format;
        format2.getClass();
        this.f17437c = format2;
        this.d = i2;
        this.f17438e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DecoderReuseEvaluation.class == obj.getClass()) {
            DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) obj;
            if (this.d == decoderReuseEvaluation.d && this.f17438e == decoderReuseEvaluation.f17438e && this.f17435a.equals(decoderReuseEvaluation.f17435a) && this.f17436b.equals(decoderReuseEvaluation.f17436b) && this.f17437c.equals(decoderReuseEvaluation.f17437c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17437c.hashCode() + ((this.f17436b.hashCode() + a.b(this.f17435a, (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.d) * 31) + this.f17438e) * 31, 31)) * 31);
    }
}
