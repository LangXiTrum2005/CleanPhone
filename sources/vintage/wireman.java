package vintage;

import com.ironsource.C3414a2;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import patroclinal.formularize;

/* JADX INFO: compiled from: StringExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "Lkotlin/Pair;", "", "attabal", "(Ljava/lang/String;)Lkotlin/Pair;", "start", TtmlNode.END, "", "saneness", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", C3414a2.d, "dern", "(Ljava/lang/String;Ljava/lang/String;)I", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class wireman {
    public static final Pair<Integer, Integer> attabal(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listSplit$default = StringsKt.split$default(str, new String[]{":"}, false, 0, 6, null);
        if (listSplit$default.size() != 2) {
            return formularize.attabal(0, 0);
        }
        try {
            return formularize.attabal(Integer.valueOf(Integer.parseInt((String) listSplit$default.get(0))), Integer.valueOf(Integer.parseInt((String) listSplit$default.get(1))));
        } catch (NumberFormatException unused) {
            return formularize.attabal(0, 0);
        }
    }

    public static final int dern(String str, String str2) {
        Pair<Integer, Integer> pairAttabal = attabal(str);
        int iIntValue = (pairAttabal.getFirst().intValue() * 60) + pairAttabal.getSecond().intValue();
        Pair<Integer, Integer> pairAttabal2 = attabal(str2);
        return iIntValue - ((pairAttabal2.getFirst().intValue() * 60) + pairAttabal2.getSecond().intValue());
    }

    public static final boolean saneness(String str, String start, String end) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        if (dern(end, start) >= 0) {
            return dern(str, start) >= 0 && dern(str, end) <= 0;
        }
        return dern(str, start) >= 0 || dern(str, end) <= 0;
    }
}
