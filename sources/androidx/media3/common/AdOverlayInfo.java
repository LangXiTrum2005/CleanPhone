package androidx.media3.common;

import android.view.View;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public final class AdOverlayInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f5366a;

    public static final class Builder {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Purpose {
    }

    public AdOverlayInfo(View view) {
        this.f5366a = view;
    }
}
