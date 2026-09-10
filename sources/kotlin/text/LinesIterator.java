package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/LinesIterator;", "", "", "State", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class LinesIterator implements Iterator<String>, KMappedMarker {
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f44706Y;
    public int Z;
    public int e0;
    public int f0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkotlin/text/LinesIterator$State;", "", "", "UNKNOWN", "I", "HAS_NEXT", "EXHAUSTED", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
    }

    public LinesIterator(String string) {
        Intrinsics.f(string, "string");
        this.X = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2;
        int i3;
        int i4 = this.f44706Y;
        if (i4 != 0) {
            return i4 == 1;
        }
        if (this.f0 < 0) {
            this.f44706Y = 2;
            return false;
        }
        String str = this.X;
        int length = str.length();
        int length2 = str.length();
        for (int i5 = this.Z; i5 < length2; i5++) {
            char cCharAt = str.charAt(i5);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i2 = (cCharAt == '\r' && (i3 = i5 + 1) < str.length() && str.charAt(i3) == '\n') ? 2 : 1;
                length = i5;
                this.f44706Y = 1;
                this.f0 = i2;
                this.e0 = length;
                return true;
            }
        }
        i2 = -1;
        this.f44706Y = 1;
        this.f0 = i2;
        this.e0 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f44706Y = 0;
        int i2 = this.e0;
        int i3 = this.Z;
        this.Z = this.f0 + i2;
        return this.X.subSequence(i3, i2).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
