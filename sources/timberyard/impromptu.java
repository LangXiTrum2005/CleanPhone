package timberyard;

import com.ironsource.C3414a2;
import java.util.ArrayList;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TextDecoration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Ltimberyard/impromptu;", "", "", "mask", "<init>", "(I)V", C3414a2.d, "", "dern", "(Ltimberyard/impromptu;)Z", "", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "attabal", "I", "wireman", "saneness", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int mask;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final impromptu f38852dern = new impromptu(0);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final impromptu f38855wireman = new impromptu(1);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final impromptu f38853marial = new impromptu(2);

    /* JADX INFO: renamed from: timberyard.impromptu$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextDecoration.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Ltimberyard/impromptu$attabal;", "", "<init>", "()V", "Ltimberyard/impromptu;", "Underline", "Ltimberyard/impromptu;", "saneness", "()Ltimberyard/impromptu;", "getUnderline$annotations", "LineThrough", "attabal", "getLineThrough$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final impromptu attabal() {
            return impromptu.f38853marial;
        }

        public final impromptu saneness() {
            return impromptu.f38855wireman;
        }

        public Companion() {
        }
    }

    public impromptu(int i) {
        this.mask = i;
    }

    public final boolean dern(impromptu other) {
        int i = this.mask;
        return (other.mask | i) == i;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof impromptu) && this.mask == ((impromptu) other).mask;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getMask() {
        return this.mask;
    }

    public String toString() {
        if (this.mask == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.mask & f38855wireman.mask) != 0) {
            arrayList.add("Underline");
        }
        if ((this.mask & f38853marial.mask) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + itchy.attabal.wireman(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    public final int wireman() {
        return this.mask;
    }
}
