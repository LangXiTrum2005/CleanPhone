package kotlin.text;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/text/MatchResult;", "", "Destructured", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MatchResult {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatchResult$Destructured;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Destructured {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MatchResult f44709a;

        public Destructured(MatchResult matchResult) {
            this.f44709a = matchResult;
        }
    }

    Destructured a();

    List b();

    String getValue();

    MatchResult next();
}
