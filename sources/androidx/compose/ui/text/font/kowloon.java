package androidx.compose.ui.text.font;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FontMatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/font/kowloon;", "", "<init>", "()V", "", "Landroidx/compose/ui/text/font/impromptu;", "fontList", "Landroidx/compose/ui/text/font/graveside;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/arytenoidectomy;", TtmlNode.ATTR_TTS_FONT_STYLE, "attabal", "(Ljava/util/List;Landroidx/compose/ui/text/font/graveside;I)Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class kowloon {
    public final List<impromptu> attabal(List<? extends impromptu> fontList, FontWeight fontWeight, int fontStyle) {
        ArrayList arrayList = new ArrayList(fontList.size());
        int size = fontList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            impromptu impromptuVar = fontList.get(i2);
            impromptu impromptuVar2 = impromptuVar;
            if (Intrinsics.wireman(impromptuVar2.saneness(), fontWeight) && arytenoidectomy.marial(impromptuVar2.dern(), fontStyle)) {
                arrayList.add(impromptuVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(fontList.size());
        int size2 = fontList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            impromptu impromptuVar3 = fontList.get(i3);
            if (arytenoidectomy.marial(impromptuVar3.dern(), fontStyle)) {
                arrayList2.add(impromptuVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        List<? extends impromptu> list = fontList;
        FontWeight.Companion companion = FontWeight.INSTANCE;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.saneness()) < 0) {
            int size3 = list.size();
            FontWeight fontWeight3 = null;
            for (int i4 = 0; i4 < size3; i4++) {
                FontWeight fontWeightSaneness = list.get(i4).saneness();
                if (fontWeightSaneness.compareTo(fontWeight) >= 0) {
                    if (fontWeightSaneness.compareTo(fontWeight) <= 0) {
                        fontWeight3 = fontWeightSaneness;
                        fontWeight2 = fontWeight3;
                        break;
                    }
                    if (fontWeight3 == null || fontWeightSaneness.compareTo(fontWeight3) < 0) {
                        fontWeight3 = fontWeightSaneness;
                    }
                } else if (fontWeight2 == null || fontWeightSaneness.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightSaneness;
                }
            }
            if (fontWeight2 != null) {
                fontWeight3 = fontWeight2;
            }
            ArrayList arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            while (i < size4) {
                impromptu impromptuVar4 = list.get(i);
                if (Intrinsics.wireman(impromptuVar4.saneness(), fontWeight3)) {
                    arrayList3.add(impromptuVar4);
                }
                i++;
            }
            return arrayList3;
        }
        if (fontWeight.compareTo(companion.dern()) > 0) {
            int size5 = list.size();
            FontWeight fontWeight4 = null;
            for (int i5 = 0; i5 < size5; i5++) {
                FontWeight fontWeightSaneness2 = list.get(i5).saneness();
                if (fontWeightSaneness2.compareTo(fontWeight) >= 0) {
                    if (fontWeightSaneness2.compareTo(fontWeight) <= 0) {
                        fontWeight4 = fontWeightSaneness2;
                        fontWeight2 = fontWeight4;
                        break;
                    }
                    if (fontWeight4 == null || fontWeightSaneness2.compareTo(fontWeight4) < 0) {
                        fontWeight4 = fontWeightSaneness2;
                    }
                } else if (fontWeight2 == null || fontWeightSaneness2.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightSaneness2;
                }
            }
            if (fontWeight4 == null) {
                fontWeight4 = fontWeight2;
            }
            ArrayList arrayList4 = new ArrayList(list.size());
            int size6 = list.size();
            while (i < size6) {
                impromptu impromptuVar5 = list.get(i);
                if (Intrinsics.wireman(impromptuVar5.saneness(), fontWeight4)) {
                    arrayList4.add(impromptuVar5);
                }
                i++;
            }
            return arrayList4;
        }
        FontWeight fontWeightDern = companion.dern();
        int size7 = list.size();
        FontWeight fontWeight5 = null;
        FontWeight fontWeight6 = null;
        for (int i6 = 0; i6 < size7; i6++) {
            FontWeight fontWeightSaneness3 = list.get(i6).saneness();
            if (fontWeightDern == null || fontWeightSaneness3.compareTo(fontWeightDern) <= 0) {
                if (fontWeightSaneness3.compareTo(fontWeight) >= 0) {
                    if (fontWeightSaneness3.compareTo(fontWeight) <= 0) {
                        fontWeight5 = fontWeightSaneness3;
                        fontWeight6 = fontWeight5;
                        break;
                    }
                    if (fontWeight6 == null || fontWeightSaneness3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = fontWeightSaneness3;
                    }
                } else if (fontWeight5 == null || fontWeightSaneness3.compareTo(fontWeight5) > 0) {
                    fontWeight5 = fontWeightSaneness3;
                }
            }
        }
        if (fontWeight6 != null) {
            fontWeight5 = fontWeight6;
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        int size8 = list.size();
        for (int i7 = 0; i7 < size8; i7++) {
            impromptu impromptuVar6 = list.get(i7);
            if (Intrinsics.wireman(impromptuVar6.saneness(), fontWeight5)) {
                arrayList5.add(impromptuVar6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        FontWeight fontWeightDern2 = FontWeight.INSTANCE.dern();
        int size9 = list.size();
        FontWeight fontWeight7 = null;
        for (int i8 = 0; i8 < size9; i8++) {
            FontWeight fontWeightSaneness4 = list.get(i8).saneness();
            if (fontWeightDern2 == null || fontWeightSaneness4.compareTo(fontWeightDern2) >= 0) {
                if (fontWeightSaneness4.compareTo(fontWeight) >= 0) {
                    if (fontWeightSaneness4.compareTo(fontWeight) <= 0) {
                        fontWeight2 = fontWeightSaneness4;
                        fontWeight7 = fontWeight2;
                        break;
                    }
                    if (fontWeight7 == null || fontWeightSaneness4.compareTo(fontWeight7) < 0) {
                        fontWeight7 = fontWeightSaneness4;
                    }
                } else if (fontWeight2 == null || fontWeightSaneness4.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightSaneness4;
                }
            }
        }
        if (fontWeight7 != null) {
            fontWeight2 = fontWeight7;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        int size10 = list.size();
        while (i < size10) {
            impromptu impromptuVar7 = list.get(i);
            if (Intrinsics.wireman(impromptuVar7.saneness(), fontWeight2)) {
                arrayList6.add(impromptuVar7);
            }
            i++;
        }
        return arrayList6;
    }
}
