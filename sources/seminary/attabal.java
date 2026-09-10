package seminary;

import com.ironsource.C3414a2;
import milliradian.impromptu;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import restrictive.overspeculate;
import restrictive.saran;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 42\u00020\u0001:\u0001\u000fJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u001d\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010)\u001a\u00020$8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010.\u001a\u00020*8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\bR\u0017\u00103\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Lseminary/attabal;", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lmilliradian/impromptu;", "attabal", "F", "getDefaultWidth-D9Ej5fM", "()F", "defaultWidth", "saneness", "getDefaultHeight-D9Ej5fM", "defaultHeight", "", "dern", "getViewportWidth", "viewportWidth", "wireman", "getViewportHeight", "viewportHeight", "Lseminary/saneness;", "marial", "Lseminary/saneness;", "getRoot", "()Lseminary/saneness;", "root", "Lrestrictive/overspeculate;", "beachfront", "J", "getTintColor-0d7_KjU", "()J", "tintColor", "Lrestrictive/saran;", "competently", "I", "getTintBlendMode-0nO6VwU", "tintBlendMode", "impromptu", "Z", "getAutoMirror", "()Z", "autoMirror", "taiyuan", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final float defaultWidth;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final long tintColor;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final int tintBlendMode;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final float viewportWidth;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final boolean autoMirror;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final saneness root;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final float defaultHeight;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final float viewportHeight;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof attabal)) {
            return false;
        }
        attabal attabalVar = (attabal) other;
        return Intrinsics.wireman(this.name, attabalVar.name) && impromptu.taiyuan(this.defaultWidth, attabalVar.defaultWidth) && impromptu.taiyuan(this.defaultHeight, attabalVar.defaultHeight) && this.viewportWidth == attabalVar.viewportWidth && this.viewportHeight == attabalVar.viewportHeight && Intrinsics.wireman(this.root, attabalVar.root) && overspeculate.formularize(this.tintColor, attabalVar.tintColor) && saran.sealless(this.tintBlendMode, attabalVar.tintBlendMode) && this.autoMirror == attabalVar.autoMirror;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + impromptu.cutely(this.defaultWidth)) * 31) + impromptu.cutely(this.defaultHeight)) * 31) + Float.hashCode(this.viewportWidth)) * 31) + Float.hashCode(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + overspeculate.polloi(this.tintColor)) * 31) + saran.kattegat(this.tintBlendMode)) * 31) + Boolean.hashCode(this.autoMirror);
    }
}
