package androidx.compose.ui.text;

import clubfoot.ParagraphStyle;
import clubfoot.SpanStyle;
import clubfoot.UrlAnnotation;
import clubfoot.taiyuan;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnnotatedString.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0007\u0018\u0000 >2\u00020\u0001:\u0002\u00149B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rB=\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004¢\u0006\u0004\b\f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00050\u00042\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J+\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00050\u00042\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0007¢\u0006\u0004\b$\u0010\"J)\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00050\u00042\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b&\u0010\"J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010.R(\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R(\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R*\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048F¢\u0006\u0006\u001a\u0004\b:\u00105R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00048F¢\u0006\u0006\u001a\u0004\b;\u00105R\u0014\u0010=\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"Landroidx/compose/ui/text/attabal;", "", "", "text", "", "Landroidx/compose/ui/text/attabal$saneness;", "Lclubfoot/marial;", "spanStylesOrNull", "Lclubfoot/saneness;", "paragraphStylesOrNull", "", "annotations", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "spanStyles", "paragraphStyles", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "index", "", "attabal", "(I)C", "startIndex", "endIndex", "apical", "(II)Landroidx/compose/ui/text/attabal;", "Landroidx/compose/ui/text/competently;", "range", "formularize", "(J)Landroidx/compose/ui/text/attabal;", "start", TtmlNode.END, "Lclubfoot/taiyuan;", "taiyuan", "(II)Ljava/util/List;", "Lclubfoot/cutely;", "cutely", "Landroidx/compose/ui/text/dern;", "wireman", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "kowloon", "Ljava/lang/String;", "impromptu", "arytenoidectomy", "Ljava/util/List;", "competently", "()Ljava/util/List;", "monoploid", "getParagraphStylesOrNull$ui_text_release", "polloi", "saneness", "beachfront", "marial", "dern", "length", "molybdenite", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal implements CharSequence {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final List<Range<SpanStyle>> spanStylesOrNull;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final String text;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final List<Range<ParagraphStyle>> paragraphStylesOrNull;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final List<Range<? extends Object>> annotations;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final stratoscope.beachfront<attabal, ?> f7694graveside = SaversKt.impromptu();

    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "kotlin.jvm.PlatformType", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class dern<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return frenchy.saneness.wireman(Integer.valueOf(((Range) t).getStart()), Integer.valueOf(((Range) t2).getStart()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public attabal(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2, List<? extends Range<? extends Object>> list3) {
        List list4;
        this.text = str;
        this.spanStylesOrNull = list;
        this.paragraphStylesOrNull = list2;
        this.annotations = list3;
        if (list2 == null || (list4 = CollectionsKt.setterwort(list2, new dern())) == null) {
            return;
        }
        int size = list4.size();
        int iWireman = -1;
        for (int i = 0; i < size; i++) {
            Range range = (Range) list4.get(i);
            if (range.getStart() < iWireman) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            if (range.wireman() > this.text.length()) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + range.getStart() + ", " + range.wireman() + ") is out of boundary").toString());
            }
            iWireman = range.wireman();
        }
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
    public attabal subSequence(int startIndex, int endIndex) {
        if (startIndex <= endIndex) {
            if (startIndex == 0 && endIndex == this.text.length()) {
                return this;
            }
            String strSubstring = this.text.substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new attabal(strSubstring, saneness.dern(this.spanStylesOrNull, startIndex, endIndex), saneness.dern(this.paragraphStylesOrNull, startIndex, endIndex), saneness.dern(this.annotations, startIndex, endIndex));
        }
        throw new IllegalArgumentException(("start (" + startIndex + ") should be less or equal to end (" + endIndex + ')').toString());
    }

    public char attabal(int index) {
        return this.text.charAt(index);
    }

    public final List<Range<SpanStyle>> beachfront() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? adultoid.formularize() : list;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return attabal(i);
    }

    public final List<Range<SpanStyle>> competently() {
        return this.spanStylesOrNull;
    }

    @patroclinal.wireman
    public final List<Range<UrlAnnotation>> cutely(int start, int end) {
        List listFormularize;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listFormularize = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Object> range = list.get(i);
                Range<? extends Object> range2 = range;
                if ((range2.marial() instanceof UrlAnnotation) && saneness.wireman(start, end, range2.getStart(), range2.wireman())) {
                    listFormularize.add(range);
                }
            }
        } else {
            listFormularize = adultoid.formularize();
        }
        Intrinsics.competently(listFormularize, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listFormularize;
    }

    public int dern() {
        return this.text.length();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof attabal)) {
            return false;
        }
        attabal attabalVar = (attabal) other;
        return Intrinsics.wireman(this.text, attabalVar.text) && Intrinsics.wireman(this.spanStylesOrNull, attabalVar.spanStylesOrNull) && Intrinsics.wireman(this.paragraphStylesOrNull, attabalVar.paragraphStylesOrNull) && Intrinsics.wireman(this.annotations, attabalVar.annotations);
    }

    public final attabal formularize(long range) {
        return subSequence(competently.taiyuan(range), competently.impromptu(range));
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<Range<ParagraphStyle>> list2 = this.paragraphStylesOrNull;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Range<? extends Object>> list3 = this.annotations;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return dern();
    }

    public final List<Range<ParagraphStyle>> marial() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? adultoid.formularize() : list;
    }

    public final List<Range<? extends Object>> saneness() {
        return this.annotations;
    }

    public final List<Range<taiyuan>> taiyuan(int start, int end) {
        List listFormularize;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listFormularize = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Object> range = list.get(i);
                Range<? extends Object> range2 = range;
                if ((range2.marial() instanceof taiyuan) && saneness.wireman(start, end, range2.getStart(), range2.wireman())) {
                    listFormularize.add(range);
                }
            }
        } else {
            listFormularize = adultoid.formularize();
        }
        Intrinsics.competently(listFormularize, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listFormularize;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    public final List<Range<androidx.compose.ui.text.dern>> wireman(int start, int end) {
        List listFormularize;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listFormularize = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Object> range = list.get(i);
                Range<? extends Object> range2 = range;
                if ((range2.marial() instanceof androidx.compose.ui.text.dern) && saneness.wireman(start, end, range2.getStart(), range2.wireman())) {
                    listFormularize.add(range);
                }
            }
        } else {
            listFormularize = adultoid.formularize();
        }
        Intrinsics.competently(listFormularize, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listFormularize;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.attabal$saneness, reason: from toString */
    /* JADX INFO: compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/attabal$saneness;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "item", "", "start", TtmlNode.END, "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "attabal", "()Ljava/lang/Object;", "saneness", "()I", "dern", "toString", "()Ljava/lang/String;", "hashCode", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "marial", "I", "beachfront", "wireman", "Ljava/lang/String;", "competently", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Range<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
        public final T item;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
        public final int end;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
        public final int start;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
        public final String tag;

        public Range(T t, int i, int i2, String str) {
            this.item = t;
            this.start = i;
            this.end = i2;
            this.tag = str;
            if (i > i2) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public final T attabal() {
            return this.item;
        }

        /* JADX INFO: renamed from: beachfront, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: competently, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return Intrinsics.wireman(this.item, range.item) && this.start == range.start && this.end == range.end && Intrinsics.wireman(this.tag, range.tag);
        }

        public int hashCode() {
            T t = this.item;
            return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        public final T marial() {
            return this.item;
        }

        public final int saneness() {
            return this.start;
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public final int wireman() {
            return this.end;
        }

        public Range(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    public /* synthetic */ attabal(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? adultoid.formularize() : list, (i & 4) != 0 ? adultoid.formularize() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public attabal(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2) {
        List<Range<SpanStyle>> list3 = list;
        List<Range<ParagraphStyle>> list4 = list2;
        this(str, list3.isEmpty() ? null : list3, list4.isEmpty() ? null : list4, null);
    }
}
