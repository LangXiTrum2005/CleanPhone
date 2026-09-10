package androidx.compose.runtime;

import com.ironsource.C3414a2;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.runtime.dent, reason: from toString */
/* JADX INFO: compiled from: JoinedKey.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/dent;", "", TtmlNode.LEFT, TtmlNode.RIGHT, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "value", "attabal", "(Ljava/lang/Object;)I", "Ljava/lang/Object;", "getLeft", "()Ljava/lang/Object;", "saneness", "getRight", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class JoinedKey {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final Object left;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final Object right;

    public JoinedKey(Object obj, Object obj2) {
        this.left = obj;
        this.right = obj2;
    }

    public final int attabal(Object value) {
        if (value instanceof Enum) {
            return ((Enum) value).ordinal();
        }
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JoinedKey)) {
            return false;
        }
        JoinedKey joinedKey = (JoinedKey) other;
        return Intrinsics.wireman(this.left, joinedKey.left) && Intrinsics.wireman(this.right, joinedKey.right);
    }

    public int hashCode() {
        return (attabal(this.left) * 31) + attabal(this.right);
    }

    public String toString() {
        return "JoinedKey(left=" + this.left + ", right=" + this.right + ')';
    }
}
