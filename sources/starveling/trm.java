package starveling;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0011"}, d2 = {"Lstarveling/trm;", "", "", "Landroidx/compose/ui/input/pointer/NativePointerKeyboardModifiers;", "packedValue", "saneness", "(I)I", "", "marial", "(I)Ljava/lang/String;", "wireman", C3414a2.d, "", "dern", "(ILjava/lang/Object;)Z", "attabal", "I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class trm {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int packedValue;

    public /* synthetic */ trm(int i) {
        this.packedValue = i;
    }

    public static final /* synthetic */ trm attabal(int i) {
        return new trm(i);
    }

    public static boolean dern(int i, Object obj) {
        return (obj instanceof trm) && i == ((trm) obj).getPackedValue();
    }

    public static String marial(int i) {
        return "PointerKeyboardModifiers(packedValue=" + i + ')';
    }

    public static int wireman(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final /* synthetic */ int getPackedValue() {
        return this.packedValue;
    }

    public boolean equals(Object obj) {
        return dern(this.packedValue, obj);
    }

    public int hashCode() {
        return wireman(this.packedValue);
    }

    public String toString() {
        return marial(this.packedValue);
    }

    public static int saneness(int i) {
        return i;
    }
}
