package cultivated;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.arytenoidectomy;
import androidx.compose.ui.text.font.gintrap;
import androidx.compose.ui.text.font.monoploid;
import clubfoot.SpanStyle;
import clubfoot.UrlAnnotation;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidAccessibilitySpannableString.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0010\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/attabal;", "Lmilliradian/wireman;", "density", "Landroidx/compose/ui/text/font/taiyuan$saneness;", "fontFamilyResolver", "Lcultivated/taiyuan;", "urlSpanCache", "Landroid/text/SpannableString;", "saneness", "(Landroidx/compose/ui/text/attabal;Lmilliradian/wireman;Landroidx/compose/ui/text/font/taiyuan$saneness;Lcultivated/taiyuan;)Landroid/text/SpannableString;", "Lclubfoot/marial;", "spanStyle", "", "start", TtmlNode.END, "", "attabal", "(Landroid/text/SpannableString;Lclubfoot/marial;IILmilliradian/wireman;Landroidx/compose/ui/text/font/taiyuan$saneness;)V", "Landroidx/compose/ui/text/attabal$saneness;", "Landroidx/compose/ui/text/dern;", "Landroidx/compose/ui/text/dern$saneness;", "dern", "(Landroidx/compose/ui/text/attabal$saneness;)Landroidx/compose/ui/text/attabal$saneness;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class attabal {
    public static final void attabal(SpannableString spannableString, SpanStyle spanStyle, int i, int i2, milliradian.wireman wiremanVar, androidx.compose.ui.text.font.taiyuan.saneness sanenessVar) {
        premeiotic.saneness.saneness(spannableString, spanStyle.competently(), i, i2);
        premeiotic.saneness.dern(spannableString, spanStyle.getFontSize(), wiremanVar, i, i2);
        if (spanStyle.getFontWeight() != null || spanStyle.getFontStyle() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.attabal();
            }
            arytenoidectomy fontStyle = spanStyle.getFontStyle();
            spannableString.setSpan(new StyleSpan(androidx.compose.ui.text.font.marial.dern(fontWeight, fontStyle != null ? fontStyle.getValue() : arytenoidectomy.INSTANCE.saneness())), i, i2, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof gintrap) {
                spannableString.setSpan(new TypefaceSpan(((gintrap) spanStyle.getFontFamily()).getName()), i, i2, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                androidx.compose.ui.text.font.taiyuan fontFamily = spanStyle.getFontFamily();
                monoploid fontSynthesis = spanStyle.getFontSynthesis();
                Object value = androidx.compose.ui.text.font.taiyuan.saneness.saneness(sanenessVar, fontFamily, null, 0, fontSynthesis != null ? fontSynthesis.getValue() : monoploid.INSTANCE.attabal(), 6, null).getValue();
                Intrinsics.competently(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(wireman.f24286attabal.attabal((Typeface) value), i, i2, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            timberyard.impromptu textDecoration = spanStyle.getTextDecoration();
            timberyard.impromptu.Companion companion = timberyard.impromptu.INSTANCE;
            if (textDecoration.dern(companion.saneness())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (spanStyle.getTextDecoration().dern(companion.attabal())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i, i2, 33);
        }
        premeiotic.saneness.wireman(spannableString, spanStyle.getLocaleList(), i, i2);
        premeiotic.saneness.attabal(spannableString, spanStyle.getBackground(), i, i2);
    }

    public static final androidx.compose.ui.text.attabal.Range<androidx.compose.ui.text.dern.saneness> dern(androidx.compose.ui.text.attabal.Range<androidx.compose.ui.text.dern> range) {
        androidx.compose.ui.text.dern dernVarMarial = range.marial();
        Intrinsics.competently(dernVarMarial, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new androidx.compose.ui.text.attabal.Range<>((androidx.compose.ui.text.dern.saneness) dernVarMarial, range.getStart(), range.wireman());
    }

    public static final SpannableString saneness(androidx.compose.ui.text.attabal attabalVar, milliradian.wireman wiremanVar, androidx.compose.ui.text.font.taiyuan.saneness sanenessVar, taiyuan taiyuanVar) {
        SpannableString spannableString = new SpannableString(attabalVar.getText());
        List<androidx.compose.ui.text.attabal.Range<SpanStyle>> listCompetently = attabalVar.competently();
        if (listCompetently != null) {
            int size = listCompetently.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.text.attabal.Range<SpanStyle> range = listCompetently.get(i);
                attabal(spannableString, SpanStyle.saneness(range.attabal(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), range.saneness(), range.getEnd(), wiremanVar, sanenessVar);
            }
        }
        List<androidx.compose.ui.text.attabal.Range<clubfoot.taiyuan>> listTaiyuan = attabalVar.taiyuan(0, attabalVar.length());
        int size2 = listTaiyuan.size();
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.compose.ui.text.attabal.Range<clubfoot.taiyuan> range2 = listTaiyuan.get(i2);
            spannableString.setSpan(premeiotic.dern.attabal(range2.attabal()), range2.saneness(), range2.getEnd(), 33);
        }
        List<androidx.compose.ui.text.attabal.Range<UrlAnnotation>> listCutely = attabalVar.cutely(0, attabalVar.length());
        int size3 = listCutely.size();
        for (int i3 = 0; i3 < size3; i3++) {
            androidx.compose.ui.text.attabal.Range<UrlAnnotation> range3 = listCutely.get(i3);
            spannableString.setSpan(taiyuanVar.dern(range3.attabal()), range3.saneness(), range3.getEnd(), 33);
        }
        List<androidx.compose.ui.text.attabal.Range<androidx.compose.ui.text.dern>> listWireman = attabalVar.wireman(0, attabalVar.length());
        int size4 = listWireman.size();
        for (int i4 = 0; i4 < size4; i4++) {
            androidx.compose.ui.text.attabal.Range<androidx.compose.ui.text.dern> range4 = listWireman.get(i4);
            androidx.compose.ui.text.dern dernVarMarial = range4.marial();
            if (dernVarMarial instanceof androidx.compose.ui.text.dern.saneness) {
                dernVarMarial.attabal();
                spannableString.setSpan(taiyuanVar.saneness(dern(range4)), range4.getStart(), range4.wireman(), 33);
            } else {
                spannableString.setSpan(taiyuanVar.attabal(range4), range4.getStart(), range4.wireman(), 33);
            }
        }
        return spannableString;
    }
}
