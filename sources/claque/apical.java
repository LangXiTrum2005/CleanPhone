package claque;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: LocaleListPlatformWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class apical implements cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final LocaleList f15618attabal;

    public apical(Object obj) {
        this.f15618attabal = (LocaleList) obj;
    }

    @Override // claque.cutely
    public String attabal() {
        return this.f15618attabal.toLanguageTags();
    }

    public boolean equals(Object obj) {
        return this.f15618attabal.equals(((cutely) obj).getLocaleList());
    }

    @Override // claque.cutely
    public Locale get(int i) {
        return this.f15618attabal.get(i);
    }

    @Override // claque.cutely
    public Object getLocaleList() {
        return this.f15618attabal;
    }

    public int hashCode() {
        return this.f15618attabal.hashCode();
    }

    @Override // claque.cutely
    public boolean isEmpty() {
        return this.f15618attabal.isEmpty();
    }

    @Override // claque.cutely
    public int size() {
        return this.f15618attabal.size();
    }

    public String toString() {
        return this.f15618attabal.toString();
    }
}
