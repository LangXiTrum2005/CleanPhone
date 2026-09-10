package p002kotlin.text;

import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p002kotlin.Metadata;
import p002kotlin.ranges.IntRange;
import p002kotlin.ranges.wireman;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "Lkotlin/text/dern;", "", "cutely", "(Ljava/lang/Iterable;)I", "Ljava/util/regex/Matcher;", "from", "", "input", "Lkotlin/text/MatchResult;", "beachfront", "(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lkotlin/text/MatchResult;", "competently", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)Lkotlin/text/MatchResult;", "Ljava/util/regex/MatchResult;", "Lkotlin/ranges/IntRange;", "impromptu", "(Ljava/util/regex/MatchResult;)Lkotlin/ranges/IntRange;", "groupIndex", "taiyuan", "(Ljava/util/regex/MatchResult;I)Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class formularize {
    public static final MatchResult beachfront(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new taiyuan(matcher, charSequence);
        }
        return null;
    }

    public static final MatchResult competently(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new taiyuan(matcher, charSequence);
        }
        return null;
    }

    public static final int cutely(Iterable<? extends dern> iterable) {
        Iterator<? extends dern> it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= it.next().getValue();
        }
        return value;
    }

    public static final IntRange impromptu(MatchResult matchResult) {
        return wireman.monoploid(matchResult.start(), matchResult.end());
    }

    public static final IntRange taiyuan(MatchResult matchResult, int i) {
        return wireman.monoploid(matchResult.start(i), matchResult.end(i));
    }
}
