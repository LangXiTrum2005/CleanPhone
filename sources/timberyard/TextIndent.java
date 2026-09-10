package timberyard;

import com.ironsource.C3414a2;
import milliradian.adultoid;
import milliradian.graveside;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: timberyard.formularize, reason: from toString */
/* JADX INFO: compiled from: TextIndent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0011B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Ltimberyard/formularize;", "", "Lmilliradian/graveside;", "firstLine", "restLine", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "attabal", "J", "()J", "saneness", "dern", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextIndent {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final TextIndent f38849wireman = new TextIndent(0, 0, 3, null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final long firstLine;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final long restLine;

    /* JADX INFO: renamed from: timberyard.formularize$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextIndent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltimberyard/formularize$attabal;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ TextIndent(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final long getFirstLine() {
        return this.firstLine;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) other;
        return graveside.marial(this.firstLine, textIndent.firstLine) && graveside.marial(this.restLine, textIndent.restLine);
    }

    public int hashCode() {
        return (graveside.taiyuan(this.firstLine) * 31) + graveside.taiyuan(this.restLine);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final long getRestLine() {
        return this.restLine;
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) graveside.cutely(this.firstLine)) + ", restLine=" + ((Object) graveside.cutely(this.restLine)) + ')';
    }

    public TextIndent(long j, long j2) {
        this.firstLine = j;
        this.restLine = j2;
    }

    public /* synthetic */ TextIndent(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? adultoid.saneness(0) : j, (i & 2) != 0 ? adultoid.saneness(0) : j2, null);
    }
}
