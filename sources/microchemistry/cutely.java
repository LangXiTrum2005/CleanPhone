package microchemistry;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p002kotlin.Metadata;
import p002kotlin.collections.kattegat;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FloatMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", NotificationCompat.CATEGORY_PROGRESS, "progressFrom", "progressTo", "", "saneness", "(FFF)Z", "Landroidx/collection/impromptu;", "xValues", "yValues", "x", "attabal", "(Landroidx/collection/impromptu;Landroidx/collection/impromptu;F)F", TtmlNode.TAG_P, "", "dern", "(Landroidx/collection/impromptu;)V", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class cutely {
    public static final float attabal(androidx.collection.impromptu xValues, androidx.collection.impromptu yValues, float f) {
        Intrinsics.checkNotNullParameter(xValues, "xValues");
        Intrinsics.checkNotNullParameter(yValues, "yValues");
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > f || f > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f).toString());
        }
        Iterator<Integer> it = p002kotlin.ranges.wireman.monoploid(0, xValues._size).iterator();
        while (it.hasNext()) {
            int iNextInt = ((kattegat) it).nextInt();
            int i = iNextInt + 1;
            if (saneness(f, xValues.saneness(iNextInt), xValues.saneness(i % xValues.get_size()))) {
                int i2 = i % xValues.get_size();
                float fCutely = preprohormone.cutely(xValues.saneness(i2) - xValues.saneness(iNextInt), 1.0f);
                return preprohormone.cutely(yValues.saneness(iNextInt) + (preprohormone.cutely(yValues.saneness(i2) - yValues.saneness(iNextInt), 1.0f) * (fCutely < 0.001f ? 0.5f : preprohormone.cutely(f - xValues.saneness(iNextInt), 1.0f) / fCutely)), 1.0f);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final void dern(androidx.collection.impromptu p) {
        int i;
        Intrinsics.checkNotNullParameter(p, "p");
        Boolean boolValueOf = Boolean.TRUE;
        float[] fArr = p.content;
        int i2 = p._size;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= i2) {
                break;
            }
            float f = fArr[i3];
            if (!boolValueOf.booleanValue() || UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > f || f > 1.0f) {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
            i3++;
        }
        if (!boolValueOf.booleanValue()) {
            throw new IllegalArgumentException(("FloatMapping - Progress outside of range: " + androidx.collection.impromptu.marial(p, null, null, null, 0, null, 31, null)).toString());
        }
        Iterable iterableMonoploid = p002kotlin.ranges.wireman.monoploid(1, p.get_size());
        if ((iterableMonoploid instanceof Collection) && ((Collection) iterableMonoploid).isEmpty()) {
            i = 0;
        } else {
            Iterator it = iterableMonoploid.iterator();
            i = 0;
            while (it.hasNext()) {
                int iNextInt = ((kattegat) it).nextInt();
                if (p.saneness(iNextInt) < p.saneness(iNextInt - 1) && (i = i + 1) < 0) {
                    p002kotlin.collections.adultoid.adultoid();
                }
            }
        }
        if (i <= 1) {
            return;
        }
        throw new IllegalArgumentException(("FloatMapping - Progress wraps more than once: " + androidx.collection.impromptu.marial(p, null, null, null, 0, null, 31, null)).toString());
    }

    public static final boolean saneness(float f, float f2, float f3) {
        if (f3 >= f2) {
            return f2 <= f && f <= f3;
        }
        return f >= f2 || f <= f3;
    }
}
