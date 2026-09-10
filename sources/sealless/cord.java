package sealless;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ContentDataType.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u0000 \u00042\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Lsealless/cord;", "", "", "dataType", "saneness", "(I)I", "", "marial", "(I)Ljava/lang/String;", "wireman", C3414a2.d, "", "dern", "(ILjava/lang/Object;)Z", "attabal", "I", "getDataType", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class cord {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int dataType;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f37399dern = saneness(1);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f37402wireman = saneness(3);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int f37400marial = saneness(4);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final int f37397beachfront = saneness(2);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final int f37398competently = saneness(0);

    /* JADX INFO: renamed from: sealless.cord$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ContentDataType.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Lsealless/cord$attabal;", "", "<init>", "()V", "Lsealless/cord;", "Text", "I", "attabal", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int attabal() {
            return cord.f37399dern;
        }

        public Companion() {
        }
    }

    public static boolean dern(int i, Object obj) {
        return (obj instanceof cord) && i == ((cord) obj).getDataType();
    }

    public static String marial(int i) {
        return "ContentDataType(dataType=" + i + ')';
    }

    public static int wireman(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final /* synthetic */ int getDataType() {
        return this.dataType;
    }

    public boolean equals(Object obj) {
        return dern(this.dataType, obj);
    }

    public int hashCode() {
        return wireman(this.dataType);
    }

    public String toString() {
        return marial(this.dataType);
    }

    public static int saneness(int i) {
        return i;
    }
}
