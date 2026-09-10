package androidx.media3.ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class SpannedToHtmlConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f7722a = Pattern.compile("(&#13;)?&#10;");

    public static class HtmlAndCss {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f7724b;

        public HtmlAndCss(String str, Map map) {
            this.f7723a = str;
            this.f7724b = map;
        }
    }

    public static final class SpanInfo {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final l f7725e;
        public static final l f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7728c;
        public final String d;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.ui.l] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.ui.l] */
        static {
            final int i2 = 0;
            f7725e = new Comparator() { // from class: androidx.media3.ui.l
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    SpannedToHtmlConverter.SpanInfo spanInfo = (SpannedToHtmlConverter.SpanInfo) obj;
                    SpannedToHtmlConverter.SpanInfo spanInfo2 = (SpannedToHtmlConverter.SpanInfo) obj2;
                    switch (i2) {
                        case 0:
                            int iCompare = Integer.compare(spanInfo2.f7727b, spanInfo.f7727b);
                            if (iCompare != 0) {
                                return iCompare;
                            }
                            int iCompareTo = spanInfo.f7728c.compareTo(spanInfo2.f7728c);
                            return iCompareTo != 0 ? iCompareTo : spanInfo.d.compareTo(spanInfo2.d);
                        default:
                            int iCompare2 = Integer.compare(spanInfo2.f7726a, spanInfo.f7726a);
                            if (iCompare2 != 0) {
                                return iCompare2;
                            }
                            int iCompareTo2 = spanInfo2.f7728c.compareTo(spanInfo.f7728c);
                            return iCompareTo2 != 0 ? iCompareTo2 : spanInfo2.d.compareTo(spanInfo.d);
                    }
                }
            };
            final int i3 = 1;
            f = new Comparator() { // from class: androidx.media3.ui.l
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    SpannedToHtmlConverter.SpanInfo spanInfo = (SpannedToHtmlConverter.SpanInfo) obj;
                    SpannedToHtmlConverter.SpanInfo spanInfo2 = (SpannedToHtmlConverter.SpanInfo) obj2;
                    switch (i3) {
                        case 0:
                            int iCompare = Integer.compare(spanInfo2.f7727b, spanInfo.f7727b);
                            if (iCompare != 0) {
                                return iCompare;
                            }
                            int iCompareTo = spanInfo.f7728c.compareTo(spanInfo2.f7728c);
                            return iCompareTo != 0 ? iCompareTo : spanInfo.d.compareTo(spanInfo2.d);
                        default:
                            int iCompare2 = Integer.compare(spanInfo2.f7726a, spanInfo.f7726a);
                            if (iCompare2 != 0) {
                                return iCompare2;
                            }
                            int iCompareTo2 = spanInfo2.f7728c.compareTo(spanInfo.f7728c);
                            return iCompareTo2 != 0 ? iCompareTo2 : spanInfo2.d.compareTo(spanInfo.d);
                    }
                }
            };
        }

        public SpanInfo(int i2, int i3, String str, String str2) {
            this.f7726a = i2;
            this.f7727b = i3;
            this.f7728c = str;
            this.d = str2;
        }
    }

    public static final class Transition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f7729a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f7730b = new ArrayList();
    }

    public static String a(CharSequence charSequence) {
        return f7722a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
