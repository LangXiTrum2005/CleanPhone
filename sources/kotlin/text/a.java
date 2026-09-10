package kotlin.text;

import java.util.regex.Matcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f44716Y;

    public /* synthetic */ a(Object obj, int i2) {
        this.X = i2;
        this.f44716Y = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.X) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                MatcherMatchResult matcherMatchResult = ((MatcherMatchResult$groups$1) this.f44716Y).X;
                Matcher matcher = matcherMatchResult.f44710a;
                IntRange intRangeE = RangesKt.e(matcher.start(iIntValue), matcher.end(iIntValue));
                if (intRangeE.X < 0) {
                    return null;
                }
                String strGroup = matcherMatchResult.f44710a.group(iIntValue);
                Intrinsics.e(strGroup, "group(...)");
                return new MatchGroup(strGroup, intRangeE);
            default:
                String it = (String) obj;
                Intrinsics.f(it, "it");
                boolean zW = StringsKt.w(it);
                String str = (String) this.f44716Y;
                if (zW) {
                    return it.length() < str.length() ? str : it;
                }
                return android.support.v4.media.a.m(str, it);
        }
    }
}
