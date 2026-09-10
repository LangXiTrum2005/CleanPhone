package kotlin;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\b\u0087@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u0004\u0005\u0088\u0001\u0006\u0092\u0001\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Result;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "Failure", "value", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
public final class Result<T> implements Serializable {
    public final Object X;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/Result$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Failure implements Serializable {
        public final Throwable X;

        public Failure(Throwable exception) {
            Intrinsics.f(exception, "exception");
            this.X = exception;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Failure) {
                return Intrinsics.a(this.X, ((Failure) obj).X);
            }
            return false;
        }

        public final int hashCode() {
            return this.X.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.X + ')';
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).X;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Result) {
            return Intrinsics.a(this.X, ((Result) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.X;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.X;
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
