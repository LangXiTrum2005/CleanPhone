package cutwater;

import com.ironsource.C3414a2;
import kotlinx.serialization.json.internal.mathsort;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f¨\u0006\u001f"}, d2 = {"Lcutwater/dovishness;", "Lcutwater/sealless;", "", "body", "", "isString", "Lbristol/beachfront;", "coerceToInlineType", "<init>", "(Ljava/lang/Object;ZLbristol/beachfront;)V", "", "toString", "()Ljava/lang/String;", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "kowloon", "Z", "marial", "()Z", "arytenoidectomy", "Lbristol/beachfront;", "wireman", "()Lbristol/beachfront;", "monoploid", "Ljava/lang/String;", "saneness", "content", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dovishness extends sealless {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final bristol.beachfront coerceToInlineType;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final boolean isString;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final String content;

    public /* synthetic */ dovishness(Object obj, boolean z, bristol.beachfront beachfrontVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z, (i & 4) != 0 ? null : beachfrontVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || dovishness.class != other.getClass()) {
            return false;
        }
        dovishness dovishnessVar = (dovishness) other;
        return getIsString() == dovishnessVar.getIsString() && Intrinsics.wireman(getContent(), dovishnessVar.getContent());
    }

    public int hashCode() {
        return (Boolean.hashCode(getIsString()) * 31) + getContent().hashCode();
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public boolean getIsString() {
        return this.isString;
    }

    @Override // cutwater.sealless
    /* JADX INFO: renamed from: saneness, reason: from getter */
    public String getContent() {
        return this.content;
    }

    @Override // cutwater.sealless
    public String toString() {
        if (!getIsString()) {
            return getContent();
        }
        StringBuilder sb = new StringBuilder();
        mathsort.dern(sb, getContent());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final bristol.beachfront getCoerceToInlineType() {
        return this.coerceToInlineType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dovishness(Object body, boolean z, bristol.beachfront beachfrontVar) {
        super(null);
        Intrinsics.checkNotNullParameter(body, "body");
        this.isString = z;
        this.coerceToInlineType = beachfrontVar;
        this.content = body.toString();
        if (beachfrontVar != null && !beachfrontVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
