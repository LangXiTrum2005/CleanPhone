package androidx.core.text;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
public final class HtmlCompat {

    public static class Api24Impl {
        public static Spanned a(String str, int i2) {
            return Html.fromHtml(str, i2);
        }

        public static Spanned b(String str, int i2, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i2, imageGetter, tagHandler);
        }

        public static String c(Spanned spanned, int i2) {
            return Html.toHtml(spanned, i2);
        }
    }
}
