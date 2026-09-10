package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import com.ironsource.C3414a2;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SourceRegistrationRequest.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/apical;", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "Landroid/net/Uri;", "attabal", "Ljava/util/List;", "saneness", "()Ljava/util/List;", "registrationUris", "Landroid/view/InputEvent;", "Landroid/view/InputEvent;", "()Landroid/view/InputEvent;", "inputEvent", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final List<Uri> RegistrationUris;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final InputEvent InputEvent;

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final InputEvent getInputEvent() {
        return this.InputEvent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof apical)) {
            return false;
        }
        apical apicalVar = (apical) other;
        return Intrinsics.wireman(this.RegistrationUris, apicalVar.RegistrationUris) && Intrinsics.wireman(this.InputEvent, apicalVar.InputEvent);
    }

    public int hashCode() {
        int iHashCode = this.RegistrationUris.hashCode();
        InputEvent inputEvent = this.InputEvent;
        return inputEvent != null ? (iHashCode * 31) + inputEvent.hashCode() : iHashCode;
    }

    public final List<Uri> saneness() {
        return this.RegistrationUris;
    }

    public String toString() {
        return "AppSourcesRegistrationRequest { " + ("RegistrationUris=[" + this.RegistrationUris + "], InputEvent=" + this.InputEvent) + " }";
    }
}
