package p002kotlin.text;

import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;

/* JADX INFO: compiled from: MatchResult.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0011\u0010\u0002\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkotlin/text/MatchResult;", "", "next", "()Lkotlin/text/MatchResult;", "Lkotlin/ranges/IntRange;", "dern", "()Lkotlin/ranges/IntRange;", "range", "Lkotlin/text/impromptu;", "wireman", "()Lkotlin/text/impromptu;", "groups", "", "", "saneness", "()Ljava/util/List;", "groupValues", "Lkotlin/text/MatchResult$saneness;", "attabal", "()Lkotlin/text/MatchResult$saneness;", "destructured", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MatchResult {

    /* JADX INFO: compiled from: MatchResult.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class attabal {
        public static saneness attabal(MatchResult matchResult) {
            return new saneness(matchResult);
        }
    }

    /* JADX INFO: compiled from: MatchResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/text/MatchResult$saneness;", "", "Lkotlin/text/MatchResult;", "match", "<init>", "(Lkotlin/text/MatchResult;)V", "attabal", "Lkotlin/text/MatchResult;", "()Lkotlin/text/MatchResult;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final MatchResult match;

        public saneness(MatchResult match) {
            Intrinsics.checkNotNullParameter(match, "match");
            this.match = match;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final MatchResult getMatch() {
            return this.match;
        }
    }

    saneness attabal();

    IntRange dern();

    MatchResult next();

    List<String> saneness();

    impromptu wireman();
}
