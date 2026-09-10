package androidx.compose.ui.text;

import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AnnotatedString.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u0003\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u000f\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/ui/text/attabal$saneness;", "ranges", "", "start", TtmlNode.END, "dern", "(Ljava/util/List;II)Ljava/util/List;", "baseStart", "baseEnd", "targetStart", "targetEnd", "", "saneness", "(IIII)Z", "lStart", "lEnd", "rStart", "rEnd", "wireman", "Landroidx/compose/ui/text/attabal;", "attabal", "Landroidx/compose/ui/text/attabal;", "EmptyAnnotatedString", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f7913attabal = new attabal("", null, null, 6, null);

    public static final <T> List<attabal.Range<T>> dern(List<? extends attabal.Range<? extends T>> list, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            attabal.Range<? extends T> sanenessVar = list.get(i3);
            attabal.Range<? extends T> sanenessVar2 = sanenessVar;
            if (wireman(i, i2, sanenessVar2.getStart(), sanenessVar2.wireman())) {
                arrayList.add(sanenessVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            attabal.Range sanenessVar3 = (attabal.Range) arrayList.get(i4);
            arrayList2.add(new attabal.Range(sanenessVar3.marial(), Math.max(i, sanenessVar3.getStart()) - i, Math.min(i2, sanenessVar3.wireman()) - i, sanenessVar3.getTag()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final boolean saneness(int i, int i2, int i3, int i4) {
        if (i <= i3 && i4 <= i2) {
            if (i2 == i4) {
                if ((i3 == i4) == (i == i2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean wireman(int i, int i2, int i3, int i4) {
        return Math.max(i, i3) < Math.min(i2, i4) || saneness(i, i2, i3, i4) || saneness(i3, i4, i, i2);
    }
}
