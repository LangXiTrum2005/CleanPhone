package mullein;

import android.graphics.Typeface;

/* JADX INFO: compiled from: CancelableFontCallback.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal extends competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Typeface f33636attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f33637dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final InterfaceC0749attabal f33638saneness;

    /* JADX INFO: renamed from: mullein.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CancelableFontCallback.java */
    public interface InterfaceC0749attabal {
        void attabal(Typeface typeface);
    }

    public attabal(InterfaceC0749attabal interfaceC0749attabal, Typeface typeface) {
        this.f33636attabal = typeface;
        this.f33638saneness = interfaceC0749attabal;
    }

    @Override // mullein.competently
    public void attabal(int i) {
        wireman(this.f33636attabal);
    }

    public void dern() {
        this.f33637dern = true;
    }

    @Override // mullein.competently
    public void saneness(Typeface typeface, boolean z) {
        wireman(typeface);
    }

    public final void wireman(Typeface typeface) {
        if (this.f33637dern) {
            return;
        }
        this.f33638saneness.attabal(typeface);
    }
}
