package oilcan;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SourceInformation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Loilcan/molybdenite;", "", "", "sortedIndex", "", "name", "inlineClass", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "attabal", "I", "()I", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "saneness", "getInlineClass", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int sortedIndex;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final String inlineClass;

    public molybdenite(int i, String str, String str2) {
        this.sortedIndex = i;
        this.name = str;
        this.inlineClass = str2;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final int getSortedIndex() {
        return this.sortedIndex;
    }

    public /* synthetic */ molybdenite(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }
}
