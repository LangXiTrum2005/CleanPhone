package androidx.compose.ui.text;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LinkAnnotation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/dern;", "", "<init>", "()V", "Lclubfoot/attabal;", "attabal", "()Lclubfoot/attabal;", "linkInteractionListener", "saneness", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class dern {

    /* JADX INFO: compiled from: LinkAnnotation.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/dern$attabal;", "Landroidx/compose/ui/text/dern;", "", "tag", "Lclubfoot/competently;", "styles", "Lclubfoot/attabal;", "linkInteractionListener", "<init>", "(Ljava/lang/String;Lclubfoot/competently;Lclubfoot/attabal;)V", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "attabal", "Ljava/lang/String;", "dern", "saneness", "Lclubfoot/competently;", "()Lclubfoot/competently;", "Lclubfoot/attabal;", "()Lclubfoot/attabal;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal extends dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
        public final String tag;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final clubfoot.competently styles;

        public attabal(String str, clubfoot.competently competentlyVar, clubfoot.attabal attabalVar) {
            super(null);
            this.tag = str;
            this.styles = competentlyVar;
        }

        @Override // androidx.compose.ui.text.dern
        public clubfoot.attabal attabal() {
            return null;
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof attabal)) {
                return false;
            }
            attabal attabalVar = (attabal) other;
            if (!Intrinsics.wireman(this.tag, attabalVar.tag) || !Intrinsics.wireman(getStyles(), attabalVar.getStyles())) {
                return false;
            }
            attabal();
            attabalVar.attabal();
            return Intrinsics.wireman(null, null);
        }

        public int hashCode() {
            int iHashCode = this.tag.hashCode() * 31;
            clubfoot.competently styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            attabal();
            return iHashCode2;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public clubfoot.competently getStyles() {
            return this.styles;
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.tag + ')';
        }
    }

    /* JADX INFO: compiled from: LinkAnnotation.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/dern$saneness;", "Landroidx/compose/ui/text/dern;", "", "url", "Lclubfoot/competently;", "styles", "Lclubfoot/attabal;", "linkInteractionListener", "<init>", "(Ljava/lang/String;Lclubfoot/competently;Lclubfoot/attabal;)V", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "attabal", "Ljava/lang/String;", "dern", "saneness", "Lclubfoot/competently;", "()Lclubfoot/competently;", "Lclubfoot/attabal;", "()Lclubfoot/attabal;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness extends dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
        public final String url;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final clubfoot.competently styles;

        public /* synthetic */ saneness(String str, clubfoot.competently competentlyVar, clubfoot.attabal attabalVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : competentlyVar, (i & 4) != 0 ? null : attabalVar);
        }

        @Override // androidx.compose.ui.text.dern
        public clubfoot.attabal attabal() {
            return null;
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof saneness)) {
                return false;
            }
            saneness sanenessVar = (saneness) other;
            if (!Intrinsics.wireman(this.url, sanenessVar.url) || !Intrinsics.wireman(getStyles(), sanenessVar.getStyles())) {
                return false;
            }
            attabal();
            sanenessVar.attabal();
            return Intrinsics.wireman(null, null);
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            clubfoot.competently styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            attabal();
            return iHashCode2;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public clubfoot.competently getStyles() {
            return this.styles;
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.url + ')';
        }

        public saneness(String str, clubfoot.competently competentlyVar, clubfoot.attabal attabalVar) {
            super(null);
            this.url = str;
            this.styles = competentlyVar;
        }
    }

    public /* synthetic */ dern(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract clubfoot.attabal attabal();

    public dern() {
    }
}
