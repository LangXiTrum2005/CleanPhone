package sg.bigo.ads.core.f.a;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f48510a;

    public j(String str, boolean z2) {
        super(str);
        this.f48510a = z2;
    }

    @Override // sg.bigo.ads.core.f.a.n
    public final String toString() {
        StringBuilder sb = new StringBuilder("{\"Content\":\"");
        sb.append(this.f48522b);
        sb.append("\",\"mute\":\"");
        return android.support.v4.media.a.t(sb, this.f48510a, "\"}");
    }
}
