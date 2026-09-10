package androidx.media3.exoplayer;

import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public final class DecoderReuseEvaluation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f5831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Format f5832c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5833e;

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
        this.f5830a = str;
        format.getClass();
        this.f5831b = format;
        format2.getClass();
        this.f5832c = format2;
        this.d = i2;
        this.f5833e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DecoderReuseEvaluation.class == obj.getClass()) {
            DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) obj;
            if (this.d == decoderReuseEvaluation.d && this.f5833e == decoderReuseEvaluation.f5833e && this.f5830a.equals(decoderReuseEvaluation.f5830a) && this.f5831b.equals(decoderReuseEvaluation.f5831b) && this.f5832c.equals(decoderReuseEvaluation.f5832c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5832c.hashCode() + ((this.f5831b.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.f5830a, (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.d) * 31) + this.f5833e) * 31, 31)) * 31);
    }
}
