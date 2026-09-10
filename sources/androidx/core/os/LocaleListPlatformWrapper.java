package androidx.core.os;

import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
final class LocaleListPlatformWrapper implements LocaleListInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f4356a;

    public LocaleListPlatformWrapper(LocaleList localeList) {
        this.f4356a = localeList;
    }

    public final boolean equals(Object obj) {
        return this.f4356a.equals(((LocaleListInterface) obj).getLocaleList());
    }

    @Override // androidx.core.os.LocaleListInterface
    public final Object getLocaleList() {
        return this.f4356a;
    }

    public final int hashCode() {
        return this.f4356a.hashCode();
    }

    public final String toString() {
        return this.f4356a.toString();
    }
}
