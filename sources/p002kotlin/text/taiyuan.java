package p002kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.wireman;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;
import p002kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lkotlin/text/taiyuan;", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", "matcher", "", "input", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "next", "()Lkotlin/text/MatchResult;", "attabal", "Ljava/util/regex/Matcher;", "saneness", "Ljava/lang/CharSequence;", "Lkotlin/text/impromptu;", "dern", "Lkotlin/text/impromptu;", "wireman", "()Lkotlin/text/impromptu;", "groups", "", "", "Ljava/util/List;", "groupValues_", "Lkotlin/ranges/IntRange;", "()Lkotlin/ranges/IntRange;", "range", "()Ljava/util/List;", "groupValues", "Ljava/util/regex/MatchResult;", "beachfront", "()Ljava/util/regex/MatchResult;", "matchResult", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class taiyuan implements MatchResult {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Matcher matcher;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final impromptu groups;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final CharSequence input;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public List<String> groupValues_;

    /* JADX INFO: compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"kotlin/text/taiyuan$attabal", "Lkotlin/collections/wireman;", "", "", "index", "marial", "(I)Ljava/lang/String;", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal extends wireman<String> {
        public attabal() {
        }

        public /* bridge */ int beachfront(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int competently(String str) {
            return super.lastIndexOf(str);
        }

        @Override // p002kotlin.collections.saneness, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return wireman((String) obj);
            }
            return false;
        }

        @Override // p002kotlin.collections.wireman, p002kotlin.collections.saneness
        public int getSize() {
            return taiyuan.this.beachfront().groupCount() + 1;
        }

        @Override // p002kotlin.collections.wireman, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return beachfront((String) obj);
            }
            return -1;
        }

        @Override // p002kotlin.collections.wireman, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return competently((String) obj);
            }
            return -1;
        }

        @Override // p002kotlin.collections.wireman, java.util.List
        /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
        public String get(int index) {
            String strGroup = taiyuan.this.beachfront().group(index);
            return strGroup == null ? "" : strGroup;
        }

        public /* bridge */ boolean wireman(String str) {
            return super.contains(str);
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"kotlin/text/taiyuan$saneness", "", "Lkotlin/collections/saneness;", "Lkotlin/text/MatchGroup;", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "index", "get", "(I)Lkotlin/text/MatchGroup;", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness extends p002kotlin.collections.saneness<MatchGroup> implements impromptu {
        public saneness() {
        }

        public static final MatchGroup beachfront(saneness sanenessVar, int i) {
            return sanenessVar.get(i);
        }

        @Override // p002kotlin.collections.saneness, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof MatchGroup) {
                return marial((MatchGroup) obj);
            }
            return false;
        }

        @Override // p002kotlin.text.impromptu
        public MatchGroup get(int index) {
            IntRange intRangeTaiyuan = formularize.taiyuan(taiyuan.this.beachfront(), index);
            if (intRangeTaiyuan.wireman().intValue() < 0) {
                return null;
            }
            String strGroup = taiyuan.this.beachfront().group(index);
            Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
            return new MatchGroup(strGroup, intRangeTaiyuan);
        }

        @Override // p002kotlin.collections.saneness
        public int getSize() {
            return taiyuan.this.beachfront().groupCount() + 1;
        }

        @Override // p002kotlin.collections.saneness, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // p002kotlin.collections.saneness, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<MatchGroup> iterator() {
            return SequencesKt___SequencesKt.restrictive(CollectionsKt.clubfoot(adultoid.impassible(this)), new Function1() { // from class: kotlin.text.cutely
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return taiyuan.saneness.beachfront(this.f32019kowloon, ((Integer) obj).intValue());
                }
            }).iterator();
        }

        public /* bridge */ boolean marial(MatchGroup matchGroup) {
            return super.contains(matchGroup);
        }
    }

    public taiyuan(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.matcher = matcher;
        this.input = input;
        this.groups = new saneness();
    }

    @Override // p002kotlin.text.MatchResult
    public /* bridge */ MatchResult.saneness attabal() {
        return MatchResult.attabal.attabal(this);
    }

    public final MatchResult beachfront() {
        return this.matcher;
    }

    @Override // p002kotlin.text.MatchResult
    public IntRange dern() {
        return formularize.impromptu(beachfront());
    }

    @Override // p002kotlin.text.MatchResult
    public MatchResult next() {
        int iEnd = beachfront().end() + (beachfront().end() == beachfront().start() ? 1 : 0);
        if (iEnd > this.input.length()) {
            return null;
        }
        Matcher matcher = this.matcher.pattern().matcher(this.input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return formularize.beachfront(matcher, iEnd, this.input);
    }

    @Override // p002kotlin.text.MatchResult
    public List<String> saneness() {
        if (this.groupValues_ == null) {
            this.groupValues_ = new attabal();
        }
        List<String> list = this.groupValues_;
        Intrinsics.beachfront(list);
        return list;
    }

    @Override // p002kotlin.text.MatchResult
    /* JADX INFO: renamed from: wireman, reason: from getter */
    public impromptu getGroups() {
        return this.groups;
    }
}
