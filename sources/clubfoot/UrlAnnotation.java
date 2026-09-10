package clubfoot;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: clubfoot.cutely, reason: from toString */
/* JADX INFO: compiled from: UrlAnnotation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lclubfoot/cutely;", "", "", "url", "<init>", "(Ljava/lang/String;)V", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "attabal", "Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@patroclinal.wireman
public final class UrlAnnotation {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final String url;

    public UrlAnnotation(String str) {
        this.url = str;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UrlAnnotation) && Intrinsics.wireman(this.url, ((UrlAnnotation) other).url);
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.url + ')';
    }
}
