package androidx.core.text.util;

import android.text.Spannable;
import android.text.util.Linkify;
import android.widget.TextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class LinkifyCompat {

    public static class Api24Impl {
        public static void a(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        public static boolean b(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    public static class LinkSpec {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LinkifyMask {
    }
}
