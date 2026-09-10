package kotlinx.serialization.json.internal;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/json/internal/formularize;", "", "<init>", "()V", "", "size", "", "saneness", "(I)[C", "array", "", "attabal", "([C)V", "Lkotlin/collections/impassible;", "Lkotlin/collections/impassible;", "arrays", "I", "charsTotal", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final p002kotlin.collections.impassible<char[]> arrays = new p002kotlin.collections.impassible<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int charsTotal;

    public final void attabal(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                if (this.charsTotal + array.length < cutely.f32501attabal) {
                    this.charsTotal += array.length;
                    this.arrays.addLast(array);
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final char[] saneness(int size) {
        char[] cArrKowloon;
        synchronized (this) {
            cArrKowloon = this.arrays.kowloon();
            if (cArrKowloon != null) {
                this.charsTotal -= cArrKowloon.length;
            } else {
                cArrKowloon = null;
            }
        }
        return cArrKowloon == null ? new char[size] : cArrKowloon;
    }
}
