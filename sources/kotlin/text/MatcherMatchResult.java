package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class MatcherMatchResult implements MatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f44710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f44711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MatcherMatchResult$groupValues$1 f44712c;

    public MatcherMatchResult(Matcher matcher, CharSequence input) {
        Intrinsics.f(input, "input");
        this.f44710a = matcher;
        this.f44711b = input;
        new MatcherMatchResult$groups$1(this);
    }

    @Override // kotlin.text.MatchResult
    public final MatchResult.Destructured a() {
        return new MatchResult.Destructured(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.text.MatcherMatchResult$groupValues$1] */
    @Override // kotlin.text.MatchResult
    public final List b() {
        if (this.f44712c == null) {
            this.f44712c = new AbstractList<String>() { // from class: kotlin.text.MatcherMatchResult$groupValues$1
                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ boolean contains(Object obj) {
                    if (obj instanceof String) {
                        return super.contains((String) obj);
                    }
                    return false;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final Object get(int i2) {
                    String strGroup = this.X.f44710a.group(i2);
                    return strGroup == null ? "" : strGroup;
                }

                @Override // kotlin.collections.AbstractCollection
                /* JADX INFO: renamed from: getSize */
                public final int getZ() {
                    return this.X.f44710a.groupCount() + 1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int indexOf(Object obj) {
                    if (obj instanceof String) {
                        return super.indexOf((String) obj);
                    }
                    return -1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int lastIndexOf(Object obj) {
                    if (obj instanceof String) {
                        return super.lastIndexOf((String) obj);
                    }
                    return -1;
                }
            };
        }
        MatcherMatchResult$groupValues$1 matcherMatchResult$groupValues$1 = this.f44712c;
        Intrinsics.c(matcherMatchResult$groupValues$1);
        return matcherMatchResult$groupValues$1;
    }

    public final IntRange c() {
        Matcher matcher = this.f44710a;
        return RangesKt.e(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String strGroup = this.f44710a.group();
        Intrinsics.e(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    public final MatchResult next() {
        Matcher matcher = this.f44710a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f44711b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        Intrinsics.e(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new MatcherMatchResult(matcher2, charSequence);
        }
        return null;
    }
}
