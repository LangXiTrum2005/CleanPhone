package cultivated;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import clubfoot.UrlAnnotation;
import java.util.WeakHashMap;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: URLSpanCache.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R&\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R&\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0004\u0012\u00020\u00170\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcultivated/taiyuan;", "", "<init>", "()V", "Lclubfoot/cutely;", "urlAnnotation", "Landroid/text/style/URLSpan;", "dern", "(Lclubfoot/cutely;)Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/attabal$saneness;", "Landroidx/compose/ui/text/dern$saneness;", "urlRange", "saneness", "(Landroidx/compose/ui/text/attabal$saneness;)Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/dern;", "linkRange", "Landroid/text/style/ClickableSpan;", "attabal", "(Landroidx/compose/ui/text/attabal$saneness;)Landroid/text/style/ClickableSpan;", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "spansByAnnotation", "urlSpansByAnnotation", "Lcultivated/marial;", "linkSpansWithListenerByAnnotation", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final WeakHashMap<UrlAnnotation, URLSpan> spansByAnnotation = new WeakHashMap<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final WeakHashMap<androidx.compose.ui.text.attabal.Range<androidx.compose.ui.text.dern.saneness>, URLSpan> urlSpansByAnnotation = new WeakHashMap<>();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final WeakHashMap<androidx.compose.ui.text.attabal.Range<androidx.compose.ui.text.dern>, marial> linkSpansWithListenerByAnnotation = new WeakHashMap<>();

    public final ClickableSpan attabal(androidx.compose.ui.text.attabal.Range<androidx.compose.ui.text.dern> linkRange) {
        WeakHashMap<androidx.compose.ui.text.attabal.Range<androidx.compose.ui.text.dern>, marial> weakHashMap = this.linkSpansWithListenerByAnnotation;
        marial marialVar = weakHashMap.get(linkRange);
        if (marialVar == null) {
            marialVar = new marial(linkRange.marial());
            weakHashMap.put(linkRange, marialVar);
        }
        return marialVar;
    }

    public final URLSpan dern(UrlAnnotation urlAnnotation) {
        WeakHashMap<UrlAnnotation, URLSpan> weakHashMap = this.spansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(urlAnnotation);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(urlAnnotation.getUrl());
            weakHashMap.put(urlAnnotation, uRLSpan);
        }
        return uRLSpan;
    }

    public final URLSpan saneness(androidx.compose.ui.text.attabal.Range<androidx.compose.ui.text.dern.saneness> urlRange) {
        WeakHashMap<androidx.compose.ui.text.attabal.Range<androidx.compose.ui.text.dern.saneness>, URLSpan> weakHashMap = this.urlSpansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(urlRange);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(urlRange.marial().getUrl());
            weakHashMap.put(urlRange, uRLSpan);
        }
        return uRLSpan;
    }
}
