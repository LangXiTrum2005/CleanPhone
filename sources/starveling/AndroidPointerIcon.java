package starveling;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: starveling.attabal, reason: from toString */
/* JADX INFO: compiled from: PointerIcon.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lstarveling/attabal;", "Lstarveling/monoploid;", "", "type", "<init>", "(I)V", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "saneness", "I", "getType", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidPointerIcon implements monoploid {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final int type;

    public AndroidPointerIcon(int i) {
        this.type = i;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.wireman(AndroidPointerIcon.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.competently(other, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.type == ((AndroidPointerIcon) other).type;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getType() {
        return this.type;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.type + ')';
    }
}
