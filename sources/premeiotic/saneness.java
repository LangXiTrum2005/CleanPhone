package premeiotic;

import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import milliradian.dovishness;
import milliradian.graveside;
import milliradian.wireman;
import p002kotlin.Metadata;
import permissivist.LocaleList;
import restrictive.dent;

/* JADX INFO: compiled from: SpannableExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a6\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a.\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroid/text/Spannable;", "", TtmlNode.TAG_SPAN, "", "start", TtmlNode.END, "", "marial", "(Landroid/text/Spannable;Ljava/lang/Object;II)V", "Lrestrictive/overspeculate;", "color", "attabal", "(Landroid/text/Spannable;JII)V", "Lpermissivist/marial;", "localeList", "wireman", "(Landroid/text/Spannable;Lpermissivist/marial;II)V", "Lmilliradian/graveside;", TtmlNode.ATTR_TTS_FONT_SIZE, "Lmilliradian/wireman;", "density", "dern", "(Landroid/text/Spannable;JLmilliradian/wireman;II)V", "saneness", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class saneness {
    public static final void attabal(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            marial(spannable, new BackgroundColorSpan(dent.wireman(j)), i, i2);
        }
    }

    public static final void dern(Spannable spannable, long j, wireman wiremanVar, int i, int i2) {
        long jCompetently = graveside.competently(j);
        dovishness.Companion companion = dovishness.INSTANCE;
        if (dovishness.competently(jCompetently, companion.saneness())) {
            marial(spannable, new AbsoluteSizeSpan(pastie.dern.wireman(wiremanVar.graveside(j)), false), i, i2);
        } else if (dovishness.competently(jCompetently, companion.attabal())) {
            marial(spannable, new RelativeSizeSpan(graveside.impromptu(j)), i, i2);
        }
    }

    public static final void marial(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }

    public static final void saneness(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            marial(spannable, new ForegroundColorSpan(dent.wireman(j)), i, i2);
        }
    }

    public static final void wireman(Spannable spannable, LocaleList localeList, int i, int i2) {
        if (localeList != null) {
            marial(spannable, attabal.f35643attabal.attabal(localeList), i, i2);
        }
    }
}
