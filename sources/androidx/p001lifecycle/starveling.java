package androidx.p001lifecycle;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import demilitarize.cutely;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewModel.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u000e*\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/starveling;", "", "<init>", "()V", "", "wireman", "saneness", "", X3.i.W, "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "attabal", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "dern", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Ldemilitarize/cutely;", "Ldemilitarize/cutely;", "impl", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class starveling {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final cutely impl = new cutely();

    public final void attabal(String key, AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        cutely cutelyVar = this.impl;
        if (cutelyVar != null) {
            cutelyVar.wireman(key, closeable);
        }
    }

    public final <T extends AutoCloseable> T dern(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        cutely cutelyVar = this.impl;
        if (cutelyVar != null) {
            return (T) cutelyVar.competently(key);
        }
        return null;
    }

    public final void saneness() {
        cutely cutelyVar = this.impl;
        if (cutelyVar != null) {
            cutelyVar.marial();
        }
        wireman();
    }

    public void wireman() {
    }
}
