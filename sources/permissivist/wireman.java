package permissivist;

import com.ironsource.C3414a2;
import java.util.Locale;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Locale.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u0014B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u000bR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpermissivist/wireman;", "", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "platformLocale", "<init>", "(Ljava/util/Locale;)V", "", "languageTag", "(Ljava/lang/String;)V", "saneness", "()Ljava/lang/String;", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "attabal", "Ljava/util/Locale;", "()Ljava/util/Locale;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Locale platformLocale;

    /* JADX INFO: renamed from: permissivist.wireman$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Locale.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpermissivist/wireman$attabal;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public wireman(Locale locale) {
        this.platformLocale = locale;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final Locale getPlatformLocale() {
        return this.platformLocale;
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof wireman)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return Intrinsics.wireman(saneness(), ((wireman) other).saneness());
    }

    public int hashCode() {
        return saneness().hashCode();
    }

    public final String saneness() {
        return impromptu.attabal(this.platformLocale);
    }

    public String toString() {
        return saneness();
    }

    public wireman(String str) {
        this(competently.attabal().attabal(str));
    }
}
