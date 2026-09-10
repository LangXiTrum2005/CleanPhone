package lamplit;

/* JADX INFO: compiled from: Marker.java */
/* JADX INFO: loaded from: classes.dex */
public class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final float f32579attabal;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final float f32580saneness;

    public competently(String str, float f, float f2) {
        this.name = str;
        this.f32580saneness = f2;
        this.f32579attabal = f;
    }

    public boolean attabal(String str) {
        if (this.name.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.name.endsWith("\r")) {
            String str2 = this.name;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
